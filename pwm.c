#include <8051.h>

#define saida P2_6
#define FU P1_0
#define FD P1_1

int t1 = 0xFF;
int t2 = 0xFA;
int up, upCopy, down, downCopy = 4;
char flag = 0;

void freqU(){
	if(t2 <= 0xFA){
		t2 += 0x5;
	} else if (t1 < 0xFF){
		t1 += 0x1;
		t2 = 0x5 - (0xFF - t2);
	} else {
		t1, t2 = 0xFF;
	}
	
	TH0 = t1;
	TL0 = t2;
}

void freqD() {
	if(t2 >= 0x5){
		t2 -= 0x5;
	} else if (t1 > 0x0){
		t1 -= 0x1;
		t2 = 0xFF - (0x5 - t2);
	} else {
		t1, t2 = 0x0;
	}

	TH0 = t1;
	TL0 = t2;
}

void timer() __interrupt(1){
	TH0 = t1;
	TL0 = t2;

	if(upCopy >= 0){
		saida = 0;
		upCopy--;
	} else(upCopy < 0) {
		saida = 1;
		downCopy--;
	}
	
	if(downCopy < 0) {
		if(flag) {
			up++;
			down--;

			if(down < 0){
				flag = 1;
				down++;
				up--;
			}
		} else {
			up--;
			down++;

			if(down < 0){
				flag = 0;
				down--;
				up++;
			}
		}
	}
		
	upCopy = up;
	downCopy = down;

	if(!FU){
		freqU();
	}

	if(!FD){
		freqD();
	}
}

void main(){
	TMOD = 0x01;
	TH0 = t1;
	TL0 = t2;
	EA = 1;
	ET0 = 1;
	TR0 = 1;

	while(1){}
}

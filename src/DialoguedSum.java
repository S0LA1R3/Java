import javax.swing.JOptionPane;
public class DialoguedSum
{
    public static void main(String[] args)
    {
        String sNumber1 = JOptionPane.showInputDialog("Enter the first number:");
        int number1 = Integer.parseInt(sNumber1);

        String sNumber2 = JOptionPane.showInputDialog("Enter the second number:");
        int number2 = Integer.parseInt(sNumber2);

        int sum = number1 + number2;

        String text = String.format("The sum is %s", sum);
        JOptionPane.showMessageDialog(null, text);

        if (number1 == number2)
            text = String.format("%s == %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
        if (number1 != number2)
            text = String.format("%s != %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
        if (number1 < number2)
            text = String.format("%s < %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
        if (number1 <= number2)
            text = String.format("%s <= %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
        if (number1 > number2)
            text = String.format("%s > %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
        if (number1 >= number2)
            text = String.format("%s >= %s", number1, number2);
            JOptionPane.showMessageDialog(null, text);
    }
}

/*
(Interface  CarbonFootprint:  polimorfismo)  Usando  as  interfaces,  como  aprendeu  neste  capítulo,  você  pode  especificar  compor-
tamentos semelhantes para as classes possivelmente díspares. Governos e empresas em todo o mundo estão cada vez mais preocupados 
com as pegadas de carbono (liberações anuais de dióxido de carbono na atmosfera) a partir de edifícios que queimam vários tipos de 
combustíveis para aquecimento, veículos que queimam combustíveis para obter energia etc. Muitos cientistas culpam esses gases do efeito 
estufa pelo fenômeno chamado de aquecimento global. Crie três classes pequenas não relacionadas por meio de herança — as classes 
Building,  Car e Bicycle. Dê a cada classe alguns atributos e comportamentos adequados únicos que ela não tem em comum com 
outras classes. Escreva uma interface de CarbonFootprint com um método getCarbonFootprint. Faça com que cada uma das 
suas classes implemente essa interface para que o método getCarbonFootprint calcule uma pegada de carbono adequada para essa 
classe (confira alguns sites que explicam como calcular pegadas de carbono). Escreva um aplicativo que cria objetos de cada uma das três 
classes, insere referências a esses objetos em ArrayList<CarbonFootprint>, então itera pelo ArrayList polimorficamente invo-
cando o método getCarbonFootprint de cada objeto. Para cada objeto, imprima algumas informações de identificação e a pegada de 
carbono do objeto.
*/

public interface CarbonFootprint {
    double getCarbonFootprint();
}

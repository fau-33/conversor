# Conversor - Projeto Java

Conversor - Projeto Java
O Conversor é um simples projeto Java que oferece duas opções de conversão: conversão de moedas e conversão de temperaturas. O objetivo do projeto é permitir que o usuário faça conversões rápidas e fáceis entre diferentes moedas e unidades de temperatura.

Tecnologias Utilizadas
O projeto foi desenvolvido utilizando a linguagem de programação Java, com o auxílio da biblioteca Swing para criar uma interface gráfica simples e amigável para o usuário. Através do JOptionPane, o programa exibe janelas de diálogo interativas para receber os valores de entrada do usuário e exibir os resultados das conversões.

Funcionamento do Projeto

O projeto possui três classes principais:

Conversor.java: Esta é a classe principal do programa. Ela exibe um menu com duas opções: conversão de moedas e conversão de temperaturas. Com base na escolha do usuário, a classe chama as respectivas funções de conversão das outras duas classes.

MoedaConversor.java: Nesta classe, a conversão entre moedas é realizada. O usuário insere um valor em reais e escolhe a moeda para a qual deseja converter. O programa então realiza o cálculo da conversão e exibe o resultado em uma janela de diálogo.

TemperaturaConversor.java: Nesta classe, a conversão de temperaturas é realizada. O usuário insere um valor em graus Celsius, e o programa converte esse valor para Fahrenheit e exibe o resultado na tela.

Além dessas classes, o projeto também inclui a classe Finalizador.java, que oferece a opção de encerrar o programa após realizar uma conversão ou retornar ao menu principal para realizar uma nova conversão.

## Como Executar o Projeto

Para executar o projeto, é necessário ter o Java Development Kit (JDK) instalado em seu computador. Em seguida, siga os passos abaixo:

Clone ou faça o download deste repositório para o seu computador.

Abra o terminal ou prompt de comando e navegue até o diretório em que o projeto está localizado.

Compile as classes do projeto executando o seguinte comando

javac conversor/*.java

Após compilar com sucesso, execute o programa com o seguinte comando:

java conversor.Conversor

O programa iniciará e exibirá um menu com duas opções: "Conversão de Moedas" e "Conversão de Temperaturas". Escolha a opção desejada e siga as instruções nas janelas de diálogo para realizar as conversões.

Após realizar uma conversão, o programa perguntará se deseja encerrar o programa. Se desejar encerrar, o programa será finalizado; caso contrário, retornará ao menu principal para realizar outra conversão.

### Considerações Finais

O Conversor é um projeto simples, mas útil para quem deseja realizar conversões rápidas de moedas e temperaturas. Ele serve como um exemplo didático de como criar uma interface gráfica em Java usando a biblioteca Swing e como organizar o código em diferentes classes para melhorar a modularidade e a reutilização de código.

Fique à vontade para explorar o código-fonte e fazer melhorias ou adições ao projeto. Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato.

Divirta-se usando o Conversor!

Nota: Lembre-se de que esse projeto é uma simulação e as taxas de conversão usadas são fictícias, não refletindo necessariamente os valores reais do mercado.



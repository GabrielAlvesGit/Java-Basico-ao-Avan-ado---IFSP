# Java-Basico-ao-Avan-ado---IFSP
Java Basico ao Avançado - IFSP
--(https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)

# Pata aula02 
1. Criar um objeto da class Livro
2. Digitar dados via Swing(Tela front)
3. Criar um vetor do objeto Livro c/ 4 LIvro
```
 ----------------
| Livro          |   - Privada
|----------------|   + Publica
| - nome         |   # Protect
| - EDitor       |
| + Preco        |
|----------------|
| + Set          |
| + get          |
| + ToString     |
 ----------------
```

_________________________________________________________________________________________________________________________________________________________________________________________
```
LP1A3 - LINGUAGEM DE PROGRAMAÇÃO I
Prof. Evandro – andreevandro@ifsp.edu.br
1ª Lista de Exercícios
Observações:
Você deverá fazer os exercícios abaixo em Linguagem Java e devolver, via moodle, até 11/09/2023 - 23:59.
Para os exercícios abaixo, não é necessário criar atributos e métodos específicos. Poderá ser feito tudo na classe principal. Para enviar as soluções, você deverá criar um arquivo PDF com todos os algoritmos desenvolvidos. Enviar apenas o método main (principal). É permitido 1 arquivo PDF por aluno.
A entrada e saída de dados deverá ser obrigatoriamente via classe swing (JOptionPane…)
1. Com relação a declaração de variáveis em Linguagem Java, assinale a alternativa correta:
a. int idade; float média; char nome;
b. int 1nota; int 2nota; int 3nota;
c. float média; char nome; int idade;
d. int float; char media; float idade;
e. int idade; float media; char bloco

2. Desenvolver um algoritmo que leia um número inteiro e verifique se o número é divisível por 5 e por 3 ao mesmo tempo. A solução deverá ser impressa na tela.

3. Dados quatro números distintos digitados pelo usuário, desenvolver um algoritmo que determine e imprima a soma dos três números menores.

4. Desenvolver um algoritmo para pedir um mês (em número) e o programa deverá imprimir na tela o correspondente por extenso. Por exemplo: 03 – Março ou 09 - Setembro.

5. Faça um algoritmo que leia um número positivo e inteiro N, some todos os números inteiros de 1 a N, e mostre o resultado na tela.

6. Fazer um algoritmo que dado um número, calcular e escrever se este é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo.

7. Elabore um algoritmo que calcule o valor do fatorial de um número informado pelo usuário.Lembrando que 0! = 1.

8. Fazer um algoritmo que dado três valores A, B e C verificar se eles formam um triângulo. Formando triângulo, dizer se é triângulo equilátero, isósceles ou escaleno.

9. Implementar um algoritmo capaz de encontrar o maior dentre 3 números quaisquer. Suponha todos serem distintos.

10. Escrever um programa que leia uma sequência numérica de valores inteiros e positivos. O programa deverá somar todos os números digitados pelo usuário e apresentar o resultado na tela. A leitura dos dados deverá parar quando o usuário digitar um valor negativo.

11. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
• Para Homens: (72.7 *h) – 58; • Para Mulheres: (62.1 * h) – 44.7
```
```
1. Com relação a declaração de variáveis em Linguagem Java, assinale a alternativa correta:R:
R: e. int idade; float media; char bloco
```
```
2. Desenvolver um algoritmo que leia um número inteiro e verifique se o número é divisível por 5 e por 3 ao mesmo tempo. A solução deverá ser impressa na tela.
import javax.swing.JOptionPane;

public class Exercicio2{
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número inteiro:");

        try {
            int numero = Integer.parseInt(input);

            if (numero % 5 == 0 && numero % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número É divisível por 5 e 3 ao mesmo tempo.");
            } else {
                JOptionPane.showMessageDialog(null, "O número Não é divisível por 5 e 3 ao mesmo tempo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
        }
    }

}
```
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/6596ee04-6915-44e8-9ffc-c268c110b2e9)

```
3. Dados quatro números distintos digitados pelo usuário, desenvolver um algoritmo que determine e imprima a soma dos três números menores.
import javax.swing.JOptionPane;

public class Exercicio3 {
	  public static void main(String[] args) {
	        int numero1, numero2, numero3, numero4, soma;
		  
		       
		        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
		        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
		        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
		        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número:"));

		       
		        soma = calcularSomaTresMenores(numero1, numero2, numero3, numero4);

		        
		        JOptionPane.showMessageDialog(null, "A soma dos três menores números é: " + soma);
		    }

		    
		    public static int calcularSomaTresMenores(int num1, int num2, int num3, int num4) {
		        int[] numeros = { num1, num2, num3, num4 };
		        java.util.Arrays.sort(numeros); 
		        return numeros[0] + numeros[1] + numeros[2];
		    }
	
}

```
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/37cdc9ba-f9c1-4b37-8a82-798ccc8a7c4b)

```
4. Desenvolver um algoritmo para pedir um mês (em número) e o programa deverá imprimir na tela o correspondente por extenso. Por exemplo: 03 – Março ou 09 - Setembro.
import javax.swing.JOptionPane;

public class Exercicio4 {

    private int dia;
    private String mes; // Alterado para uma String

    public static void main(String[] args) {
        Exercicio4 exercicio = new Exercicio4();

        exercicio.dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia:"));
        exercicio.mes = JOptionPane.showInputDialog("Digite o Mês:");

        JOptionPane.showMessageDialog(null, "Você digitou o dia: " + exercicio.dia + " e o mês: " + exercicio.mes);
    }
}

```
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/57b30d2f-ec0f-4bd7-9de5-e790379b6488)

```
5. Faça um algoritmo que leia um número positivo e inteiro N, some todos os números inteiros de 1 a N, e mostre o resultado na tela.
import javax.swing.JOptionPane;

public class Exercicio5 {
	 public static void main(String[] args) {
	        String input = JOptionPane.showInputDialog("Digite um número inteiro positivo N:");
	        
	        try {
	            int N = Integer.parseInt(input);
	            if (N >= 1) {
	                int soma = 0;
	                for (int i = 1; i <= N; i++) {
	                    soma += i;
	                }
	                JOptionPane.showMessageDialog(null, "A soma dos números de 1 a " + N + " é: " + soma);
	            } else {
	                JOptionPane.showMessageDialog(null, "Digite um número inteiro positivo maior ou igual a 1.");
	            }
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(null, "Digite um número inteiro válido.");
	        }
	    }

}
```
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/45d5f219-6b68-4fab-acf3-08c762714c1a)


```
6. Fazer um algoritmo que dado um número, calcular e escrever se este é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo.
import javax.swing.JOptionPane;

public class Exercicio6 {

	    public static void main(String[] args) {
	       
	        String input = JOptionPane.showInputDialog("Digite um número:");
	        
	       
	        if (input != null && input.matches("-?\\d+")) {
	            int numero = Integer.parseInt(input);

	           
	            if (numero > 0) {
	                JOptionPane.showMessageDialog(null, "O número é positivo" + numero);
	            } else if (numero < 0) {
	                JOptionPane.showMessageDialog(null, "O número é negativo" + numero);
	            } else {
	                JOptionPane.showMessageDialog(null, "O número é zero" + numero);
	            }

	            
	            if (numero % 3 == 0) {
	                JOptionPane.showMessageDialog(null, "O número é múltiplo de 3.");
	            } else {
	                JOptionPane.showMessageDialog(null, "O número não é múltiplo de 3.");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
	        }
	    }
}
```

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/cff682e0-6dac-4171-ade7-96564f87060b)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/f5413e60-29cc-4759-ad3a-7b7f59ae64ba)



```
7. Elabore um algoritmo que calcule o valor do fatorial de um número informado pelo usuário.Lembrando que 0! = 1.
import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		
	
	 int numero = 0;
     boolean entrada = false;
	
	while(!entrada) {
		String input = JOptionPane.showInputDialog("Digite um numero:");
		
		if(input != null && input.matches("\\d+")) {
			numero = Integer.parseInt(input);
			entrada = true;
			}
		else {
			JOptionPane.showInputDialog(null, "Inserir um número válido.");
		}
		
		if(numero < 0) {
			JOptionPane.showConfirmDialog(null,"O Fatorial não está definido para numero negativo.");
		}
		else {
			int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
			}
			
            JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
		}
	}
	}
	
}

```

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/fd33a94d-2cae-4787-8e6b-d79c664bd68b)



```
8. Fazer um algoritmo que dado três valores A, B e C verificar se eles formam um triângulo. Formando triângulo, dizer se é triângulo equilátero, isósceles ou escaleno.
import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        float a, b, c;

       
        String inputA = JOptionPane.showInputDialog("Digite o valor de A:");
        if (isNumeric(inputA)) {
            a = Float.parseFloat(inputA);

           
            String inputB = JOptionPane.showInputDialog("Digite o valor de B:");
            if (isNumeric(inputB)) {
                b = Float.parseFloat(inputB);

               
                String inputC = JOptionPane.showInputDialog("Digite o valor de C:");
                if (isNumeric(inputC)) {
                    c = Float.parseFloat(inputC);
                    
                    if (c > a + b || a > b + c || b > a + c) {
                        JOptionPane.showMessageDialog(null, "NÃO FORMAM UM TRIÂNGULO");
                    } else if (a != b && a != c && b != c) {
                        JOptionPane.showMessageDialog(null, "TRIÂNGULO ESCALENO");
                    } else if (a == b && a == c) {
                        JOptionPane.showMessageDialog(null, "TRIÂNGULO EQUILÁTERO");
                    } else if (a == b || a == c || b == c) {
                        JOptionPane.showMessageDialog(null, "TRIÂNGULO ISÓSCELES");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para C.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para B.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para A.");
        }
    }

   
    public static boolean isNumeric(String str) {
        return str != null && str.matches("-?\\d+(\\.\\d+)?");
    }
}

```

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/06b183ab-2b57-4878-b0e8-b6d0cc8315e0)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/a4ea7e59-8ffb-4c9b-a59c-9a18d52bcfb0)



```
9. Implementar um algoritmo capaz de encontrar o maior dentre 3 números quaisquer. Suponha todos serem distintos.
import javax.swing.JOptionPane;

public class Exercicio9 {
	public static void main(String[] args) {
		
		
		String input1 = JOptionPane.showInputDialog("Digitar o primeiro número:");
		String input2 = JOptionPane.showInputDialog("Digitar o segundo número:");
		String input3 = JOptionPane.showInputDialog("Digitar o terceiro número:");
		
		int numero1 = Integer.parseInt(input1);
		int numero2 = Integer.parseInt(input2);
		int numero3 = Integer.parseInt(input3);
		
		if(isNumeric(input1) && isNumeric(input2) && isNumeric(input3)) {
			
			int maior = numero1;
			
			if(numero2> maior) {
				maior = numero2;
			}
			if(numero3> maior) {
				maior = numero3;
			}
			
			JOptionPane.showMessageDialog(null,"Maior número é:" + maior);
		}else{
			JOptionPane.showMessageDialog(null,"Por favor, insira valores numéricos validos");
		}
	}
	public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

```
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/cbf11c12-9d83-42cc-8fa4-0870c3b6cf52)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/312a2009-8b31-49bd-a837-6fa468616532)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/7d39de62-d7f8-4e9f-adeb-5dcdf692e21c)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/6308ec92-555d-41ca-a1cd-fd6a9cfde803)


```
10. Escrever um programa que leia uma sequência numérica de valores inteiros e positivos. O programa deverá somar todos os números digitados pelo usuário e apresentar o resultado na tela. A leitura dos dados deverá parar quando o usuário digitar um valor negativo.
import javax.swing.JOptionPane;

public class Exercicio10 {
	public static void main(String[] args) {
		int soma = 0;
		int valor;
		
		while(true) {
			String input = JOptionPane.showInputDialog("Digite um valor inteiro positivo (ou um valor negativo para sair):");
			
			try {
				valor = Integer.parseInt(input);
			} catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Por Favor, insira um valor inteiro válido.");
				continue;
			}
			
			if(valor >= 0) {
				soma += valor;
			} else {
				break;
			}
			
		}
		JOptionPane.showMessageDialog(null, "OPS! você digitou o números negativo: " + soma);
	}
}
```

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/1f16e0c6-9843-4ed1-9efb-f44eed678c29)

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/d82b8cfe-56fb-42ca-880c-937ae3ac4612)

```
11. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
import javax.swing.JOptionPane;

public class Exercicio11 {
	public static void main(String[] args) {
		boolean isDecimal = true;
		String inputAltura = JOptionPane.showInputDialog("Digite a altura (em metros):");
		
		for(char c : inputAltura.toCharArray()) {
			if (!Character.isDigit(c) && c != '.') {
                isDecimal = false;
                break;
            }
		}
		if(isDecimal) {
			double altura = Double.parseDouble(inputAltura);
			
			String sexo = JOptionPane.showInputDialog("Digite seu sexo:");
			
			double pesoIdeal = 0.0;
			
			if(sexo.equalsIgnoreCase("M")) {
				pesoIdeal =(72.7 * altura) -58;
			}
			else if (sexo.equalsIgnoreCase("F")) {
                pesoIdeal = (62.1 * altura) - 44.7;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, insira M ou F como sexo.");
                return;
            }

            JOptionPane.showMessageDialog(null, "O peso ideal é: " + pesoIdeal + " kg");
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, insira uma altura válida (número decimal).");
        }
	}
}
```

![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/c1101025-b145-4c0e-bb13-f1f13d37b5be)
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/7c3daa51-720b-4790-b855-215461365c57)
![image](https://github.com/GabrielAlvesGit/Java-Basico-ao-Avan-ado---IFSP/assets/102634725/14371db0-d437-4a51-a26a-2a94e0313e18)



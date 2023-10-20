// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        char characters [] = input.toCharArray();
        for (int l=0;l<characters.length;l++)
        {
            if (characters[l]!='+'&&characters[l]!='-'&&characters[l]!='*'&&characters[l]!='/'&&characters[l]!='0'&&characters[l]!='1'&&characters[l]!='2'&&characters[l]!='3'&&characters[l]!='4'&&characters[l]!='5'&&characters[l]!='6'&&characters[l]!='7'&&characters[l]!='8'&&characters[l]!='9')
            {
                throw new IllegalArgumentException("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");
            }

        }

        char firstcharacter = input.charAt(0);
        System.out.println("First character is:"+firstcharacter);
        if (firstcharacter=='+'||firstcharacter=='*'||firstcharacter=='*')
        {
            throw new IllegalArgumentException("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");
        }
        String operator=input.replaceAll("[^-,+,*,/]","");
        String operators[]=operator.split("");
        String elements[] = input.split("(?<=\\D)");
        int numberelements[]= new int [elements.length];
        int numbertoken=0, operatortoken=0, elementtoken=0,doubleoperatortoken=0;
        double result=0;

        for (int i=0; i<elements.length;i++)
        {
            if (i==0) {System.out.println("The numbers are:");}
            String subelement = elements[i].replaceAll("[^0-9]", " ");
            subelement=subelement.trim();
            elements[i]=subelement;

            if (elements[i]!="")
            {
                numbertoken=numbertoken+1;
                int num = Integer.parseInt(elements[i]);
                numberelements[i]=num;


                if (numberelements[i]<1||numberelements[i]>10)
                {
                    throw new IllegalArgumentException("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");
                }
                System.out.println(numberelements[i]);

            }
            if (elements[i]=="")
            {
                doubleoperatortoken=doubleoperatortoken+1;
                if (doubleoperatortoken>1)
                {
                    throw new IllegalArgumentException("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");
                }
            }
            elementtoken=elementtoken+1;

        }
        for (int j=0; j<operators.length;j++)
        {
            if (j==0) {System.out.println("The operators are:");}

            if (operators[j]!=""&& operators[j]!=null)
            {

                operatortoken=operatortoken+1;
                System.out.println(operators[j]);
            }

        }
        if (numbertoken==2 && operatortoken==2)
        {
            result=result-numberelements[1];
            switch (operators[1])
            {
                case "+":
                    result = result+numberelements[2];
                    break;
                case "-":
                    result = result-numberelements[2];
                    break;
                case "*":
                    result = result*numberelements[2];
                    break;
                case "/":
                    result = result/numberelements[2];
                    break;
            }
        }
        if (numbertoken==2 && operatortoken==1)
        {
            result=result+numberelements[0];
            switch (operators[0])
            {
                case "+":
                    result = result+numberelements[1];
                    break;
                case "-":
                    result = result-numberelements[1];
                    break;
                case "*":
                    result = result*numberelements[1];
                    break;
                case "/":
                    result = result/numberelements[1];
                    break;
            }
        }

        if (numbertoken==3 && operatortoken==2)
        {
            result=result+numberelements[0];
            switch (operators[0])
            {
                case "+":
                    switch (operators[1])
                    {case "+":
                        result = result+numberelements[1]+numberelements[2];
                        break;
                        case "-":
                            result = result+numberelements[1]-numberelements[2];
                            break;
                        case "*":
                            result = result+numberelements[1]*numberelements[2];
                            break;
                        case "/":
                            result = result+numberelements[1]/numberelements[2];
                            break;
                    }
                    break;
                case "-":
                    switch (operators[1])
                    {case "+":
                        result = result-numberelements[1]+numberelements[2];
                        break;
                        case "-":
                            result = result-numberelements[1]-numberelements[2];
                            break;
                        case "*":
                            result = result-numberelements[1]*numberelements[2];
                            break;
                        case "/":
                            result = result-numberelements[1]/numberelements[2];
                            break;
                    }

                    break;
                case "*":
                    switch (operators[1])
                    {case "+":
                        result = result*numberelements[1]+numberelements[2];
                        break;
                        case "-":
                            result = result*numberelements[1]-numberelements[2];
                            break;
                        case "*":
                            result = result*numberelements[1]*numberelements[2];
                            break;
                        case "/":
                            result = result*numberelements[1]/numberelements[2];
                            break;
                    }
                    break;
                case "/":
                    switch (operators[1])
                    {case "+":
                        result = result/numberelements[1]+numberelements[2];
                        break;
                        case "-":
                            result = result/numberelements[1]-numberelements[2];
                            break;
                        case "*":
                            result = result/numberelements[1]*numberelements[2];
                            break;
                        case "/":
                            result = result/numberelements[1]/numberelements[2];
                            break;
                    }
                    break;
            }
        }
        if (numbertoken==3 && operatortoken==3)
        {
            result=result-numberelements[1];
            switch (operators[1])
            {
                case "+":
                    switch (operators[2])
                    {case "+":
                        result = result+numberelements[2]+numberelements[3];
                        break;
                        case "-":
                            result = result+numberelements[2]-numberelements[3];
                            break;
                        case "*":
                            result = result+numberelements[2]*numberelements[3];
                            break;
                        case "/":
                            result = result+numberelements[2]/numberelements[3];
                            break;
                    }
                    break;
                case "-":
                    switch (operators[2])
                    {case "+":
                        result = result-numberelements[2]+numberelements[3];
                        break;
                        case "-":
                            result = result-numberelements[2]-numberelements[3];
                            break;
                        case "*":
                            result = result-numberelements[2]*numberelements[3];
                            break;
                        case "/":
                            result = result-numberelements[2]/numberelements[3];
                            break;
                    }

                    break;
                case "*":
                    switch (operators[2])
                    {case "+":
                        result = result*numberelements[2]+numberelements[3];
                        break;
                        case "-":
                            result = result*numberelements[2]-numberelements[3];
                            break;
                        case "*":
                            result = result*numberelements[2]*numberelements[3];
                            break;
                        case "/":
                            result = result*numberelements[2]/numberelements[3];
                            break;
                    }
                    break;
                case "/":
                    switch (operators[2])
                    {case "+":
                        result = result/numberelements[2]+numberelements[3];
                        break;
                        case "-":
                            result = result/numberelements[2]-numberelements[3];
                            break;
                        case "*":
                            result = result/numberelements[2]*numberelements[3];
                            break;
                        case "/":
                            result = result/numberelements[2]/numberelements[3];
                            break;
                    }
                    break;
            }
        }
        System.out.println("The quantity of numbers:"+numbertoken);
        System.out.println("The quantity of operators:"+operatortoken);
        System.out.println("The quantity of elements:"+elementtoken);
        System.out.println("The result is:"+result);

        if (numbertoken<2||numbertoken>3||operatortoken<1||operatortoken>3) {throw new IllegalArgumentException("Please enter a mathematical expression, example:2+3-5 (2 or 3 integers from 1 to 10 included and operators(+-*/) accepted): ");}


    }
}
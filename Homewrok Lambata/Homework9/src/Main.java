import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int countUpperLetters = 0, countPoints = 0, countIntervals = 1, pom = 0;
        boolean isTrue = false;

        String output = sc.nextLine();

        for(int i=0; i<output.length(); i++) {
            char ch = output.charAt(i);
            if(Character.isUpperCase(ch)){
                countUpperLetters++;
            }
            if(ch=='.'){
                countPoints++;
                pom++;
            }
        }

        for(int i=0; i<output.length(); i++){
            char ch = output.charAt(i);

            if(countPoints==1 && ch==' ' && countIntervals%2==0){
                countIntervals++;
                sb.append("___");
            }
            else if(countPoints==1 && ch==' ' && countIntervals%2!=0){
                countIntervals++;
                sb.append("***");
            }

            if(Character.isUpperCase(ch) && Character.isUpperCase(output.charAt(i+1)) && Character.isUpperCase(output.charAt(i+2)) && Character.isUpperCase(output.charAt(i+3))){
                isTrue = true;
                sb.append(ch);
                sb.append(output.charAt(i+1));
                sb.append(output.charAt(i+2));
                sb.append(output.charAt(i+3));
                break;
            }
            else if(Character.isUpperCase(ch) && Character.isUpperCase(output.charAt(i+1)) && Character.isUpperCase(output.charAt(i+2)) && !isTrue){
                sb.append(ch);
                sb.append(output.charAt(i+1));
                sb.append(output.charAt(i+2));
                isTrue = true;
                break;
            }
            else  if(Character.isUpperCase(ch) && Character.isUpperCase(output.charAt(i+1)) && !isTrue){
                sb.append(ch);
                sb.append(output.charAt(i+1));
                isTrue = true;
                break;
            }

            switch (ch){
                case 'A':
                    sb.append("{@(}");
                    break;
                case 'a':
                    sb.append("@(");
                    break;
                case 'B':
                    sb.append("[!@]");
                    break;
                case 'b':
                    sb.append("!@");
                    break;
                case 'C':
                    sb.append("{(}");
                    break;
                case 'c':
                    sb.append("(");
                    break;
                case 'D':
                    sb.append("[@!]");
                    break;
                case 'd':
                    sb.append("@!");
                    break;
                case 'E':
                    sb.append("{(-}");
                    break;
                case 'e':
                    sb.append("(-");
                    break;
                case 'F':
                    sb.append("[!-]");
                    break;
                case 'f':
                    sb.append("!-");
                    break;
                case 'G':
                    sb.append("{&}");
                    break;
                case 'g':
                    sb.append("&");
                    break;
                case 'H':
                    sb.append("[!%]");
                    break;
                case 'h':
                    sb.append("!%");
                    break;
                case 'I':
                    sb.append("{!}");
                    break;
                case 'i':
                    sb.append("!");
                    break;
                case 'J':
                    sb.append("[.!]");
                    break;
                case 'j':
                    sb.append(".!");
                    break;
                case 'K':
                    sb.append("{!<}");
                    break;
                case 'k':
                    sb.append("!<");
                    break;
                case 'L':
                    sb.append("[!!]");
                    break;
                case 'l':
                    sb.append("!!");
                    break;
                case 'M':
                    sb.append("{^^}");
                    break;
                case 'm':
                    sb.append("^^");
                    break;
                case 'N':
                    sb.append("[%]");
                    break;
                case 'n':
                    sb.append("%");
                    break;
                case 'O':
                    sb.append("{()}");
                    break;
                case 'o':
                    sb.append("()");
                    break;
                case 'P':
                    sb.append("[!^@]");
                    break;
                case 'p':
                    sb.append("!^@");
                    break;
                case 'Q':
                    sb.append("{!.@}");
                    break;
                case 'q':
                    sb.append("!.@");
                    break;
                case 'R':
                    sb.append("[@<]");
                    break;
                case 'r':
                    sb.append("@<");
                    break;
                case 'S':
                    sb.append("{)(}");
                    break;
                case 's':
                    sb.append(")(");
                    break;
                case 'T':
                    sb.append("[/_]");
                    break;
                case 't':
                    sb.append("/_");
                    break;
                case 'U':
                    sb.append("{^>}");
                    break;
                case 'u':
                    sb.append("^>");
                    break;
                case 'V':
                    sb.append("[<!>]");
                    break;
                case 'v':
                    sb.append("<!>");
                    break;
                case 'W':
                    sb.append("{><}");
                    break;
                case 'w':
                    sb.append("><");
                    break;
                case 'X':
                    sb.append("[<>]");
                    break;
                case 'x':
                    sb.append("<>");
                    break;
                case 'Y':
                    sb.append("{.=.}");
                    break;
                case 'y':
                    sb.append(".=.");
                    break;
                case 'Z':
                    sb.append("[#$]");
                    break;
                case 'z':
                    sb.append("#$");
                    break;
                case '.':
                    if(countPoints>1){
                        sb.append("|...|");
                    }
                    break;
                case '?':
                    sb.append("$$$");
                    break;
            }

            if(countPoints>1 && Character.isUpperCase(ch)){
                sb.append("[(" + (countPoints-(pom-1)) +")]");
                pom--;
            }
        }
        System.out.println(sb.toString());
    }
}
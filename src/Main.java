import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) (Math.random()*100+1);
        System.out.println("Dime el número super secreto, querído por todos, ¡¡Sé el primero en saber lo que nadie sabe!!");
        System.out.println("aaaaa... y rendirse es -1, suerte");
        int d = sc.nextInt();

        while (n!=d && d!=-1){
            if(d>n){
                System.out.println("Te pasaste de caliente, baja el numero, ¡¡que te quemas!!");
            }else{
                System.out.println("Te pasaste de frio, sube el numero, sino te vas a combertir en COLDPALMER");
            }
            System.out.println("Dime otro numero, si no puedes con el sistema de protección rindete con el numero -1");
            d = sc.nextInt();
        }
        if(d==-1){
            System.out.println("Rendirse es de perdedores por si no lo sabias...");
        }else{
            System.out.println("Lo has conseguido :0, has destapado un secreto de las agencias secretas, gracias por su tiempo ;)");
        }

    }
}
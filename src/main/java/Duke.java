import java.util.Scanner;
import java.util.ArrayList;

public class Duke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String catLogo = "        /\\_____/\\\n" +
                "       /  o   o  \\\n" +
                "      ( ==  ^  == )\n" +
                "       )         (\n" +
                "      (           )\n" +
                "     ( (  )   (  ) )\n" +
                "    (__(__)___(__)__)";
        System.out.println(catLogo);

        System.out.println("    ____________________________________________________________");
        System.out.println("    Hello! I'm NEKOBOT!!");
        System.out.println("    What can I do for you :>");
        System.out.println("    ____________________________________________________________");

        String command = sc.nextLine();
        DukeLogic commandHandler = new DukeLogic();
        ArrayList<Task> list = new ArrayList<>();

        while(!command.equals("bye")) {
            commandHandler.executeCommand(command);
            command = sc.nextLine();
        }

        System.out.println("    ____________________________________________________________");
        System.out.println("     Bye~ Hope to see you again soon ;w;");
        System.out.println("    ____________________________________________________________");
    }
}

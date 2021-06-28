//needs to check again.
package monp.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {

        System.out.println(running(1));

    }

    public String running(int command) {

        if (command == 0) {

            return "CodeRunner running North";

        } else if (command == 1) {

            return "CodeRunner running South";

        } else if (command == 2) {

            return "CodeRunner running West";

        } else if (command == 3) {

            return "CodeRunner running East";

        } else if ((command >= 4) || (command < 0)) {

            return "CodeRunner is confused - doesn't know where to go!";

        } else {

            return "Unknown command.";

        }

    }

}

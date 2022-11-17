# java-calorie-counter
Calorie Counter.

Formulation of the task.

A sports sock company decided to develop their own step counter for additional motivation to lead a healthy lifestyle.

Functionality:

Console interface for managing the program;
Storage of data on the number of steps taken for several months;
Entering your goal for the number of steps per day;
Entering the number of steps taken per day;
Display statistics for a specific month.

Class Main

The main cyclic applications are implemented - command recognition and method definition of the standard application class - StepTracker. 
All work with user input and output happens in this class.
interacts with the application through the console interface, which allows you to reduce the number of user actions by choice:
Enter the number of steps for a specific day;
Print statistics for a specific month;
Change the goal for the number of steps per day;
Exit the application.

After selection and action, the program allows you to set this action. The program will terminate when the user enters an exit command. When you enter a non-existent command, a message is displayed stating that there is no such command, after which the application allows you to select the next action again.

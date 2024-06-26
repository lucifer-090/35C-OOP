// Homework

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

// Task
// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object

public class polymorphismTask{
    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet();
        spreadsheet.addRow(5);
        spreadsheet.addColumn(10);

        MsExcel excel = new MsExcel();
        excel.addRow(7);
        excel.addColumn(12);

        MathOperation mathOperation = new MathOperation();
        System.out.println(mathOperation.subtraction(10, 5));
        System.out.println(mathOperation.subtraction(10.5, 5.2, 2.3));
        mathOperation.subtraction(10.5);
        mathOperation.subtraction(10);
        System.out.println(mathOperation.subtraction(10, 5.2));
    }
}
class Spreadsheet {
    public void addRow(int row) {
        System.out.println(row + " row added");
    }

    public void addColumn(int column) {
        System.out.println(column + " column added");
    }
}

class MsExcel extends Spreadsheet {
    private String file = "Excel";

    @Override
    public void addRow(int row) {
        System.out.println("Added " + row + " rows in " + file);
    }

    @Override
    public void addColumn(int column) {
        System.out.println("Added " + column + " columns in " + file);
    }
}

class MathOperation {
    public int subtraction(int a, int b) {
        return a - b;
    }

    public double subtraction(double a, double b, double c) {
        return a - b - c;
    }

    public void subtraction(double a) {
        System.out.println("Invalid operation");
    }

    public void subtraction(int a) {
        System.out.println("Invalid operation");
    }

    public double subtraction(int a, double b) {
        return a - b;
    }
}
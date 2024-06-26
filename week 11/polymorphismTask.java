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
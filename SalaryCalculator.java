public class SalaryCalculator
{
    public static void main(String[] args) 
    {
        // Sample input data
        String[] employeeNames = {"Jane", "Tom", "Mary", "Sue", "Jack"};
        int[] performanceScores = {4, 1, 2, 3, 4};
        double[] salaries = {80000.0, 80000.0, 80000.0, 80000.0, 80000.0};

        // Creating Employee objects and calculating actual salaries
        Employee[] employees = new Employee[employeeNames.length];
        for (int i = 0; i < employeeNames.length; i++) 
        {
            employees[i] = new Employee(employeeNames[i], performanceScores[i], salaries[i]);
            double actualSalary = employees[i].calculateActualSalary();
            
            // Printing the output line
            System.out.printf("%s %d %.2f %.2f %.2f \n ", employees[i].getName(), employees[i].getPerformanceScore(),
                    employees[i].getSalary(), actualSalary, employees[i].getSalary() + actualSalary);
        }
    }
}

# Bakery
You have three parallel arrays. Each array has 6 elements. (You should think of these arrays as
lines in a spreadsheet or table or as records in a database.) The first array contains employee
names. The second array contains performance scores. Each is an integer from 1 to 4, telling
how well the employee did his/her job last year. A score of 1 means the employee is severely
underperforming and a score of 4 means the employee is a superstar. The third array contains
the employee’s annual salary. Here is sample input. You should use this in your program.
Jane 4 $80,000
Tom 1 $80,000
Mary 2 $80,000
Sue 3 $80,000
Jack 4 $80,000
Your job is to compute actual salaries. If an employee has a performance score of 1 or 2, the
employee gets no bonus. If an employee has a performance score of 3, the employee gets a
bonus of 1%. If an employee has a performance score of 4, the employee gets a bonus of 3%.
An actual salary is computed as the base salary (from the third array) plus the bonus. The bonus
is the percentage (based on the performance score) times the base salary. Here is a sample
output line:
Jane 4 $80,000 $2,400 $82,400
The $2,400 was calculated as 0.03 (80,000), and the $82,400 was calculated as 80,000 + 2400.
Make sure your program has comments explaining it. As always, you should create two classes.
And again, all code must be your own. All programs must be turned in by 15 minutes after the
end of the time allotted to the exam.
Type in, debug, and demonstrate the program to the instructor. Turn in a listing to receive credit
for this part of the exam.

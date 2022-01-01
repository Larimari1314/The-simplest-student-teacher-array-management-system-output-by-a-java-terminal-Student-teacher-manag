The simplest student-teacher array management system output by a java terminal
Student-teacher management system: There needs to be a student terminal and a teacher terminal, using array storage instead of a collection. The student terminal needs to add, delete and modify the query operation. The teacher terminal needs to be completed with the idea of ​​subcontracting classification
Operation effect: the menu bar needs to have three columns, the student-side entrance and the teacher-side entrance are required to be deleted
Students add students, delete students, modify students, view students, exit
Array is defined by class

my thoughts:
First define two storage classes: Teacher+Student, define private int ID; private String name; private int age; private Date brithday;
The home page interface and the student-side teacher-side interface are unified into the interface package and called
Home front_page class returns int type
Student page Student_page class returns int type
Teacher page Teacher_page class returns int type
Student reminder page (additional follow-up)
Teacher prompt page class (to be added later)

Create Add_to, Check_all, compare, delete classes in the operate_manage package to call methods

Define compare to compare whether the same student ID exists


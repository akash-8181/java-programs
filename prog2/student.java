package prog2;

class student

{    

String ss;    

String name;  

public student(String ss)

{      

name = ss;  

}  

public student()  

{      

name = "unknown";  

}

}

public class Raju

{    

public static void main(String[] args)

{        

student obj = new student();

obj.ss = "Ashi";      

//Student ss1 = new Student();        

System.out.println(obj.ss);      

System.out.println(obj.name);

   }


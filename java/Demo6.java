class Demo6
{     
 public static void main(String[] args)
 {
   String name = "Smith";
   char gender = 'm';              
   int age = 32; 
    
   System.out.println(name);
   System.out.println(gender);
   System.out.println(age);
   System.out.println();
     
   System.out.println("  name: " + name);
   System.out.println("gender: " + gender);
   System.out.println("   age: " + age);
   System.out.println();
     
   String opt;  // output
   opt = name + " " + age + " " + gender;
   System.out.println(opt); 
 }
}


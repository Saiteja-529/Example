import java.util.ArrayList;
import java.util.Iterator;

public class Collections 
{
		 public static void main(String[] args)
		    
		    {

		        Student s1=new Student();
		        Student s2=new Student();
		        Employee e1=new Employee();
		        Employee e2=new Employee();
		        
		        
		        s1.setRollNo(101);
		        s1.setName("raju");
		        s1.setMarks(500);
		        s2.setRollNo(102);
		        s2.setName("radha");
		        s2.setMarks(550);
		        e1.setEmpId(111);
		        e1.setEmpName("ramesh");
		        e1.setEmpSal(56000);
		        e2.setEmpId(112);
		        e2.setEmpName("suresh");
		        e2.setEmpSal(57000);
		        //createing collection
		        ArrayList arrayList=new ArrayList();
		        
		        //adding elements into collection
		        arrayList.add(s1);
		        arrayList.add(s2);
		        arrayList.add(e1);
		        arrayList.add(e2);
		        arrayList.add("harsha");
		        
		        //show elements 
		        System.out.println(arrayList);
		        
		        //show elements data
		        Iterator itr=arrayList.iterator();
		        
		        while(itr.hasNext())
		        {
		            
		            Object obj=itr.next();
		            if(obj instanceof  Student)
		            {
		            Student s=(Student)obj;
		            System.out.println("Rollno  = "+s.getRollNo());
		            System.out.println("Name = "+s.getName());
		            System.out.println("Marks = "+s.getMarks());
		            
		            }
		            if(obj instanceof  Employee)
		            {
		            Employee e=(Employee)obj;
		            System.out.println("Emp id "+e.getEmpId());
		            System.out.println("Emp Name "+e.getEmpName());
		            System.out.println("Emp salary "+e.getEmpSal());
		            }
		        }
		        
		        
		        

		    }

		
	}



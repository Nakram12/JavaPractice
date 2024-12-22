package JavaConceptsProgram;

class Pratice2{  
	  A4 obj;  
	  Pratice2(A4 obj){  
	    this.obj=obj;  
	  }  
	  void display(){  
	    System.out.println(obj.data);//using data member of A4 class  
	  }  
	}  
	  
	class A4{  
	  int data=10;  
	  A4(){  
		  Pratice2 b=new Pratice2(this);  
	   b.display();  
	  }  
	  public static void main(String args[]){  
	   A4 a=new A4();  
	  }  
	}  
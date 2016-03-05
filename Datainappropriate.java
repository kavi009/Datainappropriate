package session1;

public class Datainappropriate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int data=10;
      String dat = "HI";
      float ba=9.9f;
      data = (int)(data+ba);
      System.out.println("data is "+ data);
      data = (int)(data+dat);
      System.out.println("data inappropriate" + data);
      
	}

}

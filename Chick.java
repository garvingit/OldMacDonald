class Chick implements Animal {     
     private String myType;
     private int oneortwo = (int)(Math.random()*2);      
     private String[] mySound = new String[2];
     public Chick(String type, String sound, String sound2)     {         
         myType = type;         
         mySound[0] = sound;
         mySound[1] = sound2;
        
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound[0] = "unknown";    
         mySound[1] = "unknown";  
     }      
     public String getSound(){return mySound[oneortwo];}     
     public String getType(){return myType;} 
}
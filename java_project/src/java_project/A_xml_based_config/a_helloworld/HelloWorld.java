package java_project.A_xml_based_config.a_helloworld;

public class HelloWorld {
    /*This must be a private variable*/
    private String message;


    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}

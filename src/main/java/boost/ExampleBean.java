package boost;

import javax.inject.Named;

@Named (value = "firstbean")
public class ExampleBean {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void someAction(){
        name="";
    }
}

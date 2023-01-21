package testng_knowledge;

import org.testng.annotations.Test;

public class _03_Priority_and_Dependency {

    @Test
    public void login(){
        System.out.println("This is login");
    }

    @Test
    public void logout(){
        System.out.println("This is logout");
    }

    @Test
    public void forgotPassword(){
        System.out.println("This is forgot password");
    }
    @Test
    public void invalidLogin(){
        System.out.println("This is invalid login");
    }
}

package controller;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

//ha elhagynám a name attribútumot, akkor az osztály nevével lehetne hivatkozni a bean-re -> helloWorld
//ha eager = true -> a bean már korábban létrejön, minthogy meghívnák
//ha eager = false -> a bean csak akkor jön létre, amikor legelső alkalommal meghívják
@ManagedBean(name = "homeController", eager = true)

//Scope típusok -> ViewScoped, SessionScoped, ApplicationScoped (RequestScoped, NoneScoped)
@ViewScoped
@Getter
@Setter
public class HomeController
{
    private String username;
    private String password;

    public String login()
    {
        if (username.equals("zsolti") && password.equals("asd"))
        {
            return "calculate?faces-redirect=true";
        }
        return "";
    }
}

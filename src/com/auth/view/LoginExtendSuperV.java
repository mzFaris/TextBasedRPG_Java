package com.auth.view;

import com.auth.config.DB;
import com.main.Game;
import com.PrintDelay;
public class LoginExtendSuperV extends SuperV {
    
    public LoginExtendSuperV (){
    }
    
    public void viewLogin(){
        String msg = "";
            
        view();
        String email = getEmail();
        String password = getPassword();
        int a = DB.cariData(email, password);
        if (a > 0){
            msg = DB.authAkun(a, email, password);
            PrintDelay.print(msg);
        }else{
            PrintDelay.print("Account is not registered yet");
        }
        
        if (msg.equals("Login Success")){
            //langsung keprogram
            Game game = new Game();
            game.showMenu();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fittohit;


import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Marina
 * 
 */
public class JavaFXApplication1 extends Application {
   
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        javafx.geometry.Rectangle2D screen = Screen.getPrimary().getVisualBounds();
        GoalPane gp = new GoalPane(screen.getWidth(),screen.getHeight()); 
       
      
        Scene scene = new Scene(gp,screen.getWidth(),screen.getHeight() );
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
          UserManager userManager = new UserManager();
        User user = new User();
        user.setName("Marina");
        user.setEmail("marina@test.com");
        user.setPassword("root");
        user.setAge(20);
        user.setHeight(159);
        user.setWeight(52);
        user.setTargetWeight(40);
        userManager.insertNewUser(user);
        
        
        userManager.getUsersData().forEach((t) -> {
            System.out.println("User ID -> "+t.getId());
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
      
    }
    
}

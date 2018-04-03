
package javaapplication25;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class JavaApplication25 extends Application{
public void start(Stage primaryStage){
    StackPane pane=new StackPane();
    pane.setId("pane");
    Button button=new Button("Bangladesh");
    button.setPrefSize(200.10, 80.1);
    button.setOnAction(e->Divison.display("Division")); 
       
pane.getChildren().add(button);
   
    button.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC, 32));
    pane.setStyle("-fx-background-color:#006A4E");
    Scene scene=new Scene(pane,960,600);
    scene.getStylesheets().addAll(this.getClass().getResource("BD.css").toExternalForm());
    primaryStage.setTitle("Bangladesh Details");
    primaryStage.setScene(scene);
    primaryStage.show();
    
}
    
    public static void main(String[] args) {
       Application.launch(args);
    }
    
}
 class Divison {
    public static void  display(String a){
       
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL); 
      
     
        stage.setTitle("Bangladesh Details");
       
         Label label=new Label(a);
        
         Button b1=new Button("Dhaka");
         Button b2=new Button("Rajshahi");
         
         Button b3=new Button("Barsal");
          Button b4=new Button("Rangpur");
           Button b5=new Button("khulna");
           Button b6=new Button("Chittagong");
           Button b7=new Button("Sylhet");
           Button b8=new Button("Mymensingh");
            Button button =new Button(" close ");
            b1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
            b2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
              b5.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b6.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,25));
              b7.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b8.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20));
              button.setFont(Font.font("Times New Roma",FontWeight.SEMI_BOLD,FontPosture.ITALIC,20));
              b1.setOnAction(e->District.dhaka());
              b2.setOnAction(e->Rajshahi.district());
              b3.setOnAction(e->Barsal.district());
              b4.setOnAction(e->Rangpur.district());
              b5.setOnAction(e->Khulna.distric());
              b6.setOnAction(e->Chittagong.district());
              b7.setOnAction(e->Sylhet.district());
              b8.setOnAction(e->Mymensingh.district());
         button.setOnAction(e->stage.close());
         b1.setPrefSize(160, 55);
           b2.setPrefSize(160, 55);
             b3.setPrefSize(160, 55);
               b4.setPrefSize(160, 55);
                 b5.setPrefSize(160, 55);
                   b6.setPrefSize(160, 55);
                     b7.setPrefSize(160, 55);
                       b8.setPrefSize(160, 55);
                       
         label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.REGULAR,100));
         VBox layout=new VBox(10);
         layout.setStyle("-fx-background-color:blue;");
         button.setAlignment(Pos.BOTTOM_RIGHT);
         layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,button);
         layout.setAlignment(Pos.CENTER);
         Scene scene=new Scene(layout,960,690);
         stage.setScene(scene);
         stage.showAndWait();
}}
class Mymensingh {
     public static void district(){
        Stage stage =new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Jamalpur");
        Button b2 =new Button("Mymensingh");
        Button b3=new Button("Sherpur");
        Button b4=new Button("Netrokona");
       
        Button b7=new Button("Close");
        b1.setPrefSize(200,55);
                b2.setPrefSize(200,55);
                        b3.setPrefSize(200,55);
                                b4.setPrefSize(200,55);
                                 
                                   b7.setPrefSize(160,55);
                             b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
   
        b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,25));
      b7.setOnAction(e->stage.close());
        
        Label label=new Label("District");

        VBox layout=new VBox();
        
         label.setFont(Font.font("Times New Roman", FontWeight.BLACK,FontPosture.ITALIC, 90));
         layout.setSpacing(9);
         layout.setStyle("-fx-background-color:#D1001C;");
        layout.getChildren().addAll(label,b1,b2,b3,b4,b7);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout,960,600);
        stage.setTitle("Details About Mymensingh");
        stage.setScene(scene);
        stage.showAndWait();
}
}

class Sylhet {
     public static void district(){
        Stage stage =new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Habiganj");
        Button b2 =new Button("Moulvibazar");
        Button b3=new Button("Sunamganj");
        Button b4=new Button("Sylhet");
       
        Button b7=new Button("Close");
        b1.setPrefSize(200,55);
                b2.setPrefSize(200,55);
                        b3.setPrefSize(200,55);
                                b4.setPrefSize(200,55);
                                 
                                   b7.setPrefSize(160,55);
                             b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
   
        b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,25));
      b7.setOnAction(e->stage.close());
        
        Label label=new Label("District");

        VBox layout=new VBox();
        
         label.setFont(Font.font("Times New Roman", FontWeight.BLACK,FontPosture.ITALIC, 90));
         layout.setSpacing(9);
         layout.setStyle("-fx-background-color:skyblue;");
        layout.getChildren().addAll(label,b1,b2,b3,b4,b7);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout,960,600);
        stage.setTitle("Details About Sylhet");
        stage.setScene(scene);
        stage.showAndWait();
}}

class Chittagong {
     public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
      Button b1=new Button("Brahmanbaria");
        
       Button b2=new Button("Comilla") ; 
    Button b3=new Button("Chandpur ");
    Button b4 =new Button("Lakshmipur" );
    Button b5=new Button ("Noakhali");
    Button b6=new Button("Feni");
       Button b7=new Button("Khagrachhari");
          Button b8=new Button("Rangamati");
             Button b9=new Button("Bandarban");
                Button b10=new Button("Chittagong");
                   Button b11=new Button("Cox's Bazar");
                      
                         Button b12=new Button("close");
                           
                               
                
   
    b1.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b2.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b3.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b4.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b5.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b6.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b7.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b8.setFont(Font.font("Times New ROman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b9.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b11.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b12.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
   
   b1.setPrefSize(110, 37);
    b2.setPrefSize(110, 37);
    b3.setPrefSize(110, 37);
    b4.setPrefSize(110, 37);
    b5.setPrefSize(110, 37);
    b6.setPrefSize(110, 37);
    b7.setPrefSize(110, 37);
    b8.setPrefSize(110, 37);
    b9.setPrefSize(110, 37);    b11.setPrefSize(100, 37);
    b10.setPrefSize(110, 37);
    b12.setPrefSize(100, 37);
   b12.setOnAction(e->stage.close());

    VBox layout=new VBox();
    Label label=new Label("District");
    label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,80));
    layout.setStyle("-fx-background-color:#54626F;");
    layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12);
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(6);
    Scene scene =new Scene(layout,900,650);
    stage.setTitle("Division Details");
    stage.setScene(scene);
    stage.showAndWait();
}}

class Khulna {
    public static void distric(){
         Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Bagerhat");
        Button b2=new Button("Chuadanga");
        Button b3=new Button("Jessore");
        Button b4=new Button("Jhenaidah");
        Button b5=new Button("Khulna");
        Button b6=new Button("Kushtia");
        Button b7=new Button("Magura");
        Button b8=new Button("Meherpur");
         Button b9=new Button("Narail");
          Button b10=new Button("Satkhira");
        Button b11=new Button("Close");
        b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
         b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
          b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
           b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
            b5.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
             b6.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27)); 
              b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
               b8.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,27));
                b9.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,27));
                  b10.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,27));
                    b11.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,20));
             b11.setOnAction(e->stage.close());
                b1.setPrefSize(200, 55);
           b2.setPrefSize(200, 40);
             b3.setPrefSize(200, 40);
               b4.setPrefSize(200, 40);
                 b5.setPrefSize(200, 40);
                   b6.setPrefSize(200, 40);
                     b7.setPrefSize(200, 40);
                       b8.setPrefSize(200, 40);
                       b9.setPrefSize(200, 40);    
                       b10.setPrefSize(200, 40);   
                       b11.setPrefSize(150, 40);
             
        Label label=new Label("District");
        VBox layout=new VBox();
        layout.setStyle("-fx-background-color:#32AD61;");
        layout.setAlignment(Pos.CENTER);
       layout.setSpacing(7);
        label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,80));
        layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11);
        Scene scene=new Scene(layout,960,690);
        stage.setTitle("Details About Khulna Division ");
        stage.setScene(scene);
        stage.showAndWait();
    }
}

class Rangpur {
    public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Thakurgaon");
        Button b2=new Button("Dinajpur");
        Button b3=new Button("Rangpur");
        Button b4=new Button("Panchagarh");
        Button b5=new Button("Nilphamari");
        Button b6=new Button("Lalmonirhat");
        Button b7=new Button("Kurigram");
        Button b8=new Button("Gaibandha");
        Button b9=new Button("Close");
        b1.setOnAction(e->Thakurgaon.upozila());
        b2.setOnAction(e->Dinajpur.upozila());
        b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
         b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
          b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
           b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
            b5.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
             b6.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30)); 
              b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
               b8.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b9.setFont(Font.font("Times new Roman",FontWeight.LIGHT,FontPosture.ITALIC,20));
             b9.setOnAction(e->stage.close());
                b1.setPrefSize(200, 55);
           b2.setPrefSize(200, 55);
             b3.setPrefSize(200, 55);
               b4.setPrefSize(200, 55);
                 b5.setPrefSize(200, 55);
                   b6.setPrefSize(200, 55);
                     b7.setPrefSize(200, 55);
                       b8.setPrefSize(200, 55);
                       b9.setPrefSize(90, 30);
             
        Label label=new Label("District");
        VBox layout=new VBox();
        layout.setStyle("-fx-background-color: 	#66B447;");
        layout.setAlignment(Pos.CENTER);
       layout.setSpacing(8);
        label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,90));
        layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9);
        Scene scene=new Scene(layout,960,690);
        stage.setTitle("Details About Rangpur Division ");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
class Dinajpur {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Dinajpur Sadar");
             Label label2=new Label("Birampur");
              Label label3=new Label("Biral");
               Label label4=new Label("Phulbari");
                Label label5=new Label("Hakimpur");
                Label label6=new Label("Khansama");
                Label label7=new Label("Nawabganj");
                Label label8=new Label("Parbatipur");
                Label label9=new Label("Birganj");
                Label label10=new Label("Kaharole");
                Label label11=new Label("Chirirbandar");
                Label label12=new Label("Ghoraghat");
                Label label13=new Label("Bochaganj");
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               label10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label11.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label12.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                 label13.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#66FF00");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Dinajpur District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Thakurgaon {
   public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Thakurgaon Sadar");
             Label label2=new Label("Baliadangi");
              Label label3=new Label("Pirganj");
               Label label4=new Label("Ranisankail");
               Label label5=new Label("Haripur");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#FAE7B5");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Thakurgaon District");
    stage.setScene(scene);
    stage.showAndWait();
    
     } 
}

class Barsal {
    public static void district(){
        Stage stage =new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Barisal");
        Button b2 =new Button("Barguna");
        Button b3=new Button("Bhola");
        Button b4=new Button("Jhalokati");
        Button b5=new Button("Patuakhali");
        Button b6=new Button ("Pirojpur");
        Button b7=new Button("Close");
        b1.setPrefSize(160,55);
                b2.setPrefSize(160,55);
                        b3.setPrefSize(160,55);
                                b4.setPrefSize(160,55);
                                 b5.setPrefSize(160,55);
                                  b6.setPrefSize(160,55);
                                   b7.setPrefSize(160,55);
                                   b1.setOnAction(e->Barisalup.upozila());
                                   b2.setOnAction(e->Barguna.upozila());
                                   b3.setOnAction(e->Bhola.upozila());
                                   b4.setOnAction(e->Jhalokati.upozila());
                                   b5.setOnAction(e->Patuakhali.upozila());
                                   b6.setOnAction(e->Pirojpur.upozila());
                             b1.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b2.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b3.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                b4.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b5.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b6.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
        b7.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.ITALIC,25));
      b7.setOnAction(e->stage.close());
        
        Label label=new Label("District");

        VBox layout=new VBox();
        
         label.setFont(Font.font("Times New Roman", FontWeight.BLACK,FontPosture.ITALIC, 90));
         layout.setSpacing(9);
         layout.setStyle("-fx-background-color:skyblue;");
        layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7);
        layout.setAlignment(Pos.CENTER);
        Scene scene=new Scene(layout,960,600);
        stage.setTitle("Details About Barisal");
        stage.setScene(scene);
        stage.showAndWait();
    }
}
class Pirojpur {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Pirojpur Sadar");
             Label label2=new Label("Zianagar");
              Label label3=new Label("Mathbaria");
               Label label4=new Label("Bhandaria");
                Label label5=new Label("Kawkhali");
                Label label6=new Label("Nesarabad");
                Label label7=new Label("Nazirpur");
              
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label7.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));
         

        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#ACE5EE");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Pirojpur District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Jhalokati {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Jhalokati Sadar");
             Label label2=new Label("Nalchity");
              Label label3=new Label("Kathalia");
               Label label4=new Label("Rajapur");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#BFFF00");
  layout.getChildren().addAll(text,label,label2,label3,label4);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Jhakokati District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}
class Patuakhali {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Patuakhali Sadar");
             Label label2=new Label("Mirzaganj");
              Label label3=new Label("Dumki");
               Label label4=new Label("Dasmina");
                Label label5=new Label("Bauphal");
                Label label6=new Label("Kalapara");
                Label label7=new Label("Rangabali");
                Label label8=new Label("Galachipa");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label7.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));
          label8.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));

        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#0087BD");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Patuakhali District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Bhola {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Bhola Sadar");
             Label label2=new Label("Char Fasson");
              Label label3=new Label("Manpura");
               Label label4=new Label("Burhanuddin");
                Label label5=new Label("Tazumuddin");
                Label label6=new Label("Daulatkhan");
                Label label7=new Label("Lalmohan");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#66B447");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Bhola District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Barisalup {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Barisal Sadar");
             Label label2=new Label("Banaripara");
              Label label3=new Label("Bakerganj");
               Label label4=new Label("Babuganj");
                Label label5=new Label("Gaurnadi");
                Label label6=new Label("Hizla");
                Label label7=new Label("Mehendiganj");
                Label label8=new Label("Agailjhara");
                Label label9=new Label("Wazirpur");
                Label label10=new Label("Muladi");
              
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               label10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#FFE4C4");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Barisal District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}
class Barguna {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Barguna Sadar");
             Label label2=new Label("Betagi");
              Label label3=new Label("Bamna");
               Label label4=new Label("Patharghata");
                Label label5=new Label("Amtali");
                Label label6=new Label("Taltali");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#967117");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Barguna District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}


 class Rajshahi {
    public static void district(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Button b1=new Button("Bogra");
        Button b2=new Button("Chapainawabganj");
         Button b3=new Button("Joypurhat");
          Button b4=new Button("Naogaon");
           Button b5=new Button("Natore");
            Button b6=new Button("Pabna");
             Button b7=new Button("Rajshahi");
              Button b8=new Button("Sirajganj");
              Button b9=new Button("Close");
              b1.setOnAction(e->Bogra.upozila());
                  b2.setOnAction(e->Chapainawabganj.upozila());
                  b3.setOnAction(e->Joypurhat.upozila());
                  b4.setOnAction(e->Naogaon.upozila());
                  b5.setOnAction(e->Natore.upozila());
                  b6.setOnAction(e->Pabna.upozila());
                  b7.setOnAction(e->Rajshahiup.upozila());
                  b8.setOnAction(e->Sirajganj.upozila());
              b1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
            b2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 17));
              b3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC, 30));
              b4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,30));
              b5.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b6.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,25));
              b7.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,30));
              b8.setFont(Font.font("Times New Roman",FontWeight.EXTRA_BOLD,FontPosture.ITALIC,20));
              b1.setPrefSize(160, 55);
           b2.setPrefSize(160, 55);
             b3.setPrefSize(160, 55);
               b4.setPrefSize(160, 55);
                 b5.setPrefSize(160, 55);
                   b6.setPrefSize(160, 55);
                     b7.setPrefSize(160, 55);
                       b8.setPrefSize(160, 55);
                       b9.setPrefSize(80, 30);
                       b9.setOnAction(e->stage.close());
                     
              VBox layout=new VBox();
               Label label=new Label("District");
               label.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,90));
              layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9);              
              layout.setSpacing(8);             
              layout.setStyle("-fx-background-color:yellow");
              layout.setAlignment(Pos.CENTER);
              Scene scene=new Scene(layout,960,800);
              stage.setTitle("Details About Rajshahi");
              stage.setScene(scene);
              stage.show();
              
           
        
    }
}
class Sirajganj {
       public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Sirajganj Sadar");
             Label label2=new Label("Chauhali");
              Label label3=new Label("Kamarkhanda");
               Label label4=new Label("Belkuchi");
                Label label5=new Label("Kazipur");
                Label label6=new Label("Raiganj");
                Label label7=new Label("Ullahpara");
                Label label8=new Label("Tarash");
                Label label9=new Label("Shahjadpur");
              
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#21ABCD");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Rajshahi District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Rajshahiup {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Bagmara");
             Label label2=new Label("Paba");
              Label label3=new Label("Charghat");
               Label label4=new Label("Durgapur");
                Label label5=new Label("Godagari");
                Label label6=new Label("Mohanpur");
                Label label7=new Label("Bagha");
                Label label8=new Label("Puthia");
                Label label9=new Label("Tanore");
              
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#21ABCD");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Rajshahi District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Pabna {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Pabna Sadar");
             Label label2=new Label("Santhia");
              Label label3=new Label("Bera");
               Label label4=new Label("Sujanagar");
                Label label5=new Label("Atgharia");
                Label label6=new Label("Bhangura");
                Label label7=new Label("Faridpur");
                Label label8=new Label("Chatmohar");
                Label label9=new Label("Ishwardi");
              
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
               
                
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#21ABCD");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9); 
  
    Scene scene=new Scene(layout,990,650);
 
    stage.setTitle("Details About Pabna District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Natore {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Natore Sadar");
             Label label2=new Label("Bagatipara");
              Label label3=new Label("Singra");
               Label label4=new Label("Boraigram");
                Label label5=new Label("Gurudaspur");
                Label label6=new Label("Lalpur");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#66B447");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Natore District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Naogaon {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Naogaon Sadar");
             Label label2=new Label("Atrai");
              Label label3=new Label("Dhamoirhat");
               Label label4=new Label("Badalgachhi ");
                Label label5=new Label("Niamatpur");
                Label label6=new Label("Manda");
                Label label7=new Label("Mohadevpur");
                Label label8=new Label("Patnitala");
                Label label9=new Label("Porsha");
                Label label10=new Label("Sapahar");
                Label label11=new Label("Raninagar");
             
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                  label10.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                    label11.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                      
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#B0BF1A");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11); 
  
    Scene scene=new Scene(layout,990,700);
 
    stage.setTitle("Details About Naogaon District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Joypurhat {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Joypurhat Sadar");
             Label label2=new Label("Akkelpur");
              Label label3=new Label("Khetlal");
               Label label4=new Label("Panchbibi");
                Label label5=new Label("Kalai");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#FF7E00");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Joypurhat District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Chapainawabganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Chapai Nawabganj Sadar");
             Label label2=new Label("Nachole");
              Label label3=new Label("Shibganj");
               Label label4=new Label("Gomastapur");
                Label label5=new Label("Bholahat");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#F0F8FF");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Chapainawabganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Bogra {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Bogra Sadar");
             Label label2=new Label("Gabtali");
              Label label3=new Label("Sariakandi");
               Label label4=new Label("Adamdighi");
                Label label5=new Label("Sonatala");
                Label label6=new Label("Sherpur");
                Label label7=new Label("Kahaloo");
                Label label8=new Label("Shibganj");
                Label label9=new Label("Dupchanchia");
                Label label10=new Label("Nandigram");
                Label label11=new Label("Sahajanpur");
                Label label12=new Label("Dhunat");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                  label10.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                    label11.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                      label12.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#B0BF1A");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12); 
  
    Scene scene=new Scene(layout,990,700);
 
    stage.setTitle("Details About Bogra District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class District {
    public static void dhaka(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        
      Button b1=new Button("Dhaka");
        
       Button b2=new Button("Gazipur") ; 
    Button b3=new Button("Kishoreganj");
    Button b4 =new Button("Manikganj");
    Button b5=new Button ("Munshiganj");
    Button b6=new Button("Narayanganj");
       Button b7=new Button("Narsingdi");
          Button b8=new Button("Tangail");
             Button b9=new Button("Faridpur");
                Button b10=new Button("Gopalganj");
                   Button b11=new Button("Madaripur");
                      Button b12=new Button("Rajbari");
                         Button b13=new Button("Shariatpur");
         b1.setOnAction(e->Dhaka.upozila());                  
     b2.setOnAction(e->Gazipur.upazila());
       b3.setOnAction(e->Kishoreganj.upozila());
       b4.setOnAction(e->Manikganj.upozila());
   b5.setOnAction(e->Munshiganj.upozila());
   b6.setOnAction(e->Narayanganj.upozila());
   b7.setOnAction(e->Narsingdi.upozila());
   b8.setOnAction(e->Tangail.upozila());
   b9.setOnAction(e->Faridpur.upozila());
   b10.setOnAction(e->Gopalganj.upozila());
   b11.setOnAction(e->Madaripur.upozila());
   b12.setOnAction(e->Rajbari.upozila());
   b13.setOnAction(e->Shariatpur.upozila());
    b1.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b2.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b3.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b4.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b5.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b6.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b7.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b8.setFont(Font.font("Times New ROman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b9.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b10.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b11.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
    b12.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
    b13.setFont(Font.font("Times New Roman",FontWeight.BLACK,FontPosture.ITALIC,15));
   b1.setPrefSize(100, 37);
    b2.setPrefSize(100, 37);
    b3.setPrefSize(100, 37);
    b4.setPrefSize(100, 37);
    b5.setPrefSize(100, 37);
    b6.setPrefSize(100, 37);
    b7.setPrefSize(100, 37);
    b8.setPrefSize(100, 37);
    b9.setPrefSize(100, 37);    b11.setPrefSize(100, 37);
    b10.setPrefSize(100, 37);
    b12.setPrefSize(100, 37);
    b13.setPrefSize(100, 37);

    VBox layout=new VBox();
    
    Label label=new Label("District");
    label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,90));
    layout.setStyle("-fx-background-color:#336699;");
    layout.getChildren().addAll(label,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13);
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(7);
    Scene scene =new Scene(layout,900,650);
 

    stage.setScene(scene);
    stage.showAndWait();
    }
}class Shariatpur {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,90));
            Label label=new Label("Shariatpur Sadar");
             Label label2=new Label("Bhedarganj");
              Label label3=new Label("Damudya");
               Label label4=new Label("Gosairhat");
                Label label5=new Label("Naria");
                Label label6=new Label("Shakhipur");
                Label label7=new Label("Zanjira");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#FFBF00");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Shariatpur District");
    stage.setScene(scene);
    stage.showAndWait();
}
}

class Rajbari {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Rajbari Sadar");
             Label label2=new Label("Baliakandi");
              Label label3=new Label("Kalukhali");
               Label label4=new Label("Goalandaghat");
                Label label5=new Label("Pangsha");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#F0F8FF");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Rajbari District");
    stage.setScene(scene);
    stage.showAndWait();
}
}

class Madaripur {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Madaripur Sadar");
             Label label2=new Label("Shibchar");
              Label label3=new Label("Kalkini");
               Label label4=new Label("Rajoir");
                
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
   
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#EFDECD");
  layout.getChildren().addAll(text,label,label2,label3,label4);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Madaripur District");
    stage.setScene(scene);
    stage.showAndWait();
     }
}

class Gopalganj {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Gopalganj Sadar");
             Label label2=new Label("Tungipara");
              Label label3=new Label("Kotalipara");
               Label label4=new Label("Kashiani");
                Label label5=new Label("Muksudpur");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
    label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#F0F8FF");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5);
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Gopalganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}

class Faridpur {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            
            Label label=new Label("Faridpur Sadar");
             Label label2=new Label("Alfadanga");
              Label label3=new Label(" Bhanga");
               Label label4=new Label("Boalmari");
                Label label5=new Label("Charbhadrasan");
                Label label6=new Label("Madhukhali");
                Label label7=new Label("Nagarkanda");
                Label label8=new Label("Sadarpur");
                Label label9=new Label("Saltha");
              
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                  
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#B284BE");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9); 
  
    Scene scene=new Scene(layout,990,700);
 
    stage.setTitle("Details About Faridpur District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}

class Tangail {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Tangail Sadar");
             Label label2=new Label("Basail");
              Label label3=new Label("Bhuapur");
               Label label4=new Label("Delduar");
                Label label5=new Label("Dhonbari");
                Label label6=new Label("Ghatail");
                Label label7=new Label("Gopalpur");
                Label label8=new Label("Kalihati");
                Label label9=new Label("Madhupur");
                Label label10=new Label("Mirzapur");
                Label label11=new Label("Nagarpur");
                Label label12=new Label("Sakhipur");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                  label10.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                    label11.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                      label12.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                        
                          
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#B0BF1A");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12); 
  
    Scene scene=new Scene(layout,990,700);
 
    stage.setTitle("Details About Tangail District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}


class Dhaka {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Dohar");
             Label label2=new Label("Keraniganj");
              Label label3=new Label("Dhamrai");
               Label label4=new Label("Nawabganj");
                Label label5=new Label("Savar");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#00FF00");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Dhaka District");
    stage.setScene(scene);
    stage.showAndWait();
    
        
    }
}
class Gazipur {
    public static void upazila(){
    Stage stage=new Stage();
    stage.initModality(Modality.APPLICATION_MODAL);
  
    Label l1=new Label();
    l1.setText("Gazipur");
   Text t = new Text (10, 20, "Upozila");
   
    t.setFill(Color.ROYALBLUE);
    t.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
    Label l2=new Label("Kaliakair");
    Label l3=new Label("Kaliganj");
    Label l4=new Label("Kapasia");
    Label l5=new Label("Tongi");
    Label l6=new Label("Sreepur");
  
    l1.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     l2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      l3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       l4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        l5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        l6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        
        
     
    VBox layout=new VBox();
       
    
    
   
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#FF8C00");
  layout.getChildren().addAll(t,l1,l2,l3,l4,l5,l6); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Gazipur District");
    stage.setScene(scene);
    stage.showAndWait();
    
}
}
class Kishoreganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"Upozila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Kuliarchar");
             Label label2=new Label("Hossainpur");
              Label label3=new Label("Pakundia");
               Label label4=new Label("Nawabganj");
                Label label5=new Label("Kishoreganj Sadar");
                Label label6=new Label("Bajitpur");
                Label label7=new Label("Austagram");
                Label label8=new Label("Karimganj");
                Label label9=new Label("Katiadi");
                Label label10=new Label("Tarail");
                Label label11=new Label("Itna");
                Label label12=new Label("Nikli");
                Label label13=new Label("Mithamain");
                 Label label14=new Label("Bhairab");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
          label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
            label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
              label8.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                label9.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                  label10.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                    label11.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                      label12.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                        label13.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
                          label14.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 30));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(5);
    layout.setStyle("-fx-background-color:#a65959");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14); 
  
    Scene scene=new Scene(layout,990,700);
 
    stage.setTitle("Details About Dhaka District");
    stage.setScene(scene);
    stage.showAndWait();
    }
}
class Manikganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Manikganj Sadar");
             Label label2=new Label("Singair");
              Label label3=new Label("Daulatpur");
               Label label4=new Label("Saturia");
                Label label5=new Label("Ghior");
                Label label6=new Label("Shivalaya");
                Label label7=new Label("Harirampur");
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
         label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
          label7.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#00ffbf");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6,label7); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Manikganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
        
    }
}
class Munshiganj {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Munshiganj Sadar");
             Label label2=new Label("Sreenagar");
              Label label3=new Label("Lohajang");
               Label label4=new Label("Sirajdikhan");
                Label label5=new Label("Gazaria");
                Label label6=new Label("Tongibari");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
         label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#D3AF37");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Munshiganj District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}
class Narayanganj {
    public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.BURLYWOOD);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            
            Label label=new Label("Narayanganj Sadar");
             Label label2=new Label("Sonargaon");
              Label label3=new Label("Bandar");
               Label label4=new Label("Araihazar");
                Label label5=new Label("Rupganj");
               
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       
        
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#A4C639");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Narayanganj District");
    stage.setScene(scene);
    stage.showAndWait();
    } 
}
class Narsingdi {
     public static void upozila(){
        Stage stage=new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Text text=new Text(10,20,"upazila");
        text.setFill(Color.MEDIUMORCHID);
            text.setFont(Font.font("Times New Roman",FontWeight.BLACK.BOLD,FontPosture.REGULAR,100));
            Label label=new Label("Narsingdi Sadar");
             Label label2=new Label("Monohardi");
              Label label3=new Label("Belabo");
               Label label4=new Label("Raipura");
                Label label5=new Label("Shibpur");
                Label label6=new Label("Palash");
               
                   label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label2.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
      label3.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
       label4.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
     label5.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
         label6.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 50));
        
        VBox layout=new VBox();
     
    layout.setAlignment(Pos.CENTER);
    layout.setSpacing(9);
    layout.setStyle("-fx-background-color:#89CFF0");
  layout.getChildren().addAll(text,label,label2,label3,label4,label5,label6); 
  
    Scene scene=new Scene(layout,960,650);
 
    stage.setTitle("Details About Narsingdi District");
    stage.setScene(scene);
    stage.showAndWait();
    
     }
}


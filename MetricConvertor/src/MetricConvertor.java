import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MetricConvertor extends Application {
	@Override
	public void start(Stage stage) {
		
		DecimalFormat dFormat = new DecimalFormat("0.0#");
		
		VBox root = new VBox(20);
		HBox box1 = new HBox(10);
		TextField cmField = new TextField();
		Label cmLabel = new Label("Cm");
		VBox convert1 = new VBox();
		Button cmToInchButton = new Button("===>");
		Button inchToCmButton = new Button("<===");
		convert1.getChildren().addAll(cmToInchButton,inchToCmButton);
		TextField inchField = new TextField();
		Label inchLabel = new Label("Inch");
		box1.getChildren().addAll(cmField,cmLabel,convert1,inchField,inchLabel);
		box1.setAlignment(Pos.CENTER);
		
		HBox box2 = new HBox(10);
		TextField kmField = new TextField();
		Label kmLabel = new Label("Km");
		VBox convert2 = new VBox();
		Button kmToMileButton = new Button("===>");	
		Button mileToKmButton = new Button("<===");
		convert2.getChildren().addAll(kmToMileButton,mileToKmButton);
		TextField mileField = new TextField();
		Label mileLabel = new Label("Miles");
		box2.getChildren().addAll(kmField,kmLabel,convert2,mileField,mileLabel);
		box2.setAlignment(Pos.CENTER);
		
		HBox box3 = new HBox(10);
		TextField kgField = new TextField();
		Label kgLabel = new Label("Kg");
		VBox convert3 = new VBox();
		Button kgToLbButton = new Button("===>");
		Button lbToKgButton = new Button("<===");
		convert3.getChildren().addAll(kgToLbButton,lbToKgButton);
		TextField lbField = new TextField();
		Label lbLabel = new Label("Lb");
		box3.getChildren().addAll(kgField,kgLabel,convert3,lbField,lbLabel);
		box3.setAlignment(Pos.CENTER);
		
		root.getChildren().addAll(box1,box2,box3);
		root.setAlignment(Pos.CENTER);
		
		cmToInchButton.setOnAction(e-> {
			String string = new String(cmField.getText());
			double d = Double.parseDouble(string);
			d = d / 2.54;
			string = dFormat.format(d);
			inchField.setText(string);
		}
									);
		inchToCmButton.setOnAction(e-> {
			String string = new String(inchField.getText());
			double d = Double.parseDouble(string);
			d = d * 2.54;
			string = dFormat.format(d);
			cmField.setText(string);
		});
		kmToMileButton.setOnAction( e -> {
			String s = new String(kmField.getText());
			double d = Double.parseDouble(s);
			d = d / 1.609;
			s = dFormat.format(d);
			mileField.setText(s);
			}
			);
		mileToKmButton.setOnAction( e -> {
			String s = new String(mileField.getText());
			double d = Double.parseDouble(s);
			d = d * 1.609;
			s = dFormat.format(d);
			kmField.setText(s);
			}
			);
		kgToLbButton.setOnAction( e -> {
			String s = new String(kgField.getText());
			double d = Double.parseDouble(s);
			d = d * 2.2;
			s = dFormat.format(d);
			lbField.setText(s);
			}
			);
		lbToKgButton.setOnAction( e -> {
			String s = new String(lbField.getText());
			double d = Double.parseDouble(s);
			d = d / 2.2;
			s = dFormat.format(d);
			kgField.setText(s);
			}
			);
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Metric Convertor");
		stage.setWidth(500);
		stage.setHeight(250);
		stage.show();
		
		
		
	}
	
	public void convertCmToInch() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

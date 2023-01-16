package javaFXStart;

import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMian extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		
		// ������ ���̾ƿ� 
		Parent root = null;
		try {
//			root = FXMLLoader.load(getClass().getResource("test.fxml"));
			root = FXMLLoader.load(getClass().getResource("anchorPaneSample.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("AppMain");
			primaryStage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// ���α׷��� ���̾ƿ�
		/**VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("Ȯ��");
		btn.setOnAction(event->Platform.exit());
		
		root.getChildren().add(label);
		root.getChildren().add(btn);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);*/
		
		primaryStage.show();
	}
	// ���� �Ű��� ������
	/**@Override
	public void init() {
		Parameters params = getParameters();
		List<String> list = params.getRaw();
		Map<String, String> map = params.getNamed();
		Stream<String> mapKey = map.keySet().stream();
		Stream<String> mapValue = map.values().stream();
		
		// ��Ʈ���� �̿��� ���ιݺ����� ����ϱ�
		mapKey.forEach(k -> {
			System.out.print(k+":");
			System.out.println(map.get(k));				
		});
	}**/
	
	public static void main(String[] args) {		
		launch(args);
	}
}


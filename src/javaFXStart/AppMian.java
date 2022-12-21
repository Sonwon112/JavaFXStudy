package javaFXStart;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMian extends Application{
	
	public AppMian() {
		System.out.println(Thread.currentThread().getName()+": AppMain() 호출");
	}
	
	@Override
	public void init() throws Exception{
		System.out.println(Thread.currentThread().getName()+": init() 호출");
	}
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println(Thread.currentThread().getName()+": start() 호출");
		primaryStage.show();
	}
	
	@Override
	public void stop() {
		System.out.println(Thread.currentThread().getName()+": stop() 호출");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+": main() 호출");
		launch(args);
	}
}

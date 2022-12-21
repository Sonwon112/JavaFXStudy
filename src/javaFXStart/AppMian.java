package javaFXStart;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;

import javafx.application.Application;
import javafx.stage.Stage;
import jdk.internal.foreign.MappedMemorySegmentImpl;

public class AppMian extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		System.out.println(Thread.currentThread().getName()+": start() 호출");
		primaryStage.show();
	}
	// 실행 매개값 얻어오기
	/**@Override
	public void init() {
		Parameters params = getParameters();
		List<String> list = params.getRaw();
		Map<String, String> map = params.getNamed();
		Stream<String> mapKey = map.keySet().stream();
		Stream<String> mapValue = map.values().stream();
		
		// 스트림을 이용한 내부반복으로 출력하기
		mapKey.forEach(k -> {
			System.out.print(k+":");
			System.out.println(map.get(k));				
		});
	}**/
	
	public static void main(String[] args) {		
		launch(args);
	}
}

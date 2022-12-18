1.반드시 프로젝트를 생성 혹은 실행전에 JDK가 설치된곳에 JavaFX sdk를 설치하고
2.JavaFX sdk 내부의 lib 폴더의 jar 파일을 build Path에 등록 하고
3.Run Configurations에서 VM Argument부분에 
--module-path="C:\Program Files\Java\javafx-sdk-19\lib" --add-modules=javafx.controls,javafx.fxml
삽입 필요
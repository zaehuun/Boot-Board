# Boot-Board
CRUD 학습을 위해 Spring-Boot를 이용하여 게시판 만들기!   

## 환경 - 추가 예정
- Spring-Boot 2.4.0   
- JAVA 11
- Dependencies   
  > Spring Web   
  
  

## 공부 내용
- 포트 번호 설정   
  - 디폴트는 8080번이지만, 스프링부트 설정 파일인 application.properties 파일에 server.port = 8000 하면 8000 포트로 설정
- @Controller?  @RestController?   
  - 두 개 다 컨트롤러를 지정해주기 위한 어노테이션, 차이는 HTTP Response Body가 생성되는 방식.   
  - 하지만, @Controller는 전통적인 Spring MVC의 컨트롤러로 주로 View를 반환하기 위해 사용
  - @RestController는 Spring MVC 컨트롤러에 @ResponseBody가 추가 된 것, 주로 Json 형태로 객체 Data를 반환하는 데에 사용   
  - Spring MVC 컨트롤러에서 View가 아닌 Data를 반환해야 하는 경우 @ResponseBody 어노테이션 사용
  
  
### 으엥?   
- 20/12/12 :아무리 생각해봐도 서비스보다는 DB API를 먼저 구현하는 게 더 효율적일 거 같다. 인터페이스 하나 만들고 내일은 hashmap으로만 작업하고 서비스까지 구현이 끝나면 마이바티스는 jpa를 사용하여 DB api 작업을 해야겠다. 

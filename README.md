# Boot-Board
CRUD 학습을 위해 Spring-Boot를 이용하여 게시판 만들기!   

## 환경 - 추가 예정
- Spring-Boot 2.4.0   
- JAVA 11
- Dependencies   
  > Spring Web  
  > mybatis-spring-boot-starter   
  > mysql-connector-java   
  
  

## 뒤죽박죽 공부 내용
- 포트 번호 설정   
  - 디폴트는 8080번이지만, 스프링부트 설정 파일인 application.properties 파일에 server.port = 8000 하면 8000 포트로 설정
- @Controller?  @RestController?   
  - 두 개 다 컨트롤러를 지정해주기 위한 어노테이션, 차이는 HTTP Response Body가 생성되는 방식.   
  - 하지만, @Controller는 전통적인 Spring MVC의 컨트롤러로 주로 View를 반환하기 위해 사용
  - @RestController는 Spring MVC 컨트롤러에 @ResponseBody가 추가 된 것, 주로 Json 형태로 객체 Data를 반환하는 데에 사용   
  - Spring MVC 컨트롤러에서 View가 아닌 Data를 반환해야 하는 경우 @ResponseBody 어노테이션 사용   
- Array와 ArrayList   
  - Array는 크기 고정, ArrayList는 크기 동적   
  - Array는 primitive, object 담기 가능, ArrayList는 object만 가능   
  - Array는 generics 사용 x, ArrayList는 generics 사용 가능   
     - <>를 generics라 하는데, <> 안에 어떤 타입을 선언하여 해당 ArrayList 등이 사용할 객체의 타입을 지정   
     - 다룰 객체의 타입을 미리 명시하여 형변환 사용 할 필요 사라지며 명시한 데이터 타입만 사용할 수 있는 효과
  - 크기에 대해 Array는 length라는 변수를, ArrayList는 size()라는 메서드 사용
  - 할당을 위해 Array는 assignment 연산자, ArrayList는 add() 메서드 사용
  - ※ 처음 안 사실이지만 ArrayList는 내부에서 처음 설정한 저장 용량이 있다. 설정한 저장 용량 크기를 넘어서 더 많은 객체가 들어오면, 크기를 1.5배로 증가시킨다.   
  ```
  // 기본 저장용량 10으로 리스트 생성
  ArrayList<String> list = new ArrayList<>();
  
  // 저장 용량을 100으로 설정해 ArrayList 생성 
  List<String> list = new ArrayList<>(100);
  ```
- Collection?   
   - 일어나서..   
- mybatis-spring-boot-starter 라이브러리?
   - mybatis, mybatis-spring, mybatis-spring-autoconfigure 이 3가지 라이브러리를 포함한 라이브러리이다.   
   - 보통 데이터베이스와의 물리적 연결을 관리하는 DataSource, 그 위에 sqlSession을 만들고, 그 위에 sqlSessionTemplate을 만들어 설정을 하는데 mybatis-spring-autoconfigure 라이브러리는 이 복잡한 설정을 자동으로 해준다.   
   - 우리는 데이터 베이스의 주소, 아이디, 비밀번호만 지정해주면 끝! (application.properties에 적어주면 된다.)   
  
  
### 으엥?   
- 20/12/12 : 아무리 생각해봐도 서비스보다는 DB API를 먼저 구현하는 게 더 효율적일 거 같다. 인터페이스 하나 만들고 내일은 hashmap으로만 작업하고 서비스까지 구현이 끝나면 마이바티스는 jpa를 사용하여 DB api 작업을 해야겠다.   
- 20/12/13 : 상당히 허설프고 엉망인 코드로 service, controller, repository 구현을 했다. view 페이지가 없어서 값을 직접 넣어줬는데 내일 간단히 회원 가입 페이지와 로그인 페이지를 제작하여 로그인 기능을 작업 해야겠다.   
- 20/12/15 : 마이바티스를 사용하여 데이터 베이스에 값 저장과 조회를 해봤다. 요즘은 마이바티스보다 JPA를 많이 쓴다지만 SQL문 공부 좀 해야 할 거 같아서 그냥 마이바티스로 하는 게 나을 듯 싶다.. XML 파일로 매핑을 하면 더 mapper를 커스터마이징 할 수 있다고는 하니 나중에 복잡한 쿼리문을 작성해야 한다면 사용해봐야겠다..

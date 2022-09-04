package hello.core.singleton;

public class SingletonService {
    // 단점
    /*
    코드 자체가 많이 들어간다
    의존관계상 dip를 위반한다 -> ocp원칙을 위반할 수도 있다
    테스트하기 어렵다
    내부 속성을 변경하거나 초기화하기 어렵다
    private생성자로 자식 클래스를 만들기 어렵다
    결론적으로 유연성이 떨어진다
    */
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){

    }
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}

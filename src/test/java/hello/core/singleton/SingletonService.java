package hello.core.singleton;

public class SingletonService {

    // private static으로 여기서만 생성하고
    private static final SingletonService instance = new SingletonService();

    // public 메소드로 객체 꺼내는것만 가능!
    public static SingletonService getInstance() {
        return instance;
    }

    // private 생성자는 다른 곳에서 new로 생성 불가능
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출출");
    }
}

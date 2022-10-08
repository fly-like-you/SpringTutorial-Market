package hello.core.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {
    private String url;

    public NetworkClient(){
        System.out.println("url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect(){
        System.out.println("connect: " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + " message = " + message);
    }

    public void disconnect(){
        System.out.println("close: "+ url);
    }

    @PostConstruct
    public void init(){
        // 의존관계 주입이 끝나면 호출해주겠다.
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");

    }

    @PreDestroy
    public void close(){
        // 컨테이너 끝나기 전에 실행
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {
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
        System.out.println("call; = " + url + "message = " + message);
    }

    public void disconnect(){
        System.out.println("close: "+ url);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 의존관계 주입이 끝나면 호출해주겠다.
        connect();
        call("초기화 연결 메시지");

    }

    @Override
    public void destroy() throws Exception {
        // 컨테이너 끝나기 전에 실행
        disconnect();
    }
}

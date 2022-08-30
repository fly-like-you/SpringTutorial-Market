package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.boot.web.server.GracefulShutdownCallback;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
        Member member = new Member(1234L, "memberA", Grade.VIP);
        memberService.join(member);

        Order ge = orderService.createOrder(member.getId(), "ge", 10000);
        System.out.println("ge = " + ge);
        System.out.println("ge.calculatePrice() = " + ge.calculatePrice());


    }
}

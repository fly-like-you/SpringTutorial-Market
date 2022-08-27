package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.boot.web.server.GracefulShutdownCallback;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        Member member = new Member(1234L, "memberA", Grade.VIP);
        memberService.join(member);

        Order ge = orderService.createOrder(member.getId(), "ge", 10000);
        System.out.println("ge = " + ge);
        System.out.println("ge.calculatePrice() = " + ge.calculatePrice());


    }
}

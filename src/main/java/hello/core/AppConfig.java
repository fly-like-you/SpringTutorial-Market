package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    // 구현 객체를 생성하고 연결하는 책임을 가지는 클래스
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    } //memberRepository의 역할이 잘 보이지 않는다.

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
    }
    // 위의 코드는 역할에 따른 구현이 잘 보이지 않는다.
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}

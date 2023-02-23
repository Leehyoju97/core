package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {

    public static void main(String[] args) {
        // AppConfig.class에 설정한 것을 bean에 등록한다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // bean에 등록시 AppConfig에 있는 메소드명 그대로 등록된다. 메소드명인 memberService를 사용하고 MemberService.class는 타입을 말한다.
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}

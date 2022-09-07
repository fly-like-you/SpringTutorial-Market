package hello.core.member;

public class MemberServiceImpl implements MemberService {


    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    // 문제1 MemberRepository는 의존 하지만 MemoryMemberRepository는 구현체이기 때문에 DIP위배
    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}

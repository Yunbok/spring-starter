package yunbok.mvcspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yunbok.mvcspring.domain.Member;
import yunbok.mvcspring.repository.MemberRepository;
import yunbok.mvcspring.repository.MemoryMemberRepository;
import yunbok.mvcspring.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}

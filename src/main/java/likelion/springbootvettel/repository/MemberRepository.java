package likelion.springbootvettel.repository;

import likelion.springbootvettel.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

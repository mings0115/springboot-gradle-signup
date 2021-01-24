package com.spring.gradle.repository;

import com.spring.gradle.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByusername(String username); //username 회원 검색
}

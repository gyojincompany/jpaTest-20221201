package com.gyojincompany.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyojincompany.home.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, String>{//<엔티티 클래스 타입, 기본키 타입>

}

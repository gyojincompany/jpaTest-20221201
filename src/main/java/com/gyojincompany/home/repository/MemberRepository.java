package com.gyojincompany.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyojincompany.home.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long>{//<엔티티 클래스 타입, 기본키 타입>
	
	public List<MemberDto> findByName(String memberName);
	
}

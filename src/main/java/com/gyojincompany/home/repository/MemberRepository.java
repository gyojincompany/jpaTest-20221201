package com.gyojincompany.home.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyojincompany.home.dto.MemberDto;

public interface MemberRepository extends JpaRepository<MemberDto, Long>{//<엔티티 클래스 타입, 기본키 타입>
	
	public List<MemberDto> findByName(String memberName);
	public List<MemberDto> findByNameOrderByHakbunDesc(String memberName);
	public List<MemberDto> findAllByOrderByHakbunDesc();
	public List<MemberDto> findByNameAndGrade(String memberName, int grade);
	public List<MemberDto> findByAgeLessThan(int age);//미만 <
	public List<MemberDto> findByAgeLessThanEqual(int age);//이하 =<
	public List<MemberDto> findByAgeGreaterThan(int age);//초과 >
	public List<MemberDto> findByAgeGreaterThanEqual(int age);//이상 >=
	public List<MemberDto> findByAgeBetween(int startAge, int endAge);// =< x =<
	public List<MemberDto> findByNameStartingWith(String namekey);//특정단어로 시작
	public List<MemberDto> findByNameEndingWith(String namekey);//특정단어로 끝남
	public List<MemberDto> findByNameContaining(String namekey);//특정단어 포함
	
}

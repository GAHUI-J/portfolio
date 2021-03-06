package com.kh.portfolio.lecture.svc;

import java.util.List;
import java.util.Map;

import com.kh.portfolio.lecture.vo.ChapterVO;
import com.kh.portfolio.lecture.vo.LectureVO;
import com.kh.portfolio.lecture.vo.QnaVO;
import com.kh.portfolio.lecture.vo.ReviewVO;
import com.kh.portfolio.video.vo.VideoVO;

public interface LectureSVC {
	
	/**
	 * 신규강의(메인)
	 * @return
	 */
	public List<LectureVO> getOnNewLecture();
	/**
	 * 인기강의(메인)
	 * @return
	 */
	public List<LectureVO> getOnBestLecture();
	/**
	 * 추천강의(메인)
	 * @return
	 */
	public List<LectureVO> getOnRecommendLecture();
	/**
	 * 리뷰작성(상세페이지)
	 * @param reviewVO
	 * @return
	 */
	public int writeReview(ReviewVO reviewVO);
	
	
	/**
	 * 최신리뷰 리스트
	 * @return
	 */
	List<ReviewVO> newReviewList();
	
	
	
	
	/**
	 * qna 작성(상세페이지)
	 * @param lecture_title
	 * @return
	 */
	List<QnaVO> qnaList(String lecture_title);
	
	/**
	 * 강의개별조회(상세페이지)
	 * @param lecture_title
	 * @return
	 */
	LectureVO listOneLecture(String lecture_title);
	
	//온라인강의
	List<LectureVO> getOnLecture();
		
	//오프라인강의
	List<LectureVO> getOffLecture();
	
	
	/**
	 * 챕터리스트
	 * @return
	 */
	List<ChapterVO> chapterList(String lecture_title);
	
	
	/**
	 * 커리큘럼(챕터에 따른 정렬)
	 * @param lecture_tilte
	 * @return
	 */
	List<VideoVO> curriculum(String lecture_title);
	
	
	
	/**
	 * 수강생인원
	 * @param lecture_title
	 * @return
	 */
	int studentCnt(String lecture_title);
	
	
	/**
	 * 리뷰갯수
	 * @param lecture_title
	 * @return
	 */
	int reviewCnt(String lecture_title);

	/**
	 * 강의 보여주기
	 * @param lectureType
	 * @param selectType
	 * @return
	 */
	List<LectureVO> lectureList(String lectureType, String selectType);
	/**
	 * 강의 전체 보여주기
	 * @param selectType
	 * @return
	 */
	List<LectureVO> alllectureList(String selectType);
	

	
}

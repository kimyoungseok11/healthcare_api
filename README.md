# 프로젝트 개요

기존 사내 JSP 기반 시스템을 **React + Spring Boot REST API 구조로 리뉴얼**한 프로젝트입니다.  
기존에는 View와 로직이 뒤섞여 유지보수가 어려웠으나,  
**프론트엔드/백엔드 분리 및 RESTful API 기반 통신 구조로 개선**하여 개발 효율성과 확장성을 높였습니다.

- **기간:** 2025.09 ~ 2025.11  
- **역할:** 단독 개발 (전체 구조 설계, API 개발, React 마이그레이션)
- **목표:** JSP 기반 페이지를 React SPA로 전환, 백엔드를 REST API 형태로 재구성

### Before (기존 JSP 구조)
- JSP + JSTL로 UI 구성
- Controller가 View와 Model을 동시에 반환
- 페이지 단위로 서버 렌더링
- 자바스크립트 로직이 JSP 내부에 혼재

### After (개선 구조)
- React 기반 SPA로 전환 (CSR 구조)
- Spring Boot로 REST API 제공 (`/healthcare/**`)
- Axios로 비동기 통신 처리

### Frontend
- 프로젝트 url : https://github.com/kimyoungseok11/react/tree/main/healthcare

### Backend
- Spring Boot 2.5.14
- java 1.8
- Gradle

### Infra & Tools
- sqlite

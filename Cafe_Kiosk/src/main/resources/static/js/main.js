new Swiper('.promotion .swiper-container', {
    // direction: 'horizontal', // 수평 슬라이드
    autoplay: { // 자동 재생 여부
        delay: 5000 // 5초마다 슬라이드 바뀜
    },
    loop: true, // 반복 재생 여부
    slidesPerView: 1, // 한 번에 보여줄 슬라이드 개수
    spaceBetween: 10, // 슬라이드 사이 여백
    centeredSlides: true, // 1번 슬라이드가 가운데 보이기
    pagination: { // 페이지 번호 사용 여부
        el: '.promotion .swiper-pagination', // 페이지 번호 요소 선택자
        clickable: true // 사용자의 페이지 번호 요소 제어 가능 여부
    },
    navigation: { // 슬라이드 이전/다음 버튼 사용 여부
        prevEl: '.promotion .swiper-prev', // 이전 버튼 선택자
        nextEl: '.promotion .swiper-next' // 다음 버튼 선택자
    }
});

function offView() {
    console.log("클릭/하이드");
    document.getElementById('swiper-container').style.display = "none";
}

function clickhere() {
    console.log("클릭 매장");
    document.getElementById('here').style.display = "none";
    document.getElementById('togo').style.display = "none";
    
}

function clicktogo () {
    console.log("클릭 포장");
    document.getElementById('here').style.display = "none";
    document.getElementById('togo').style.display = "none"
}


function moveCoffee() {
    window.location.href = "coffee.html"
  }
  
  function moveBeverage() {
    window.location.href = "beverage.html"
  }
  
  function moveDessert() {
    window.location.href = "dessert.html"
  }

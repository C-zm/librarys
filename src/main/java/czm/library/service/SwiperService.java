package czm.library.service;

import czm.library.pojo.Swiper;

import java.util.List;

public interface SwiperService {
    int addSwiper(Swiper swiper);
    List<Swiper> showSwiper();
    int deleteSwiper(Integer swiperid);
    int updateSwiper(Swiper swiper);
    Swiper getSwiperBySwiperid(Integer swiperid);
    List<Swiper> getSwiperByBid(Integer bid);
}

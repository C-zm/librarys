package czm.library.mapper;

import czm.library.pojo.Swiper;

import java.util.List;

public interface SwiperMapper {

    List<Swiper> selectAllSwiper();

    int insert(Swiper wiper);

    Swiper selectSwiperBySwiperid(Integer swiperid);

    int updateSwiperBySwiperid(Swiper wiper);

    int deleteSwiperBySwiperid(Integer swiperid);

    List<Swiper> selectSwiperByBid(Integer bid);
}
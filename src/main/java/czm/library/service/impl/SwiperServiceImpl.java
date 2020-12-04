package czm.library.service.impl;

import czm.library.mapper.SwiperMapper;
import czm.library.pojo.Swiper;
import czm.library.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class SwiperServiceImpl implements SwiperService {

    @Autowired
    private SwiperMapper swiperMapper;

    public int addSwiper(Swiper swiper){
        return swiperMapper.insert(swiper);
    }

    @Override
    public List<Swiper> showSwiper() {
        return swiperMapper.selectAllSwiper();
    }

    @Override
    public Swiper getSwiperBySwiperid(Integer id) {
        System.out.println(swiperMapper.selectSwiperBySwiperid(id));
        return swiperMapper.selectSwiperBySwiperid(id);
    }

    @Override
    public List<Swiper> getSwiperByBid(Integer bid) {
        return swiperMapper.selectSwiperByBid(bid);
    }

    @Override
    public int deleteSwiper(Integer id) {
        return swiperMapper.deleteSwiperBySwiperid(id);
    }


    @Override
    public int updateSwiper(Swiper swiper) {
        return swiperMapper.updateSwiperBySwiperid(swiper);
    }
}

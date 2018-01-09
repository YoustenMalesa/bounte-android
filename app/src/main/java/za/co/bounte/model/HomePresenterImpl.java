package za.co.bounte.model;

import za.co.bounte.repo.HomeRepository;
import za.co.bounte.repo.HomeRepositoryImpl;
import za.co.bounte.view.HomeView;

/**
 * Created by malesay on 2018/01/09.
 */

public class HomePresenterImpl implements HomePresenter {

    private HomeView homeView;
    private HomeRepository homeRepository;

    public HomePresenterImpl(HomeView homeView) {
        this.homeView = homeView;
        homeRepository = new HomeRepositoryImpl();
    }

    @Override
    public void showMessage() {
        String displayMessage = homeRepository.dummyService();
        homeView.showMessage(displayMessage);
    }
}

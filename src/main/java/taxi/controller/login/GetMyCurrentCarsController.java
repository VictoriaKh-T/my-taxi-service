package taxi.controller.login;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import taxi.lib.Injector;
import taxi.model.Car;
import taxi.service.CarService;

public class GetMyCurrentCarsController extends HttpServlet {
    private static final Injector injector
            = Injector.getInstance("taxi");
    private final CarService carService
            = (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        Long driverID = (Long) session.getAttribute("driver_id");
        List<Car> allCarsByDriver = carService.getAllByDriver(driverID);
        session.setAttribute("cars", allCarsByDriver);
        req.getRequestDispatcher("/WEB-INF/views/cars/all.jsp")
                .forward(req, resp);
    }
}

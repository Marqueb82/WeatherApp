package co.grandcircus.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.WeatherAPI.model.Currently;
import co.grandcircus.WeatherAPI.model.Daily;
import co.grandcircus.WeatherAPI.model.Hourly;
import co.grandcircus.WeatherAPI.model.Minutely;

@Controller
public class WeatherController {

	@Autowired
	private APIService apiService;

	@RequestMapping("/")
	public ModelAndView weather() {

		ModelAndView mv = new ModelAndView("weatherpage");
		Currently currently = apiService.getCurrently();
		Hourly hourly = apiService.getHour();
		Minutely minutely = apiService.getMinute();
		Daily daily = apiService.getDaily();
		System.out.println(currently.getTemperature());
		mv.addObject("currently", currently);
		mv.addObject("minutely", minutely);
		mv.addObject("hourly", hourly);
		mv.addObject("daily", daily);

		return mv;

	}

}

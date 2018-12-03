package co.grandcircus.WeatherAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.WeatherAPI.model.Currently;
import co.grandcircus.WeatherAPI.model.Daily;
import co.grandcircus.WeatherAPI.model.Hourly;
import co.grandcircus.WeatherAPI.model.Minutely;
import co.grandcircus.WeatherAPI.model.WeatherResponse;

@Component
public class APIService {

	@Value("${apikey}")
	private String apiKey;

	private RestTemplate restTemplateWithUserAgent;
	String url = "https://api.darksky.net/forecast/{hidden}/42.3314,-83.0458";

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public Currently getCurrently() {
		WeatherResponse response = restTemplateWithUserAgent.getForObject(url, WeatherResponse.class);
		return response.getCurrently();
	}

	public Minutely getMinute() {
		WeatherResponse response = restTemplateWithUserAgent.getForObject(url, WeatherResponse.class);
		return response.getMinutely();
	}

	public Hourly getHour() {
		WeatherResponse response = restTemplateWithUserAgent.getForObject(url, WeatherResponse.class);
		return response.getHourly();
	}

	public Daily getDaily() {
		WeatherResponse response = restTemplateWithUserAgent.getForObject(url, WeatherResponse.class);
		return response.getDaily();
	}

}

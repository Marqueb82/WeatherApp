package co.grandcircus.WeatherAPI.model;

public class WeatherResponse {

	private Double latitude;
	private Double longitude;
	private String timezone;
	private Currently currently;
	private Minutely minutely;
	private Hourly hourly;
	private Daily daily;

	public Daily getDaily() {
		return daily;
	}

	public void setDaily(Daily daily) {
		this.daily = daily;
	}

	public Minutely getMinutely() {
		return minutely;
	}

	public void setMinutely(Minutely minutely) {
		this.minutely = minutely;
	}

	public Hourly getHourly() {
		return hourly;
	}

	public void setHourly(Hourly hourly) {
		this.hourly = hourly;
	}

	public Currently getCurrently() {
		return currently;
	}

	public void setCurrently(Currently currently) {
		this.currently = currently;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}

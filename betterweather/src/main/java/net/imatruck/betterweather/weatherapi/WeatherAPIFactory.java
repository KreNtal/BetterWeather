/*
 * Copyright 2013-2014 Marc-André Dufresne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.imatruck.betterweather.weatherapi;

import net.imatruck.betterweather.BetterWeatherExtension;

public class WeatherAPIFactory {

    public static IWeatherAPI getWeatherAPIFromSetting(String apiSetting){
        if(apiSetting.equals(BetterWeatherExtension.YAHOO_WEATHER_API)){
            return new YahooWeatherAPIClient();
        }
        else if (apiSetting.equals(BetterWeatherExtension.OPENWEATHERMAP_WEATHER_API)) {
            return new OpenWeatherMapWeatherAPIClient();
        }

        return new YahooWeatherAPIClient();
    }

}
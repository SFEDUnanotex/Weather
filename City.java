import android.app.Activity;
import android.content.SharedPreferences;

public class City {

    SharedPreferences prefs;

    public City(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Если пользователь не выбрал город, на умолчанию
    // будем показывать погоду на Сидней
    String getCity(){
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
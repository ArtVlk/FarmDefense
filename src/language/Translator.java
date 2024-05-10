package language;

import java.io.InputStream;
import org.json.JSONObject;

public class Translator {
    InputStream is = Translator.class.getClassLoader().getResourceAsStream("package.json");
    private static String current_language = "en";
    private JSONObject languageObject;

    public Translator() {
        try {
            InputStream is = Translator.class.getClassLoader().getResourceAsStream("package.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            String jsonString = new String(buffer);
            this.languageObject = new JSONObject(jsonString).getJSONObject("language");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setLanguage(String lag) {
        current_language = lag;
    }

    private String getCurrentLanguageTranslation(String key) {
        return languageObject.getJSONObject(key).getString(current_language);
    }

    public String getMenu() {return getCurrentLanguageTranslation("MenuPlay");}
    public String getReplay() {return getCurrentLanguageTranslation("ReplayPlay");}
    public String getGameOver() {return getCurrentLanguageTranslation("GameOverPlay");}
    public String getPlay() {return getCurrentLanguageTranslation("PlayPlay");}

    public String getEdit() {return getCurrentLanguageTranslation("EditPlay");}
    public String getSettings() {return getCurrentLanguageTranslation("SettingsPlay");}
    public String getQuit() {return getCurrentLanguageTranslation("QuitPlay");}
    public String getYouWin() {return getCurrentLanguageTranslation("YouWinPlay");}
    public String getDog() {return getCurrentLanguageTranslation("DogPlay");}
    public String getLama() {return getCurrentLanguageTranslation("LamaPlay");}
    public String getCow() {return getCurrentLanguageTranslation("CowPlay");}
    public String getLanguage() {return getCurrentLanguageTranslation("LanguagePlay");}
    public String getRu() {return  getCurrentLanguageTranslation("RuPlay");}
    public String getEn() {return getCurrentLanguageTranslation("EnPlay");}
    public String getSave() {return  getCurrentLanguageTranslation("SavePlay");}
    public String getClear() {return  getCurrentLanguageTranslation("ClearAllPlay");}
    public String getPause() {return  getCurrentLanguageTranslation("PausePlay");}
    public String getUnpause() { return getCurrentLanguageTranslation("UnpausePlay"); }
    public String getSell() { return getCurrentLanguageTranslation("SellPlay"); }
    public String getSellFor() { return getCurrentLanguageTranslation("SellForPlay"); }
    public String getUpgrade() { return getCurrentLanguageTranslation("UpgradePlay"); }
    public String getUpgradeFor() { return getCurrentLanguageTranslation("UpgradeForPlay"); }
    public String getGamePause() { return getCurrentLanguageTranslation("GamePausePlay"); }
    public String getCost() { return getCurrentLanguageTranslation("CostPlay"); }
    public String getLives() { return getCurrentLanguageTranslation("LivesPlay"); }
    public String getTooExpensive() { return getCurrentLanguageTranslation("TooExpensivePlay"); }
    public String getGold() { return getCurrentLanguageTranslation("GoldPlay"); }
    public String getWave() { return getCurrentLanguageTranslation("WavePlay"); }
    public String getEnemiesLeft() { return getCurrentLanguageTranslation("EnemiesLeftPlay"); }
    public String getTime() { return getCurrentLanguageTranslation("TimePlay"); }
    public String getTier() { return getCurrentLanguageTranslation("TierPlay"); }


}

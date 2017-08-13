package Customization;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/**
 * Created by Bardur on 13/02/2017.
 */

public class FontLoader {

    private static HashMap<String, Typeface> fontLoader = new HashMap<>();

    // load a typface from Assets folder
    public static Typeface getTypeface(String fontname, Context context) {
        Typeface typeface = fontLoader.get(fontname);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontname);
            } catch (Exception e) {
                return null;
            }

            fontLoader.put(fontname, typeface);
        }

        return typeface;
    }

}

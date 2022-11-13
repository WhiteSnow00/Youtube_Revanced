import java.util.Locale;
import android.text.TextUtils;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlq extends acvg
{
    private final SharedPreferences b;
    
    public jlq(final SharedPreferences b) {
        b.getClass();
        this.b = b;
    }
    
    public final String a() {
        final String string = this.b.getString("country", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }
}

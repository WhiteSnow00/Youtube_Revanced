import java.util.Locale;
import android.text.TextUtils;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkp extends adbp
{
    private final SharedPreferences b;
    
    public jkp(final SharedPreferences b) {
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final String a() {
        final String string = this.b.getString("country", "");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }
}

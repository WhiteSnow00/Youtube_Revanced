import android.os.LocaleList;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

final class ajp
{
    static LocaleList a(final Locale... array) {
        return new LocaleList(array);
    }
    
    static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }
    
    static LocaleList c() {
        return LocaleList.getDefault();
    }
}

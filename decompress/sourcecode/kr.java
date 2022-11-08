import android.content.res.Resources$Theme;
import android.widget.ThemedSpinnerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public class kr
{
    static void a(final ThemedSpinnerAdapter themedSpinnerAdapter, final Resources$Theme dropDownViewTheme) {
        if (!ako.b((Object)themedSpinnerAdapter.getDropDownViewTheme(), (Object)dropDownViewTheme)) {
            themedSpinnerAdapter.setDropDownViewTheme(dropDownViewTheme);
        }
    }
}

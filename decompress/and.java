import android.view.ViewConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class and
{
    static int a(final ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }
    
    public static boolean b(final ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}

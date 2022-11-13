import android.view.accessibility.AccessibilityManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsi
{
    private static volatile boolean a;
    
    public static void a() {
        synchronized (dsi.class) {
            dsi.a = false;
        }
    }
    
    public static boolean b(final Context context) {
        return c((AccessibilityManager)context.getSystemService("accessibility"));
    }
    
    public static boolean c(final AccessibilityManager accessibilityManager) {
        if (!Boolean.getBoolean("is_accessibility_enabled")) {
            if (accessibilityManager != null) {
                if (accessibilityManager.isEnabled()) {
                    if (accessibilityManager.isTouchExplorationEnabled()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}

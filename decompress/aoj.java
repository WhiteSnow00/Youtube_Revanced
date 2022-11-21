import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoj
{
    public static boolean a(final AccessibilityManager accessibilityManager, final aok aok) {
        return accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new aol(aok));
    }
    
    public static boolean b(final AccessibilityManager accessibilityManager, final aok aok) {
        return accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new aol(aok));
    }
}

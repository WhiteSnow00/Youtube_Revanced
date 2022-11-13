import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoi
{
    public static boolean a(final AccessibilityManager accessibilityManager, final aoj aoj) {
        return accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new aok(aoj));
    }
    
    public static boolean b(final AccessibilityManager accessibilityManager, final aoj aoj) {
        return accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager$TouchExplorationStateChangeListener)new aok(aoj));
    }
}

import android.view.accessibility.AccessibilityEvent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aog
{
    public static int a(final AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
    
    public static void b(final AccessibilityEvent accessibilityEvent, final int contentChangeTypes) {
        accessibilityEvent.setContentChangeTypes(contentChangeTypes);
    }
}

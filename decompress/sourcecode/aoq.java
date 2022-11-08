import android.view.accessibility.AccessibilityRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoq
{
    static int a(final AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }
    
    static int b(final AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }
    
    public static void c(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
        accessibilityRecord.setMaxScrollX(maxScrollX);
    }
    
    public static void d(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
        accessibilityRecord.setMaxScrollY(maxScrollY);
    }
}

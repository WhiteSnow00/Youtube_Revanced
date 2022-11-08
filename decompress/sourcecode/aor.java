import android.view.View;
import android.view.accessibility.AccessibilityRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aor
{
    public static void a(final AccessibilityRecord accessibilityRecord, final View view, final int n) {
        accessibilityRecord.setSource(view, n);
    }
}

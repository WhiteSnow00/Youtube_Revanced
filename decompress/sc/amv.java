import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.view.View$AccessibilityDelegate;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class amv
{
    static View$AccessibilityDelegate a(final View view) {
        return view.getAccessibilityDelegate();
    }
    
    static List b(final View view) {
        return view.getSystemGestureExclusionRects();
    }
    
    static void c(final View view, final Context context, final int[] array, final AttributeSet set, final TypedArray typedArray, final int n, final int n2) {
        view.saveAttributeDataForStyleable(context, array, set, typedArray, n, n2);
    }
    
    static void d(final View view, final List systemGestureExclusionRects) {
        view.setSystemGestureExclusionRects(systemGestureExclusionRects);
    }
}

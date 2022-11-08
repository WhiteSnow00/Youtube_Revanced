import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apl extends akv
{
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.b() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        aoq.c((AccessibilityRecord)accessibilityEvent, nestedScrollView.getScrollX());
        aoq.d((AccessibilityRecord)accessibilityEvent, nestedScrollView.b());
    }
    
    public final void c(final View view, final aol aol) {
        super.c(view, aol);
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        aol.q((CharSequence)ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            final int b = nestedScrollView.b();
            if (b > 0) {
                aol.D(true);
                if (nestedScrollView.getScrollY() > 0) {
                    aol.h(aok.e);
                    aol.h(aok.i);
                }
                if (nestedScrollView.getScrollY() < b) {
                    aol.h(aok.d);
                    aol.h(aok.j);
                }
            }
        }
    }
    
    public final boolean i(final View view, int n, final Bundle bundle) {
        if (super.i(view, n, bundle)) {
            return true;
        }
        final NestedScrollView nestedScrollView = (NestedScrollView)view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        final int height = nestedScrollView.getHeight();
        final Rect rect = new Rect();
        int height2 = height;
        if (nestedScrollView.getMatrix().isIdentity()) {
            height2 = height;
            if (nestedScrollView.getGlobalVisibleRect(rect)) {
                height2 = rect.height();
            }
        }
        if (n != 4096) {
            if (n != 8192 && n != 16908344) {
                if (n != 16908346) {
                    return false;
                }
            }
            else {
                n = nestedScrollView.getPaddingBottom();
                n = Math.max(nestedScrollView.getScrollY() - (height2 - n - nestedScrollView.getPaddingTop()), 0);
                if (n != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(n);
                    return true;
                }
                return false;
            }
        }
        n = nestedScrollView.getPaddingBottom();
        n = Math.min(nestedScrollView.getScrollY() + (height2 - n - nestedScrollView.getPaddingTop()), nestedScrollView.b());
        if (n != nestedScrollView.getScrollY()) {
            nestedScrollView.v(n);
            return true;
        }
        return false;
    }
}

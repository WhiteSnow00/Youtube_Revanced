import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckx extends akx
{
    final ViewPager a;
    
    public ckx(final ViewPager a) {
        this.a = a;
    }
    
    private final boolean j() {
        final cks b = this.a.b;
        return b != null && b.j() > 1;
    }
    
    public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(this.j());
        if (accessibilityEvent.getEventType() == 4096) {
            final cks b = this.a.b;
            if (b != null) {
                accessibilityEvent.setItemCount(b.j());
                accessibilityEvent.setFromIndex(this.a.c);
                accessibilityEvent.setToIndex(this.a.c);
            }
        }
    }
    
    public final void c(final View view, final aon aon) {
        super.c(view, aon);
        aon.r((CharSequence)"androidx.viewpager.widget.ViewPager");
        aon.E(this.j());
        if (this.a.canScrollHorizontally(1)) {
            aon.h(4096);
        }
        if (this.a.canScrollHorizontally(-1)) {
            aon.h(8192);
        }
    }
    
    public final boolean i(final View view, final int n, final Bundle bundle) {
        if (super.i(view, n, bundle)) {
            return true;
        }
        if (n != 4096) {
            if (n != 8192) {
                return false;
            }
            if (this.a.canScrollHorizontally(-1)) {
                final ViewPager a = this.a;
                a.l(a.c - 1);
                return true;
            }
            return false;
        }
        else {
            if (this.a.canScrollHorizontally(1)) {
                final ViewPager a2 = this.a;
                a2.l(a2.c + 1);
                return true;
            }
            return false;
        }
    }
}

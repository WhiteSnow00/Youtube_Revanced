import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import android.graphics.Rect;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adul implements aduj
{
    final Object a;
    private final int b;
    
    public adul(final adum a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adul(final jym a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final AppBarLayout appBarLayout, int intValue) {
        if (this.b != 0) {
            final jym jym = (jym)this.a;
            jym.p = intValue;
            if (jym.r != null && jym.q == null) {
                final Rect rect = new Rect();
                ((jym)this.a).r.getDrawingRect(rect);
                appBarLayout.offsetRectIntoDescendantCoords(((jym)this.a).r, rect);
                ((jym)this.a).q = rect.top + ((jym)this.a).c();
                ((jym)this.a).r = null;
            }
            if (intValue == 0) {
                final jym jym2 = (jym)this.a;
                if (jym2.q != null) {
                    final ael ael = (ael)jym2.b.getLayoutParams();
                    Object o = null;
                    Label_0197: {
                        if (ael != null) {
                            final aej a = ael.a;
                            if (a instanceof AppBarLayout$Behavior) {
                                o = a;
                                break Label_0197;
                            }
                        }
                        o = null;
                    }
                    if (o != null) {
                        final Integer q = ((jym)this.a).q;
                        q.getClass();
                        intValue = q;
                        ((AppBarLayout$BaseBehavior)o).K(intValue);
                        ((jym)this.a).p = intValue;
                        appBarLayout.requestLayout();
                    }
                }
            }
            ((jym)this.a).q = null;
            return;
        }
        final adum adum = (adum)this.a;
        adum.h = intValue;
        final aoc i = adum.i;
        int d;
        if (i != null) {
            d = i.d();
        }
        else {
            d = 0;
        }
        for (int childCount = ((adum)this.a).getChildCount(), j = 0; j < childCount; ++j) {
            final View child = ((adum)this.a).getChildAt(j);
            final aduk aduk = (aduk)child.getLayoutParams();
            final adus h = adum.h(child);
            final int a2 = aduk.a;
            if (a2 != 1) {
                if (a2 == 2) {
                    h.c(Math.round(-intValue * aduk.b));
                }
            }
            else {
                h.c(aaa.a(-intValue, 0, ((adum)this.a).f(child)));
            }
        }
        ((adum)this.a).n();
        final Object a3 = this.a;
        if (((adum)a3).g != null && d > 0) {
            anc.H((View)a3);
        }
        final int height = ((adum)this.a).getHeight();
        final int g = anc.g((View)this.a);
        final int g2 = ((adum)this.a).g();
        final adxd d2 = ((adum)this.a).d;
        final int n = height - g - d;
        final float n2 = (float)(height - g2);
        final float n3 = (float)n;
        d2.c = Math.min(1.0f, n2 / n3);
        d2.d = d2.a();
        final adum adum2 = (adum)this.a;
        final adxd d3 = adum2.d;
        d3.e = adum2.h + n;
        d3.r(Math.abs(intValue) / n3);
    }
}

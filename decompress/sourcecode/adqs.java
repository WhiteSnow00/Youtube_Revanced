import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import android.graphics.Rect;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adqs implements adqq
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public adqs(final adqt a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adqs(final jxc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final AppBarLayout appBarLayout, int intValue) {
        if (this.b != 0) {
            final jxc jxc = (jxc)this.a;
            jxc.p = intValue;
            if (jxc.r != null && jxc.q == null) {
                final Rect rect = new Rect();
                ((jxc)this.a).r.getDrawingRect(rect);
                appBarLayout.offsetRectIntoDescendantCoords(((jxc)this.a).r, rect);
                ((jxc)this.a).q = rect.top + ((jxc)this.a).c();
                ((jxc)this.a).r = null;
            }
            if (intValue == 0) {
                final jxc jxc2 = (jxc)this.a;
                if (jxc2.q != null) {
                    final aej aej = (aej)jxc2.b.getLayoutParams();
                    Object o = null;
                    Label_0178: {
                        if (aej != null) {
                            final aeh a = aej.a;
                            if (a instanceof AppBarLayout$Behavior) {
                                o = a;
                                break Label_0178;
                            }
                        }
                        o = null;
                    }
                    if (o != null) {
                        final Integer q = ((jxc)this.a).q;
                        q.getClass();
                        intValue = q;
                        ((AppBarLayout$BaseBehavior)o).J(intValue);
                        ((jxc)this.a).p = intValue;
                        appBarLayout.requestLayout();
                    }
                }
            }
            ((jxc)this.a).q = null;
            return;
        }
        final adqt adqt = (adqt)this.a;
        adqt.h = intValue;
        final aoa i = adqt.i;
        int d;
        if (i != null) {
            d = i.d();
        }
        else {
            d = 0;
        }
        for (int childCount = ((adqt)this.a).getChildCount(), j = 0; j < childCount; ++j) {
            final View child = ((adqt)this.a).getChildAt(j);
            final adqr adqr = (adqr)child.getLayoutParams();
            final adqz h = adqt.h(child);
            final int a2 = adqr.a;
            if (a2 != 1) {
                if (a2 == 2) {
                    h.c(Math.round(-intValue * adqr.b));
                }
            }
            else {
                h.c(aeh.t(-intValue, 0, ((adqt)this.a).f(child)));
            }
        }
        ((adqt)this.a).n();
        final Object a3 = this.a;
        if (((adqt)a3).g != null && d > 0) {
            ana.H((View)a3);
        }
        final int height = ((adqt)this.a).getHeight();
        final int n = height - ana.g((View)this.a) - d;
        final int g = ((adqt)this.a).g();
        final adtk d2 = ((adqt)this.a).d;
        final float n2 = (float)n;
        d2.c = Math.min(1.0f, (height - g) / n2);
        d2.d = d2.a();
        final adqt adqt2 = (adqt)this.a;
        final adtk d3 = adqt2.d;
        d3.e = adqt2.h + n;
        d3.r(Math.abs(intValue) / n2);
    }
}

import android.util.DisplayMetrics;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.GridLayout$LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ezz implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ Object a;
    final /* synthetic */ View b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;
    
    public ezz(final acyo a, final accz c, final View b, final int d, final byte[] array) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public ezz(final aiso a, final TextView b, final toy c, final int d) {
        this.d = d;
        this.a = a;
        this.b = (View)b;
        this.c = c;
    }
    
    public ezz(final eck b, final aukm c, final egw a, final int d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.b = (View)b;
        this.c = c;
        this.a = a;
    }
    
    public ezz(final kdu c, final ViewGroup b, final aith a, final int d) {
        this.d = d;
        this.c = c;
        this.b = (View)b;
        this.a = a;
    }
    
    public ezz(final tdg c, final accz a, final View b, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean onPreDraw() {
        final int d = this.d;
        if (d != 0) {
            if (d == 1) {
                ((eck)this.b).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                final int a = ((aukm)this.c).a;
                if (a == -1) {
                    if (this.a == egw.c) {
                        ((eck)this.b).fullScroll(66);
                    }
                    ((aukm)this.c).a = ((eck)this.b).getScrollX();
                }
                else {
                    ((eck)this.b).setScrollX(a);
                }
                return true;
            }
            if (d == 2) {
                ((ViewGroup)this.b).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                final Resources resources = ((kdu)this.c).o.getResources();
                final Context o = ((kdu)this.c).o;
                alvn alvn;
                if ((alvn = ((aith)this.a).p) == null) {
                    alvn = alvn.a;
                }
                final aexq h = kgk.h(o, alvn, resources.getDimensionPixelSize(2131166074), resources.getDimensionPixelSize(2131166075));
                if (((aith)this.a).r) {
                    final int intValue = (int)h.b((aexg)new joy((ViewGroup)this.b, 14)).e((Object)0);
                    tmy.aF(this.b, tmy.an(new tsp[] { tmy.ax(intValue), tmy.aw(intValue + resources.getDimensionPixelSize(2131166074)) }), (Class)GridLayout$LayoutParams.class);
                }
                else {
                    tmy.aF(this.b, tmy.aD((int)h.e((Object)resources.getDimensionPixelSize(2131167260))), (Class)GridLayout$LayoutParams.class);
                }
                return false;
            }
            if (d != 3) {
                if (!((accz)this.c).h()) {
                    this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                }
                else {
                    final int[] a2 = ((acyo)this.a).a;
                    final int n = a2[0];
                    final int n2 = a2[1];
                    this.b.getLocationOnScreen(a2);
                    final int[] a3 = ((acyo)this.a).a;
                    if (n != a3[0] || n2 != a3[1]) {
                        ((accz)this.c).g();
                        return true;
                    }
                }
                return true;
            }
            if (!((accz)this.a).h()) {
                this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            }
            else {
                final int[] array = (int[])((tdg)this.c).a;
                final int n3 = array[0];
                final int n4 = array[1];
                this.b.getLocationOnScreen(array);
                final int[] array2 = (int[])((tdg)this.c).a;
                if (n3 != array2[0] || n4 != array2[1]) {
                    ((accz)this.a).g();
                    return true;
                }
            }
            return true;
        }
        else {
            if (faa.r((aiso)this.a) == null) {
                return true;
            }
            ((TextView)this.b).setBackground((Drawable)null);
            final DisplayMetrics displayMetrics = ((TextView)this.b).getResources().getDisplayMetrics();
            final int az = tmy.aZ(displayMetrics, 2);
            ((toy)this.c).b(tmy.aZ(displayMetrics, 6), az, toy.a(((TextView)this.b).getTextSize() * ((TextView)this.b).getLineCount(), az) + tmy.aZ(displayMetrics, 4), az);
            ((TextView)this.b).setBackground((Drawable)this.c);
            return true;
        }
    }
}

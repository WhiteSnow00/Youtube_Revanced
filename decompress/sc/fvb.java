import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvb extends acld
{
    private final ackr a;
    private final ViewGroup b;
    private final acku c;
    private final FrameLayout$LayoutParams d;
    private acko e;
    
    public fvb(final Context context, final gjh a, final acku c) {
        this.a = (ackr)a;
        final FrameLayout b = new FrameLayout(context);
        this.b = (ViewGroup)b;
        this.c = c;
        a.c((View)b);
        ((ViewGroup)b).setLayoutParams((ViewGroup$LayoutParams)(this.d = new FrameLayout$LayoutParams(-1, -2)));
    }
    
    public final View a() {
        return ((gjh)this.a).a;
    }
    
    public final void c(final acku acku) {
        this.b.removeAllViews();
        final acko e = this.e;
        if (e == null) {
            return;
        }
        acku.b(e.a());
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((amhi)o).i.I();
    }
    
    protected final /* bridge */ void lR(final ackm ackm, Object o) {
        final amhi amhi = (amhi)o;
        amhj amhj;
        if ((amhj = amhi.g) == null) {
            amhj = amhj.a;
        }
        int do1;
        if ((do1 = aqsx.do(amhj.c)) == 0) {
            do1 = 1;
        }
        if (--do1 != 2) {
            if (do1 != 4) {
                o = new fuy(amhi);
            }
            else {
                o = new fux(amhi);
            }
        }
        else {
            o = new fuz(amhi);
        }
        final acko z = aald.z(this.c, o, null);
        this.e = z;
        if (z == null) {
            return;
        }
        aald.F(z.a(), this.e, this.c.c(o));
        this.e.mN(ackm, o);
        final View a = this.e.a();
        this.b.removeAllViews();
        this.b.addView(a);
        this.a.e(ackm);
    }
}

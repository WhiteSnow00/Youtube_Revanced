import android.content.res.Resources;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jju extends jft
{
    public static final int p = 0;
    private final Context q;
    private final ackr r;
    private final ackk s;
    
    public jju(final Context q, final acgs acgs, final gjh r, final vcy vcy, final acpn acpn, final acpk acpk, final ViewGroup viewGroup) {
        super(q, acgs, acpn, 2131625037, acpk, viewGroup, (qcy)null, (cya)null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.q = q;
        this.r = (ackr)r;
        final View c = super.c;
        r.c(c);
        this.s = new ackk(vcy, (ackr)r);
        this.a().setTag(2131430139, (Object)new jkk(c, 1));
        this.a().setLayoutDirection(q.getResources().getConfiguration().getLayoutDirection());
    }
    
    private final int n() {
        return this.q.getResources().getDimensionPixelSize(2131168516) + super.c.getPaddingLeft() + super.c.getPaddingRight();
    }
    
    public final View a() {
        return ((gjh)this.r).a;
    }
    
    public final void c(final acku acku) {
        super.c(acku);
        this.s.c();
    }
    
    public final void mN(final ackm ackm, final Object o) {
        final anhw anhw = (anhw)o;
        final ackk s = this.s;
        final wyw a = ackm.a;
        final int b = anhw.b;
        final ajut ajut = null;
        aiqj aiqj;
        if ((b & 0x8) != 0x0) {
            if ((aiqj = anhw.g) == null) {
                aiqj = aiqj.a;
            }
        }
        else {
            aiqj = null;
        }
        s.a(a, aiqj, ackm.e());
        ackm.a.t((wzz)new wyt(anhw.j), (alhi)null);
        if (this.a().getLayoutParams() != null) {
            final Resources resources = this.q.getResources();
            int n;
            if ((anhw.b & 0x20) != 0x0 && resources.getConfiguration().orientation == 1) {
                final int widthPixels = resources.getDisplayMetrics().widthPixels;
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131166854);
                int cd;
                if ((cd = aqsx.cD(anhw.i)) == 0) {
                    cd = 1;
                }
                if (--cd != 0) {
                    if (cd != 1) {
                        n = (widthPixels - (dimensionPixelSize * 3 + resources.getDimensionPixelSize(2131168515))) / 2;
                    }
                    else {
                        n = widthPixels - (dimensionPixelSize + dimensionPixelSize + resources.getDimensionPixelSize(2131168514));
                    }
                }
                else {
                    n = this.n();
                }
            }
            else {
                n = this.n();
            }
            tpe.aF(this.a(), tpe.aD(n), (Class)ViewGroup$LayoutParams.class);
        }
        ankk ankk;
        if ((ankk = anhw.c) == null) {
            ankk = ankk.a;
        }
        this.h(ankk, (aotp)null);
        this.i((List)anhw.f);
        ajut ajut2;
        if ((anhw.b & 0x2) != 0x0) {
            if ((ajut2 = anhw.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        this.k((CharSequence)acak.b(ajut2));
        ajut ajut3 = ajut;
        if ((anhw.b & 0x4) != 0x0 && (ajut3 = anhw.e) == null) {
            ajut3 = ajut.a;
        }
        this.b((CharSequence)acak.b(ajut3));
        final View a2 = ((gjh)this.r).a;
        amgv amgv;
        if ((amgv = anhw.h) == null) {
            amgv = amgv.a;
        }
        this.f(a2, amgv, (Object)anhw, ackm.a);
        this.r.e(ackm);
    }
}

import android.widget.ImageView;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fud implements acko
{
    public static final afeq a;
    public final gck b;
    public View$OnClickListener c;
    public ackh d;
    public boolean e;
    public wyw f;
    public ahaz g;
    public final jki h;
    private final acgs i;
    private final acpk j;
    private final ackk k;
    private final acvw l;
    private final arkg m;
    private asir n;
    
    static {
        a = afeq.t((Object)aiks.k, (Object)aiks.m, (Object)aiks.n);
    }
    
    public fud(final Context context, final vcy vcy, final acgs i, final acpk j, final acvw l, final jki h, final arkg m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        vcy.getClass();
        i.getClass();
        this.i = i;
        j.getClass();
        this.j = j;
        l.getClass();
        this.l = l;
        h.getClass();
        this.h = h;
        m.getClass();
        this.m = m;
        final gck b = new gck(context, h.r() ^ true);
        this.b = b;
        this.k = new ackk(vcy, (View)b, (ackh)new ior(this, 1));
        this.f = wyw.k;
    }
    
    public static alhi b(final aikr aikr) {
        final ahaz builder = ((ahbh)alhi.a).createBuilder();
        final ahaz builder2 = ((ahbh)algx.a).createBuilder();
        final boolean i = aikr.i;
        builder2.copyOnWrite();
        final algx algx = (algx)builder2.instance;
        int n;
        if (!i) {
            n = 3;
        }
        else {
            n = 2;
        }
        algx.c = n - 1;
        algx.b |= 0x1;
        final algx n2 = (algx)builder2.build();
        builder.copyOnWrite();
        final alhi alhi = (alhi)builder.instance;
        n2.getClass();
        alhi.n = n2;
        alhi.b |= 0x8000;
        return (alhi)builder.build();
    }
    
    public static void d(final ackm ackm, final asht asht) {
        ackm.f("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY", (Object)asht);
    }
    
    public static void f(final ackm ackm, final ackh ackh) {
        ackh.getClass();
        ackm.f("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT", (Object)ackh);
    }
    
    public static void g(final ackm ackm, final View$OnClickListener view$OnClickListener) {
        ackm.f("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER", (Object)view$OnClickListener);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acku acku) {
        this.f = wyw.k;
        this.c = null;
        this.e = false;
        this.k.c();
        final asir n = this.n;
        if (n != null) {
            asjv.b((AtomicReference)n);
            this.n = null;
        }
    }
    
    public final void h() {
        final ahaz g = this.g;
        if (g != null) {
            final aikr aikr = (aikr)g.instance;
            if ((aikr.b & 0x8000) != 0x0) {
                final int ab = aeuz.aB(aikr.n);
                if (ab != 0) {
                    if (ab == 2) {
                        return;
                    }
                }
            }
        }
        if (g != null) {
            final wyw f = this.f;
            if (f != null) {
                f.J(3, (wzz)new wyt(((aikr)g.instance).l), b((aikr)this.g.build()));
            }
        }
    }
    
    public final void mN(final ackm ackm, final Object o) {
        final aikr aikr = (aikr)o;
        this.g = ((ahbh)aikr).toBuilder();
        this.f = ((wyy)ackm).a;
        final ackk k = this.k;
        final wyw a = ((wyy)ackm).a;
        aiqj aiqj;
        if ((aiqj = ((aikr)this.g.instance).g) == null) {
            aiqj = aiqj.a;
        }
        k.b(a, aiqj, ackm.e(), (acki)new ftz(this));
        if ((((aikr)this.g.instance).b & 0x400) != 0x0) {
            ((acwn)this.m.a()).d(((aikr)this.g.instance).k, (View)this.b);
        }
        final ahaz g = this.g;
        final aikr aikr2 = (aikr)g.instance;
        if (aikr2.c == 7) {
            final acpk j = this.j;
            akdh akdh;
            if ((akdh = akdh.b(((akdi)aikr2.d).c)) == null) {
                akdh = akdh.a;
            }
            final int a2 = j.a(akdh);
            final gck b = this.b;
            final aikr aikr3 = (aikr)this.g.build();
            final gci a3 = b.a();
            a3.e(false);
            a3.d(aikr3.c == 6);
            a3.f(aikr3.c == 7);
            b.g(a3, aikr3);
            b.e = a3.a();
            if (a2 == 0) {
                b.b = null;
                b.a = null;
            }
            else {
                final ImageView d = b.d;
                final int l = b.e.l;
                final tut ae = tpe.aE(l, l);
                final gcj e = b.e;
                tpe.aF((View)d, tpe.an(new tut[] { ae, tpe.ax(e.j), tpe.aw(e.k) }), (Class)ViewGroup$MarginLayoutParams.class);
                b.b = b.getResources().getDrawable(a2);
                b.a = b.getResources().getDrawable(a2);
                final gcj e2 = b.e;
                if (!e2.f) {
                    b.b.setColorFilter(e2.a(false), PorterDuff$Mode.SRC_IN);
                    b.a.mutate().setColorFilter(b.e.a(true), PorterDuff$Mode.SRC_IN);
                }
            }
            b.b(aikr3);
        }
        else {
            this.b.c((aikr)g.build());
        }
        this.c = (View$OnClickListener)ackm.c("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER");
        this.d = (ackh)ackm.c("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT");
        final afeq a4 = fud.a;
        aikt aikt;
        if ((aikt = aikr.e) == null) {
            aikt = aikt.a;
        }
        aiks aiks;
        if ((aiks = aiks.b(aikt.c)) == null) {
            aiks = aiks.a;
        }
        this.e = (a4.contains((Object)aiks) ^ true);
        final asht asht = (asht)ackm.c("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY");
        final asir n = this.n;
        if (n != null) {
            asjv.b((AtomicReference)n);
        }
        if (asht != null) {
            this.n = asht.aI((asjm)new fqz(this, 10), (asjm)fua.a);
        }
        final aikr aikr4 = (aikr)this.g.instance;
        if (aikr4.c == 6) {
            this.i.g(this.b.c, (aotp)aikr4.d);
        }
        if ((((aikr)this.g.instance).b & 0x200) != 0x0) {
            final acvw i = this.l;
            akbq akbq;
            if ((akbq = aikr.j) == null) {
                akbq = akbq.a;
            }
            akbo a5;
            if (akbq.b == 102716411) {
                a5 = (akbo)akbq.c;
            }
            else {
                a5 = akbo.a;
            }
            i.b(a5, (View)this.b, (Object)aikr, this.f);
        }
        this.f.t((wzz)new wyt(((aikr)this.g.instance).l), b((aikr)this.g.build()));
    }
}

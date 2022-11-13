import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.view.View;
import app.revanced.integrations.patches.HideMixPlaylistsPatch;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khh extends acld
{
    public final Context a;
    public final vcy b;
    public final acgs c;
    khg d;
    public final vai e;
    private final gjh f;
    private final acpn g;
    private final FrameLayout h;
    private final acpk i;
    private khg j;
    private khg k;
    
    public khh(final Context a, final acgs c, final gjh f, final vcy b, final acpn g, final acpk i, final vai e) {
        this.a = a;
        f.getClass();
        this.f = f;
        this.c = c;
        this.b = b;
        this.g = g;
        final FrameLayout h = new FrameLayout(a);
        HideMixPlaylistsPatch.hideMixPlaylists((View)h);
        this.h = h;
        this.i = i;
        this.e = e;
        f.c((View)h);
    }
    
    public final View a() {
        return this.f.a;
    }
    
    public final void c(final acku acku) {
        final khg d = this.d;
        if (d != null) {
            d.c(acku);
        }
    }
    
    protected final /* bridge */ byte[] d(final Object o) {
        return ((anri)o).n.I();
    }
    
    public final int f() {
        return this.a.getResources().getConfiguration().orientation;
    }
    
    final khg g(final int n) {
        return new khg(this, this.a, this.c, n, this.f, this.b, this.g, this.i);
    }
    
    public final /* bridge */ void lR(final ackm ackm, final Object o) {
        final anri anri = (anri)o;
        this.h.removeAllViews();
        int n;
        if (tpe.bq(this.a)) {
            int cl;
            if ((cl = aqsx.cl(anri.m)) == 0) {
                cl = 1;
            }
            if (cl - 1 != 5) {
                n = 2131624503;
            }
            else {
                n = 2131624504;
            }
            this.d = this.g(n);
        }
        else if (this.f() == 2) {
            int cl2;
            if ((cl2 = aqsx.cl(anri.m)) == 0) {
                cl2 = 1;
            }
            if (--cl2 != 3) {
                if (cl2 != 4) {
                    n = 2131624610;
                }
                else {
                    n = 2131624612;
                }
            }
            else {
                n = 2131624611;
            }
            final khg g = this.g(n);
            this.j = g;
            this.d = g;
        }
        else {
            int cl3;
            if ((cl3 = aqsx.cl(anri.m)) == 0) {
                cl3 = 1;
            }
            if (--cl3 != 1 && cl3 != 2) {
                if (cl3 != 3) {
                    if (cl3 != 4) {
                        n = 2131625047;
                    }
                    else {
                        n = 2131625105;
                    }
                }
                else {
                    n = 2131624465;
                }
            }
            else {
                n = 2131624464;
            }
            final khg g2 = this.g(n);
            this.k = g2;
            this.d = g2;
        }
        if (n == 2131624612 || n == 2131625105) {
            final khg d = this.d;
            aijz aijz;
            if ((aijz = anri.o) == null) {
                aijz = aijz.a;
            }
            aika aika;
            if ((aika = aijz.c) == null) {
                aika = aika.a;
            }
            aotp aotp;
            if ((aika.b & 0x1) != 0x0) {
                aika aika2;
                if ((aika2 = aijz.c) == null) {
                    aika2 = aika.a;
                }
                if ((aotp = aika2.c) == null) {
                    aotp = aotp.a;
                }
            }
            else {
                aotp = null;
            }
            if (aotp != null) {
                final ImageView p2 = d.p;
                if (p2 != null) {
                    tpe.v((View)p2, true);
                    d.q.c.g(d.p, aotp);
                    d.p.setOnClickListener((View$OnClickListener)new keq(d, aijz, 12));
                }
            }
        }
        if (n == 2131624612) {
            ((View)this.d.h).setPaddingRelative(this.a.getResources().getDimensionPixelSize(2131168662), this.a.getResources().getDimensionPixelSize(2131168663), this.a.getResources().getDimensionPixelSize(2131168661), this.a.getResources().getDimensionPixelSize(2131168660));
        }
        this.h.addView(this.d.c);
        this.d.n(ackm, anri);
        final khg d2 = this.d;
        final View a = this.f.a;
        amgv amgv;
        if ((amgv = anri.k) == null) {
            amgv = amgv.a;
        }
        d2.f(a, amgv, (Object)anri, ackm.a);
        this.f.e(ackm);
    }
}

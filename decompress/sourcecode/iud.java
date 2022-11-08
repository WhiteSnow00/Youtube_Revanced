import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import java.util.Iterator;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iud implements ixr, foa
{
    public final atjj a;
    public final iyy b;
    public fnu c;
    public final qv d;
    private final lcl e;
    private final asib f;
    private final abns g;
    private final asho h;
    private final Set i;
    private final asgt j;
    private aioe k;
    private aorm l;
    private aorm m;
    
    public iud(final abns g, final atjj a, final asho h, final lcl e, final qv d, final iyy b, final byte[] array, final byte[] array2) {
        this.g = g;
        this.a = a;
        this.h = h;
        this.e = e;
        this.d = d;
        this.b = b;
        this.i = new CopyOnWriteArraySet();
        this.f = new asib();
        this.j = asgt.e((aujo)((asgt)g.q().a).R().B((asjd)iuc.b), (aujo)((asgt)g.q().l).B((asjd)iuc.a), (asit)exh.t).B((asjd)iuc.c).L((asjc)iqc.l);
    }
    
    public static aorm a(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return null;
        }
        playerResponseModel.l();
        return playerResponseModel.l().e();
    }
    
    private final void k(final aorm aorm, final Bitmap bitmap) {
        final Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            ((ixq)iterator.next()).a(this.k, aorm, bitmap);
        }
    }
    
    private final void l(final boolean b, final aorm m, final Bitmap bitmap) {
        final aorm i = this.m;
        if (!b && aeda.v(i, m)) {
            return;
        }
        this.k(this.m = m, bitmap);
    }
    
    public final void b(final ixq ixq) {
        this.i.add(ixq);
    }
    
    public final void e(final boolean b, aorm d) {
        final aorm l = this.l;
        aorm d2 = d;
        if (d == null) {
            final lcq c = ((lck)this.e).a.c;
            if (c != null) {
                if (c.d == null) {
                    final WatchNextResponseModel c2 = c.c();
                    if (c2 != null) {
                        final alcj a = c2.a;
                        if ((a.b & 0x2000) != 0x0) {
                            if ((d = a.p) == null) {
                                d = aorm.a;
                            }
                            c.d = d;
                        }
                    }
                }
                d2 = c.d;
            }
            else {
                d2 = null;
            }
        }
        if (!b && aeda.v(l, d2)) {
            return;
        }
        this.l = d2;
        final lcq c3 = ((lck)this.e).a.c;
        if (c3 != null) {
            if (d2 != null) {
                if (!aeda.v(c3.d, d2)) {
                    c3.d = d2;
                    c3.f(4);
                }
            }
        }
        this.k(this.l, null);
    }
    
    public final void f() {
        this.c = null;
        this.b.l();
        final boolean j = this.j(null);
        this.e(j, null);
        this.l(j, null, null);
    }
    
    public final void g(final aioe aioe, final fnu c) {
        final boolean j = this.j(aioe);
        this.c = c;
        if (c.c != null) {
            this.b.l();
            this.l(j, c.c, c.a);
            return;
        }
        final Bitmap a = c.a;
        if (a != null) {
            this.b.n(a);
            return;
        }
        this.b.l();
        this.e(j, c.b);
    }
    
    public final void h() {
        final asib f = this.f;
        asic asic;
        if (((uyi)this.g.cd().h).bx()) {
            asic = this.g.R().am((asix)new itv(this, 11), (asix)irb.n);
        }
        else {
            asic = this.g.Q().R().P(this.h).am((asix)new itv(this, 11), (asix)irb.n);
        }
        f.f(new asic[] { asic, this.j.R().am((asix)new itv(this, 12), (asix)irb.n) });
    }
    
    public final boolean i() {
        final fnu c = this.c;
        return c != null && c.c != null;
    }
    
    public final boolean j(final aioe k) {
        boolean b = false;
        Label_0028: {
            if (k != null) {
                final aioe i = this.k;
                if (i != null && abhz.h(i, k)) {
                    b = true;
                    break Label_0028;
                }
            }
            b = false;
        }
        this.k = k;
        return !b;
    }
    
    public final void lV() {
        this.f.b();
    }
    
    public final void qB() {
        this.h();
    }
}

import android.net.Uri;
import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.os.Vibrator;
import java.util.List;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aazi
{
    private final Context a;
    private final acgs b;
    private final tqf c;
    private final Handler d;
    private final wyw e;
    private tce f;
    private boolean[] g;
    public boolean h;
    public abjv i;
    public tce j;
    public ahui k;
    public boolean[] l;
    public int m;
    public ahuf n;
    public List o;
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public final aazh t;
    public final itw u;
    public final ziy v;
    private Vibrator w;
    private boolean x;
    private final aazg y;
    private final aavc z;
    
    public aazi(final Context a, final itw u, final acgs b, final vcy vcy, final tqf c, final aahc aahc, final zpk zpk, final wyw e, final aazj aazj, final byte[] array) {
        a.getClass();
        this.a = a;
        u.getClass();
        this.u = u;
        b.getClass();
        this.b = b;
        vcy.getClass();
        c.getClass();
        this.c = c;
        this.d = new Handler(a.getMainLooper());
        this.v = new ziy(aahc, zpk, "iv", (byte[])null);
        this.e = e;
        this.m = -1;
        aazj.getClass();
        this.z = new aavc(this, 11);
        this.t = new aazh(this);
        this.y = new aazg(this);
    }
    
    public static final ahui g(final PlayerResponseModel playerResponseModel) {
        for (final ahue ahue : playerResponseModel.z().o) {
            if (ahue != null && ahue.b == 49483894) {
                return (ahui)ahue.c;
            }
        }
        return null;
    }
    
    public static final aoto n(final aotp aotp) {
        return aald.P(aotp, 40);
    }
    
    public aazg b() {
        return this.y;
    }
    
    public final tce f(final aoto aoto, final aazf aazf) {
        Uri cl;
        if (aoto == null) {
            cl = null;
        }
        else {
            cl = tpe.cL(aoto.c);
        }
        if (cl == null) {
            return null;
        }
        final tce c = tce.c((tcc)aazf);
        this.b.k(cl, (tcc)tck.c(this.d, (tcc)c));
        return c;
    }
    
    public final void h(ahui k, final String s) {
        if (this.h) {
            this.j();
        }
        this.h = true;
        this.k = k;
        if (k != null && k.d.size() != 0) {
            final ahbx d = k.d;
            this.o = (List)d;
            final int size = ((List)d).size();
            this.g = new boolean[size];
            this.l = new boolean[size];
        }
        k = this.k;
        if (k != null && (k.b & 0x2) != 0x0) {
            ahug ahug;
            if ((ahug = k.c) == null) {
                ahug = ahug.a;
            }
            aotp aotp;
            if ((aotp = ahug.d) == null) {
                aotp = aotp.a;
            }
            final aoto n = n(aotp);
            this.f = this.f(n, new aaze(this, n));
        }
        this.v.D("CPN", s);
    }
    
    public final void i() {
        this.c.j(this.p);
    }
    
    public final void j() {
        this.h = false;
        final tce f = this.f;
        if (f != null) {
            f.d();
            this.f = null;
        }
        final tce j = this.j;
        if (j != null) {
            j.d();
            this.j = null;
        }
        final itw u = this.u;
        ((abbk)u).X();
        u.a = false;
        u.b = null;
        ((abbk)u).Z(3);
        this.x = false;
        this.p = false;
        this.q = false;
        this.g = null;
        this.l = null;
        this.m = -1;
        this.n = null;
        this.k = null;
        this.r = -1;
    }
    
    public final void k() {
        final ahui k = this.k;
        if (k != null && (k.b & 0x2) != 0x0) {
            boolean x = false;
            Label_0121: {
                if (this.i == abjv.c) {
                    ahug ahug;
                    if ((ahug = this.k.c) == null) {
                        ahug = ahug.a;
                    }
                    final long b = ahug.b;
                    final long n = this.r;
                    if (b <= n) {
                        ahug ahug2;
                        if ((ahug2 = this.k.c) == null) {
                            ahug2 = ahug.a;
                        }
                        if (n < ahug2.c && !this.s) {
                            x = true;
                            break Label_0121;
                        }
                    }
                }
                x = false;
            }
            if (x == this.x) {
                return;
            }
            this.x = x;
            if (x) {
                final itw u = this.u;
                u.a = true;
                if (u.oV()) {
                    ((abbk)u).aa();
                }
                else {
                    ((abbk)u).X();
                }
                ((abbk)u).Z(2);
                ahug ahug3;
                if ((ahug3 = this.k.c) == null) {
                    ahug3 = ahug.a;
                }
                final byte[] i = ahug3.e.I();
                if (i == null) {
                    return;
                }
                this.e.t((wzz)new wyt(i), (alhi)null);
            }
            else {
                final itw u2 = this.u;
                u2.a = false;
                ((abbk)u2).Z(2);
            }
        }
    }
    
    public final boolean l() {
        final boolean[] g = this.g;
        if (g != null) {
            final int m = this.m;
            if (m >= 0 && m < g.length && g[m]) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean m() {
        final ahuf n = this.n;
        if (n == null) {
            return false;
        }
        anht anht;
        if ((anht = n.g) == null) {
            anht = anht.b;
        }
        if (anht.c.size() == 0) {
            return true;
        }
        final abjv i = this.i;
        if (i == null) {
            return false;
        }
        final abke a = abke.a;
        final int ordinal = i.ordinal();
        anhs anhs = null;
        Label_0120: {
            if (ordinal != 0) {
                if (ordinal == 1) {
                    anhs = anhs.d;
                    break Label_0120;
                }
                if (ordinal == 2) {
                    anhs = anhs.c;
                    break Label_0120;
                }
                if (ordinal == 3) {
                    anhs = anhs.e;
                    break Label_0120;
                }
                if (ordinal != 4) {
                    ttr.l("Unhandled player visibility state.");
                    anhs = null;
                    break Label_0120;
                }
            }
            anhs = anhs.b;
        }
        if (anhs == null) {
            return false;
        }
        anht anht2;
        if ((anht2 = this.n.g) == null) {
            anht2 = anht.b;
        }
        final Iterator<Object> iterator = ((List<Object>)new ahbr((List)anht2.c, anht.a)).iterator();
        while (iterator.hasNext()) {
            if (anhs == iterator.next()) {
                return true;
            }
        }
        return false;
    }
    
    public final void o() {
        if (this.p) {
            this.d.removeCallbacks((Runnable)this.z);
            this.p = false;
            this.i();
        }
    }
    
    public final void p(final boolean q, final int n) {
        if (!this.p || this.q != q) {
            this.p = true;
            this.q = q;
            this.i();
            if (tsy.e(this.a)) {
                if (this.w == null) {
                    this.w = (Vibrator)this.a.getSystemService("vibrator");
                }
                if (this.w.hasVibrator()) {
                    this.w.vibrate((long)this.a.getResources().getInteger(2131492961));
                }
            }
            if (q && !this.l[this.m] && n > 0) {
                this.d.removeCallbacks((Runnable)this.z);
                this.d.postDelayed((Runnable)this.z, (long)n);
            }
        }
    }
}

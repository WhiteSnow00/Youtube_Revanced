import java.util.Iterator;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import android.util.LruCache;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsg implements zpf
{
    static final long a;
    public static final int m = 0;
    public final hsw b;
    public final List c;
    public final LruCache d;
    public final atjo e;
    public final asid f;
    public boolean g;
    public boolean h;
    public final boolean i;
    public final asid j;
    public asie k;
    public asie l;
    private final ArrayList n;
    private final long o;
    private final oby p;
    private final vjm q;
    private boolean r;
    private final boolean s;
    private final boolean t;
    private final aadx u;
    
    static {
        a = TimeUnit.MILLISECONDS.convert(10L, TimeUnit.SECONDS);
    }
    
    public hsg(final asie k, final asie l, final hsw b, final long o, final LruCache d, final aadx u, final Executor executor, final asid j, final asid f, final oby p19, final vjm q, final boolean h, final boolean s, final boolean t, final boolean i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.n = new ArrayList();
        this.c = new ArrayList();
        this.e = atjo.aa();
        this.b = b;
        this.o = o;
        this.d = d;
        this.u = u;
        this.p = p19;
        this.q = q;
        this.f = f;
        final asid b2 = atjj.b(executor);
        if (i) {
            this.k = k;
            this.l = l;
        }
        else {
            this.k = k.Q(b2);
            this.l = l.Q(b2);
        }
        this.h = h;
        this.s = s;
        this.t = t;
        this.i = i;
        this.j = j;
    }
    
    private final VideoStreamingData g(final akqn akqn) {
        if (akqn != null && (akqn.b & 0x4) != 0x0 && !this.t) {
            final vjm q = this.q;
            akxi akxi;
            if ((akxi = akqn.e) == null) {
                akxi = akxi.a;
            }
            return PlayerResponseModelImpl.ag(q, akxi, this.o);
        }
        return null;
    }
    
    private final void h() {
        synchronized (this.d) {
            if (!this.g) {
                this.d.remove((Object)((vkk)this.b).b());
            }
        }
    }
    
    private final boolean i() {
        if (!this.r) {
            return false;
        }
        this.r = false;
        final hsw b = this.b;
        ((vkk)b).m = false;
        b.b = false;
        this.u.n(b, (zpf)this);
        return true;
    }
    
    private final auce j(final String s, final akqn d) {
        if (!this.g) {
            akli akli;
            if ((akli = d.c) == null) {
                akli = akli.a;
            }
            final VideoStreamingData g = this.g(d);
            if (g == null && !this.t) {
                return null;
            }
            int e;
            if ((e = akli.e) <= 0) {
                akxi akxi;
                if ((akxi = d.e) == null) {
                    akxi = akxi.a;
                }
                akxo akxo;
                if ((akxo = akxi.g) == null) {
                    akxo = akxo.a;
                }
                if (akxo.f) {
                    e = 15;
                }
                else {
                    e = 300;
                }
            }
            long min;
            if (this.t) {
                min = this.p.d() + TimeUnit.SECONDS.toMillis(e);
            }
            else {
                min = Math.min(this.p.d() + TimeUnit.SECONDS.toMillis(e), g.f - hsg.a);
            }
            synchronized (this.d) {
                if (!this.g) {
                    final auce auce = new auce();
                    auce.d = d;
                    auce.a = min;
                    auce.b = g;
                    this.d.put((Object)s, (Object)auce);
                    return auce;
                }
                return null;
            }
        }
        return null;
    }
    
    public final void a(final dbj dbj) {
        if (this.i()) {
            return;
        }
        this.h();
        final ArrayList n = this.n;
        for (int size = n.size(), i = 0; i < size; ++i) {
            ((zpf)n.get(i)).a(dbj);
        }
        final Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((zpf)iterator.next()).a(dbj);
        }
    }
    
    public final void d(final zpf zpf, final boolean b) {
        this.n.add(zpf);
        if (!b && ((vkk)this.b).m) {
            this.r = true;
        }
    }
    
    public final void e(final zpf zpf, final boolean b) {
        this.c.add(zpf);
        if (!b && ((vkk)this.b).m) {
            this.r = true;
        }
    }
    
    public final void f(akqn akqn) {
        final int h = akqn.h;
        final int ce = aqsx.ce(h);
        Object g = null;
        Label_0301: {
            if (ce != 0) {
                if (ce == 5) {
                    if (this.i()) {
                        return;
                    }
                    hsh.b(this.d);
                    g = this.g(akqn);
                    break Label_0301;
                }
            }
            final int ce2 = aqsx.ce(h);
            Label_0286: {
                if (ce2 != 0) {
                    if (ce2 == 3) {
                        break Label_0286;
                    }
                }
                final int ce3 = aqsx.ce(h);
                if (ce3 != 0) {
                    if (ce3 == 4) {
                        break Label_0286;
                    }
                }
                final auce j = this.j(((vkk)this.b).b(), akqn);
                Object o;
                if (j == null || (o = j.b) == null) {
                    o = this.g(akqn);
                }
                g = o;
                if ((akqn.b & 0x1000) != 0x0) {
                    aiqj aiqj;
                    if ((aiqj = akqn.k) == null) {
                        aiqj = aiqj.a;
                    }
                    final hsw g2 = hsh.g(aiqj, this.u, this.i);
                    final ahaz builder = ((ahbh)akqn).toBuilder();
                    builder.copyOnWrite();
                    final akqn akqn2 = (akqn)builder.instance;
                    akqn2.k = null;
                    akqn2.b &= 0xFFFFEFFF;
                    builder.copyOnWrite();
                    final akqn akqn3 = (akqn)builder.instance;
                    akqn3.b &= 0xFFFFDFFF;
                    akqn3.l = akqn.a.l;
                    this.j(((vkk)g2).b(), (akqn)builder.build());
                    g = o;
                }
                break Label_0301;
            }
            if (this.i()) {
                return;
            }
            this.h();
            g = null;
        }
        akqn akqn4 = akqn;
        if (!this.t) {
            if (g != null && (akqn.b & 0x4) != 0x0) {
                akqn4 = akqn;
            }
            else {
                if (this.i()) {
                    return;
                }
                this.h();
                final ahaz builder2 = ((ahbh)akqn).toBuilder();
                builder2.copyOnWrite();
                akqn = (akqn)builder2.instance;
                akqn.h = 2;
                akqn.b |= 0x20;
                akqn4 = (akqn)builder2.build();
            }
        }
        final ArrayList n = this.n;
        for (int size = n.size(), i = 0; i < size; ++i) {
            ((zpf)n.get(i)).mX((Object)new agmc(akqn4, (VideoStreamingData)g, false));
        }
        if (!this.t) {
            if ((akqn4.b & 0x4) != 0x0 && (g != null || this.s)) {
                akxi akxi;
                if ((akxi = akqn4.e) == null) {
                    akxi = akxi.a;
                }
                final PlayerResponseModelImpl playerResponseModelImpl = new PlayerResponseModelImpl(akxi, this.o, (VideoStreamingData)g);
                final Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((zpf)iterator.next()).mX((Object)playerResponseModelImpl);
                }
            }
            else {
                final dbj dbj = new dbj("Reel with no PlayerResponse.");
                final Iterator iterator2 = this.c.iterator();
                while (iterator2.hasNext()) {
                    ((zpf)iterator2.next()).a(dbj);
                }
            }
        }
    }
    
    public final /* bridge */ void mX(final Object o) {
        this.f((akqn)o);
    }
    
    public final void mY() {
    }
}

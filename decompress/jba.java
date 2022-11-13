import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jba extends iw implements abao
{
    public static final int i = 0;
    private static final wyt j;
    public final jbh a;
    public final fpn b;
    public final abap c;
    public final jay d;
    public RecyclerView e;
    public LinearLayoutManager f;
    public View g;
    public final msr h;
    private final wyw k;
    private int l;
    private long m;
    private final arfk n;
    
    static {
        j = new wyt(xaa.c(152789));
    }
    
    public jba(final bu bu, final jki jki, final jbh a, final arfk n, final ajb ajb, final msr h, final fpn b, final abap c, final wyw k, final vai vai, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.d = new jay(bu, jki, ajb, a, vai, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.n = n;
        this.h = h;
        this.b = b;
        this.c = c;
        this.k = k;
        this.l = 0;
        this.m = -1L;
    }
    
    private final aezp f() {
        final RecyclerView e = this.e;
        if (e != null && this.f != null) {
            final int computeHorizontalScrollOffset = e.computeHorizontalScrollOffset();
            final View t = ((nw)this.f).T(computeHorizontalScrollOffset);
            if (t != null) {
                final View g = this.g;
                if (g != null) {
                    return aezp.k((Object)jax.a(computeHorizontalScrollOffset, (int)(g.getX() + this.g.getWidth() / 2.0f) - (int)(t.getX() + this.e.getX())));
                }
            }
            return (aezp)aeyo.a;
        }
        return (aezp)aeyo.a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int l) {
        final int i = this.l;
        if (i == l) {
            return;
        }
        if (i == 0) {
            final aezp f = this.f();
            if (f.h()) {
                this.m = this.d.b((jax)f.c());
            }
        }
        if (this.l != 0 && l == 0) {
            final aezp f2 = this.f();
            if (f2.h() && this.m != -1L) {
                final long b = this.d.b((jax)f2.c());
                final int a = ((jax)f2.c()).a;
                final jay d = this.d;
                final int m = d.m;
                d.m = -1;
                final boolean b2 = a == m;
                final long j = this.m;
                anza anza;
                if (b2) {
                    anza = anza.z;
                }
                else {
                    anza = anza.y;
                }
                int n;
                if (!b2) {
                    n = 65;
                }
                else {
                    n = 3;
                }
                final wyw k = this.k;
                final int d2 = (int)j;
                final int e = (int)b;
                final wyt j2 = jba.j;
                final ahaz builder = ((ahbh)alhi.a).createBuilder();
                final ahaz builder2 = ((ahbh)alht.a).createBuilder();
                builder2.copyOnWrite();
                final alht alht = (alht)builder2.instance;
                alht.c = anza.I;
                alht.b |= 0x1;
                builder2.copyOnWrite();
                final alht alht2 = (alht)builder2.instance;
                alht2.b |= 0x2;
                alht2.d = d2;
                builder2.copyOnWrite();
                final alht alht3 = (alht)builder2.instance;
                alht3.b |= 0x4;
                alht3.e = e;
                final alht i2 = (alht)builder2.build();
                builder.copyOnWrite();
                final alhi alhi = (alhi)builder.instance;
                i2.getClass();
                alhi.I = i2;
                alhi.c |= 0x4000000;
                k.J(n, (wzz)j2, (alhi)builder.build());
            }
            this.m = -1L;
        }
        this.l = l;
    }
    
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abea abea, final int n) {
    }
    
    public final void d(final abea abea) {
    }
    
    public final void oR(final abea abea, final boolean b) {
        if (b && !this.a.h()) {
            this.d.y(this.c.n(abea));
            return;
        }
        final jay d = this.d;
        if (!d.e.isEmpty()) {
            int i = 0;
            long c = 0L;
            while (i < d.e.size()) {
                final jav jav = d.e.get(i);
                long n = c;
                if (jav.e == 2) {
                    jav.e = 1;
                    jav.d = null;
                    jav.c = c;
                    ((nq)d).mT(i);
                    n = c + d.h;
                }
                ++i;
                c = n;
            }
        }
    }
    
    @Override
    public final void py(final RecyclerView recyclerView, final int n, final int n2) {
        if (recyclerView.computeHorizontalScrollRange() > 0 && recyclerView.F != 0) {
            if (this.f != null) {
                final aezp f = this.f();
                if (f.h()) {
                    ((abpq)this.n.b).Z(this.d.b((jax)f.c()));
                }
            }
        }
    }
}

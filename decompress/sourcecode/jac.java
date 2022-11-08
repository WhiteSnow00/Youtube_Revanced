import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jac extends iw implements aayr
{
    private static final wws j;
    public final jai a;
    public final fpg b;
    public final aays c;
    public final jaa d;
    public RecyclerView e;
    public LinearLayoutManager f;
    public View g;
    public final mrm h;
    private final wwv k;
    private int l;
    private long m;
    private final arcv n;
    
    static {
        j = new wws(wya.c(152789));
    }
    
    public jac(final bu bu, final jjg jjg, final jai a, final arcv n, final aja aja, final mrm h, final fpg b, final aays c, final wwv k, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = new jaa(bu, jjg, aja, a, (byte[])null, (byte[])null, (byte[])null);
        this.a = a;
        this.n = n;
        this.h = h;
        this.b = b;
        this.c = c;
        this.k = k;
        this.l = 0;
        this.m = -1L;
    }
    
    private final aexq f() {
        final RecyclerView e = this.e;
        if (e != null && this.f != null) {
            final int computeHorizontalScrollOffset = e.computeHorizontalScrollOffset();
            final View t = ((nw)this.f).T(computeHorizontalScrollOffset);
            if (t != null) {
                final View g = this.g;
                if (g != null) {
                    return aexq.k(izz.a(computeHorizontalScrollOffset, (int)(g.getX() + this.g.getWidth() / 2.0f) - (int)(t.getX() + this.e.getX())));
                }
            }
            return (aexq)aewp.a;
        }
        return (aexq)aewp.a;
    }
    
    @Override
    public final void b(final RecyclerView recyclerView, final int l) {
        final int i = this.l;
        if (i == l) {
            return;
        }
        if (i == 0) {
            final aexq f = this.f();
            if (f.h()) {
                this.m = this.d.b((izz)f.c());
            }
        }
        if (this.l != 0 && l == 0) {
            final aexq f2 = this.f();
            if (f2.h() && this.m != -1L) {
                final long b = this.d.b((izz)f2.c());
                final int a = ((izz)f2.c()).a;
                final jaa d = this.d;
                final int m = d.m;
                d.m = -1;
                final boolean b2 = a == m;
                final long j = this.m;
                anwx anwx;
                if (b2) {
                    anwx = anwx.z;
                }
                else {
                    anwx = anwx.y;
                }
                int n;
                if (!b2) {
                    n = 65;
                }
                else {
                    n = 3;
                }
                final wwv k = this.k;
                final wws j2 = jac.j;
                final agza builder = ((agzi)alff.a).createBuilder();
                final agza builder2 = ((agzi)alfq.a).createBuilder();
                builder2.copyOnWrite();
                final alfq alfq = (alfq)builder2.instance;
                alfq.c = anwx.H;
                alfq.b |= 0x1;
                builder2.copyOnWrite();
                final alfq alfq2 = (alfq)builder2.instance;
                alfq2.b |= 0x2;
                alfq2.d = (int)j;
                builder2.copyOnWrite();
                final alfq alfq3 = (alfq)builder2.instance;
                alfq3.b |= 0x4;
                alfq3.e = (int)b;
                final alfq i2 = (alfq)builder2.build();
                builder.copyOnWrite();
                final alff alff = (alff)builder.instance;
                i2.getClass();
                alff.I = i2;
                alff.c |= 0x4000000;
                k.J(n, (wxz)j2, (alff)builder.build());
            }
            this.m = -1L;
        }
        this.l = l;
    }
    
    public final void oR(final abcg abcg, final boolean b) {
        if (b && !this.a.h()) {
            this.d.y(this.c.n(abcg));
            return;
        }
        final jaa d = this.d;
        if (!d.e.isEmpty()) {
            long c = 0L;
            long n;
            for (int i = 0; i < d.e.size(); ++i, c = n) {
                final izx izx = d.e.get(i);
                n = c;
                if (izx.e == 2) {
                    izx.e = 1;
                    izx.d = null;
                    izx.c = c;
                    ((nq)d).tc(i);
                    n = c + d.h;
                }
            }
        }
    }
    
    @Override
    public final void pu(final RecyclerView recyclerView, final int n, final int n2) {
        if (recyclerView.computeHorizontalScrollRange() > 0 && recyclerView.F != 0) {
            if (this.f != null) {
                final aexq f = this.f();
                if (f.h()) {
                    ((abno)this.n.b).aa(this.d.b((izz)f.c()));
                }
            }
        }
    }
}

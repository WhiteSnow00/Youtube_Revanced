import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqu extends bqw implements Comparable
{
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    
    public bqu(int i, final azo azo, int j, final bqo bqo, final int n, final String s) {
        super(i, azo, j);
        final int n2 = 0;
        this.f = bqy.k(n, false);
        i = this.d.f;
        j = bqo.v;
        this.g = (0x1 == (i & 0x1));
        this.h = ((i & 0x2) != 0x0);
        afgh afgh;
        if (bqo.t.isEmpty()) {
            afgh = afgh.r("");
        }
        else {
            afgh = bqo.t;
        }
        while (true) {
            ayh d;
            String s2;
            boolean w;
            int b;
            for (i = 0; i < ((afjx)afgh).c; ++i) {
                d = this.d;
                s2 = afgh.get(i);
                w = bqo.w;
                j = bqy.a(d, s2, false);
                if (j > 0) {
                    this.i = i;
                    this.j = j;
                    b = bqy.b(this.d.g, bqo.u);
                    this.k = b;
                    this.m = ((this.d.g & 0x440) != 0x0);
                    i = bqy.a(this.d, s, bqy.e(s) == null);
                    this.l = i;
                    if (j <= 0 && (!bqo.t.isEmpty() || b <= 0) && !this.g && (!this.h || i <= 0)) {
                        j = 0;
                    }
                    else {
                        j = 1;
                    }
                    i = n2;
                    if (bqy.k(n, bqo.M)) {
                        i = n2;
                        if (j != 0) {
                            i = 1;
                        }
                    }
                    this.e = i;
                    return;
                }
            }
            i = Integer.MAX_VALUE;
            j = 0;
            continue;
        }
    }
    
    public final int a(final bqu bqu) {
        final afeq e = afeq.b.e(this.f, bqu.f).d(this.i, bqu.i, (Comparator)afki.a).b(this.j, bqu.j).b(this.k, bqu.k).e(this.g, bqu.g);
        final boolean h = this.h;
        final boolean h2 = bqu.h;
        Object o;
        if (this.j == 0) {
            o = afjm.a;
        }
        else {
            o = afki.a;
        }
        afeq afeq = e.d(h, h2, (Comparator)o).b(this.l, bqu.l);
        if (this.k == 0) {
            afeq = afeq.f(this.m, bqu.m);
        }
        return afeq.a();
    }
    
    @Override
    public final int b() {
        return this.e;
    }
    
    @Override
    public final /* bridge */ boolean c(final bqw bqw) {
        final bqu bqu = (bqu)bqw;
        return false;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.a((bqu)o);
    }
}

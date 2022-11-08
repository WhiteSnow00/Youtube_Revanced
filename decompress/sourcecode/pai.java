import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import android.util.SparseIntArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class pai
{
    private final int a;
    private final afpd b;
    private final List c;
    private final List d;
    private final SparseIntArray e;
    private final List f;
    private final SparseIntArray g;
    private final boolean h;
    
    public pai(final int n, final int n2) {
        this(n, n2, false);
    }
    
    public pai(final int a, final int n, final boolean h) {
        this.a = a;
        this.b = oyw.a();
        this.c = new ArrayList();
        this.d = new ArrayList(n);
        this.e = new SparseIntArray(n);
        this.f = new ArrayList();
        this.g = new SparseIntArray();
        this.h = h;
    }
    
    public ozr b(final ozo ozo, int size) {
        ozo.b = this.a;
        int n = size;
        if (size == -1) {
            n = -1;
        }
        size = this.d.size();
        final agzc d = ozo.d;
        final int f = ozo.f();
        d.copyOnWrite();
        final ozr ozr = (ozr)d.instance;
        final ozr a = ozr.a;
        if (f != 0) {
            ozr.e = f - 1;
            ozr.b |= 0x2;
            final afpd b = this.b;
            final agzc d2 = ozo.d;
            afpc afpc;
            if ((afpc = ((ozr)d2.instance).d) == null) {
                afpc = afpc.a;
            }
            final agza builder = ((agzi)afpc).toBuilder();
            builder.copyOnWrite();
            final afpc afpc2 = (afpc)builder.instance;
            b.getClass();
            afpc2.e = b;
            afpc2.b |= 0x800;
            builder.copyOnWrite();
            final afpc afpc3 = (afpc)builder.instance;
            afpc3.b |= 0x1;
            afpc3.c = size;
            final afpc d3 = (afpc)builder.build();
            d2.copyOnWrite();
            final ozr ozr2 = (ozr)d2.instance;
            d3.getClass();
            ozr2.d = d3;
            ozr2.b |= 0x1;
            final php e = ozo.e;
            if (!((Set)e.a).isEmpty()) {
                final Iterator<Object> iterator = ((Set<Object>)e.a).iterator();
                while (iterator.hasNext()) {
                    iterator.next().e();
                }
            }
            final ozr a2 = ozo.a();
            this.d.add(a2);
            this.e.append(size, n);
            return a2;
        }
        throw null;
    }
    
    public par c() {
        return new par(this.b, this.c, this.d, this.e, this.f, this.g);
    }
    
    public void e(final paq paq) {
        final int b = paq.b;
        boolean b2 = true;
        if (b == 1) {
            if (this.e.valueAt(paq.c()) != -1) {
                b2 = false;
            }
            agot.u(b2);
        }
        this.c.add(paq);
    }
    
    public void f(final ozo ozo, final List list) {
        final int e = aety.e(list.get(0).e);
        if (e != 0) {
            if (e != 1) {
                this.e(new paq(3, list, -1));
                return;
            }
        }
        this.e(new paq(2, list, this.f.size()));
        final pah pah = new pah(this);
        afpc afpc;
        if ((afpc = ((ozr)ozo.d.instance).d) == null) {
            afpc = afpc.a;
        }
        afpd afpd;
        if ((afpd = afpc.e) == null) {
            afpd = afpd.a;
        }
        if ((afpd.b & 0x2) != 0x0) {
            pah.a(ozo);
        }
    }
}

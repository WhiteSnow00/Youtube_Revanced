import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.lang.ref.SoftReference;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardy extends AbstractList
{
    dpz a;
    dps[] b;
    drf c;
    drn d;
    private SoftReference[] e;
    private List f;
    private Map g;
    private int[] h;
    private int i;
    
    public ardy(final long n, final dpz a, dps... b) {
        this.c = null;
        this.d = null;
        this.g = new HashMap();
        this.i = -1;
        this.a = a;
        this.b = b;
        for (final drf c : arfp.b(a, "moov[0]/trak")) {
            if (c.n().a == n) {
                this.c = c;
            }
        }
        if (this.c != null) {
            for (final drn d : arfp.b(a, "moov[0]/mvex[0]/trex")) {
                if (d.a == this.c.n().a) {
                    this.d = d;
                }
            }
            this.e = new SoftReference[this.size()];
            if (this.f == null) {
                final ArrayList f = new ArrayList();
                final Iterator iterator3 = this.a.j(drl.class).iterator();
                while (iterator3.hasNext()) {
                    for (final drp drp : ((ardh)iterator3.next()).j(drp.class)) {
                        if (drp.l().a == this.c.n().a) {
                            f.add(drp);
                        }
                    }
                }
                b = this.b;
                this.f = f;
                this.h = new int[f.size()];
                int n2 = 1;
                for (int i = 0; i < this.f.size(); ++i) {
                    this.h[i] = n2;
                    final List j = ((ardh)this.f.get(i)).i();
                    int k = 0;
                    int n3 = 0;
                    while (k < j.size()) {
                        final dpu dpu = j.get(k);
                        int n4 = n3;
                        if (dpu instanceof drs) {
                            n4 = n3 + aqqm.q(((drs)dpu).k());
                        }
                        ++k;
                        n3 = n4;
                    }
                    n2 += n3;
                }
            }
            return;
        }
        final StringBuilder sb = new StringBuilder(52);
        sb.append("This MP4 does not contain track ");
        sb.append(n);
        throw new RuntimeException(sb.toString());
    }
    
    @Override
    public final int size() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        final Iterator iterator = this.a.j(drl.class).iterator();
        int j = 0;
        while (iterator.hasNext()) {
            final Iterator iterator2 = ((ardh)iterator.next()).j(drp.class).iterator();
            int n = j;
            while (true) {
                j = n;
                if (!iterator2.hasNext()) {
                    break;
                }
                final drp drp = (drp)iterator2.next();
                if (drp.l().a != this.c.n().a) {
                    continue;
                }
                n += (int)((drs)((ardh)drp).j(drs.class).get(0)).k();
            }
        }
        final int length = this.b.length;
        return this.i = j;
    }
}

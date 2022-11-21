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

public final class arjh extends AbstractList
{
    dqd a;
    dpw[] b;
    drj c;
    drr d;
    private SoftReference[] e;
    private List f;
    private Map g;
    private int[] h;
    private int i;
    
    public arjh(final long n, final dqd a, dpw... b) {
        this.c = null;
        this.d = null;
        this.g = new HashMap();
        this.i = -1;
        this.a = a;
        this.b = b;
        for (final drj c : arky.b(a, "moov[0]/trak")) {
            if (c.n().a == n) {
                this.c = c;
            }
        }
        if (this.c != null) {
            for (final drr d : arky.b(a, "moov[0]/mvex[0]/trex")) {
                if (d.a == this.c.n().a) {
                    this.d = d;
                }
            }
            this.e = new SoftReference[this.size()];
            if (this.f == null) {
                final ArrayList f = new ArrayList();
                final Iterator iterator3 = this.a.j((Class)drp.class).iterator();
                while (iterator3.hasNext()) {
                    for (final drt drt : ((ariq)iterator3.next()).j(drt.class)) {
                        if (drt.l().a == this.c.n().a) {
                            f.add(drt);
                        }
                    }
                }
                b = this.b;
                this.f = f;
                this.h = new int[f.size()];
                int n2 = 1;
                for (int i = 0; i < this.f.size(); ++i) {
                    this.h[i] = n2;
                    final List j = ((ariq)this.f.get(i)).i();
                    int k = 0;
                    int n3 = 0;
                    while (k < j.size()) {
                        final dpy dpy = j.get(k);
                        int n4 = n3;
                        if (dpy instanceof drw) {
                            n4 = n3 + aqvs.o(((drw)dpy).k());
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
    public final /* bridge */ Object get(final int n) {
        final SoftReference softReference = this.e[n];
        if (softReference != null) {
            final arix arix = softReference.get();
            if (arix != null) {
                return arix;
            }
        }
        final int n2 = n + 1;
        int length = this.h.length;
        do {
            --length;
        } while (n2 - this.h[length] < 0);
        final drt drt = this.f.get(length);
        final int n3 = this.h[length];
        final drp drp = (drp)((arin)drt).m;
        final Iterator iterator = ((ariq)drt).i().iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            final dpy dpy = (dpy)iterator.next();
            if (dpy instanceof drw) {
                final drw drw = (drw)dpy;
                final int size = drw.c.size();
                final int n5 = n2 - n3 - n4;
                if (size >= n5) {
                    final List c = drw.c;
                    final dru l = drt.l();
                    final boolean p = drw.p();
                    final int r = ((ario)l).r();
                    long b = 0L;
                    long n6;
                    if (!p) {
                        if ((r & 0x10) != 0x0) {
                            n6 = l.d;
                        }
                        else {
                            final drr d = this.d;
                            if (d == null) {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                            n6 = d.c;
                        }
                    }
                    else {
                        n6 = 0L;
                    }
                    final SoftReference softReference2 = this.g.get(drw);
                    ByteBuffer byteBuffer;
                    if (softReference2 != null) {
                        byteBuffer = (ByteBuffer)softReference2.get();
                    }
                    else {
                        byteBuffer = null;
                    }
                    ByteBuffer h = byteBuffer;
                    if (byteBuffer == null) {
                        dqd m = (dqd)drp;
                        if ((((ario)l).r() & 0x1) != 0x0) {
                            b = l.b;
                            m = ((arin)drp).m;
                        }
                        long n7 = b;
                        if (drw.l()) {
                            n7 = b + drw.a;
                        }
                        final Iterator iterator2 = c.iterator();
                        int n8 = 0;
                        while (iterator2.hasNext()) {
                            final drv drv = (drv)iterator2.next();
                            if (p) {
                                n8 += (int)drv.b;
                            }
                            else {
                                n8 += (int)n6;
                            }
                        }
                        final long n9 = n8;
                        try {
                            h = m.h(n7, n9);
                            this.g.put(drw, new SoftReference(h));
                        }
                        catch (final IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    int n10 = 0;
                    for (int i = 0; i < n5; ++i) {
                        long n11;
                        if (p) {
                            n11 = n10 + c.get(i).b;
                        }
                        else {
                            n11 = n10 + n6;
                        }
                        n10 = (int)n11;
                    }
                    if (p) {
                        n6 = c.get(n5).b;
                    }
                    final arix arix = new arjg(n6, h, n10);
                    this.e[n] = new SoftReference(arix);
                    return arix;
                }
                n4 += drw.c.size();
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }
    
    @Override
    public final int size() {
        final int i = this.i;
        if (i != -1) {
            return i;
        }
        final Iterator iterator = this.a.j((Class)drp.class).iterator();
        int j = 0;
        while (iterator.hasNext()) {
            final Iterator iterator2 = ((ariq)iterator.next()).j(drt.class).iterator();
            int n = j;
            while (true) {
                j = n;
                if (!iterator2.hasNext()) {
                    break;
                }
                final drt drt = (drt)iterator2.next();
                if (drt.l().a != this.c.n().a) {
                    continue;
                }
                n += (int)((drw)((ariq)drt).j(drw.class).get(0)).k();
            }
        }
        final int length = this.b.length;
        return this.i = j;
    }
}

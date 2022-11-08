import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dre extends ardf
{
    static final Map a;
    public List b;
    
    static {
        a = new WeakHashMap();
    }
    
    public dre() {
        super("stts");
        this.b = Collections.emptyList();
    }
    
    public static long[] k(final List list) {
        monitorenter(dre.class);
        try {
            final SoftReference softReference = dre.a.get(list);
            if (softReference != null) {
                final long[] array = (long[])softReference.get();
                if (array != null) {
                    monitorexit(dre.class);
                    return array;
                }
            }
            final Iterator iterator = list.iterator();
            long n = 0L;
            while (iterator.hasNext()) {
                n += ((drd)iterator.next()).a;
            }
            final long[] array2 = new long[(int)n];
            final Iterator iterator2 = list.iterator();
            int n2 = 0;
            while (iterator2.hasNext()) {
                final drd drd = (drd)iterator2.next();
                int n3 = 0;
                int n4 = n2;
                while (true) {
                    n2 = n4;
                    if (n3 >= drd.a) {
                        break;
                    }
                    array2[n4] = drd.b;
                    ++n3;
                    ++n4;
                }
            }
            dre.a.put(list, new SoftReference(array2));
            monitorexit(dre.class);
            return array2;
        }
        finally {
            monitorexit(dre.class);
            while (true) {}
        }
    }
    
    protected final long h() {
        return this.b.size() * 8 + 8;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        final int q = aqqm.q(clm.w(byteBuffer));
        this.b = new ArrayList(q);
        for (int i = 0; i < q; ++i) {
            this.b.add(new drd(clm.w(byteBuffer), clm.w(byteBuffer)));
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        clm.m(byteBuffer, (long)this.b.size());
        for (final drd drd : this.b) {
            clm.m(byteBuffer, drd.a);
            clm.m(byteBuffer, drd.b);
        }
    }
    
    public final String toString() {
        final int size = this.b.size();
        final StringBuilder sb = new StringBuilder(39);
        sb.append("TimeToSampleBox[entryCount=");
        sb.append(size);
        sb.append("]");
        return sb.toString();
    }
}

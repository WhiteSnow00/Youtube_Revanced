import java.util.Map;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abxr extends abxh
{
    final aheu a;
    private final afgh b;
    private final boolean c;
    
    public abxr(final aheu a, final long n, final long n2, final boolean b, final List list, final String s, final boolean c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.a = a;
        super(n, n2, b, s);
        this.b = afgh.o(list);
        this.c = c;
    }
    
    protected final void b(final boolean b, final boolean b2, final boolean b3) {
        final afgh b4 = this.b;
        for (int size = b4.size(), i = 0; i < size; ++i) {
            final ajdn ajdn = b4.get(i);
            final abxq abxq = ((Map<K, abxq>)this.a.b).get(ajdm.a(ajdn.b));
            if (abxq != null) {
                abxq.a(ajdn);
            }
        }
        if (this.c) {
            final abxg p3 = ((abvr)this.a.a).p();
            abxj e;
            if (p3 != null) {
                e = p3.e();
            }
            else {
                e = null;
            }
            if (e != null) {
                e.k((abxh)this);
            }
        }
    }
}

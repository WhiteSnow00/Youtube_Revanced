import java.util.Map;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abwi extends abvy
{
    final aanx a;
    private final afeq b;
    private final boolean c;
    
    public abwi(final aanx a, final long n, final long n2, final boolean b, final List list, final String s, final boolean c, final byte[] array) {
        this.a = a;
        super(n, n2, b, s);
        this.b = afeq.o((Collection)list);
        this.c = c;
    }
    
    protected final void b(final boolean b, final boolean b2, final boolean b3) {
        final afeq b4 = this.b;
        for (int size = ((List)b4).size(), i = 0; i < size; ++i) {
            final ajbp ajbp = (ajbp)((List)b4).get(i);
            final abwh abwh = ((Map<K, abwh>)this.a.b).get(ajbo.a(ajbp.b));
            if (abwh != null) {
                abwh.a(ajbp);
            }
        }
        if (this.c) {
            final abvx p3 = ((abuh)this.a.a).p();
            abwa e;
            if (p3 != null) {
                e = p3.e();
            }
            else {
                e = null;
            }
            if (e != null) {
                e.k((abvy)this);
            }
        }
    }
}

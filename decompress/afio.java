import java.util.Set;
import java.util.Iterator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class afio implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    final int[] b;
    
    public afio(final afhr afhr) {
        final affn affn = (affn)afhr;
        final int size = ((Set)affn.p()).size();
        this.a = new Object[size];
        this.b = new int[size];
        final Iterator<Object> iterator = ((Set<Object>)affn.p()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final afhs afhs = iterator.next();
            this.a[n] = afhs.a;
            this.b[n] = afhs.a();
            ++n;
        }
    }
    
    Object readResolve() {
        final affk affk = new affk(this.a.length);
        int n = 0;
        while (true) {
            final Object[] a = this.a;
            if (n >= a.length) {
                break;
            }
            affk.d(a[n], this.b[n]);
            ++n;
        }
        return affk.a();
    }
}

import java.util.Collection;
import java.util.Iterator;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aayp implements aayq
{
    public final atie a;
    public final atie b;
    private final List c;
    
    public aayp() {
        this.c = new ArrayList();
        this.a = (atie)atig.aD();
        this.b = (atie)atig.aD();
    }
    
    public final asgt a() {
        return ((asgt)this.a).J().p();
    }
    
    public final asgt b() {
        return ((asgt)this.b).J();
    }
    
    public final Optional c(final long n) {
        final Optional empty = Optional.empty();
        final Iterator iterator = this.c.iterator();
        aayo aayo;
        do {
            final Optional of = empty;
            if (!iterator.hasNext()) {
                return of;
            }
            aayo = (aayo)iterator.next();
        } while (aayo.a > n || aayo.b <= n);
        final akbe d = aayo.d;
        if (d == null) {
            throw new NullPointerException("Null icon");
        }
        final CharSequence c = aayo.c;
        if (c != null) {
            return Optional.of((Object)new aaya(c, d));
        }
        throw new NullPointerException("Null label");
    }
    
    public final void d(final afcr afcr) {
        this.c.clear();
        final int size = ((List)afcr).size();
        int i = 0;
        while (i < size) {
            final aayc aayc = ((List<aayc>)afcr).get(i);
            ++i;
            if (aayc instanceof aayg) {
                this.c.addAll((Collection)((aayg)aayc).b);
                break;
            }
        }
    }
}

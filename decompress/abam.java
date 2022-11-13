import java.util.Collection;
import java.util.Iterator;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abam implements aban
{
    public final atiw a;
    public final atiw b;
    private final List c;
    
    public abam() {
        this.c = new ArrayList();
        this.a = (atiw)atiy.aE();
        this.b = (atiw)atiy.aE();
    }
    
    public final ashi a() {
        return ((ashi)this.a).J().p();
    }
    
    public final ashi b() {
        return ((ashi)this.b).J();
    }
    
    public final Optional c(final long n) {
        final Optional empty = Optional.empty();
        final Iterator iterator = this.c.iterator();
        abal abal;
        do {
            final Optional of = empty;
            if (!iterator.hasNext()) {
                return of;
            }
            abal = (abal)iterator.next();
        } while (abal.a > n || abal.b <= n);
        final akdh d = abal.d;
        if (d == null) {
            throw new NullPointerException("Null icon");
        }
        final CharSequence c = abal.c;
        if (c != null) {
            return Optional.of((Object)new aazx(c, d));
        }
        throw new NullPointerException("Null label");
    }
    
    public final void d(final afeq afeq) {
        this.c.clear();
        final int size = ((List)afeq).size();
        int i = 0;
        while (i < size) {
            final aazz aazz = ((List<aazz>)afeq).get(i);
            final boolean b = aazz instanceof abad;
            ++i;
            if (b) {
                this.c.addAll((Collection)((abad)aazz).b);
                break;
            }
        }
    }
}

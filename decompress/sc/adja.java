import j$.util.function.Predicate$_CC;
import java.io.File;
import java.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adja implements Predicate
{
    public final File a;
    public final boolean b;
    public final String c;
    
    public adja(final File a, final boolean b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Predicate and(final Predicate predicate) {
        return Predicate$_CC.$default$and((Predicate)this, predicate);
    }
    
    @Override
    public final Predicate negate() {
        return Predicate$_CC.$default$negate((Predicate)this);
    }
    
    @Override
    public final Predicate or(final Predicate predicate) {
        return Predicate$_CC.$default$or((Predicate)this, predicate);
    }
    
    @Override
    public final boolean test(final Object o) {
        final File a = this.a;
        final boolean b = this.b;
        final String c = this.c;
        final File file = (File)o;
        final boolean equals = file.getName().equals(a.getName());
        boolean b2 = true;
        if (!equals) {
            if (b) {
                if (!file.getName().contains(c)) {
                    return false;
                }
                b2 = b2;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
}

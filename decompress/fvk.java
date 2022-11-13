import j$.util.function.Predicate$_CC;
import java.util.function.Predicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvk implements Predicate
{
    public final fvn a;
    public final float b;
    
    public fvk(final fvn a, final float b) {
        this.a = a;
        this.b = b;
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
        final fvn a = this.a;
        final float b = this.b;
        final wyw wyw = (wyw)o;
        return a.n.nextFloat() < b;
    }
}

import j$.util.function.IntPredicate$_CC;
import java.util.function.IntPredicate;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbi implements IntPredicate
{
    public final vhh[] a;
    public final String b;
    
    public abbi(final vhh[] a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final IntPredicate and(final IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$and((IntPredicate)this, intPredicate);
    }
    
    @Override
    public final IntPredicate negate() {
        return IntPredicate$_CC.$default$negate((IntPredicate)this);
    }
    
    @Override
    public final IntPredicate or(final IntPredicate intPredicate) {
        return IntPredicate$_CC.$default$or((IntPredicate)this, intPredicate);
    }
    
    @Override
    public final boolean test(final int n) {
        return this.a[n].a.equals(this.b);
    }
}

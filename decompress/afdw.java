import java.util.Iterator;
import j$.util.function.BiFunction$_CC;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.BinaryOperator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afdw implements BinaryOperator
{
    public static final afdw a;
    public static final afdw b;
    public static final afdw c;
    public static final afdw d;
    private final int e;
    
    static {
        d = new afdw(3);
        c = new afdw(2);
        b = new afdw(1);
        a = new afdw(0);
    }
    
    private afdw(final int e) {
        this.e = e;
    }
    
    @Override
    public final BiFunction andThen(final Function function) {
        final int e = this.e;
        if (e == 0) {
            return BiFunction$_CC.$default$andThen((BiFunction)this, function);
        }
        if (e == 1) {
            return BiFunction$_CC.$default$andThen((BiFunction)this, function);
        }
        if (e != 2) {
            return BiFunction$_CC.$default$andThen((BiFunction)this, function);
        }
        return BiFunction$_CC.$default$andThen((BiFunction)this, function);
    }
    
    @Override
    public final Object apply(final Object o, final Object o2) {
        final int e = this.e;
        if (e == 0) {
            final afgc afgc = (afgc)o;
            final afgc afgc2 = (afgc)o2;
            afgc.a(afgc2.a, afgc2.b);
            return afgc;
        }
        if (e == 1) {
            final adgg adgg = (adgg)o;
            final Iterator<Object> iterator = ((Iterable<Object>)((adgg)o2).a).iterator();
            while (iterator.hasNext()) {
                adgg.L((afjt)iterator.next());
            }
            return adgg;
        }
        if (e != 2) {
            final afgj afgj = (afgj)o;
            afgj.h((afgj)o2);
            return afgj;
        }
        final afhi afhi = (afhi)o;
        afhi.l((afhi)o2);
        return afhi;
    }
}

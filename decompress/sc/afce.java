import java.util.Iterator;
import j$.util.function.BiFunction$_CC;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.BinaryOperator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afce implements BinaryOperator
{
    public static final afce a;
    public static final afce b;
    public static final afce c;
    public static final afce d;
    private final int e;
    
    static {
        d = new afce(3);
        c = new afce(2);
        b = new afce(1);
        a = new afce(0);
    }
    
    private afce(final int e) {
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
            final afel afel = (afel)o;
            final afel afel2 = (afel)o2;
            afel.a(afel2.a, afel2.b);
            return afel;
        }
        if (e == 1) {
            final adet adet = (adet)o;
            final Iterator<Object> iterator = ((Iterable<Object>)((adet)o2).a).iterator();
            while (iterator.hasNext()) {
                adet.O(iterator.next());
            }
            return adet;
        }
        if (e != 2) {
            final afes afes = (afes)o;
            afes.h((afes)o2);
            return afes;
        }
        final affr affr = (affr)o;
        affr.l((affr)o2);
        return affr;
    }
}

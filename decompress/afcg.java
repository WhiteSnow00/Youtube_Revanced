import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcg implements Function
{
    public static final afcg a;
    public static final afcg b;
    public static final afcg c;
    private final int d;
    
    static {
        c = new afcg(2);
        b = new afcg(1);
        a = new afcg(0);
    }
    
    private afcg(final int d) {
        this.d = d;
    }
    
    @Override
    public final Function andThen(final Function function) {
        final int d = this.d;
        if (d == 0) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (d != 1) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final int d = this.d;
        if (d == 0) {
            return ((affr)o).g();
        }
        if (d != 1) {
            return ((afes)o).b();
        }
        return ((afel)o).g();
    }
    
    @Override
    public final Function compose(final Function function) {
        final int d = this.d;
        if (d == 0) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (d != 1) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        return Function$_CC.$default$compose((Function)this, function);
    }
}

import j$.util.function.Function$_CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsr implements UnaryOperator
{
    public final double a;
    public final ahcf b;
    
    public adsr(final double a, final ahcf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Function andThen(final Function function) {
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final double a = this.a;
        final ahcf b = this.b;
        final ahcr ahcr = (ahcr)o;
        ahcr.copyOnWrite();
        final agvz agvz = (agvz)ahcr.instance;
        final agvz a2 = agvz.a;
        agvz.f = a;
        ahcr.copyOnWrite();
        final agvz agvz2 = (agvz)ahcr.instance;
        b.getClass();
        agvz2.c = b;
        return ahcr;
    }
    
    @Override
    public final Function compose(final Function function) {
        return Function$_CC.$default$compose((Function)this, function);
    }
}

import j$.util.function.Function$_CC;
import java.util.function.Function;
import j$.time.Duration;
import java.util.function.UnaryOperator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adss implements UnaryOperator
{
    public final String a;
    public final Duration b;
    
    public adss(final String a, final Duration b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Function andThen(final Function function) {
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final String a = this.a;
        final Duration b = this.b;
        final ahcr ahcr = (ahcr)o;
        ahcr.copyOnWrite();
        final agvz agvz = (agvz)ahcr.instance;
        final agvz a2 = agvz.a;
        agvz.b = a;
        final ahcf as = adzw.as(b);
        ahcr.copyOnWrite();
        final agvz agvz2 = (agvz)ahcr.instance;
        as.getClass();
        agvz2.c = as;
        ahcr.copyOnWrite();
        ((agvz)ahcr.instance).e = agsk.b(4);
        return ahcr;
    }
    
    @Override
    public final Function compose(final Function function) {
        return Function$_CC.$default$compose((Function)this, function);
    }
}

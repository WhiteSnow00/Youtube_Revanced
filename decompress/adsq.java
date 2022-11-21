import j$.util.function.Function$_CC;
import java.util.function.Function;
import j$.time.Duration;
import java.util.function.UnaryOperator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adsq implements UnaryOperator
{
    public final Object a;
    private final int b;
    
    public adsq(final Duration a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adsq(final UnaryOperator a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adsq(final vlv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Function andThen(final Function function) {
        final int b = this.b;
        if (b == 0) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b == 1) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b == 2) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b == 3) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b == 4) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        if (b != 5) {
            return Function$_CC.$default$andThen((Function)this, function);
        }
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final int b = this.b;
        if (b == 0) {
            return ((Function<ahcr, ahcr>)this.a).apply(((ahcz)o).toBuilder()).build();
        }
        if (b == 1) {
            final Object a = this.a;
            String c;
            if ((c = (String)o) == null) {
                c = ((vlv)a).c();
            }
            return c;
        }
        if (b == 2) {
            final Object a2 = this.a;
            final ahcr ahcr = (ahcr)o;
            final ahcf as = adzw.as((Duration)a2);
            ahcr.copyOnWrite();
            final agvz agvz = (agvz)ahcr.instance;
            final agvz a3 = agvz.a;
            as.getClass();
            agvz.c = as;
            return ahcr;
        }
        if (b == 3) {
            final Object a4 = this.a;
            final ahcr ahcr2 = (ahcr)o;
            final ahcf as2 = adzw.as((Duration)a4);
            ahcr2.copyOnWrite();
            final agvz agvz2 = (agvz)ahcr2.instance;
            final agvz a5 = agvz.a;
            as2.getClass();
            agvz2.c = as2;
            ahcr2.copyOnWrite();
            ((agvz)ahcr2.instance).e = agsk.b(3);
            return ahcr2;
        }
        if (b == 4) {
            final Object a6 = this.a;
            final ahcr ahcr3 = (ahcr)o;
            ahcr3.copyOnWrite();
            final agvz agvz3 = (agvz)ahcr3.instance;
            final agvz a7 = agvz.a;
            agvz3.e = agsk.b(5);
            final ahcf as3 = adzw.as((Duration)a6);
            ahcr3.copyOnWrite();
            final agvz agvz4 = (agvz)ahcr3.instance;
            as3.getClass();
            agvz4.c = as3;
            return ahcr3;
        }
        if (b != 5) {
            final Object a8 = this.a;
            final ahcr ahcr4 = (ahcr)o;
            final ahcf as4 = adzw.as((Duration)a8);
            ahcr4.copyOnWrite();
            final agvz agvz5 = (agvz)ahcr4.instance;
            final agvz a9 = agvz.a;
            as4.getClass();
            agvz5.c = as4;
            ahcr4.copyOnWrite();
            ((agvz)ahcr4.instance).e = agsk.b(4);
            return ahcr4;
        }
        final Object a10 = this.a;
        final ahcr ahcr5 = (ahcr)o;
        final ahcf as5 = adzw.as((Duration)a10);
        ahcr5.copyOnWrite();
        final agvz agvz6 = (agvz)ahcr5.instance;
        final agvz a11 = agvz.a;
        as5.getClass();
        agvz6.c = as5;
        ahcr5.copyOnWrite();
        ((agvz)ahcr5.instance).e = agsk.b(6);
        return ahcr5;
    }
    
    @Override
    public final Function compose(final Function function) {
        final int b = this.b;
        if (b == 0) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b == 1) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b == 2) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b == 3) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b == 4) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        if (b != 5) {
            return Function$_CC.$default$compose((Function)this, function);
        }
        return Function$_CC.$default$compose((Function)this, function);
    }
}

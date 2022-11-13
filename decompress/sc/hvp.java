import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvp implements Function
{
    public final boolean a;
    public final gak b;
    
    public hvp(final boolean a, final gak b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Function andThen(final Function function) {
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    @Override
    public final Object apply(final Object o) {
        final boolean a = this.a;
        final gak b = this.b;
        final adqw adqw = (adqw)o;
        final int cu = hwl.cU;
        if (a) {
            adqw.j(b);
        }
        return adqw;
    }
    
    @Override
    public final Function compose(final Function function) {
        return Function$_CC.$default$compose((Function)this, function);
    }
}

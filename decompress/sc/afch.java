import j$.util.function.BiConsumer$_CC;
import j$.util.stream.Collector;
import java.util.function.Function;
import java.util.function.BiConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afch implements BiConsumer
{
    public final Function a;
    public final Function b;
    
    public afch(final Function a, final Function b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void accept(final Object o, final Object o2) {
        final Function a = this.a;
        final Function b = this.b;
        final afes afes = (afes)o;
        final Collector a2 = afci.a;
        afes.g(a.apply(o2), b.apply(o2));
    }
    
    @Override
    public final BiConsumer andThen(final BiConsumer biConsumer) {
        return BiConsumer$_CC.$default$andThen((BiConsumer)this, biConsumer);
    }
}

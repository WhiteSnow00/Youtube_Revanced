import j$.util.function.BiConsumer$_CC;
import java.util.function.BiConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcf implements BiConsumer
{
    public static final afcf a;
    public static final afcf b;
    public static final afcf c;
    private final int d;
    
    static {
        c = new afcf(2);
        b = new afcf(1);
        a = new afcf(0);
    }
    
    private afcf(final int d) {
        this.d = d;
    }
    
    @Override
    public final void accept(final Object o, final Object o2) {
        final int d = this.d;
        if (d == 0) {
            ((affr)o).h(o2);
            return;
        }
        if (d != 1) {
            ((adet)o).O((afid)o2);
            return;
        }
        ((afel)o).h(o2);
    }
    
    @Override
    public final BiConsumer andThen(final BiConsumer biConsumer) {
        final int d = this.d;
        if (d == 0) {
            return BiConsumer$_CC.$default$andThen((BiConsumer)this, biConsumer);
        }
        if (d != 1) {
            return BiConsumer$_CC.$default$andThen((BiConsumer)this, biConsumer);
        }
        return BiConsumer$_CC.$default$andThen((BiConsumer)this, biConsumer);
    }
}

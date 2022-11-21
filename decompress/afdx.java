import j$.util.function.BiConsumer$_CC;
import java.util.function.BiConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afdx implements BiConsumer
{
    public static final afdx a;
    public static final afdx b;
    public static final afdx c;
    private final int d;
    
    static {
        c = new afdx(2);
        b = new afdx(1);
        a = new afdx(0);
    }
    
    private afdx(final int d) {
        this.d = d;
    }
    
    @Override
    public final void accept(final Object o, final Object o2) {
        final int d = this.d;
        if (d == 0) {
            ((afhi)o).h(o2);
            return;
        }
        if (d != 1) {
            ((adgg)o).L((afjt)o2);
            return;
        }
        ((afgc)o).h(o2);
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

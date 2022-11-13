import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izb implements Consumer
{
    public final boolean a;
    public final boolean b;
    private final int c;
    
    public izb(final boolean a, final boolean b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void accept(final Object o) {
        if (this.c != 0) {
            ((fpn)o).p(this.a, this.b);
            return;
        }
        ((fpn)o).x(this.a, this.b);
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        if (this.c != 0) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}

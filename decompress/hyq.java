import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyq implements abmf
{
    public final CopyOnWriteArraySet a;
    public final AtomicInteger b;
    public final vwa c;
    private final Executor d;
    
    public hyq(final Executor d, final vwa c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new AtomicInteger(0);
        this.c = c;
        this.d = d;
        this.a = new CopyOnWriteArraySet();
    }
    
    public final void sG(final abmi abmi) {
        if (this.b.get() == 0) {
            this.d.execute(new hvt(this, 5));
        }
        if (this.b.get() == 2) {
            abmi.X.addAll(this.a);
            return;
        }
        abmi.X.add(0);
    }
}

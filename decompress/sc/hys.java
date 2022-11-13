import java.util.List;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArraySet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hys implements vws
{
    public final CopyOnWriteArraySet a;
    public final AtomicInteger b;
    public final vwa c;
    private final Executor d;
    private final vaf e;
    
    public hys(final Executor d, final vwa c, final vaf e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = new AtomicInteger(0);
        this.c = c;
        this.d = d;
        this.a = new CopyOnWriteArraySet();
        this.e = e;
    }
    
    public final void oM(final vwv vwv) {
        final aipx b = this.e.b();
        int i = 0;
        if (b != null) {
            alxp alxp;
            if ((alxp = b.e) == null) {
                alxp = alxp.a;
            }
            if (alxp.be) {
                for (afeq c = this.c.c(); i < ((afih)c).c; ++i) {
                    vwv.w((int)((List)c).get(i));
                }
                return;
            }
        }
        if (this.b.get() == 0) {
            this.d.execute(new hvt(this, 6));
        }
        if (this.b.get() == 2) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                vwv.w((int)iterator.next());
            }
            return;
        }
        vwv.w(0);
    }
}

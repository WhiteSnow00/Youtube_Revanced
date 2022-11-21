import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arad implements Runnable
{
    private final int a;
    private final Object b;
    private final Object c;
    
    public arad(final aqvr b, final aqzv c, final int a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public arad(final askk c, final askm b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public arad(final ListenableFuture c, final atsv b, final int a) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public arad(final tmy b, final alo c, final int a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final int a = this.a;
        if (a == 0) {
            ((aqvr)this.b).a((aqzv)this.c);
            return;
        }
        if (a != 1) {
            if (a != 2) {
                if (((ListenableFuture)this.c).isCancelled()) {
                    ((atsv)this.b).c(null);
                    return;
                }
                try {
                    ((atov)this.b).resumeWith(aewr.G((Future)this.c));
                    return;
                }
                catch (final ExecutionException ex) {
                    ((atov)this.b).resumeWith(areq.H(atyb.b(ex)));
                    return;
                }
            }
            ((askm)this.b).ag((askk)this.c);
            return;
        }
        if (((alo)this.c).l()) {
            ((tmy)this.b).rL(((alo)this.c).c);
            return;
        }
        ((tmy)this.b).m((dbm)((alo)this.c).a);
    }
}

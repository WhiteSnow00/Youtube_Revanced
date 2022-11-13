import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.SettableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aelz implements Runnable
{
    public final aemc a;
    public final SettableFuture b;
    public final aema c;
    
    public aelz(final aemc a, final SettableFuture b, final aema c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final aemc a = this.a;
        final SettableFuture b = this.b;
        final aema c = this.c;
        try {
            a.c.set(afwm.u((Future)b));
            c.setFuture((ListenableFuture)a.c);
        }
        finally {
            c.setFuture((ListenableFuture)b);
        }
    }
}

import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvi implements Runnable
{
    public final afvk a;
    public final ListenableFuture b;
    public final int c;
    
    public afvi(final afvk a, final ListenableFuture b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final afvk a = this.a;
        final ListenableFuture b = this.b;
        final int c = this.c;
        try {
            if (b.isCancelled()) {
                a.a = null;
                ((afvd)a).cancel(false);
            }
            else {
                a.e(c, (Future)b);
            }
        }
        finally {
            a.f((affy)null);
        }
    }
}

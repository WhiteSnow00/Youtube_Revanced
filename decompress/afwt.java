import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afwt implements Runnable
{
    public Object a;
    public Object b;
    private final int c;
    
    public afwt(final afvp a, final Executor b, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public afwt(final ListenableFuture a, final Future b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (this.c == 0) {
            afxr.w((ListenableFuture)this.a, (Future)this.b);
        }
        this.a = null;
        this.b = null;
    }
}

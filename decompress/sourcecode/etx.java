import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

@rxl(b = ahnh.h, d = { sct.class, scn.class, sdj.class })
public final class etx extends rqd
{
    public final qbo a;
    private final Executor b;
    private final Executor c;
    private final sfh d;
    
    public etx(final wtl wtl, final qbo a, final Executor b, final Executor c, final sfh d, final byte[] array, final byte[] array2, final byte[] array3) {
        super(wtl, (byte[])null, (byte[])null);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final ListenableFuture listenableFuture = (ListenableFuture)this.d.d((Class)sdj.class);
        final etw etw = new etw(this, listenableFuture, 0);
        if (listenableFuture.isDone()) {
            this.f.k((aexg)etw);
            return;
        }
        this.f.i((aexg)etw, this.b, this.c);
    }
}

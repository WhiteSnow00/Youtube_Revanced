import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqq implements iqk
{
    public final zmf a;
    public final Executor b;
    public final jki c;
    public final aln d;
    
    public iqq(final zmf a, final aln d, final jki c, final Executor b, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final ListenableFuture g() {
        synchronized (this) {
            return aftq.f((ListenableFuture)afvk.m(this.d.w(this.a.c().b())), (aftz)new ila(this, 7), this.b);
        }
    }
}

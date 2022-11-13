import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agog extends arbu
{
    public final arbu a;
    private final aeup b;
    
    public agog(final arbu a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = aeup.b();
    }
    
    private final void H(final Runnable runnable) {
        if (!aeux.r()) {
            aeun.g((aett)this.b.a, runnable).run();
            return;
        }
        runnable.run();
    }
    
    @Override
    public final void a(final Status status, final arwk arwk) {
        this.H((Runnable)new adlo(this, status, arwk, 16));
    }
    
    @Override
    public final void b(final arwk arwk) {
        this.H((Runnable)new agjf(this, arwk, 11));
    }
    
    @Override
    public final void c(final Object o) {
        this.H((Runnable)new agjf(this, o, 10));
    }
    
    @Override
    public final void d() {
        this.H((Runnable)new aeue(this.a, 18, (byte[])null, (byte[])null));
    }
}

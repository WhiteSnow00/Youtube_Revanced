import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agoa extends arbu
{
    public boolean a;
    public final agod b;
    public final arbu c;
    
    public agoa(final agod b, final arbu c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = false;
        this.c = c;
    }
    
    @Override
    public final void a(final Status status, final arwk arwk) {
        this.b.a.execute((Runnable)new adlo(this, status, arwk, 15));
    }
    
    @Override
    public final void b(final arwk arwk) {
        this.b.a.execute((Runnable)new agjf(this, arwk, 8));
    }
    
    @Override
    public final void c(final Object o) {
        this.b.a.execute((Runnable)new agjf(this, o, 9));
    }
    
    @Override
    public final void d() {
        this.b.a.execute((Runnable)new aeue(this, 17));
    }
}

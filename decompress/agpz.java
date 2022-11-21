import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpz extends arxu
{
    public final arxu a;
    private final aewh b;
    
    public agpz(final arxu a, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = aewh.b();
    }
    
    private final void w(final Runnable runnable) {
        if (!aewp.r()) {
            aewf.g(this.b.a, runnable).run();
            return;
        }
        runnable.run();
    }
    
    @Override
    public final void a(final Status status, final arze arze) {
        this.w(new aegq(this, status, arze, 14));
    }
    
    @Override
    public final void b(final arze arze) {
        this.w(new afaa(this, arze, 13));
    }
    
    @Override
    public final void c(final Object o) {
        this.w(new afaa(this, o, 12));
    }
    
    @Override
    public final void d() {
        this.w(new aevy(this.a, 18, null, null));
    }
}

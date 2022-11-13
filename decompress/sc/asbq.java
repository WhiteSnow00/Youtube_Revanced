import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class asbq implements asae
{
    public asbq() {
    }
    
    @Override
    public void a(final Status status, final asad asad, final arwk arwk) {
        throw null;
    }
    
    protected abstract asae b();
    
    @Override
    public final void c(final arwk arwk) {
        this.b().c(arwk);
    }
    
    @Override
    public final void d(final asft asft) {
        this.b().d(asft);
    }
    
    @Override
    public final void e() {
        this.b().e();
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("delegate", (Object)this.b());
        return ab.toString();
    }
}

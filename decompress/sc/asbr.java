import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class asbr implements asan
{
    public asbr() {
    }
    
    protected abstract asan a();
    
    public final arvf c() {
        return this.a().c();
    }
    
    public final Runnable d(final asdp asdp) {
        return this.a().d(asdp);
    }
    
    public void j(final Status status) {
        this.a().j(status);
    }
    
    public void k(final Status status) {
        this.a().k(status);
    }
    
    public asac l(final arwo arwo, final arwk arwk, final artx artx, final arva[] array) {
        throw null;
    }
    
    public final artu m() {
        return this.a().m();
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("delegate", (Object)this.a());
        return ab.toString();
    }
}

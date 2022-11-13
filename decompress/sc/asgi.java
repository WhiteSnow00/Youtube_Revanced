// 
// Decompiled by Procyon v0.6.0
// 

final class asgi extends aftm
{
    public final arua a;
    
    public asgi(final arua a) {
        this.a = a;
    }
    
    protected final void j() {
        this.a.b("GrpcFuture was cancelled", (Throwable)null);
    }
    
    protected final String ns() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("clientCall", (Object)this.a);
        return ab.toString();
    }
    
    protected final boolean setException(final Throwable exception) {
        return super.setException(exception);
    }
}

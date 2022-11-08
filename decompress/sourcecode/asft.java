// 
// Decompiled by Procyon v0.6.0
// 

final class asft extends afrl
{
    public final arrn a;
    
    public asft(final arrn a) {
        this.a = a;
    }
    
    @Override
    protected final void j() {
        this.a.b("GrpcFuture was cancelled", null);
    }
    
    @Override
    protected final String ns() {
        final aexp o = agot.O((Object)this);
        o.b("clientCall", (Object)this.a);
        return o.toString();
    }
    
    @Override
    protected final boolean setException(final Throwable exception) {
        return super.setException(exception);
    }
}

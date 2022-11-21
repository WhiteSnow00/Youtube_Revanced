import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgj extends arxx
{
    final asgk b;
    
    public asgj(final asgk b) {
        this.b = b;
    }
    
    @Override
    public final asck a() {
        final asgk b = this.b;
        adme.U(true, "config is not set");
        return new asck(Status.OK, (Object)b);
    }
}

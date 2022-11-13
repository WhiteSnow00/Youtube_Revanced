import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agny extends arxu
{
    final mqj a;
    
    public agny(final mqj a) {
        this.a = a;
    }
    
    public final Status a(final int n) {
        Status status;
        if (this.a.d(n)) {
            status = Status.OK;
        }
        else {
            status = Status.f.withDescription("Rejected by (1st-party only) security policy");
        }
        return status;
    }
}

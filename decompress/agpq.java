import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpq extends asao
{
    final mqx a;
    
    public agpq(final mqx a) {
        this.a = a;
    }
    
    @Override
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

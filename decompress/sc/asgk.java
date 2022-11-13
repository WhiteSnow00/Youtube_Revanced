import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgk extends asgj
{
    private final asgq a;
    private boolean b;
    private final asgh c;
    
    public asgk(final asgq a, final asgh c) {
        this.a = a;
        this.c = c;
        if (a instanceof asgo) {
            ((asgo)a).d();
        }
    }
    
    @Override
    public final void H() {
        final asgh c = this.c;
        if (c.c > 0) {
            c.d();
        }
    }
    
    @Override
    public final void a(final Status status, final arwk arwk) {
        if (status.f()) {
            this.a.a();
            return;
        }
        this.a.b((Throwable)status.g());
    }
    
    @Override
    public final void b(final arwk arwk) {
    }
    
    @Override
    public final void c(final Object o) {
        if (this.b && !this.c.b) {
            throw Status.k.withDescription("More than one responses received for unary or client-streaming call").d();
        }
        this.b = true;
        this.a.c(o);
        final asgh c = this.c;
        if (c.b && c.d) {
            c.d();
        }
    }
    
    @Override
    public final void d() {
    }
}

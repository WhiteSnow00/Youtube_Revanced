import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class asgm extends asgj
{
    private final asgi a;
    private Object b;
    private boolean c;
    
    public asgm(final asgi a) {
        this.c = false;
        this.a = a;
    }
    
    @Override
    public final void H() {
        this.a.a.f(2);
    }
    
    @Override
    public final void a(final Status status, final arwk arwk) {
        if (status.f()) {
            if (!this.c) {
                this.a.setException((Throwable)Status.k.withDescription("No value received for unary call").g());
            }
            this.a.set(this.b);
            return;
        }
        this.a.setException((Throwable)status.g());
    }
    
    @Override
    public final void b(final arwk arwk) {
    }
    
    @Override
    public final void c(final Object b) {
        if (!this.c) {
            this.b = b;
            this.c = true;
            return;
        }
        throw Status.k.withDescription("More than one value received for unary call").d();
    }
}

import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzy extends asap
{
    final arzz a;
    
    public arzy(final arzz a) {
        this.a = a;
        super(a.b.d);
    }
    
    public final void a() {
        final int a = asgy.a;
        try {
            final arzz a2 = this.a;
            if (a2.a != null) {
                return;
            }
            try {
                a2.c.d();
            }
            finally {
                final Throwable t;
                this.a.b(Status.b.c(t).withDescription("Failed to call onReady."));
            }
        }
        finally {}
    }
}

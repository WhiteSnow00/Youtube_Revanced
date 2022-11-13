import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzv extends asap
{
    final arwk a;
    final arzz b;
    
    public arzv(final arzz b, final arwk a) {
        this.b = b;
        this.a = a;
        super(b.b.d);
    }
    
    public final void a() {
        final int a = asgy.a;
        try {
            final arzz b = this.b;
            if (b.a != null) {
                return;
            }
            try {
                b.c.b(this.a);
            }
            finally {
                final Throwable t;
                this.b.b(Status.b.c(t).withDescription("Failed to read headers"));
            }
        }
        finally {}
    }
}

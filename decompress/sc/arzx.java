import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzx extends asap
{
    final Status a;
    final arwk b;
    final arzz c;
    
    public arzx(final arzz c, final Status a, final arwk b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(c.b.d);
    }
    
    public final void a() {
        final int a = asgy.a;
        try {
            Status a2 = this.a;
            arwk b = this.b;
            final Status a3 = this.c.a;
            if (a3 != null) {
                b = new arwk();
                a2 = a3;
            }
            this.c.b.f = true;
            try {
                this.c.c.a(a2, b);
            }
            finally {
                this.c.b.e();
                this.c.b.c.a(a2.f());
            }
        }
        finally {}
    }
}

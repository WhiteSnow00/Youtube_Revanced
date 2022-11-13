import io.grpc.Status$Code;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class arzz implements asae
{
    public Status a;
    final asab b;
    public final arbu c;
    
    public arzz(final asab b, final arbu c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Status status, final asad asad, final arwk arwk) {
        final int a = asgy.a;
        try {
            final arup d = this.b.d();
            Status a2 = status;
            arwk arwk2 = arwk;
            if (status.getCode() == Status$Code.b) {
                a2 = status;
                arwk2 = arwk;
                if (d != null) {
                    a2 = status;
                    arwk2 = arwk;
                    if (d.d()) {
                        final ascd ascd = new ascd();
                        this.b.e.b(ascd);
                        a2 = Status.e.a("ClientCall was cancelled at or after deadline. ".concat(ascd.toString()));
                        arwk2 = new arwk();
                    }
                }
            }
            this.b.b.execute((Runnable)new arzx(this, a2, arwk2));
        }
        finally {}
    }
    
    public final void b(final Status a) {
        this.a = a;
        this.b.e.c(a);
    }
    
    @Override
    public final void c(final arwk arwk) {
        final int a = asgy.a;
        try {
            this.b.b.execute((Runnable)new arzv(this, arwk));
        }
        finally {}
    }
    
    @Override
    public final void d(final asft asft) {
        final int a = asgy.a;
        try {
            this.b.b.execute((Runnable)new arzw(this, asft));
        }
        finally {}
    }
    
    @Override
    public final void e() {
        if (this.b.a.a.a()) {
            return;
        }
        final int a = asgy.a;
        try {
            this.b.b.execute((Runnable)new arzy(this));
        }
        finally {}
    }
}

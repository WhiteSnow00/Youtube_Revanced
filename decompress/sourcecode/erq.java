import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class erq
{
    public final Executor a;
    public volatile int b;
    public final long c;
    public final AtomicInteger d;
    private final atjj e;
    private final atjj f;
    
    public erq(final atjj e, final atjj f, final Executor a, final ewl ewl, final tlq tlq) {
        this.e = e;
        this.f = f;
        this.a = a;
        final long e2 = tlq.e(tlq.D);
        this.c = e2;
        if ((0x10L & e2) != 0x0L) {
            this.b = 1;
        }
        else if ((0x2L & e2) != 0x0L) {
            int b;
            if ((e2 & 0x4L) != 0x0L) {
                b = 2;
            }
            else {
                b = 0;
            }
            this.b = b;
            ewl.g().V((asir)new erx(this, 1));
        }
        else {
            this.b = 1;
        }
        this.d = new AtomicInteger();
    }
    
    public final void a(final int n) {
        if (n >= 5) {
            ((aceo)this.f.a()).n();
        }
    }
    
    public final void b(final int n) {
        if (n != 15 && ((this.c & 0x8L) == 0x0L || n < 15)) {
            return;
        }
        ((daw)this.e.a()).b();
    }
}

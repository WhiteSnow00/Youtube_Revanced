import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ert
{
    public final Executor a;
    public volatile int b;
    public final long c;
    public final AtomicInteger d;
    private final atke e;
    private final atke f;
    
    public ert(final atke e, final atke f, final Executor a, final ewp ewp, final tnu tnu) {
        this.e = e;
        this.f = f;
        this.a = a;
        final long e2 = tnu.e(tnu.D);
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
            ewp.g().V((asjg)new esa(this, 1));
        }
        else {
            this.b = 1;
        }
        this.d = new AtomicInteger();
    }
    
    public final void a(final int n) {
        if (n >= 5) {
            ((acgs)this.f.a()).n();
        }
    }
    
    public final void b(final int n) {
        if (n != 15 && ((this.c & 0x8L) == 0x0L || n < 15)) {
            return;
        }
        ((dax)this.e.a()).b();
    }
}

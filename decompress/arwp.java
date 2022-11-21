import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arwp
{
    public final asda a;
    public final arzi b;
    public final arze c;
    public final arwr d;
    public final arxi e;
    public final Object f;
    public ascx g;
    public boolean h;
    public asdx i;
    public final arxu[] j;
    private final xsj k;
    
    public arwp() {
    }
    
    public arwp(final asda a, final arzi b, final arze c, final arwr d, final xsj k, final arxu[] j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.f = new Object();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = arxi.b();
        this.k = k;
        this.j = j;
    }
    
    public final void a(final Status status) {
        adme.L(status.f() ^ true, "Cannot fail with OK status");
        adme.U(this.h ^ true, "apply() or fail() already called");
        this.b((ascx)new asei(aset.b(status), this.j, (byte[])null, (byte[])null));
    }
    
    public final void b(final ascx g) {
        final boolean h = this.h;
        boolean b = true;
        adme.U(h ^ true, "already finalized");
        this.h = true;
        synchronized (this.f) {
            boolean b2;
            if (this.g == null) {
                this.g = g;
                b2 = true;
            }
            else {
                b2 = false;
            }
            monitorexit(this.f);
            if (b2) {
                this.k.A();
                return;
            }
            if (this.i == null) {
                b = false;
            }
            adme.U(b, "delayedStream is null");
            final Runnable q = this.i.q(g);
            if (q != null) {
                q.run();
            }
            this.k.A();
        }
    }
}

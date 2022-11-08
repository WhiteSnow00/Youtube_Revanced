import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arri
{
    public final aryw a;
    public final aruk b;
    public final arug c;
    public final arrk d;
    public final arsg e;
    public final Object f;
    public aryt g;
    public boolean h;
    public arzu i;
    public final arxi[] j;
    private final xpb k;
    
    public arri() {
    }
    
    public arri(final aryw a, final aruk b, final arug c, final arrk d, final xpb k, final arxi[] j, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.f = new Object();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = arsg.k();
        this.k = k;
        this.j = j;
    }
    
    public final void a(final Status status) {
        agot.v(status.f() ^ true, (Object)"Cannot fail with OK status");
        agot.E(this.h ^ true, (Object)"apply() or fail() already called");
        this.b((aryt)new asae(asap.b(status), this.j, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void b(final aryt g) {
        final boolean h = this.h;
        boolean b = true;
        agot.E(h ^ true, (Object)"already finalized");
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
                this.k.y();
                return;
            }
            if (this.i == null) {
                b = false;
            }
            agot.E(b, (Object)"delayedStream is null");
            final Runnable q = this.i.q(g);
            if (q != null) {
                q.run();
            }
            this.k.y();
        }
    }
}

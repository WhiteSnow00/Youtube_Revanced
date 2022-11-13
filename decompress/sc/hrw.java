import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrw implements abfb
{
    final boolean a;
    final long b;
    final aiqj c;
    final int d;
    final int e;
    final int f;
    final boolean g;
    final boolean h;
    final boolean i;
    final long j;
    final answ k;
    final ReelWatchEndpointOuterClass$ReelWatchEndpoint l;
    public final hrx m;
    final agmc n;
    
    public hrw(final hrx m, final boolean a, final long b, final aiqj c, final agmc n, final int d, final int e, final int f, final boolean g, final boolean h, final boolean i, final long j, final answ k, final ReelWatchEndpointOuterClass$ReelWatchEndpoint l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.m = m;
        this.a = a;
        this.b = b;
        this.c = c;
        this.n = n;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void a(final Throwable t) {
    }
    
    public final void b(final PlayerResponseModel playerResponseModel) {
        final hrx m = this.m;
        if (m.i) {
            return;
        }
        m.l.n(this.c, playerResponseModel.z(), this.d);
        if (this.g) {
            if (hrz.h(this.k, this.m.m, this.a)) {
                this.m.d.execute(aeun.h((Runnable)new tu(this, hrz.f(this.n, this.c), hrz.a(this.m.h.a(this.l), this.i, this.h, null), playerResponseModel, 19)));
            }
        }
    }
    
    public final void c(final int n) {
        if (n == 3) {
            final hrx m = this.m;
            if (!m.i) {
                if (m.m.o(this.a)) {
                    this.m.f(this.b, this.c, this.n, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
                }
            }
        }
    }
}

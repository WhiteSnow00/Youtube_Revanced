import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrs implements Runnable
{
    public final hrx a;
    public final aiqj b;
    public final ReelWatchEndpointOuterClass$ReelWatchEndpoint c;
    public final boolean d;
    public final boolean e;
    public final answ f;
    public final boolean g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final long l;
    public final agmc m;
    
    public hrs(final hrx a, final agmc m, final aiqj b, final ReelWatchEndpointOuterClass$ReelWatchEndpoint c, final boolean d, final boolean e, final answ f, final boolean g, final int h, final long i, final int j, final int k, final long l, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.m = m;
        this.b = b;
        this.c = c;
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
    
    @Override
    public final void run() {
        final hrx a = this.a;
        final agmc m = this.m;
        final aiqj b = this.b;
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint c = this.c;
        final boolean d = this.d;
        final int e = this.e ? 1 : 0;
        final answ f = this.f;
        final boolean g = this.g;
        final int h = this.h;
        final long i = this.i;
        final int j = this.j;
        final int k = this.k;
        final long l = this.l;
        if (a.i) {
            return;
        }
        final PlaybackStartDescriptor f2 = hrz.f(m, b);
        xan xan;
        if (a.m.m()) {
            xan = a.h.a(c);
        }
        else {
            xan = a.e.c(almx.j);
        }
        final abjt a2 = hrz.a(xan, d, (boolean)(e != 0), null);
        final aqua a3 = abjy.a();
        int n;
        if (f != null) {
            n = f.N;
        }
        else {
            n = 2000;
        }
        a3.e((long)n);
        a.f.m().i(a3.c(), f2, a2, (abfb)new hrv(a, g, b, h, i, m, j, k, (boolean)(e != 0), d, l, null, null, null));
    }
}

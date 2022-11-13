import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class ablf implements ablt
{
    final ablt a;
    final xan b;
    final ablh c;
    
    public ablf(final ablh c, final ablt a, final xan b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final int n) {
        if (this.c.o == null) {
            final boolean b = this.c.p != null;
            final boolean q = this.c.q;
            final boolean o = ablh.o(n);
            final StringBuilder sb = new StringBuilder("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: ");
            sb.append(b);
            sb.append(", initialShouldJoinWatchNextResponseOfSequence: ");
            sb.append(q);
            sb.append(", requestPlayback: ");
            sb.append(o);
            ttr.b(sb.toString());
        }
        else {
            this.c.n(abkb.e);
        }
        this.a.a(n);
    }
    
    public final void b(final abkh abkh) {
        this.a.b(abkh);
    }
    
    public final void c(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel != null) {
            final ablh c = this.c;
            final PlaybackStartDescriptor n = c.n;
            final xan b = this.b;
            final ablg g = c.g;
            if (g != null && n != null) {
                final abqp d = ((abqf)g).d;
                synchronized (d.h) {
                    if (d.h.a == null) {
                        zlm.b(zll.b, zlk.j, "Null Director when attempting to prewarm.");
                    }
                    else {
                        final tce d2 = d.d;
                        if (d2 != null) {
                            d2.d();
                        }
                        final tce c2 = tce.c((tcc)new abqn(d, playerResponseModel, n, b));
                        d.d = c2;
                        d.a.k(playerResponseModel.y(), (tcc)c2, playerResponseModel.K());
                    }
                }
            }
        }
        this.a.c(playerResponseModel);
    }
    
    public final void d(final PlayerResponseModel playerResponseModel) {
        this.a.d(playerResponseModel);
        final ablh c = this.c;
        c.h(playerResponseModel, c.n, this.b);
    }
    
    public final void e() {
        this.a.e();
        ((aukf)this.c.r.b).tu((Object)new aane());
    }
    
    public final void f(final abkh abkh) {
        this.a.f(abkh);
    }
    
    public final void g(final WatchNextResponseModel watchNextResponseModel, final String s) {
        this.a.g(watchNextResponseModel, s);
        this.c.i(watchNextResponseModel, s);
    }
}

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

final class abjg implements abju
{
    final /* synthetic */ abju a;
    final /* synthetic */ wyn b;
    final /* synthetic */ abji c;
    
    public abjg(final abji c, final abju a, final wyn b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final int n) {
        if (this.c.k == null) {
            final boolean b = this.c.l != null;
            final boolean m = this.c.m;
            final StringBuilder sb = new StringBuilder("About to send VIDEO_WATCH_LOADED but do not have a currentPlayerResponse. WatchNext set: ");
            sb.append(b);
            sb.append(", initialShouldJoinWatchNextResponseOfSequence: ");
            sb.append(m);
            sb.append(", requestPlayback: ");
            sb.append(abji.n(n));
            trn.b(sb.toString());
        }
        else {
            this.c.m(abij.e);
        }
        this.a.a(n);
    }
    
    public final void b(final abip abip) {
        this.a.b(abip);
    }
    
    public final void c(final PlayerResponseModel playerResponseModel) {
        if (playerResponseModel != null) {
            final abji c = this.c;
            final PlaybackStartDescriptor j = c.j;
            final wyn b = this.b;
            final abjh d = c.d;
            if (d != null && j != null) {
                final aboq d2 = ((abof)d).d;
                synchronized (d2.h) {
                    if (d2.h.a == null) {
                        zjp.b(zjo.b, zjn.j, "Null Director when attempting to prewarm.");
                    }
                    else {
                        final szz d3 = d2.d;
                        if (d3 != null) {
                            d3.d();
                        }
                        final szz c2 = szz.c((szx)new aboo(d2, playerResponseModel, j, b));
                        d2.d = c2;
                        d2.a.k(playerResponseModel.y(), (szx)c2, playerResponseModel.K());
                    }
                }
            }
        }
        this.a.c(playerResponseModel);
    }
    
    public final void d(final PlayerResponseModel playerResponseModel) {
        this.a.d(playerResponseModel);
        final abji c = this.c;
        c.g(playerResponseModel, c.j, this.b);
    }
    
    public final void e() {
        this.a.e();
        ((aujp)this.c.n.b).tr((Object)new aalk());
    }
    
    public final void f(final abip abip) {
        this.a.f(abip);
    }
    
    public final void g(final WatchNextResponseModel watchNextResponseModel, final String s) {
        this.a.g(watchNextResponseModel, s);
        this.c.h(watchNextResponseModel, s);
    }
}

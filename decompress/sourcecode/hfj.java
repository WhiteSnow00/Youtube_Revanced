import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.concurrent.Callable;
import java.util.HashMap;
import android.net.Uri;
import java.util.ArrayList;
import j$.time.Duration;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfj implements hfe
{
    final /* synthetic */ View a;
    public final /* synthetic */ hfl b;
    
    public hfj(final hfl b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final PlayerResponseModel playerResponseModel) {
        this.b.aC.execute(aesm.h((Runnable)new hfh(this, playerResponseModel, this.a)));
        final hfl b = this.b;
        final EditableVideo ar = b.ar;
        VideoMetaData b2;
        if (ar == null) {
            b2 = null;
        }
        else {
            b2 = ar.b;
        }
        if (b2 != null) {
            final hfv ag = b.aG;
            ag.e = playerResponseModel.j();
            final String i = playerResponseModel.I();
            if (i != null) {
                final aeby bj = aeby.bj(i, Duration.ofSeconds((long)playerResponseModel.h()).toMillis());
                if (bj != null) {
                    final int f = ag.f;
                    ag.d = bj.aB(1);
                    if (ag.d == null) {
                        ag.d = bj.aB(0);
                    }
                }
                else {
                    final hjp c = ag.c;
                    hjp.a(zjo.b, zjn.l, "[ShortsCreation][Android][VideoIngestion]invalid video Spec.");
                }
            }
            else {
                final hjp c2 = ag.c;
                hjp.a(zjo.b, zjn.l, "[ShortsCreation][Android][VideoIngestion]null storyboard Spec.");
            }
            final abgr d = ag.d;
            ListenableFuture listenableFuture;
            if (d == null) {
                listenableFuture = afva.l((Throwable)new Exception("1"));
            }
            else {
                final int c3 = d.c();
                final int d2 = d.d();
                final int c4 = d.c;
                final int d3 = d.d;
                final ArrayList<szx> list = new ArrayList<szx>();
                for (int j = 0; j < d2; ++j) {
                    final Uri parse = Uri.parse(d.g(j));
                    final szy c5 = szy.c();
                    ag.a.l(parse, (szx)c5);
                    list.add((szx)c5);
                }
                listenableFuture = afld.r((Iterable)list).P((Callable)new hfu(ag, d2, (ArrayList)list, c4 * d3, c3, d, new HashMap(), b2), ag.b);
            }
            tcp.k(listenableFuture, this.b.aC, (tcn)gnh.j, (tco)new hfi(this, 0));
        }
    }
}

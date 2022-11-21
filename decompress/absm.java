import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import android.os.Looper;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.PriorityQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absm
{
    public final afci a;
    public final String b;
    public final wza c;
    public final afci d;
    public boolean e;
    public long f;
    private final tkq g;
    private final zkn h;
    private final PriorityQueue i;
    private final PriorityQueue j;
    private final Executor k;
    private final aajb l;
    private final arzb m;
    private final aana n;
    
    protected absm(final aajb l, final tkq g, final zkn h, final afci a, final List list, final List list2, final String b, final Executor k, final aana n, final wza c, final arzb m, final afci d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.l = l;
        this.g = g;
        this.h = h;
        this.a = a;
        this.i = new PriorityQueue(list);
        this.j = new PriorityQueue(list2);
        b.getClass();
        this.b = b;
        this.k = k;
        this.n = n;
        this.c = c;
        this.m = m;
        this.d = d;
    }
    
    public final PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState a() {
        synchronized (this) {
            return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(this.i, this.j, this.b);
        }
    }
    
    public final void b(final TrackingUrlModel trackingUrlModel, final long n) {
        final twk b = twk.b(trackingUrlModel.c());
        for (final vkx vkx : trackingUrlModel.c) {
            tcl.k();
            final vkx a = vkx.a;
            final int ordinal = vkx.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                continue;
                            }
                            b.h("cmt", String.valueOf(n / 1000L));
                        }
                        else {
                            b.k("conn", this.g.a());
                        }
                    }
                    else {
                        b.h("cpn", this.b);
                    }
                }
                else {
                    this.h.d(b);
                }
            }
            else {
                for (final Map.Entry entry : ((Map<Object, Object>)this.a.a()).entrySet()) {
                    b.h((String)entry.getKey(), (String)entry.getValue());
                }
            }
        }
        Uri uri2;
        final Uri uri = uri2 = b.a();
        if (this.n.b(uri)) {
            uri2 = this.n.a(uri);
        }
        final vkv vkv = new vkv(trackingUrlModel, 0);
        String.valueOf(uri2);
        final zpb m = aajb.m("remarketing");
        m.b(uri2);
        m.d = true;
        m.a((zpt)vkv);
        this.l.j(m, zrh.a);
    }
    
    public final void c(final aapq aapq) {
        monitorenter(this);
        try {
            Label_0365: {
                if (aapq.j()) {
                    this.f = aapq.e();
                    while (true) {
                        while (!this.i.isEmpty()) {
                            final TrackingUrlModel trackingUrlModel = this.i.peek();
                            if (trackingUrlModel != null) {
                                final long f = this.f;
                                if (trackingUrlModel.b.length() > 0 && trackingUrlModel.b(0) * 1000 <= f) {
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        this.k.execute(new abse(this, trackingUrlModel, 2));
                                    }
                                    else {
                                        this.b(trackingUrlModel, this.f);
                                    }
                                    this.i.remove();
                                    continue;
                                }
                            }
                            while (!this.j.isEmpty()) {
                                final PlaybackLoggingPayloadModel playbackLoggingPayloadModel = this.j.peek();
                                if (playbackLoggingPayloadModel == null || playbackLoggingPayloadModel.b * 1000 > this.f) {
                                    break;
                                }
                                final anes a = anet.a();
                                final String b = this.b;
                                ((ahcr)a).copyOnWrite();
                                anet.c((anet)a.instance, b);
                                final ahbt a2 = playbackLoggingPayloadModel.a;
                                ((ahcr)a).copyOnWrite();
                                anet.d((anet)a.instance, a2);
                                final anet anet = (anet)((ahcr)a).build();
                                final akps d = akpu.d();
                                ((ahcr)d).copyOnWrite();
                                akpu.aN((akpu)d.instance, anet);
                                this.c.d((akpu)((ahcr)d).build());
                                this.j.remove();
                            }
                            if (this.e) {
                                break Label_0365;
                            }
                            anhj anhj;
                            if ((anhj = this.m.f().j) == null) {
                                anhj = anhj.a;
                            }
                            if (anhj.o) {
                                this.e = true;
                                this.k.execute((Runnable)new abgl(this, 16));
                                monitorexit(this);
                                return;
                            }
                            break Label_0365;
                        }
                        continue;
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}

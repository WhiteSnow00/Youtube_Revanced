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

public final class abra
{
    public final afaq a;
    public final String b;
    public final wxx c;
    public final afaq d;
    public boolean e;
    public long f;
    private final tjm g;
    private final zis h;
    private final PriorityQueue i;
    private final PriorityQueue j;
    private final Executor k;
    private final aahc l;
    private final arwh m;
    private final aale n;
    
    protected abra(final aahc l, final tjm g, final zis h, final afaq a, final List list, final List list2, final String b, final Executor k, final aale n, final wxx c, final arwh m, final afaq d, final byte[] array, final byte[] array2, final byte[] array3) {
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
        final tvi b = tvi.b(trackingUrlModel.c());
        for (final vjp vjp : trackingUrlModel.c) {
            tbi.e();
            final vjp a = vjp.a;
            final int ordinal = vjp.ordinal();
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
        final vjn vjn = new vjn(trackingUrlModel, 0);
        String.valueOf(uri2);
        final znf m = aahc.m("remarketing");
        m.b(uri2);
        m.d = true;
        m.a((znx)vjn);
        this.l.j(m, zpl.a);
    }
    
    public final void c(final aant aant) {
        monitorenter(this);
        try {
            Label_0366: {
                if (aant.j()) {
                    this.f = aant.e();
                    while (true) {
                        while (!this.i.isEmpty()) {
                            final TrackingUrlModel trackingUrlModel = this.i.peek();
                            if (trackingUrlModel != null) {
                                final long f = this.f;
                                if (trackingUrlModel.b.length() > 0 && trackingUrlModel.b(0) * 1000 <= f) {
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        this.k.execute((Runnable)new aaxb(this, trackingUrlModel, 20));
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
                                final ancl a = ancm.a();
                                final String b = this.b;
                                ((ahaz)a).copyOnWrite();
                                ancm.c((ancm)a.instance, b);
                                final ahab a2 = playbackLoggingPayloadModel.a;
                                ((ahaz)a).copyOnWrite();
                                ancm.d((ancm)a.instance, a2);
                                final ancm ancm = (ancm)((ahaz)a).build();
                                final aknr d = aknt.d();
                                ((ahaz)d).copyOnWrite();
                                aknt.aN((aknt)d.instance, ancm);
                                this.c.d((aknt)((ahaz)d).build());
                                this.j.remove();
                            }
                            if (this.e) {
                                break Label_0366;
                            }
                            anfc anfc;
                            if ((anfc = this.m.f().j) == null) {
                                anfc = anfc.a;
                            }
                            if (anfc.o) {
                                this.e = true;
                                this.k.execute((Runnable)new abei(this, 17));
                                monitorexit(this);
                                return;
                            }
                            break Label_0366;
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

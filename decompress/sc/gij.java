import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import android.content.res.Resources;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.app.NotificationManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gij
{
    private static final long d;
    public final Context a;
    public Runnable b;
    public NotificationManager c;
    private final atke e;
    private final Handler f;
    
    static {
        d = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public gij(final Context a, final atke e, final Handler f) {
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final abvx abvx, final String s, final int n) {
        if (!gim.g(abvx)) {
            return;
        }
        if (((eg)this.e.a()).N() != 3) {
            return;
        }
        final Resources resources = this.a.getResources();
        final String string = resources.getString(2132017888);
        final afq afq = new afq(this.a);
        final afo afo = new afo();
        afo.c((CharSequence)string);
        afq.r((afu)afo);
        afq.q(2131233028);
        afq.y = tpe.cx(this.a, 2130970903).orElse(resources.getColor(2131102434));
        afq.n(false);
        afq.f(true);
        afq.w = "status";
        afq.z = 1;
        afq.k = 0;
        if (abvx != null) {
            final PlayerResponseModel d = abvx.d();
            if (d != null) {
                afq.j((CharSequence)d.J());
            }
        }
        final Context a = this.a;
        final Intent intent = null;
        Intent putExtra;
        if (abvx == null) {
            putExtra = intent;
        }
        else {
            final PlayerResponseModel d2 = abvx.d();
            if (d2 == null) {
                putExtra = intent;
            }
            else {
                String s2;
                if ((s2 = s) == null) {
                    s2 = "";
                }
                final abjp d3 = PlaybackStartDescriptor.d();
                d3.a = abkf.g(d2.K(), s2, n, (float)TimeUnit.MILLISECONDS.toSeconds(abvx.c()));
                final WatchDescriptor watchDescriptor = new WatchDescriptor(d3.a());
                watchDescriptor.i();
                putExtra = fwc.h(a).putExtra("watch", (Parcelable)watchDescriptor).putExtra("playback_start_flag", 3);
            }
        }
        if (putExtra != null) {
            final PendingIntent b = qlc.b(this.a, putExtra, 201326592);
            if (b != null) {
                afq.g = b;
            }
        }
        tfg.o(afq);
        final NotificationManager c = this.c;
        if (c != null) {
            c.notify(1008, afq.a());
        }
        final Runnable b2 = this.b;
        if (b2 != null) {
            this.f.removeCallbacks(b2);
            this.f.postDelayed(this.b, gij.d);
        }
    }
    
    public final void b() {
        final NotificationManager c = this.c;
        if (c != null) {
            c.cancel(1008);
        }
        final Runnable b = this.b;
        if (b != null) {
            this.f.removeCallbacks(b);
        }
    }
}

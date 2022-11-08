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

public final class gia
{
    private static final long d;
    public final Context a;
    public Runnable b;
    public NotificationManager c;
    private final atjj e;
    private final Handler f;
    
    static {
        d = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public gia(final Context a, final atjj e, final Handler f) {
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final abtt abtt, final String s, final int n) {
        if (!gid.g(abtt)) {
            return;
        }
        if (((hdv)this.e.a()).e() != 3) {
            return;
        }
        final Resources resources = this.a.getResources();
        final String string = resources.getString(2132017887);
        final afp afp = new afp(this.a);
        final afn afn = new afn();
        afn.c(string);
        afp.r((aft)afn);
        afp.q(2131233028);
        afp.y = tmy.ct(this.a, 2130970903).orElse(resources.getColor(2131102406));
        afp.n(false);
        afp.f(true);
        afp.w = "status";
        afp.z = 1;
        afp.k = 0;
        if (abtt != null) {
            final PlayerResponseModel d = abtt.d();
            if (d != null) {
                afp.j((CharSequence)d.J());
            }
        }
        final Context a = this.a;
        final Intent intent = null;
        Intent putExtra;
        if (abtt == null) {
            putExtra = intent;
        }
        else {
            final PlayerResponseModel d2 = abtt.d();
            if (d2 == null) {
                putExtra = intent;
            }
            else {
                final abhx d3 = PlaybackStartDescriptor.d();
                final String k = d2.K();
                String s2;
                if ((s2 = s) == null) {
                    s2 = "";
                }
                d3.a = abin.g(k, s2, n, (float)TimeUnit.MILLISECONDS.toSeconds(abtt.c()));
                final WatchDescriptor watchDescriptor = new WatchDescriptor(d3.a());
                watchDescriptor.i();
                putExtra = fvu.h(a).putExtra("watch", (Parcelable)watchDescriptor).putExtra("playback_start_flag", 3);
            }
        }
        if (putExtra != null) {
            final PendingIntent b = qjs.b(this.a, putExtra, 201326592);
            if (b != null) {
                afp.g = b;
            }
        }
        tdb.o(afp);
        final NotificationManager c = this.c;
        if (c != null) {
            c.notify(1008, afp.a());
        }
        final Runnable b2 = this.b;
        if (b2 != null) {
            this.f.removeCallbacks(b2);
            this.f.postDelayed(this.b, gia.d);
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

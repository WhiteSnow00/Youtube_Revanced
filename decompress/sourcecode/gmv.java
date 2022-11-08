import android.content.Intent;
import android.os.Parcelable;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import android.os.Bundle;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import com.google.android.apps.youtube.app.common.csi.WatchUiActionLatencyLogger;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmv implements vau
{
    private final Activity a;
    private final tdz b;
    private final faj c;
    private final fgn d;
    private final WatchUiActionLatencyLogger e;
    private final tlq f;
    private final agls g;
    private final arud h;
    private final c i;
    
    public gmv(final Activity a, final tdz b, final faj c, final c i, final fgn d, final WatchUiActionLatencyLogger e, final arud h, final tlq f, final agls g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void mE(final aioe a, final Map map) {
        alvs alvs;
        if ((alvs = this.h.f().e) == null) {
            alvs = alvs.a;
        }
        wyn a2;
        if (alvs.ab) {
            a2 = this.d.a();
        }
        else {
            a2 = null;
        }
        this.e.j();
        this.e.k();
        final abhx d = PlaybackStartDescriptor.d();
        d.a = a;
        if ((this.f.e(tlq.am) & 0x8L) != 0x0L) {
            final Optional empty = Optional.empty();
            Optional.empty();
            d.n = new abhv(empty, Optional.of((Object)tjq.d), Optional.empty());
        }
        ((Optional)this.g.b).ifPresent((Consumer)new gft(d, 13));
        final PlaybackStartDescriptor a3 = d.a();
        final fnv fnv = (fnv)tmy.O(map, (Object)"PLAYBACK_START_DESCRIPTOR_MUTATOR", (Class)fnv.class);
        if (fnv != null) {
            fnv.a(a3);
        }
        int n = 0;
        final int intValue = (int)tmy.N(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0);
        final Bundle bundle = (Bundle)tmy.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class);
        final boolean b = (intValue & 0x20) != 0x0;
        final Boolean value = false;
        final boolean booleanValue = (boolean)tmy.N(map, (Object)"force_fullscreen", (Object)value);
        final boolean booleanValue2 = (boolean)tmy.N(map, (Object)"OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", (Object)value);
        final boolean b2 = (intValue & 0x2) != 0x0;
        final boolean b3 = (intValue & 0x8) != 0x0;
        final fkf b4 = fkg.b();
        final WatchDescriptor watchDescriptor = new WatchDescriptor(a3);
        watchDescriptor.e(b2);
        watchDescriptor.f(b3);
        watchDescriptor.d(booleanValue);
        if (tmy.N(map, (Object)"start_watch_minimized", (Object)false)) {
            final agza b5 = watchDescriptor.b;
            b5.copyOnWrite();
            final lqd lqd = (lqd)b5.instance;
            final lqd a4 = lqd.a;
            lqd.b |= 0x80;
            lqd.j = true;
        }
        if ((intValue & 0x1) != 0x0 && bundle != null) {
            watchDescriptor.c(bundle);
        }
        b4.f(watchDescriptor);
        b4.b(booleanValue2);
        b4.g((View)tmy.M(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY"));
        b4.a = (aorm)tmy.N(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", (Object)aorm.a);
        b4.b = (Bitmap)tmy.M(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_BITMAP_KEY");
        b4.c(b);
        if (!a3.a.B && !(boolean)tmy.N(map, (Object)"ALLOW_RELOAD", (Object)false)) {
            if (!a3.s()) {
                if (a3.c() > 0L) {
                    n = 2;
                }
            }
        }
        else {
            n = 3;
        }
        b4.d(n);
        b4.e((boolean)tmy.N(map, (Object)"START_SHUFFLED", (Object)value));
        final fkg a5 = b4.a();
        this.b.d((Object)new fhr());
        final faj c = this.c;
        if (c != null) {
            c.n(a5, Optional.ofNullable((Object)a2));
            return;
        }
        final Intent j = this.i.j();
        j.setFlags(67108864);
        j.putExtra("watch", (Parcelable)a5.a);
        this.a.startActivity(j);
    }
}

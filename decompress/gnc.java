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

public final class gnc implements vcv
{
    private final Activity a;
    private final tgd b;
    private final fan c;
    private final fgt d;
    private final WatchUiActionLatencyLogger e;
    private final tnu f;
    private final agnt g;
    private final arwh h;
    private final c i;
    
    public gnc(final Activity a, final tgd b, final fan c, final c i, final fgt d, final WatchUiActionLatencyLogger e, final arwh h, final tnu f, final agnt g, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
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
    
    public final void mE(final aiqj a, final Map map) {
        alxw alxw;
        if ((alxw = this.h.f().e) == null) {
            alxw = alxw.a;
        }
        xan a2;
        if (alxw.ab) {
            a2 = this.d.a();
        }
        else {
            a2 = null;
        }
        this.e.j();
        this.e.k();
        final abjp d = PlaybackStartDescriptor.d();
        d.a = a;
        if ((this.f.e(tnu.am) & 0x8L) != 0x0L) {
            final Optional empty = Optional.empty();
            Optional.empty();
            d.n = new abjn(empty, Optional.of((Object)tlu.d), Optional.empty());
        }
        ((Optional)this.g.b).ifPresent((Consumer)new gga(d, 13));
        final PlaybackStartDescriptor a3 = d.a();
        final foa foa = (foa)tpe.O(map, (Object)"PLAYBACK_START_DESCRIPTOR_MUTATOR", (Class)foa.class);
        if (foa != null) {
            foa.a(a3);
        }
        int n = 0;
        final int intValue = (int)tpe.N(map, (Object)"com.google.android.apps.youtube.app.endpoint.flags", (Object)0);
        final Bundle bundle = (Bundle)tpe.O(map, (Object)"com.google.android.libraries.youtube.innertube.bundle", (Class)Bundle.class);
        final Boolean value = false;
        final boolean booleanValue = (boolean)tpe.N(map, (Object)"force_fullscreen", (Object)value);
        final boolean booleanValue2 = (boolean)tpe.N(map, (Object)"OVERRIDE_EXIT_FULLSCREEN_TO_MAXIMIZED", (Object)value);
        final fkm b = fkn.b();
        final WatchDescriptor watchDescriptor = new WatchDescriptor(a3);
        final boolean b2 = true;
        watchDescriptor.e((intValue & 0x2) != 0x0);
        watchDescriptor.f((intValue & 0x8) != 0x0);
        watchDescriptor.d(booleanValue);
        if (tpe.N(map, (Object)"start_watch_minimized", (Object)false)) {
            final ahaz b3 = watchDescriptor.b;
            b3.copyOnWrite();
            final lrh lrh = (lrh)b3.instance;
            final lrh a4 = lrh.a;
            lrh.b |= 0x80;
            lrh.j = true;
        }
        if ((intValue & 0x1) != 0x0 && bundle != null) {
            watchDescriptor.c(bundle);
        }
        final boolean b4 = (intValue & 0x20) != 0x0 && b2;
        b.f(watchDescriptor);
        b.b(booleanValue2);
        b.g((View)tpe.M(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY"));
        b.a = (aotp)tpe.N(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", (Object)aotp.a);
        b.b = (Bitmap)tpe.M(map, (Object)"VideoPresenterConstants.VIDEO_THUMBNAIL_BITMAP_KEY");
        b.c(b4);
        if (!a3.a.B && !(boolean)tpe.N(map, (Object)"ALLOW_RELOAD", (Object)false)) {
            if (!a3.s()) {
                if (a3.c() > 0L) {
                    n = 2;
                }
            }
        }
        else {
            n = 3;
        }
        b.d(n);
        b.e((boolean)tpe.N(map, (Object)"START_SHUFFLED", (Object)value));
        final fkn a5 = b.a();
        this.b.d((Object)new fhx());
        final fan c = this.c;
        if (c != null) {
            c.m(a5, Optional.ofNullable((Object)a2));
            return;
        }
        final Intent i = this.i.i();
        i.setFlags(67108864);
        i.putExtra("watch", (Parcelable)a5.a);
        this.a.startActivity(i);
    }
}

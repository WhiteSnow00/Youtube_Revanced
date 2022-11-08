import com.google.android.gms.cast.MediaQueueItem;
import android.app.PendingIntent;
import java.util.Iterator;
import java.util.List;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.cast.MediaInfo;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.common.images.WebImage;
import android.net.Uri;
import com.google.android.gms.cast.MediaMetadata;
import android.app.ForegroundServiceStartNotAllowedException;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.MediaStatus;
import android.os.Bundle;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.RectF;
import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import android.os.Looper;
import android.text.TextUtils;
import android.support.v4.media.session.PlaybackStateCompat$CustomAction;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import android.content.ComponentName;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.CastOptions;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmd
{
    public static final mnb a;
    public final Context b;
    public final CastOptions c;
    public final mkm d;
    public final mjq e;
    public final NotificationOptions f;
    public final ComponentName g;
    public final mlw h;
    public final mlw i;
    public mlu j;
    public CastDevice k;
    public eg l;
    public dz m;
    public boolean n;
    public final mlc o;
    private final ComponentName p;
    private final Handler q;
    private final Runnable r;
    private PlaybackStateCompat$CustomAction s;
    private PlaybackStateCompat$CustomAction t;
    private PlaybackStateCompat$CustomAction u;
    private PlaybackStateCompat$CustomAction v;
    
    static {
        a = new mnb("MediaSessionManager");
    }
    
    public mmd(final Context b, final CastOptions c, final mkm d) {
        this.b = b;
        this.c = c;
        this.d = d;
        final mio a = mio.a();
        mjq d2;
        if (a != null) {
            d2 = a.d();
        }
        else {
            d2 = null;
        }
        this.e = d2;
        final CastMediaOptions e = c.e;
        NotificationOptions c2;
        if (e == null) {
            c2 = null;
        }
        else {
            c2 = e.c;
        }
        this.f = c2;
        this.o = (mlc)new mmc(this);
        String b2;
        if (e == null) {
            b2 = null;
        }
        else {
            b2 = e.b;
        }
        ComponentName p3;
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            p3 = new ComponentName(b, b2);
        }
        else {
            p3 = null;
        }
        this.p = p3;
        String a2;
        if (e == null) {
            a2 = null;
        }
        else {
            a2 = e.a;
        }
        ComponentName g;
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            g = new ComponentName(b, a2);
        }
        else {
            g = null;
        }
        this.g = g;
        final mlw h = new mlw(b);
        this.h = h;
        h.d = (mlv)new mma(this, 1);
        final mlw i = new mlw(b);
        this.i = i;
        i.d = (mlv)new mma(this, 0);
        this.q = new aeke(Looper.getMainLooper(), (byte[])null);
        this.r = new mkn(this, 2);
    }
    
    public static Bitmap a(final Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final float n = (float)width;
        final int n2 = (int)(9.0f * n / 16.0f + 0.5f);
        final float n3 = (n2 - height) / 2.0f;
        final RectF rectF = new RectF(0.0f, n3, n, height + n3);
        Bitmap$Config bitmap$Config;
        if ((bitmap$Config = bitmap.getConfig()) == null) {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap bitmap2 = Bitmap.createBitmap(width, n2, bitmap$Config);
        new Canvas(bitmap2).drawBitmap(bitmap, (Rect)null, rectF, (Paint)null);
        return bitmap2;
    }
    
    private final long h(final String s, int n, final Bundle bundle) {
        final int hashCode = s.hashCode();
        int n2 = 0;
        Label_0078: {
            if (hashCode != -945151566) {
                if (hashCode != -945080078) {
                    if (hashCode == 235550565) {
                        if (s.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                            n2 = 0;
                            break Label_0078;
                        }
                    }
                }
                else if (s.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    n2 = 1;
                    break Label_0078;
                }
            }
            else if (s.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                n2 = 2;
                break Label_0078;
            }
            n2 = -1;
        }
        long n3;
        if (n2 != 0) {
            n3 = 0L;
            if (n2 == 1) {
                final mlu j = this.j;
                Label_0273: {
                    if (j != null) {
                        if (j.o()) {
                            final MediaStatus f = j.f();
                            kgk.aL((Object)f);
                            if (!f.e(128L) && f.p == 0) {
                                final Integer d = f.d(f.c);
                                if (d == null || d <= 0) {
                                    break Label_0273;
                                }
                            }
                            n3 = 16L;
                            return n3;
                        }
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
            if (n2 == 2) {
                final mlu i = this.j;
                Label_0187: {
                    if (i != null) {
                        if (i.o()) {
                            final MediaStatus f2 = i.f();
                            kgk.aL((Object)f2);
                            if (!f2.e(64L) && f2.p == 0) {
                                final Integer d2 = f2.d(f2.c);
                                if (d2 == null || d2 >= f2.b() - 1) {
                                    break Label_0187;
                                }
                            }
                            n3 = 32L;
                            return n3;
                        }
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                return 0L;
            }
        }
        else {
            if (n == 3) {
                n3 = 514L;
                n = 3;
            }
            else {
                n3 = 512L;
            }
            if (n == 2) {
                return 516L;
            }
        }
        return n3;
    }
    
    private final void i(final ej ej, String s, final NotificationAction notificationAction) {
        int n = 0;
        Label_0118: {
            switch (s.hashCode()) {
                case 1362116196: {
                    if (s.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        n = 0;
                        break Label_0118;
                    }
                    break;
                }
                case -124479363: {
                    if (s.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        n = 3;
                        break Label_0118;
                    }
                    break;
                }
                case -668151673: {
                    if (s.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        n = 2;
                        break Label_0118;
                    }
                    break;
                }
                case -1699820260: {
                    if (s.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        n = 1;
                        break Label_0118;
                    }
                    break;
                }
            }
            n = -1;
        }
        PlaybackStateCompat$CustomAction playbackStateCompat$CustomAction = null;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (notificationAction != null) {
                            final String c = notificationAction.c;
                            final int b = notificationAction.b;
                            if (TextUtils.isEmpty((CharSequence)s)) {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                            if (TextUtils.isEmpty((CharSequence)c)) {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                            if (b == 0) {
                                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                            }
                            playbackStateCompat$CustomAction = eh.y(s, (CharSequence)c, b, (Bundle)null);
                        }
                    }
                    else {
                        if (this.v == null && this.f != null) {
                            s = this.b.getResources().getString(this.f.F);
                            final int r = this.f.r;
                            if (TextUtils.isEmpty((CharSequence)"com.google.android.gms.cast.framework.action.DISCONNECT")) {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                            if (TextUtils.isEmpty((CharSequence)s)) {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                            if (r == 0) {
                                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                            }
                            this.v = eh.y("com.google.android.gms.cast.framework.action.DISCONNECT", (CharSequence)s, r, (Bundle)null);
                        }
                        playbackStateCompat$CustomAction = this.v;
                    }
                }
                else {
                    if (this.u == null && this.f != null) {
                        s = this.b.getResources().getString(this.f.F);
                        final int r2 = this.f.r;
                        if (TextUtils.isEmpty((CharSequence)"com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (r2 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.u = eh.y("com.google.android.gms.cast.framework.action.STOP_CASTING", (CharSequence)s, r2, (Bundle)null);
                    }
                    playbackStateCompat$CustomAction = this.u;
                }
            }
            else {
                if (this.t == null) {
                    final NotificationOptions f = this.f;
                    if (f != null) {
                        final long d = f.d;
                        final int d2 = mme.d(f, d);
                        final int c2 = mme.c(this.f, d);
                        s = this.b.getResources().getString(d2);
                        if (TextUtils.isEmpty((CharSequence)"com.google.android.gms.cast.framework.action.REWIND")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (c2 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.t = eh.y("com.google.android.gms.cast.framework.action.REWIND", (CharSequence)s, c2, (Bundle)null);
                    }
                }
                playbackStateCompat$CustomAction = this.t;
            }
        }
        else {
            if (this.s == null) {
                final NotificationOptions f2 = this.f;
                if (f2 != null) {
                    final long d3 = f2.d;
                    final int b2 = mme.b(f2, d3);
                    final int a = mme.a(this.f, d3);
                    s = this.b.getResources().getString(b2);
                    if (TextUtils.isEmpty((CharSequence)"com.google.android.gms.cast.framework.action.FORWARD")) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty((CharSequence)s)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (a == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    this.s = eh.y("com.google.android.gms.cast.framework.action.FORWARD", (CharSequence)s, a, (Bundle)null);
                }
            }
            playbackStateCompat$CustomAction = this.s;
        }
        if (playbackStateCompat$CustomAction != null) {
            ej.b(playbackStateCompat$CustomAction);
        }
    }
    
    private static final boolean j(final String s) {
        return TextUtils.equals((CharSequence)s, (CharSequence)"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals((CharSequence)s, (CharSequence)"com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals((CharSequence)s, (CharSequence)"com.google.android.gms.cast.framework.action.SKIP_NEXT");
    }
    
    private final void k() {
        if (this.k != null && mkw.b(this.c)) {
            final mlu j = this.j;
            if (j != null) {
                final Intent intent = new Intent(this.b, (Class)mkw.class);
                intent.putExtra("extra_media_notification_force_update", false);
                intent.setPackage(this.b.getPackageName());
                intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                intent.putExtra("extra_media_info", (Parcelable)j.e());
                intent.putExtra("extra_remote_media_client_player_state", j.b());
                intent.putExtra("extra_cast_device", (Parcelable)this.k);
                final eg l = this.l;
                if (l != null) {
                    intent.putExtra("extra_media_session_token", (Parcelable)l.b());
                }
                final MediaStatus f = j.f();
                boolean b = false;
                boolean b2 = false;
                Label_0229: {
                    if (f != null) {
                        final int p = f.p;
                        b = true;
                        if (p == 1 || p == 2 || p == 3) {
                            b2 = true;
                            break Label_0229;
                        }
                        final Integer d = f.d(f.c);
                        if (d != null) {
                            b2 = (d > 0);
                            if (d < f.b() - 1) {
                                break Label_0229;
                            }
                            b = false;
                            break Label_0229;
                        }
                    }
                    b = false;
                    b2 = false;
                }
                intent.putExtra("extra_can_skip_next", b);
                intent.putExtra("extra_can_skip_prev", b2);
                try {
                    this.b.startForegroundService(intent);
                }
                catch (final ForegroundServiceStartNotAllowedException ex) {
                    mmd.a.c((Throwable)ex, "Failed to start CAF media notification because app is in background", new Object[0]);
                }
            }
        }
    }
    
    private final Uri l(final MediaMetadata mediaMetadata) {
        final CastMediaOptions e = this.c.e;
        mlc a;
        if (e == null) {
            a = null;
        }
        else {
            a = e.a();
        }
        WebImage m;
        if (a != null) {
            m = mlc.m(mediaMetadata);
        }
        else if (mediaMetadata.c()) {
            m = mediaMetadata.a.get(0);
        }
        else {
            m = null;
        }
        if (m == null) {
            return null;
        }
        return m.b;
    }
    
    private final bx m() {
        final eg l = this.l;
        MediaMetadataCompat m;
        if (l == null) {
            m = null;
        }
        else {
            m = ((eg)l.c).m();
        }
        bx bx;
        if (m == null) {
            bx = new bx();
        }
        else {
            bx = new bx(m);
        }
        return bx;
    }
    
    public final void b(final Bitmap bitmap, final int n) {
        final eg l = this.l;
        if (l == null) {
            return;
        }
        String s;
        if (n == 0) {
            s = "android.media.metadata.DISPLAY_ICON";
        }
        else {
            s = "android.media.metadata.ALBUM_ART";
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            bitmap2 = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
            bitmap2.eraseColor(0);
        }
        final bx m = this.m();
        m.f(s, bitmap2);
        l.h(m.e());
    }
    
    public final void c(final boolean b) {
        if (!this.c.f) {
            return;
        }
        final Runnable r = this.r;
        if (r != null) {
            this.q.removeCallbacks(r);
        }
        final Intent intent = new Intent(this.b, (Class)mjn.class);
        intent.setPackage(this.b.getPackageName());
        try {
            this.b.startService(intent);
        }
        catch (final IllegalStateException ex) {
            if (b) {
                this.q.postDelayed(this.r, 1000L);
            }
        }
    }
    
    public final void d() {
        if (this.f != null) {
            final Runnable a = mkw.a;
            if (a != null) {
                a.run();
            }
        }
    }
    
    public final void e() {
        if (!this.c.f) {
            return;
        }
        this.q.removeCallbacks(this.r);
        final Intent intent = new Intent(this.b, (Class)mjn.class);
        intent.setPackage(this.b.getPackageName());
        this.b.stopService(intent);
    }
    
    public final void f(final int n, final MediaInfo mediaInfo) {
        final eg l = this.l;
        if (l == null) {
            return;
        }
        final Bundle bundle = new Bundle();
        final ej ej = new ej();
        final mlu j = this.j;
        final long n2 = 0L;
        PlaybackStateCompat playbackStateCompat;
        if (j != null && this.f != null && mkw.b(this.c)) {
            final mlu i = this.j;
            kgk.aL((Object)i);
            long c;
            if (n != 0 && !i.q()) {
                c = i.c();
            }
            else {
                c = 0L;
            }
            ej.d(n, c, 1.0f);
            if (n == 0) {
                playbackStateCompat = ej.a();
            }
            else {
                final mkt g = this.f.G;
                final mlu k = this.j;
                long n3;
                if (k != null && !k.q() && !this.j.u()) {
                    n3 = 256L;
                }
                else {
                    n3 = 0L;
                }
                long a;
                if (g != null) {
                    final List e = mme.e(g);
                    a = n3;
                    if (e != null) {
                        final Iterator iterator = e.iterator();
                        while (true) {
                            a = n3;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final NotificationAction notificationAction = (NotificationAction)iterator.next();
                            final String a2 = notificationAction.a;
                            if (j(a2)) {
                                n3 |= this.h(a2, n, bundle);
                            }
                            else {
                                this.i(ej, a2, notificationAction);
                            }
                        }
                    }
                }
                else {
                    final Iterator iterator2 = this.f.c.iterator();
                    while (true) {
                        a = n3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s = (String)iterator2.next();
                        if (j(s)) {
                            n3 |= this.h(s, n, bundle);
                        }
                        else {
                            this.i(ej, s, null);
                        }
                    }
                }
                ej.a = a;
                playbackStateCompat = ej.a();
            }
        }
        else {
            playbackStateCompat = ej.a();
        }
        l.i(playbackStateCompat);
        final NotificationOptions f = this.f;
        if (f != null && f.H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        final NotificationOptions f2 = this.f;
        if (f2 != null && f2.I) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((ea)l.b).j(bundle);
        }
        if (n != 0) {
            if (this.j != null) {
                PendingIntent a3;
                if (this.p == null) {
                    a3 = null;
                }
                else {
                    final Intent intent = new Intent();
                    intent.setComponent(this.p);
                    a3 = nac.a(this.b, intent, 201326592);
                }
                if (a3 != null) {
                    l.j(a3);
                }
            }
            final mlu m = this.j;
            if (m != null) {
                final eg l2 = this.l;
                if (l2 != null) {
                    if (mediaInfo != null) {
                        final MediaMetadata c2 = mediaInfo.c;
                        if (c2 != null) {
                            long d;
                            if (m.q()) {
                                d = n2;
                            }
                            else {
                                d = mediaInfo.d;
                            }
                            final String a4 = c2.a("com.google.android.gms.cast.metadata.TITLE");
                            final String a5 = c2.a("com.google.android.gms.cast.metadata.SUBTITLE");
                            final bx m2 = this.m();
                            m2.g("android.media.metadata.DURATION", d);
                            if (a4 != null) {
                                m2.h("android.media.metadata.TITLE", a4);
                                m2.h("android.media.metadata.DISPLAY_TITLE", a4);
                            }
                            if (a5 != null) {
                                m2.h("android.media.metadata.DISPLAY_SUBTITLE", a5);
                            }
                            l2.h(m2.e());
                            final Uri l3 = this.l(c2);
                            if (l3 != null) {
                                this.h.b(l3);
                            }
                            else {
                                this.b(null, 0);
                            }
                            final Uri l4 = this.l(c2);
                            if (l4 != null) {
                                this.i.b(l4);
                                return;
                            }
                            this.b(null, 3);
                        }
                    }
                }
            }
            return;
        }
        l.h(new bx().e());
    }
    
    public final void g() {
        final mlu j = this.j;
        if (j == null) {
            return;
        }
        final MediaInfo e = j.e();
        final boolean p = j.p();
        int n = 6;
        final int n2 = 0;
        MediaInfo a = null;
        Label_0137: {
            if (p) {
                a = e;
            }
            else if (j.t()) {
                n = 3;
                a = e;
            }
            else if (j.s()) {
                n = 2;
                a = e;
            }
            else {
                if (j.r()) {
                    kgk.aQ("Must be called from the main thread.");
                    final MediaStatus f = j.f();
                    MediaQueueItem c;
                    if (f == null) {
                        c = null;
                    }
                    else {
                        c = f.c(f.l);
                    }
                    if (c != null) {
                        a = c.a;
                        if (a != null) {
                            break Label_0137;
                        }
                    }
                }
                n = 0;
                a = e;
            }
        }
        int n3 = n2;
        if (a != null) {
            if (a.c == null) {
                n3 = n2;
            }
            else {
                n3 = n;
            }
        }
        this.f(n3, a);
        if (!j.o()) {
            this.d();
            this.e();
            return;
        }
        if (n3 != 0) {
            this.k();
            if (!j.r()) {
                this.c(true);
            }
        }
    }
}

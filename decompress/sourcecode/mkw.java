import com.google.android.gms.cast.MediaMetadata;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e;
import android.net.Uri;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import android.app.NotificationChannel;
import android.text.TextUtils;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.os.Parcelable;
import android.graphics.Bitmap;
import java.util.Iterator;
import com.google.android.gms.cast.framework.media.NotificationAction;
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.ArrayList;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.res.Resources;
import com.google.android.gms.cast.framework.media.ImageHints;
import java.util.List;
import android.content.ComponentName;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkw extends Service
{
    public static Runnable a;
    private static final mnb c;
    public oia b;
    private NotificationOptions d;
    private ComponentName e;
    private ComponentName f;
    private List g;
    private int[] h;
    private long i;
    private mlw j;
    private ImageHints k;
    private Resources l;
    private mkv m;
    private NotificationManager n;
    private Notification o;
    private mio p;
    private mlc q;
    
    static {
        c = new mnb("MediaNotificationService");
    }
    
    public mkw() {
        this.g = new ArrayList();
    }
    
    public static boolean b(final CastOptions castOptions) {
        final CastMediaOptions e = castOptions.e;
        if (e == null) {
            return false;
        }
        final NotificationOptions c = e.c;
        if (c == null) {
            return false;
        }
        final mkt g = c.G;
        if (g == null) {
            return true;
        }
        final List e2 = mme.e(g);
        final int[] f = mme.f(g);
        int size;
        if (e2 == null) {
            size = 0;
        }
        else {
            size = e2.size();
        }
        if (e2 != null && !e2.isEmpty()) {
            if (e2.size() > 5) {
                mkw.c.b(String.valueOf(mlc.class.getSimpleName()).concat(" provides more than 5 actions."), new Object[0]);
            }
            else {
                if (f != null) {
                    final int length = f.length;
                    if (length != 0) {
                        for (final int n : f) {
                            if (n < 0 || n >= size) {
                                mkw.c.b(String.valueOf(mlc.class.getSimpleName()).concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                                return false;
                            }
                        }
                        return true;
                    }
                }
                mkw.c.b(String.valueOf(mlc.class.getSimpleName()).concat(" doesn't provide any actions for compact view."), new Object[0]);
            }
        }
        else {
            mkw.c.b(String.valueOf(mlc.class.getSimpleName()).concat(" doesn't provide any action."), new Object[0]);
        }
        return false;
    }
    
    private final afh c(final String s) {
        int n = 0;
        Label_0176: {
            switch (s.hashCode()) {
                case 1362116196: {
                    if (s.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                        n = 3;
                        break Label_0176;
                    }
                    break;
                }
                case 235550565: {
                    if (s.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                        n = 0;
                        break Label_0176;
                    }
                    break;
                }
                case -124479363: {
                    if (s.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        n = 6;
                        break Label_0176;
                    }
                    break;
                }
                case -668151673: {
                    if (s.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                        n = 5;
                        break Label_0176;
                    }
                    break;
                }
                case -945080078: {
                    if (s.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                        n = 2;
                        break Label_0176;
                    }
                    break;
                }
                case -945151566: {
                    if (s.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                        n = 1;
                        break Label_0176;
                    }
                    break;
                }
                case -1699820260: {
                    if (s.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                        n = 4;
                        break Label_0176;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                mkw.c.b("Action: %s is not a pre-defined action.", s);
                return null;
            }
            case 6: {
                final Intent intent = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                intent.setComponent(this.e);
                final PendingIntent b = nac.b((Context)this, intent, 67108864);
                final NotificationOptions d = this.d;
                final int r = d.r;
                final String string = this.l.getString(d.F, new Object[] { "" });
                IconCompat e;
                if (r == 0) {
                    e = null;
                }
                else {
                    e = IconCompat.e(r);
                }
                return sz.c(e, afp.c((CharSequence)string), b, new Bundle(), (ArrayList)null);
            }
            case 5: {
                final Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                intent2.setComponent(this.e);
                final PendingIntent b2 = nac.b((Context)this, intent2, 67108864);
                final NotificationOptions d2 = this.d;
                final int r2 = d2.r;
                final String string2 = this.l.getString(d2.F);
                IconCompat e2;
                if (r2 == 0) {
                    e2 = null;
                }
                else {
                    e2 = IconCompat.e(r2);
                }
                return sz.c(e2, afp.c((CharSequence)string2), b2, new Bundle(), (ArrayList)null);
            }
            case 4: {
                final long i = this.i;
                final Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                intent3.setComponent(this.e);
                intent3.putExtra("googlecast-extra_skip_step_ms", i);
                final PendingIntent b3 = nac.b((Context)this, intent3, 201326592);
                final int c = mme.c(this.d, i);
                final String string3 = this.l.getString(mme.d(this.d, i));
                IconCompat e3;
                if (c == 0) {
                    e3 = null;
                }
                else {
                    e3 = IconCompat.e(c);
                }
                return sz.c(e3, afp.c((CharSequence)string3), b3, new Bundle(), (ArrayList)null);
            }
            case 3: {
                final long j = this.i;
                final Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                intent4.setComponent(this.e);
                intent4.putExtra("googlecast-extra_skip_step_ms", j);
                final PendingIntent b4 = nac.b((Context)this, intent4, 201326592);
                final int a = mme.a(this.d, j);
                final String string4 = this.l.getString(mme.b(this.d, j));
                IconCompat e4;
                if (a == 0) {
                    e4 = null;
                }
                else {
                    e4 = IconCompat.e(a);
                }
                return sz.c(e4, afp.c((CharSequence)string4), b4, new Bundle(), (ArrayList)null);
            }
            case 2: {
                PendingIntent b5;
                if (this.m.g) {
                    final Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                    intent5.setComponent(this.e);
                    b5 = nac.b((Context)this, intent5, 67108864);
                }
                else {
                    b5 = null;
                }
                final NotificationOptions d3 = this.d;
                final int k = d3.k;
                final String string5 = this.l.getString(d3.y);
                IconCompat e5;
                if (k == 0) {
                    e5 = null;
                }
                else {
                    e5 = IconCompat.e(k);
                }
                return sz.c(e5, afp.c((CharSequence)string5), b5, new Bundle(), (ArrayList)null);
            }
            case 1: {
                PendingIntent b6;
                if (this.m.f) {
                    final Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                    intent6.setComponent(this.e);
                    b6 = nac.b((Context)this, intent6, 67108864);
                }
                else {
                    b6 = null;
                }
                final NotificationOptions d4 = this.d;
                final int l = d4.j;
                final String string6 = this.l.getString(d4.x);
                IconCompat e6;
                if (l == 0) {
                    e6 = null;
                }
                else {
                    e6 = IconCompat.e(l);
                }
                return sz.c(e6, afp.c((CharSequence)string6), b6, new Bundle(), (ArrayList)null);
            }
            case 0: {
                final mkv m = this.m;
                final int c2 = m.c;
                final boolean b7 = m.b;
                int n2;
                int n3;
                if (c2 == 2) {
                    final NotificationOptions d5 = this.d;
                    n2 = d5.g;
                    n3 = d5.u;
                }
                else {
                    final NotificationOptions d6 = this.d;
                    n2 = d6.h;
                    n3 = d6.v;
                }
                if (!b7) {
                    n2 = this.d.i;
                }
                if (!b7) {
                    n3 = this.d.w;
                }
                final Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                intent7.setComponent(this.e);
                final PendingIntent b8 = nac.b((Context)this, intent7, 67108864);
                final String string7 = this.l.getString(n3);
                IconCompat e7;
                if (n2 == 0) {
                    e7 = null;
                }
                else {
                    e7 = IconCompat.e(n2);
                }
                return sz.c(e7, afp.c((CharSequence)string7), b8, new Bundle(), (ArrayList)null);
            }
        }
    }
    
    private final void d(final mkt mkt) {
        final int[] f = mme.f(mkt);
        int[] h;
        if (f == null) {
            h = null;
        }
        else {
            h = f.clone();
        }
        this.h = h;
        final List e = mme.e(mkt);
        this.g = new ArrayList();
        if (e == null) {
            return;
        }
        for (final NotificationAction notificationAction : e) {
            final String a = notificationAction.a;
            afh afh;
            if (!a.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !a.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !a.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !a.equals("com.google.android.gms.cast.framework.action.FORWARD") && !a.equals("com.google.android.gms.cast.framework.action.REWIND") && !a.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !a.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                final Intent intent = new Intent(notificationAction.a);
                intent.setComponent(this.e);
                final PendingIntent b = nac.b((Context)this, intent, 67108864);
                final int b2 = notificationAction.b;
                final String c = notificationAction.c;
                IconCompat e2;
                if (b2 == 0) {
                    e2 = null;
                }
                else {
                    e2 = IconCompat.e(b2);
                }
                afh = sz.c(e2, afp.c((CharSequence)c), b, new Bundle(), (ArrayList)null);
            }
            else {
                afh = this.c(notificationAction.a);
            }
            if (afh != null) {
                this.g.add(afh);
            }
        }
    }
    
    private final void e() {
        this.g = new ArrayList();
        final Iterator iterator = this.d.c.iterator();
        while (iterator.hasNext()) {
            final afh c = this.c((String)iterator.next());
            if (c != null) {
                this.g.add(c);
            }
        }
        this.h = this.d.a().clone();
    }
    
    public final void a() {
        if (this.m == null) {
            return;
        }
        final oia b = this.b;
        final PendingIntent pendingIntent = null;
        Object b2;
        if (b == null) {
            b2 = null;
        }
        else {
            b2 = b.b;
        }
        final afp afp = new afp((Context)this, "cast_media_notification");
        afp.m((Bitmap)b2);
        afp.q(this.d.f);
        afp.j((CharSequence)this.m.d);
        afp.i((CharSequence)this.l.getString(this.d.t, new Object[] { this.m.e }));
        afp.n(true);
        afp.l = false;
        afp.z = 1;
        final ComponentName f = this.f;
        PendingIntent a;
        if (f == null) {
            a = pendingIntent;
        }
        else {
            final Intent intent = new Intent();
            intent.putExtra("targetActivity", (Parcelable)f);
            intent.setAction(f.flattenToString());
            intent.setComponent(f);
            final agt a2 = agt.a((Context)this);
            ComponentName componentName;
            if ((componentName = intent.getComponent()) == null) {
                componentName = intent.resolveActivity(a2.b.getPackageManager());
            }
            if (componentName != null) {
                a2.c(componentName);
            }
            a2.b(intent);
            if (a2.a.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            final Intent[] array = a2.a.toArray(new Intent[0]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            a = agr.a(a2.b, 1, array, 201326592, (Bundle)null);
        }
        if (a != null) {
            afp.g = a;
        }
        final mkt g = this.d.G;
        if (g != null) {
            mkw.c.a("actionsProvider != null", new Object[0]);
            this.d(g);
        }
        else {
            mkw.c.a("actionsProvider == null", new Object[0]);
            this.e();
        }
        final Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            afp.e((afh)iterator.next());
        }
        final axm axm = new axm();
        final int[] h = this.h;
        if (h != null) {
            axm.a = h;
        }
        final MediaSessionCompat$Token a3 = this.m.a;
        if (a3 != null) {
            axm.f = a3;
        }
        afp.r((aft)axm);
        this.startForeground(1, this.o = afp.a());
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onCreate() {
        this.n = (NotificationManager)this.getSystemService("notification");
        final mio b = mio.b((Context)this);
        this.p = b;
        final CastMediaOptions e = b.c().e;
        kgk.aL((Object)e);
        final NotificationOptions c = e.c;
        kgk.aL((Object)c);
        this.d = c;
        this.q = e.a();
        this.l = this.getResources();
        this.e = new ComponentName(this.getApplicationContext(), e.a);
        if (!TextUtils.isEmpty((CharSequence)this.d.e)) {
            this.f = new ComponentName(this.getApplicationContext(), this.d.e);
        }
        else {
            this.f = null;
        }
        final NotificationOptions d = this.d;
        this.i = d.d;
        final int dimensionPixelSize = this.l.getDimensionPixelSize(d.s);
        this.k = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.j = new mlw(this.getApplicationContext(), this.k);
        final NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", (CharSequence)this.getResources().getString(2132018645), 2);
        notificationChannel.setShowBadge(false);
        this.n.createNotificationChannel(notificationChannel);
        mjz.e(afou.X);
    }
    
    public final void onDestroy() {
        final mlw j = this.j;
        if (j != null) {
            j.a();
        }
        mkw.a = null;
        this.n.cancel(1);
    }
    
    public final int onStartCommand(final Intent intent, int n, final int n2) {
        final MediaInfo mediaInfo = (MediaInfo)intent.getParcelableExtra("extra_media_info");
        kgk.aL((Object)mediaInfo);
        final MediaMetadata c = mediaInfo.c;
        kgk.aL((Object)c);
        n = intent.getIntExtra("extra_remote_media_client_player_state", 0);
        final CastDevice castDevice = (CastDevice)intent.getParcelableExtra("extra_cast_device");
        kgk.aL((Object)castDevice);
        final mkv m = new mkv(n == 2, mediaInfo.a, c.a("com.google.android.gms.cast.metadata.TITLE"), castDevice.d, (MediaSessionCompat$Token)intent.getParcelableExtra("extra_media_session_token"), intent.getBooleanExtra("extra_can_skip_next", false), intent.getBooleanExtra("extra_can_skip_prev", false));
        Label_0235: {
            if (!intent.getBooleanExtra("extra_media_notification_force_update", false)) {
                final mkv i = this.m;
                if (i != null && m.b == i.b && m.c == i.c && mmt.k(m.d, i.d) && mmt.k(m.e, i.e) && m.f == i.f && m.g == i.g) {
                    break Label_0235;
                }
            }
            this.m = m;
            this.a();
        }
        WebImage j;
        if (this.q != null) {
            n = this.k.a;
            j = mlc.m(c);
        }
        else if (c.c()) {
            j = c.a.get(0);
        }
        else {
            j = null;
        }
        final oia oia = new oia(j);
        final oia b = this.b;
        if (b == null || !mmt.k(oia.a, b.a)) {
            final mlw k = this.j;
            k.d = (mlv)new mku(this, oia, (byte[])null, (byte[])null);
            k.b((Uri)oia.a);
        }
        this.startForeground(1, this.o);
        mkw.a = (Runnable)new e(this, n2, 11);
        return 2;
    }
}

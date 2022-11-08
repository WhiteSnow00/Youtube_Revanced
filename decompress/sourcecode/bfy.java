import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfy
{
    public final Context a;
    public final Handler b;
    public final AudioManager c;
    public bfx d;
    public int e;
    private final bfw f;
    private int g;
    private boolean h;
    
    public bfy(Context applicationContext, final Handler b, final bfw f) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.f = f;
        final AudioManager c = (AudioManager)applicationContext.getSystemService("audio");
        dk.e((Object)c);
        this.c = c;
        this.e = 3;
        this.g = c(c, 3);
        final int e = this.e;
        final int a = baw.a;
        this.h = c.isStreamMute(e);
        final bfx d = new bfx(this);
        final IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            baw.B(applicationContext, d, intentFilter);
            this.d = d;
        }
        catch (final RuntimeException ex) {
            bao.d("StreamVolumeManager", "Error registering stream volume receiver", (Throwable)ex);
        }
    }
    
    private static int c(final AudioManager audioManager, final int n) {
        try {
            return audioManager.getStreamVolume(n);
        }
        catch (final RuntimeException ex) {
            final StringBuilder sb = new StringBuilder("Could not retrieve stream volume for stream type ");
            sb.append(n);
            bao.d("StreamVolumeManager", sb.toString(), (Throwable)ex);
            return audioManager.getStreamMaxVolume(n);
        }
    }
    
    public final void a(final int e) {
        if (this.e == e) {
            return;
        }
        this.e = e;
        this.b();
        final bet bet = (bet)this.f;
        final ayb s = bew.S(bet.a.m);
        if (!s.equals((Object)bet.a.E)) {
            final bew a = bet.a;
            a.E = s;
            a.J.m(29, (bal)new bel(s, 17));
        }
    }
    
    public final void b() {
        final int c = c(this.c, this.e);
        final AudioManager c2 = this.c;
        final int e = this.e;
        final int a = baw.a;
        final boolean streamMute = c2.isStreamMute(e);
        if (this.g == c && this.h == streamMute) {
            return;
        }
        this.g = c;
        this.h = streamMute;
        ((bet)this.f).a.J.m(30, (bal)new ber(c, streamMute));
    }
}

import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamb extends BroadcastReceiver
{
    public boolean a;
    public final aame b;
    
    public aamb(final aame b) {
        this.b = b;
    }
    
    public final void a() {
        if (!this.a) {
            this.b.a.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.a = true;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final aame b = this.b;
        if (!b.i.a) {
            return;
        }
        if (b.h == null) {
            return;
        }
        if (b.b.k) {
            return;
        }
        abkm.a(abkl.b, "AudioFocus Noisy", new Object[0]);
        this.b.f.tt(new aanw());
        if (tvo.e(this.b.a)) {
            this.b.h.c();
        }
        else {
            this.b.h.a();
        }
        final aamc e = this.b.e;
        final int e2 = aamc.e;
        e.a = false;
        e.b = false;
    }
}

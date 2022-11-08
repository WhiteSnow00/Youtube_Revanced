import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import android.os.PowerManager;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jun extends BroadcastReceiver
{
    public final fa a;
    public final gbn b;
    public final tku c;
    public final aum d;
    public boolean e;
    public PowerManager f;
    public ListenableFuture g;
    public final uyf h;
    private final fxo i;
    private final gko j;
    private final zki k;
    private final zjy l;
    
    public jun(final fa a, final aum d, final uyf h, final gbn b, final fxo i, final gko j, final tku c, final zki k, final zjy l) {
        a.getSavedStateRegistry().c("auto_dark_theme_bundle", (cgg)new cb(this, 8));
        final Bundle a2 = a.getSavedStateRegistry().a("auto_dark_theme_bundle");
        this.a = a;
        this.d = d;
        this.h = h;
        this.b = b;
        this.i = i;
        this.j = j;
        this.c = c;
        this.k = k;
        this.l = l;
        ListenableFuture e = null;
        if (a2 != null) {
            e = e;
            if (a2.getBoolean("auto_dark_theme_snackbar_msg", false)) {
                e = afrp.e((ListenableFuture)aftj.m(l.b(k.c())), (aexg)new joy(this, 8), (Executor)afsl.a);
            }
        }
        this.g = e;
        if ((a2 == null || !a2.getBoolean("auto_dark_theme_user_toggle", false)) && ((gkn)c.c()).h) {
            tcp.n(d, c.b((aexg)jth.d), (trb)jpn.k, (trb)tcp.b);
        }
    }
    
    public final boolean a() {
        final PowerManager f = this.f;
        return f != null && f.isPowerSaveMode();
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.e) {
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                if (this.i.b) {
                    final gkm a = this.j.a();
                    gkm gkm;
                    if (this.a()) {
                        gkm = gkm.b;
                    }
                    else {
                        gkm = gkm.a;
                    }
                    if (a != gkm && this.a()) {
                        tcp.n((aum)this.a, this.l.b(this.k.c()), (trb)jpn.l, (trb)new jly(this, 18));
                    }
                }
            }
        }
    }
}

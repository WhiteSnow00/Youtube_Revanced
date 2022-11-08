import java.util.function.Consumer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.function.Function;
import j$.util.Optional;
import android.content.Intent;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelOverlay;
import com.google.android.apps.youtube.app.watchwhile.startup.StartupSignalStream;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkj extends hkk
{
    public final ReelWatchActivity a;
    public final hmm b;
    public final atjj c;
    public final hqv d;
    public final fxo e;
    public final hlf f;
    public final tlb g;
    public final tox h;
    public final hlh i;
    public final hlk j;
    public final StartupSignalStream k;
    public final FullscreenEngagementPanelOverlay l;
    public boolean m;
    public final uyf n;
    public final uyi o;
    public final arud p;
    public final phq q;
    public final mrm r;
    public final acnx s;
    private final hjp u;
    
    public hkj(final ReelWatchActivity a, final hjp u, final hmm b, final atjj c, final hqv d, final uyf n, final arud p24, final fxo e, final acnx s, final hlf f, final mrm r, final tlb g, final phq q, final tox h, final hlh i, final hlk j, final StartupSignalStream k, final FullscreenEngagementPanelOverlay l, final uyi o, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.m = false;
        this.a = a;
        this.u = u;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
        this.p = p24;
        this.e = e;
        this.s = s;
        this.f = f;
        this.r = r;
        this.g = g;
        this.q = q;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.o = o;
    }
    
    public static Optional a(final Intent intent) {
        return Optional.ofNullable((Object)intent).map((Function)hkc.f);
    }
    
    public final void b() {
        final Intent intent = this.a.getIntent();
        final atjj c = this.c;
        String s;
        if (c == null) {
            s = " !reelBackstack;";
        }
        else {
            s = "";
        }
        String s2 = s;
        if (c != null) {
            if (intent == null) {
                s2 = s.concat(" !intent;");
            }
            else {
                final aioe b = ((gug)c.a()).b();
                if (b != null && ((agzd)b).rs((agyr)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    return;
                }
                final Optional map = a(intent).map((Function)hkc.c);
                map.ifPresent((Consumer)new fuz(this, intent, 11));
                s2 = s;
                if (map.isEmpty()) {
                    s2 = s.concat(" !command;");
                }
            }
        }
        if (!aexs.f(s2)) {
            if (this.u != null) {
                hjp.a(zjo.b, zjn.x, "ReelWatchActivity.replaceFragment failed:".concat(s2));
            }
            this.a.finish();
        }
    }
}

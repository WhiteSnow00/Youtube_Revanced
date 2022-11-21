import java.util.Map;
import java.util.HashMap;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.a;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absy
{
    public final Executor a;
    public final ange b;
    public final TrackingUrlModel c;
    public final String d;
    public final int e;
    public final tkq f;
    public final zmd g;
    public final ajfd h;
    public volatile boolean i;
    private final zoa j;
    private final twk k;
    private final twk l;
    private boolean m;
    private final aajb n;
    private final mtf o;
    
    public absy(final aajb n, final Executor a, final mtf o, final zoa j, final tkq f, final zmd g, final vbo vbo, final ange b, final TrackingUrlModel c, final String d, final int e, final byte[] array, final byte[] array2) {
        this.n = n;
        this.a = a;
        this.o = o;
        this.j = j;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.l = twk.b(c.c());
        this.k = twk.b(Uri.parse("?".concat(String.valueOf(b.c))));
        this.f = f;
        this.g = g;
        this.h = e(vbo);
        this.d = d;
        this.e = e;
        this.i = false;
        this.m = true;
    }
    
    public absy(final aajb aajb, final Executor executor, final mtf mtf, final zoa zoa, final tkq tkq, final zmd zmd, final vbo vbo, final ange ange, final TrackingUrlModel trackingUrlModel, final byte[] array, final byte[] array2) {
        this(aajb, executor, mtf, zoa, tkq, zmd, vbo, ange, trackingUrlModel, "", 0, null, null);
        final ajfd e = e(vbo);
        boolean m = false;
        if (e != null) {
            m = m;
            if (e.f) {
                m = true;
            }
        }
        this.m = m;
    }
    
    public absy(final aajb aajb, final Executor executor, final mtf mtf, final zoa zoa, final tkq tkq, final zmd zmd, final vbo vbo, final AttestationClient$AttestationClientState attestationClient$AttestationClientState, final byte[] array, final byte[] array2) {
        this(aajb, executor, mtf, zoa, tkq, zmd, vbo, attestationClient$AttestationClientState.a, attestationClient$AttestationClientState.b, attestationClient$AttestationClientState.c, attestationClient$AttestationClientState.d, null, null);
        this.i = attestationClient$AttestationClientState.e;
    }
    
    static ajfd e(final vbo vbo) {
        final airq b = vbo.b();
        if (b != null) {
            amkj amkj;
            if ((amkj = b.i) == null) {
                amkj = amkj.a;
            }
            if ((amkj.c & 0x20000) != 0x0) {
                amkj amkj2;
                if ((amkj2 = b.i) == null) {
                    amkj2 = amkj.a;
                }
                ajfd ajfd;
                if ((ajfd = amkj2.z) == null) {
                    ajfd = ajfd.a;
                }
                return ajfd;
            }
        }
        return null;
    }
    
    public final String a(final String s) {
        return this.k.d(s);
    }
    
    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        final znz c = this.j.c();
        this.a.execute(new a(this, c, this.j.k(), c.g(), 13));
    }
    
    public final void c(final znz znz) {
        if (this.k.d("c5a") != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("challenge", this.b.c);
            final absx absx = new absx(this, znz, 0);
            final mtf o = this.o;
            String a;
            if (!afbj.f(this.a("c5b"))) {
                a = this.a("c5b");
            }
            else {
                a = "yt_player";
            }
            o.b(a, (Map)hashMap, (mwj)absx);
            return;
        }
        this.d(null, znz);
    }
    
    public final void d(final String s, final znz g) {
        final twk c = twk.c(this.l);
        if (!this.d.isEmpty()) {
            c.h("cpn", this.d);
        }
        final Uri a = c.a();
        final zpb n = aajb.n("atr");
        n.b(a);
        final HashMap f = new HashMap();
        final twk c2 = twk.c(this.k);
        if (s != null) {
            c2.h("r5a", s);
        }
        f.put("atr", afbj.e(c2.a().getEncodedQuery()));
        n.f = f;
        n.d = this.m;
        n.a((zpt)new vkv(this.c, 0));
        n.g = g;
        tut.g("Pinging ".concat(String.valueOf(String.valueOf(a))));
        this.n.k(null, n, zrh.b);
    }
}

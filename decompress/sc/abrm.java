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

public final class abrm
{
    public final Executor a;
    public final andx b;
    public final TrackingUrlModel c;
    public final String d;
    public final int e;
    public final tjm f;
    public final zki g;
    public final ajdf h;
    public volatile boolean i;
    private final zmf j;
    private final tvi k;
    private final tvi l;
    private boolean m;
    private final aahc n;
    private final mdp o;
    
    public abrm(final aahc n, final Executor a, final mdp o, final zmf j, final tjm f, final zki g, final vaf vaf, final andx b, final TrackingUrlModel c, final String d, final int e, final byte[] array, final byte[] array2) {
        this.n = n;
        this.a = a;
        this.o = o;
        this.j = j;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.l = tvi.b(c.c());
        this.k = tvi.b(Uri.parse("?".concat(String.valueOf(b.c))));
        this.f = f;
        this.g = g;
        this.h = e(vaf);
        this.d = d;
        this.e = e;
        this.i = false;
        this.m = true;
    }
    
    public abrm(final aahc aahc, final Executor executor, final mdp mdp, final zmf zmf, final tjm tjm, final zki zki, final vaf vaf, final andx andx, final TrackingUrlModel trackingUrlModel, final byte[] array, final byte[] array2) {
        this(aahc, executor, mdp, zmf, tjm, zki, vaf, andx, trackingUrlModel, "", 0, null, null);
        final ajdf e = e(vaf);
        boolean m = false;
        if (e != null) {
            m = m;
            if (e.f) {
                m = true;
            }
        }
        this.m = m;
    }
    
    public abrm(final aahc aahc, final Executor executor, final mdp mdp, final zmf zmf, final tjm tjm, final zki zki, final vaf vaf, final AttestationClient$AttestationClientState attestationClient$AttestationClientState, final byte[] array, final byte[] array2) {
        this(aahc, executor, mdp, zmf, tjm, zki, vaf, attestationClient$AttestationClientState.a, attestationClient$AttestationClientState.b, attestationClient$AttestationClientState.c, attestationClient$AttestationClientState.d, null, null);
        this.i = attestationClient$AttestationClientState.e;
    }
    
    static ajdf e(final vaf vaf) {
        final aipx b = vaf.b();
        if (b != null) {
            amie amie;
            if ((amie = b.i) == null) {
                amie = amie.a;
            }
            if ((amie.c & 0x20000) != 0x0) {
                amie amie2;
                if ((amie2 = b.i) == null) {
                    amie2 = amie.a;
                }
                ajdf ajdf;
                if ((ajdf = amie2.z) == null) {
                    ajdf = ajdf.a;
                }
                return ajdf;
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
        final zme c = this.j.c();
        this.a.execute(new a(this, c, this.j.k(), c.g(), 13));
    }
    
    public final void c(final zme zme) {
        if (this.k.d("c5a") != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("challenge", this.b.c);
            final abrl abrl = new abrl(this, zme, 0);
            final mdp o = this.o;
            String a;
            if (!aezr.f(this.a("c5b"))) {
                a = this.a("c5b");
            }
            else {
                a = "yt_player";
            }
            o.d(a, (Map)hashMap, (mvu)abrl);
            return;
        }
        this.d(null, zme);
    }
    
    public final void d(final String s, final zme g) {
        final tvi c = tvi.c(this.l);
        if (!this.d.isEmpty()) {
            c.h("cpn", this.d);
        }
        final Uri a = c.a();
        final znf n = aahc.n("atr");
        n.b(a);
        final HashMap f = new HashMap();
        final tvi c2 = tvi.c(this.k);
        if (s != null) {
            c2.h("r5a", s);
        }
        f.put("atr", aezr.e(c2.a().getEncodedQuery()));
        n.f = f;
        n.d = this.m;
        n.a((znx)new vjn(this.c, 0));
        n.g = g;
        ttr.g("Pinging ".concat(String.valueOf(String.valueOf(a))));
        this.n.k((ziw)null, n, zpl.b);
    }
}

import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import android.view.View$OnLayoutChangeListener;
import android.content.Context;
import com.google.android.apps.youtube.app.search.voice.VoiceInputController$1;
import android.media.AudioRecord;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlx implements ViewTreeObserver$OnGlobalLayoutListener
{
    static final wyb a;
    static final wyb b;
    static final wyb c;
    private Intent A;
    private final aul B;
    private final uyi C;
    private final arud D;
    private final qbo E;
    private final blt F;
    private final auip G;
    private final bx H;
    public final wyo d;
    public final br e;
    public final Activity f;
    public final int g;
    public final int h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public BottomSheetBehavior m;
    public asic n;
    public boolean o;
    public final uyf p;
    private final acxp q;
    private final acwn r;
    private final wwv s;
    private final abno t;
    private AudioRecord u;
    private final acsm v;
    private final kzd w;
    private final acvr x;
    private final String y;
    private byte[] z;
    
    static {
        a = wya.c(65799);
        b = wya.c(65800);
        c = wya.c(65812);
    }
    
    public jlx(final wyo d, final uyf p25, final arud d2, final acxp q, final blt f, final acwn r, final auip g, final abno t, final acsm v, final bx h, final kzd w, final uyi c, final br e, final qbo e2, final String y, final wwv s, final int g2, final int h2, final acvr x, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        final VoiceInputController$1 b = new VoiceInputController$1(this);
        this.B = (aul)b;
        this.d = d;
        this.p = p25;
        this.D = d2;
        this.q = q;
        this.F = f;
        this.r = r;
        this.G = g;
        this.e = e;
        this.f = (Activity)e.od();
        this.E = e2;
        this.y = y;
        this.s = s;
        this.t = t;
        this.v = v;
        this.H = h;
        this.w = w;
        this.C = c;
        this.g = g2;
        this.h = h2;
        this.x = x;
        r.h();
        if (gkt.Q(p25)) {
            e.getLifecycle().b((aul)b);
        }
    }
    
    private final Intent h() {
        if (gkt.ax(this.D)) {
            this.u = this.q.a();
        }
        Intent addFlags;
        if (this.j()) {
            addFlags = new Intent((Context)this.f, (Class)this.H.a).addFlags(131072);
        }
        else {
            addFlags = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        }
        addFlags.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        addFlags.putExtra("android.speech.extra.MAX_RESULTS", 1);
        addFlags.addFlags(262144);
        return addFlags;
    }
    
    private final void i(final Intent a) {
        if (this.e.og().e(this.g) != null) {
            return;
        }
        if (this.g()) {
            tmy.o(this.f);
            this.A = a;
            return;
        }
        if (this.w.f()) {
            this.w.h(0);
        }
        this.e.O.findViewById(this.g).setVisibility(0);
        if (this.h > 0) {
            this.e.O.addOnLayoutChangeListener((View$OnLayoutChangeListener)new jbw(this, 3));
        }
        final Bundle extras = a.getExtras();
        final acvr x = this.x;
        final jmq jmq = new jmq();
        jmq.ag(extras);
        jmq.af = x;
        final ct i = this.e.og().i();
        i.q(this.g, (br)jmq);
        i.d();
        this.m.H(3);
        this.m.z((adrk)new jlw(this, (jlf)jmq));
        final atjd ae = jmq.ae;
        final asic n = this.n;
        if (n != null) {
            asjg.b((AtomicReference)n);
        }
        this.n = ((ashp)ae).aa((asix)new jcp(this, 19), (asix)new jcp(this, 20));
    }
    
    private final boolean j() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final ashe l = this.C.l(45365991L);
        final boolean b = false;
        asjg.b((AtomicReference)l.aw((Object)false).Z((asix)new jcp(atomicBoolean, 18)));
        boolean b2 = b;
        if (gkt.ax(this.D)) {
            b2 = b;
            if (!this.k) {
                b2 = b;
                if (!tqt.f((Context)this.f)) {
                    if (atomicBoolean.get()) {
                        if (!this.x.a) {
                            return true;
                        }
                        b2 = b;
                    }
                    else {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final void a(final int n, final String[] array, final int[] array2) {
        if (n == 1) {
            if (array2.length > 0 && array2[0] == 0) {
                this.s.J(3, (wxz)new wws(jlx.a), (alff)null);
                this.d();
                return;
            }
            if (!acsm.a(this.f, array, array2).isEmpty()) {
                this.s.J(3, (wxz)new wws(jlx.c), (alff)null);
                this.d();
                return;
            }
            this.s.J(3, (wxz)new wws(jlx.b), (alff)null);
        }
    }
    
    public final void b(final Intent intent) {
        final ArrayList stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        final byte[] byteArrayExtra = intent.getByteArrayExtra("RecognizedText");
        final boolean booleanExtra = intent.getBooleanExtra("RegularVoiceSearch", false);
        final String stringExtra = intent.getStringExtra("AssistantCsn");
        if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
            if (gkt.aw(this.D) && this.d.t(alku.K)) {
                this.d.y("voz_mf", alku.K);
            }
            final qbo e = this.E;
            if (e != null) {
                e.J((String)stringArrayListExtra.get(0), this.z, this.i, 64833, this.x, (String)null);
            }
        }
        else if (byteArrayExtra != null) {
            if (this.E != null) {
                final byte[] z = this.z;
                if (z == null || z.length == 0) {
                    this.z = intent.getByteArrayExtra("SearchboxStats");
                }
                this.E.K(byteArrayExtra, stringExtra, this.z);
            }
        }
        else {
            if (booleanExtra) {
                this.k = true;
                this.d();
                return;
            }
            this.d.i(alku.K, "");
        }
    }
    
    public final void c(final byte[] z, final boolean b) {
        this.z = z;
        final wwv s = this.s;
        int n;
        if (!b) {
            n = 64833;
        }
        else {
            n = 158544;
        }
        s.J(3, (wxz)new wws(wya.c(n)), (alff)null);
        if (b) {
            this.j = 158544;
        }
        if (gkt.aw(this.D)) {
            this.d.x(alku.K);
        }
        if (gkt.ax(this.D) && td.c((Context)this.f, "android.permission.RECORD_AUDIO") != 0) {
            final PackageManager packageManager = this.f.getPackageManager();
            try {
                final String[] requestedPermissions = packageManager.getPackageInfo(this.f.getPackageName(), 4096).requestedPermissions;
                for (int length = requestedPermissions.length, i = 0; i < length; ++i) {
                    if (requestedPermissions[i].contains("android.permission.RECORD_AUDIO")) {
                        this.s.l((wxz)new wws(jlx.a));
                        this.s.l((wxz)new wws(jlx.b));
                        this.s.l((wxz)new wws(jlx.c));
                        this.v.d(new String[] { "android.permission.RECORD_AUDIO" });
                        this.e.ad(new String[] { "android.permission.RECORD_AUDIO" }, 1);
                        return;
                    }
                }
                zjp.b(zjo.b, zjn.F, "Permission not declared in manifest: android.permission.RECORD_AUDIO");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                trn.o("VoiceInputController", "PackageInfo not found", (Throwable)ex);
            }
            this.k = true;
        }
        this.d();
    }
    
    public final void d() {
        if (gkt.aw(this.D) && this.d.t(alku.K)) {
            this.d.y("voz_ms", alku.K);
        }
        final Intent h = this.h();
        if (this.z == null) {
            this.r.f();
            final acww p = this.F.p();
            this.r.i = p.j();
            this.r.j = p.c();
            this.r.k = this.G.B();
            this.z = ((agxl)this.r.a(p.f())).toByteArray();
        }
        if (this.j()) {
            h.putExtra("SearchboxStats", this.z);
            final AudioRecord u = this.u;
            if (u != null) {
                h.putExtra("MicSampleRate", u.getSampleRate());
                h.putExtra("MicAudioFormatEncoding", this.u.getAudioFormat());
                h.putExtra("MicChannelConfig", this.u.getChannelConfiguration());
            }
            h.putExtra("ParentCSN", this.i);
            h.putExtra("ParentVeType", this.j);
            h.putExtra("searchEndpointParams", this.y);
            h.putExtra("IS_SHORTS_CONTEXT", this.x.a);
            h.putExtra("IS_SHORTS_CHIP_SELECTED", this.x.b);
        }
        final abno t = this.t;
        if (t != null) {
            t.a();
        }
        if (this.j() && gkt.Q(this.p) && !this.l && this.g != 0) {
            this.i(h);
            return;
        }
        this.e.startActivityForResult(h, 1000);
    }
    
    public final boolean e() {
        return this.h().resolveActivity(this.f.getPackageManager()) != null;
    }
    
    public final boolean f() {
        final BottomSheetBehavior m = this.m;
        return m != null && m.z == 3;
    }
    
    public final boolean g() {
        final aoa w = ana.w(this.e.O);
        return w != null && w.u();
    }
    
    public final void onGlobalLayout() {
        final boolean g = this.g();
        if (g != this.o) {
            this.o = g;
            if (g) {
                if (this.f()) {
                    this.m.H(5);
                }
            }
            else {
                final Intent a = this.A;
                if (a != null) {
                    this.i(a);
                    this.A = null;
                }
            }
        }
    }
}

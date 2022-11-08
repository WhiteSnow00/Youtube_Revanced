// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.voice;

import android.os.Looper;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.res.Configuration;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.view.View;
import android.os.Handler;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

public class VoiceSearchActivityV2 extends jlo implements acst, jmc, jmo, cp
{
    private static final PermissionDescriptor[] v;
    private ConnectivitySlimStatusBarController A;
    private jli B;
    private jmr C;
    private boolean D;
    private boolean E;
    private int F;
    private String G;
    private String H;
    private byte[] I;
    private jlz J;
    private acvr K;
    public Handler b;
    public cl c;
    public acsu d;
    public wyo e;
    public tox f;
    public wwv g;
    public gko h;
    public tdz i;
    public jmp j;
    public View k;
    public jlt l;
    public uyf m;
    public acss n;
    public uyi o;
    public uyi p;
    public arud q;
    public pgf r;
    public jjg s;
    public e t;
    public e u;
    private boolean w;
    private boolean x;
    private gkm y;
    private String z;
    
    static {
        v = new PermissionDescriptor[] { new PermissionDescriptor(2, wya.c(65799), wya.c(65800)) };
    }
    
    public VoiceSearchActivityV2() {
        this.K = acvr.a().a();
    }
    
    private final void j() {
        if (!this.isFinishing()) {
            this.finish();
        }
    }
    
    private final void k(final br br, final String z) {
        final br f = this.c.f(this.z);
        br.getClass();
        tsx.n(z);
        final ct i = this.c.i();
        if (f != null && f.ar() && !f.equals(br)) {
            i.m(f);
        }
        this.k.setVisibility(0);
        if (!br.ar()) {
            i.r(2131429083, br, z);
        }
        else if (br.as()) {
            i.o(br);
        }
        i.i = 4099;
        i.a();
        this.z = z;
    }
    
    public final void a(final String s, final Bundle bundle) {
        if (s.equals("VaaConsentWebViewRequestKey")) {
            this.b.post((Runnable)new jku(this, bundle, 5));
            return;
        }
        trn.m("VoiceSearchActivity", "Unexpected fragment result request key: ".concat(String.valueOf(s)));
    }
    
    public final void aL() {
        this.j();
    }
    
    public final void aM() {
        this.w = false;
        this.k.setVisibility(8);
        this.b.post((Runnable)new jcd(this, 17));
    }
    
    public final void b() {
        this.j.n();
    }
    
    public final void c(final String text, final String s) {
        final jlz j = this.J;
        j.d.setText((CharSequence)text);
        j.d.requestLayout();
        this.j.k();
        this.i(s);
    }
    
    public final void d(final String s) {
        this.k((br)(this.l = jlt.r(s)), "VAA_CONSENT_FRAGMENT");
        this.c.O("VaaConsentWebViewRequestKey", (aum)this, (cp)this);
    }
    
    public final void e() {
        final Intent intent = this.getIntent();
        intent.putExtra("AssistantCsn", this.g.i());
        this.setResult(1, intent);
        this.j();
    }
    
    public final void f(final byte[] array) {
        if (gkt.aw(this.q) && this.e.t(alku.K)) {
            this.e.y("voz_rqf", alku.K);
        }
        final Intent intent = this.getIntent();
        intent.putExtra("RecognizedText", array);
        intent.putExtra("AssistantCsn", this.g.i());
        intent.putExtra("SearchboxStats", this.I);
        this.setResult(-1, intent);
        this.j.j();
        this.j();
    }
    
    public final void g() {
        this.setVisible(false);
        this.E = true;
        final Intent intent = this.getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        this.setResult(-1, intent);
        this.j();
    }
    
    public final void h() {
        this.g.l((wxz)new wws(wya.c(62943)));
        if (gkt.aw(this.q) && this.e.t(alku.K)) {
            this.e.y("voz_vp", alku.K);
        }
        if (gkt.u(this.m)) {
            tcp.n((aum)this, this.j.b(), (trb)new jly(this, 8), (trb)new jly(this, 9));
            return;
        }
        this.i("");
    }
    
    public final void i(final String s) {
        this.j.g(s, this.I, this.H);
        final jmp j = this.j;
        if (!j.o) {
            j.d();
            return;
        }
        if (this.x) {
            this.x = false;
            j.n();
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final tox f = this.f;
        if (f != null) {
            f.b();
        }
        this.C.u();
        this.j.c();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.y = this.h.a();
        final boolean b = this.p.aT() && this.p.aU();
        final gkm a = gkm.a;
        final int ordinal = this.y.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (b) {
                    ((fa)this).setTheme(2132084273);
                }
                else {
                    ((fa)this).setTheme(2132084272);
                }
            }
        }
        else if (b) {
            ((fa)this).setTheme(2132084289);
        }
        else {
            ((fa)this).setTheme(2132084288);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.o.ck().aw((Object)false).Z((asix)new jmj(atomicBoolean, 0)));
        if (atomicBoolean.get()) {
            ((qt)this).setContentView(2131625751);
        }
        else {
            ((qt)this).setContentView(2131625750);
        }
        final View viewById = ((fa)this).findViewById(2131432391);
        final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
        this.c = supportFragmentManager;
        if (bundle != null && (this.d = (acsu)supportFragmentManager.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)this.z, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acsm.f((Context)this, VoiceSearchActivityV2.v))) {
            final ct i = this.c.i();
            i.m((br)this.d);
            i.a();
        }
        this.k = ((fa)this).findViewById(2131429083);
        ViewGroup viewGroup;
        if ((viewGroup = (ViewGroup)((fa)this).findViewById(2131431596)) == null) {
            viewGroup = (ViewGroup)((fa)this).findViewById(2131427835);
        }
        final jli k = jfi.k((Context)this);
        this.B = k;
        (this.A = this.u.h((Context)this, k)).g(viewGroup);
        this.F = this.getIntent().getIntExtra("ParentVeType", 0);
        this.G = this.getIntent().getStringExtra("ParentCSN");
        this.H = this.getIntent().getStringExtra("searchEndpointParams");
        this.I = this.getIntent().getByteArrayExtra("SearchboxStats");
        final acvq a2 = acvr.a();
        a2.c(this.getIntent().getBooleanExtra("IS_SHORTS_CONTEXT", false));
        a2.b(this.getIntent().getBooleanExtra("IS_SHORTS_CHIP_SELECTED", false));
        this.K = a2.a();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agza builder = ((agzi)amob.a).createBuilder();
        final int f = this.F;
        builder.copyOnWrite();
        final amob amob = (amob)builder.instance;
        amob.b |= 0x2;
        amob.d = f;
        final String g = this.G;
        if (g != null) {
            builder.copyOnWrite();
            final amob amob2 = (amob)builder.instance;
            amob2.b |= 0x1;
            amob2.c = g;
        }
        agzc.e((agyr)amoa.b, (Object)builder.build());
        this.g.b(wya.b(22678), (aioe)((agza)agzc).build(), (alff)null);
        final jjg s = this.s;
        final wwv g2 = this.g;
        final Context context = (Context)((atjj)s.b).a();
        context.getClass();
        final gko gko = (gko)((atjj)s.a).a();
        gko.getClass();
        viewById.getClass();
        g2.getClass();
        (this.C = new jmr(context, gko, viewById, g2)).u();
        this.j = this.r.x((jmo)this, (jmt)this.C, this.A, this.b, this.g, this.e, (aum)this, this.K);
        ((qt)this).getOnBackPressedDispatcher().a(this.j.a());
        final e t = this.t;
        final LinearLayout linearLayout = (LinearLayout)viewById.findViewById(2131432388);
        final wwv g3 = this.g;
        final cl c = this.c;
        final jmp j = this.j;
        final uyf uyf = (uyf)((atjj)t.d).a();
        uyf.getClass();
        final alm alm = (alm)((atjj)t.a).a();
        alm.getClass();
        final adbp adbp = (adbp)((atjj)t.b).a();
        adbp.getClass();
        final acup acup = (acup)((atjj)t.c).a();
        acup.getClass();
        linearLayout.getClass();
        g3.getClass();
        c.getClass();
        j.getClass();
        this.J = new jlz(uyf, alm, adbp, acup, (aum)this, linearLayout, g3, c, j, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.x = true;
    }
    
    public final void onDestroy() {
        this.j.o();
        this.g.s();
        final ConnectivitySlimStatusBarController a = this.A;
        if (a != null) {
            a.k();
        }
        this.b.removeCallbacksAndMessages((Object)null);
        super.onDestroy();
    }
    
    public final void onPause() {
        super.onPause();
        if (this.E) {
            this.overridePendingTransition(0, 0);
            this.E = false;
        }
    }
    
    public final void onRestart() {
        super.onRestart();
        if (this.y != this.h.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue((Runnable)new jcd(this, 18));
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.i.g((Object)this.j);
        this.A.r(true);
        final tox f = this.f;
        if (f != null) {
            f.b();
        }
        if (td.c((Context)this, "android.permission.RECORD_AUDIO") == 0) {
            if (this.j.p()) {
                this.h();
                return;
            }
            this.g();
        }
        else {
            final PermissionDescriptor[] v = VoiceSearchActivityV2.v;
            if (!acsm.f((Context)this, v)) {
                this.j();
                return;
            }
            if (this.w) {
                return;
            }
            if (this.d == null) {
                final acss n = this.n;
                n.e(v);
                n.f = wya.b(69076);
                n.g = wya.c(69077);
                n.h = wya.c(69078);
                n.i = wya.c(69079);
                n.b(2132020185);
                n.c(2132020186);
                n.c = 2132019105;
                this.d = (acsu)n.a();
            }
            this.d.aK((acst)this);
            int n2;
            if (this.p.aT() && this.p.aU()) {
                n2 = 2132084273;
            }
            else {
                n2 = 2132084272;
            }
            this.d.aL((Context)new rq((Context)this, n2));
            this.k((br)this.d, "PERMISSION_REQUEST_FRAGMENT");
            this.w = true;
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.i.m((Object)this.j);
        if (!this.D) {
            this.j();
        }
    }
    
    public final void onUserInteraction() {
        final tox f = this.f;
        if (f != null) {
            f.b();
        }
        super.onUserInteraction();
    }
    
    public final void onWindowFocusChanged(final boolean d) {
        super.onWindowFocusChanged(d);
        this.D = d;
    }
}

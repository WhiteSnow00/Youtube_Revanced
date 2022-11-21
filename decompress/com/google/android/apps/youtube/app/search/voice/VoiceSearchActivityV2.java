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

public class VoiceSearchActivityV2 extends jnb implements acwj, jnq, job, cp
{
    private static final PermissionDescriptor[] v;
    private ConnectivitySlimStatusBarController A;
    private jmv B;
    private joe C;
    private boolean D;
    private boolean E;
    private int F;
    private String G;
    private String H;
    private byte[] I;
    private jnn J;
    private aczg K;
    public Handler b;
    public cl c;
    public acwk d;
    public xbu e;
    public tsd f;
    public xab g;
    public glc h;
    public thg i;
    public joc j;
    public View k;
    public jng l;
    public vbo m;
    public acwi n;
    public vbs o;
    public vbs p;
    public arzb q;
    public pih r;
    public jku s;
    public e t;
    public e u;
    private boolean w;
    private boolean x;
    private gla y;
    private String z;
    
    static {
        v = new PermissionDescriptor[] { new PermissionDescriptor(2, xbf.c(65799), xbf.c(65800)) };
    }
    
    public VoiceSearchActivityV2() {
        this.K = aczg.a().a();
    }
    
    private final void j() {
        if (!this.isFinishing()) {
            this.finish();
        }
    }
    
    private final void k(final br br, final String z) {
        final br f = this.c.f(this.z);
        br.getClass();
        twd.n(z);
        final ct i = this.c.i();
        if (f != null && f.ar() && !f.equals((Object)br)) {
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
            this.b.post((Runnable)new jdo(this, bundle, 7));
            return;
        }
        tut.m("VoiceSearchActivity", "Unexpected fragment result request key: ".concat(String.valueOf(s)));
    }
    
    public final void aM() {
        this.j();
    }
    
    public final void aN() {
        this.w = false;
        this.k.setVisibility(8);
        this.b.post((Runnable)new jin(this, 13));
    }
    
    public final void b() {
        this.j.n();
    }
    
    public final void c(final String text, final String s) {
        final jnn j = this.J;
        j.d.setText((CharSequence)text);
        j.d.requestLayout();
        this.j.k();
        this.i(s);
    }
    
    public final void d(final String s) {
        this.k((br)(this.l = jng.r(s)), "VAA_CONSENT_FRAGMENT");
        this.c.O("VaaConsentWebViewRequestKey", (aup)this, (cp)this);
    }
    
    public final void e() {
        final Intent intent = this.getIntent();
        intent.putExtra("AssistantCsn", this.g.i());
        this.setResult(1, intent);
        this.j();
    }
    
    public final void f(final byte[] array) {
        if (fao.bn(this.q) && this.e.t(alox.K)) {
            this.e.y("voz_rqf", alox.K);
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
        this.g.l((xbe)new wzy(xbf.c(62943)));
        if (fao.bn(this.q) && this.e.t(alox.K)) {
            this.e.y("voz_vp", alox.K);
        }
        if (fao.au(this.m)) {
            tfx.n((aup)this, this.j.b(), (tui)new jnl(this, 10), (tui)new jnl(this, 11));
            return;
        }
        this.i("");
    }
    
    public final void i(final String s) {
        this.j.g(s, this.I, this.H);
        final joc j = this.j;
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
        final tsd f = this.f;
        if (f != null) {
            f.b();
        }
        this.C.u();
        this.j.c();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.y = this.h.a();
        final boolean b = this.p.aX() && this.p.aY();
        final gla a = gla.a;
        final int ordinal = this.y.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (b) {
                    ((fa)this).setTheme(2132084277);
                }
                else {
                    ((fa)this).setTheme(2132084276);
                }
            }
        }
        else if (b) {
            ((fa)this).setTheme(2132084293);
        }
        else {
            ((fa)this).setTheme(2132084292);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)this.o.cp().aC(false).aa((asmi)new jnd(atomicBoolean, 6)));
        if (atomicBoolean.get()) {
            ((qu)this).setContentView(2131625757);
        }
        else {
            ((qu)this).setContentView(2131625756);
        }
        final View viewById = ((fa)this).findViewById(2131432395);
        final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
        this.c = supportFragmentManager;
        if (bundle != null && (this.d = (acwk)supportFragmentManager.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)this.z, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acwc.f((Context)this, VoiceSearchActivityV2.v))) {
            final ct i = this.c.i();
            i.m((br)this.d);
            i.a();
        }
        this.k = ((fa)this).findViewById(2131429083);
        ViewGroup viewGroup;
        if ((viewGroup = (ViewGroup)((fa)this).findViewById(2131431600)) == null) {
            viewGroup = (ViewGroup)((fa)this).findViewById(2131427835);
        }
        final jmv s = mgh.S((Context)this);
        this.B = s;
        (this.A = this.u.h((Context)this, s)).g(viewGroup);
        this.F = this.getIntent().getIntExtra("ParentVeType", 0);
        this.G = this.getIntent().getStringExtra("ParentCSN");
        this.H = this.getIntent().getStringExtra("searchEndpointParams");
        this.I = this.getIntent().getByteArrayExtra("SearchboxStats");
        final aczf a2 = aczg.a();
        a2.c(this.getIntent().getBooleanExtra("IS_SHORTS_CONTEXT", false));
        a2.b(this.getIntent().getBooleanExtra("IS_SHORTS_CHIP_SELECTED", false));
        this.K = a2.a();
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        final ahcr builder = ((ahcz)amsl.a).createBuilder();
        final int f = this.F;
        builder.copyOnWrite();
        final amsl amsl = (amsl)builder.instance;
        amsl.b |= 0x2;
        amsl.d = f;
        final String g = this.G;
        if (g != null) {
            builder.copyOnWrite();
            final amsl amsl2 = (amsl)builder.instance;
            amsl2.b |= 0x1;
            amsl2.c = g;
        }
        ahct.e((ahci)amsk.b, (Object)builder.build());
        this.g.b(xbf.b(22678), (aisc)((ahcr)ahct).build(), (alji)null);
        final jku s2 = this.s;
        final xab g2 = this.g;
        final Context context = (Context)((atnb)s2.b).a();
        context.getClass();
        final glc glc = (glc)((atnb)s2.a).a();
        glc.getClass();
        viewById.getClass();
        g2.getClass();
        (this.C = new joe(context, glc, viewById, g2)).u();
        this.j = this.r.x((job)this, (jog)this.C, this.A, this.b, this.g, this.e, (aup)this, this.K);
        ((qu)this).getOnBackPressedDispatcher().a(this.j.a());
        final e t = this.t;
        final LinearLayout linearLayout = (LinearLayout)viewById.findViewById(2131432392);
        final xab g3 = this.g;
        final cl c = this.c;
        final joc j = this.j;
        final vbo vbo = (vbo)((atnb)t.d).a();
        vbo.getClass();
        final alo alo = (alo)((atnb)t.a).a();
        alo.getClass();
        final acws acws = (acws)((atnb)t.b).a();
        acws.getClass();
        final acyg acyg = (acyg)((atnb)t.c).a();
        acyg.getClass();
        linearLayout.getClass();
        g3.getClass();
        c.getClass();
        j.getClass();
        this.J = new jnn(vbo, alo, acws, acyg, (aup)this, linearLayout, g3, c, j, (byte[])null, (byte[])null, (byte[])null);
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
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue((Runnable)new jin(this, 14));
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.i.g((Object)this.j);
        this.A.r(true);
        final tsd f = this.f;
        if (f != null) {
            f.b();
        }
        if (tc.b((Context)this, "android.permission.RECORD_AUDIO") == 0) {
            if (this.j.p()) {
                this.h();
                return;
            }
            this.g();
        }
        else {
            final PermissionDescriptor[] v = VoiceSearchActivityV2.v;
            if (!acwc.f((Context)this, v)) {
                this.j();
                return;
            }
            if (this.w) {
                return;
            }
            if (this.d == null) {
                final acwi n = this.n;
                n.e(v);
                n.f = xbf.b(69076);
                n.g = xbf.c(69077);
                n.h = xbf.c(69078);
                n.i = xbf.c(69079);
                n.b(2132020189);
                n.c(2132020190);
                n.c = 2132019108;
                this.d = n.a();
            }
            this.d.aK((acwj)this);
            int n2;
            if (this.p.aX() && this.p.aY()) {
                n2 = 2132084277;
            }
            else {
                n2 = 2132084276;
            }
            this.d.aL((Context)new rr((Context)this, n2));
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
        final tsd f = this.f;
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

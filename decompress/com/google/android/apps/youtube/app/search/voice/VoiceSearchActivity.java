// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.voice;

import java.io.InputStream;
import java.io.IOException;
import android.animation.TimeInterpolator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View$OnClickListener;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.res.Configuration;
import android.text.TextUtils;
import java.util.Iterator;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnApplyWindowInsetsListener;
import android.content.Context;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.youtube.search.voice.MicrophoneView;
import android.os.Handler;
import android.view.animation.Interpolator;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.widget.RelativeLayout;
import android.media.SoundPool;
import android.media.AudioRecord;
import android.view.View;
import java.util.List;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

public class VoiceSearchActivity extends jlm implements acst, jmc, cp, tec
{
    private static final PermissionDescriptor[] ax;
    public atjj A;
    public atjj B;
    public ConnectivitySlimStatusBarController C;
    public acxf D;
    public Runnable E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public ViewGroup L;
    public boolean M;
    public boolean N;
    public boolean O;
    public LinearLayout P;
    public ImageView Q;
    public List R;
    public int S;
    public String T;
    public View U;
    public byte[] V;
    public ImageView W;
    public jlt X;
    AudioRecord Y;
    public int Z;
    private boolean aA;
    private SoundPool aB;
    private int aC;
    private gkm aD;
    private String aE;
    private jli aF;
    private boolean aG;
    private boolean aH;
    private RelativeLayout aI;
    private ViewGroup aJ;
    private int aK;
    private String aL;
    private acdx aM;
    private e aN;
    public int aa;
    public int ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public anyc af;
    public boolean ag;
    public ahca ah;
    public String ai;
    public final Interpolator aj;
    public uyf ak;
    public acss al;
    public uyi am;
    public uyi an;
    public uyi ao;
    public arud ap;
    public adjo aq;
    public adbp ar;
    public e as;
    public agjt at;
    public alm au;
    public cxz av;
    private boolean ay;
    private ImageView az;
    public Handler b;
    public MicrophoneView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public acxg i;
    public cl j;
    public acsu k;
    public acvr l;
    public boolean m;
    public boolean n;
    public int o;
    public wyo p;
    public tox q;
    public wwv r;
    public acxp s;
    public vjl t;
    public thh u;
    public gko v;
    public tdz w;
    public ScheduledExecutorService x;
    public afts y;
    public acup z;
    
    static {
        ax = new PermissionDescriptor[] { new PermissionDescriptor(2, wya.c(65799), wya.c(65800)) };
    }
    
    public VoiceSearchActivity() {
        this.l = acvr.a().a();
        this.o = 0;
        this.R = Collections.emptyList();
        this.aj = (Interpolator)apb.c(0.05f, 0.0f, 0.0f, 1.0f);
    }
    
    private final Boolean D() {
        return ((fa)this).getResources().getConfiguration().screenHeightDp >= 400;
    }
    
    private final void E() {
        final Resources resources = ((fa)this).getResources();
        final int n = (int)resources.getDimension(2131170090);
        int n2;
        int n5;
        int n6;
        int n7;
        if (tmy.bq((Context)this)) {
            float n3;
            float n4;
            if (tmy.bo((Context)this)) {
                n2 = resources.getDimensionPixelSize(2131167973);
                n3 = 0.22f;
                n4 = 0.2f;
            }
            else {
                n2 = resources.getDimensionPixelSize(2131167972);
                n3 = 0.24f;
                n4 = 0.1f;
            }
            n5 = resources.getDimensionPixelSize(2131169825);
            this.U.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new jmf(this, 0));
            n6 = (int)(n3 * (tmy.bb((Context)this) - this.o));
            n7 = (int)(n4 * tmy.bd((Context)this));
        }
        else {
            float n8;
            if (this.D()) {
                n2 = (int)resources.getDimension(2131167970);
                n8 = resources.getDimension(2131170091);
            }
            else {
                n2 = (int)resources.getDimension(2131167971);
                n8 = resources.getDimension(2131170092);
            }
            n6 = (int)n8;
            n7 = (int)resources.getDimension(2131170090);
            n5 = resources.getDimensionPixelSize(2131169824);
        }
        tmy.aF((View)this.c, tmy.ay(0, 0, 0, n2), (Class)ViewGroup$MarginLayoutParams.class);
        tmy.aF((View)this.aI, tmy.ay(n7, n6, n7, n), (Class)ViewGroup$MarginLayoutParams.class);
        tmy.aF((View)this.G, tmy.ay(0, 0, 0, n5), (Class)ViewGroup$MarginLayoutParams.class);
        final Resources resources2 = ((fa)this).getResources();
        float n9;
        float n10;
        int n11;
        if (tmy.bq((Context)this)) {
            n9 = (float)resources2.getDimensionPixelSize(2131170325);
            n10 = (float)resources2.getDimensionPixelSize(2131170323);
            n11 = resources2.getDimensionPixelSize(2131170321);
        }
        else {
            n9 = (float)resources2.getDimensionPixelSize(2131170324);
            n10 = (float)resources2.getDimensionPixelSize(2131170322);
            n11 = resources2.getDimensionPixelSize(2131170320);
        }
        final float n12 = (float)n11;
        this.G.setTextSize(0, n10);
        this.G.setLineSpacing(n12, 1.0f);
        this.d.setTextSize(0, n10);
        this.d.setLineSpacing(n12, 1.0f);
        this.F.setTextSize(0, n10);
        this.F.setLineSpacing(n12, 1.0f);
        this.I.setTextSize(0, n9);
        this.J.setTextSize(0, n9);
        this.H.setTextSize(0, n9);
    }
    
    private final void F() {
        this.setVisible(false);
        this.aH = true;
        final Intent intent = this.getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        this.setResult(-1, intent);
        this.n();
    }
    
    public final boolean A() {
        return gkt.aN(this.ap);
    }
    
    public final int B() {
        return gkt.aQ(this.ap);
    }
    
    public final int C() {
        return gkt.aR(this.ap);
    }
    
    public final void a(final String s, final Bundle bundle) {
        if (s.equals("VaaConsentWebViewRequestKey")) {
            this.b.post((Runnable)new jku(this, bundle, 4));
            return;
        }
        trn.m("VoiceSearchActivity", "Unexpected fragment result request key: ".concat(String.valueOf(s)));
    }
    
    public final void aL() {
        this.n();
    }
    
    public final void aM() {
        this.ay = false;
        this.U.setVisibility(8);
        this.b.post((Runnable)new jcd(this, 16));
    }
    
    public final void b() {
        this.H.setVisibility(4);
        this.I.setVisibility(8);
        this.v();
    }
    
    public final void c(final String text, final String s) {
        this.K.setText((CharSequence)text);
        this.K.requestLayout();
        final acxg i = this.i;
        if (i != null) {
            i.a();
            this.i = null;
        }
        this.w(s);
    }
    
    public final float d() {
        return gkt.ae(this.ap);
    }
    
    public final int f() {
        return gkt.af(this.ap);
    }
    
    public final acxe g() {
        return (acxe)new jmh(this);
    }
    
    public final aexq h() {
        return gkt.an(this.ap);
    }
    
    public final String i() {
        return gkt.ap(this.ap);
    }
    
    public final String j() {
        final String n = adbp.n();
        final String a = this.ar.a();
        if (!n.isEmpty() && !a.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append("-");
            sb.append(a);
            return sb.toString();
        }
        return "en-US";
    }
    
    public final void k() {
        final boolean booleanValue = this.D();
        int n = 0;
        if ((booleanValue || (boolean)(((fa)this).getResources().getConfiguration().screenWidthDp >= 400)) && !this.R.isEmpty()) {
            final StringBuilder text = new StringBuilder(((fa)this).getResources().getString(2132020000));
            if (this.D()) {
                text.append("\n\n''");
            }
            else {
                text.append("\n''");
            }
            text.append(this.R.get(0));
            text.append("''");
            this.J.setText((CharSequence)text);
            final StringBuilder text2 = new StringBuilder();
            for (final String s : this.R) {
                ++n;
                text2.append("''");
                text2.append(s);
                text2.append("''");
                if (n >= 3) {
                    break;
                }
                text2.append("\n\n");
            }
            this.I.setText((CharSequence)text2);
        }
    }
    
    public final void l() {
        if (this.D != null) {
            return;
        }
        this.D = (acxf)new jmn(this, 1);
    }
    
    public final void m() {
        final ViewGroup l = this.L;
        if (l != null) {
            l.setVisibility(4);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((tge)o).a();
            this.ad = a;
            this.C.r(a ^ true);
            final boolean ad = this.ad;
            final Class[] array = null;
            if (ad) {
                this.b.removeCallbacks(this.E);
                this.G.setText(((fa)this).getResources().getText(2132020209));
                this.c.setEnabled(true);
                this.c.setVisibility(0);
                array2 = array;
                if (this.L != null) {
                    if (!TextUtils.isEmpty((CharSequence)this.ai)) {
                        this.o();
                        return null;
                    }
                    array2 = array;
                }
            }
            else if (this.h) {
                this.b.postDelayed(this.E, 3000L);
                array2 = array;
            }
            else {
                this.s();
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { tge.class };
        }
        return array2;
    }
    
    public final void n() {
        if (!this.isFinishing()) {
            this.finish();
        }
    }
    
    public final void o() {
        tcp.n((aum)this, ((tku)this.A.a()).a(), (trb)ifc.s, (trb)new jly(this, 7));
    }
    
    public final void onBackPressed() {
        this.r.J(3, (wxz)new wws(wya.c(88272)), (alff)null);
        final Intent intent = this.getIntent();
        intent.putExtra("AssistantCsn", this.r.i());
        this.setResult(1, intent);
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final tox q = this.q;
        if (q != null) {
            q.b();
        }
        this.E();
        this.k();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Boolean value = false;
        final SoundPool ab = new SoundPool(5, 3, 0);
        this.aB = ab;
        this.aC = ab.load((Context)this, 2131951697, 0);
        this.e = this.aB.load((Context)this, 2131951708, 0);
        this.f = this.aB.load((Context)this, 2131951696, 0);
        this.g = this.aB.load((Context)this, 2131951660, 0);
        this.aD = this.v.a();
        final boolean b = this.ao.aT() && this.ao.aU();
        final gkm a = gkm.a;
        final int ordinal = this.aD.ordinal();
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
        asjg.b((AtomicReference)this.am.ck().aw((Object)value).Z((asix)new jmj(atomicBoolean, 1)));
        if (atomicBoolean.get()) {
            ((qt)this).setContentView(2131625751);
        }
        else {
            ((qt)this).setContentView(2131625750);
        }
        final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null && (this.k = (acsu)supportFragmentManager.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)this.aE, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acsm.f((Context)this, VoiceSearchActivity.ax))) {
            final ct i = this.j.i();
            i.m((br)this.k);
            i.d();
        }
        this.U = ((fa)this).findViewById(2131429083);
        (this.az = (ImageView)((fa)this).findViewById(2131427738)).setOnClickListener((View$OnClickListener)new jlq(this, 7));
        final MicrophoneView c = (MicrophoneView)((fa)this).findViewById(2131429875);
        this.c = c;
        ((FloatingActionButton)c.findViewById(2131428685)).setImageDrawable(tmy.k(this.c.getContext(), 2131233821, 2130970924));
        ((FloatingActionButton)this.c.findViewById(2131428876)).setImageResource(2131233563);
        this.c.setOnClickListener((View$OnClickListener)new jlq(this, 8));
        this.G = (TextView)((fa)this).findViewById(2131431697);
        this.d = (TextView)((fa)this).findViewById(2131431674);
        this.F = (TextView)((fa)this).findViewById(2131432231);
        this.H = (TextView)((fa)this).findViewById(2131428922);
        this.I = (TextView)((fa)this).findViewById(2131428924);
        this.J = (TextView)((fa)this).findViewById(2131429591);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        asjg.b((AtomicReference)this.an.l(45374875L).aw((Object)value).Z((asix)new jmj(atomicBoolean2, 1)));
        if (atomicBoolean2.get()) {
            this.J.setOnClickListener((View$OnClickListener)new jlq(this, 9));
        }
        this.aI = (RelativeLayout)((fa)this).findViewById(2131432394);
        this.K = (TextView)((fa)this).findViewById(2131432387);
        this.P = (LinearLayout)((fa)this).findViewById(2131432388);
        this.Q = (ImageView)((fa)this).findViewById(2131432389);
        this.W = (ImageView)((fa)this).findViewById(2131431622);
        this.L = (ViewGroup)((fa)this).findViewById(2131432282);
        final View viewById = ((fa)this).findViewById(2131432281);
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new jlq(this, 5));
        }
        ViewGroup aj;
        if ((aj = (ViewGroup)((fa)this).findViewById(2131431596)) == null) {
            aj = (ViewGroup)((fa)this).findViewById(2131427835);
        }
        this.aJ = aj;
        this.aM = new acdx((Context)this);
        final jli k = jfi.k((Context)this);
        this.aF = k;
        (this.C = this.as.h((Context)this, k)).g(this.aJ);
        this.ad = this.u.o();
        this.E = (Runnable)new jcd(this, 15);
        if (gkt.u(this.ak)) {
            final e u = this.au.U(this.j());
            this.aN = u;
            tcp.n((aum)this, u.g(), (trb)new jly(this, 5), (trb)new jly(this, 6));
        }
        this.ab = this.getIntent().getIntExtra("MicSampleRate", 16000);
        this.Z = this.getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.aa = this.getIntent().getIntExtra("MicChannelConfig", 16);
        this.E();
        this.k();
        this.aK = this.getIntent().getIntExtra("ParentVeType", 0);
        this.aL = this.getIntent().getStringExtra("ParentCSN");
        this.T = this.getIntent().getStringExtra("searchEndpointParams");
        this.V = this.getIntent().getByteArrayExtra("SearchboxStats");
        final acvq a2 = acvr.a();
        a2.c(this.getIntent().getBooleanExtra("IS_SHORTS_CONTEXT", false));
        a2.b(this.getIntent().getBooleanExtra("IS_SHORTS_CHIP_SELECTED", false));
        this.l = a2.a();
        final agzc agzc = (agzc)((agzi)aioe.a).createBuilder();
        final agza builder = ((agzi)amob.a).createBuilder();
        final int ak = this.aK;
        builder.copyOnWrite();
        final amob amob = (amob)builder.instance;
        amob.b |= 0x2;
        amob.d = ak;
        final String al = this.aL;
        if (al != null) {
            builder.copyOnWrite();
            final amob amob2 = (amob)builder.instance;
            amob2.b |= 0x1;
            amob2.c = al;
        }
        agzc.e((agyr)amoa.b, (Object)builder.build());
        this.r.b(wya.b(22678), (aioe)((agza)agzc).build(), (alff)null);
        this.r.l((wxz)new wws(wya.c(22156)));
        this.r.l((wxz)new wws(wya.c(88272)));
        this.aA = true;
    }
    
    public final void onDestroy() {
        this.h = false;
        this.q();
        final acxg i = this.i;
        if (i != null) {
            i.a();
            this.i = null;
        }
        this.D = null;
        this.c.setOnClickListener((View$OnClickListener)null);
        this.az.setOnClickListener((View$OnClickListener)null);
        this.r.s();
        final ConnectivitySlimStatusBarController c = this.C;
        if (c != null) {
            c.k();
        }
        super.onDestroy();
    }
    
    public final void onPause() {
        super.onPause();
        if (this.aH) {
            this.overridePendingTransition(0, 0);
            this.aH = false;
        }
        if (this.an.cj()) {
            tcp.o((aum)this, this.at.m(), (trb)ifc.n, (trb)ifc.o);
        }
    }
    
    public final void onRestart() {
        super.onRestart();
        if (this.aD != this.v.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue((Runnable)new jcd(this, 14));
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.w.g((Object)this);
        this.C.r(true);
        final tox q = this.q;
        if (q != null) {
            q.b();
        }
        if (td.c((Context)this, "android.permission.RECORD_AUDIO") == 0) {
            final AudioRecord a = this.s.a();
            if ((this.Y = a) == null) {
                this.F();
                return;
            }
            this.Z = a.getAudioFormat();
            this.aa = this.Y.getChannelConfiguration();
            this.ab = this.Y.getSampleRate();
            this.r.l((wxz)new wws(wya.c(62943)));
            if (gkt.aw(this.ap) && this.p.t(alku.K)) {
                this.p.y("voz_vp", alku.K);
            }
            if (gkt.u(this.ak)) {
                tcp.n((aum)this, afva.t(this.av.F(), 300L, TimeUnit.MILLISECONDS, this.x), (trb)new jly(this, 3), (trb)new jly(this, 4));
                return;
            }
            this.w("");
        }
        else {
            final PermissionDescriptor[] ax = VoiceSearchActivity.ax;
            if (!acsm.f((Context)this, ax)) {
                this.n();
                return;
            }
            if (this.ay) {
                return;
            }
            if (this.k == null) {
                final acss al = this.al;
                al.e(ax);
                al.f = wya.b(69076);
                al.g = wya.c(69077);
                al.h = wya.c(69078);
                al.i = wya.c(69079);
                al.b(2132020185);
                al.c(2132020186);
                al.c = 2132019105;
                this.k = (acsu)al.a();
            }
            this.k.aK((acst)this);
            int n;
            if (this.ao.aT() && this.ao.aU()) {
                n = 2132084273;
            }
            else {
                n = 2132084272;
            }
            this.k.aL((Context)new rq((Context)this, n));
            this.x((br)this.k, "PERMISSION_REQUEST_FRAGMENT");
            this.ay = true;
        }
    }
    
    public final void onStop() {
        super.onStop();
        this.w.m((Object)this);
        if (!this.aG) {
            this.n();
        }
    }
    
    public final void onUserInteraction() {
        final tox q = this.q;
        if (q != null) {
            q.b();
        }
        super.onUserInteraction();
    }
    
    public final void onWindowFocusChanged(final boolean ag) {
        super.onWindowFocusChanged(ag);
        this.aG = ag;
    }
    
    public final void p(final int n) {
        final SoundPool ab = this.aB;
        if (ab != null) {
            ab.play(n, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
    
    public final void q() {
        final SoundPool ab = this.aB;
        if (ab != null) {
            ab.release();
            this.aB = null;
        }
    }
    
    public final void r() {
        this.h = false;
        this.M = false;
        this.N = false;
        final acxg i = this.i;
        if (i != null) {
            i.c();
        }
        this.u();
    }
    
    public final void s() {
        this.h = false;
        this.M = false;
        this.N = false;
        final acxg i = this.i;
        if (i != null) {
            i.c();
        }
        this.H.setVisibility(0);
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.J.setVisibility(8);
        this.I.setVisibility(8);
        this.G.setText(((fa)this).getResources().getText(2132020208));
        this.G.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
        this.W.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.aj);
        this.m();
    }
    
    public final void t() {
        if (this.z()) {
            tcp.i(((tku)this.B.a()).a(), (tco)new hfi(this, 19));
            return;
        }
        this.ag = false;
        this.ah = ahca.a;
    }
    
    public final void u() {
        this.H.setVisibility(0);
        this.G.setVisibility(0);
        this.d.setVisibility(8);
        this.F.setVisibility(8);
        this.J.setVisibility(8);
        this.I.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        this.W.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.aj);
        if (!this.ad) {
            this.G.setText(((fa)this).getResources().getText(2132020208));
            this.c.setEnabled(false);
            return;
        }
        if (!this.ac) {
            this.G.setText(((fa)this).getResources().getText(2132017885));
            this.r.l((wxz)new wws(wya.c(159814)));
            return;
        }
        if (!aexs.f(this.I.getText().toString())) {
            this.G.setText(((fa)this).getResources().getText(2132020000));
            this.I.setVisibility(0);
            return;
        }
        this.G.setText(((fa)this).getResources().getText(2132019998));
    }
    
    public final void v() {
        this.h = true;
        this.O = false;
        this.ac = false;
        this.d.setVisibility(8);
        this.I.setVisibility(4);
        this.H.setVisibility(4);
        this.d.setText((CharSequence)"");
        this.F.setText((CharSequence)"");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.G.setText(2132018356);
        this.G.setVisibility(0);
        final acxg i = this.i;
        if (i != null && i.f()) {
            this.p(this.aC);
            this.c.f();
        }
        else {
            this.F();
        }
        this.W.animate().alpha(1.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.aj);
        final gkm a = this.v.a();
        this.aD = a;
        InputStream inputStream;
        if (a == gkm.b) {
            inputStream = ((fa)this).getResources().openRawResource(2131231328);
        }
        else {
            inputStream = ((fa)this).getResources().openRawResource(2131231329);
        }
        byte[] d;
        try {
            d = afna.d(inputStream);
        }
        catch (final IOException ex) {
            trn.d("Error converting speaking gif asset to byte array", (Throwable)ex);
            d = null;
        }
        if (d != null) {
            try {
                this.W.setImageDrawable(((acdw)this.aM).a(d));
            }
            catch (final tty tty) {
                trn.d("Error downloading or decoding speaking gif asset.", (Throwable)tty);
            }
        }
        final String s = (String)this.an.o(45372964L).j().af();
        if (!s.isEmpty()) {
            tcp.n((aum)this, afva.o((afrx)new fdq(this, s, 9), 8L, TimeUnit.SECONDS, this.y), (trb)ifc.k, (trb)ifc.l);
        }
    }
    
    public final void w(String j) {
        this.t();
        final boolean empty = j.isEmpty();
        boolean z = true;
        boolean b;
        if (empty) {
            j = this.j();
            b = false;
        }
        else {
            b = true;
        }
        this.l();
        final acxe g = this.g();
        if (this.i == null) {
            final acxh l = this.aq.l(this.D, g, this.ab, j, this.V, this.B(), this.Z, this.aa, this.T, this.j());
            l.H = this.C();
            l.A = this.d();
            l.c(this.f());
            l.C = this.h();
            l.s = this.A();
            if (!gkt.u(this.ak) || !b) {
                z = false;
            }
            l.z = z;
            l.b(aexq.k((Object)this.i()));
            l.E = gkt.al(this.ap);
            l.t = this.y();
            l.w = this.an.cj();
            l.F = this.l;
            l.x = this.ag;
            l.y = this.ah;
            this.i = l.a();
        }
        if (!this.ad) {
            this.s();
            return;
        }
        if (this.aA) {
            this.aA = false;
            this.v();
        }
    }
    
    public final void x(final br br, final String ae) {
        final br f = this.j.f(this.aE);
        br.getClass();
        tsx.n(ae);
        final ct i = this.j.i();
        if (f != null && f.ar() && !f.equals(br)) {
            i.m(f);
        }
        this.U.setVisibility(0);
        if (!br.ar()) {
            i.r(2131429083, br, ae);
        }
        else if (br.as()) {
            i.o(br);
        }
        i.i = 4099;
        i.d();
        this.aE = ae;
    }
    
    public final boolean y() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.an.cc().aw((Object)false).Z((asix)new jmj(atomicBoolean, 1)));
        return atomicBoolean.get();
    }
    
    public final boolean z() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asjg.b((AtomicReference)this.an.cg().aw((Object)false).Z((asix)new jmj(atomicBoolean, 1)));
        return atomicBoolean.get();
    }
}

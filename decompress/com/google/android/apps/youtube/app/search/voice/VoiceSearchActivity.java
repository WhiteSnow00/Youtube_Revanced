// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.search.voice;

import java.io.InputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.Locale;
import android.animation.TimeInterpolator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.view.View$OnClickListener;
import android.content.res.Configuration;
import android.text.TextUtils;
import java.util.Iterator;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicBoolean;
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
import android.media.AudioRecord;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import android.widget.RelativeLayout;
import com.google.common.util.concurrent.ListenableFuture;
import android.media.SoundPool;
import android.view.View;
import java.util.List;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

public class VoiceSearchActivity extends jna implements acwj, jnq, cp, thj
{
    public static final int ay = 0;
    private static final PermissionDescriptor[] az;
    public atnb A;
    public atnb B;
    public tpw C;
    public ConnectivitySlimStatusBarController D;
    public adav E;
    public Runnable F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public ViewGroup M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public LinearLayout R;
    public ImageView S;
    public List T;
    public int U;
    public String V;
    public View W;
    public byte[] X;
    public ImageView Y;
    public jng Z;
    private boolean aA;
    private ImageView aB;
    private boolean aC;
    private SoundPool aD;
    private int aE;
    private gla aF;
    private String aG;
    private ListenableFuture aH;
    private jmv aI;
    private boolean aJ;
    private boolean aK;
    private RelativeLayout aL;
    private ViewGroup aM;
    private int aN;
    private String aO;
    private achp aP;
    private e aQ;
    AudioRecord aa;
    public int ab;
    public int ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public aocm ah;
    public boolean ai;
    public ahfq aj;
    public String ak;
    public final Interpolator al;
    public vbo am;
    public acwi an;
    public vbs ao;
    public vbs ap;
    public vbs aq;
    public acws ar;
    public adnd as;
    public arzb at;
    public e au;
    public alo av;
    public agnl aw;
    public cyd ax;
    public Handler b;
    public MicrophoneView c;
    public TextView d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public adaw i;
    public cl j;
    public acwk k;
    public aczg l;
    public boolean m;
    public boolean n;
    public int o;
    public xbu p;
    public tsd q;
    public xab r;
    public adbf s;
    public vmx t;
    public tkq u;
    public glc v;
    public thg w;
    public ScheduledExecutorService x;
    public afxk y;
    public acyg z;
    
    static {
        az = new PermissionDescriptor[] { new PermissionDescriptor(2, xbf.c(65799), xbf.c(65800)) };
    }
    
    public VoiceSearchActivity() {
        this.l = aczg.a().a();
        this.o = 0;
        this.aH = afxe.a;
        this.T = Collections.emptyList();
        this.al = (Interpolator)apd.c(0.05f, 0.0f, 0.0f, 1.0f);
    }
    
    private final Boolean E() {
        return ((fa)this).getResources().getConfiguration().screenHeightDp >= 400;
    }
    
    private final void F() {
        final Resources resources = ((fa)this).getResources();
        final int n = (int)resources.getDimension(2131170130);
        int dimensionPixelSize;
        int n7;
        int n8;
        int n9;
        if (tqf.bq((Context)this)) {
            int n2;
            float n3;
            float n4;
            if (tqf.bo((Context)this)) {
                n2 = resources.getDimensionPixelSize(2131168011);
                n3 = 0.2f;
                n4 = 0.22f;
            }
            else {
                n2 = resources.getDimensionPixelSize(2131168010);
                n3 = 0.1f;
                n4 = 0.24f;
            }
            dimensionPixelSize = resources.getDimensionPixelSize(2131169865);
            this.W.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new jnt(this, 0));
            final int bb = tqf.bb((Context)this);
            final int o = this.o;
            final int n5 = (int)(n3 * tqf.bd((Context)this));
            final int n6 = (int)(n4 * (bb - o));
            n7 = n2;
            n8 = n5;
            n9 = n6;
        }
        else {
            int n10;
            float n11;
            if (this.E()) {
                n10 = (int)resources.getDimension(2131168008);
                n11 = resources.getDimension(2131170131);
            }
            else {
                n10 = (int)resources.getDimension(2131168009);
                n11 = resources.getDimension(2131170132);
            }
            n9 = (int)n11;
            final int n12 = (int)resources.getDimension(2131170130);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131169864);
            n7 = n10;
            n8 = n12;
            dimensionPixelSize = dimensionPixelSize2;
        }
        tqf.aF((View)this.c, tqf.ay(0, 0, 0, n7), (Class)ViewGroup$MarginLayoutParams.class);
        tqf.aF((View)this.aL, tqf.ay(n8, n9, n8, n), (Class)ViewGroup$MarginLayoutParams.class);
        tqf.aF((View)this.H, tqf.ay(0, 0, 0, dimensionPixelSize), (Class)ViewGroup$MarginLayoutParams.class);
        final Resources resources2 = ((fa)this).getResources();
        float n13;
        float n14;
        int n15;
        if (tqf.bq((Context)this)) {
            n13 = (float)resources2.getDimensionPixelSize(2131170365);
            n14 = (float)resources2.getDimensionPixelSize(2131170363);
            n15 = resources2.getDimensionPixelSize(2131170361);
        }
        else {
            n13 = (float)resources2.getDimensionPixelSize(2131170364);
            n14 = (float)resources2.getDimensionPixelSize(2131170362);
            n15 = resources2.getDimensionPixelSize(2131170360);
        }
        final float n16 = (float)n15;
        this.H.setTextSize(0, n14);
        this.H.setLineSpacing(n16, 1.0f);
        this.d.setTextSize(0, n14);
        this.d.setLineSpacing(n16, 1.0f);
        this.G.setTextSize(0, n14);
        this.G.setLineSpacing(n16, 1.0f);
        this.J.setTextSize(0, n13);
        this.K.setTextSize(0, n13);
        this.I.setTextSize(0, n13);
    }
    
    private final void G() {
        this.setVisible(false);
        this.aK = true;
        final Intent intent = this.getIntent();
        intent.putExtra("RegularVoiceSearch", true);
        this.setResult(-1, intent);
        this.n();
    }
    
    public final boolean A() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)this.ap.cl().aC(false).aa((asmi)new jnd(atomicBoolean, 5)));
        return atomicBoolean.get();
    }
    
    public final boolean B() {
        return fao.bE(this.at);
    }
    
    public final int C() {
        return fao.bH(this.at);
    }
    
    public final int D() {
        return fao.bI(this.at);
    }
    
    public final void a(final String s, final Bundle bundle) {
        if (s.equals("VaaConsentWebViewRequestKey")) {
            this.b.post((Runnable)new jdo(this, bundle, 6));
            return;
        }
        tut.m("VoiceSearchActivity", "Unexpected fragment result request key: ".concat(String.valueOf(s)));
    }
    
    public final void aM() {
        this.n();
    }
    
    public final void aN() {
        this.aA = false;
        this.W.setVisibility(8);
        this.b.post((Runnable)new jin(this, 12));
    }
    
    public final void b() {
        this.I.setVisibility(4);
        this.J.setVisibility(8);
        this.w();
    }
    
    public final void c(final String text, final String s) {
        this.L.setText((CharSequence)text);
        this.L.requestLayout();
        final adaw i = this.i;
        if (i != null) {
            i.a();
            this.i = null;
        }
        this.x(s);
    }
    
    public final float d() {
        return fao.aW(this.at);
    }
    
    public final int f() {
        return fao.aX(this.at);
    }
    
    public final adau g() {
        return (adau)new jnv(this);
    }
    
    public final afbh h() {
        return fao.bf(this.at);
    }
    
    public final String i() {
        return fao.bh(this.at);
    }
    
    public final String j() {
        final String c = acws.c();
        final String a = this.ar.a();
        if (!c.isEmpty() && !a.isEmpty()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append("-");
            sb.append(a);
            return sb.toString();
        }
        return "en-US";
    }
    
    public final void k() {
        final boolean booleanValue = this.E();
        int n = 0;
        if ((booleanValue || (boolean)(((fa)this).getResources().getConfiguration().screenWidthDp >= 400)) && !this.T.isEmpty()) {
            final StringBuilder text = new StringBuilder(((fa)this).getResources().getString(2132020004));
            if (this.E()) {
                text.append("\n\n''");
            }
            else {
                text.append("\n''");
            }
            text.append(this.T.get(0));
            text.append("''");
            this.K.setText((CharSequence)text);
            final StringBuilder text2 = new StringBuilder();
            for (final String s : this.T) {
                ++n;
                text2.append("''");
                text2.append(s);
                text2.append("''");
                if (n >= 3) {
                    break;
                }
                text2.append("\n\n");
            }
            this.J.setText((CharSequence)text2);
        }
    }
    
    public final void l() {
        if (this.E != null) {
            return;
        }
        this.E = (adav)new joa(this, 1);
    }
    
    public final void m() {
        final ViewGroup m = this.M;
        if (m != null) {
            m.setVisibility(4);
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final boolean a = ((tjn)o).a();
            this.af = a;
            this.D.r(a ^ true);
            final boolean af = this.af;
            final Class[] array = null;
            if (af) {
                this.b.removeCallbacks(this.F);
                this.H.setText(((fa)this).getResources().getText(2132020213));
                this.c.setEnabled(true);
                this.c.setVisibility(0);
                array2 = array;
                if (this.M != null) {
                    if (!TextUtils.isEmpty((CharSequence)this.ak)) {
                        this.o();
                        return null;
                    }
                    array2 = array;
                }
            }
            else if (this.h) {
                this.b.postDelayed(this.F, 3000L);
                array2 = array;
            }
            else {
                this.s();
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { tjn.class };
        }
        return array2;
    }
    
    public final void n() {
        if (!this.isFinishing()) {
            this.finish();
        }
    }
    
    public final void o() {
        tfx.n((aup)this, ((tnz)this.A.a()).a(), (tui)igg.r, (tui)new jnl(this, 9));
    }
    
    public final void onBackPressed() {
        this.r.J(3, (xbe)new wzy(xbf.c(88272)), (alji)null);
        final Intent intent = this.getIntent();
        intent.putExtra("AssistantCsn", this.r.i());
        this.setResult(1, intent);
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final tsd q = this.q;
        if (q != null) {
            q.b();
        }
        this.F();
        this.k();
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Boolean value = false;
        final SoundPool ad = new SoundPool(5, 3, 0);
        this.aD = ad;
        this.aE = ad.load((Context)this, 2131951697, 0);
        this.e = this.aD.load((Context)this, 2131951708, 0);
        this.f = this.aD.load((Context)this, 2131951696, 0);
        this.g = this.aD.load((Context)this, 2131951660, 0);
        this.aF = this.v.a();
        final boolean b = this.aq.aX() && this.aq.aY();
        final gla a = gla.a;
        final int ordinal = this.aF.ordinal();
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
        asmr.b((AtomicReference)this.ao.cp().aC(value).aa((asmi)new jnd(atomicBoolean, 5)));
        if (atomicBoolean.get()) {
            ((qu)this).setContentView(2131625757);
        }
        else {
            ((qu)this).setContentView(2131625756);
        }
        final cl supportFragmentManager = ((bu)this).getSupportFragmentManager();
        this.j = supportFragmentManager;
        if (bundle != null && (this.k = (acwk)supportFragmentManager.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)this.aG, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acwc.f((Context)this, VoiceSearchActivity.az))) {
            final ct i = this.j.i();
            i.m((br)this.k);
            i.d();
        }
        this.W = ((fa)this).findViewById(2131429083);
        (this.aB = (ImageView)((fa)this).findViewById(2131427738)).setOnClickListener((View$OnClickListener)new jnm(this, 4));
        final MicrophoneView c = (MicrophoneView)((fa)this).findViewById(2131429875);
        this.c = c;
        ((FloatingActionButton)c.findViewById(2131428685)).setImageDrawable(tqf.k(this.c.getContext(), 2131233827, 2130970922));
        ((FloatingActionButton)this.c.findViewById(2131428876)).setImageResource(2131233564);
        this.c.setOnClickListener((View$OnClickListener)new jnm(this, 5));
        this.H = (TextView)((fa)this).findViewById(2131431701);
        this.d = (TextView)((fa)this).findViewById(2131431678);
        this.G = (TextView)((fa)this).findViewById(2131432235);
        this.I = (TextView)((fa)this).findViewById(2131428922);
        this.J = (TextView)((fa)this).findViewById(2131428924);
        this.K = (TextView)((fa)this).findViewById(2131429591);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        asmr.b((AtomicReference)this.ap.l(45374875L).aC(value).aa((asmi)new jnd(atomicBoolean2, 5)));
        if (atomicBoolean2.get()) {
            this.K.setOnClickListener((View$OnClickListener)new jnm(this, 6));
        }
        this.aL = (RelativeLayout)((fa)this).findViewById(2131432398);
        this.L = (TextView)((fa)this).findViewById(2131432391);
        this.R = (LinearLayout)((fa)this).findViewById(2131432392);
        this.S = (ImageView)((fa)this).findViewById(2131432393);
        this.Y = (ImageView)((fa)this).findViewById(2131431626);
        this.M = (ViewGroup)((fa)this).findViewById(2131432286);
        final View viewById = ((fa)this).findViewById(2131432285);
        if (viewById != null) {
            viewById.setOnClickListener((View$OnClickListener)new jnm(this, 7));
        }
        ViewGroup am;
        if ((am = (ViewGroup)((fa)this).findViewById(2131431600)) == null) {
            am = (ViewGroup)((fa)this).findViewById(2131427835);
        }
        this.aM = am;
        this.aP = new achp((Context)this);
        final jmv s = mgh.S((Context)this);
        this.aI = s;
        (this.D = this.au.h((Context)this, s)).g(this.aM);
        this.af = this.u.o();
        this.F = (Runnable)new jin(this, 11);
        if (fao.au(this.am)) {
            final e s2 = this.av.S(this.j());
            this.aQ = s2;
            tfx.n((aup)this, s2.g(), (tui)new jnl(this, 7), (tui)new jnl(this, 8));
        }
        this.ad = this.getIntent().getIntExtra("MicSampleRate", 16000);
        this.ab = this.getIntent().getIntExtra("MicAudioFormatEncoding", 2);
        this.ac = this.getIntent().getIntExtra("MicChannelConfig", 16);
        this.F();
        this.k();
        this.aN = this.getIntent().getIntExtra("ParentVeType", 0);
        this.aO = this.getIntent().getStringExtra("ParentCSN");
        this.V = this.getIntent().getStringExtra("searchEndpointParams");
        this.X = this.getIntent().getByteArrayExtra("SearchboxStats");
        final aczf a2 = aczg.a();
        a2.c(this.getIntent().getBooleanExtra("IS_SHORTS_CONTEXT", false));
        a2.b(this.getIntent().getBooleanExtra("IS_SHORTS_CHIP_SELECTED", false));
        this.l = a2.a();
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        final ahcr builder = ((ahcz)amsl.a).createBuilder();
        final int an = this.aN;
        builder.copyOnWrite();
        final amsl amsl = (amsl)builder.instance;
        amsl.b |= 0x2;
        amsl.d = an;
        final String ao = this.aO;
        if (ao != null) {
            builder.copyOnWrite();
            final amsl amsl2 = (amsl)builder.instance;
            amsl2.b |= 0x1;
            amsl2.c = ao;
        }
        ahct.e((ahci)amsk.b, (Object)builder.build());
        this.r.b(xbf.b(22678), (aisc)((ahcr)ahct).build(), (alji)null);
        this.r.l((xbe)new wzy(xbf.c(22156)));
        this.r.l((xbe)new wzy(xbf.c(88272)));
        this.aC = true;
    }
    
    public final void onDestroy() {
        this.h = false;
        this.q();
        final adaw i = this.i;
        if (i != null) {
            i.a();
            this.i = null;
        }
        this.E = null;
        this.c.setOnClickListener((View$OnClickListener)null);
        this.aB.setOnClickListener((View$OnClickListener)null);
        this.r.s();
        final ConnectivitySlimStatusBarController d = this.D;
        if (d != null) {
            d.k();
        }
        super.onDestroy();
    }
    
    public final void onPause() {
        super.onPause();
        if (this.aK) {
            this.overridePendingTransition(0, 0);
            this.aK = false;
        }
        if (this.ap.co()) {
            tfx.o((aup)this, this.aw.m(), (tui)igg.k, (tui)igg.l);
        }
    }
    
    public final void onRestart() {
        super.onRestart();
        if (this.aF != this.v.a()) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue((Runnable)new jin(this, 10));
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.w.g((Object)this);
        this.D.r(true);
        final tsd q = this.q;
        if (q != null) {
            q.b();
        }
        if (tc.b((Context)this, "android.permission.RECORD_AUDIO") == 0) {
            final AudioRecord a = this.s.a();
            if ((this.aa = a) == null) {
                this.G();
                return;
            }
            this.ab = a.getAudioFormat();
            this.ac = this.aa.getChannelConfiguration();
            this.ad = this.aa.getSampleRate();
            this.r.l((xbe)new wzy(xbf.c(62943)));
            if (fao.bn(this.at) && this.p.t(alox.K)) {
                this.p.y("voz_vp", alox.K);
            }
            if (fao.au(this.am)) {
                tfx.n((aup)this, afxr.s(this.ax.G(), 300L, TimeUnit.MILLISECONDS, this.x), (tui)new jnl(this, 5), (tui)new jnl(this, 6));
                return;
            }
            this.x("");
        }
        else {
            final PermissionDescriptor[] az = VoiceSearchActivity.az;
            if (!acwc.f((Context)this, az)) {
                this.n();
                return;
            }
            if (this.aA) {
                return;
            }
            if (this.k == null) {
                final acwi an = this.an;
                an.e(az);
                an.f = xbf.b(69076);
                an.g = xbf.c(69077);
                an.h = xbf.c(69078);
                an.i = xbf.c(69079);
                an.b(2132020189);
                an.c(2132020190);
                an.c = 2132019108;
                this.k = an.a();
            }
            this.k.aK((acwj)this);
            int n;
            if (this.aq.aX() && this.aq.aY()) {
                n = 2132084277;
            }
            else {
                n = 2132084276;
            }
            this.k.aL((Context)new rr((Context)this, n));
            this.y((br)this.k, "PERMISSION_REQUEST_FRAGMENT");
            this.aA = true;
        }
    }
    
    public final void onStop() {
        this.C.d(false);
        super.onStop();
        this.w.m((Object)this);
        if (!this.aJ) {
            this.n();
        }
    }
    
    public final void onUserInteraction() {
        final tsd q = this.q;
        if (q != null) {
            q.b();
        }
        super.onUserInteraction();
    }
    
    public final void onWindowFocusChanged(final boolean aj) {
        super.onWindowFocusChanged(aj);
        this.aJ = aj;
    }
    
    public final void p(final int n) {
        final SoundPool ad = this.aD;
        if (ad != null) {
            ad.play(n, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
    
    public final void q() {
        final SoundPool ad = this.aD;
        if (ad != null) {
            ad.release();
            this.aD = null;
        }
    }
    
    public final void r() {
        this.h = false;
        this.N = false;
        this.O = false;
        final adaw i = this.i;
        if (i != null) {
            i.c();
        }
        this.v();
    }
    
    public final void s() {
        this.h = false;
        this.N = false;
        this.O = false;
        final adaw i = this.i;
        if (i != null) {
            i.c();
        }
        this.I.setVisibility(0);
        this.d.setVisibility(8);
        this.G.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setVisibility(8);
        this.aH.cancel(false);
        this.H.setText(((fa)this).getResources().getText(2132020212));
        this.H.setVisibility(0);
        this.c.setVisibility(8);
        this.c.d();
        this.Y.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.al);
        this.m();
    }
    
    public final void t(final String s) {
        String j = s;
        if (s.isEmpty()) {
            j = this.j();
        }
        this.C.a(Locale.forLanguageTag(j));
    }
    
    public final void u() {
        if (this.A()) {
            tfx.i(((tnz)this.B.a()).a(), (tfw)new hzj(this, 15));
            return;
        }
        this.ai = false;
        this.aj = ahfq.a;
    }
    
    public final void v() {
        this.I.setVisibility(0);
        this.H.setVisibility(0);
        this.d.setVisibility(8);
        this.G.setVisibility(8);
        this.K.setVisibility(8);
        this.J.setVisibility(8);
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.c.d();
        this.Y.animate().alpha(0.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.al);
        this.aH.cancel(false);
        if (!this.af) {
            this.H.setText(((fa)this).getResources().getText(2132020212));
            this.c.setEnabled(false);
            return;
        }
        if (!this.ae) {
            this.H.setText(((fa)this).getResources().getText(2132017886));
            this.r.l((xbe)new wzy(xbf.c(159814)));
            final String s = (String)this.ap.o(45383946L).j().af();
            if (!s.isEmpty()) {
                tfx.k(this.ax.G(), (Executor)this.x, (tfv)new hwb(this, 8), (tfw)new hzj(this, 16));
                if (!this.Q) {
                    if ("try_again".equals(s)) {
                        this.C.b(2132017886, new Object[0]);
                        return;
                    }
                    if ("tap_mic_to_try_again".equals(s)) {
                        this.C.b(2132017887, new Object[0]);
                    }
                }
            }
            return;
        }
        if (!afbj.f(this.J.getText().toString())) {
            this.H.setText(((fa)this).getResources().getText(2132020004));
            this.J.setVisibility(0);
            return;
        }
        this.H.setText(((fa)this).getResources().getText(2132020002));
    }
    
    public final void w() {
        this.h = true;
        this.P = false;
        this.ae = false;
        this.Q = false;
        this.d.setVisibility(8);
        this.J.setVisibility(4);
        this.I.setVisibility(4);
        this.d.setText((CharSequence)"");
        this.G.setText((CharSequence)"");
        this.c.setEnabled(true);
        this.c.setVisibility(0);
        this.C.d(false);
        this.H.setText(2132018359);
        this.H.setVisibility(0);
        final adaw i = this.i;
        if (i != null && i.f()) {
            this.p(this.aE);
            this.c.f();
        }
        else {
            this.G();
        }
        this.Y.animate().alpha(1.0f).setDuration(200L).setInterpolator((TimeInterpolator)this.al);
        final gla a = this.v.a();
        this.aF = a;
        InputStream inputStream;
        if (a == gla.b) {
            inputStream = ((fa)this).getResources().openRawResource(2131231326);
        }
        else {
            inputStream = ((fa)this).getResources().openRawResource(2131231327);
        }
        byte[] d;
        try {
            d = afqq.d(inputStream);
        }
        catch (final IOException ex) {
            tut.d("Error converting speaking gif asset to byte array", (Throwable)ex);
            d = null;
        }
        if (d != null) {
            try {
                this.Y.setImageDrawable(((acho)this.aP).a(d));
            }
            catch (final txe txe) {
                tut.d("Error downloading or decoding speaking gif asset.", (Throwable)txe);
            }
        }
        final String s = (String)this.ap.o(45372964L).j().af();
        if (!s.isEmpty()) {
            tfx.n((aup)this, this.aH = afxr.n((afvp)new fea(this, s, 9), 8L, TimeUnit.SECONDS, this.y), (tui)igg.o, (tui)igg.p);
        }
    }
    
    public final void x(String j) {
        this.u();
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
        final adau g = this.g();
        if (this.i == null) {
            final adax l = this.as.l(this.E, g, this.ad, j, this.X, this.C(), this.ab, this.ac, this.V, this.j());
            l.H = this.D();
            l.A = this.d();
            l.c(this.f());
            l.C = this.h();
            l.s = this.B();
            if (!fao.au(this.am) || !b) {
                z = false;
            }
            l.z = z;
            l.b(afbh.k(this.i()));
            l.E = fao.bd(this.at);
            l.t = this.z();
            l.w = this.ap.co();
            l.F = this.l;
            l.x = this.ai;
            l.y = this.aj;
            this.i = l.a();
        }
        if (!this.af) {
            this.s();
            return;
        }
        if (this.aC) {
            this.aC = false;
            this.w();
        }
    }
    
    public final void y(final br br, final String ag) {
        final br f = this.j.f(this.aG);
        br.getClass();
        twd.n(ag);
        final ct i = this.j.i();
        if (f != null && f.ar() && !f.equals((Object)br)) {
            i.m(f);
        }
        this.W.setVisibility(0);
        if (!br.ar()) {
            i.r(2131429083, br, ag);
        }
        else if (br.as()) {
            i.o(br);
        }
        i.i = 4099;
        i.d();
        this.aG = ag;
    }
    
    public final boolean z() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        asmr.b((AtomicReference)this.ap.ch().aC(false).aa((asmi)new jnd(atomicBoolean, 5)));
        return atomicBoolean.get();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.extensions.upload;

import com.google.android.libraries.video.editablevideo.EditableVideo;
import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import androidx.core.widget.NestedScrollView;
import android.widget.TextView;
import java.util.UUID;
import com.google.protobuf.ExtensionRegistryLite;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.content.res.Configuration;
import java.util.concurrent.TimeUnit;
import android.net.Uri;
import java.io.File;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import java.util.Collection;
import android.app.Activity;
import android.app.Dialog;
import android.text.Spanned;
import java.util.Iterator;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import android.text.TextUtils;
import java.util.Arrays;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.creation.publish.ClientSideRenderingService;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.c;
import android.widget.FrameLayout;
import android.content.Intent;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.View;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

public class UploadActivity extends htd implements htr, reu, wwu, hst, rky, uct, tec
{
    public hsv A;
    public atjj B;
    public adhw C;
    public gko D;
    public boolean E;
    public boolean F;
    String G;
    public alaz H;
    public aksf I;
    public LoadingFrameLayout J;
    public zcp K;
    View L;
    public boolean M;
    boolean N;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private alaz aF;
    private boolean aG;
    private LinearLayout aH;
    private ViewGroup aI;
    private acek aJ;
    private YouTubeTextView aK;
    private YouTubeTextView aL;
    private ImageView aM;
    private View aN;
    private Intent aO;
    private apet aP;
    private FrameLayout aQ;
    private YouTubeTextView aR;
    public aexq al;
    public glp am;
    public ImageView an;
    public aexq ao;
    public String ap;
    public String aq;
    public String ar;
    public uyi as;
    public adio at;
    public khz au;
    public adcr av;
    public aagm aw;
    public abpj ax;
    public c ay;
    public eg az;
    public aftr h;
    public vax i;
    public ackz j;
    public zki k;
    public aceo l;
    public vjl m;
    public uoe n;
    public zei o;
    public zkw p;
    public wyc q;
    public req r;
    public hts s;
    public adjl t;
    public SharedPreferences u;
    public acup v;
    public adjo w;
    public adcr x;
    public fxo y;
    public hsn z;
    
    public UploadActivity() {
        this.M = false;
        this.aG = false;
        this.N = false;
        final aewp a = aewp.a;
        this.al = (aexq)a;
        this.ao = (aexq)a;
    }
    
    private final String K() {
        final Intent intent = this.getIntent();
        if (intent != null) {
            return intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id");
        }
        return null;
    }
    
    private final void L() {
        this.I();
        alsq alsq;
        if ((alsq = this.ag.f().c) == null) {
            alsq = alsq.a;
        }
        if (alsq.k && acsm.g((Context)this) && !this.ah.am()) {
            tcp.n((aum)this, this.o.a(), (trb)new hks(this, 18), (trb)new hks(this, 19));
            return;
        }
        this.H(null);
    }
    
    private final void M() {
        this.aq = "";
        apgj apgj;
        if ((apgj = this.ag.f().h) == null) {
            apgj = apgj.a;
        }
        if (apgj.v) {
            final apet ap = this.aP;
            if (ap != null) {
                if ((ap.b & 0x2) != 0x0) {
                    final YouTubeTextView ar = this.aR;
                    ajsq ajsq;
                    if ((ajsq = ap.d) == null) {
                        ajsq = ajsq.a;
                    }
                    ar.setText((CharSequence)abyh.c(ajsq, (abyc)this.j));
                    this.aR.e(true);
                    this.aQ.setVisibility(0);
                }
                final apet ap2 = this.aP;
                if ((ap2.b & 0x1) != 0x0) {
                    this.aq = ap2.c;
                }
                return;
            }
        }
        this.aQ.setVisibility(8);
    }
    
    public final void C() {
        final hts s = this.s;
        s.d.J(3, (wxz)new wws(wya.c(9702)), adio.g(s.B, s.T));
        final ClientSideRenderingService d = s.X.d;
        if (d != null) {
            d.b();
        }
        super.C();
        final Intent intent = this.getIntent();
        if (intent != null && !"com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(intent.getAction()) && !this.isTaskRoot()) {
            final Intent j = this.ay.j();
            j.setFlags(67108864);
            ((fam)this).startActivity(j);
        }
    }
    
    public final void G(alaz alaz) {
        szc.f();
        if (!this.aD) {
            return;
        }
        if (this.aF == (this.H = alaz)) {
            return;
        }
        this.aF = alaz;
        ((hth)this).aa.a();
        this.aQ.setVisibility(8);
        this.aH.setVisibility(8);
        this.aN.setVisibility(8);
        this.G = this.k.c().d();
        alaz = this.H;
        if ((alaz.b & 0x8000) != 0x0) {
            ((wwm)this.q).C((wxz)new wws(alaz.p));
        }
        alaz = this.H;
        if ((alaz.b & 0x40) != 0x0) {
            this.K.f(alaz.j);
        }
        final Iterator<Object> iterator = this.H.d.iterator();
        apjz apjz;
        boolean j;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            apjz = null;
            j = false;
            if (!hasNext) {
                break;
            }
            final alba alba = iterator.next();
            final int b = alba.b;
            if (b == 96626565) {
                final apel apel = (apel)alba.c;
                apel.getClass();
                this.an.setBackgroundResource(2131102274);
                aorm aorm;
                if ((aorm = apel.d) == null) {
                    aorm = aorm.a;
                }
                if (actc.M(aorm)) {
                    final aceo l = this.l;
                    final ImageView an = this.an;
                    aorm aorm2;
                    if ((aorm2 = apel.d) == null) {
                        aorm2 = aorm.a;
                    }
                    l.j(an, aorm2, this.aJ);
                }
                final YouTubeTextView ak = this.aK;
                ajsq ajsq;
                if ((ajsq = apel.b) == null) {
                    ajsq = ajsq.a;
                }
                ak.setText((CharSequence)abyh.b(ajsq));
                final YouTubeTextView al = this.aL;
                ajsq ajsq2;
                if ((ajsq2 = apel.c) == null) {
                    ajsq2 = ajsq.a;
                }
                al.setText((CharSequence)abyh.b(ajsq2));
                final boolean e = apel.e;
                this.aI.setClickable(e);
                if (e) {
                    this.aM.setVisibility(0);
                    this.aI.setOnClickListener((View$OnClickListener)new hqg(this, 13));
                    final ViewGroup ai = this.aI;
                    tmy.r((View)ai, ai.getBackground());
                    ajsq ajsq3;
                    if ((ajsq3 = apel.b) == null) {
                        ajsq3 = ajsq.a;
                    }
                    final Spanned b2 = abyh.b(ajsq3);
                    ajsq ajsq4;
                    if ((ajsq4 = apel.c) == null) {
                        ajsq4 = ajsq.a;
                    }
                    final Spanned b3 = abyh.b(ajsq4);
                    CharSequence charSequence;
                    if ((charSequence = (CharSequence)b2) == null) {
                        charSequence = "";
                    }
                    CharSequence charSequence2;
                    if ((charSequence2 = (CharSequence)b3) == null) {
                        charSequence2 = "";
                    }
                    this.aI.setContentDescription((CharSequence)this.getString(2132017428, new Object[] { TextUtils.join((CharSequence)" ", (Iterable)Arrays.asList(charSequence, charSequence2)) }));
                }
                else {
                    this.aM.setVisibility(8);
                    this.aI.setOnClickListener((View$OnClickListener)null);
                    this.aI.setBackgroundResource(0);
                    this.aI.setContentDescription((CharSequence)null);
                }
                this.aH.setVisibility(0);
            }
            else {
                if (b != 334359378) {
                    continue;
                }
                this.aP = (apet)alba.c;
            }
        }
        anss anss;
        if ((anss = this.H.e) == null) {
            anss = anss.a;
        }
        if (((agzd)anss).rs((agyr)SectionListRendererOuterClass.sectionListRenderer)) {
            anss anss2;
            if ((anss2 = this.H.e) == null) {
                anss2 = anss.a;
            }
            final veu veu = new veu((anws)((agzd)anss2).rr((agyr)SectionListRendererOuterClass.sectionListRenderer));
            aksd aksd;
            if ((aksd = this.H.l) == null) {
                aksd = aksd.a;
            }
            ((hth)this).D(veu, aksd);
            this.aN.setVisibility(0);
        }
        this.M();
        final hts s = this.s;
        final alaz h = this.H;
        apjz apjz2 = apjz;
        if ((h.b & 0x4) != 0x0 && (apjz2 = h.f) == null) {
            apjz2 = apjz.a;
        }
        if (s.o) {
            if (!s.y.bK()) {
                s.c.g(apjz2);
                s.y.bE((ujm)s.c);
                s.y.bD((ujn)s.c);
                s.y.bL(s.c.k(), s.c.a);
            }
        }
        final hts s2 = this.s;
        if (this.H.g) {
            this.at.d();
            j = true;
        }
        alaz = this.H;
        final int h2 = alaz.h;
        s2.j = j;
        if (j) {
            s2.l = h2;
        }
        Label_1005: {
            if ((alaz.b & 0x100) != 0x0) {
                alax alax;
                if ((alax = alaz.k) == null) {
                    alax = alax.a;
                }
                if ((alax.b & 0x1) != 0x0) {
                    final zcp k = this.K;
                    alax alax2;
                    if ((alax2 = this.H.k) == null) {
                        alax2 = alax.a;
                    }
                    int f;
                    if ((f = alhb.f(alax2.c)) == 0) {
                        f = 1;
                    }
                    k.j(f);
                    break Label_1005;
                }
            }
            this.K.j(2);
        }
        this.aG = (this.H.n ^ true);
        this.v();
        this.J.a();
    }
    
    public final void H(final altf altf) {
        this.K.a();
        this.h.execute((Runnable)new htk(this, altf));
    }
    
    final void I() {
        this.J.a();
        this.J.c();
    }
    
    public final void J() {
        final alaz h = this.H;
        if (h != null) {
            final agza builder = h.toBuilder();
            int size = ((alaz)builder.instance).d.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                size = n;
                if (((alba)((alaz)builder.instance).d.get(n)).b != 334359378) {
                    continue;
                }
                builder.copyOnWrite();
                final alaz alaz = (alaz)builder.instance;
                alaz.a();
                alaz.d.remove(n);
                size = n;
            }
            builder.copyOnWrite();
            final alaz alaz2 = (alaz)builder.instance;
            alaz2.m = null;
            final int b = alaz2.b & 0xFFFFFBFF;
            alaz2.b = b;
            Label_0294: {
                if ((b & 0x1000) != 0x0) {
                    alba alba;
                    if ((alba = alaz2.o) == null) {
                        alba = alba.a;
                    }
                    if (alba.b == 334359378) {
                        alba alba2;
                        if ((alba2 = ((alaz)builder.instance).o) == null) {
                            alba2 = alba.a;
                        }
                        apet a;
                        if (alba2.b == 334359378) {
                            a = (apet)alba2.c;
                        }
                        else {
                            a = apet.a;
                        }
                        this.aP = a;
                        alba alba3;
                        if ((alba3 = ((alaz)builder.instance).o) == null) {
                            alba3 = alba.a;
                        }
                        builder.copyOnWrite();
                        final alaz alaz3 = (alaz)builder.instance;
                        alba3.getClass();
                        alaz3.a();
                        alaz3.d.add(alba3);
                        break Label_0294;
                    }
                }
                this.aP = null;
            }
            this.M();
            builder.copyOnWrite();
            final alaz alaz4 = (alaz)builder.instance;
            alaz4.o = null;
            alaz4.b &= 0xFFFFEFFF;
            this.H = (alaz)builder.build();
        }
    }
    
    protected final Dialog a(final int n) {
        final hts s = this.s;
        Object c;
        if (n != 1021) {
            c = null;
        }
        else {
            c = s.ab.c;
        }
        if (c == null) {
            return null;
        }
        return (Dialog)c;
    }
    
    public final void b() {
        this.finish();
    }
    
    public final void c() {
        if (this.aE) {
            final Intent intent = this.getIntent();
            this.w.j(tsx.i(this.K()), apfp.aw, adhw.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
        }
    }
    
    public final void f(final ajje ajje) {
        this.al = aexq.k(ajje);
        if ((ajje.c & 0x8) != 0x0) {
            anss anss;
            if ((anss = ajje.f) == null) {
                anss = anss.a;
            }
            final amak amak = (amak)((agzd)anss).rr((agyr)amal.a);
            if (!this.N && (amak.b & 0x40000) != 0x0) {
                final vax i = this.i;
                aioe aioe;
                if ((aioe = amak.s) == null) {
                    aioe = aioe.a;
                }
                i.a(aioe);
                return;
            }
            if (amak.o) {
                this.az.ap(amak);
                return;
            }
            final hts s = this.s;
            ((fam)this).ol();
            s.z(ajje);
            this.m().b(2131429315);
        }
    }
    
    protected final void g(final gkm gkm) {
        if (gkm == gkm.b) {
            ((fa)this).setTheme(2132084329);
        }
    }
    
    public final void h() {
        this.s.n();
    }
    
    public final void i() {
        tmy.o((Activity)this);
        ((qt)this).onBackPressed();
    }
    
    public final void j() {
        this.m().b(2131431407);
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(2132020058);
        }
        ((fam)this).ol().c((Collection)afcr.q());
        final zcp k = this.K;
        if (k instanceof hsr) {
            ((hsr)k).b(this, ((fam)this).ol());
        }
        this.getWindow().setNavigationBarColor(tmy.cn((Context)this, 2130968777));
    }
    
    public final int k() {
        return 2131431407;
    }
    
    public final View l() {
        return (View)this.z.b;
    }
    
    public final ViewAnimatorHelper m() {
        return (ViewAnimatorHelper)((fa)this).findViewById(2131432359);
    }
    
    public final void mU() {
        this.aE = true;
        final Intent intent = this.getIntent();
        this.w.j(tsx.i(this.K()), apfp.au, adhw.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
    }
    
    public final void mV() {
        if (this.aE) {
            final Intent intent = this.getIntent();
            this.w.j(tsx.i(this.K()), apfp.av, adhw.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
            this.J();
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, int ordinal) {
        Class[] array;
        if (ordinal != -1) {
            if (ordinal != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(ordinal);
                throw new IllegalStateException(sb.toString());
            }
            final rjt rjt = (rjt)o;
            final glp a = glp.a;
            final rjs a2 = rjs.a;
            ordinal = rjt.a().ordinal();
            array = null;
            if (ordinal == 1 || ordinal == 2) {
                if (this.k.t()) {
                    this.u();
                }
                else {
                    this.finish();
                }
            }
        }
        else {
            array = new Class[] { rjt.class };
        }
        return array;
    }
    
    public final wwv n() {
        return (wwv)this.q;
    }
    
    public final aexq o() {
        final String stringExtra = this.getIntent().getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path");
        final Long e = adhw.e(this.getIntent());
        final boolean empty = TextUtils.isEmpty((CharSequence)stringExtra);
        Object o = null;
        if (!empty && e != null) {
            try {
                o = new htg(Uri.fromFile(new File(stringExtra)), tsx.j((long)(int)TimeUnit.MILLISECONDS.toSeconds(e)));
            }
            catch (final RuntimeException ex) {
                trn.d("Invalid model for the requested Thumbnail configuration.", (Throwable)ex);
                this.av.k("Error while parsing Thumbnail data.", ex);
            }
        }
        else {
            final StringBuilder sb = new StringBuilder("Invalid model for the requested Thumbnail configuration. Path: ");
            sb.append(stringExtra);
            sb.append(", length: ");
            sb.append(e);
            trn.b(sb.toString());
            this.av.j("Invalid model for the requested Thumbnail configuration.");
        }
        return aexq.j(o);
    }
    
    public final void onBackPressed() {
        final hts s = this.s;
        s.i = (rlw)((bu)s.a).getSupportFragmentManager().f("verificationFragmentTag");
        final rlw i = s.i;
        if (i != null && ((br)i).aw()) {
            s.i.aM();
            return;
        }
        final hts s2 = this.s;
        final cl supportFragmentManager = ((bu)s2.a).getSupportFragmentManager();
        if (supportFragmentManager != null) {
            final br f = supportFragmentManager.f("edit_thumbnails_fragment");
            final br f2 = supportFragmentManager.f("image_picker_fragment");
            if (f != null || f2 != null) {
                s2.G.d();
                return;
            }
        }
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r.l();
        if (this.s.t()) {
            this.A.i();
        }
        final zcp k = this.K;
        k.j(k.i());
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.as.aT()) {
            int theme;
            if (this.D.a() == gkm.b) {
                theme = 2132084330;
            }
            else {
                theme = 2132084331;
            }
            ((fa)this).setTheme(theme);
        }
        this.y.a();
        ((dh)this).getLifecycle().b((aul)this.B.a());
        ((qt)this).setContentView(2131625671);
        this.z.a((Activity)this);
        ((fa)this).setSupportActionBar((Toolbar)this.z.b);
        this.aO = this.getIntent();
        this.J = (LoadingFrameLayout)((fa)this).findViewById(2131429673);
        this.I();
        this.L = ((fa)this).findViewById(2131432249);
        this.am = glp.a(this.u.getString("upload_privacy", glp.a.name()));
        this.aH = (LinearLayout)((fa)this).findViewById(2131427417);
        this.aI = (ViewGroup)((fa)this).findViewById(2131427432);
        this.an = (ImageView)((fa)this).findViewById(2131427435);
        final acej a = acek.a();
        a.c = (acem)new htm(this);
        this.aJ = a.a();
        this.aK = (YouTubeTextView)((fa)this).findViewById(2131427429);
        this.aL = (YouTubeTextView)((fa)this).findViewById(2131427431);
        this.aM = (ImageView)((fa)this).findViewById(2131427433);
        this.aQ = (FrameLayout)((fa)this).findViewById(2131429987);
        if (this.as.aT()) {
            this.aQ.setBackgroundColor(tmy.cn((Context)this, 2130970829));
        }
        this.aR = (YouTubeTextView)((fa)this).findViewById(2131429986);
        this.aN = ((fa)this).findViewById(2131430798);
        Bundle bundle3;
        if (bundle != null) {
            this.ar = bundle.getString("activity_instance_uuid_key");
            this.G = bundle.getString("helper_active_account_identity");
            final Bundle bundle2 = bundle3 = bundle.getBundle("interaction_bundle");
            if (bundle.containsKey("verification_triggered_metadata_update_request")) {
                try {
                    final byte[] byteArray = bundle.getByteArray("verification_triggered_metadata_update_request");
                    bundle3 = bundle2;
                    if (byteArray != null) {
                        this.I = (aksf)agzi.parseFrom((agzi)aksf.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        bundle3 = bundle2;
                    }
                }
                catch (final ahab ahab) {
                    this.av.k("Cannot restore metadata update after verification flow rotation.", ahab);
                    bundle3 = bundle2;
                }
            }
        }
        else {
            bundle3 = null;
        }
        if (TextUtils.isEmpty((CharSequence)this.ar)) {
            this.ar = UUID.randomUUID().toString();
        }
        tcp.n((aum)this, this.aw.b(), (trb)new hks(this, 17), (trb)new fcy(this, bundle, 17));
        aioe c = null;
        Label_0552: {
            if (bundle3 == null) {
                final Intent ao = this.aO;
                if (ao != null) {
                    final Bundle extras = ao.getExtras();
                    if (extras != null) {
                        final byte[] byteArray2 = extras.getByteArray("navigation_endpoint");
                        if (byteArray2 != null) {
                            c = vba.c(byteArray2);
                            break Label_0552;
                        }
                    }
                }
            }
            c = null;
        }
        this.q.M(bundle3, c);
        final Intent ao2 = this.aO;
        if (ao2 != null) {
            this.s.H = TimeUnit.SECONDS.toMicros(ao2.getIntExtra("video_time_limit_seconds", 0));
        }
        final hts s = this.s;
        if (bundle != null) {
            s.h = bundle.getBoolean("helper_was_cellular_dialog_dismissed_by_user");
            s.k(bundle);
            s.k = bundle.getLong("max_known_video_length_key");
            s.l = bundle.getLong("required_length_for_verification_key");
            s.j = bundle.getBoolean("user_verification_eligible_key");
            s.A = (UploadFrontendIdMapHelper)bundle.getParcelable("fid_map_helper_key");
        }
        final hts s2 = this.s;
        final View viewById = ((fa)this).findViewById(16908290);
        if (!s2.R) {
            s2.R = true;
            s2.x = (TextView)viewById.findViewById(2131432239);
            s2.t = (ViewAnimatorHelper)viewById.findViewById(2131432359);
            s2.v = (ImageView)viewById.findViewById(2131432247);
            s2.w = (ImageView)viewById.findViewById(2131432248);
            s2.u = (NestedScrollView)viewById.findViewById(2131431271);
            ((fa)s2.a).findViewById(2131432305).setVisibility(8);
            if (s2.o) {
                final cl supportFragmentManager = ((bu)s2.a).getSupportFragmentManager();
                s2.y = (uqz)supportFragmentManager.f("videoEditFragment");
                if (s2.y == null) {
                    s2.y = new uqz();
                    apgj apgj;
                    if ((apgj = s2.aa.f().h) == null) {
                        apgj = apgj.a;
                    }
                    boolean al;
                    if (!apgj.s) {
                        s2.Y.c();
                        al = false;
                    }
                    else {
                        al = true;
                    }
                    final uqz y = s2.y;
                    ((uqx)y).aL = al;
                    ((uqx)y).aK = false;
                    final boolean p = s2.p;
                    y.bF(s2.H);
                    final uqz y2 = s2.y;
                    ((uqx)y2).aN = (p ? 1 : 0);
                    ((uqx)y2).aO = s2.q;
                    ((uqx)y2).aP = s2.b.q;
                    final ct i = supportFragmentManager.i();
                    i.r(2131432305, (br)s2.y, "videoEditFragment");
                    i.a();
                    supportFragmentManager.ab();
                    s2.e.a(tqt.e(s2.a.getApplicationContext()), "UPLOADS");
                }
                s2.y.bC(s2.d);
            }
            s2.t.c(2131431407, (trb)new htn(s2, 1));
            s2.t.c(2131432289, (trb)new htn(s2, 0));
            s2.t.c(2131428799, (trb)new htn(s2, 2));
            s2.f.f((BottomUiContainer)viewById.findViewById(2131427886));
            s2.X.c();
            this.s.r = (htr)this;
            final zcp k = this.K;
            if (k instanceof hsr) {
                ((hsr)k).b(this, ((fam)this).ol());
            }
            final ep supportActionBar = ((fa)this).getSupportActionBar();
            supportActionBar.j(true);
            supportActionBar.m(agw.a((Context)this, 2131233636));
            supportActionBar.A();
            this.v.g(((fa)this).findViewById(16908290));
            ((wwm)this.q).b(wya.b(9729), (aioe)null, this.s.c());
            ((hth)this).aa.d((View)this.z.b, ((fa)this).findViewById(2131432359), ((fa)this).findViewById(2131428812));
            final Object a2 = this.x.a;
            return;
        }
        throw new IllegalStateException("Helper UI has already been initialized");
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        final hts s = this.s;
        if (s.a.isFinishing()) {
            for (final admo admo : s.B) {
                final UploadFrontendIdMapHelper a = s.A;
                final String c = admo.c();
                final adia c2 = s.C;
                if (a.e(c) && !a.d(c)) {
                    c2.d(c, apfq.l);
                    a.b.add(c);
                }
            }
            s.C.F((adif)s);
        }
        if (this.isFinishing()) {
            tcp.m(this.aw.c((aexg)htt.b, (Executor)this.h), (tcn)new htl(this.av, 0, (byte[])null));
        }
        this.au.b();
        ((wwv)this.q).s();
    }
    
    protected final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (((uyi)this.ah.c).f(45367973L) && adhw.h(this.aO, intent)) {
            return;
        }
        this.finish();
        ((fam)this).startActivity(intent);
    }
    
    protected final void onPause() {
        super.onPause();
        this.y.b();
        this.Q.f((Object)new tmy());
        this.Q.m((Object)this);
        this.r.a();
        this.aD = false;
        final hts s = this.s;
        s.S = false;
        final uap x = s.X;
        if (x.b && !x.e()) {
            final String h = x.h;
            if (h != null) {
                x.m.C(h, apfp.aW);
            }
        }
    }
    
    protected final void onPostResume() {
        super.onPostResume();
        this.aD = true;
        if (this.aB) {
            this.aB = false;
            if (!this.k.t()) {
                this.p.b((Activity)this, (byte[])null, (zku)null);
                return;
            }
            this.u();
        }
    }
    
    public final void onRequestPermissionsResult(int n, final String[] array, final int[] array2) {
        final hts s = this.s;
        if (n == 0) {
            if (s.V) {
                s.V = false;
                if (!acsm.j((Context)s.a)) {
                    n = 2132020061;
                }
                else {
                    n = 2132020060;
                }
                final gbo d = gbq.d();
                d.c(0);
                d.k((CharSequence)s.a.getString(n));
                d.m((CharSequence)s.a.getString(2132020059), (View$OnClickListener)new hqg(s, 14));
                s.g.n((actz)d.a());
            }
            return;
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected final void onResume() {
        super.onResume();
        this.y.e();
        this.Q.g((Object)this);
        this.Q.f((Object)new tmy());
        this.s.S = true;
        this.aB = true;
    }
    
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.r.f();
        this.A.c();
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.q.L());
        bundle.putString("helper_active_account_identity", this.G);
        final String ar = this.ar;
        ar.getClass();
        bundle.putString("activity_instance_uuid_key", ar);
        tcp.n((aum)this, this.aw.c((aexg)new gkq(this, 18), (Executor)afsl.a), (trb)new hks(this, 16), (trb)hen.t);
        final hts s = this.s;
        bundle.putLong("max_known_video_length_key", s.k);
        bundle.putLong("required_length_for_verification_key", s.l);
        bundle.putBoolean("user_verification_eligible_key", s.j);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", s.h);
        final cl supportFragmentManager = ((bu)s.a).getSupportFragmentManager();
        if (s.u()) {
            supportFragmentManager.J(bundle, "verification_fragment_key", (br)s.i);
        }
        if (s.t()) {
            final zer m = s.m;
            m.getClass();
            supportFragmentManager.J(bundle, "thumbnail_fragment_key", (br)m);
        }
        if (s.s()) {
            final zfb n = s.n;
            n.getClass();
            supportFragmentManager.J(bundle, "image_picker_fragment_key", (br)n);
        }
        else {
            bundle.putBoolean("imagePickerShowingKey", false);
        }
        bundle.putParcelable("fid_map_helper_key", (Parcelable)s.A);
        if (this.s.u()) {
            final aksf i = this.I;
            if (i != null) {
                bundle.putByteArray("verification_triggered_metadata_update_request", ((agxl)i).toByteArray());
            }
        }
    }
    
    protected final void onStart() {
        super.onStart();
        this.aA = true;
    }
    
    protected final void onStop() {
        super.onStop();
        this.aA = false;
        if (this.aC) {
            this.s.j();
            this.aC = false;
        }
    }
    
    public final void q() {
        tmy.o((Activity)this);
        final alaz h = this.H;
        if (h != null && (h.b & 0x400) != 0x0) {
            aioe aioe;
            if ((aioe = h.m) == null) {
                aioe = aioe.a;
            }
            final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint)((agzd)aioe).rr((agyr)ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
            final hts s = this.s;
            for (final admo admo : s.B) {
                s.D.j(admo.c(), apfp.ar, admo.e(), admo.d());
            }
            this.K.d(false);
            this.I();
            final abpj ax = this.ax;
            final hmi hmi = new hmi(this, 16);
            final hmi hmi2 = new hmi(this, 17);
            final vlx u = ((addp)ax.e).u();
            u.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
            apxj d;
            if ((d = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d) == null) {
                d = apxj.a;
            }
            u.d = d;
            tcp.k(((addp)ax.e).v(u, (Executor)ax.h), (Executor)ax.h, (tcn)new etc(ax, (Runnable)hmi2, 9, null, null), (tco)new fct(ax, (Runnable)hmi, (Runnable)hmi2, 17, (byte[])null, (byte[])null));
            return;
        }
        this.w();
    }
    
    public final void r() {
        this.K.e(((hth)this).ad ^ true);
    }
    
    public final void s() {
    }
    
    public final void t() {
        this.N = true;
        if (this.al.h()) {
            final hts s = this.s;
            final ajje ajje = (ajje)this.al.c();
            ((fam)this).ol();
            s.z(ajje);
            this.m().b(2131429315);
        }
    }
    
    public final void u() {
        if (!this.aA || !this.k.t() || !this.E) {
            if (!this.E) {
                this.F = true;
            }
            return;
        }
        this.F = false;
        if (!this.aC) {
            final hts s = this.s;
            final Intent intent = this.getIntent();
            this.p.getClass();
            intent.getClass();
            final alff g = adio.g(s.B, s.T);
            s.d.l((wxz)new wws(wya.c(9701)));
            s.d.w((wxz)new wws(wya.c(9701)), g);
            s.d.l((wxz)new wws(wya.c(152818)));
            s.d.w((wxz)new wws(wya.c(152818)), g);
            s.d.l((wxz)new wws(wya.c(9702)));
            s.d.w((wxz)new wws(wya.c(9702)), g);
            s.g(13618, g);
            s.g(13617, g);
            s.g(13616, g);
            s.g(13619, g);
            s.g(13620, g);
            s.g(13621, g);
            final uap x = s.X;
            if (x.b) {
                final int g2 = x.p.g();
                final int f = x.p.f();
                final algl algl = g.g.get(0);
                final agza builder = ((agzi)g).toBuilder();
                final agza builder2 = ((agzi)algl).toBuilder();
                algk algk;
                if ((algk = algl.e) == null) {
                    algk = algk.a;
                }
                final agza builder3 = ((agzi)algk).toBuilder();
                builder3.copyOnWrite();
                final algk algk2 = (algk)builder3.instance;
                algk2.b |= 0x4000;
                algk2.m = g2;
                builder3.copyOnWrite();
                final algk algk3 = (algk)builder3.instance;
                algk3.b |= 0x8000;
                algk3.n = f;
                builder2.copyOnWrite();
                final algl algl2 = (algl)builder2.instance;
                final algk e = (algk)builder3.build();
                e.getClass();
                algl2.e = e;
                algl2.b |= 0x8;
                builder.copyOnWrite();
                alff.b((alff)builder.instance, (algl)builder2.build());
                x.i = (alff)builder.build();
                final wws wws = new wws(wya.c(152354));
                x.j.D((wxz)wws);
                final wwv j = x.j;
                final alff i = x.i;
                i.getClass();
                j.w((wxz)wws, i);
            }
            s.U = adhw.c(intent);
            final adhw e2 = s.E;
            final wwv d = s.d;
            final String t = s.T;
            final adof s2 = s.s;
            final ArrayList q = new ArrayList();
            final String action = intent.getAction();
            if (action != null) {
                if (!action.equals("com.google.android.youtube.intent.action.UPLOAD") && !action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra("android.intent.extra.STREAM")) {
                        d.J(3, (wxz)new wws(wya.c(13617)), alff.a);
                        final Bundle extras = intent.getExtras();
                        if (extras != null) {
                            final Object value = extras.get("android.intent.extra.STREAM");
                            if (value instanceof ArrayList) {
                                final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                if (parcelableArrayListExtra != null) {
                                    for (int size = parcelableArrayListExtra.size(), k = 0; k < size; ++k) {
                                        final Parcelable parcelable = (Parcelable)parcelableArrayListExtra.get(k);
                                        if (parcelable instanceof Uri) {
                                            q.add(adhv.a((Uri)parcelable).g());
                                        }
                                    }
                                }
                            }
                            else if (value instanceof String) {
                                final String stringExtra = intent.getStringExtra("android.intent.extra.STREAM");
                                if (stringExtra != null) {
                                    final Iterator iterator = aeyk.b(',').f(stringExtra).iterator();
                                    while (iterator.hasNext()) {
                                        q.add(adhv.a(Uri.parse((String)iterator.next())).g());
                                    }
                                }
                            }
                        }
                    }
                    else if (action.equals("android.intent.action.SEND")) {
                        d.J(3, (wxz)new wws(wya.c(13616)), alff.a);
                        final Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            final Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
                            if (parcelable2 instanceof Uri) {
                                q.add(adhv.a((Uri)parcelable2).g());
                            }
                        }
                    }
                }
                else {
                    d.J(3, (wxz)new wws(wya.c(13618)), adio.f(t, (String)null));
                    final Uri data = intent.getData();
                    if (data != null) {
                        final arzw a = adhv.a(data);
                        a.c = aexq.j(intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path"));
                        if (!TextUtils.isEmpty((CharSequence)t)) {
                            a.b = aexq.k(t);
                        }
                        q.add(a.g());
                    }
                }
            }
            s.Q = q;
            final Iterator iterator2 = s.Q.iterator();
            while (iterator2.hasNext()) {
                final adhv adhv = (adhv)iterator2.next();
                if (adhv == null || Uri.EMPTY.equals((Object)adhv.a)) {
                    iterator2.remove();
                }
            }
            if (s.Q.isEmpty()) {
                trn.l("no media content uri(s)");
                s.d.J(3, (wxz)new wws(wya.c(13619)), s.c());
                tmy.x((Context)s.a, 2132017992, 1);
                s.d();
            }
            else {
                if (s.A == null) {
                    s.A = new UploadFrontendIdMapHelper(s.Q.size());
                }
                s.J = true;
                s.l();
            }
            this.aC = true;
        }
        if (this.H == null) {
            this.L();
            return;
        }
        if (!this.k.c().d().equals(this.G)) {
            this.L();
            return;
        }
        this.runOnUiThread((Runnable)new hmi(this, 18));
    }
    
    public final void v() {
        if (this.M && this.aG) {
            this.L.setVisibility(0);
            return;
        }
        this.L.setVisibility(8);
    }
    
    public final void w() {
        final alaz h = this.H;
        if (h != null && (h.b & 0x20) != 0x0) {
            final vax i = this.i;
            aioe aioe;
            if ((aioe = h.i) == null) {
                aioe = aioe.a;
            }
            i.a(aioe);
            return;
        }
        this.s.f();
    }
    
    protected final boolean x() {
        if (!((hth)this).ac) {
            final uqz y = this.s.y;
            EditableVideo bu;
            if (y != null) {
                bu = y.bu();
            }
            else {
                bu = null;
            }
            if (bu == null || bu.K()) {
                return false;
            }
        }
        return true;
    }
    
    public final void y(final agza agza) {
        this.I = (aksf)agza.build();
        this.s.f();
    }
    
    public final void z(final String[] array) {
        if (this.aQ.getVisibility() == 0 || !TextUtils.isEmpty((CharSequence)this.aq)) {
            tcp.n((aum)this, this.aw.c((aexg)new gkq(this, 19), (Executor)afsl.a), (trb)hen.u, (trb)ifc.b);
        }
        tmy.p(this.getCurrentFocus());
        final Intent intent = this.getIntent();
        final Intent intent2 = new Intent();
        int n2;
        final int n = n2 = 1;
        if (intent != null) {
            if (intent.getBooleanExtra("navigate_to_my_uploads", true)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        intent2.putExtra("frontend_ids", array);
        intent2.putExtra("close_gallery_on_successful_upload", (boolean)((n2 ^ 0x1) != 0x0));
        this.setResult(-1, intent2);
        this.finish();
        if (n2 != 0) {
            final aioe aioe = (aioe)((agzi)vba.a("FEmy_videos")).toBuilder().build();
            agza agza;
            if (!((agzd)aioe).rs((agyr)amoa.b)) {
                agza = ((agzi)amob.a).createBuilder();
            }
            else {
                agza = ((agzi)((agzd)aioe).rr((agyr)amoa.b)).toBuilder();
            }
            agza.copyOnWrite();
            final amob amob = (amob)agza.instance;
            amob.b |= 0x2;
            amob.d = 9701;
            final agzc agzc = (agzc)((agzi)aioe).toBuilder();
            agzc.e((agyr)amoa.b, agza.build());
            final agzc agzc2 = (agzc)((agzi)((wwm)this.q).f((aioe)agzc.build())).toBuilder();
            final Intent j = this.ay.j();
            j.setFlags(67108864);
            j.putExtra("navigation_endpoint", ((agxl)agzc2.build()).toByteArray());
            ((fam)this).startActivity(j);
        }
    }
}

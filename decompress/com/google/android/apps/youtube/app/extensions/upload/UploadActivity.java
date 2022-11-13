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
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
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

public class UploadActivity extends htz implements hum, rgw, wyv, htq, rnc, uev, tgg
{
    public hts A;
    public atke B;
    public adjx C;
    public gkx D;
    public boolean E;
    public boolean F;
    String G;
    public aldc H;
    public akui I;
    public LoadingFrameLayout J;
    public zei K;
    View L;
    public boolean M;
    boolean N;
    public eg aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private aldc aG;
    private boolean aH;
    private LinearLayout aI;
    private ViewGroup aJ;
    private acgo aK;
    private YouTubeTextView aL;
    private YouTubeTextView aM;
    private ImageView aN;
    private View aO;
    private Intent aP;
    private apgx aQ;
    private FrameLayout aR;
    private YouTubeTextView aS;
    public aezp al;
    public glx am;
    public ImageView an;
    public aezp ao;
    public String ap;
    public String aq;
    public String ar;
    public qqr as;
    public vai at;
    public adkp au;
    public kja av;
    public adet aw;
    public heo ax;
    public c ay;
    public abrj az;
    public afvs h;
    public vcy i;
    public acnc j;
    public zmf k;
    public acgs l;
    public vlq m;
    public uqb n;
    public zgb o;
    public zmt p;
    public xac q;
    public rgs r;
    public hun s;
    public adlm t;
    public SharedPreferences u;
    public acwt v;
    public adlp w;
    public adet x;
    public fxw y;
    public htk z;
    
    public UploadActivity() {
        this.M = false;
        this.aH = false;
        this.N = false;
        final aeyo a = aeyo.a;
        this.al = (aezp)a;
        this.ao = (aezp)a;
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
        alut alut;
        if ((alut = this.ag.f().c) == null) {
            alut = alut.a;
        }
        if (alut.k && acuq.g((Context)this) && !this.ah.ak()) {
            teu.n((aun)this, this.o.a(), (ttg)new hlo(this, 18), (ttg)new hlo(this, 19));
            return;
        }
        this.H(null);
    }
    
    private final void M() {
        this.aq = "";
        apin apin;
        if ((apin = this.ag.f().h) == null) {
            apin = apin.a;
        }
        if (apin.v) {
            final apgx aq = this.aQ;
            if (aq != null) {
                if ((aq.b & 0x2) != 0x0) {
                    final YouTubeTextView as = this.aS;
                    ajut ajut;
                    if ((ajut = aq.d) == null) {
                        ajut = ajut.a;
                    }
                    as.setText((CharSequence)acak.c(ajut, (acaf)this.j));
                    this.aS.e(true);
                    this.aR.setVisibility(0);
                }
                final apgx aq2 = this.aQ;
                if ((aq2.b & 0x1) != 0x0) {
                    this.aq = aq2.c;
                }
                return;
            }
        }
        this.aR.setVisibility(8);
    }
    
    public final void C() {
        final hun s = this.s;
        s.d.J(3, (wzz)new wyt(xaa.c(9702)), adkp.c(s.B, s.T));
        final ClientSideRenderingService d = s.X.d;
        if (d != null) {
            d.b();
        }
        super.C();
        final Intent intent = this.getIntent();
        if (intent != null && !"com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(intent.getAction()) && !this.isTaskRoot()) {
            final Intent i = this.ay.i();
            i.setFlags(67108864);
            ((faq)this).startActivity(i);
        }
    }
    
    public final void G(aldc aldc) {
        tbi.f();
        if (!this.aE) {
            return;
        }
        if (this.aG == (this.H = aldc)) {
            return;
        }
        this.aG = aldc;
        ((huc)this).aa.a();
        this.aR.setVisibility(8);
        this.aI.setVisibility(8);
        this.aO.setVisibility(8);
        this.G = this.k.c().d();
        aldc = this.H;
        if ((aldc.b & 0x8000) != 0x0) {
            ((wyn)this.q).C((wzz)new wyt(aldc.q));
        }
        aldc = this.H;
        if ((aldc.b & 0x40) != 0x0) {
            this.K.f(aldc.j);
        }
        for (final aldd aldd : this.H.d) {
            final int b = aldd.b;
            if (b == 96626565) {
                final apgp apgp = (apgp)aldd.c;
                apgp.getClass();
                this.an.setBackgroundResource(2131102302);
                aotp aotp;
                if ((aotp = apgp.d) == null) {
                    aotp = aotp.a;
                }
                if (aald.S(aotp)) {
                    final acgs l = this.l;
                    final ImageView an = this.an;
                    aotp aotp2;
                    if ((aotp2 = apgp.d) == null) {
                        aotp2 = aotp.a;
                    }
                    l.j(an, aotp2, this.aK);
                }
                final YouTubeTextView al = this.aL;
                ajut ajut;
                if ((ajut = apgp.b) == null) {
                    ajut = ajut.a;
                }
                al.setText((CharSequence)acak.b(ajut));
                final YouTubeTextView am = this.aM;
                ajut ajut2;
                if ((ajut2 = apgp.c) == null) {
                    ajut2 = ajut.a;
                }
                am.setText((CharSequence)acak.b(ajut2));
                final boolean e = apgp.e;
                this.aJ.setClickable(e);
                if (e) {
                    this.aN.setVisibility(0);
                    this.aJ.setOnClickListener((View$OnClickListener)new hrb(this, 13));
                    final ViewGroup aj = this.aJ;
                    tpe.r((View)aj, aj.getBackground());
                    ajut ajut3;
                    if ((ajut3 = apgp.b) == null) {
                        ajut3 = ajut.a;
                    }
                    final Spanned b2 = acak.b(ajut3);
                    ajut ajut4;
                    if ((ajut4 = apgp.c) == null) {
                        ajut4 = ajut.a;
                    }
                    final Spanned b3 = acak.b(ajut4);
                    CharSequence charSequence;
                    if ((charSequence = (CharSequence)b2) == null) {
                        charSequence = "";
                    }
                    CharSequence charSequence2;
                    if ((charSequence2 = (CharSequence)b3) == null) {
                        charSequence2 = "";
                    }
                    this.aJ.setContentDescription((CharSequence)this.getString(2132017428, new Object[] { TextUtils.join((CharSequence)" ", (Iterable)Arrays.asList(charSequence, charSequence2)) }));
                }
                else {
                    this.aN.setVisibility(8);
                    this.aJ.setOnClickListener((View$OnClickListener)null);
                    this.aJ.setBackgroundResource(0);
                    this.aJ.setContentDescription((CharSequence)null);
                }
                this.aI.setVisibility(0);
            }
            else {
                if (b != 334359378) {
                    continue;
                }
                this.aQ = (apgx)aldd.c;
            }
        }
        anuv anuv;
        if ((anuv = this.H.e) == null) {
            anuv = anuv.a;
        }
        if (((ahbc)anuv).ry((ahaq)SectionListRendererOuterClass.sectionListRenderer)) {
            anuv anuv2;
            if ((anuv2 = this.H.e) == null) {
                anuv2 = anuv.a;
            }
            final vgu vgu = new vgu((anyv)((ahbc)anuv2).rx((ahaq)SectionListRendererOuterClass.sectionListRenderer));
            akug akug;
            if ((akug = this.H.m) == null) {
                akug = akug.a;
            }
            ((huc)this).D(vgu, akug);
            this.aO.setVisibility(0);
        }
        this.M();
        final hun s = this.s;
        aldc = this.H;
        apmd apmd;
        if ((aldc.b & 0x4) != 0x0) {
            if ((apmd = aldc.f) == null) {
                apmd = apmd.a;
            }
        }
        else {
            apmd = null;
        }
        if (s.o) {
            if (!s.y.bI()) {
                s.c.g(apmd);
                s.y.bC((ulh)s.c);
                s.y.bB((uli)s.c);
                s.y.bJ(s.c.k(), s.c.a);
            }
        }
        final hun s2 = this.s;
        boolean j;
        if (this.H.g) {
            this.au.h();
            j = true;
        }
        else {
            j = false;
        }
        final aldc h = this.H;
        final int h2 = h.h;
        s2.j = j;
        if (j) {
            s2.l = h2;
        }
        Label_1000: {
            if ((h.b & 0x100) != 0x0) {
                alda alda;
                if ((alda = h.l) == null) {
                    alda = alda.a;
                }
                if ((alda.b & 0x1) != 0x0) {
                    final zei k = this.K;
                    alda alda2;
                    if ((alda2 = this.H.l) == null) {
                        alda2 = alda.a;
                    }
                    int az;
                    if ((az = adyf.aZ(alda2.c)) == 0) {
                        az = 1;
                    }
                    k.j(az);
                    break Label_1000;
                }
            }
            this.K.j(2);
        }
        this.aH = (this.H.o ^ true);
        this.v();
        this.J.a();
        aldc = this.H;
        if ((aldc.b & 0x80) != 0x0) {
            aldb aldb;
            if ((aldb = aldc.k) == null) {
                aldb = aldb.a;
            }
            anuv anuv3;
            if ((anuv3 = aldb.b) == null) {
                anuv3 = anuv.a;
            }
            final aicz aicz = (aicz)((ahbc)anuv3).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            final heo ax = this.ax;
            final TextView textView = (TextView)((fa)this).findViewById(2131431511);
            ((acsx)((ziy)ax.c).ap(textView)).b(aicz, (wyw)null);
            ((wyw)ax.a).l((wzz)new wyt(aicz.w));
            textView.setOnClickListener((View$OnClickListener)new hqd(ax, aicz, 8, null, null, null, null));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
    }
    
    public final void H(final alvj alvj) {
        this.K.a();
        this.h.execute((Runnable)new huf(this, alvj));
    }
    
    final void I() {
        this.J.a();
        this.J.c();
    }
    
    public final void J() {
        final aldc h = this.H;
        if (h != null) {
            final ahaz builder = ((ahbh)h).toBuilder();
            int size = ((aldc)builder.instance).d.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                size = n;
                if (((aldd)((aldc)builder.instance).d.get(n)).b != 334359378) {
                    continue;
                }
                builder.copyOnWrite();
                final aldc aldc = (aldc)builder.instance;
                aldc.a();
                aldc.d.remove(n);
                size = n;
            }
            builder.copyOnWrite();
            final aldc aldc2 = (aldc)builder.instance;
            aldc2.n = null;
            final int b = aldc2.b & 0xFFFFFBFF;
            aldc2.b = b;
            Label_0299: {
                if ((b & 0x1000) != 0x0) {
                    aldd aldd;
                    if ((aldd = aldc2.p) == null) {
                        aldd = aldd.a;
                    }
                    if (aldd.b == 334359378) {
                        aldd aldd2;
                        if ((aldd2 = ((aldc)builder.instance).p) == null) {
                            aldd2 = aldd.a;
                        }
                        apgx a;
                        if (aldd2.b == 334359378) {
                            a = (apgx)aldd2.c;
                        }
                        else {
                            a = apgx.a;
                        }
                        this.aQ = a;
                        aldd aldd3;
                        if ((aldd3 = ((aldc)builder.instance).p) == null) {
                            aldd3 = aldd.a;
                        }
                        builder.copyOnWrite();
                        final aldc aldc3 = (aldc)builder.instance;
                        aldd3.getClass();
                        aldc3.a();
                        aldc3.d.add((Object)aldd3);
                        break Label_0299;
                    }
                }
                this.aQ = null;
            }
            this.M();
            builder.copyOnWrite();
            final aldc aldc4 = (aldc)builder.instance;
            aldc4.p = null;
            aldc4.b &= 0xFFFFEFFF;
            this.H = (aldc)builder.build();
        }
    }
    
    protected final Dialog a(final int n) {
        final hun s = this.s;
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
        if (this.aF) {
            final Intent intent = this.getIntent();
            this.w.j(tvb.i(this.K()), apht.aw, adjx.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
        }
    }
    
    public final void f(final ajli ajli) {
        this.al = aezp.k((Object)ajli);
        if ((ajli.c & 0x8) != 0x0) {
            anuv anuv;
            if ((anuv = ajli.f) == null) {
                anuv = anuv.a;
            }
            final amco amco = (amco)((ahbc)anuv).rx((ahaq)amcp.a);
            if (!this.N && (amco.b & 0x40000) != 0x0) {
                final vcy i = this.i;
                aiqj aiqj;
                if ((aiqj = amco.s) == null) {
                    aiqj = aiqj.a;
                }
                i.a(aiqj);
                return;
            }
            if (amco.o) {
                this.aA.aa(amco);
                return;
            }
            final hun s = this.s;
            ((faq)this).ol();
            s.z(ajli);
            this.m().b(2131429315);
        }
    }
    
    protected final void g(final gkv gkv) {
        if (gkv == gkv.b) {
            ((fa)this).setTheme(2132084329);
        }
    }
    
    public final void h() {
        this.s.n();
    }
    
    public final void i() {
        tpe.o((Activity)this);
        ((qt)this).onBackPressed();
    }
    
    public final void j() {
        this.m().b(2131431410);
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(2132020059);
        }
        ((faq)this).ol().c((Collection)afeq.q());
        final zei k = this.K;
        if (k instanceof hto) {
            ((hto)k).b(this, ((faq)this).ol());
        }
        this.getWindow().setNavigationBarColor(tpe.cr((Context)this, 2130968777));
    }
    
    public final int k() {
        return 2131431410;
    }
    
    public final View l() {
        return (View)this.z.c;
    }
    
    public final ViewAnimatorHelper m() {
        return (ViewAnimatorHelper)((fa)this).findViewById(2131432362);
    }
    
    public final void mU() {
        this.aF = true;
        final Intent intent = this.getIntent();
        this.w.j(tvb.i(this.K()), apht.au, adjx.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
    }
    
    public final void mV() {
        if (this.aF) {
            final Intent intent = this.getIntent();
            this.w.j(tvb.i(this.K()), apht.av, adjx.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
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
            final rlw rlw = (rlw)o;
            final glx a = glx.a;
            final rlv a2 = rlv.a;
            ordinal = rlw.a().ordinal();
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
            array = new Class[] { rlw.class };
        }
        return array;
    }
    
    public final aezp o() {
        final String stringExtra = this.getIntent().getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path");
        final Long e = adjx.e(this.getIntent());
        final boolean empty = TextUtils.isEmpty((CharSequence)stringExtra);
        Object o = null;
        if (!empty && e != null) {
            try {
                o = new hub(Uri.fromFile(new File(stringExtra)), tvb.j((long)(int)TimeUnit.MILLISECONDS.toSeconds(e)));
            }
            catch (final RuntimeException ex) {
                ttr.d("Invalid model for the requested Thumbnail configuration.", (Throwable)ex);
                this.aw.h("Error while parsing Thumbnail data.", (Throwable)ex);
            }
        }
        else {
            final StringBuilder sb = new StringBuilder("Invalid model for the requested Thumbnail configuration. Path: ");
            sb.append(stringExtra);
            sb.append(", length: ");
            sb.append(e);
            ttr.b(sb.toString());
            this.aw.g("Invalid model for the requested Thumbnail configuration.");
        }
        return aezp.j(o);
    }
    
    public final void onBackPressed() {
        final hun s = this.s;
        s.i = (rob)((bu)s.a).getSupportFragmentManager().f("verificationFragmentTag");
        final rob i = s.i;
        if (i != null && ((br)i).aw()) {
            s.i.aM();
            return;
        }
        final hun s2 = this.s;
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
        final zei k = this.K;
        k.j(k.i());
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.at.aU()) {
            int theme;
            if (this.D.a() == gkv.b) {
                theme = 2132084330;
            }
            else {
                theme = 2132084331;
            }
            ((fa)this).setTheme(theme);
        }
        this.y.a();
        ((dh)this).getLifecycle().b((aum)this.B.a());
        ((qt)this).setContentView(2131625676);
        this.z.a((Activity)this);
        ((fa)this).setSupportActionBar((Toolbar)this.z.c);
        this.aP = this.getIntent();
        this.J = (LoadingFrameLayout)((fa)this).findViewById(2131429673);
        this.I();
        this.L = ((fa)this).findViewById(2131432252);
        this.am = glx.a(this.u.getString("upload_privacy", glx.a.name()));
        this.aI = (LinearLayout)((fa)this).findViewById(2131427417);
        this.aJ = (ViewGroup)((fa)this).findViewById(2131427432);
        this.an = (ImageView)((fa)this).findViewById(2131427435);
        final acgn a = acgo.a();
        a.c = (acgq)new huh(this);
        this.aK = a.a();
        this.aL = (YouTubeTextView)((fa)this).findViewById(2131427429);
        this.aM = (YouTubeTextView)((fa)this).findViewById(2131427431);
        this.aN = (ImageView)((fa)this).findViewById(2131427433);
        this.aR = (FrameLayout)((fa)this).findViewById(2131429987);
        if (this.at.aU()) {
            this.aR.setBackgroundColor(tpe.cr((Context)this, 2130970829));
        }
        this.aS = (YouTubeTextView)((fa)this).findViewById(2131429986);
        this.aO = ((fa)this).findViewById(2131430801);
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
                        this.I = (akui)ahbh.parseFrom((ahbh)akui.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        bundle3 = bundle2;
                    }
                }
                catch (final ahca ahca) {
                    this.aw.h("Cannot restore metadata update after verification flow rotation.", (Throwable)ahca);
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
        teu.n((aun)this, this.as.a(), (ttg)new hlo(this, 17), (ttg)new fdc(this, bundle, 18));
        aiqj c = null;
        Label_0565: {
            if (bundle3 == null) {
                final Intent ap = this.aP;
                if (ap != null) {
                    final Bundle extras = ap.getExtras();
                    if (extras != null) {
                        final byte[] byteArray2 = extras.getByteArray("navigation_endpoint");
                        if (byteArray2 != null) {
                            c = vdb.c(byteArray2);
                            break Label_0565;
                        }
                    }
                }
            }
            c = null;
        }
        this.q.M(bundle3, c);
        final Intent ap2 = this.aP;
        if (ap2 != null) {
            this.s.H = TimeUnit.SECONDS.toMicros(ap2.getIntExtra("video_time_limit_seconds", 0));
        }
        final hun s = this.s;
        if (bundle != null) {
            s.h = bundle.getBoolean("helper_was_cellular_dialog_dismissed_by_user");
            s.k(bundle);
            s.k = bundle.getLong("max_known_video_length_key");
            s.l = bundle.getLong("required_length_for_verification_key");
            s.j = bundle.getBoolean("user_verification_eligible_key");
            s.A = (UploadFrontendIdMapHelper)bundle.getParcelable("fid_map_helper_key");
        }
        final hun s2 = this.s;
        final View viewById = ((fa)this).findViewById(16908290);
        if (!s2.R) {
            s2.R = true;
            s2.x = (TextView)viewById.findViewById(2131432242);
            s2.t = (ViewAnimatorHelper)viewById.findViewById(2131432362);
            s2.v = (ImageView)viewById.findViewById(2131432250);
            s2.w = (ImageView)viewById.findViewById(2131432251);
            s2.u = (NestedScrollView)viewById.findViewById(2131431274);
            ((fa)s2.a).findViewById(2131432308).setVisibility(8);
            if (s2.o) {
                final cl supportFragmentManager = ((bu)s2.a).getSupportFragmentManager();
                s2.y = (usu)supportFragmentManager.f("videoEditFragment");
                if (s2.y == null) {
                    s2.y = new usu();
                    apin apin;
                    if ((apin = s2.Z.f().h) == null) {
                        apin = apin.a;
                    }
                    boolean al;
                    if (!apin.s) {
                        s2.Y.g();
                        al = false;
                    }
                    else {
                        al = true;
                    }
                    final usu y = s2.y;
                    ((uss)y).aL = al;
                    ((uss)y).aK = false;
                    final boolean p = s2.p;
                    y.bD(s2.H);
                    final usu y2 = s2.y;
                    ((uss)y2).aN = (p ? 1 : 0);
                    ((uss)y2).aO = s2.q;
                    ((uss)y2).aP = s2.b.q;
                    final ct i = supportFragmentManager.i();
                    i.r(2131432308, (br)s2.y, "videoEditFragment");
                    i.a();
                    supportFragmentManager.ab();
                    s2.e.a(tsy.e(s2.a.getApplicationContext()), "UPLOADS");
                }
                s2.y.bA(s2.d);
            }
            s2.t.c(2131431410, (ttg)new hui(s2, 1));
            s2.t.c(2131432292, (ttg)new hui(s2, 0));
            s2.t.c(2131428799, (ttg)new hui(s2, 2));
            s2.f.f((BottomUiContainer)viewById.findViewById(2131427886));
            s2.X.c();
            this.s.r = (hum)this;
            final zei k = this.K;
            if (k instanceof hto) {
                ((hto)k).b(this, ((faq)this).ol());
            }
            final ep supportActionBar = ((fa)this).getSupportActionBar();
            supportActionBar.j(true);
            supportActionBar.m(agx.a((Context)this, 2131233638));
            supportActionBar.A();
            this.v.h(((fa)this).findViewById(16908290));
            ((wyn)this.q).b(xaa.b(9729), (aiqj)null, this.s.c());
            ((huc)this).aa.d((View)this.z.c, ((fa)this).findViewById(2131432362), ((fa)this).findViewById(2131428812));
            final Object a2 = this.x.a;
            return;
        }
        throw new IllegalStateException("Helper UI has already been initialized");
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        final hun s = this.s;
        if (s.a.isFinishing()) {
            for (final adop adop : s.B) {
                final UploadFrontendIdMapHelper a = s.A;
                final String c = adop.c();
                final adkb c2 = s.C;
                if (a.e(c) && !a.d(c)) {
                    c2.d(c, aphu.l);
                    a.b.add(c);
                }
            }
            s.C.H((adkg)s);
        }
        if (this.isFinishing()) {
            teu.m(this.as.b((aezf)huo.b, (Executor)this.h), (tes)new hug(this.aw, 0, (byte[])null, (byte[])null, (byte[])null));
        }
        this.av.b();
        ((wyw)this.q).s();
    }
    
    protected final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (((vai)this.ah.c).f(45367973L) && adjx.h(this.aP, intent)) {
            return;
        }
        this.finish();
        ((faq)this).startActivity(intent);
    }
    
    protected final void onPause() {
        super.onPause();
        this.y.b();
        this.Q.f((Object)new vdh());
        this.Q.m((Object)this);
        this.r.a();
        this.aE = false;
        final hun s = this.s;
        s.S = false;
        final ucs x = s.X;
        if (x.b && !x.e()) {
            final String h = x.h;
            if (h != null) {
                x.m.E(h, apht.aX);
            }
        }
    }
    
    protected final void onPostResume() {
        super.onPostResume();
        this.aE = true;
        if (this.aC) {
            this.aC = false;
            if (!this.k.t()) {
                this.p.b((Activity)this, (byte[])null, (zmr)null);
                return;
            }
            this.u();
        }
    }
    
    public final void onRequestPermissionsResult(int n, final String[] array, final int[] array2) {
        final hun s = this.s;
        if (n == 0) {
            if (s.V) {
                s.V = false;
                if (!acuq.j((Context)s.a)) {
                    n = 2132020062;
                }
                else {
                    n = 2132020061;
                }
                final gbv d = gbx.d();
                d.c(0);
                d.k((CharSequence)s.a.getString(n));
                ((acwc)d).m((CharSequence)s.a.getString(2132020060), (View$OnClickListener)new hrb(s, 14));
                s.g.n((acwd)d.a());
            }
            return;
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected final void onResume() {
        super.onResume();
        this.y.e();
        this.Q.g((Object)this);
        this.Q.f((Object)new tpe());
        this.s.S = true;
        this.aC = true;
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
        teu.n((aun)this, this.as.b((aezf)new ggp(this, 19), (Executor)afum.a), (ttg)new hlo(this, 16), (ttg)hid.s);
        final hun s = this.s;
        bundle.putLong("max_known_video_length_key", s.k);
        bundle.putLong("required_length_for_verification_key", s.l);
        bundle.putBoolean("user_verification_eligible_key", s.j);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", s.h);
        final cl supportFragmentManager = ((bu)s.a).getSupportFragmentManager();
        if (s.u()) {
            supportFragmentManager.J(bundle, "verification_fragment_key", (br)s.i);
        }
        if (s.t()) {
            final zgm m = s.m;
            m.getClass();
            supportFragmentManager.J(bundle, "thumbnail_fragment_key", (br)m);
        }
        if (s.s()) {
            final zgu n = s.n;
            n.getClass();
            supportFragmentManager.J(bundle, "image_picker_fragment_key", (br)n);
        }
        else {
            bundle.putBoolean("imagePickerShowingKey", false);
        }
        bundle.putParcelable("fid_map_helper_key", (Parcelable)s.A);
        if (this.s.u()) {
            final akui i = this.I;
            if (i != null) {
                bundle.putByteArray("verification_triggered_metadata_update_request", ((agzk)i).toByteArray());
            }
        }
    }
    
    protected final void onStart() {
        super.onStart();
        this.aB = true;
    }
    
    protected final void onStop() {
        super.onStop();
        this.aB = false;
        if (this.aD) {
            this.s.j();
            this.aD = false;
        }
    }
    
    public final wyw pF() {
        return (wyw)this.q;
    }
    
    public final void q() {
        tpe.o((Activity)this);
        final aldc h = this.H;
        if (h != null && (h.b & 0x400) != 0x0) {
            aiqj aiqj;
            if ((aiqj = h.n) == null) {
                aiqj = aiqj.a;
            }
            final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint)((ahbc)aiqj).rx((ahaq)ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
            final hun s = this.s;
            for (final adop adop : s.B) {
                s.D.j(adop.c(), apht.ar, adop.e(), adop.d());
            }
            this.K.d(false);
            this.I();
            final abrj az = this.az;
            final hol hol = new hol(this, 14);
            final hol hol2 = new hol(this, 15);
            final vob u = ((adfq)az.e).u();
            u.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
            apzt d;
            if ((d = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d) == null) {
                d = apzt.a;
            }
            u.d = d;
            teu.k(((adfq)az.e).v(u, (Executor)az.h), (Executor)az.h, (tes)new etf(az, hol2, 10, null, null), (tet)new fcy(az, (Runnable)hol, (Runnable)hol2, 17, (byte[])null, (byte[])null));
            return;
        }
        this.w();
    }
    
    public final void r() {
        this.K.e(((huc)this).ad ^ true);
    }
    
    public final void s() {
    }
    
    public final void t() {
        this.N = true;
        if (this.al.h()) {
            final hun s = this.s;
            final ajli ajli = (ajli)this.al.c();
            ((faq)this).ol();
            s.z(ajli);
            this.m().b(2131429315);
        }
    }
    
    public final void u() {
        if (!this.aB || !this.k.t() || !this.E) {
            if (!this.E) {
                this.F = true;
            }
            return;
        }
        this.F = false;
        if (!this.aD) {
            final hun s = this.s;
            final Intent intent = this.getIntent();
            this.p.getClass();
            intent.getClass();
            final alhi c = adkp.c(s.B, s.T);
            s.d.l((wzz)new wyt(xaa.c(9701)));
            s.d.w((wzz)new wyt(xaa.c(9701)), c);
            s.d.l((wzz)new wyt(xaa.c(152818)));
            s.d.w((wzz)new wyt(xaa.c(152818)), c);
            s.d.l((wzz)new wyt(xaa.c(9702)));
            s.d.w((wzz)new wyt(xaa.c(9702)), c);
            s.g(13618, c);
            s.g(13617, c);
            s.g(13616, c);
            s.g(13619, c);
            s.g(13620, c);
            s.g(13621, c);
            final ucs x = s.X;
            if (x.b) {
                final int g = x.p.g();
                final int f = x.p.f();
                final alip alip = (alip)c.g.get(0);
                final ahaz builder = ((ahbh)c).toBuilder();
                final ahaz builder2 = ((ahbh)alip).toBuilder();
                alio alio;
                if ((alio = alip.e) == null) {
                    alio = alio.a;
                }
                final ahaz builder3 = ((ahbh)alio).toBuilder();
                builder3.copyOnWrite();
                final alio alio2 = (alio)builder3.instance;
                alio2.b |= 0x4000;
                alio2.m = g;
                builder3.copyOnWrite();
                final alio alio3 = (alio)builder3.instance;
                alio3.b |= 0x8000;
                alio3.n = f;
                builder2.copyOnWrite();
                final alip alip2 = (alip)builder2.instance;
                final alio e = (alio)builder3.build();
                e.getClass();
                alip2.e = e;
                alip2.b |= 0x8;
                builder.copyOnWrite();
                alhi.b((alhi)builder.instance, (alip)builder2.build());
                x.i = (alhi)builder.build();
                final wyt wyt = new wyt(xaa.c(152354));
                x.j.D((wzz)wyt);
                final wyw j = x.j;
                final alhi i = x.i;
                i.getClass();
                j.w((wzz)wyt, i);
            }
            s.U = adjx.c(intent);
            final adjx e2 = s.E;
            final wyw d = s.d;
            final String t = s.T;
            final adqh s2 = s.s;
            final ArrayList q = new ArrayList();
            final String action = intent.getAction();
            if (action != null) {
                if (!action.equals("com.google.android.youtube.intent.action.UPLOAD") && !action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra("android.intent.extra.STREAM")) {
                        d.J(3, (wzz)new wyt(xaa.c(13617)), alhi.a);
                        final Bundle extras = intent.getExtras();
                        if (extras != null) {
                            final Object value = extras.get("android.intent.extra.STREAM");
                            if (value instanceof ArrayList) {
                                final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                if (parcelableArrayListExtra != null) {
                                    for (int size = parcelableArrayListExtra.size(), k = 0; k < size; ++k) {
                                        final Parcelable parcelable = (Parcelable)parcelableArrayListExtra.get(k);
                                        if (parcelable instanceof Uri) {
                                            q.add(adjw.a((Uri)parcelable).g());
                                        }
                                    }
                                }
                            }
                            else if (value instanceof String) {
                                final String stringExtra = intent.getStringExtra("android.intent.extra.STREAM");
                                if (stringExtra != null) {
                                    final Iterator iterator = afaj.b(',').f((CharSequence)stringExtra).iterator();
                                    while (iterator.hasNext()) {
                                        q.add(adjw.a(Uri.parse((String)iterator.next())).g());
                                    }
                                }
                            }
                        }
                    }
                    else if (action.equals("android.intent.action.SEND")) {
                        d.J(3, (wzz)new wyt(xaa.c(13616)), alhi.a);
                        final Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            final Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
                            if (parcelable2 instanceof Uri) {
                                q.add(adjw.a((Uri)parcelable2).g());
                            }
                        }
                    }
                }
                else {
                    d.J(3, (wzz)new wyt(xaa.c(13618)), adkp.b(t, null));
                    final Uri data = intent.getData();
                    if (data != null) {
                        final asbe a = adjw.a(data);
                        a.c = aezp.j((Object)intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path"));
                        if (!TextUtils.isEmpty((CharSequence)t)) {
                            a.b = aezp.k((Object)t);
                        }
                        q.add(a.g());
                    }
                }
            }
            s.Q = q;
            final Iterator iterator2 = s.Q.iterator();
            while (iterator2.hasNext()) {
                final adjw adjw = (adjw)iterator2.next();
                if (adjw == null || Uri.EMPTY.equals((Object)adjw.a)) {
                    iterator2.remove();
                }
            }
            if (s.Q.isEmpty()) {
                ttr.l("no media content uri(s)");
                s.d.J(3, (wzz)new wyt(xaa.c(13619)), s.c());
                tpe.x((Context)s.a, 2132017993, 1);
                s.d();
            }
            else {
                if (s.A == null) {
                    s.A = new UploadFrontendIdMapHelper(s.Q.size());
                }
                s.J = true;
                s.l();
            }
            this.aD = true;
        }
        if (this.H == null) {
            this.L();
            return;
        }
        if (!this.k.c().d().equals(this.G)) {
            this.L();
            return;
        }
        this.runOnUiThread((Runnable)new hol(this, 16));
    }
    
    public final void v() {
        if (this.M && this.aH) {
            this.L.setVisibility(0);
            return;
        }
        this.L.setVisibility(8);
    }
    
    public final void w() {
        final aldc h = this.H;
        if (h != null && (h.b & 0x20) != 0x0) {
            final vcy i = this.i;
            aiqj aiqj;
            if ((aiqj = h.i) == null) {
                aiqj = aiqj.a;
            }
            i.a(aiqj);
            return;
        }
        this.s.f();
    }
    
    protected final boolean x() {
        if (!((huc)this).ac) {
            final usu y = this.s.y;
            EditableVideo bs;
            if (y != null) {
                bs = y.bs();
            }
            else {
                bs = null;
            }
            if (bs == null || bs.K()) {
                return false;
            }
        }
        return true;
    }
    
    public final void y(final ahaz ahaz) {
        this.I = (akui)ahaz.build();
        this.s.f();
    }
    
    public final void z(final String[] array) {
        if (this.aR.getVisibility() == 0 || !TextUtils.isEmpty((CharSequence)this.aq)) {
            teu.n((aun)this, this.as.b((aezf)new ggp(this, 20), (Executor)afum.a), (ttg)hid.t, (ttg)hid.u);
        }
        tpe.p(this.getCurrentFocus());
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
            final aiqj aiqj = (aiqj)((ahaz)((ahbh)vdb.a("FEmy_videos")).toBuilder()).build();
            ahaz ahaz;
            if (!((ahbc)aiqj).ry((ahaq)amqf.b)) {
                ahaz = ((ahbh)amqg.a).createBuilder();
            }
            else {
                ahaz = ((ahbh)((ahbc)aiqj).rx((ahaq)amqf.b)).toBuilder();
            }
            ahaz.copyOnWrite();
            final amqg amqg = (amqg)ahaz.instance;
            amqg.b |= 0x2;
            amqg.d = 9701;
            final ahbb ahbb = (ahbb)((ahbh)aiqj).toBuilder();
            ahbb.e((ahaq)amqf.b, (Object)ahaz.build());
            final ahbb ahbb2 = (ahbb)((ahbh)((wyn)this.q).f((aiqj)((ahaz)ahbb).build())).toBuilder();
            final Intent i = this.ay.i();
            i.setFlags(67108864);
            i.putExtra("navigation_endpoint", ((agzk)((ahaz)ahbb2).build()).toByteArray());
            ((faq)this).startActivity(i);
        }
    }
}

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

public class UploadActivity extends hui implements huu, rhw, xaa, htz, roe, uga, thj
{
    public hub A;
    public atnb B;
    public adlm C;
    public glc D;
    public boolean E;
    public boolean F;
    String G;
    public alfc H;
    public akwi I;
    public LoadingFrameLayout J;
    public zgd K;
    View L;
    public boolean M;
    boolean N;
    public eg aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private alfc aG;
    private boolean aH;
    private LinearLayout aI;
    private ViewGroup aJ;
    private acic aK;
    private YouTubeTextView aL;
    private YouTubeTextView aM;
    private ImageView aN;
    private View aO;
    private Intent aP;
    private apjj aQ;
    private FrameLayout aR;
    private YouTubeTextView aS;
    public afbh al;
    public gmc am;
    public ImageView an;
    public afbh ao;
    public String ap;
    public String aq;
    public String ar;
    public qrk as;
    public vbs at;
    public kjk au;
    public absv av;
    public adgg aw;
    public adme ax;
    public hew ay;
    public c az;
    public afxj h;
    public veh i;
    public acop j;
    public zoa k;
    public acig l;
    public vmx m;
    public urc n;
    public zia o;
    public zoo p;
    public xbh q;
    public rhs r;
    public huv s;
    public adnb t;
    public SharedPreferences u;
    public acyg v;
    public adnd w;
    public adgg x;
    public fyb y;
    public hts z;
    
    public UploadActivity() {
        this.M = false;
        this.aH = false;
        this.N = false;
        final afag a = afag.a;
        this.al = a;
        this.ao = a;
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
        alwu alwu;
        if ((alwu = this.ag.f().c) == null) {
            alwu = alwu.a;
        }
        if (alwu.k && acwc.g((Context)this) && !this.ai.ai()) {
            tfx.n((aup)this, this.o.a(), (tui)new hlw(this, 20), (tui)new huq(this, 1));
            return;
        }
        this.H(null);
    }
    
    private final void M() {
        this.aq = "";
        apkz apkz;
        if ((apkz = this.ag.f().h) == null) {
            apkz = apkz.a;
        }
        if (apkz.v) {
            final apjj aq = this.aQ;
            if (aq != null) {
                if ((aq.b & 0x2) != 0x0) {
                    final YouTubeTextView as = this.aS;
                    ajws ajws;
                    if ((ajws = aq.d) == null) {
                        ajws = ajws.a;
                    }
                    as.setText((CharSequence)acbu.c(ajws, (acbp)this.j));
                    this.aS.e(true);
                    this.aR.setVisibility(0);
                }
                final apjj aq2 = this.aQ;
                if ((aq2.b & 0x1) != 0x0) {
                    this.aq = aq2.c;
                }
                return;
            }
        }
        this.aR.setVisibility(8);
    }
    
    public final void C() {
        final huv s = this.s;
        s.d.J(3, (xbe)new wzy(xbf.c(9702)), adme.c(s.B, s.T));
        final ClientSideRenderingService d = s.X.d;
        if (d != null) {
            d.b();
        }
        super.C();
        final Intent intent = this.getIntent();
        if (intent != null && !"com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(intent.getAction()) && !this.isTaskRoot()) {
            final Intent n = this.az.n();
            n.setFlags(67108864);
            ((fat)this).startActivity(n);
        }
    }
    
    public final void G(alfc alfc) {
        tcl.l();
        if (!this.aE) {
            return;
        }
        if (this.aG == (this.H = alfc)) {
            return;
        }
        this.aG = alfc;
        ((hul)this).aa.a();
        this.aR.setVisibility(8);
        this.aI.setVisibility(8);
        this.aO.setVisibility(8);
        this.G = this.k.c().d();
        alfc = this.H;
        if ((alfc.b & 0x8000) != 0x0) {
            ((wzr)this.q).C((xbe)new wzy(alfc.q));
        }
        alfc = this.H;
        if ((alfc.b & 0x40) != 0x0) {
            this.K.f(alfc.j);
        }
        for (final alfd alfd : this.H.d) {
            final int b = alfd.b;
            if (b == 96626565) {
                final apjb apjb = (apjb)alfd.c;
                apjb.getClass();
                this.an.setBackgroundResource(2131102298);
                aowb aowb;
                if ((aowb = apjb.d) == null) {
                    aowb = aowb.a;
                }
                if (aamz.W(aowb)) {
                    final acig l = this.l;
                    final ImageView an = this.an;
                    aowb aowb2;
                    if ((aowb2 = apjb.d) == null) {
                        aowb2 = aowb.a;
                    }
                    l.j(an, aowb2, this.aK);
                }
                final YouTubeTextView al = this.aL;
                ajws ajws;
                if ((ajws = apjb.b) == null) {
                    ajws = ajws.a;
                }
                al.setText((CharSequence)acbu.b(ajws));
                final YouTubeTextView am = this.aM;
                ajws ajws2;
                if ((ajws2 = apjb.c) == null) {
                    ajws2 = ajws.a;
                }
                am.setText((CharSequence)acbu.b(ajws2));
                final boolean e = apjb.e;
                this.aJ.setClickable(e);
                if (e) {
                    this.aN.setVisibility(0);
                    this.aJ.setOnClickListener((View$OnClickListener)new hrj(this, 13));
                    final ViewGroup aj = this.aJ;
                    tqf.r((View)aj, aj.getBackground());
                    ajws ajws3;
                    if ((ajws3 = apjb.b) == null) {
                        ajws3 = ajws.a;
                    }
                    final Spanned b2 = acbu.b(ajws3);
                    ajws ajws4;
                    if ((ajws4 = apjb.c) == null) {
                        ajws4 = ajws.a;
                    }
                    final Spanned b3 = acbu.b(ajws4);
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
                this.aQ = (apjj)alfd.c;
            }
        }
        anxb anxb;
        if ((anxb = this.H.e) == null) {
            anxb = anxb.a;
        }
        if (((ahcu)anxb).ry((ahci)SectionListRendererOuterClass.sectionListRenderer)) {
            anxb anxb2;
            if ((anxb2 = this.H.e) == null) {
                anxb2 = anxb.a;
            }
            final vic vic = new vic((aobc)((ahcu)anxb2).rx((ahci)SectionListRendererOuterClass.sectionListRenderer));
            amjt amjt;
            if ((amjt = this.H.m) == null) {
                amjt = amjt.a;
            }
            ((hul)this).D(vic, amjt);
            this.aO.setVisibility(0);
        }
        this.M();
        final huv s = this.s;
        alfc = this.H;
        apop apop;
        if ((alfc.b & 0x4) != 0x0) {
            if ((apop = alfc.f) == null) {
                apop = apop.a;
            }
        }
        else {
            apop = null;
        }
        if (s.o) {
            if (!s.y.bI()) {
                s.c.g(apop);
                s.y.bC((uml)s.c);
                s.y.bB((umm)s.c);
                s.y.bJ(s.c.k(), s.c.a);
            }
        }
        final huv s2 = this.s;
        boolean j;
        if (this.H.g) {
            this.ax.G();
            j = true;
        }
        else {
            j = false;
        }
        final alfc h = this.H;
        final int h2 = h.h;
        s2.j = j;
        if (j) {
            s2.l = h2;
        }
        Label_1000: {
            if ((h.b & 0x100) != 0x0) {
                alfa alfa;
                if ((alfa = h.l) == null) {
                    alfa = alfa.a;
                }
                if ((alfa.b & 0x1) != 0x0) {
                    final zgd k = this.K;
                    alfa alfa2;
                    if ((alfa2 = this.H.l) == null) {
                        alfa2 = alfa.a;
                    }
                    int dq;
                    if ((dq = aqvq.dQ(alfa2.c)) == 0) {
                        dq = 1;
                    }
                    k.j(dq);
                    break Label_1000;
                }
            }
            this.K.j(2);
        }
        this.aH = (this.H.o ^ true);
        this.v();
        this.J.a();
        alfc = this.H;
        if ((alfc.b & 0x80) != 0x0) {
            alfb alfb;
            if ((alfb = alfc.k) == null) {
                alfb = alfb.a;
            }
            anxb anxb3;
            if ((anxb3 = alfb.b) == null) {
                anxb3 = anxb.a;
            }
            final aies aies = (aies)((ahcu)anxb3).rx((ahci)ButtonRendererOuterClass.buttonRenderer);
            final hew ay = this.ay;
            final TextView textView = (TextView)((fa)this).findViewById(2131431512);
            ((zkt)ay.c).an(textView).b(aies, (xab)null);
            ((xab)ay.a).l((xbe)new wzy(aies.w));
            textView.setOnClickListener((View$OnClickListener)new hqk(ay, aies, 8, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
    }
    
    public final void H(final alxj alxj) {
        this.K.a();
        this.h.execute((Runnable)new huo(this, alxj));
    }
    
    final void I() {
        this.J.a();
        this.J.c();
    }
    
    public final void J() {
        final alfc h = this.H;
        if (h != null) {
            final ahcr builder = h.toBuilder();
            int size = ((alfc)builder.instance).d.size();
            while (true) {
                final int n = size - 1;
                if (n < 0) {
                    break;
                }
                size = n;
                if (((alfd)((alfc)builder.instance).d.get(n)).b != 334359378) {
                    continue;
                }
                builder.copyOnWrite();
                final alfc alfc = (alfc)builder.instance;
                alfc.a();
                alfc.d.remove(n);
                size = n;
            }
            builder.copyOnWrite();
            final alfc alfc2 = (alfc)builder.instance;
            alfc2.n = null;
            final int b = alfc2.b & 0xFFFFFBFF;
            alfc2.b = b;
            Label_0299: {
                if ((b & 0x1000) != 0x0) {
                    alfd alfd;
                    if ((alfd = alfc2.p) == null) {
                        alfd = alfd.a;
                    }
                    if (alfd.b == 334359378) {
                        alfd alfd2;
                        if ((alfd2 = ((alfc)builder.instance).p) == null) {
                            alfd2 = alfd.a;
                        }
                        apjj a;
                        if (alfd2.b == 334359378) {
                            a = (apjj)alfd2.c;
                        }
                        else {
                            a = apjj.a;
                        }
                        this.aQ = a;
                        alfd alfd3;
                        if ((alfd3 = ((alfc)builder.instance).p) == null) {
                            alfd3 = alfd.a;
                        }
                        builder.copyOnWrite();
                        final alfc alfc3 = (alfc)builder.instance;
                        alfd3.getClass();
                        alfc3.a();
                        alfc3.d.add((Object)alfd3);
                        break Label_0299;
                    }
                }
                this.aQ = null;
            }
            this.M();
            builder.copyOnWrite();
            final alfc alfc4 = (alfc)builder.instance;
            alfc4.p = null;
            alfc4.b &= 0xFFFFEFFF;
            this.H = (alfc)builder.build();
        }
    }
    
    protected final Dialog a(final int n) {
        final huv s = this.s;
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
            this.w.j(twd.i(this.K()), apkf.aw, adlm.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
        }
    }
    
    public final void f(final ajnh ajnh) {
        this.al = afbh.k(ajnh);
        if ((ajnh.c & 0x8) != 0x0) {
            anxb anxb;
            if ((anxb = ajnh.f) == null) {
                anxb = anxb.a;
            }
            final amep amep = (amep)((ahcu)anxb).rx((ahci)ameq.a);
            if (!this.N && (amep.b & 0x40000) != 0x0) {
                final veh i = this.i;
                aisc aisc;
                if ((aisc = amep.s) == null) {
                    aisc = aisc.a;
                }
                i.a(aisc);
                return;
            }
            if (amep.o) {
                this.aA.aa(amep);
                return;
            }
            final huv s = this.s;
            ((fat)this).oi();
            s.z(ajnh);
            this.m().b(2131429315);
        }
    }
    
    protected final void g(final gla gla) {
        if (gla == gla.b) {
            ((fa)this).setTheme(2132084334);
        }
    }
    
    public final void h() {
        this.s.n();
    }
    
    public final void i() {
        tqf.o((Activity)this);
        ((qu)this).onBackPressed();
    }
    
    public final void j() {
        this.m().b(2131431411);
        final ep supportActionBar = ((fa)this).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(2132020062);
        }
        ((fat)this).oi().c((Collection)afgh.q());
        final zgd k = this.K;
        if (k instanceof htx) {
            ((htx)k).b(this, ((fat)this).oi());
        }
        this.getWindow().setNavigationBarColor(tqf.cr((Context)this, 2130968777));
    }
    
    public final int k() {
        return 2131431411;
    }
    
    public final View l() {
        return (View)this.z.c;
    }
    
    public final ViewAnimatorHelper m() {
        return (ViewAnimatorHelper)((fa)this).findViewById(2131432363);
    }
    
    public final void mR() {
        this.aF = true;
        final Intent intent = this.getIntent();
        this.w.j(twd.i(this.K()), apkf.au, adlm.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
    }
    
    public final void mS() {
        if (this.aF) {
            final Intent intent = this.getIntent();
            this.w.j(twd.i(this.K()), apkf.av, adlm.k(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_presumed_shorts_eligibility", false));
            this.J();
        }
    }
    
    public final Class[] mr(final Class clazz, final Object o, int ordinal) {
        Class[] array;
        if (ordinal != -1) {
            if (ordinal != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(ordinal);
                throw new IllegalStateException(sb.toString());
            }
            final rmw rmw = (rmw)o;
            final gmc a = gmc.a;
            final rmv a2 = rmv.a;
            ordinal = rmw.a().ordinal();
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
            array = new Class[] { rmw.class };
        }
        return array;
    }
    
    public final afbh o() {
        final String stringExtra = this.getIntent().getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path");
        final Long e = adlm.e(this.getIntent());
        final boolean empty = TextUtils.isEmpty((CharSequence)stringExtra);
        Object o = null;
        if (!empty && e != null) {
            try {
                o = new huk(Uri.fromFile(new File(stringExtra)), twd.j((long)(int)TimeUnit.MILLISECONDS.toSeconds(e)));
            }
            catch (final RuntimeException ex) {
                tut.d("Invalid model for the requested Thumbnail configuration.", (Throwable)ex);
                this.aw.D("Error while parsing Thumbnail data.", (Throwable)ex);
            }
        }
        else {
            final StringBuilder sb = new StringBuilder("Invalid model for the requested Thumbnail configuration. Path: ");
            sb.append(stringExtra);
            sb.append(", length: ");
            sb.append(e);
            tut.b(sb.toString());
            this.aw.C("Invalid model for the requested Thumbnail configuration.");
        }
        return afbh.j(o);
    }
    
    public final void onBackPressed() {
        final huv s = this.s;
        s.i = (rpd)((bu)s.a).getSupportFragmentManager().f("verificationFragmentTag");
        final rpd i = s.i;
        if (i != null && ((br)i).aw()) {
            s.i.aM();
            return;
        }
        final huv s2 = this.s;
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
        final zgd k = this.K;
        k.j(k.i());
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.at.aX()) {
            int theme;
            if (this.D.a() == gla.b) {
                theme = 2132084335;
            }
            else {
                theme = 2132084336;
            }
            ((fa)this).setTheme(theme);
        }
        this.y.a();
        ((dh)this).getLifecycle().b((auo)this.B.a());
        ((qu)this).setContentView(2131625678);
        this.z.a((Activity)this);
        ((fa)this).setSupportActionBar((Toolbar)this.z.c);
        this.aP = this.getIntent();
        this.J = (LoadingFrameLayout)((fa)this).findViewById(2131429673);
        this.I();
        this.L = ((fa)this).findViewById(2131432253);
        this.am = gmc.a(this.u.getString("upload_privacy", gmc.a.name()));
        this.aI = (LinearLayout)((fa)this).findViewById(2131427417);
        this.aJ = (ViewGroup)((fa)this).findViewById(2131427432);
        this.an = (ImageView)((fa)this).findViewById(2131427435);
        final acib a = acic.a();
        a.c = (acie)new hup(this);
        this.aK = a.a();
        this.aL = (YouTubeTextView)((fa)this).findViewById(2131427429);
        this.aM = (YouTubeTextView)((fa)this).findViewById(2131427431);
        this.aN = (ImageView)((fa)this).findViewById(2131427433);
        this.aR = (FrameLayout)((fa)this).findViewById(2131429987);
        if (this.at.aX()) {
            this.aR.setBackgroundColor(tqf.cr((Context)this, 2130970827));
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
                        this.I = (akwi)ahcz.parseFrom((ahcz)akwi.a, byteArray, ExtensionRegistryLite.getGeneratedRegistry());
                        bundle3 = bundle2;
                    }
                }
                catch (final ahds ahds) {
                    this.aw.D("Cannot restore metadata update after verification flow rotation.", (Throwable)ahds);
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
        tfx.n((aup)this, this.as.a(), (tui)new hlw(this, 19), (tui)new fdf(this, bundle, 19));
        aisc c = null;
        Label_0565: {
            if (bundle3 == null) {
                final Intent ap = this.aP;
                if (ap != null) {
                    final Bundle extras = ap.getExtras();
                    if (extras != null) {
                        final byte[] byteArray2 = extras.getByteArray("navigation_endpoint");
                        if (byteArray2 != null) {
                            c = vek.c(byteArray2);
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
        final huv s = this.s;
        if (bundle != null) {
            s.h = bundle.getBoolean("helper_was_cellular_dialog_dismissed_by_user");
            s.k(bundle);
            s.k = bundle.getLong("max_known_video_length_key");
            s.l = bundle.getLong("required_length_for_verification_key");
            s.j = bundle.getBoolean("user_verification_eligible_key");
            s.A = (UploadFrontendIdMapHelper)bundle.getParcelable("fid_map_helper_key");
        }
        final huv s2 = this.s;
        final View viewById = ((fa)this).findViewById(16908290);
        if (!s2.R) {
            s2.R = true;
            s2.x = (TextView)viewById.findViewById(2131432243);
            s2.t = (ViewAnimatorHelper)viewById.findViewById(2131432363);
            s2.v = (ImageView)viewById.findViewById(2131432251);
            s2.w = (ImageView)viewById.findViewById(2131432252);
            s2.u = (NestedScrollView)viewById.findViewById(2131431275);
            ((fa)s2.a).findViewById(2131432309).setVisibility(8);
            if (s2.o) {
                final cl supportFragmentManager = ((bu)s2.a).getSupportFragmentManager();
                s2.y = (utv)supportFragmentManager.f("videoEditFragment");
                if (s2.y == null) {
                    s2.y = new utv();
                    apkz apkz;
                    if ((apkz = s2.Y.f().h) == null) {
                        apkz = apkz.a;
                    }
                    boolean al;
                    if (!apkz.s) {
                        s2.aa.F();
                        al = false;
                    }
                    else {
                        al = true;
                    }
                    final utv y = s2.y;
                    ((utt)y).aL = al;
                    ((utt)y).aK = false;
                    final boolean p = s2.p;
                    y.bD(s2.H);
                    final utv y2 = s2.y;
                    ((utt)y2).aN = (p ? 1 : 0);
                    ((utt)y2).aO = s2.q;
                    ((utt)y2).aP = s2.b.q;
                    final ct i = supportFragmentManager.i();
                    i.r(2131432309, (br)s2.y, "videoEditFragment");
                    i.a();
                    supportFragmentManager.ab();
                    s2.e.a(tua.e(s2.a.getApplicationContext()), "UPLOADS");
                }
                s2.y.bA(s2.d);
            }
            s2.t.c(2131431411, (tui)new huq(s2, 2));
            s2.t.c(2131432293, (tui)new huq(s2, 3));
            s2.t.c(2131428799, (tui)new huq(s2, 4));
            s2.f.f((BottomUiContainer)viewById.findViewById(2131427886));
            s2.X.c();
            this.s.r = (huu)this;
            final zgd k = this.K;
            if (k instanceof htx) {
                ((htx)k).b(this, ((fat)this).oi());
            }
            final ep supportActionBar = ((fa)this).getSupportActionBar();
            supportActionBar.j(true);
            supportActionBar.m(agy.a((Context)this, 2131233639));
            supportActionBar.A();
            this.v.h(((fa)this).findViewById(16908290));
            ((wzr)this.q).b(xbf.b(9729), (aisc)null, this.s.c());
            ((hul)this).aa.d((View)this.z.c, ((fa)this).findViewById(2131432363), ((fa)this).findViewById(2131428812));
            final Object a2 = this.x.a;
            return;
        }
        throw new IllegalStateException("Helper UI has already been initialized");
    }
    
    protected final void onDestroy() {
        super.onDestroy();
        final huv s = this.s;
        if (s.a.isFinishing()) {
            for (final adqe adqe : s.B) {
                final UploadFrontendIdMapHelper a = s.A;
                final String c = adqe.c();
                final adlq c2 = s.C;
                if (a.e(c) && !a.d(c)) {
                    c2.d(c, apkg.l);
                    a.b.add(c);
                }
            }
            s.C.H((adlv)s);
        }
        if (this.isFinishing()) {
            tfx.m(this.as.b((afax)huw.b, (Executor)this.h), (tfv)new hwb(this.aw, 1, (byte[])null, (byte[])null, (byte[])null));
        }
        this.au.b();
        ((xab)this.q).s();
    }
    
    protected final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        if (((vbs)this.ai.c).f(45367973L) && adlm.h(this.aP, intent)) {
            return;
        }
        this.finish();
        ((fat)this).startActivity(intent);
    }
    
    protected final void onPause() {
        super.onPause();
        this.y.b();
        this.Q.f((Object)new vfw());
        this.Q.m((Object)this);
        this.r.a();
        this.aE = false;
        final huv s = this.s;
        s.S = false;
        final udx x = s.X;
        if (x.b && !x.e()) {
            final String h = x.h;
            if (h != null) {
                x.m.E(h, apkf.aX);
            }
        }
    }
    
    protected final void onPostResume() {
        super.onPostResume();
        this.aE = true;
        if (this.aC) {
            this.aC = false;
            if (!this.k.t()) {
                this.p.b((Activity)this, (byte[])null, (zom)null);
                return;
            }
            this.u();
        }
    }
    
    public final void onRequestPermissionsResult(int n, final String[] array, final int[] array2) {
        final huv s = this.s;
        if (n == 0) {
            if (s.V) {
                s.V = false;
                if (!acwc.j((Context)s.a)) {
                    n = 2132020065;
                }
                else {
                    n = 2132020064;
                }
                final gcb d = gcd.d();
                d.c(0);
                d.k((CharSequence)s.a.getString(n));
                ((acxp)d).m(s.a.getString(2132020063), (View$OnClickListener)new hrj(s, 14));
                s.g.n((acxq)d.a());
            }
            return;
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected final void onResume() {
        super.onResume();
        this.y.e();
        this.Q.g((Object)this);
        this.Q.f((Object)new tqf());
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
        tfx.n((aup)this, this.as.b((afax)new ggu(this, 19), (Executor)afwd.a), (tui)new hlw(this, 18), (tui)him.s);
        final huv s = this.s;
        bundle.putLong("max_known_video_length_key", s.k);
        bundle.putLong("required_length_for_verification_key", s.l);
        bundle.putBoolean("user_verification_eligible_key", s.j);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", s.h);
        final cl supportFragmentManager = ((bu)s.a).getSupportFragmentManager();
        if (s.u()) {
            supportFragmentManager.J(bundle, "verification_fragment_key", (br)s.i);
        }
        if (s.t()) {
            final zik m = s.m;
            m.getClass();
            supportFragmentManager.J(bundle, "thumbnail_fragment_key", (br)m);
        }
        if (s.s()) {
            final zit n = s.n;
            n.getClass();
            supportFragmentManager.J(bundle, "image_picker_fragment_key", (br)n);
        }
        else {
            bundle.putBoolean("imagePickerShowingKey", false);
        }
        bundle.putParcelable("fid_map_helper_key", (Parcelable)s.A);
        if (this.s.u()) {
            final akwi i = this.I;
            if (i != null) {
                bundle.putByteArray("verification_triggered_metadata_update_request", ((ahbc)i).toByteArray());
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
    
    public final xab pE() {
        return (xab)this.q;
    }
    
    public final void q() {
        tqf.o((Activity)this);
        final alfc h = this.H;
        if (h != null && (h.b & 0x400) != 0x0) {
            aisc aisc;
            if ((aisc = h.n) == null) {
                aisc = aisc.a;
            }
            final ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint = (ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint)((ahcu)aisc).rx((ahci)ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint);
            final huv s = this.s;
            for (final adqe adqe : s.B) {
                s.D.j(adqe.c(), apkf.ar, adqe.e(), adqe.d());
            }
            this.K.d(false);
            this.I();
            final absv av = this.av;
            final hou hou = new hou(this, 13);
            final hou hou2 = new hou(this, 14);
            final vpi u = ((adhd)av.e).u();
            u.a = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.c;
            aqch d;
            if ((d = channelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.d) == null) {
                d = aqch.a;
            }
            u.d = d;
            tfx.k(((adhd)av.e).v(u, (Executor)av.h), (Executor)av.h, (tfv)new eth(av, (Runnable)hou2, 10, (byte[])null, (byte[])null), (tfw)new fdb(av, (Runnable)hou, (Runnable)hou2, 17, (byte[])null, (byte[])null));
            return;
        }
        this.w();
    }
    
    public final void r() {
        this.K.e(((hul)this).ad ^ true);
    }
    
    public final void s() {
    }
    
    public final void t() {
        this.N = true;
        if (this.al.h()) {
            final huv s = this.s;
            final ajnh ajnh = (ajnh)this.al.c();
            ((fat)this).oi();
            s.z(ajnh);
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
            final huv s = this.s;
            final Intent intent = this.getIntent();
            this.p.getClass();
            intent.getClass();
            final alji c = adme.c(s.B, s.T);
            s.d.l((xbe)new wzy(xbf.c(9701)));
            s.d.w((xbe)new wzy(xbf.c(9701)), c);
            s.d.l((xbe)new wzy(xbf.c(152818)));
            s.d.w((xbe)new wzy(xbf.c(152818)), c);
            s.d.l((xbe)new wzy(xbf.c(9702)));
            s.d.w((xbe)new wzy(xbf.c(9702)), c);
            s.g(13618, c);
            s.g(13617, c);
            s.g(13616, c);
            s.g(13619, c);
            s.g(13620, c);
            s.g(13621, c);
            final udx x = s.X;
            if (x.b) {
                final int g = x.p.g();
                final int f = x.p.f();
                final alkp alkp = (alkp)c.g.get(0);
                final ahcr builder = ((ahcz)c).toBuilder();
                final ahcr builder2 = ((ahcz)alkp).toBuilder();
                alko alko;
                if ((alko = alkp.e) == null) {
                    alko = alko.a;
                }
                final ahcr builder3 = ((ahcz)alko).toBuilder();
                builder3.copyOnWrite();
                final alko alko2 = (alko)builder3.instance;
                alko2.b |= 0x4000;
                alko2.m = g;
                builder3.copyOnWrite();
                final alko alko3 = (alko)builder3.instance;
                alko3.b |= 0x8000;
                alko3.n = f;
                builder2.copyOnWrite();
                final alkp alkp2 = (alkp)builder2.instance;
                final alko e = (alko)builder3.build();
                e.getClass();
                alkp2.e = e;
                alkp2.b |= 0x8;
                builder.copyOnWrite();
                alji.b((alji)builder.instance, (alkp)builder2.build());
                x.i = (alji)builder.build();
                final wzy wzy = new wzy(xbf.c(152354));
                x.j.D((xbe)wzy);
                final xab j = x.j;
                final alji i = x.i;
                i.getClass();
                j.w((xbe)wzy, i);
            }
            s.U = adlm.c(intent);
            final adlm e2 = s.E;
            final xab d = s.d;
            final String t = s.T;
            final adry s2 = s.s;
            final ArrayList q = new ArrayList();
            final String action = intent.getAction();
            if (action != null) {
                if (!action.equals("com.google.android.youtube.intent.action.UPLOAD") && !action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                    if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra("android.intent.extra.STREAM")) {
                        d.J(3, (xbe)new wzy(xbf.c(13617)), alji.a);
                        final Bundle extras = intent.getExtras();
                        if (extras != null) {
                            final Object value = extras.get("android.intent.extra.STREAM");
                            if (value instanceof ArrayList) {
                                final ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                                if (parcelableArrayListExtra != null) {
                                    for (int size = parcelableArrayListExtra.size(), k = 0; k < size; ++k) {
                                        final Parcelable parcelable = (Parcelable)parcelableArrayListExtra.get(k);
                                        if (parcelable instanceof Uri) {
                                            q.add(adll.a((Uri)parcelable).g());
                                        }
                                    }
                                }
                            }
                            else if (value instanceof String) {
                                final String stringExtra = intent.getStringExtra("android.intent.extra.STREAM");
                                if (stringExtra != null) {
                                    final Iterator iterator = afcb.b(',').f(stringExtra).iterator();
                                    while (iterator.hasNext()) {
                                        q.add(adll.a(Uri.parse((String)iterator.next())).g());
                                    }
                                }
                            }
                        }
                    }
                    else if (action.equals("android.intent.action.SEND")) {
                        d.J(3, (xbe)new wzy(xbf.c(13616)), alji.a);
                        final Bundle extras2 = intent.getExtras();
                        if (extras2 != null) {
                            final Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
                            if (parcelable2 instanceof Uri) {
                                q.add(adll.a((Uri)parcelable2).g());
                            }
                        }
                    }
                }
                else {
                    d.J(3, (xbe)new wzy(xbf.c(13618)), adme.b(t, null));
                    final Uri data = intent.getData();
                    if (data != null) {
                        final asdz a = adll.a(data);
                        a.c = afbh.j(intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path"));
                        if (!TextUtils.isEmpty((CharSequence)t)) {
                            a.b = afbh.k(t);
                        }
                        q.add(a.g());
                    }
                }
            }
            s.Q = q;
            final Iterator iterator2 = s.Q.iterator();
            while (iterator2.hasNext()) {
                final adll adll = (adll)iterator2.next();
                if (adll == null || Uri.EMPTY.equals((Object)adll.a)) {
                    iterator2.remove();
                }
            }
            if (s.Q.isEmpty()) {
                tut.l("no media content uri(s)");
                s.d.J(3, (xbe)new wzy(xbf.c(13619)), s.c());
                tqf.x((Context)s.a, 2132017993, 1);
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
        this.runOnUiThread((Runnable)new hou(this, 15));
    }
    
    public final void v() {
        if (this.M && this.aH) {
            this.L.setVisibility(0);
            return;
        }
        this.L.setVisibility(8);
    }
    
    public final void w() {
        final alfc h = this.H;
        if (h != null && (h.b & 0x20) != 0x0) {
            final veh i = this.i;
            aisc aisc;
            if ((aisc = h.i) == null) {
                aisc = aisc.a;
            }
            i.a(aisc);
            return;
        }
        this.s.f();
    }
    
    protected final boolean x() {
        if (!((hul)this).ac) {
            final utv y = this.s.y;
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
    
    public final void y(final ahcr ahcr) {
        this.I = (akwi)ahcr.build();
        this.s.f();
    }
    
    public final void z(final String[] array) {
        if (this.aR.getVisibility() == 0 || !TextUtils.isEmpty((CharSequence)this.aq)) {
            tfx.n((aup)this, this.as.b((afax)new ggu(this, 20), (Executor)afwd.a), (tui)him.t, (tui)him.u);
        }
        tqf.p(this.getCurrentFocus());
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
            final aisc aisc = (aisc)((ahcr)((ahcz)vek.a("FEmy_videos")).toBuilder()).build();
            ahcr ahcr;
            if (!((ahcu)aisc).ry((ahci)amsk.b)) {
                ahcr = ((ahcz)amsl.a).createBuilder();
            }
            else {
                ahcr = ((ahcz)((ahcu)aisc).rx((ahci)amsk.b)).toBuilder();
            }
            ahcr.copyOnWrite();
            final amsl amsl = (amsl)ahcr.instance;
            amsl.b |= 0x2;
            amsl.d = 9701;
            final ahct ahct = (ahct)((ahcz)aisc).toBuilder();
            ahct.e((ahci)amsk.b, (Object)ahcr.build());
            final ahct ahct2 = (ahct)((ahcz)((wzr)this.q).f((aisc)((ahcr)ahct).build())).toBuilder();
            final Intent n3 = this.az.n();
            n3.setFlags(67108864);
            n3.putExtra("navigation_endpoint", ((ahbc)((ahcr)ahct2).build()).toByteArray());
            ((fat)this).startActivity(n3);
        }
    }
}

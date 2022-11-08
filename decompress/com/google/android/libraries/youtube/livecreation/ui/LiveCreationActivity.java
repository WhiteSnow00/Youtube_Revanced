// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui;

import android.app.AlertDialog$Builder;
import com.google.android.libraries.youtube.engagementpanel.size.EngagementPanelSizeBehavior;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import java.util.Map;
import com.google.protos.youtube.api.innertube.LiveCreationEndpointOuterClass$LiveCreationEndpoint;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.view.ViewStub;
import android.os.Process;
import android.os.Binder;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import android.view.WindowManager$LayoutParams;
import android.app.AlertDialog;
import android.text.Spanned;
import android.content.DialogInterface$OnShowListener;
import android.text.method.LinkMovementMethod;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Calendar;
import j$.util.Objects;
import android.graphics.Rect;
import android.media.MediaActionSound;
import com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint;
import android.app.Activity;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.widget.Toast;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import android.content.DialogInterface$OnCancelListener;
import android.graphics.Bitmap;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnClickListener;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.Date;
import android.content.res.Configuration;
import com.google.protobuf.MessageLite;
import java.io.Serializable;
import java.util.Arrays;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import android.os.Bundle;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import android.text.TextUtils;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.media.projection.MediaProjectionManager;
import android.view.inputmethod.InputMethodManager;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;
import java.util.concurrent.ScheduledExecutorService;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import java.util.concurrent.Executor;
import android.view.View;
import android.os.Parcel;
import android.hardware.display.DisplayManager$DisplayListener;
import android.view.Choreographer$FrameCallback;
import android.os.Handler;
import java.util.List;
import android.view.SurfaceView;
import android.media.AudioManager;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.livecreation.ui.view.ViewportOverlay;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import android.media.AudioManager$OnAudioFocusChangeListener;

public class LiveCreationActivity extends wnv implements AudioManager$OnAudioFocusChangeListener, wrl, wqz, wqk, wjv, wrn, rly, wqt, wou, woq, wqd, wop, whs, whi, whc, wpa, wrc, wpd, acst, reu, wwu, tnt, vpp, whk, wha, wrq, whq, wht, whe, znj, wgx, zco
{
    private static final PermissionDescriptor a;
    private static final afdu b;
    private static final long c;
    public static final PermissionDescriptor[] d;
    public static final long e;
    public static final wju f;
    public acsm A;
    public osb B;
    public woj C;
    public StreamConfig D;
    public cl E;
    public wra F;
    public wrm G;
    public wql H;
    public wov I;
    public wov J;
    public wor K;
    public wqe L;
    public wqe M;
    public acsu N;
    public ViewportOverlay P;
    public wpb Q;
    public String R;
    public ViewAnimatorHelper S;
    AudioManager T;
    public boolean U;
    public final woe V;
    public zed W;
    public uqs X;
    public boolean Y;
    public wsv Z;
    private wql aA;
    private wrm aB;
    private wrr aC;
    private rlw aD;
    private wow aE;
    private wpe aF;
    private wro aG;
    private wro aH;
    private wqr aI;
    private SurfaceView aJ;
    private acsq aK;
    private String aL;
    private String aM;
    private String aN;
    private boolean aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private int aU;
    private boolean aV;
    private int aW;
    private String aX;
    private String aY;
    private boolean aZ;
    public woi aa;
    boolean ab;
    public boolean ac;
    public boolean ad;
    public final List ae;
    public final Handler af;
    final wod ag;
    public final Runnable ah;
    final Choreographer$FrameCallback ai;
    public acss aj;
    public adno ak;
    public aagm al;
    public addr am;
    public xgc an;
    public tdg ao;
    public aeby ap;
    public auip aq;
    public adcr ar;
    public adcr as;
    public qpt at;
    private DisplayManager$DisplayListener au;
    private tnu av;
    private rlv aw;
    private Parcel ax;
    private wre ay;
    private wrb az;
    private alrx ba;
    private alrx bb;
    private alrx bc;
    private int bd;
    public View g;
    public Handler h;
    public Executor i;
    public tdz j;
    public wom k;
    public wog l;
    public zki m;
    public zkw n;
    public wwv o;
    public req p;
    public rgm q;
    public wjx r;
    public oas s;
    public Choreographer t;
    public DisplayManager u;
    public ScheduledExecutorService v;
    public wvu w;
    public arhr x;
    public uoe y;
    public SharedPreferences z;
    
    static {
        a = new PermissionDescriptor(0, wya.c(43000), wya.c(43001));
        d = new PermissionDescriptor[] { new PermissionDescriptor(1, wya.c(29216), wya.c(29218)), new PermissionDescriptor(2, wya.c(29217), wya.c(29219)) };
        b = afdu.v((Object)"PRE_STREAM_FRAGMENT", (Object)"LIVE_SHARED_MDE_FRAGMENT", (Object)"PARTICIPANT_PRE_JOIN_FRAGMENT", (Object)"PERMISSION_REQUEST_FRAGMENT");
        c = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
        e = TimeUnit.MILLISECONDS.convert(1L, TimeUnit.MINUTES);
        f = (wju)new wny();
    }
    
    public LiveCreationActivity() {
        this.bd = 1;
        this.V = new woe(this, 0);
        this.aa = new woi((bu)this);
        this.ab = false;
        this.ae = new ArrayList();
        this.af = new Handler();
        this.ag = new wod(this, 0);
        this.ah = (Runnable)new wnt(this, 9, (byte[])null);
        this.ai = (Choreographer$FrameCallback)new dyk(this, 3);
    }
    
    private final int bO() {
        int n;
        if (this.as.be()) {
            n = this.ar.aQ();
        }
        else {
            n = this.z.getInt("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
        }
        return n;
    }
    
    private final int bP() {
        int v;
        if ((v = this.D.v) == 0) {
            final Point point = new Point();
            this.getWindowManager().getDefaultDisplay().getRealSize(point);
            final StreamConfig d = this.D;
            v = point.y;
            d.v = v;
        }
        return v;
    }
    
    private final int bQ() {
        int u;
        if ((u = this.D.u) == 0) {
            final Point point = new Point();
            this.getWindowManager().getDefaultDisplay().getRealSize(point);
            final StreamConfig d = this.D;
            u = point.x;
            d.u = u;
        }
        return u;
    }
    
    private final wjd bR() {
        final wqr ai = this.aI;
        if (ai != null) {
            return (wjd)ai.aE;
        }
        return null;
    }
    
    private final void bS(final View view) {
        final String b = this.B();
        if (b != null) {
            tqt.c((Context)this, view, (CharSequence)b);
        }
    }
    
    private final void bT() {
        final int bq = this.bQ();
        final int bp = this.bP();
        RelativeLayout$LayoutParams layoutParams;
        if (((fa)this).getResources().getConfiguration().orientation == 2) {
            final int n = bq / 2;
            final double w = this.D.w;
            final double n2 = n;
            Double.isNaN(n2);
            layoutParams = new RelativeLayout$LayoutParams(n, (int)(n2 / w));
            layoutParams.addRule(15, -1);
        }
        else {
            final int n3 = bp / 2;
            final double w2 = this.D.w;
            final double n4 = n3;
            Double.isNaN(n4);
            layoutParams = new RelativeLayout$LayoutParams((int)(n4 * w2), n3);
            layoutParams.addRule(14, -1);
        }
        this.aJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private final void bU() {
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2130772058);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new wnz(this));
        this.P.startAnimation(loadAnimation);
    }
    
    private final void bV() {
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2130772059);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new woa(this));
        this.P.startAnimation(loadAnimation);
    }
    
    private final void bW() {
        final wrm g = this.G;
        if (g != null && ((br)g).O != null) {
            ((InputMethodManager)this.getSystemService("input_method")).hideSoftInputFromWindow(((br)this.G).O.getWindowToken(), 2);
        }
    }
    
    private final void bX() {
        if (zgv.s((br)this.G)) {
            this.G.aM();
        }
    }
    
    private final void bY() {
        if (this.K != null) {
            final ct i = this.E.i();
            i.n((br)this.K);
            i.d();
            this.K = null;
        }
        if (this.L != null) {
            final ct j = this.E.i();
            j.n((br)this.L);
            j.d();
            this.L = null;
        }
        if (this.I != null) {
            final ct k = this.E.i();
            k.n((br)this.I);
            k.d();
            this.I = null;
        }
        if (this.J != null) {
            final ct l = this.E.i();
            l.n((br)this.J);
            l.d();
            this.J = null;
        }
        if (this.M != null) {
            final ct m = this.E.i();
            m.n((br)this.M);
            m.d();
            this.M = null;
        }
    }
    
    private final void bZ() {
        ((qt)this).startActivityForResult(((MediaProjectionManager)this.getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
    }
    
    public static void bh(final Context context, Uri uri) {
        uri = (Uri)new Intent("android.intent.action.VIEW", uri);
        ((Intent)uri).setPackage("com.android.chrome");
        try {
            context.startActivity((Intent)uri);
        }
        catch (final ActivityNotFoundException ex) {
            context.startActivity(((Intent)uri).setComponent((ComponentName)null));
        }
    }
    
    private final void ca(final String s) {
        tcp.n((aum)this, ((aagm)this.ar.a).c((aexg)new ujo(s, 18), (Executor)afsl.a), (trb)vuq.j, (trb)vuq.k);
    }
    
    private final void cb() {
        final StreamConfig d = this.D;
        if (!d.a) {
            if (!TextUtils.isEmpty((CharSequence)d.c)) {
                final String b = this.D.b();
                if (TextUtils.isEmpty((CharSequence)b)) {
                    trn.b("Failed to save the live stream state.");
                    return;
                }
                if (this.as.be()) {
                    this.ca(b);
                    return;
                }
                this.i.execute((Runnable)new wmi(this, b, 3));
            }
        }
    }
    
    private final void cc(final alrx bc) {
        if (bc != null) {
            this.bc = bc;
            final wro ah = new wro();
            anss anss;
            if ((anss = bc.c) == null) {
                anss = anss.a;
            }
            final agza builder = ((agzi)((agzd)anss).rr((agyr)ConfirmDialogRendererOuterClass.confirmDialogRenderer)).toBuilder();
            builder.copyOnWrite();
            final aiva aiva = (aiva)builder.instance;
            aiva.b |= 0x20;
            aiva.f = "CREATOR_EDUCATION";
            final aiva aiva2 = (aiva)builder.build();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agxl)aiva2).toByteArray());
            ah.ag(bundle);
            this.cm((br)(this.aH = ah), "CREATOR_EDUCATION_FRAGMENT", true);
        }
    }
    
    private final void cd(final amhp amhp, final amgq amgq) {
        this.k.e();
        this.bY();
        if (amhp != null) {
            this.bp(amhp, null);
            final StreamConfig d = this.D;
            if (d.d == null) {
                d.d = new StreamMetadata();
            }
            this.cb();
            return;
        }
        if (amgq != null) {
            this.bA((br)(this.J = wov.r(amgq, (String)null, this.aW, this.ab, this.bO())), "CONFIRM_THUMBNAIL_FRAGMENT");
        }
    }
    
    private final void ce(final alrx ba) {
        if (ba != null) {
            this.ba = ba;
            final wow ae = new wow();
            anss anss;
            if ((anss = ba.c) == null) {
                anss = anss.a;
            }
            final aiva aiva = (aiva)((agzd)anss).rr((agyr)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agxl)aiva).toByteArray());
            ae.ag(bundle);
            this.cm((br)(this.aE = ae), "COOL_OFF_FRAGMENT_NAME", true);
        }
    }
    
    private final void cf(final String c) {
        c.getClass();
        this.D.c = c;
        if (this.Q == null) {
            this.Q = new wpb();
        }
        final wpb q = this.Q;
        q.d = new xgc((Context)this, this.s).r(c);
        if (zgv.s((br)q.c)) {
            q.r();
        }
        (this.aK = new acsq(acsp.d((bu)this), this.o, (List)Arrays.asList(LiveCreationActivity.a), 2132018296, 2132018300, (Runnable)new wnt(this, 7), (Runnable)thr.e, this.A)).a();
    }
    
    private final void cg(final wpc wpc, final String s) {
        this.F();
        final wpe af = new wpe();
        final Bundle bundle = new Bundle();
        bundle.putSerializable("state", (Serializable)wpc);
        bundle.putString("message", s);
        af.ag(bundle);
        this.aF = af;
        final ct i = this.E.i();
        i.w(2131428910, (br)this.aF, "ERROR_STATE_FRAGMENT");
        this.bW();
        i.i = 4099;
        i.d();
        this.D.z = "ERROR_STATE_FRAGMENT";
    }
    
    private final void ch(final amho amho, final String s, final ajsq ajsq) {
        final wre ay = this.ay;
        if (ay != null && ay.aw()) {
            return;
        }
        final wpe af = this.aF;
        if (af != null) {
            final ct i = this.E.i();
            i.m((br)af);
            i.i = 4099;
            i.d();
        }
        final wre ay2 = new wre();
        final Bundle bundle = new Bundle();
        bundle.putString("ARG_ERROR_MESSAGE", s);
        if (ajsq != null) {
            aeda.av(bundle, "ARG_ERROR_MESSAGE_FORMATTED_STRING", (MessageLite)ajsq);
        }
        if (amho != null) {
            aeda.av(bundle, "ARG_ENDSCREEN_RENDERER", (MessageLite)amho);
        }
        ay2.ag(bundle);
        this.ay = ay2;
        final ct j = this.E.i();
        final wqr ai = this.aI;
        if (ai != null) {
            j.n((br)ai);
        }
        j.r(2131431772, (br)this.ay, "POST_STREAM_FRAGMENT");
        j.i = 4099;
        j.t((String)null);
        j.a();
        this.aI = null;
        this.D.z = "POST_STREAM_FRAGMENT";
        this.bU();
        this.Z.e(true);
        if (this.bG()) {
            this.bi(this.ai);
        }
    }
    
    private final void ci(final alrx bb) {
        if (bb != null) {
            this.bb = bb;
            final wro ag = new wro();
            anss anss;
            if ((anss = bb.c) == null) {
                anss = anss.a;
            }
            final aiva aiva = (aiva)((agzd)anss).rr((agyr)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agxl)aiva).toByteArray());
            ag.ag(bundle);
            this.cm((br)(this.aG = ag), "SAFEGUARD_FRAGMENT", true);
        }
    }
    
    private final void cj(final boolean b) {
        this.J = null;
        this.M = null;
        final wrr ac = this.aC;
        if (ac == null) {
            final int bd = this.bd;
            final Bundle bundle = new Bundle();
            if (bd == 0) {
                throw null;
            }
            bundle.putInt("ARG_FILTER_TYPE", bd - 1);
            final wrr ac2 = new wrr();
            ac2.ag(bundle);
            this.aC = ac2;
        }
        else {
            ac.r();
        }
        this.cm((br)this.aC, "SCHEDULED_EVENTS_FRAGMENT_NAME", b);
    }
    
    private final void ck() {
        final Point point = new Point();
        this.getWindowManager().getDefaultDisplay().getRealSize(point);
        final int y = point.y;
        final int n = ((fa)this).getResources().getDimensionPixelSize(2131167132) + ((fa)this).getResources().getDimensionPixelSize(2131167026) + ((fa)this).getResources().getDimensionPixelSize(2131166186);
        final int dimensionPixelSize = ((fa)this).getResources().getDimensionPixelSize(2131166185);
        final int n2 = y / 2 - n - dimensionPixelSize;
        final double w = this.D.w;
        final double n3 = n2;
        Double.isNaN(n3);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)(n3 * w), n2);
        layoutParams.setMargins(0, n, 0, dimensionPixelSize);
        layoutParams.addRule(14, -1);
        this.aJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.bx(false);
    }
    
    private final void cl(final amyo amyo) {
        final boolean bq = tmy.bq((Context)this);
        final rlw b = riy.b(amyo, bq);
        this.aD = b;
        if (bq) {
            final ct i = this.E.i();
            i.s((br)this.aD, "LIVE_ENABLEMENT_FRAGMENT_NAME");
            i.i = 4099;
            i.d();
            this.D.z = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        }
        else {
            this.bA((br)b, "LIVE_ENABLEMENT_FRAGMENT_NAME");
        }
        if (amyo.g.size() > 0) {
            this.E.ab();
            aiva aiva;
            if ((aiva = amyo.g.get(0).b) == null) {
                aiva = aiva.a;
            }
            this.bv(aiva);
        }
    }
    
    private final void cm(final br br, final String z, final boolean b) {
        final br f = this.E.f(this.D.z);
        br.getClass();
        tsx.n(z);
        final ct i = this.E.i();
        if (f != null && f.ar() && !f.equals((Object)br)) {
            if (b) {
                i.n(f);
            }
            else {
                i.m(f);
            }
        }
        if (!br.ar()) {
            i.r(2131431772, br, z);
        }
        else if (br.as()) {
            i.o(br);
        }
        i.i = 4099;
        i.d();
        this.D.z = z;
    }
    
    private final void cn(final Configuration configuration, final View view) {
        if (this.U) {
            this.ck();
            final int n = configuration.uiMode & 0x30;
            if (n != 16) {
                if (n == 32) {
                    view.setBackgroundColor(agx.a((Context)this, 2131102345));
                }
            }
            else {
                view.setBackgroundColor(agx.a((Context)this, 2131102346));
            }
        }
    }
    
    private static boolean co(final Intent intent) {
        return intent.hasExtra("statusCode") && intent.hasExtra("didStream");
    }
    
    private static final boolean cp(final StreamMetadata streamMetadata) {
        if (streamMetadata != null) {
            final Date j = streamMetadata.j;
            if (j != null && j.getTime() > 0L) {
                return true;
            }
        }
        return false;
    }
    
    private final void cq(final String s, final String s2, int n) {
        if (!this.aZ) {
            return;
        }
        final rjs a = rjs.a;
        adkx adkx;
        if (--n != 1) {
            if (n != 2) {
                adkx = adkx.a;
            }
            else {
                adkx = adkx.c;
            }
        }
        else {
            adkx = adkx.b;
        }
        final agza builder = ((agzi)adky.a).createBuilder();
        final String i = tsx.i(s2);
        builder.copyOnWrite();
        final adky adky = (adky)builder.instance;
        adky.b |= 0x1;
        adky.c = i;
        builder.copyOnWrite();
        final adky adky2 = (adky)builder.instance;
        adky2.e = adkx.d;
        adky2.b |= 0x4;
        final adky adky3 = (adky)builder.build();
        final adno ak = this.ak;
        final zkh c = this.m.c();
        final String b = ((adil)ak.b).b();
        afva.w(afva.r((afrx)new adib(ak, s, c, b, adky3, (byte[])null), ak.c), (afsz)new pjg(ak, b, c, 4, (byte[])null), (Executor)afsl.a);
    }
    
    public final asgn A(final altg altg) {
        return asgn.j((asgp)new hte(this, altg, 3));
    }
    
    final String B() {
        final wsv z = this.Z;
        if (z == null) {
            return null;
        }
        final int b = z.m.b;
        String string = "";
        String string2;
        if (b != -1) {
            String s;
            if (b == 1) {
                s = this.aL;
            }
            else {
                s = this.aM;
            }
            string2 = this.getString(2132018204, new Object[] { s });
        }
        else {
            string2 = "";
        }
        if (this.Z.b() > 2) {
            string = this.getString(2132018205, new Object[] { this.Z.m.a });
        }
        return this.getString(2132018323, new Object[] { string2, string });
    }
    
    public final ArrayList C() {
        if (this.y.a.isEmpty()) {
            this.y.g(this.D.B);
        }
        return this.y.a;
    }
    
    public final void D(final View view) {
        this.Z.c();
        this.bS(view);
        final wor k = this.K;
        k.af = this.B();
        if (k.d != null && !TextUtils.isEmpty(k.af)) {
            k.d.setContentDescription(k.af);
        }
    }
    
    public final void E(final boolean b) {
        if (this.as.be()) {
            this.i.execute((Runnable)new wnt(this, 6));
            this.ca("");
            this.bk(-1L);
            if (b) {
                final StreamConfig a = StreamConfig.a(this.ar.aS());
                if (a != null && !TextUtils.isEmpty((CharSequence)a.c)) {
                    this.r.f(a.c, LiveCreationActivity.f);
                }
            }
            return;
        }
        this.i.execute((Runnable)new wof(b, (Context)this, this.r, this.s, this.z));
    }
    
    public final void F() {
        final ct i = this.E.i();
        for (final br br : this.E.j()) {
            if (br != null && br.ar()) {
                i.m(br);
            }
        }
        i.i = 4099;
        i.d();
    }
    
    public final void G(final boolean b) {
        this.Z.e(true);
        this.P.a(null);
        if (b) {
            this.bz();
        }
    }
    
    public final void H() {
        if (this.ac) {
            final int au = this.aU;
            if (au == 0 || au == 2) {
                return;
            }
        }
        if (!zgv.s((br)this.N)) {
            if (!this.as.bb() || uqs.d((Context)this, (List)Arrays.asList(LiveCreationActivity.d))) {
                if (!this.as.bb()) {
                    final PermissionDescriptor[] d = LiveCreationActivity.d;
                    final boolean f = acsm.f((Context)this, d);
                    final boolean f2 = acsm.f((Context)this, (PermissionDescriptor[])this.ae.toArray(new PermissionDescriptor[0]));
                    if (f || (f2 && TextUtils.isEmpty((CharSequence)this.R))) {
                        if (!this.ad) {
                            if (this.N == null) {
                                final acss aj = this.aj;
                                aj.e(d);
                                aj.f = wya.b(29222);
                                aj.g = wya.c(29215);
                                aj.h = wya.c(29221);
                                aj.i = wya.c(29220);
                                aj.b(2132018289);
                                aj.c(2132018291);
                                if (TextUtils.isEmpty((CharSequence)this.R)) {
                                    this.aj.d((PermissionDescriptor[])this.ae.toArray(new PermissionDescriptor[0]));
                                }
                                this.N = (acsu)this.aj.a();
                            }
                            this.N.aK((acst)this);
                            this.bA((br)this.N, "PERMISSION_REQUEST_FRAGMENT");
                            this.ad = true;
                        }
                        return;
                    }
                }
                final zki m = this.m;
                m.getClass();
                m.c().getClass();
                final String d2 = this.m.c().d();
                tsx.n(d2);
                String s;
                if (this.as.be()) {
                    s = this.ar.aS();
                }
                else {
                    s = this.z.getString("SHARED_PREF_STREAM_CONFIG_KEY", (String)null);
                }
                final StreamConfig a = StreamConfig.a(s);
                Label_0475: {
                    if (a == null || d2.equals(a.b)) {
                        long n;
                        if (this.as.be()) {
                            n = this.ar.aR();
                        }
                        else {
                            n = this.z.getLong("SHARED_PREF_LS_TIMESTAMP_KEY", -1L);
                        }
                        if (n != -1L) {
                            if (this.s.c() - n > LiveCreationActivity.c && !this.U) {
                                break Label_0475;
                            }
                        }
                        if (a != null && d2.equals(a.b) && a.d != null) {
                            final int au2 = this.aU;
                            if (au2 == 0 || (this.ac && au2 == 1)) {
                                if (!this.ac) {
                                    final Intent intent = this.getIntent();
                                    if (co(intent)) {
                                        this.D = a;
                                        this.aZ = true;
                                        final int intExtra = intent.getIntExtra("statusCode", 0);
                                        final byte[] byteArrayExtra = intent.getByteArrayExtra("endScreenRenderer");
                                        amho amho = null;
                                        Label_0632: {
                                            Label_0591: {
                                                if (byteArrayExtra != null) {
                                                    try {
                                                        amho = (amho)agzi.parseFrom((agzi)amho.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                                                    }
                                                    catch (final ahab ahab) {
                                                        trn.d("Could not deserialize MobileStreamEndscreenRenderer from intent", (Throwable)ahab);
                                                        break Label_0591;
                                                    }
                                                    break Label_0632;
                                                }
                                            }
                                            amho = null;
                                        }
                                        final String stringExtra = intent.getStringExtra("errorMessage");
                                        final byte[] byteArrayExtra2 = intent.getByteArrayExtra("errorMessageFormatted");
                                        ajsq ajsq = null;
                                        Label_0685: {
                                            Label_0655: {
                                                if (byteArrayExtra2 != null) {
                                                    try {
                                                        ajsq = (ajsq)agzi.parseFrom((agzi)ajsq.a, byteArrayExtra2);
                                                    }
                                                    catch (final ahab ahab2) {
                                                        trn.d("Could not deserialize error message from intent", (Throwable)ahab2);
                                                        break Label_0655;
                                                    }
                                                    break Label_0685;
                                                }
                                            }
                                            ajsq = null;
                                        }
                                        this.ap(intExtra, amho, null, stringExtra, ajsq, intent.getBooleanExtra("didStream", false));
                                        return;
                                    }
                                }
                                this.ac = true;
                                ((AlertDialog$Builder)this.ap.af((Context)this)).setTitle(2132018216).setMessage(2132018214).setPositiveButton(2132018215, (DialogInterface$OnClickListener)new swa(this, a, 5)).setNegativeButton(2132018213, (DialogInterface$OnClickListener)new jik(this, 20)).setOnKeyListener((DialogInterface$OnKeyListener)new gqk(this, 8)).setCancelable(false).show();
                                return;
                            }
                        }
                        final String z = this.D.z;
                        if (TextUtils.isEmpty((CharSequence)z) || LiveCreationActivity.b.contains((Object)z)) {
                            this.bt();
                            return;
                        }
                        if ("CHOOSE_THUMBNAIL_FRAGMENT".equals(z)) {
                            this.bo();
                            return;
                        }
                        if ("COOL_OFF_FRAGMENT_NAME".equals(z)) {
                            this.ce(this.ba);
                            return;
                        }
                        if ("EDIT_THUMBNAIL_FRAGMENT_NAME".equals(z)) {
                            this.cf(this.D.c);
                            return;
                        }
                        if (!"LIVE_ENABLEMENT_FRAGMENT_NAME".equals(z)) {
                            if (!"LIVE_STREAM_FRAGMENT".equals(z) && !"POST_STREAM_FRAGMENT".equals(z)) {
                                if ("SAFEGUARD_FRAGMENT".equals(z)) {
                                    this.ci(this.bb);
                                    return;
                                }
                                if ("CREATOR_EDUCATION_FRAGMENT".equals(z)) {
                                    final alrx bc = this.bc;
                                    bc.getClass();
                                    this.cc(bc);
                                    return;
                                }
                                if (!"INVITE_SCREEN_FRAGMENT".equals(z) && !"SCHEDULED_COSTREAM_FRAGMENT".equals(z)) {
                                    trn.b("Unhandled fragment to resume to - ".concat(String.valueOf(z)));
                                    return;
                                }
                                this.cd(this.D.j, null);
                            }
                        }
                        return;
                    }
                }
                this.E(this.U ^ true);
                this.bt();
                return;
            }
            if (!this.ad) {
                this.runOnUiThread((Runnable)new wnt(this, 4));
            }
        }
    }
    
    public final void I(final upi upi, final String s) {
        final wsv z = this.Z;
        final xpb k = this.y.k();
        final boolean r = this.D.r;
        final wfp l = z.l;
        if (l != null) {
            l.l((Context)z.c, upi, k, r, s);
            return;
        }
        ((Handler)z.q.b).post((Runnable)new ndg(z, upi, k, r, s, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void J(final boolean b) {
        if (b) {
            this.bz();
            return;
        }
        this.bx(true);
    }
    
    public final void K() {
        final wov j = this.J;
        if (j != null) {
            this.bA((br)j, "CONFIRM_THUMBNAIL_FRAGMENT");
            return;
        }
        final wqe l = this.L;
        if (l != null) {
            this.bA((br)l, "INVITE_SCREEN_FRAGMENT");
            return;
        }
        final wqe m = this.M;
        if (m != null) {
            this.bA((br)m, "SCHEDULED_COSTREAM_FRAGMENT");
            return;
        }
        this.bo();
    }
    
    public final void L() {
        if (this.K != null) {
            final ct i = this.E.i();
            i.n((br)this.K);
            i.d();
            this.K = null;
        }
        final wqe l = this.L;
        if (l != null) {
            this.cm((br)l, "INVITE_SCREEN_FRAGMENT", true);
            return;
        }
        final wqe m = this.M;
        if (m != null) {
            this.cm((br)m, "SCHEDULED_COSTREAM_FRAGMENT", true);
            return;
        }
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void M() {
    }
    
    public final void N() {
        final amhp j = this.D.j;
        if (j != null) {
            this.cd(j, null);
        }
    }
    
    public final void O() {
        this.finish();
    }
    
    public final void P(final alrx alrx) {
        if (!this.aS) {
            this.cc(alrx);
        }
    }
    
    public final void Q(final alrx alrx) {
        this.ce(alrx);
    }
    
    public final void R() {
        this.aT = true;
    }
    
    public final void S(final Bitmap bitmap) {
        final wov j = this.J;
        if (j != null) {
            j.aO(bitmap);
        }
        else {
            final wov i = this.I;
            if (i != null) {
                i.aO(bitmap);
            }
            else {
                final wqe l = this.L;
                if (l != null) {
                    l.aL(bitmap);
                }
                else {
                    final wqe m = this.M;
                    if (m != null) {
                        m.aL(bitmap);
                    }
                }
            }
        }
        final wov k = this.J;
        if (k != null) {
            k.aL();
            this.cm((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT", true);
            return;
        }
        final wov i2 = this.I;
        if (i2 != null) {
            i2.aL();
            this.cm((br)this.I, "CHOOSE_THUMBNAIL_FRAGMENT", true);
            return;
        }
        final wqe l2 = this.L;
        if (l2 != null) {
            this.cm((br)l2, "INVITE_SCREEN_FRAGMENT", true);
            return;
        }
        final wqe m2 = this.M;
        if (m2 != null) {
            this.cm((br)m2, "SCHEDULED_COSTREAM_FRAGMENT", true);
            return;
        }
        this.finish();
    }
    
    public final void T(final akne akne) {
        if (this.J != null) {
            this.bA((br)(this.aB = wrm.o(akne, this.aW)), "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
            return;
        }
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void U(final String s) {
        this.cf(s);
    }
    
    public final void V() {
        this.finish();
    }
    
    public final void W(final amgq i) {
        final wov j = this.J;
        j.getClass();
        this.ab = (i.q != j.aX());
        this.cd(null, this.D.i = i);
    }
    
    public final void X(final amhp amhp) {
        this.ab = true;
        this.cd(amhp, null);
    }
    
    public final void Y() {
        this.G = null;
        this.H = null;
        this.aR = true;
        this.aS = true;
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void Z(final amgq i) {
        this.D.i = i;
        wia.b().h = i.q;
    }
    
    public final void a(final dbi dbi) {
        if (!this.U) {
            final StreamConfig d = this.D;
            this.cq(d.c, d.d.a, 2);
        }
    }
    
    public final void aA(final double w) {
        this.D.w = w;
        this.ck();
        this.cb();
    }
    
    public final void aB(final View view) {
        this.Z.c();
        this.bS(view);
        final wra f = this.F;
        if (f != null) {
            f.am = this.B();
            if (f.al != null && !TextUtils.isEmpty(f.am)) {
                f.al.setContentDescription(f.am);
            }
        }
    }
    
    public final void aC() {
        final wrm ab = this.aB;
        if (ab != null && ab.aw()) {
            final wov j = this.J;
            if (j != null) {
                this.J(j.aX());
                this.bA((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT");
                if (this.J.au()) {
                    this.J.aa();
                }
            }
            else if (this.M != null) {
                this.J(false);
                this.bA((br)this.M, "SCHEDULED_COSTREAM_FRAGMENT");
                if (this.M.au()) {
                    this.M.aa();
                }
            }
            return;
        }
        if (TextUtils.isEmpty((CharSequence)this.D.c)) {
            this.finish();
            return;
        }
        if (cp(this.D.d)) {
            this.D.a = true;
            this.E(false);
            this.finish();
            return;
        }
        final woc onCancelListener = new woc(this);
        ((AlertDialog$Builder)this.ap.af((Context)this)).setMessage(2132018209).setPositiveButton(17039370, (DialogInterface$OnClickListener)onCancelListener).setNegativeButton(17039360, (DialogInterface$OnClickListener)onCancelListener).setOnCancelListener((DialogInterface$OnCancelListener)onCancelListener).show();
    }
    
    public final void aD(final StreamMetadata d) {
        final StreamConfig d2 = this.D;
        final StreamMetadata d3 = d2.d;
        if (d3 == null) {
            d2.d = d;
        }
        else {
            final String a = d.a;
            if (a != null) {
                d3.a = a;
            }
            final String b = d.b;
            if (b != null) {
                d3.b = b;
            }
            final Boolean c = d.c;
            if (c != null) {
                d3.c = c;
            }
            final Boolean d4 = d.d;
            if (d4 != null) {
                d3.d = d4;
            }
            final Boolean e = d.e;
            if (e != null) {
                d3.e = e;
            }
            final int l = d.l;
            if (l != 0) {
                d3.l = l;
            }
            final int m = d.m;
            if (m != 0) {
                d3.m = m;
            }
            final Boolean f = d.f;
            if (f != null) {
                d3.f = f;
            }
            final akjp g = d.g;
            if (g != null) {
                d3.g = g;
            }
            final akjq h = d.h;
            if (h != null) {
                d3.h = h;
            }
            final int n = d.n;
            if (n != 0) {
                d3.n = n;
            }
            final Place i = d.i;
            if (i != null) {
                d3.i = i;
            }
            final Date j = d.j;
            if (j != null) {
                d3.j = j;
            }
            final ajub k = d.k;
            if (k != null) {
                d3.k = k;
            }
        }
        this.k.e();
        final wqe l2 = this.L;
        final boolean b2 = true;
        Label_0330: {
            if (l2 != null) {
                final wrm ab = this.aB;
                if (ab != null && !ab.am) {
                    this.ab = true;
                    break Label_0330;
                }
            }
            if (this.I != null) {
                final Boolean f2 = d.f;
                this.ab = ((f2 != null && f2) != this.I.aX() && b2);
            }
        }
        if (this.L != null) {
            final wrm ab2 = this.aB;
            if (ab2 == null || ab2.am) {
                if (this.G != null) {
                    this.bp(this.D.j, null);
                }
                return;
            }
        }
        this.bo();
    }
    
    public final void aE() {
        this.ao.t();
    }
    
    public final void aF(final amyo amyo) {
        this.cl(amyo);
    }
    
    public final void aG(final alrx alrx) {
        if (!this.aR) {
            this.ci(alrx);
        }
    }
    
    public final void aH(final View view) {
        this.Z.c();
        this.bS(view);
        this.G.aO((CharSequence)this.B());
    }
    
    public final void aI(final aiva aiva) {
        this.bv(aiva);
    }
    
    public final void aJ(final akrj akrj) {
        final int n = 0;
        int ct = 0;
        Label_0260: {
            if (akrj == null) {
                ct = n;
            }
            else {
                final Iterator<Object> iterator = akrj.f.iterator();
                while (true) {
                    ct = n;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    aopb aopb;
                    if ((aopb = iterator.next().b) == null) {
                        aopb = aopb.a;
                    }
                    aopc aopc;
                    if ((aopc = aopb.b) == null) {
                        aopc = aopc.a;
                    }
                    anws anws;
                    if ((anws = aopc.c) == null) {
                        anws = anws.a;
                    }
                    if (anws.d.size() == 0) {
                        continue;
                    }
                    final Iterator<Object> iterator2 = anws.d.iterator();
                    while (iterator2.hasNext()) {
                        amfn amfn;
                        if ((amfn = iterator2.next().H) == null) {
                            amfn = amfn.a;
                        }
                        if (amfn.b.size() != 0) {
                            for (final amfo amfo : amfn.b) {
                                if ((amfo.b & 0x100) != 0x0) {
                                    amap amap;
                                    if ((amap = amfo.c) == null) {
                                        amap = amap.a;
                                    }
                                    if (amap.b != 1 || (ct = aqql.ct((int)amap.c)) == 0) {
                                        ct = 1;
                                        break Label_0260;
                                    }
                                    break Label_0260;
                                }
                            }
                        }
                    }
                }
            }
        }
        final StreamConfig d = this.D;
        if (ct == 0) {
            this.cq(d.c, d.d.a, 2);
            return;
        }
        this.cq(d.c, d.d.a, ct);
    }
    
    public final void aK(final amgq amgq) {
        this.cd(null, amgq);
        this.J(amgq.q);
    }
    
    public final void aL() {
        this.finish();
    }
    
    public final void aM() {
        this.ad = false;
        this.h.post((Runnable)new wnt(this, 8));
    }
    
    public final void aN(final amhp j) {
        this.k.e();
        this.D.j = j;
        this.bY();
        this.bA((br)(this.M = wqe.n((String)null, j)), "SCHEDULED_COSTREAM_FRAGMENT");
    }
    
    public final void aO() {
        this.bt();
    }
    
    public final void aP(final boolean b) {
        final wfp l = this.Z.l;
        if (l != null) {
            l.i(b);
        }
    }
    
    public final void aQ() {
        this.k.e();
        final wqe l = this.L;
        Label_0052: {
            if (l != null) {
                final wql aa = this.aA;
                if (aa != null && !aa.al) {
                    this.ab = true;
                    break Label_0052;
                }
            }
            if (this.I != null) {
                this.ab = false;
            }
        }
        if (l != null) {
            final wql aa2 = this.aA;
            if (aa2 == null || aa2.al) {
                if (this.H != null) {
                    this.bp(this.D.j, null);
                }
                return;
            }
        }
        this.bo();
    }
    
    public final void aS(final amgq i) {
        final wov j = this.J;
        j.getClass();
        this.ab = (i.q != j.aX());
        this.cd(null, this.D.i = i);
    }
    
    public final void aT(final amhp amhp) {
        this.ab = true;
        this.cd(amhp, null);
    }
    
    public final void aU(final amgq i) {
        this.D.i = i;
        wia.b().h = i.q;
    }
    
    public final void aV(final amhp j) {
        this.D.j = j;
        wia.b().h = false;
    }
    
    public final void aW(final String s, final aioe l) {
        if (this.isDestroyed()) {
            return;
        }
        wia.b().e = s;
        this.ab = true;
        final StreamConfig d = this.D;
        d.c = s;
        d.l = l;
        this.af.post(this.ah);
    }
    
    public final void aX(final apjz b) {
        this.D.B = b;
    }
    
    public final void aY() {
        this.D.s = true;
        this.cb();
    }
    
    public final void aZ() {
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J.aN();
            return;
        }
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.D.a = true;
        this.E(false);
        final String z = this.D.z;
        this.D = new StreamConfig();
        wia.b().h();
        this.D.z = z;
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void aa() {
        if (this.M != null) {
            this.cj(true);
            return;
        }
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void ab() {
        if (!zgv.s((br)this.L)) {
            return;
        }
        Toast.makeText((Context)this, 2132018239, 0).show();
    }
    
    public final void ac(final akne akne) {
        if (!this.aO) {
            this.bA((br)(this.aB = wrm.o(akne, this.aW)), "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
            return;
        }
        akne.getClass();
        final wql aa = new wql();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_GET_BROADCAST_RESPONSE", (Parcelable)new ParcelableMessageLite((MessageLite)akne));
        aa.ag(bundle);
        this.bA((br)(this.aA = aa), "EDIT_SETTINGS_LIVE_SHARED_MDE_FRAGMENT");
        this.H = null;
    }
    
    public final void ad(final String c) {
        this.cf(this.D.c = c);
    }
    
    public final void ae(final amhp j) {
        this.D.j = j;
        wia.b().h = false;
    }
    
    public final void af(final String c) {
        this.D.c = c;
        if (this.K == null) {
            this.K = wor.a(c, this.aW);
        }
        this.bA((br)this.K, "CAPTURE_THUMBNAIL_FRAGMENT");
    }
    
    public final void ag(final int a, final String x, final String y, final amhy k) {
        final StreamConfig d = this.D;
        d.A = a;
        d.x = x;
        d.y = y;
        d.k = k;
    }
    
    public final void ah() {
        this.ao.t();
    }
    
    public final void ai() {
        final wql aa = this.aA;
        if (aa != null && aa.aw()) {
            final woi aa2 = this.aa;
            if (aa2.a > 0) {
                ((adcq)aa2).b();
                return;
            }
            final wov j = this.J;
            if (j != null) {
                this.J(j.aX());
                this.bA((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT");
                if (this.J.au()) {
                    this.J.aa();
                }
            }
            else if (this.M != null) {
                this.J(false);
                this.bA((br)this.M, "SCHEDULED_COSTREAM_FRAGMENT");
                if (this.M.au()) {
                    this.M.aa();
                }
            }
            else {
                final wqe l = this.L;
                if (l != null) {
                    this.bA((br)l, "INVITE_SCREEN_FRAGMENT");
                    if (this.L.au()) {
                        this.L.aa();
                    }
                }
            }
        }
        else {
            final woi aa3 = this.aa;
            if (aa3.a > 0) {
                ((adcq)aa3).b();
                return;
            }
            this.finish();
        }
    }
    
    public final void aj(final View view) {
        this.Z.c();
        this.bS(view);
        final String b = this.B();
        final wql h = this.H;
        if (h != null && b != null) {
            h.aK((CharSequence)b);
        }
    }
    
    public final void ak(final alrx alrx) {
        if (!this.aS) {
            this.cc(alrx);
        }
    }
    
    public final void al(final alrx alrx) {
        this.ce(alrx);
    }
    
    public final void am(final alrx alrx) {
        if (!this.aR) {
            this.ci(alrx);
        }
    }
    
    public final void an(final amyo amyo) {
        this.cl(amyo);
    }
    
    public final void ao(final aiva aiva) {
        this.bv(aiva);
    }
    
    public final void ap(int ct, final amho amho, final ajkj ajkj, final String s, final ajsq ajsq, final boolean b) {
        this.setRequestedOrientation(-1);
        final ViewGroup$LayoutParams layoutParams = this.aJ.getLayoutParams();
        if (layoutParams.height != -1 && layoutParams.width != -1) {
            tmy.aF((View)this.aJ, tmy.aE(-1, -1), (Class)ViewGroup$LayoutParams.class);
        }
        this.bF("off");
        if (ct != 0 && ct != 26 && ct != 31) {
            if (ct != 33) {
                if (ct != 21) {
                    if (ct != 22) {
                        String string = s;
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            string = this.getString(2132018276);
                        }
                        if (b) {
                            this.ch(null, string, ajsq);
                        }
                        else {
                            this.cg(wpc.d, string);
                        }
                    }
                    else {
                        final wrm g = this.G;
                        if (g != null) {
                            this.bA((br)g, "PRE_STREAM_FRAGMENT");
                        }
                        else {
                            final wql h = this.H;
                            if (h != null) {
                                this.bA((br)h, "LIVE_SHARED_MDE_FRAGMENT");
                            }
                        }
                        ((AlertDialog$Builder)this.ap.af((Context)this)).setTitle(2132018276).setMessage(2132018274).setPositiveButton(2132018275, (DialogInterface$OnClickListener)new jik(this, 18)).setNegativeButton(2132018277, (DialogInterface$OnClickListener)new jik(this, 19)).setCancelable(false).show();
                    }
                }
                else {
                    this.cg(wpc.d, this.getString(2132018245));
                }
            }
            else {
                this.k.f();
                this.ch(amho, s, ajsq);
            }
        }
        else if (b) {
            this.k.f();
            if (ct == 26 && amho == null && ajkj == null && s == null && ajsq == null) {
                this.finish();
                return;
            }
            if (this.U) {
                if (ajkj != null) {
                    this.bA((br)(this.az = wrb.r(ajkj)), "POST_COSTREAM_FRAGMENT");
                }
                else {
                    this.finish();
                }
            }
            else {
                final akak f = ((arud)this.as.a).f();
                apgj apgj;
                if (f != null) {
                    if ((apgj = f.h) == null) {
                        apgj = apgj.a;
                    }
                }
                else {
                    apgj = apgj.a;
                }
                if (apgj.c) {
                    if (amho == null) {
                        final agza builder = ((agzi)akri.a).createBuilder();
                        final String c = this.D.c;
                        builder.copyOnWrite();
                        final akri akri = (akri)builder.instance;
                        c.getClass();
                        akri.b |= 0x2;
                        akri.d = c;
                        tcp.n((aum)this, this.am.e(builder, this.v, null), (trb)new wnw(this, 3), (trb)new wnw(this, 4));
                    }
                    else {
                        final StreamConfig d = this.D;
                        final String c2 = d.c;
                        final String a = d.d.a;
                        if ((ct = aqql.ct(amho.f)) == 0) {
                            ct = 1;
                        }
                        this.cq(c2, a, ct);
                    }
                }
                this.ch(amho, s, ajsq);
            }
        }
        else {
            this.finish();
            if (this.D.d != null && Boolean.TRUE.equals(this.D.d.f)) {
                this.startActivity(this.getPackageManager().getLaunchIntentForPackage(this.getPackageName()));
            }
        }
        this.af.removeCallbacks(this.ah);
        this.D.a = true;
        this.E(false);
    }
    
    public final void aq() {
        this.Z.e(true);
        this.bU();
    }
    
    public final void ar(final boolean q) {
        this.D.q = q;
    }
    
    public final void as() {
        this.Z.e(false);
    }
    
    public final void at(final boolean b) {
        this.Z.e(b);
        if (b) {
            this.bU();
            return;
        }
        this.bV();
    }
    
    public final void au() {
        this.Z.e(false);
        this.bV();
        final tnu av = this.av;
        if (av != null) {
            av.enable();
        }
        if (zgv.t((Activity)this)) {
            this.Z.f(this.getWindowManager().getDefaultDisplay().getRotation());
        }
    }
    
    public final void av(final long n) {
        final StreamConfig d = this.D;
        d.n = n;
        if (d.r) {
            final int n2 = this.bO() + 1;
            if (n2 <= this.as.aX()) {
                if (this.as.be()) {
                    tcp.n((aum)this, ((aagm)this.ar.a).c((aexg)new fqk(n2, 10), (Executor)afsl.a), (trb)vuq.d, (trb)vuq.e);
                }
                else {
                    this.i.execute((Runnable)new wgp(this, n2, 6));
                }
            }
        }
        this.cb();
    }
    
    public final void aw(final View view) {
        this.Z.c();
        this.bS(view);
    }
    
    public final void ax(wex h) {
        final wsv z = this.Z;
        if (z.h == null) {
            h.getClass();
            z.h = h;
            h = z.h;
            final boolean b = z.b;
            boolean a = false;
            if (!b) {
                a = a;
                if (z.n) {
                    a = true;
                }
            }
            h.a = a;
            z.q.y((wfd)h);
            return;
        }
        trn.m("CameraStreamViewManager", "Pipeline render target already set.");
    }
    
    public final void ay(aioe a) {
        aioe f = null;
        Label_0034: {
            if (a != null) {
                f = a;
                if (!((agzd)a).rs((agyr)VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint)) {
                    break Label_0034;
                }
            }
            a = vba.a("FEmy_videos");
            f = this.o.f(a);
        }
        vaw.a((vax)this.l, f);
        this.finish();
    }
    
    public final void az() {
        this.finish();
    }
    
    public final void b() {
        this.finish();
    }
    
    public final void bA(final br br, final String s) {
        this.cm(br, s, false);
    }
    
    public final void bB() {
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J = null;
            this.cj(true);
            return;
        }
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void bC() {
        this.P.a(null);
        final wom k = this.k;
        k.b = true;
        k.g();
    }
    
    public final void bD(final View view) {
        this.Z.c();
        this.bS(view);
        final wov i = this.I;
        if (i != null && i.aw()) {
            this.I.aQ(this.B());
            return;
        }
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J.aQ(this.B());
        }
    }
    
    public final void bE() {
        if (this.Y && !zgv.t((Activity)this)) {
            return;
        }
        this.Z.f(this.getWindowManager().getDefaultDisplay().getRotation());
        if (TextUtils.isEmpty((CharSequence)this.D.x) && TextUtils.isEmpty((CharSequence)this.D.y)) {
            final int orientation = ((fa)this).getResources().getConfiguration().orientation;
            final StreamConfig d = this.D;
            boolean r = true;
            if (orientation != 1) {
                r = false;
            }
            d.r = r;
        }
    }
    
    public final boolean bF(final String s) {
        final wsv z = this.Z;
        szc.f();
        return z.e.l(s);
    }
    
    public final boolean bG() {
        return this.k.d && this.aZ;
    }
    
    public final boolean bH(int n, int integer, int n2, final woo woo) {
        if (!this.Z.e.b) {
            ((MediaActionSound)((arhr)((ujf)this.x.a()).c).a()).play(0);
        }
        final wsv z = this.Z;
        woo.getClass();
        final wnx wnx = new wnx(woo);
        szc.f();
        final View decorView = z.c.getWindow().getDecorView();
        final Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        final int d = z.e.d;
        final int n3 = rect.width() * d / rect.height();
        final boolean b = !z.b && z.n;
        n = (int)(n * (long)n3 / rect.width());
        final int n4 = (int)(integer * (long)d / rect.height());
        final Activity c = z.c;
        c.getClass();
        agot.u(n2 > 0);
        agot.u(d > 0);
        agot.u(rect.height() > 0);
        final int integer2 = ((Context)c).getResources().getInteger(2131492965);
        integer = ((Context)c).getResources().getInteger(2131492964);
        n2 = Math.round(n2 * (float)d / rect.height()) / integer;
        final Point point = new Point(integer2 * n2, integer * n2);
        if (point.x >= 4 && point.y >= 4 && point.x + n <= n3 && point.y + n4 <= d) {
            z.k.f(n3, d, (wed)new wsu(z, b, n, n4, point, (wed)wnx));
            return true;
        }
        return false;
    }
    
    public final boolean bI() {
        final wsv z = this.Z;
        szc.f();
        return z.e.k("torch");
    }
    
    public final void bJ(final float n) {
        final wsv z = this.Z;
        szc.f();
        z.e.m(n);
    }
    
    public final void bK(final int bd) {
        this.bd = bd;
        this.cj(false);
    }
    
    public final agza bL(final StreamMetadata streamMetadata) {
        final StreamConfig d = this.D;
        if (d.c == null) {
            return null;
        }
        final StreamMetadata d2 = d.d;
        String a = streamMetadata.a;
        String b = streamMetadata.b;
        int n = streamMetadata.n;
        final Place i = streamMetadata.i;
        Boolean c = streamMetadata.c;
        Boolean d3 = streamMetadata.d;
        Boolean e = streamMetadata.e;
        int l = streamMetadata.l;
        final Boolean f = streamMetadata.f;
        final akjp g = streamMetadata.g;
        Date j = streamMetadata.j;
        final ajub k = streamMetadata.k;
        final wjl a2 = wjl.a;
        final boolean equals = Objects.equals((Object)a, (Object)d2.a);
        final int n2 = 1;
        if (equals) {
            a = null;
        }
        final boolean equals2 = Objects.equals((Object)b, (Object)d2.b);
        if (equals2) {
            b = null;
        }
        final int n3 = d2.n;
        int n4;
        if (n != n3) {
            n4 = 0;
        }
        else {
            n4 = 1;
        }
        int n5 = (n4 ^ 0x1) | (((equals2 ^ true) | (equals ^ true)) ? 1 : 0);
        if (n == n3) {
            n = 0;
        }
        wjl wjl2;
        if (!Objects.equals((Object)i, (Object)d2.i)) {
            wjl wjl;
            if (i == null) {
                wjl = wjl.b;
            }
            else {
                wjl = wjl.a((Object)i);
            }
            n5 = 1;
            wjl2 = wjl;
        }
        else {
            wjl2 = a2;
        }
        final boolean equals3 = Objects.equals((Object)c, (Object)d2.c);
        Boolean b2;
        if (!equals3) {
            b2 = c;
        }
        else {
            b2 = null;
        }
        final boolean equals4 = Objects.equals((Object)d3, (Object)d2.d);
        if (equals4) {
            d3 = null;
        }
        if (equals4) {
            c = b2;
        }
        final int m = d2.l;
        int n6;
        if (l != m) {
            n6 = 0;
        }
        else {
            n6 = 1;
        }
        if (l == m) {
            l = 0;
        }
        final boolean equals5 = Objects.equals((Object)e, (Object)d2.e);
        if (equals5) {
            e = null;
        }
        final boolean equals6 = Objects.equals((Object)f, (Object)d2.f);
        final boolean b3 = equals6 ^ true;
        int n7 = ((equals4 ^ true) ? 1 : 0) | (((equals3 ^ true) ? 1 : 0) | n5) | (n6 ^ 0x1) | ((equals5 ^ true) ? 1 : 0) | (b3 ? 1 : 0);
        Boolean b4;
        if (!equals6) {
            b4 = f;
        }
        else {
            b4 = null;
        }
        wjl wjl3;
        if (!b3 && Objects.equals((Object)k, (Object)d2.k)) {
            wjl3 = a2;
        }
        else {
            if (f && k != null && (k.b & 0x4) != 0x0) {
                wjl3 = wjl.a((Object)k.e);
            }
            else {
                wjl3 = wjl.b;
            }
            n7 = 1;
        }
        akjp akjp;
        akjq akjq2;
        if (g != null && !Objects.equals((Object)g, (Object)d2.g)) {
            final akjp g2 = d2.g;
            final agza builder = ((agzi)akjq.a).createBuilder();
            if (g2 == null || g.c != g2.c) {
                builder.copyOnWrite();
                akjq.a((akjq)builder.instance);
            }
            if ((g.b & 0x10) != 0x0 && (g2 == null || !TextUtils.equals((CharSequence)g.f, (CharSequence)g2.f))) {
                builder.copyOnWrite();
                akjq.d((akjq)builder.instance);
            }
            else if ((g.b & 0x8) != 0x0 && (g2 == null || g.e != g2.e)) {
                builder.copyOnWrite();
                akjq.c((akjq)builder.instance);
            }
            if ((g.b & 0x20) != 0x0 && (g2 == null || g.g != g2.g)) {
                builder.copyOnWrite();
                akjq.e((akjq)builder.instance);
            }
            if ((g.b & 0x40) != 0x0 && (g2 == null || !TextUtils.equals((CharSequence)g.h, (CharSequence)g2.h))) {
                builder.copyOnWrite();
                akjq.f((akjq)builder.instance);
            }
            if (g2 == null || g.d != g2.d) {
                builder.copyOnWrite();
                akjq.b((akjq)builder.instance);
            }
            final akjq akjq = (akjq)builder.build();
            akjp = g;
            n7 = 1;
            akjq2 = akjq;
        }
        else {
            akjp = null;
            akjq2 = null;
        }
        final boolean b5 = j == null;
        final Date j2 = d2.j;
        Label_0949: {
            Label_0945: {
                if (!(b5 ^ j2 == null)) {
                    if (j != null) {
                        final Calendar instance = Calendar.getInstance();
                        instance.setTime(j);
                        final Calendar instance2 = Calendar.getInstance();
                        instance2.setTime(j2);
                        if (instance == null || instance2 == null) {
                            throw new IllegalArgumentException("The date must not be null");
                        }
                        if (instance.get(0) != instance2.get(0) || instance.get(1) != instance2.get(1) || instance.get(6) != instance2.get(6)) {
                            break Label_0945;
                        }
                    }
                    j = null;
                    break Label_0949;
                }
            }
            n7 = n2;
        }
        if (n7 != 0) {
            return this.r.n(this.D.c, a, b, c, d3, e, b4, akjp, akjq2, n, l, wjl2, j, wjl3, (byte[])null);
        }
        return null;
    }
    
    public final void bM() {
        this.bd = 3;
        this.cj(false);
    }
    
    public final void bN(final float n, final float n2, final xpb xpb) {
        final wsv z = this.Z;
        szc.f();
        z.e.n(n, n2, z.m.c, xpb);
    }
    
    public final void ba(final amhy k, final String x, final String y) {
        final StreamConfig d = this.D;
        d.c = k.i;
        d.y = y;
        d.x = x;
        d.k = k;
        this.bT();
        this.by();
    }
    
    public final void bb() {
        this.bT();
    }
    
    public final void bc(final int g) {
        final wov i = this.I;
        if (i != null && i.aw()) {
            this.D.g = g;
            this.cb();
        }
    }
    
    public final void bd() {
        this.bz();
    }
    
    public final void be() {
        this.bz();
    }
    
    public final void bf(final String s, final aioe l) {
        if (this.isDestroyed()) {
            return;
        }
        wia.b().e = s;
        this.ab = true;
        final StreamConfig d = this.D;
        d.c = s;
        d.l = l;
        this.cb();
        this.af.post(this.ah);
    }
    
    public final void bg(final apjz b) {
        this.D.B = b;
    }
    
    public final void bi(final Choreographer$FrameCallback choreographer$FrameCallback) {
        this.t.postFrameCallback(choreographer$FrameCallback);
    }
    
    public final void bj(final int n) {
        if (zgv.v((Context)this)) {
            this.bZ();
            return;
        }
        if (n > 0) {
            new Handler().postDelayed((Runnable)new wgp(this, n, 7), 200L);
            return;
        }
        tmy.x((Context)this, 2132018244, 1);
        this.finish();
    }
    
    public final void bk(final long n) {
        tcp.n((aum)this, ((aagm)this.ar.a).c((aexg)new fmp(n, 10), (Executor)afsl.a), (trb)vuq.f, (trb)vuq.g);
    }
    
    public final void bl(final req req) {
        req.i((reu)this);
    }
    
    public final void bm() {
        tcp.o((aum)this, ((aagm)this.ar.a).c((aexg)vdg.t, (Executor)afsl.a), (trb)vuq.h, (trb)vuq.i);
    }
    
    public final void bn(final wia wia, final StreamConfig streamConfig) {
        wia.h();
        if (streamConfig != null) {
            if (!streamConfig.a) {
                wia.e = streamConfig.c;
                wia.f = this.as.bf();
                wia.g = cp(streamConfig.d);
                if (TextUtils.isEmpty((CharSequence)streamConfig.x) && TextUtils.isEmpty((CharSequence)streamConfig.y)) {
                    return;
                }
                int k;
                if (!streamConfig.r) {
                    k = 2;
                }
                else {
                    k = 4;
                }
                wia.k = k;
            }
        }
    }
    
    public final void bo() {
        this.bY();
        final StreamConfig d = this.D;
        if (d.j != null) {
            this.bA((br)(this.K = wor.a(d.c, this.aW)), "CAPTURE_THUMBNAIL_FRAGMENT");
        }
        else if (d.i != null) {
            final boolean b = true;
            boolean b2 = false;
            Label_0083: {
                if (d != null) {
                    final StreamMetadata d2 = d.d;
                    if (d2 != null && !TextUtils.isEmpty((CharSequence)d2.a)) {
                        b2 = true;
                        break Label_0083;
                    }
                }
                b2 = false;
            }
            final StreamConfig d3 = this.D;
            boolean b3 = false;
            Label_0138: {
                if (d3 != null) {
                    final amgq i = d3.i;
                    if (i != null) {
                        ajsq ajsq;
                        if ((ajsq = i.m) == null) {
                            ajsq = ajsq.a;
                        }
                        if (!TextUtils.isEmpty((CharSequence)abyh.b(ajsq))) {
                            b3 = true;
                            break Label_0138;
                        }
                    }
                }
                b3 = false;
            }
            boolean b4 = b;
            if (!b2) {
                b4 = (b3 && b);
            }
            agot.u(b4);
            final StreamConfig d4 = this.D;
            this.bA((br)(this.I = wov.r(d4.i, d4.c, this.aW, this.ab, this.bO())), "CHOOSE_THUMBNAIL_FRAGMENT");
            this.I.aQ(this.B());
        }
        this.ab = false;
        final StreamConfig d5 = this.D;
        if (d5 != null) {
            final amgq j = d5.i;
            if (j != null && (j.b & 0x80000) != 0x0) {
                this.J(j.q);
            }
        }
    }
    
    public final void bp(final amhp j, final aioe aioe) {
        boolean b = true;
        if (j == null) {
            b = (aioe != null && b);
        }
        agot.D(b);
        if (j != null) {
            final StreamConfig d = this.D;
            d.j = j;
            this.L = wqe.n(d.c, j);
        }
        else if (aioe != null) {
            final String c = this.D.c;
            final wqe l = new wqe();
            final Bundle bundle = new Bundle();
            aeda.av(bundle, "ARG_BROADCAST_CREATED_ENDPOINT", (MessageLite)aioe);
            if (c != null) {
                bundle.putString("ARG_VIDEO_ID", c);
            }
            l.ag(bundle);
            this.L = l;
        }
        this.bA((br)this.L, "INVITE_SCREEN_FRAGMENT");
    }
    
    public final void bq() {
        this.bx(false);
        final String d = this.m.c().d();
        this.D.b = d;
        if (this.H == null) {
            final String an = this.aN;
            final wql h = new wql();
            final Bundle bundle = new Bundle();
            if (an != null) {
                bundle.putString("ARG_SERIALIZED_GET_BROADCAST_SETUP_PARAMS", an);
            }
            h.ag(bundle);
            this.H = h;
            this.aY = d;
        }
        if (!Objects.equals((Object)this.aY, (Object)d)) {
            this.aY = d;
            final wql h2 = this.H;
            if (h2 != null && zgv.s((br)h2)) {
                h2.aM();
                h2.q(5);
            }
        }
        else if (this.H.au()) {
            this.H.r();
            this.H.aN();
            this.J(false);
        }
        this.bA((br)this.H, "LIVE_SHARED_MDE_FRAGMENT");
        this.H.aK((CharSequence)this.B());
    }
    
    public final void br() {
        ((fa)this).findViewById(2131431791).setVisibility(0);
        ((fa)this).findViewById(2131432378).setVisibility(0);
        ((fa)this).findViewById(2131431772).setVisibility(0);
        ((fa)this).findViewById(2131429499).setVisibility(0);
    }
    
    public final void bs() {
        this.D.b = this.m.c().d();
        this.P.setVisibility(8);
        final wra f = this.F;
        if (f == null) {
            final String r = this.R;
            final String c = this.D.c;
            final wra f2 = new wra();
            final Bundle bundle = new Bundle();
            bundle.putString("ARG_SERIALIZED_PARAMS", r);
            if (c != null) {
                bundle.putString("ARG_VIDEO_ID", c);
            }
            f2.ag(bundle);
            this.F = f2;
        }
        else if (!f.ap.isEmpty()) {
            f.an.removeAllViews();
            f.as = true;
            f.ao = (vdo)f.ag.a(f.ah.c());
            f.p(f.ap, 5);
        }
        this.ck();
        this.bA((br)this.F, "PARTICIPANT_PRE_JOIN_FRAGMENT");
    }
    
    public final void bt() {
        if (!TextUtils.isEmpty((CharSequence)this.R)) {
            this.bs();
            return;
        }
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void bu() {
        final String d = this.m.c().d();
        final StreamConfig d2 = this.D;
        d2.b = d;
        if (this.G == null) {
            if (TextUtils.isEmpty((CharSequence)d2.c)) {
                final Intent intent = this.getIntent();
                boolean equals = false;
                String s = null;
                String string = null;
                String s2;
                String s3;
                if (intent != null) {
                    final String stringExtra = this.getIntent().getStringExtra("android.intent.extra.SUBJECT");
                    final String stringExtra2 = this.getIntent().getStringExtra("GAME_TITLE");
                    if (stringExtra2 != null) {
                        string = this.getString(2132018268, new Object[] { stringExtra2 });
                    }
                    final String stringExtra3 = this.getIntent().getStringExtra("GAME_PACKAGE_NAME");
                    this.aQ = "SCREEN".equals(this.getIntent().getStringExtra("CAPTURE_MODE"));
                    s2 = stringExtra;
                    s = string;
                    s3 = stringExtra3;
                    if (this.getIntent().getAction() != null) {
                        equals = this.getIntent().getAction().equals("com.google.android.youtube.intent.action.CREATE_LIVE_STREAM");
                        s2 = stringExtra;
                        s = string;
                        s3 = stringExtra3;
                    }
                }
                else {
                    s2 = (s3 = null);
                }
                final int aw = this.aW;
                final String an = this.aN;
                final boolean aq = this.aQ;
                final wrm g = new wrm();
                final Bundle bundle = new Bundle();
                bundle.putInt("ARG_CAMERA_COUNT", aw);
                if (s != null) {
                    bundle.putString("ARG_TITLE", s);
                }
                if (s2 != null) {
                    bundle.putString("ARG_DESCRIPTION", s2);
                }
                if (s3 != null) {
                    bundle.putString("ARG_GAME_PACKAGE_NAME", s3);
                }
                bundle.putBoolean("ARG_IS_SCREENCAST", aq);
                bundle.putBoolean("ARG_IS_LAUNCHED_FROM_INTENT", equals);
                if (an != null) {
                    bundle.putString("ARG_SERIALIZED_GET_BROADCAST_SETUP_PARAMS", an);
                }
                g.ag(bundle);
                this.G = g;
            }
            else {
                final StreamConfig d3 = this.D;
                final StreamMetadata d4 = d3.d;
                final String a = d4.a;
                final String b = d4.b;
                final int n = d4.n;
                final int l = d4.l;
                final Place i = d4.i;
                final Boolean c = d4.c;
                final Boolean d5 = d4.d;
                final Boolean e = d4.e;
                final Boolean f = d4.f;
                final akjp g2 = d4.g;
                final int aw2 = this.aW;
                final aioe j = d3.l;
                final Date k = d4.j;
                final ajub m = d4.k;
                final wrm g3 = new wrm();
                final Bundle bundle2 = new Bundle();
                if (a != null) {
                    bundle2.putString("ARG_TITLE", a);
                }
                if (b != null) {
                    bundle2.putString("ARG_DESCRIPTION", b);
                }
                if (n != 0) {
                    bundle2.putInt("ARG_STREAM_PRIVACY", n - 1);
                }
                if (l != 0) {
                    bundle2.putInt("ARG_AUDIENCE_TYPE", l - 1);
                }
                if (i != null) {
                    bundle2.putParcelable("ARG_PLACE", (Parcelable)i);
                }
                if (c != null) {
                    bundle2.putBoolean("ARG_ENABLE_CHAT", (boolean)c);
                }
                if (d5 != null) {
                    bundle2.putBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", (boolean)d5);
                }
                if (e != null) {
                    bundle2.putBoolean("ARG_ENABLE_AGE_RESTRICTION", (boolean)e);
                }
                if (f != null) {
                    bundle2.putBoolean("ARG_IS_SCREENCAST", (boolean)f);
                }
                if (g2 != null) {
                    bundle2.putParcelable("ARG_MONETIZATION_METADATA", (Parcelable)new ParcelableMessageLite((MessageLite)g2));
                }
                bundle2.putInt("ARG_CAMERA_COUNT", aw2);
                if (j != null) {
                    bundle2.putParcelable("ARG_BROADCAST_CREATED_ENDPOINT", (Parcelable)new ParcelableMessageLite((MessageLite)j));
                }
                if (k != null) {
                    bundle2.putSerializable("ARG_SCHEDULED_DATE", (Serializable)k);
                }
                if (m != null) {
                    bundle2.putParcelable("ARG_GAME_TITLE", (Parcelable)new ParcelableMessageLite((MessageLite)m));
                }
                g3.ag(bundle2);
                this.G = g3;
            }
            this.aX = d;
        }
        if (!Objects.equals((Object)this.aX, (Object)d)) {
            this.aX = d;
            this.bX();
        }
        else if (this.G.au()) {
            this.G.r();
            this.J(this.G.aU());
        }
        this.bA((br)this.G, "PRE_STREAM_FRAGMENT");
        this.G.aO((CharSequence)this.B());
    }
    
    final void bv(aiva aiva) {
        final rlv aw = new rlv((Context)this, aiva, this.ap, (vax)this.l, new xpb(this), (Object)this, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.aw = aw;
        final abyy af = aw.j.af(aw.a);
        aiva = aw.b;
        ajsq ajsq;
        if ((aiva.b & 0x1) != 0x0) {
            if ((ajsq = aiva.c) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        ((AlertDialog$Builder)af).setTitle((CharSequence)abyh.b(ajsq));
        aibc aibc;
        if ((aibc = aw.b.i) == null) {
            aibc = aibc.a;
        }
        Spanned spanned;
        if ((aibc.b & 0x1) != 0x0) {
            aibc aibc2;
            if ((aibc2 = aw.b.i) == null) {
                aibc2 = aibc.a;
            }
            aibb aibb;
            if ((aibb = aibc2.c) == null) {
                aibb = aibb.a;
            }
            ajsq ajsq2;
            if ((ajsq2 = aibb.i) == null) {
                ajsq2 = ajsq.a;
            }
            spanned = abyh.b(ajsq2);
        }
        else {
            aiva = aw.b;
            ajsq ajsq3;
            if ((aiva.b & 0x2000000) != 0x0) {
                if ((ajsq3 = aiva.r) == null) {
                    ajsq3 = ajsq.a;
                }
            }
            else {
                ajsq3 = null;
            }
            spanned = abyh.b(ajsq3);
        }
        final aiva b = aw.b;
        final aibc h = b.h;
        aibc a;
        if (h == null) {
            a = aibc.a;
        }
        else {
            a = h;
        }
        Spanned spanned2;
        if ((a.b & 0x1) != 0x0) {
            aibc a2;
            if ((a2 = h) == null) {
                a2 = aibc.a;
            }
            aibb aibb2;
            if ((aibb2 = a2.c) == null) {
                aibb2 = aibb.a;
            }
            ajsq ajsq4;
            if ((ajsq4 = aibb2.i) == null) {
                ajsq4 = ajsq.a;
            }
            spanned2 = abyh.b(ajsq4);
        }
        else {
            ajsq ajsq5;
            if ((b.b & 0x1000000) != 0x0) {
                if ((ajsq5 = b.q) == null) {
                    ajsq5 = ajsq.a;
                }
            }
            else {
                ajsq5 = null;
            }
            spanned2 = abyh.b(ajsq5);
        }
        ((AlertDialog$Builder)af).setPositiveButton((CharSequence)spanned2, (DialogInterface$OnClickListener)null);
        ((AlertDialog$Builder)af).setNegativeButton((CharSequence)spanned, (DialogInterface$OnClickListener)null);
        final View inflate = ((LayoutInflater)aw.a.getSystemService("layout_inflater")).inflate(2131625692, (ViewGroup)null);
        aw.f = (YouTubeTextView)inflate.findViewById(2131429843);
        aw.e = (ContentLoadingProgressBar)inflate.findViewById(2131430651);
        aw.f.setText(aaiy.u(aw.b, aw.c));
        ((AlertDialog$Builder)af).setView(inflate);
        aw.f.setMovementMethod(LinkMovementMethod.getInstance());
        (aw.d = ((AlertDialog$Builder)af).create()).setOnShowListener((DialogInterface$OnShowListener)new eyh(aw, 18));
        final AlertDialog d = aw.d;
        int width = 0;
        d.setCancelable(false);
        aw.d.setCanceledOnTouchOutside(false);
        aw.d.show();
        int dimensionPixelSize;
        if (tmy.bq(aw.a)) {
            dimensionPixelSize = ((rq)aw.a).a().getDimensionPixelSize(2131165445);
            width = ((rq)aw.a).a().getDimensionPixelSize(2131165446);
        }
        else {
            dimensionPixelSize = (int)(Math.min(tmy.bd(aw.a), tmy.bb(aw.a)) * ((rq)aw.a).a().getFraction(2131361798, 1, 1));
        }
        final WindowManager$LayoutParams attributes = aw.d.getWindow().getAttributes();
        attributes.height = dimensionPixelSize;
        if (width == 0) {
            width = attributes.width;
        }
        attributes.width = width;
        aw.d.getWindow().setAttributes(attributes);
        this.o.l((wxz)new wws(wya.c(31777)));
        this.o.l((wxz)new wws(wya.c(31778)));
    }
    
    public final void bw(final View view) {
        this.bx(true);
        this.Z.e(false);
        this.P.a(view);
    }
    
    public final void bx(final boolean b) {
        if (!this.aV) {
            Label_0053: {
                if (this.aU != 0) {
                    final Parcel ax = this.ax;
                    if (ax != null) {
                        this.Z.d((CameraStreamViewManager$CameraModelData)CameraStreamViewManager$CameraModelData.CREATOR.createFromParcel(ax));
                        break Label_0053;
                    }
                }
                this.Z.d((CameraStreamViewManager$CameraModelData)null);
            }
            final wsv z = this.Z;
            szc.f();
            z.d.b(b);
            z.k = new wfg();
            z.q.y((wfd)z.d);
            z.q.y((wfd)z.k);
            if (z.a) {
                z.e.e = (wej)new wsq(z);
            }
            else {
                final wfi f = z.f;
                if (f != null) {
                    f.e();
                }
                final Activity c = z.c;
                z.f = new wfi();
                final wfi f2 = z.f;
                z.g = new weq(f2);
                z.q.I(f2);
                final wex wex = new wex((wfd)z.g);
                z.q.y((wfd)wex);
                z.i = new weo(whx.U((Context)z.c, 2131951635), (byte[])null, (byte[])null, (byte[])null);
                z.j = new wef((wfh)new wss(z, 0));
                z.e.e = (wej)new wst(z, wex);
            }
            this.an.G();
            this.aJ.setVisibility(0);
            final Parcel ax2 = this.ax;
            if (ax2 != null) {
                ax2.recycle();
                this.ax = null;
            }
            this.aV = true;
        }
    }
    
    public final void by() {
        if (TextUtils.isEmpty((CharSequence)this.D.c)) {
            trn.b("Trying to go live without the necessary state");
            this.cg(wpc.d, this.getString(2132018251));
            return;
        }
        if (TextUtils.isEmpty((CharSequence)this.D.x) || TextUtils.isEmpty((CharSequence)this.D.y) || this.U) {
            final boolean hasSystemFeature = this.getPackageManager().hasSystemFeature("android.hardware.microphone");
            String packageName;
            if (Binder.getCallingPid() == Process.myPid()) {
                packageName = ((Context)this).getPackageName();
            }
            else {
                packageName = null;
            }
            final int b = te.b((Context)this, "android.permission.RECORD_AUDIO", Binder.getCallingPid(), Binder.getCallingUid(), packageName);
            final StreamConfig d = this.D;
            boolean p = false;
            if (hasSystemFeature) {
                p = p;
                if (b == 0) {
                    p = true;
                }
            }
            d.p = p;
        }
        final StreamMetadata d2 = this.D.d;
        if (d2 != null) {
            final Boolean f = d2.f;
            if (f != null && f) {
                if (this.aP) {
                    return;
                }
                this.aP = true;
                if (zgv.v((Context)this)) {
                    this.bZ();
                    return;
                }
                ((qt)this).startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:".concat(String.valueOf(this.getPackageName())))), 1001);
                return;
            }
        }
        final wqr ai = this.aI;
        if (ai == null) {
            final StreamConfig d3 = this.D;
            d3.e = true;
            final String c = d3.c;
            final boolean p2 = d3.p;
            final boolean q = d3.q;
            final int aw = this.aW;
            final boolean r = d3.r;
            final boolean s = d3.s;
            final boolean u = this.U;
            final String x = d3.x;
            final String y = d3.y;
            final amhy k = d3.k;
            final long n = d3.n;
            final long o = d3.o;
            tsx.n(c);
            final wqr ai2 = new wqr();
            final Bundle bundle = new Bundle();
            bundle.putString("ARG_VIDEO_ID", c);
            bundle.putBoolean("ARG_IS_MIC_SUPPORTED", p2);
            bundle.putBoolean("ARG_IS_MIC_ENABLED", q);
            bundle.putInt("ARG_CAMERA_COUNT", aw);
            bundle.putBoolean("ARG_LIVE_STREAM_IS_PORTRAIT", r);
            bundle.putBoolean("ARG_DID_START_BROADCAST", s);
            bundle.putBoolean("ARG_IS_COSTREAM", u);
            bundle.putString("ARG_STREAM_URL", x);
            bundle.putString("ARG_STREAM_KEY", y);
            if (k != null) {
                aeda.av(bundle, "ARG_STREAM_RENDERER", (MessageLite)k);
            }
            bundle.putLong("ARG_TIMER_START_STREAM", n);
            bundle.putLong("ARG_TIMER_DURATION_STREAM", o);
            ai2.ag(bundle);
            this.aI = ai2;
        }
        else if (this.U && this.aT && !this.D.s) {
            ai.aE.s();
        }
        final tnu av = this.av;
        if (av != null) {
            av.disable();
        }
        (this.av = new tnu((Context)this, this.getWindowManager(), (tnt)this)).enable();
        int requestedOrientation;
        if (!this.D.r) {
            requestedOrientation = 6;
        }
        else {
            requestedOrientation = 7;
        }
        this.setRequestedOrientation(requestedOrientation);
        final ViewGroup$LayoutParams layoutParams = this.aJ.getLayoutParams();
        if (layoutParams.height == -1 && layoutParams.width == -1) {
            tmy.aF((View)this.aJ, tmy.aE(this.bQ(), this.bP()), (Class)ViewGroup$LayoutParams.class);
        }
        final StreamConfig d4 = this.D;
        final int t = d4.t;
        if (t != -1) {
            this.Z.f(t);
        }
        else {
            d4.t = this.getWindowManager().getDefaultDisplay().getRotation();
        }
        this.bW();
        final wqr ai3 = this.aI;
        if (ai3 != null) {
            this.cm((br)ai3, "LIVE_STREAM_FRAGMENT", true);
        }
        this.I = null;
        wia.b().e = this.D.c;
        final wia b2 = wia.b();
        int j;
        if (!this.D.e) {
            j = 2;
        }
        else {
            j = 3;
        }
        b2.j = j;
    }
    
    public final void bz() {
        if (this.aV) {
            this.an.H();
            final wsv z = this.Z;
            szc.f();
            z.e.f();
            if (!z.a) {
                final wfi f = z.f;
                if (f != null) {
                    f.e();
                }
                z.q.B((Runnable)new wsr(z.i, 0));
            }
            final wfp l = z.l;
            if (l != null) {
                l.e();
            }
            this.aJ.setVisibility(4);
            this.aV = false;
        }
    }
    
    public final void c() {
        this.bX();
    }
    
    protected void e(final ViewStub viewStub) {
    }
    
    public final void f(final boolean b) {
        this.aw.getClass();
        final String string = ((fa)this).getResources().getString(2132018238);
        Toast.makeText((Context)this, (CharSequence)string, 0).show();
        trn.b(String.valueOf(string).concat(", accept live streaming terms of service request failed."));
        if (b) {
            final rlv aw = this.aw;
            aw.d.getClass();
            aw.g.setEnabled(true);
            aw.h.setEnabled(true);
            aw.e.a();
            return;
        }
        this.aw.a();
    }
    
    public final void g() {
        final rlv aw = this.aw;
        aw.getClass();
        aw.a();
    }
    
    public final void h() {
        this.finish();
    }
    
    public final void i() {
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018238), 0).show();
        this.finish();
    }
    
    public final void j(final amhy k, final String s, final String s2) {
        this.D.k = k;
        this.U = true;
        this.ba(k, s, s2);
    }
    
    public final whb k() {
        final wqr ai = this.aI;
        if (ai != null && ai.aw()) {
            return (whb)this.aI;
        }
        return null;
    }
    
    public final void l() {
        if (this.aO) {
            this.bq();
            return;
        }
        this.bu();
    }
    
    public final void m(final aioe m) {
        this.D.m = m;
    }
    
    public final void mV() {
        this.bX();
    }
    
    public final void mW(final boolean b, final int n) {
        this.mx(b, n);
    }
    
    public final void mZ(final akzl akzl) {
        if ((akzl.b & 0x4) != 0x0) {
            anss anss;
            if ((anss = akzl.e) == null) {
                anss = anss.a;
            }
            this.bA((br)(this.az = wrb.r((ajkj)((agzd)anss).rr((agyr)ElementRendererOuterClass.elementRenderer))), "POST_COSTREAM_FRAGMENT");
            return;
        }
        final wqr ai = this.aI;
        if (ai != null && ai.aw()) {
            this.aI.aW(false);
            this.aI.aU();
        }
    }
    
    public final void mx(final boolean b, final int n) {
        final wqr ai = this.aI;
        if (ai != null && ai.au()) {
            ai.aQ(b, n);
            if (!zgv.t((Activity)this)) {
                this.Z.f(this.getWindowManager().getDefaultDisplay().getRotation());
            }
        }
    }
    
    public final wwv n() {
        return this.o;
    }
    
    public final void na(final int n) {
        final wqr ai = this.aI;
        if (ai != null && ai.aw()) {
            this.aI.aW(false);
            this.aI.aU();
        }
    }
    
    public final void o() {
        final wqe l = this.L;
        if (l != null && l.aw()) {
            this.L.q();
            return;
        }
        final wqe m = this.M;
        if (m != null && m.aw()) {
            this.M.q();
            return;
        }
        this.finish();
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1001) {
            this.bj(10);
            return;
        }
        if (n != 1000) {
            return;
        }
        if (n2 != -1 || intent == null) {
            this.aP = false;
            return;
        }
        final StreamConfig d = this.D;
        d.e = true;
        d.z = "LIVE_STREAM_FRAGMENT";
        this.cb();
        final zki m = this.m;
        final StreamConfig d2 = this.D;
        final String c = d2.c;
        final boolean r = d2.r;
        final boolean s = d2.s;
        final String x = d2.x;
        final String y = d2.y;
        final amhy k = d2.k;
        final long n3 = d2.n;
        final long o = d2.o;
        final boolean b = d2.p && d2.q;
        final boolean c2 = this.as.aY().c;
        final boolean b2 = this.as.aY().b;
        final alsq ay = this.as.aY();
        ((Context)this).startService(ScreencastHostService.n((Context)this, m, c, r, x, y, k, n3, o, b, c2, b2, ay != null && ay.m, this.as.aY().l, this.D.e, this.as.aY().f, intent));
        if (this.aQ) {
            this.setResult(-1);
            this.finish();
            return;
        }
        this.finishAffinity();
        this.startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
    }
    
    public final void onAudioFocusChange(final int n) {
    }
    
    public final void onBackPressed() {
        final wrm wrm = (wrm)this.E.f("PRE_STREAM_FRAGMENT");
        final wql wql = (wql)this.E.f("LIVE_SHARED_MDE_FRAGMENT");
        final wra wra = (wra)this.E.f("PARTICIPANT_PRE_JOIN_FRAGMENT");
        final wov wov = (wov)this.E.f("CHOOSE_THUMBNAIL_FRAGMENT");
        final wre wre = (wre)this.E.f("POST_STREAM_FRAGMENT");
        final wrb wrb = (wrb)this.E.f("POST_COSTREAM_FRAGMENT");
        final wpe wpe = (wpe)this.E.f("ERROR_STATE_FRAGMENT");
        final wqr wqr = (wqr)this.E.f("LIVE_STREAM_FRAGMENT");
        final rlw rlw = (rlw)this.E.f("LIVE_ENABLEMENT_FRAGMENT_NAME");
        final acsu acsu = (acsu)this.E.f("PERMISSION_REQUEST_FRAGMENT");
        final wow wow = (wow)this.E.f("COOL_OFF_FRAGMENT_NAME");
        final wro wro = (wro)this.E.f("SAFEGUARD_FRAGMENT");
        final wro wro2 = (wro)this.E.f("CREATOR_EDUCATION_FRAGMENT");
        if ((wre != null && wre.aw()) || (wpe != null && wpe.aw())) {
            this.finish();
            return;
        }
        if ((wrb != null && wrb.aw()) || (wpe != null && wpe.aw())) {
            this.finish();
            return;
        }
        if (wrm != null && wrm.aw()) {
            if (((fa)this).findViewById(2131429690).isShown()) {
                this.V.b();
            }
            wrm.aK();
            return;
        }
        if (wql != null && wql.aw()) {
            wql.s();
            return;
        }
        if (wra != null && wra.aw()) {
            wra.q();
            return;
        }
        final wrm ab = this.aB;
        if (ab != null && ab.aw()) {
            this.aB.aK();
            return;
        }
        final wql aa = this.aA;
        if (aa != null && aa.aw()) {
            this.aA.s();
            return;
        }
        final wpb q = this.Q;
        if (q != null && q.aw()) {
            this.Q.d();
            return;
        }
        if (wov != null && wov.aw()) {
            wov.aN();
            return;
        }
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J.aN();
            return;
        }
        final wqe m = this.M;
        if (m != null && m.aw()) {
            this.M.q();
            return;
        }
        final wrr ac = this.aC;
        if (ac != null && ac.aw()) {
            this.aC.q();
            return;
        }
        if (rlw != null && ((br)rlw).aw()) {
            rlw.aM();
            return;
        }
        if (wqr != null && wqr.aw()) {
            if (wqr.aL) {
                wqr.aN();
            }
            return;
        }
        if (acsu != null && ((br)acsu).aw()) {
            acsu.r();
            return;
        }
        if (wow != null && wow.aw()) {
            final vax a = wow.a;
            aioe aioe;
            if ((aioe = wow.c.p) == null) {
                aioe = aioe.a;
            }
            a.a(aioe);
            return;
        }
        if (wro != null && wro.aw()) {
            wro.n();
            return;
        }
        if (wro2 != null && wro2.aw()) {
            wro2.n();
            return;
        }
        if (this.ad) {
            this.finish();
            return;
        }
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.bE();
        this.p.l();
        final rlw ad = this.aD;
        if (ad != null && ((br)ad).aw()) {
            this.aD.aN(configuration);
        }
        final acsu n = this.N;
        if (n != null && ((br)n).aw()) {
            ((br)this.N).onConfigurationChanged(configuration);
        }
        this.cn(configuration, ((fa)this).findViewById(2131430261));
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2;
        Object o;
        if (bundle != null) {
            bundle2 = bundle.getBundle("BUNDLE_INTERACTION_BUNDLE");
            o = null;
        }
        else {
            Object o2 = null;
            Label_0075: {
                if (!xkm.aE(this.getIntent())) {
                    final Intent intent = this.getIntent();
                    if (intent != null) {
                        final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)intent.getParcelableExtra("navigation_endpoint");
                        if (parcelableMessageLite != null) {
                            o2 = parcelableMessageLite.a((MessageLite)aioe.a);
                            break Label_0075;
                        }
                    }
                }
                o2 = null;
            }
            o = o2;
            Label_0124: {
                if (o2 == null) {
                    final Intent intent2 = this.getIntent();
                    if (intent2 != null) {
                        final byte[] byteArrayExtra = intent2.getByteArrayExtra("navigation_endpoint");
                        if (byteArrayExtra != null) {
                            try {
                                o = agzi.parseFrom((agzi)aioe.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                                break Label_0124;
                            }
                            catch (final ahab ahab) {}
                        }
                    }
                    o = null;
                }
            }
            bundle2 = null;
        }
        ((wyc)this.o).M(bundle2, (aioe)o);
        if (o != null && ((agzd)o).rs((agyr)LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint)) {
            final LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = (LiveCreationEndpointOuterClass$LiveCreationEndpoint)((agzd)o).rr((agyr)LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint);
            final int b = liveCreationEndpointOuterClass$LiveCreationEndpoint.b;
            if ((b & 0x4) != 0x0) {
                this.R = liveCreationEndpointOuterClass$LiveCreationEndpoint.c;
                this.U = true;
            }
            if ((b & 0x8) != 0x0) {
                this.aN = liveCreationEndpointOuterClass$LiveCreationEndpoint.d;
            }
            if ((b & 0x10) != 0x0) {
                this.aO = liveCreationEndpointOuterClass$LiveCreationEndpoint.e;
            }
        }
        if (bundle != null) {
            this.D = (StreamConfig)bundle.getParcelable("BUNDLE_STREAM_CONFIG");
        }
        if (this.D == null) {
            this.D = new StreamConfig();
        }
        final wia b2 = wia.b();
        if (this.as.aY().j) {
            final ScheduledExecutorService v = this.v;
            final wvu w = this.w;
            final oas s = this.s;
            if (!b2.c) {
                b2.c = true;
                v.getClass();
                b2.a = v;
                w.getClass();
                b2.b = w;
                s.getClass();
                b2.d = s;
                synchronized (b2.i) {
                    for (final Map.Entry<Class, V> entry : b2.i.entrySet()) {
                        b2.m((Class)entry.getKey(), (whz)entry.getValue());
                    }
                }
            }
        }
        this.bn(b2, this.D);
        b2.k((Class)alrc.class, 0L);
        b2.k((Class)alrg.class, 0L);
        b2.k((Class)alre.class, 0L);
        b2.k((Class)alqu.class, 0L);
        b2.k((Class)alqx.class, 0L);
        b2.k((Class)alrm.class, 10000L);
        this.Y = false;
        ((qt)this).setContentView(this.g);
        this.E = ((bu)this).getSupportFragmentManager();
        final SurfaceView surfaceView = (SurfaceView)((fa)this).findViewById(2131431791);
        final qpt at = this.at;
        double n;
        if (!this.as.aY().i) {
            n = 1.3333333333333333;
        }
        else {
            n = 1.7777777777777777;
        }
        this.Z = new wsv((adcr)((epq)at.a).b.eS.a(), (Activity)((epq)at.a).b.d.a(), (xgc)((epq)at.a).b.eR.a(), (qpt)((epq)at.a).b.eW.a(), surfaceView, new wen(n, this.as.aY().N), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.m.getClass();
        this.q.getClass();
        this.e((ViewStub)((fa)this).findViewById(2131427886));
        this.P = (ViewportOverlay)((fa)this).findViewById(2131432378);
        this.aJ = (SurfaceView)((fa)this).findViewById(2131431791);
        (this.S = (ViewAnimatorHelper)((fa)this).findViewById(2131432360)).setVisibility(8);
        this.cn(((fa)this).getResources().getConfiguration(), ((fa)this).findViewById(2131430261));
        this.aL = this.getString(2132018257);
        this.aM = this.getString(2132018202);
        if (bundle != null) {
            this.aU = 1;
            this.k.b(bundle);
        }
        else {
            this.aU = 0;
        }
        this.k.a();
        this.aW = this.Z.b();
        final ct i = this.E.i();
        if (bundle != null) {
            final String z = this.D.z;
            final wrm g = (wrm)this.E.g(bundle, "prestream_fragment");
            this.G = g;
            if (g != null && !TextUtils.equals((CharSequence)z, (CharSequence)"PRE_STREAM_FRAGMENT")) {
                i.m((br)this.G);
            }
            this.H = (wql)this.E.g(bundle, "live_shared_mde_fragment");
            if (!TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_SHARED_MDE_FRAGMENT")) {
                final wql h = this.H;
                if (h != null) {
                    i.m((br)h);
                }
            }
            if ((this.F = (wra)this.E.g(bundle, "participant_pre_join_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"PARTICIPANT_PRE_JOIN_FRAGMENT")) {
                i.m((br)this.F);
            }
            if ((this.aB = (wrm)this.E.g(bundle, "edit_settings_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_SETTINGS_PRE_STREAM_FRAGMENT")) {
                i.m((br)this.aB);
            }
            if ((this.aA = (wql)this.E.g(bundle, "edit_settings_sharedmde_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_SETTINGS_LIVE_SHARED_MDE_FRAGMENT")) {
                i.m((br)this.aA);
            }
            if ((this.aD = (rlw)this.E.g(bundle, "live_enablement_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_ENABLEMENT_FRAGMENT_NAME")) {
                i.m((br)this.aD);
            }
            if ((this.I = (wov)this.E.g(bundle, "choose_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CHOOSE_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.I);
            }
            if ((this.aE = (wow)this.E.g(bundle, "cool_off_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"COOL_OFF_FRAGMENT_NAME")) {
                i.m((br)this.aE);
            }
            if ((this.Q = (wpb)this.E.g(bundle, "edit_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_THUMBNAIL_FRAGMENT_NAME")) {
                i.m((br)this.Q);
            }
            if ((this.J = (wov)this.E.g(bundle, "confirm_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CONFIRM_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.J);
            }
            if ((this.M = (wqe)this.E.g(bundle, "scheduled_costream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"SCHEDULED_COSTREAM_FRAGMENT")) {
                i.m((br)this.M);
            }
            if ((this.K = (wor)this.E.g(bundle, "capture_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CAPTURE_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.K);
            }
            if ((this.L = (wqe)this.E.g(bundle, "invite_screen_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"INVITE_SCREEN_FRAGMENT")) {
                i.m((br)this.L);
            }
            if ((this.aI = (wqr)this.E.g(bundle, "livestream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_STREAM_FRAGMENT")) {
                i.m((br)this.aI);
            }
            if ((this.ay = (wre)this.E.g(bundle, "poststream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"POST_STREAM_FRAGMENT")) {
                i.m((br)this.ay);
            }
            if ((this.az = (wrb)this.E.g(bundle, "post_costream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"POST_COSTREAM_FRAGMENT")) {
                i.m((br)this.az);
            }
            if ((this.aF = (wpe)this.E.g(bundle, "errorstate_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"ERROR_STATE_FRAGMENT")) {
                i.m((br)this.aF);
            }
            if ((this.N = (acsu)this.E.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)z, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acsm.f((Context)this, LiveCreationActivity.d))) {
                i.m((br)this.N);
            }
            final wro ag = (wro)this.E.g(bundle, "safeguard_fragment");
            this.aG = ag;
            if (ag != null && !TextUtils.equals((CharSequence)z, (CharSequence)"SAFEGUARD_FRAGMENT")) {
                i.m((br)this.aG);
            }
            if ((this.aH = (wro)this.E.g(bundle, "creator_education_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CREATOR_EDUCATION_FRAGMENT")) {
                i.m((br)this.aH);
            }
            this.k.c();
            i.d();
            this.ac = bundle.getBoolean("is_resume_dialog_displayed");
            final CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = (CameraStreamViewManager$CameraModelData)bundle.getParcelable("camera_model_bundle");
            final Parcel obtain = Parcel.obtain();
            cameraStreamViewManager$CameraModelData.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.ax = obtain;
        }
        if (this.aO) {
            zgv.r((Activity)this);
            final woj c = this.C;
            final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout)c.a.findViewById(c.d);
            accessibilityLayerLayout.b(c.a.findViewById(2131429500));
            final View viewById = accessibilityLayerLayout.findViewById(2131427617);
            final RelativeLayout relativeLayout = (RelativeLayout)viewById.findViewById(2131427616);
            relativeLayout.getClass();
            c.b.i(relativeLayout, (RelativeLayout)null);
            relativeLayout.setOnTouchListener((View$OnTouchListener)gmg.g);
            final EngagementPanelSizeBehavior b3 = c.b.g().b;
            b3.w(c.b.g(), (View)relativeLayout);
            tmy.aF((View)relativeLayout, tmy.ar((aeh)b3), (Class)aej.class);
            c.c.c(c.b.g().o.al((asix)new uyj(relativeLayout, 20)));
            (c.e = c.b.D()).g((tpf)c);
            c.c.c(((asgt)c.b.E().a).al((asix)new kej(c, accessibilityLayerLayout, viewById, 15)));
        }
    }
    
    protected final void onDestroy() {
        if (this.T == null) {
            this.T = (AudioManager)this.getSystemService("audio");
        }
        this.T.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)this);
        final wsv z = this.Z;
        if (z != null) {
            szc.f();
            synchronized (z.p) {
                z.o = true;
                final wfp l = z.l;
                if (l != null) {
                    l.f();
                }
                monitorexit(z.p);
                z.q.C();
            }
        }
        final xgc an = this.an;
        if (an != null) {
            an.C();
            ((Handler)an.b).getLooper().quitSafely();
            this.an = null;
        }
        super.onDestroy();
    }
    
    protected final void onPause() {
        super.onPause();
        final tnu av = this.av;
        if (av != null) {
            av.disable();
        }
        this.Y = true;
        if (this.isFinishing()) {
            this.bz();
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final uqs x = this.X;
        if (x != null) {
            x.b(n, array, array2);
        }
        else {
            trn.b("No active FragmentPermissionRequester to handle PermissionsResult");
        }
        final acsq ak = this.aK;
        if (ak != null && ak.b(n, array, array2)) {
            return;
        }
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    protected final void onRestoreInstanceState(final Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.k.b(bundle);
    }
    
    protected final void onResume() {
        super.onResume();
        this.Y = false;
        this.bE();
        final tnu av = this.av;
        if (av != null) {
            av.enable();
        }
        this.k.f = false;
        if (zgv.s((br)this.G)) {
            this.J(this.G.aU());
            return;
        }
        if (zgv.s((br)this.H)) {
            this.bx(false);
            return;
        }
        if (zgv.s((br)this.aB)) {
            this.J(this.aB.aU());
            return;
        }
        if (zgv.s((br)this.aA)) {
            this.J(false);
            return;
        }
        if (zgv.s((br)this.I)) {
            this.J(this.I.aX());
            return;
        }
        if (zgv.s((br)this.J)) {
            this.J(this.J.aX());
            return;
        }
        if (zgv.s((br)this.K)) {
            this.bx(false);
            return;
        }
        if (zgv.s((br)this.aI)) {
            this.bx(true);
            return;
        }
        if (!zgv.s((br)this.L) && !zgv.s((br)this.M)) {
            return;
        }
        this.bx(true);
    }
    
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.p.f();
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.Y = true;
        final wow ae = this.aE;
        if (ae != null) {
            this.E.J(bundle, "cool_off_fragment", (br)ae);
        }
        else {
            final wro ag = this.aG;
            if (ag != null && ag.aw()) {
                this.E.J(bundle, "safeguard_fragment", (br)this.aG);
            }
            else {
                final wro ah = this.aH;
                if (ah != null && ah.aw()) {
                    this.E.J(bundle, "creator_education_fragment", (br)this.aH);
                }
                else {
                    final wrm g = this.G;
                    if (g != null) {
                        this.E.J(bundle, "prestream_fragment", (br)g);
                    }
                    else {
                        final wql h = this.H;
                        if (h != null) {
                            this.E.J(bundle, "live_shared_mde_fragment", (br)h);
                        }
                    }
                }
            }
        }
        final wra f = this.F;
        if (f != null && f.ar()) {
            this.E.J(bundle, "participant_pre_join_fragment", (br)f);
        }
        final wrm ab = this.aB;
        if (ab != null) {
            this.E.J(bundle, "edit_settings_fragment", (br)ab);
        }
        final wql aa = this.aA;
        if (aa != null) {
            this.E.J(bundle, "edit_settings_sharedmde_fragment", (br)aa);
        }
        final rlw ad = this.aD;
        if (ad != null && ((br)ad).ar()) {
            this.E.J(bundle, "live_enablement_fragment", (br)ad);
        }
        final wov i = this.I;
        if (i != null) {
            this.E.J(bundle, "choose_thumbnail_fragment", (br)i);
        }
        final wov j = this.J;
        if (j != null && j.ar()) {
            this.E.J(bundle, "confirm_thumbnail_fragment", (br)j);
        }
        final wqe m = this.M;
        if (m != null && m.ar()) {
            this.E.J(bundle, "scheduled_costream_fragment", (br)m);
        }
        final wor k = this.K;
        if (k != null && k.ar()) {
            this.E.J(bundle, "capture_thumbnail_fragment", (br)k);
        }
        final wqe l = this.L;
        if (l != null && l.ar()) {
            this.E.J(bundle, "invite_screen_fragment", (br)l);
        }
        final wpb q = this.Q;
        if (q != null && q.ar()) {
            this.E.J(bundle, "edit_thumbnail_fragment", (br)q);
        }
        final wqr ai = this.aI;
        if (ai != null) {
            this.E.J(bundle, "livestream_fragment", (br)ai);
        }
        final wre ay = this.ay;
        if (ay != null) {
            this.E.J(bundle, "poststream_fragment", (br)ay);
        }
        final wrb az = this.az;
        if (az != null) {
            this.E.J(bundle, "post_costream_fragment", (br)az);
        }
        final wpe af = this.aF;
        if (af != null) {
            this.E.J(bundle, "errorstate_fragment", (br)af);
        }
        final acsu n = this.N;
        if (n != null) {
            this.E.J(bundle, "permission_request_fragment", (br)n);
        }
        bundle.putParcelable("BUNDLE_STREAM_CONFIG", (Parcelable)this.D);
        final wom k2 = this.k;
        bundle.putInt("stream_control_state", k2.e);
        bundle.putBoolean("enablement_complete", k2.a);
        bundle.putBoolean("thumbnail_chosen", k2.b);
        bundle.putBoolean("live_stream_complete", k2.d);
        k2.f = true;
        bundle.putBoolean("is_resume_dialog_displayed", this.ac);
        bundle.putParcelable("camera_model_bundle", (Parcelable)this.Z.m);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", ((wyc)this.o).L());
    }
    
    protected final void onStart() {
        super.onStart();
        this.Y = false;
        this.j.g((Object)this.ag);
        this.j.f((Object)new whx());
        if (this.T == null) {
            this.T = (AudioManager)this.getSystemService("audio");
        }
        this.T.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)this, 3, 2);
        if (!this.m.t() && !this.U) {
            this.n.b((Activity)this, (byte[])null, (zku)null);
        }
        else {
            this.H();
        }
        if (co(this.getIntent())) {
            this.aJ.setVisibility(4);
        }
        final wom k = this.k;
        k.c = k.e;
        k.a();
        final wob au = new wob(this, 0);
        this.au = (DisplayManager$DisplayListener)au;
        this.u.registerDisplayListener((DisplayManager$DisplayListener)au, this.h);
        this.aZ = true;
        if (this.bG()) {
            this.bi(this.ai);
        }
    }
    
    protected final void onStop() {
        super.onStop();
        if (this.bR() != null) {
            final StreamConfig d = this.D;
            final wiy wiy = (wiy)this.bR();
            long l;
            if (wiy.V) {
                l = wiy.h.d() - wiy.K;
            }
            else {
                l = wiy.L;
            }
            d.o = l;
            this.cb();
        }
        this.u.unregisterDisplayListener(this.au);
        this.j.f((Object)new whx());
        this.j.m((Object)this.ag);
        this.p.a();
        final CameraStreamViewManager$CameraModelData m = this.Z.m;
        final Parcel obtain = Parcel.obtain();
        m.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.ax = obtain;
        this.bz();
        this.aU = 2;
        this.aZ = false;
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (zgv.s((br)this.aI)) {
            final wqr ai = this.aI;
            if (b) {
                ai.aV(true);
            }
        }
    }
    
    public final void p(final akjm akjm) {
        akjj akjj;
        if ((akjj = akjm.f) == null) {
            akjj = akjj.a;
        }
        akjr akjr;
        if ((akjr = akjj.g) == null) {
            akjr = akjr.a;
        }
        final int b = akjr.b;
        final wjx r = this.r;
        akjt akjt;
        if ((akjt = akjm.h) == null) {
            akjt = akjt.a;
        }
        final String c = akjt.c;
        akjt akjt2;
        if ((akjt2 = akjm.h) == null) {
            akjt2 = akjt.a;
        }
        final String d = akjt2.d;
        alqi alqi;
        if ((alqi = akjm.j) == null) {
            alqi = alqi.a;
        }
        boolean b2 = false;
        Label_0142: {
            if ((alqi.b & 0x1) != 0x0) {
                alqi alqi2;
                if ((alqi2 = akjm.j) == null) {
                    alqi2 = alqi.a;
                }
                if (!alqi2.c) {
                    b2 = false;
                    break Label_0142;
                }
            }
            b2 = true;
        }
        alqi alqi3;
        if ((alqi3 = akjm.j) == null) {
            alqi3 = alqi.a;
        }
        final boolean d2 = alqi3.d;
        akjt akjt3;
        if ((akjt3 = akjm.h) == null) {
            akjt3 = akjt.a;
        }
        final boolean h = akjt3.h;
        akjt akjt4;
        if ((akjt4 = akjm.h) == null) {
            akjt4 = akjt.a;
        }
        final boolean k = akjt4.k;
        akjt akjt5;
        if ((akjt5 = akjm.h) == null) {
            akjt5 = akjt.a;
        }
        akjp akjp;
        if ((akjp = akjt5.g) == null) {
            akjp = akjp.a;
        }
        final akjt h2 = akjm.h;
        akjt a;
        if (h2 == null) {
            a = akjt.a;
        }
        else {
            a = h2;
        }
        int ct;
        if ((ct = aqql.ct(a.f)) == 0) {
            ct = 1;
        }
        akjt a2;
        if (h2 == null) {
            a2 = akjt.a;
        }
        else {
            a2 = h2;
        }
        int e;
        if ((e = alhb.e(a2.l)) == 0) {
            e = 1;
        }
        akjj akjj2;
        if ((akjj2 = akjm.f) == null) {
            akjj2 = akjj.a;
        }
        int ao;
        if ((ao = aesy.aO(akjj2.h)) == 0) {
            ao = 1;
        }
        akjt a3;
        if (h2 == null) {
            a3 = akjt.a;
        }
        else {
            a3 = h2;
        }
        Place place;
        if ((a3.b & 0x100) != 0x0) {
            akjt a4;
            if (h2 == null) {
                a4 = akjt.a;
            }
            else {
                a4 = h2;
            }
            final String i = a4.i;
            akjt a5 = h2;
            if (h2 == null) {
                a5 = akjt.a;
            }
            place = new Place(i, a5.j);
        }
        else {
            place = null;
        }
        Integer value;
        if ((b & 0x1) != 0x0) {
            akjj akjj3;
            if ((akjj3 = akjm.f) == null) {
                akjj3 = akjj.a;
            }
            akjr akjr2;
            if ((akjr2 = akjj3.g) == null) {
                akjr2 = akjr.a;
            }
            value = (int)akjr2.c;
        }
        else {
            value = null;
        }
        r.j(c, d, Boolean.valueOf(b2), Boolean.valueOf(d2), Boolean.valueOf(h), Boolean.valueOf(k), akjp, ct, e, ao, place, (Date)null, value, (String)null, (wjn)this.H);
    }
    
    public final void q(final aksf aksf) {
        this.r.m(((agzi)aksf.a).createBuilder((agzi)aksf), (wjw)this.aA);
    }
    
    public final whl r() {
        final wqr ai = this.aI;
        if (ai != null && ai.aw()) {
            return (whl)this.aI;
        }
        return null;
    }
    
    public final void s(final String c) {
        this.k.e();
        this.k.c();
        final StreamConfig d = this.D;
        final amgq i = d.i;
        if (i != null) {
            this.t(c, i, null);
            return;
        }
        d.c = c;
        d.r = true;
        final wom k = this.k;
        k.a = true;
        k.b = true;
        k.g();
    }
    
    public final void t(final String c, final amgq i, final Boolean b) {
        this.k.c();
        final StreamConfig d = this.D;
        i.getClass();
        d.i = i;
        if (!TextUtils.isEmpty((CharSequence)c)) {
            this.D.c = c;
        }
        final StreamConfig d2 = this.D;
        if (d2.d == null) {
            d2.d = new StreamMetadata();
        }
        if ((i.b & 0x4000) != 0x0) {
            final StreamMetadata d3 = d2.d;
            ajsq ajsq;
            if ((ajsq = i.m) == null) {
                ajsq = ajsq.a;
            }
            d3.a = abyh.b(ajsq).toString();
        }
        this.D.d.f = i.q;
        if (b != null) {
            this.D.r = b;
        }
        this.bC();
    }
    
    public final void u(final String s) {
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J.u(s);
            return;
        }
        final wov i = this.I;
        if (i != null && i.aw()) {
            this.I.u(s);
            return;
        }
        final wqe l = this.L;
        if (l != null && l.aw()) {
            this.L.u(s);
            return;
        }
        final wqe m = this.M;
        if (m != null && m.aw()) {
            this.M.u(s);
        }
    }
    
    public final void v(final String s) {
        final wov j = this.J;
        if (j != null && j.aw()) {
            this.J.v(s);
            return;
        }
        final wov i = this.I;
        if (i != null && i.aw()) {
            this.I.v(s);
            return;
        }
        final wqe l = this.L;
        if (l != null && l.aw()) {
            this.L.v(s);
            return;
        }
        final wqe m = this.M;
        if (m != null && m.aw()) {
            this.M.v(s);
        }
    }
    
    public final void w() {
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018238), 0).show();
    }
    
    public final void x(final String s) {
        final wqe l = this.L;
        if (l != null && l.aw()) {
            this.L.aK(s);
        }
        else {
            final wqe m = this.M;
            if (m != null && m.aw()) {
                this.M.aK(s);
            }
        }
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018304), 0).show();
    }
    
    public final void y() {
        this.cm((br)this.G, "PRE_STREAM_FRAGMENT", true);
        this.k.e();
        this.G.aM();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui;

import android.app.AlertDialog$Builder;
import java.util.Map;
import com.google.protos.youtube.api.innertube.LiveCreationEndpointOuterClass$LiveCreationEndpoint;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import android.view.ViewStub;
import android.view.WindowManager$LayoutParams;
import android.app.AlertDialog;
import android.text.Spanned;
import android.content.DialogInterface$OnShowListener;
import android.text.method.LinkMovementMethod;
import androidx.core.widget.ContentLoadingProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.DialogInterface$OnKeyListener;
import java.util.Calendar;
import j$.util.Objects;
import android.graphics.Rect;
import android.media.MediaActionSound;
import android.os.Process;
import android.os.Binder;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint;
import android.app.Activity;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.widget.Toast;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnClickListener;
import android.graphics.Bitmap;
import android.widget.FrameLayout$LayoutParams;
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
import android.media.projection.MediaProjectionManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
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

public class LiveCreationActivity extends wpx implements AudioManager$OnAudioFocusChangeListener, wtl, wsz, wsk, wlv, wtn, rod, wst, wqu, wqq, wsd, wqp, wjt, wjj, wjc, wra, wtc, wrd, acux, rgw, wyv, tpy, vrr, wjl, wja, wtq, wjr, wju, wje, zpf, wix, zeh
{
    private static final PermissionDescriptor a;
    private static final afft b;
    private static final long c;
    public static final PermissionDescriptor[] d;
    public static final long e;
    public static final wlu f;
    public acuq A;
    public otk B;
    public uwo C;
    public StreamConfig D;
    public cl E;
    public wta F;
    public wtm G;
    public wsl H;
    public wqv I;
    public wqv J;
    public wqr K;
    public wse L;
    public wse M;
    public acuy N;
    public ViewportOverlay P;
    public wrb Q;
    public String R;
    public ViewAnimatorHelper S;
    AudioManager T;
    public boolean U;
    public final wqg V;
    public zfw W;
    public usn X;
    public boolean Y;
    public wuv Z;
    private wsl aA;
    private wtm aB;
    private wtr aC;
    private rob aD;
    private wqw aE;
    private wre aF;
    private wto aG;
    private wto aH;
    private wsr aI;
    private SurfaceView aJ;
    private acuu aK;
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
    public wqj aa;
    boolean ab;
    public boolean ac;
    public boolean ad;
    public final List ae;
    public final Handler af;
    final wqf ag;
    public final Runnable ah;
    final Choreographer$FrameCallback ai;
    public acuw aj;
    public qqr ak;
    public adpp al;
    public xib am;
    public xib an;
    public adfs ao;
    public sqq ap;
    public aujg aq;
    public aeea ar;
    public aeea as;
    public pvh at;
    private DisplayManager$DisplayListener au;
    private tpz av;
    private roa aw;
    private Parcel ax;
    private wte ay;
    private wtb az;
    private alub ba;
    private alub bb;
    private alub bc;
    private int bd;
    public View g;
    public Handler h;
    public Executor i;
    public tgd j;
    public wqm k;
    public wqi l;
    public zmf m;
    public zmt n;
    public wyw o;
    public rgs p;
    public riq q;
    public wlx r;
    public oby s;
    public Choreographer t;
    public DisplayManager u;
    public ScheduledExecutorService v;
    public wxx w;
    public arkg x;
    public uqb y;
    public SharedPreferences z;
    
    static {
        a = new PermissionDescriptor(0, xaa.c(43000), xaa.c(43001));
        d = new PermissionDescriptor[] { new PermissionDescriptor(1, xaa.c(29216), xaa.c(29218)), new PermissionDescriptor(2, xaa.c(29217), xaa.c(29219)) };
        b = afft.v((Object)"PRE_STREAM_FRAGMENT", (Object)"LIVE_SHARED_MDE_FRAGMENT", (Object)"PARTICIPANT_PRE_JOIN_FRAGMENT", (Object)"PERMISSION_REQUEST_FRAGMENT");
        c = TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES);
        e = TimeUnit.MILLISECONDS.convert(1L, TimeUnit.MINUTES);
        f = (wlu)new wpz();
    }
    
    public LiveCreationActivity() {
        this.bd = 1;
        this.V = new wqg(this, 0);
        this.aa = new wqj((bu)this);
        this.ab = false;
        this.ae = new ArrayList();
        this.af = new Handler();
        this.ag = new wqf(this, 0);
        this.ah = (Runnable)new wpv(this, 10, (byte[])null);
        this.ai = (Choreographer$FrameCallback)new dyl(this, 3);
    }
    
    private final int bR() {
        int n;
        if (this.am.y()) {
            n = this.as.bI();
        }
        else {
            n = this.z.getInt("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
        }
        return n;
    }
    
    private final int bS() {
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
    
    private final int bT() {
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
    
    private final wld bU() {
        final wsr ai = this.aI;
        if (ai != null) {
            return (wld)ai.aE;
        }
        return null;
    }
    
    private final void bV(final View view) {
        final String b = this.B();
        if (b != null) {
            tsy.c((Context)this, view, (CharSequence)b);
        }
    }
    
    private final void bW() {
        final int bt = this.bT();
        final int bs = this.bS();
        RelativeLayout$LayoutParams layoutParams;
        if (((fa)this).getResources().getConfiguration().orientation == 2) {
            final int n = bt / 2;
            final double w = this.D.w;
            final double n2 = n;
            Double.isNaN(n2);
            layoutParams = new RelativeLayout$LayoutParams(n, (int)(n2 / w));
            layoutParams.addRule(15, -1);
        }
        else {
            final int n3 = bs / 2;
            final double w2 = this.D.w;
            final double n4 = n3;
            Double.isNaN(n4);
            layoutParams = new RelativeLayout$LayoutParams((int)(n4 * w2), n3);
            layoutParams.addRule(14, -1);
        }
        this.aJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private final void bX() {
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2130772058);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new wqb(this));
        this.P.startAnimation(loadAnimation);
    }
    
    private final void bY() {
        final Animation loadAnimation = AnimationUtils.loadAnimation((Context)this, 2130772059);
        loadAnimation.setAnimationListener((Animation$AnimationListener)new wqc(this));
        this.P.startAnimation(loadAnimation);
    }
    
    private final void bZ() {
        final wtm g = this.G;
        if (g != null && ((br)g).O != null) {
            ((InputMethodManager)this.getSystemService("input_method")).hideSoftInputFromWindow(((br)this.G).O.getWindowToken(), 2);
        }
    }
    
    public static void bi(final Context context, Uri uri) {
        uri = (Uri)new Intent("android.intent.action.VIEW", uri);
        ((Intent)uri).setPackage("com.android.chrome");
        try {
            context.startActivity((Intent)uri);
        }
        catch (final ActivityNotFoundException ex) {
            context.startActivity(((Intent)uri).setComponent((ComponentName)null));
        }
    }
    
    private final void ca() {
        if (zis.s((br)this.G)) {
            this.G.aM();
        }
    }
    
    private final void cb() {
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
    
    private final void cc() {
        ((qt)this).startActivityForResult(((MediaProjectionManager)this.getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
    }
    
    private final void cd(final String s) {
        teu.n((aun)this, ((qqr)this.as.a).b((aezf)new uig(s, 19), (Executor)afum.a), (ttg)won.g, (ttg)won.h);
    }
    
    private final void ce() {
        final StreamConfig d = this.D;
        if (!d.a) {
            if (!TextUtils.isEmpty((CharSequence)d.c)) {
                final String b = this.D.b();
                if (TextUtils.isEmpty((CharSequence)b)) {
                    ttr.b("Failed to save the live stream state.");
                    return;
                }
                if (this.am.y()) {
                    this.cd(b);
                    return;
                }
                this.i.execute((Runnable)new wmc(this, b, 6));
            }
        }
    }
    
    private final void cf(final alub bc) {
        if (bc != null) {
            this.bc = bc;
            final wto ah = new wto();
            anuv anuv;
            if ((anuv = bc.c) == null) {
                anuv = anuv.a;
            }
            final ahaz builder = ((ahbh)anuv.rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer)).toBuilder();
            builder.copyOnWrite();
            final aixf aixf = (aixf)builder.instance;
            aixf.b |= 0x20;
            aixf.f = "CREATOR_EDUCATION";
            final aixf aixf2 = (aixf)builder.build();
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agzk)aixf2).toByteArray());
            ah.ag(bundle);
            this.cp((br)(this.aH = ah), "CREATOR_EDUCATION_FRAGMENT", true);
        }
    }
    
    private final void cg(final amjt amjt, final amiu amiu) {
        this.k.e();
        this.cb();
        if (amjt != null) {
            this.bq(amjt, null);
            final StreamConfig d = this.D;
            if (d.d == null) {
                d.d = new StreamMetadata();
            }
            this.ce();
            return;
        }
        if (amiu != null) {
            this.bD((br)(this.J = wqv.r(amiu, (String)null, this.aW, this.ab, this.bR())), "CONFIRM_THUMBNAIL_FRAGMENT");
        }
    }
    
    private final void ch(final alub ba) {
        if (ba != null) {
            this.ba = ba;
            final wqw ae = new wqw();
            anuv anuv;
            if ((anuv = ba.c) == null) {
                anuv = anuv.a;
            }
            final aixf aixf = (aixf)anuv.rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agzk)aixf).toByteArray());
            ae.ag(bundle);
            this.cp((br)(this.aE = ae), "COOL_OFF_FRAGMENT_NAME", true);
        }
    }
    
    private final void ci(final String c) {
        c.getClass();
        this.D.c = c;
        if (this.Q == null) {
            this.Q = new wrb();
        }
        final wrb q = this.Q;
        q.d = new xib((Context)this, this.s).D(c);
        if (zis.s((br)q.c)) {
            q.r();
        }
        (this.aK = new acuu(acut.d((bu)this), this.o, (List)Arrays.asList(LiveCreationActivity.a), 2132018297, 2132018301, (Runnable)new wpv(this, 8), (Runnable)tjv.e, this.A)).a();
    }
    
    private final void cj(final wrc wrc, final String s) {
        this.F();
        final wre af = new wre();
        final Bundle bundle = new Bundle();
        bundle.putSerializable("state", (Serializable)wrc);
        bundle.putString("message", s);
        af.ag(bundle);
        this.aF = af;
        final ct i = this.E.i();
        i.w(2131428910, (br)this.aF, "ERROR_STATE_FRAGMENT");
        this.bZ();
        i.i = 4099;
        i.d();
        this.D.z = "ERROR_STATE_FRAGMENT";
    }
    
    private final void ck(final amjs amjs, final String s, final ajut ajut) {
        final wte ay = this.ay;
        if (ay != null && ay.aw()) {
            return;
        }
        final wre af = this.aF;
        if (af != null) {
            final ct i = this.E.i();
            i.m((br)af);
            i.i = 4099;
            i.d();
        }
        final wte ay2 = new wte();
        final Bundle bundle = new Bundle();
        bundle.putString("ARG_ERROR_MESSAGE", s);
        if (ajut != null) {
            adyf.aA(bundle, "ARG_ERROR_MESSAGE_FORMATTED_STRING", (MessageLite)ajut);
        }
        if (amjs != null) {
            adyf.aA(bundle, "ARG_ENDSCREEN_RENDERER", (MessageLite)amjs);
        }
        ay2.ag(bundle);
        this.ay = ay2;
        final ct j = this.E.i();
        final wsr ai = this.aI;
        if (ai != null) {
            j.n((br)ai);
        }
        j.r(2131431775, (br)this.ay, "POST_STREAM_FRAGMENT");
        j.i = 4099;
        j.t((String)null);
        j.a();
        this.aI = null;
        this.D.z = "POST_STREAM_FRAGMENT";
        this.bX();
        this.Z.e(true);
        if (this.bJ()) {
            this.bj(this.ai);
        }
    }
    
    private final void cl(final alub bb) {
        if (bb != null) {
            this.bb = bb;
            final wto ag = new wto();
            anuv anuv;
            if ((anuv = bb.c) == null) {
                anuv = anuv.a;
            }
            final aixf aixf = (aixf)anuv.rx((ahaq)ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            final Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((agzk)aixf).toByteArray());
            ag.ag(bundle);
            this.cp((br)(this.aG = ag), "SAFEGUARD_FRAGMENT", true);
        }
    }
    
    private final void cm(final boolean b) {
        this.J = null;
        this.M = null;
        final wtr ac = this.aC;
        if (ac == null) {
            final int bd = this.bd;
            final Bundle bundle = new Bundle();
            if (bd == 0) {
                throw null;
            }
            bundle.putInt("ARG_FILTER_TYPE", bd - 1);
            final wtr ac2 = new wtr();
            ac2.ag(bundle);
            this.aC = ac2;
        }
        else {
            ac.r();
        }
        this.cp((br)this.aC, "SCHEDULED_EVENTS_FRAGMENT_NAME", b);
    }
    
    private final void cn() {
        final Point point = new Point();
        this.getWindowManager().getDefaultDisplay().getRealSize(point);
        final int y = point.y;
        final int n = ((fa)this).getResources().getDimensionPixelSize(2131167131) + ((fa)this).getResources().getDimensionPixelSize(2131167025) + ((fa)this).getResources().getDimensionPixelSize(2131166186);
        final int dimensionPixelSize = ((fa)this).getResources().getDimensionPixelSize(2131166185);
        final int n2 = y / 2 - n - dimensionPixelSize;
        final double w = this.D.w;
        final double n3 = n2;
        Double.isNaN(n3);
        final RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)(n3 * w), n2);
        layoutParams.setMargins(0, n, 0, dimensionPixelSize);
        layoutParams.addRule(14, -1);
        this.aJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.bA(false);
    }
    
    private final void co(final anas anas) {
        final boolean bq = tpe.bq((Context)this);
        final rob b = rlc.b(anas, bq);
        this.aD = b;
        if (bq) {
            final ct i = this.E.i();
            i.s((br)this.aD, "LIVE_ENABLEMENT_FRAGMENT_NAME");
            i.i = 4099;
            i.d();
            this.D.z = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        }
        else {
            this.bD((br)b, "LIVE_ENABLEMENT_FRAGMENT_NAME");
        }
        if (anas.g.size() > 0) {
            this.E.ab();
            aixf aixf;
            if ((aixf = ((anat)anas.g.get(0)).b) == null) {
                aixf = aixf.a;
            }
            this.by(aixf);
        }
    }
    
    private final void cp(final br br, final String z, final boolean b) {
        final br f = this.E.f(this.D.z);
        br.getClass();
        tvb.n(z);
        final ct i = this.E.i();
        if (f != null && f.ar() && !f.equals(br)) {
            if (b) {
                i.n(f);
            }
            else {
                i.m(f);
            }
        }
        if (!br.ar()) {
            i.r(2131431775, br, z);
        }
        else if (br.as()) {
            i.o(br);
        }
        i.i = 4099;
        i.d();
        this.D.z = z;
    }
    
    private final void cq(final Configuration configuration, final View view) {
        if (this.U) {
            this.cn();
            final int n = configuration.uiMode & 0x30;
            if (n != 16) {
                if (n == 32) {
                    view.setBackgroundColor(agy.a((Context)this, 2131102373));
                }
            }
            else {
                view.setBackgroundColor(agy.a((Context)this, 2131102374));
            }
        }
    }
    
    private static boolean cr(final Intent intent) {
        return intent.hasExtra("statusCode") && intent.hasExtra("didStream");
    }
    
    private static final boolean cs(final StreamMetadata streamMetadata) {
        if (streamMetadata != null) {
            final Date j = streamMetadata.j;
            if (j != null && j.getTime() > 0L) {
                return true;
            }
        }
        return false;
    }
    
    private final void ct(final String s, String i, int n) {
        if (!this.aZ) {
            return;
        }
        final rlv a = rlv.a;
        admy admy;
        if (--n != 1) {
            if (n != 2) {
                admy = admy.a;
            }
            else {
                admy = admy.c;
            }
        }
        else {
            admy = admy.b;
        }
        final ahaz builder = ((ahbh)admz.a).createBuilder();
        i = tvb.i(i);
        builder.copyOnWrite();
        final admz admz = (admz)builder.instance;
        admz.b |= 0x1;
        admz.c = i;
        builder.copyOnWrite();
        final admz admz2 = (admz)builder.instance;
        admz2.e = admy.d;
        admz2.b |= 0x4;
        final admz admz3 = (admz)builder.build();
        final adpp al = this.al;
        final zme c = this.m.c();
        final String b = ((adkm)al.b).b();
        afwm.w(afwm.r((afty)new adkc(al, s, c, b, admz3, (byte[])null), al.c), (afva)new pkq(al, b, c, 4, (byte[])null), (Executor)afum.a);
    }
    
    public final ashc A(final alvk alvk) {
        return ashc.j(new hua(this, alvk, 3));
    }
    
    final String B() {
        final wuv z = this.Z;
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
            string2 = this.getString(2132018205, new Object[] { s });
        }
        else {
            string2 = "";
        }
        if (this.Z.b() > 2) {
            string = this.getString(2132018206, new Object[] { this.Z.m.a });
        }
        return this.getString(2132018324, new Object[] { string2, string });
    }
    
    public final ArrayList C() {
        if (this.y.a.isEmpty()) {
            this.y.g(this.D.B);
        }
        return this.y.a;
    }
    
    public final void D(final View view) {
        this.Z.c();
        this.bV(view);
        final wqr k = this.K;
        k.af = this.B();
        if (k.d != null && !TextUtils.isEmpty(k.af)) {
            k.d.setContentDescription(k.af);
        }
    }
    
    public final void E(final boolean b) {
        if (this.am.y()) {
            this.i.execute((Runnable)new wpv(this, 7));
            this.cd("");
            this.bl(-1L);
            if (b) {
                final StreamConfig a = StreamConfig.a(this.as.bK());
                if (a != null && !TextUtils.isEmpty((CharSequence)a.c)) {
                    this.r.f(a.c, LiveCreationActivity.f);
                }
            }
            return;
        }
        this.i.execute((Runnable)new wqh(b, (Context)this, this.r, this.s, this.z));
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
            this.bC();
        }
    }
    
    public final void H() {
        if (this.ac) {
            final int au = this.aU;
            if (au == 0 || au == 2) {
                return;
            }
        }
        if (!zis.s((br)this.N)) {
            if (!this.am.v() || usn.d((Context)this, (List)Arrays.asList(LiveCreationActivity.d))) {
                if (!this.am.v()) {
                    final PermissionDescriptor[] d = LiveCreationActivity.d;
                    final boolean f = acuq.f((Context)this, d);
                    final boolean f2 = acuq.f((Context)this, (PermissionDescriptor[])this.ae.toArray(new PermissionDescriptor[0]));
                    if (f || (f2 && TextUtils.isEmpty((CharSequence)this.R))) {
                        if (!this.ad) {
                            if (this.N == null) {
                                final acuw aj = this.aj;
                                aj.e(d);
                                aj.f = xaa.b(29222);
                                aj.g = xaa.c(29215);
                                aj.h = xaa.c(29221);
                                aj.i = xaa.c(29220);
                                aj.b(2132018290);
                                aj.c(2132018292);
                                if (TextUtils.isEmpty((CharSequence)this.R)) {
                                    this.aj.d((PermissionDescriptor[])this.ae.toArray(new PermissionDescriptor[0]));
                                }
                                this.N = (acuy)this.aj.a();
                            }
                            this.N.aK((acux)this);
                            this.bD((br)this.N, "PERMISSION_REQUEST_FRAGMENT");
                            this.ad = true;
                        }
                        return;
                    }
                }
                final zmf m = this.m;
                m.getClass();
                m.c().getClass();
                final String d2 = this.m.c().d();
                tvb.n(d2);
                String s;
                if (this.am.y()) {
                    s = this.as.bK();
                }
                else {
                    s = this.z.getString("SHARED_PREF_STREAM_CONFIG_KEY", (String)null);
                }
                final StreamConfig a = StreamConfig.a(s);
                Label_0479: {
                    if (a == null || d2.equals(a.b)) {
                        long n;
                        if (this.am.y()) {
                            n = this.as.bJ();
                        }
                        else {
                            n = this.z.getLong("SHARED_PREF_LS_TIMESTAMP_KEY", -1L);
                        }
                        if (n != -1L) {
                            if (this.s.c() - n > LiveCreationActivity.c && !this.U) {
                                break Label_0479;
                            }
                        }
                        if (a != null && d2.equals(a.b) && a.d != null) {
                            final int au2 = this.aU;
                            if (au2 == 0 || (this.ac && au2 == 1)) {
                                if (!this.ac) {
                                    final Intent intent = this.getIntent();
                                    if (cr(intent)) {
                                        this.D = a;
                                        this.aZ = true;
                                        final int intExtra = intent.getIntExtra("statusCode", 0);
                                        final byte[] byteArrayExtra = intent.getByteArrayExtra("endScreenRenderer");
                                        amjs amjs = null;
                                        Label_0640: {
                                            Label_0598: {
                                                if (byteArrayExtra != null) {
                                                    try {
                                                        amjs = (amjs)ahbh.parseFrom((ahbh)amjs.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                                                    }
                                                    catch (final ahca ahca) {
                                                        ttr.d("Could not deserialize MobileStreamEndscreenRenderer from intent", (Throwable)ahca);
                                                        break Label_0598;
                                                    }
                                                    break Label_0640;
                                                }
                                            }
                                            amjs = null;
                                        }
                                        final String stringExtra = intent.getStringExtra("errorMessage");
                                        final byte[] byteArrayExtra2 = intent.getByteArrayExtra("errorMessageFormatted");
                                        ajut ajut = null;
                                        Label_0700: {
                                            Label_0665: {
                                                if (byteArrayExtra2 != null) {
                                                    try {
                                                        ajut = (ajut)ahbh.parseFrom((ahbh)ajut.a, byteArrayExtra2);
                                                    }
                                                    catch (final ahca ahca2) {
                                                        ttr.d("Could not deserialize error message from intent", (Throwable)ahca2);
                                                        break Label_0665;
                                                    }
                                                    break Label_0700;
                                                }
                                            }
                                            ajut = null;
                                        }
                                        this.aq(intExtra, amjs, null, stringExtra, ajut, intent.getBooleanExtra("didStream", false));
                                        return;
                                    }
                                }
                                if (((vai)this.am.a).l(45383553L).aM()) {
                                    this.bx(a, 5);
                                    return;
                                }
                                this.bw(a);
                                return;
                            }
                        }
                        final String z = this.D.z;
                        if (TextUtils.isEmpty((CharSequence)z) || LiveCreationActivity.b.contains((Object)z)) {
                            this.bu();
                            return;
                        }
                        if ("CHOOSE_THUMBNAIL_FRAGMENT".equals(z)) {
                            this.bp();
                            return;
                        }
                        if ("COOL_OFF_FRAGMENT_NAME".equals(z)) {
                            this.ch(this.ba);
                            return;
                        }
                        if ("EDIT_THUMBNAIL_FRAGMENT_NAME".equals(z)) {
                            this.ci(this.D.c);
                            return;
                        }
                        if (!"LIVE_ENABLEMENT_FRAGMENT_NAME".equals(z)) {
                            if (!"LIVE_STREAM_FRAGMENT".equals(z) && !"POST_STREAM_FRAGMENT".equals(z)) {
                                if ("SAFEGUARD_FRAGMENT".equals(z)) {
                                    this.cl(this.bb);
                                    return;
                                }
                                if ("CREATOR_EDUCATION_FRAGMENT".equals(z)) {
                                    final alub bc = this.bc;
                                    bc.getClass();
                                    this.cf(bc);
                                    return;
                                }
                                if (!"INVITE_SCREEN_FRAGMENT".equals(z) && !"SCHEDULED_COSTREAM_FRAGMENT".equals(z)) {
                                    ttr.b("Unhandled fragment to resume to - ".concat(String.valueOf(z)));
                                    return;
                                }
                                this.cg(this.D.j, null);
                            }
                        }
                        return;
                    }
                }
                this.E(this.U ^ true);
                this.bu();
                return;
            }
            if (!this.ad) {
                this.runOnUiThread((Runnable)new wpv(this, 5));
            }
        }
    }
    
    public final void I(final ure ure, final String s) {
        final wuv z = this.Z;
        final xra k = this.y.k();
        final boolean r = this.D.r;
        final whq l = z.l;
        if (l != null) {
            l.l((Context)z.c, ure, k, r, s);
            return;
        }
        ((Handler)z.q.b).post((Runnable)new nel(z, ure, k, r, s, 4, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void J(final boolean b) {
        if (b) {
            this.bC();
            return;
        }
        this.bA(true);
    }
    
    public final void K() {
        final wqv j = this.J;
        if (j != null) {
            this.bD((br)j, "CONFIRM_THUMBNAIL_FRAGMENT");
            return;
        }
        final wse l = this.L;
        if (l != null) {
            this.bD((br)l, "INVITE_SCREEN_FRAGMENT");
            return;
        }
        final wse m = this.M;
        if (m != null) {
            this.bD((br)m, "SCHEDULED_COSTREAM_FRAGMENT");
            return;
        }
        this.bp();
    }
    
    public final void L() {
        if (this.K != null) {
            final ct i = this.E.i();
            i.n((br)this.K);
            i.d();
            this.K = null;
        }
        final wse l = this.L;
        if (l != null) {
            this.cp((br)l, "INVITE_SCREEN_FRAGMENT", true);
            return;
        }
        final wse m = this.M;
        if (m != null) {
            this.cp((br)m, "SCHEDULED_COSTREAM_FRAGMENT", true);
            return;
        }
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void M() {
    }
    
    public final void N() {
        final amjt j = this.D.j;
        if (j != null) {
            this.cg(j, null);
        }
    }
    
    public final void O() {
        this.finish();
    }
    
    public final void P(final alub alub) {
        if (!this.aS) {
            this.cf(alub);
        }
    }
    
    public final void Q(final alub alub) {
        this.ch(alub);
    }
    
    public final void R() {
        this.aT = true;
    }
    
    public final void S(final View view) {
        final int bt = this.bT();
        final int bs = this.bS();
        FrameLayout$LayoutParams layoutParams;
        if (((fa)this).getResources().getConfiguration().orientation == 2) {
            final int n = bt / 2;
            final double w = this.D.w;
            final double n2 = n;
            Double.isNaN(n2);
            layoutParams = new FrameLayout$LayoutParams(n, (int)(n2 / w));
            layoutParams.gravity = 17;
        }
        else {
            final int n3 = bs / 2;
            final double w2 = this.D.w;
            final double n4 = n3;
            Double.isNaN(n4);
            layoutParams = new FrameLayout$LayoutParams((int)(n4 * w2), n3);
            layoutParams.gravity = 17;
        }
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void T(final Bitmap bitmap) {
        final wqv j = this.J;
        if (j != null) {
            j.aO(bitmap);
        }
        else {
            final wqv i = this.I;
            if (i != null) {
                i.aO(bitmap);
            }
            else {
                final wse l = this.L;
                if (l != null) {
                    l.aL(bitmap);
                }
                else {
                    final wse m = this.M;
                    if (m != null) {
                        m.aL(bitmap);
                    }
                }
            }
        }
        final wqv k = this.J;
        if (k != null) {
            k.aL();
            this.cp((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT", true);
            return;
        }
        final wqv i2 = this.I;
        if (i2 != null) {
            i2.aL();
            this.cp((br)this.I, "CHOOSE_THUMBNAIL_FRAGMENT", true);
            return;
        }
        final wse l2 = this.L;
        if (l2 != null) {
            this.cp((br)l2, "INVITE_SCREEN_FRAGMENT", true);
            return;
        }
        final wse m2 = this.M;
        if (m2 != null) {
            this.cp((br)m2, "SCHEDULED_COSTREAM_FRAGMENT", true);
            return;
        }
        this.finish();
    }
    
    public final void U(final akph akph) {
        if (this.J != null) {
            this.bD((br)(this.aB = wtm.o(akph, this.aW)), "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
            return;
        }
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void V(final String s) {
        this.ci(s);
    }
    
    public final void W() {
        this.finish();
    }
    
    public final void X(final amiu i) {
        final wqv j = this.J;
        j.getClass();
        this.ab = (i.q != j.aX());
        this.cg(null, this.D.i = i);
    }
    
    public final void Y(final amjt amjt) {
        this.ab = true;
        this.cg(amjt, null);
    }
    
    public final void Z() {
        this.G = null;
        this.H = null;
        this.aR = true;
        this.aS = true;
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void a(final dbj dbj) {
        if (!this.U) {
            final StreamConfig d = this.D;
            this.ct(d.c, d.d.a, 2);
        }
    }
    
    public final void aA() {
        this.finish();
    }
    
    public final void aB(final double w) {
        this.D.w = w;
        this.cn();
        this.ce();
    }
    
    public final void aC(final View view) {
        this.Z.c();
        this.bV(view);
        final wta f = this.F;
        if (f != null) {
            f.am = this.B();
            if (f.al != null && !TextUtils.isEmpty(f.am)) {
                f.al.setContentDescription(f.am);
            }
        }
    }
    
    public final void aD() {
        final wtm ab = this.aB;
        if (ab != null && ab.aw()) {
            final wqv j = this.J;
            if (j != null) {
                this.J(j.aX());
                this.bD((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT");
                if (this.J.au()) {
                    this.J.aa();
                }
            }
            else if (this.M != null) {
                this.J(false);
                this.bD((br)this.M, "SCHEDULED_COSTREAM_FRAGMENT");
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
        if (cs(this.D.d)) {
            this.D.a = true;
            this.E(false);
            this.finish();
            return;
        }
        final wqe onCancelListener = new wqe(this);
        ((AlertDialog$Builder)this.ar.al((Context)this)).setMessage(2132018210).setPositiveButton(17039370, (DialogInterface$OnClickListener)onCancelListener).setNegativeButton(17039360, (DialogInterface$OnClickListener)onCancelListener).setOnCancelListener((DialogInterface$OnCancelListener)onCancelListener).show();
    }
    
    public final void aE(final StreamMetadata d) {
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
            final akls g = d.g;
            if (g != null) {
                d3.g = g;
            }
            final aklt h = d.h;
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
            final ajwe k = d.k;
            if (k != null) {
                d3.k = k;
            }
        }
        this.k.e();
        final wse l2 = this.L;
        final boolean b2 = true;
        Label_0372: {
            if (l2 != null) {
                final wtm ab = this.aB;
                if (ab != null && !ab.am) {
                    this.ab = true;
                    break Label_0372;
                }
            }
            if (this.I != null) {
                final Boolean f2 = d.f;
                this.ab = ((f2 != null && f2) != this.I.aX() && b2);
            }
        }
        if (this.L != null) {
            final wtm ab2 = this.aB;
            if (ab2 == null || ab2.am) {
                if (this.G != null) {
                    this.bq(this.D.j, null);
                }
                return;
            }
        }
        this.bp();
    }
    
    public final void aF() {
        this.ap.l();
    }
    
    public final void aG(final anas anas) {
        this.co(anas);
    }
    
    public final void aH(final alub alub) {
        if (!this.aR) {
            this.cl(alub);
        }
    }
    
    public final void aI(final View view) {
        this.Z.c();
        this.bV(view);
        this.G.aO((CharSequence)this.B());
    }
    
    public final void aJ(final aixf aixf) {
        this.by(aixf);
    }
    
    public final void aK(final aktm aktm) {
        final int n = 0;
        int cu = 0;
        Label_0260: {
            if (aktm == null) {
                cu = n;
            }
            else {
                final Iterator<Object> iterator = ((List<Object>)aktm.f).iterator();
                while (true) {
                    cu = n;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    aore aore;
                    if ((aore = iterator.next().b) == null) {
                        aore = aore.a;
                    }
                    aorf aorf;
                    if ((aorf = aore.b) == null) {
                        aorf = aorf.a;
                    }
                    anyv anyv;
                    if ((anyv = aorf.c) == null) {
                        anyv = anyv.a;
                    }
                    if (anyv.d.size() == 0) {
                        continue;
                    }
                    final Iterator<Object> iterator2 = ((List<Object>)anyv.d).iterator();
                    while (iterator2.hasNext()) {
                        amhr amhr;
                        if ((amhr = iterator2.next().H) == null) {
                            amhr = amhr.a;
                        }
                        if (amhr.b.size() != 0) {
                            for (final amhs amhs : amhr.b) {
                                if ((amhs.b & 0x100) != 0x0) {
                                    amct amct;
                                    if ((amct = amhs.c) == null) {
                                        amct = amct.a;
                                    }
                                    if (amct.b != 1 || (cu = aqsx.cu((int)amct.c)) == 0) {
                                        cu = 1;
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
        if (cu == 0) {
            this.ct(d.c, d.d.a, 2);
            return;
        }
        this.ct(d.c, d.d.a, cu);
    }
    
    public final void aL(final amiu amiu) {
        this.cg(null, amiu);
        this.J(amiu.q);
    }
    
    public final void aM() {
        this.finish();
    }
    
    public final void aN() {
        this.ad = false;
        this.h.post((Runnable)new wpv(this, 9));
    }
    
    public final void aO(final amjt j) {
        this.k.e();
        this.D.j = j;
        this.cb();
        this.bD((br)(this.M = wse.n((String)null, j)), "SCHEDULED_COSTREAM_FRAGMENT");
    }
    
    public final void aP() {
        this.bu();
    }
    
    public final void aQ(final boolean b) {
        final whq l = this.Z.l;
        if (l != null) {
            l.i(b);
        }
    }
    
    public final void aS() {
        this.k.e();
        final wse l = this.L;
        Label_0052: {
            if (l != null) {
                final wsl aa = this.aA;
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
            final wsl aa2 = this.aA;
            if (aa2 == null || aa2.al) {
                if (this.H != null) {
                    this.bq(this.D.j, null);
                }
                return;
            }
        }
        this.bp();
    }
    
    public final void aT(final amiu i) {
        final wqv j = this.J;
        j.getClass();
        this.ab = (i.q != j.aX());
        this.cg(null, this.D.i = i);
    }
    
    public final void aU(final amjt amjt) {
        this.ab = true;
        this.cg(amjt, null);
    }
    
    public final void aV(final amiu i) {
        this.D.i = i;
        wka.b().h = i.q;
    }
    
    public final void aW(final amjt j) {
        this.D.j = j;
        wka.b().h = false;
    }
    
    public final void aX(final String s, final aiqj l) {
        if (this.isDestroyed()) {
            return;
        }
        wka.b().e = s;
        this.ab = true;
        final StreamConfig d = this.D;
        d.c = s;
        d.l = l;
        this.af.post(this.ah);
    }
    
    public final void aY(final apmd b) {
        this.D.B = b;
    }
    
    public final void aZ() {
        this.D.s = true;
        this.ce();
    }
    
    public final void aa(final amiu i) {
        this.D.i = i;
        wka.b().h = i.q;
    }
    
    public final void ab() {
        if (this.M != null) {
            this.cm(true);
            return;
        }
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void ac() {
        if (!zis.s((br)this.L)) {
            return;
        }
        Toast.makeText((Context)this, 2132018240, 0).show();
    }
    
    public final void ad(final akph akph) {
        if (!this.aO) {
            this.bD((br)(this.aB = wtm.o(akph, this.aW)), "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
            return;
        }
        akph.getClass();
        final wsl aa = new wsl();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_GET_BROADCAST_RESPONSE", (Parcelable)new ParcelableMessageLite((MessageLite)akph));
        aa.ag(bundle);
        this.bD((br)(this.aA = aa), "EDIT_SETTINGS_LIVE_SHARED_MDE_FRAGMENT");
        this.H = null;
    }
    
    public final void ae(final String c) {
        this.ci(this.D.c = c);
    }
    
    public final void af(final amjt j) {
        this.D.j = j;
        wka.b().h = false;
    }
    
    public final void ag(final String c) {
        this.D.c = c;
        if (this.K == null) {
            this.K = wqr.a(c, this.aW);
        }
        this.bD((br)this.K, "CAPTURE_THUMBNAIL_FRAGMENT");
    }
    
    public final void ah(final int a, final String x, final String y, final amkc k) {
        final StreamConfig d = this.D;
        d.A = a;
        d.x = x;
        d.y = y;
        d.k = k;
    }
    
    public final void ai() {
        this.ap.l();
    }
    
    public final void aj() {
        final wsl aa = this.aA;
        if (aa != null && aa.aw()) {
            final wqj aa2 = this.aa;
            if (aa2.a > 0) {
                ((ades)aa2).b();
                return;
            }
            final wqv j = this.J;
            if (j != null) {
                this.J(j.aX());
                this.bD((br)this.J, "CONFIRM_THUMBNAIL_FRAGMENT");
                if (this.J.au()) {
                    this.J.aa();
                }
            }
            else if (this.M != null) {
                this.J(false);
                this.bD((br)this.M, "SCHEDULED_COSTREAM_FRAGMENT");
                if (this.M.au()) {
                    this.M.aa();
                }
            }
            else {
                final wse l = this.L;
                if (l != null) {
                    this.bD((br)l, "INVITE_SCREEN_FRAGMENT");
                    if (this.L.au()) {
                        this.L.aa();
                    }
                }
            }
        }
        else {
            final wqj aa3 = this.aa;
            if (aa3.a > 0) {
                ((ades)aa3).b();
                return;
            }
            this.finish();
        }
    }
    
    public final void ak(final View view) {
        this.Z.c();
        this.bV(view);
        final String b = this.B();
        final wsl h = this.H;
        if (h != null && b != null) {
            h.aK((CharSequence)b);
        }
    }
    
    public final void al(final alub alub) {
        if (!this.aS) {
            this.cf(alub);
        }
    }
    
    public final void am(final alub alub) {
        this.ch(alub);
    }
    
    public final void an(final alub alub) {
        if (!this.aR) {
            this.cl(alub);
        }
    }
    
    public final void ao(final anas anas) {
        this.co(anas);
    }
    
    public final void ap(final aixf aixf) {
        this.by(aixf);
    }
    
    public final void aq(int cu, final amjs amjs, final ajmo ajmo, final String s, final ajut ajut, final boolean b) {
        this.setRequestedOrientation(-1);
        final ViewGroup$LayoutParams layoutParams = this.aJ.getLayoutParams();
        if (layoutParams.height != -1 && layoutParams.width != -1) {
            tpe.aF((View)this.aJ, tpe.aE(-1, -1), (Class)ViewGroup$LayoutParams.class);
        }
        this.bI("off");
        if (cu != 0 && cu != 26 && cu != 31) {
            if (cu != 33) {
                if (cu != 21) {
                    if (cu != 22) {
                        String string = s;
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            string = this.getString(2132018277);
                        }
                        if (b) {
                            this.ck(null, string, ajut);
                        }
                        else {
                            this.cj(wrc.d, string);
                        }
                    }
                    else {
                        final wtm g = this.G;
                        if (g != null) {
                            this.bD((br)g, "PRE_STREAM_FRAGMENT");
                        }
                        else {
                            final wsl h = this.H;
                            if (h != null) {
                                this.bD((br)h, "LIVE_SHARED_MDE_FRAGMENT");
                            }
                        }
                        ((AlertDialog$Builder)this.ar.al((Context)this)).setTitle(2132018277).setMessage(2132018275).setPositiveButton(2132018276, (DialogInterface$OnClickListener)new jjm(this, 19)).setNegativeButton(2132018278, (DialogInterface$OnClickListener)new jjm(this, 20)).setCancelable(false).show();
                    }
                }
                else {
                    this.cj(wrc.d, this.getString(2132018246));
                }
            }
            else {
                this.k.f();
                this.ck(amjs, s, ajut);
            }
        }
        else if (b) {
            this.k.f();
            if (cu == 26 && amjs == null && ajmo == null && s == null && ajut == null) {
                this.finish();
                return;
            }
            if (this.U) {
                if (ajmo != null) {
                    this.bD((br)(this.az = wtb.r(ajmo)), "POST_COSTREAM_FRAGMENT");
                }
                else {
                    this.finish();
                }
            }
            else {
                final akcn f = ((arwh)this.am.b).f();
                apin apin;
                if (f != null) {
                    if ((apin = f.h) == null) {
                        apin = apin.a;
                    }
                }
                else {
                    apin = apin.a;
                }
                if (apin.c) {
                    if (amjs == null) {
                        final ahaz builder = ((ahbh)aktl.a).createBuilder();
                        final String c = this.D.c;
                        builder.copyOnWrite();
                        final aktl aktl = (aktl)builder.instance;
                        c.getClass();
                        aktl.b |= 0x2;
                        aktl.d = c;
                        teu.n((aun)this, this.ao.e(builder, this.v, null), (ttg)new vll(this, 4), (ttg)new vll(this, 5));
                    }
                    else {
                        final StreamConfig d = this.D;
                        final String c2 = d.c;
                        final String a = d.d.a;
                        if ((cu = aqsx.cu(amjs.f)) == 0) {
                            cu = 1;
                        }
                        this.ct(c2, a, cu);
                    }
                }
                this.ck(amjs, s, ajut);
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
    
    public final void ar() {
        this.Z.e(true);
        this.bX();
    }
    
    public final void as(final boolean q) {
        this.D.q = q;
    }
    
    public final void at() {
        this.Z.e(false);
    }
    
    public final void au(final boolean b) {
        this.Z.e(b);
        if (b) {
            this.bX();
            return;
        }
        this.bY();
    }
    
    public final void av() {
        this.Z.e(false);
        this.bY();
        final tpz av = this.av;
        if (av != null) {
            av.enable();
        }
        if (zis.t((Activity)this)) {
            this.Z.f(this.getWindowManager().getDefaultDisplay().getRotation());
        }
    }
    
    public final void aw(final long n) {
        final StreamConfig d = this.D;
        d.n = n;
        if (d.r) {
            final int n2 = this.bR() + 1;
            if (n2 <= this.am.r()) {
                if (this.am.y()) {
                    teu.n((aun)this, ((qqr)this.as.a).b((aezf)new fqt(n2, 10), (Executor)afum.a), (ttg)won.i, (ttg)won.j);
                }
                else {
                    this.i.execute((Runnable)new wip(this, n2, 6));
                }
            }
        }
        this.ce();
    }
    
    public final void ax(final View view) {
        this.Z.c();
        this.bV(view);
    }
    
    public final void ay(wgx h) {
        final wuv z = this.Z;
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
            z.q.K((whe)h);
            return;
        }
        ttr.m("CameraStreamViewManager", "Pipeline render target already set.");
    }
    
    public final void az(aiqj a) {
        aiqj f = null;
        Label_0034: {
            if (a != null) {
                f = a;
                if (!((ahbc)a).ry((ahaq)VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint)) {
                    break Label_0034;
                }
            }
            a = vdb.a("FEmy_videos");
            f = this.o.f(a);
        }
        vcx.a((vcy)this.l, f);
        this.finish();
    }
    
    public final void b() {
        this.finish();
    }
    
    public final void bA(final boolean b) {
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
            final wuv z = this.Z;
            tbi.f();
            z.d.b(b);
            z.k = new whh();
            z.q.K((whe)z.d);
            z.q.K((whe)z.k);
            if (z.a) {
                z.e.e = (wgj)new wur(z);
            }
            else {
                final whj f = z.f;
                if (f != null) {
                    f.e();
                }
                final Activity c = z.c;
                z.f = new whj();
                final whj f2 = z.f;
                z.g = new wgq(f2);
                z.q.U(f2);
                final wgx wgx = new wgx((whe)z.g);
                z.q.K((whe)wgx);
                z.i = new wgo(wkb.S((Context)z.c, 2131951635), (byte[])null, (byte[])null, (byte[])null);
                z.j = new wgf((whi)new wus(z, 0));
                z.e.e = (wgj)new wut(z, wgx);
            }
            this.an.S();
            this.aJ.setVisibility(0);
            final Parcel ax2 = this.ax;
            if (ax2 != null) {
                ax2.recycle();
                this.ax = null;
            }
            this.aV = true;
        }
    }
    
    public final void bB() {
        if (TextUtils.isEmpty((CharSequence)this.D.c)) {
            ttr.b("Trying to go live without the necessary state");
            this.cj(wrc.d, this.getString(2132018252));
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
                if (zis.v((Context)this)) {
                    this.cc();
                    return;
                }
                ((qt)this).startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:".concat(String.valueOf(this.getPackageName())))), 1001);
                return;
            }
        }
        final wsr ai = this.aI;
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
            final amkc k = d3.k;
            final long n = d3.n;
            final long o = d3.o;
            tvb.n(c);
            final wsr ai2 = new wsr();
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
                adyf.aA(bundle, "ARG_STREAM_RENDERER", (MessageLite)k);
            }
            bundle.putLong("ARG_TIMER_START_STREAM", n);
            bundle.putLong("ARG_TIMER_DURATION_STREAM", o);
            ai2.ag(bundle);
            this.aI = ai2;
        }
        else if (this.U && this.aT && !this.D.s) {
            ai.aE.s();
        }
        final tpz av = this.av;
        if (av != null) {
            av.disable();
        }
        (this.av = new tpz((Context)this, this.getWindowManager(), (tpy)this)).enable();
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
            tpe.aF((View)this.aJ, tpe.aE(this.bT(), this.bS()), (Class)ViewGroup$LayoutParams.class);
        }
        final StreamConfig d4 = this.D;
        final int t = d4.t;
        if (t != -1) {
            this.Z.f(t);
        }
        else {
            d4.t = this.getWindowManager().getDefaultDisplay().getRotation();
        }
        this.bZ();
        final wsr ai3 = this.aI;
        if (ai3 != null) {
            this.cp((br)ai3, "LIVE_STREAM_FRAGMENT", true);
        }
        this.I = null;
        wka.b().e = this.D.c;
        final wka b2 = wka.b();
        int j;
        if (!this.D.e) {
            j = 2;
        }
        else {
            j = 3;
        }
        b2.j = j;
    }
    
    public final void bC() {
        if (this.aV) {
            this.an.T();
            final wuv z = this.Z;
            tbi.f();
            z.e.f();
            if (!z.a) {
                final whj f = z.f;
                if (f != null) {
                    f.e();
                }
                z.q.N((Runnable)new wup(z.i, 2));
            }
            final whq l = z.l;
            if (l != null) {
                l.e();
            }
            this.aJ.setVisibility(4);
            this.aV = false;
        }
    }
    
    public final void bD(final br br, final String s) {
        this.cp(br, s, false);
    }
    
    public final void bE() {
        final wqv j = this.J;
        if (j != null && j.aw()) {
            this.J = null;
            this.cm(true);
            return;
        }
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void bF() {
        this.P.a(null);
        final wqm k = this.k;
        k.b = true;
        k.g();
    }
    
    public final void bG(final View view) {
        this.Z.c();
        this.bV(view);
        final wqv i = this.I;
        if (i != null && i.aw()) {
            this.I.aQ(this.B());
            return;
        }
        final wqv j = this.J;
        if (j != null && j.aw()) {
            this.J.aQ(this.B());
        }
    }
    
    public final void bH() {
        if (this.Y && !zis.t((Activity)this)) {
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
    
    public final boolean bI(final String s) {
        final wuv z = this.Z;
        tbi.f();
        return z.e.l(s);
    }
    
    public final boolean bJ() {
        return this.k.d && this.aZ;
    }
    
    public final boolean bK(int n, int integer, int n2, final wqo wqo) {
        if (!this.Z.e.b) {
            ((MediaActionSound)((arkg)((ulb)this.x.a()).c).a()).play(0);
        }
        final wuv z = this.Z;
        wqo.getClass();
        final wpy wpy = new wpy(wqo);
        tbi.f();
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
        adkp.H(n2 > 0);
        adkp.H(d > 0);
        adkp.H(rect.height() > 0);
        final int integer2 = ((Context)c).getResources().getInteger(2131492965);
        integer = ((Context)c).getResources().getInteger(2131492964);
        n2 = Math.round(n2 * (float)d / rect.height()) / integer;
        final Point point = new Point(integer2 * n2, integer * n2);
        if (point.x >= 4 && point.y >= 4 && point.x + n <= n3 && point.y + n4 <= d) {
            z.k.f(n3, d, (wgd)new wuu(z, b, n, n4, point, (wgd)wpy));
            return true;
        }
        return false;
    }
    
    public final boolean bL() {
        final wuv z = this.Z;
        tbi.f();
        return z.e.k("torch");
    }
    
    public final void bM(final float n) {
        final wuv z = this.Z;
        tbi.f();
        z.e.m(n);
    }
    
    public final void bN(final int bd) {
        this.bd = bd;
        this.cm(false);
    }
    
    public final ahaz bO(final StreamMetadata streamMetadata) {
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
        akls g = streamMetadata.g;
        Date j = streamMetadata.j;
        final ajwe k = streamMetadata.k;
        final wll a2 = wll.a;
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
        if (n == n3) {
            n = 0;
        }
        final boolean equals3 = Objects.equals((Object)i, (Object)d2.i);
        int n5 = (n4 ^ 0x1) | (((equals2 ^ true) | (equals ^ true)) ? 1 : 0);
        wll wll2;
        if (!equals3) {
            wll wll;
            if (i == null) {
                wll = wll.b;
            }
            else {
                wll = wll.a((Object)i);
            }
            n5 = 1;
            wll2 = wll;
        }
        else {
            wll2 = a2;
        }
        final boolean equals4 = Objects.equals((Object)c, (Object)d2.c);
        Boolean b2;
        if (!equals4) {
            b2 = c;
        }
        else {
            b2 = null;
        }
        final boolean equals5 = Objects.equals((Object)d3, (Object)d2.d);
        if (equals5) {
            d3 = null;
        }
        if (equals5) {
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
        final boolean equals6 = Objects.equals((Object)e, (Object)d2.e);
        if (equals6) {
            e = null;
        }
        final boolean equals7 = Objects.equals((Object)f, (Object)d2.f);
        Boolean b3;
        if (!equals7) {
            b3 = f;
        }
        else {
            b3 = null;
        }
        int n7 = 0;
        wll wll3 = null;
        Label_0484: {
            if (!(equals7 ^ true)) {
                n7 = (((equals5 ^ true) ? 1 : 0) | (((equals4 ^ true) ? 1 : 0) | n5) | (n6 ^ 0x1) | ((equals6 ^ true) ? 1 : 0));
                if (Objects.equals((Object)k, (Object)d2.k)) {
                    wll3 = a2;
                    break Label_0484;
                }
            }
            if (f && k != null && (k.b & 0x4) != 0x0) {
                wll3 = wll.a((Object)k.e);
            }
            else {
                wll3 = wll.b;
            }
            n7 = 1;
        }
        aklt aklt;
        if (g != null && !Objects.equals((Object)g, (Object)d2.g)) {
            final akls g2 = d2.g;
            final ahaz builder = aklt.a.createBuilder();
            if (g2 == null || g.c != g2.c) {
                builder.copyOnWrite();
                aklt.a((aklt)builder.instance);
            }
            if ((g.b & 0x10) != 0x0 && (g2 == null || !TextUtils.equals((CharSequence)g.f, (CharSequence)g2.f))) {
                builder.copyOnWrite();
                aklt.d((aklt)builder.instance);
            }
            else if ((g.b & 0x8) != 0x0 && (g2 == null || g.e != g2.e)) {
                builder.copyOnWrite();
                aklt.c((aklt)builder.instance);
            }
            if ((g.b & 0x20) != 0x0 && (g2 == null || g.g != g2.g)) {
                builder.copyOnWrite();
                aklt.e((aklt)builder.instance);
            }
            if ((g.b & 0x40) != 0x0 && (g2 == null || !TextUtils.equals((CharSequence)g.h, (CharSequence)g2.h))) {
                builder.copyOnWrite();
                aklt.f((aklt)builder.instance);
            }
            if (g2 == null || g.d != g2.d) {
                builder.copyOnWrite();
                aklt.b((aklt)builder.instance);
            }
            aklt = (aklt)builder.build();
            n7 = 1;
        }
        else {
            g = null;
            aklt = null;
        }
        final boolean b4 = j == null;
        final Date j2 = d2.j;
        Label_0947: {
            Label_0944: {
                if (!(b4 ^ j2 == null)) {
                    if (j != null) {
                        final Calendar instance = Calendar.getInstance();
                        instance.setTime(j);
                        final Calendar instance2 = Calendar.getInstance();
                        instance2.setTime(j2);
                        if (instance == null || instance2 == null) {
                            throw new IllegalArgumentException("The date must not be null");
                        }
                        if (instance.get(0) != instance2.get(0) || instance.get(1) != instance2.get(1) || instance.get(6) != instance2.get(6)) {
                            break Label_0944;
                        }
                    }
                    j = null;
                    break Label_0947;
                }
            }
            n7 = n2;
        }
        if (n7 != 0) {
            return this.r.o(this.D.c, a, b, c, d3, e, b3, g, aklt, n, l, wll2, j, wll3, (byte[])null);
        }
        return null;
    }
    
    public final void bP() {
        this.bd = 3;
        this.cm(false);
    }
    
    public final void bQ(final float n, final float n2, final afhd afhd) {
        final wuv z = this.Z;
        tbi.f();
        z.e.n(n, n2, z.m.c, afhd);
    }
    
    public final void ba() {
        final wqv j = this.J;
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
        wka.b().h();
        this.D.z = z;
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void bb(final amkc k, final String x, final String y) {
        final StreamConfig d = this.D;
        d.c = k.i;
        d.y = y;
        d.x = x;
        d.k = k;
        this.bW();
        this.bB();
    }
    
    public final void bc() {
        this.bW();
    }
    
    public final void bd(final int g) {
        final wqv i = this.I;
        if (i != null && i.aw()) {
            this.D.g = g;
            this.ce();
        }
    }
    
    public final void be() {
        this.bC();
    }
    
    public final void bf() {
        this.bC();
    }
    
    public final void bg(final String s, final aiqj l) {
        if (this.isDestroyed()) {
            return;
        }
        wka.b().e = s;
        this.ab = true;
        final StreamConfig d = this.D;
        d.c = s;
        d.l = l;
        this.ce();
        this.af.post(this.ah);
    }
    
    public final void bh(final apmd b) {
        this.D.B = b;
    }
    
    public final void bj(final Choreographer$FrameCallback choreographer$FrameCallback) {
        this.t.postFrameCallback(choreographer$FrameCallback);
    }
    
    public final void bk(final int n) {
        if (zis.v((Context)this)) {
            this.cc();
            return;
        }
        if (n > 0) {
            new Handler().postDelayed((Runnable)new wip(this, n, 7), 200L);
            return;
        }
        tpe.x((Context)this, 2132018245, 1);
        this.finish();
    }
    
    public final void bl(final long n) {
        teu.n((aun)this, ((qqr)this.as.a).b((aezf)new fmv(n, 10), (Executor)afum.a), (ttg)won.c, (ttg)won.d);
    }
    
    public final void bm(final rgs rgs) {
        rgs.i((rgw)this);
    }
    
    public final void bn() {
        teu.o((aun)this, ((qqr)this.as.a).b((aezf)wpw.b, (Executor)afum.a), (ttg)won.e, (ttg)won.f);
    }
    
    public final void bo(final wka wka, final StreamConfig streamConfig) {
        wka.h();
        if (streamConfig != null) {
            if (!streamConfig.a) {
                wka.e = streamConfig.c;
                wka.f = this.am.z();
                wka.g = cs(streamConfig.d);
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
                wka.k = k;
            }
        }
    }
    
    public final void bp() {
        this.cb();
        final StreamConfig d = this.D;
        if (d.j != null) {
            this.bD((br)(this.K = wqr.a(d.c, this.aW)), "CAPTURE_THUMBNAIL_FRAGMENT");
        }
        else if (d.i != null) {
            final boolean b = true;
            boolean b2 = false;
            Label_0096: {
                if (d != null) {
                    final StreamMetadata d2 = d.d;
                    if (d2 != null && !TextUtils.isEmpty((CharSequence)d2.a)) {
                        b2 = true;
                        break Label_0096;
                    }
                }
                b2 = false;
            }
            final StreamConfig d3 = this.D;
            boolean b3 = false;
            Label_0158: {
                if (d3 != null) {
                    final amiu i = d3.i;
                    if (i != null) {
                        ajut ajut;
                        if ((ajut = i.m) == null) {
                            ajut = ajut.a;
                        }
                        if (!TextUtils.isEmpty((CharSequence)acak.b(ajut))) {
                            b3 = true;
                            break Label_0158;
                        }
                    }
                }
                b3 = false;
            }
            boolean b4 = b;
            if (!b2) {
                b4 = (b3 && b);
            }
            adkp.H(b4);
            final StreamConfig d4 = this.D;
            this.bD((br)(this.I = wqv.r(d4.i, d4.c, this.aW, this.ab, this.bR())), "CHOOSE_THUMBNAIL_FRAGMENT");
            this.I.aQ(this.B());
        }
        this.ab = false;
        final StreamConfig d5 = this.D;
        if (d5 != null) {
            final amiu j = d5.i;
            if (j != null && (j.b & 0x80000) != 0x0) {
                this.J(j.q);
            }
        }
    }
    
    public final void bq(final amjt j, final aiqj aiqj) {
        boolean b = true;
        if (j == null) {
            b = (aiqj != null && b);
        }
        adkp.Q(b);
        if (j != null) {
            final StreamConfig d = this.D;
            d.j = j;
            this.L = wse.n(d.c, j);
        }
        else if (aiqj != null) {
            final String c = this.D.c;
            final wse l = new wse();
            final Bundle bundle = new Bundle();
            adyf.aA(bundle, "ARG_BROADCAST_CREATED_ENDPOINT", (MessageLite)aiqj);
            if (c != null) {
                bundle.putString("ARG_VIDEO_ID", c);
            }
            l.ag(bundle);
            this.L = l;
        }
        this.bD((br)this.L, "INVITE_SCREEN_FRAGMENT");
    }
    
    public final void br() {
        this.bA(false);
        final String d = this.m.c().d();
        this.D.b = d;
        if (this.H == null) {
            final String an = this.aN;
            final wsl h = new wsl();
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
            final wsl h2 = this.H;
            if (h2 != null && zis.s((br)h2)) {
                h2.aM();
                h2.q(5);
            }
        }
        else if (this.H.au()) {
            this.H.r();
            this.H.aN();
            this.J(false);
        }
        this.bD((br)this.H, "LIVE_SHARED_MDE_FRAGMENT");
        this.H.aK((CharSequence)this.B());
    }
    
    public final void bs() {
        ((fa)this).findViewById(2131431794).setVisibility(0);
        ((fa)this).findViewById(2131432381).setVisibility(0);
        ((fa)this).findViewById(2131431775).setVisibility(0);
        ((fa)this).findViewById(2131429499).setVisibility(0);
    }
    
    public final void bt() {
        this.D.b = this.m.c().d();
        this.P.setVisibility(8);
        final wta f = this.F;
        if (f == null) {
            final String r = this.R;
            final String c = this.D.c;
            final wta f2 = new wta();
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
            f.ao = (vfp)f.ag.a(f.ah.c());
            f.p(f.ap, 5);
        }
        this.cn();
        this.bD((br)this.F, "PARTICIPANT_PRE_JOIN_FRAGMENT");
    }
    
    public final void bu() {
        if (!TextUtils.isEmpty((CharSequence)this.R)) {
            this.bt();
            return;
        }
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void bv() {
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
                        string = this.getString(2132018269, new Object[] { stringExtra2 });
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
                    s2 = null;
                    s3 = null;
                }
                final int aw = this.aW;
                final String an = this.aN;
                final boolean aq = this.aQ;
                final wtm g = new wtm();
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
                final akls g2 = d4.g;
                final int aw2 = this.aW;
                final aiqj j = d3.l;
                final Date k = d4.j;
                final ajwe m = d4.k;
                final wtm g3 = new wtm();
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
            this.ca();
        }
        else if (this.G.au()) {
            this.G.r();
            this.J(this.G.aU());
        }
        this.bD((br)this.G, "PRE_STREAM_FRAGMENT");
        this.G.aO((CharSequence)this.B());
    }
    
    public final void bw(final StreamConfig streamConfig) {
        this.ac = true;
        ((AlertDialog$Builder)this.ar.al((Context)this)).setTitle(2132018217).setMessage(2132018215).setPositiveButton(2132018216, (DialogInterface$OnClickListener)new syf(this, streamConfig, 3)).setNegativeButton(2132018214, (DialogInterface$OnClickListener)new jjm(this, 18)).setOnKeyListener((DialogInterface$OnKeyListener)new gqq(this, 8)).setCancelable(false).show();
    }
    
    public final void bx(final StreamConfig streamConfig, final int n) {
        final String c = streamConfig.c;
        c.getClass();
        this.r.i(c, new wqa(this, streamConfig, n));
    }
    
    final void by(aixf aixf) {
        final roa aw = new roa((Context)this, aixf, this.ar, (vcy)this.l, new afhd(this), (Object)this, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.aw = aw;
        final acba al = aw.j.al(aw.a);
        aixf = aw.b;
        ajut ajut;
        if ((aixf.b & 0x1) != 0x0) {
            if ((ajut = aixf.c) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        ((AlertDialog$Builder)al).setTitle((CharSequence)acak.b(ajut));
        aida aida;
        if ((aida = aw.b.i) == null) {
            aida = aida.a;
        }
        Spanned spanned;
        if ((aida.b & 0x1) != 0x0) {
            aida aida2;
            if ((aida2 = aw.b.i) == null) {
                aida2 = aida.a;
            }
            aicz aicz;
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
            ajut ajut2;
            if ((ajut2 = aicz.i) == null) {
                ajut2 = ajut.a;
            }
            spanned = acak.b(ajut2);
        }
        else {
            aixf = aw.b;
            ajut ajut3;
            if ((aixf.b & 0x2000000) != 0x0) {
                if ((ajut3 = aixf.r) == null) {
                    ajut3 = ajut.a;
                }
            }
            else {
                ajut3 = null;
            }
            spanned = acak.b(ajut3);
        }
        final aixf b = aw.b;
        final aida h = b.h;
        aida a;
        if (h == null) {
            a = aida.a;
        }
        else {
            a = h;
        }
        Spanned spanned2;
        if ((a.b & 0x1) != 0x0) {
            aida a2;
            if ((a2 = h) == null) {
                a2 = aida.a;
            }
            aicz aicz2;
            if ((aicz2 = a2.c) == null) {
                aicz2 = aicz.a;
            }
            ajut ajut4;
            if ((ajut4 = aicz2.i) == null) {
                ajut4 = ajut.a;
            }
            spanned2 = acak.b(ajut4);
        }
        else {
            ajut ajut5;
            if ((b.b & 0x1000000) != 0x0) {
                if ((ajut5 = b.q) == null) {
                    ajut5 = ajut.a;
                }
            }
            else {
                ajut5 = null;
            }
            spanned2 = acak.b(ajut5);
        }
        ((AlertDialog$Builder)al).setPositiveButton((CharSequence)spanned2, (DialogInterface$OnClickListener)null);
        ((AlertDialog$Builder)al).setNegativeButton((CharSequence)spanned, (DialogInterface$OnClickListener)null);
        final View inflate = ((LayoutInflater)aw.a.getSystemService("layout_inflater")).inflate(2131625696, (ViewGroup)null);
        aw.f = (YouTubeTextView)inflate.findViewById(2131429843);
        aw.e = (ContentLoadingProgressBar)inflate.findViewById(2131430654);
        aw.f.setText(aakt.t(aw.b, aw.c));
        ((AlertDialog$Builder)al).setView(inflate);
        aw.f.setMovementMethod(LinkMovementMethod.getInstance());
        (aw.d = ((AlertDialog$Builder)al).create()).setOnShowListener((DialogInterface$OnShowListener)new eyk(aw, 18));
        final AlertDialog d = aw.d;
        int dimensionPixelSize = 0;
        d.setCancelable(false);
        aw.d.setCanceledOnTouchOutside(false);
        aw.d.show();
        int dimensionPixelSize2;
        if (tpe.bq(aw.a)) {
            dimensionPixelSize2 = ((rq)aw.a).a().getDimensionPixelSize(2131165445);
            dimensionPixelSize = ((rq)aw.a).a().getDimensionPixelSize(2131165446);
        }
        else {
            dimensionPixelSize2 = (int)(Math.min(tpe.bd(aw.a), tpe.bb(aw.a)) * ((rq)aw.a).a().getFraction(2131361798, 1, 1));
        }
        final WindowManager$LayoutParams attributes = aw.d.getWindow().getAttributes();
        attributes.height = dimensionPixelSize2;
        int width = dimensionPixelSize;
        if (dimensionPixelSize == 0) {
            width = attributes.width;
        }
        attributes.width = width;
        aw.d.getWindow().setAttributes(attributes);
        this.o.l((wzz)new wyt(xaa.c(31777)));
        this.o.l((wzz)new wyt(xaa.c(31778)));
    }
    
    public final void bz(final View view) {
        this.bA(true);
        this.Z.e(false);
        this.P.a(view);
    }
    
    public final void c() {
        this.ca();
    }
    
    protected void e(final ViewStub viewStub) {
    }
    
    public final void f(final boolean b) {
        this.aw.getClass();
        final String string = ((fa)this).getResources().getString(2132018239);
        Toast.makeText((Context)this, (CharSequence)string, 0).show();
        ttr.b(String.valueOf(string).concat(", accept live streaming terms of service request failed."));
        if (b) {
            final roa aw = this.aw;
            aw.d.getClass();
            aw.g.setEnabled(true);
            aw.h.setEnabled(true);
            aw.e.a();
            return;
        }
        this.aw.a();
    }
    
    public final void g() {
        final roa aw = this.aw;
        aw.getClass();
        aw.a();
    }
    
    public final void h() {
        this.finish();
    }
    
    public final void i() {
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018239), 0).show();
        this.finish();
    }
    
    public final void j(final amkc k, final String s, final String s2) {
        this.D.k = k;
        this.U = true;
        this.bb(k, s, s2);
    }
    
    public final wjb k() {
        final wsr ai = this.aI;
        if (ai != null && ai.aw()) {
            return (wjb)this.aI;
        }
        return null;
    }
    
    public final void l() {
        if (this.aO) {
            this.br();
            return;
        }
        this.bv();
    }
    
    public final void m(final aiqj m) {
        this.D.m = m;
    }
    
    public final void mU() {
    }
    
    public final void mV() {
        this.ca();
    }
    
    public final void mW(final boolean b, final int n) {
        this.mx(b, n);
    }
    
    public final /* bridge */ void mX(final Object o) {
        this.aK((aktm)o);
    }
    
    public final void mY() {
    }
    
    public final void mZ(final albo albo) {
        if ((albo.b & 0x4) != 0x0) {
            anuv anuv;
            if ((anuv = albo.e) == null) {
                anuv = anuv.a;
            }
            this.bD((br)(this.az = wtb.r((ajmo)anuv.rx((ahaq)ElementRendererOuterClass.elementRenderer))), "POST_COSTREAM_FRAGMENT");
            return;
        }
        final wsr ai = this.aI;
        if (ai != null && ai.aw()) {
            this.aI.aW(false);
            this.aI.aU();
        }
    }
    
    public final void mx(final boolean b, final int n) {
        final wsr ai = this.aI;
        if (ai != null && ai.au()) {
            ai.aQ(b, n);
            if (!zis.t((Activity)this)) {
                this.Z.f(this.getWindowManager().getDefaultDisplay().getRotation());
            }
        }
    }
    
    public final void na(final int n) {
        final wsr ai = this.aI;
        if (ai != null && ai.aw()) {
            this.aI.aW(false);
            this.aI.aU();
        }
    }
    
    public final void o() {
        final wse l = this.L;
        if (l != null && l.aw()) {
            this.L.q();
            return;
        }
        final wse m = this.M;
        if (m != null && m.aw()) {
            this.M.q();
            return;
        }
        this.finish();
    }
    
    protected final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1001) {
            this.bk(10);
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
        this.ce();
        final zmf m = this.m;
        final StreamConfig d2 = this.D;
        final String c = d2.c;
        final boolean r = d2.r;
        final boolean s = d2.s;
        final String x = d2.x;
        final String y = d2.y;
        final amkc k = d2.k;
        final long n3 = d2.n;
        final long o = d2.o;
        final boolean b = d2.p && d2.q;
        final boolean c2 = this.am.s().c;
        final boolean b2 = this.am.s().b;
        final alut s2 = this.am.s();
        ((Context)this).startService(ScreencastHostService.n((Context)this, m, c, r, x, y, k, n3, o, b, c2, b2, s2 != null && s2.m, this.am.s().l, this.D.e, this.am.s().f, intent));
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
        final wtm wtm = (wtm)this.E.f("PRE_STREAM_FRAGMENT");
        final wsl wsl = (wsl)this.E.f("LIVE_SHARED_MDE_FRAGMENT");
        final wta wta = (wta)this.E.f("PARTICIPANT_PRE_JOIN_FRAGMENT");
        final wqv wqv = (wqv)this.E.f("CHOOSE_THUMBNAIL_FRAGMENT");
        final wte wte = (wte)this.E.f("POST_STREAM_FRAGMENT");
        final wtb wtb = (wtb)this.E.f("POST_COSTREAM_FRAGMENT");
        final wre wre = (wre)this.E.f("ERROR_STATE_FRAGMENT");
        final wsr wsr = (wsr)this.E.f("LIVE_STREAM_FRAGMENT");
        final rob rob = (rob)this.E.f("LIVE_ENABLEMENT_FRAGMENT_NAME");
        final acuy acuy = (acuy)this.E.f("PERMISSION_REQUEST_FRAGMENT");
        final wqw wqw = (wqw)this.E.f("COOL_OFF_FRAGMENT_NAME");
        final wto wto = (wto)this.E.f("SAFEGUARD_FRAGMENT");
        final wto wto2 = (wto)this.E.f("CREATOR_EDUCATION_FRAGMENT");
        if ((wte != null && wte.aw()) || (wre != null && wre.aw())) {
            this.finish();
            return;
        }
        if ((wtb != null && wtb.aw()) || (wre != null && wre.aw())) {
            this.finish();
            return;
        }
        if (wtm != null && wtm.aw()) {
            if (((fa)this).findViewById(2131429690).isShown()) {
                this.V.b();
            }
            wtm.aK();
            return;
        }
        if (wsl != null && wsl.aw()) {
            wsl.s();
            return;
        }
        if (wta != null && wta.aw()) {
            wta.q();
            return;
        }
        final wtm ab = this.aB;
        if (ab != null && ab.aw()) {
            this.aB.aK();
            return;
        }
        final wsl aa = this.aA;
        if (aa != null && aa.aw()) {
            this.aA.s();
            return;
        }
        final wrb q = this.Q;
        if (q != null && q.aw()) {
            this.Q.d();
            return;
        }
        if (wqv != null && wqv.aw()) {
            wqv.aN();
            return;
        }
        final wqv j = this.J;
        if (j != null && j.aw()) {
            this.J.aN();
            return;
        }
        final wse m = this.M;
        if (m != null && m.aw()) {
            this.M.q();
            return;
        }
        final wtr ac = this.aC;
        if (ac != null && ac.aw()) {
            this.aC.q();
            return;
        }
        if (rob != null && ((br)rob).aw()) {
            rob.aM();
            return;
        }
        if (wsr != null && wsr.aw()) {
            if (wsr.aL) {
                wsr.aN();
            }
            return;
        }
        if (acuy != null && ((br)acuy).aw()) {
            acuy.r();
            return;
        }
        if (wqw != null && wqw.aw()) {
            final vcy a = wqw.a;
            aiqj aiqj;
            if ((aiqj = wqw.c.p) == null) {
                aiqj = aiqj.a;
            }
            a.a(aiqj);
            return;
        }
        if (wto != null && wto.aw()) {
            wto.n();
            return;
        }
        if (wto2 != null && wto2.aw()) {
            wto2.n();
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
        this.bH();
        this.p.l();
        final rob ad = this.aD;
        if (ad != null && ((br)ad).aw()) {
            this.aD.aN(configuration);
        }
        final acuy n = this.N;
        if (n != null && ((br)n).aw()) {
            ((br)this.N).onConfigurationChanged(configuration);
        }
        this.cq(configuration, ((fa)this).findViewById(2131430262));
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle bundle2 = null;
        Bundle bundle3 = null;
        Object o = null;
        Label_0163: {
            if (bundle != null) {
                bundle3 = bundle.getBundle("BUNDLE_INTERACTION_BUNDLE");
                o = null;
            }
            else {
                Object o2 = null;
                Label_0088: {
                    if (!xmm.aq(this.getIntent())) {
                        final Intent intent = this.getIntent();
                        if (intent != null) {
                            final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)intent.getParcelableExtra("navigation_endpoint");
                            if (parcelableMessageLite != null) {
                                o2 = parcelableMessageLite.a((MessageLite)aiqj.a);
                                break Label_0088;
                            }
                        }
                    }
                    o2 = null;
                }
                bundle3 = bundle2;
                o = o2;
                if (o2 == null) {
                    final Intent intent2 = this.getIntent();
                    if (intent2 != null) {
                        final byte[] byteArrayExtra = intent2.getByteArrayExtra("navigation_endpoint");
                        if (byteArrayExtra != null) {
                            try {
                                o = ahbh.parseFrom((ahbh)aiqj.a, byteArrayExtra, ExtensionRegistryLite.getGeneratedRegistry());
                                bundle3 = bundle2;
                                break Label_0163;
                            }
                            catch (final ahca ahca) {}
                        }
                    }
                    o = null;
                    bundle3 = bundle2;
                }
            }
        }
        ((xac)this.o).M(bundle3, (aiqj)o);
        if (o != null && ((ahbc)o).ry((ahaq)LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint)) {
            final LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = (LiveCreationEndpointOuterClass$LiveCreationEndpoint)((ahbc)o).rx((ahaq)LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint);
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
        final wka b2 = wka.b();
        if (this.am.s().j) {
            final ScheduledExecutorService v = this.v;
            final wxx w = this.w;
            final oby s = this.s;
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
                        b2.m((Class)entry.getKey(), (wjz)entry.getValue());
                    }
                }
            }
        }
        this.bo(b2, this.D);
        b2.k((Class)altf.class, 0L);
        b2.k((Class)altj.class, 0L);
        b2.k((Class)alth.class, 0L);
        b2.k((Class)alsx.class, 0L);
        b2.k((Class)alta.class, 0L);
        b2.k((Class)altp.class, 10000L);
        this.Y = false;
        ((qt)this).setContentView(this.g);
        this.E = ((bu)this).getSupportFragmentManager();
        final SurfaceView surfaceView = (SurfaceView)((fa)this).findViewById(2131431794);
        final pvh at = this.at;
        double n;
        if (!this.am.s().i) {
            n = 1.3333333333333333;
        }
        else {
            n = 1.7777777777777777;
        }
        this.Z = new wuv((xib)((eps)at.a).b.eT.a(), (Activity)((eps)at.a).b.d.a(), (xib)((eps)at.a).b.eS.a(), (pvh)((eps)at.a).b.eX.a(), surfaceView, new wgn(n, this.am.s().N), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        this.m.getClass();
        this.q.getClass();
        this.e((ViewStub)((fa)this).findViewById(2131427886));
        this.P = (ViewportOverlay)((fa)this).findViewById(2131432381);
        this.aJ = (SurfaceView)((fa)this).findViewById(2131431794);
        (this.S = (ViewAnimatorHelper)((fa)this).findViewById(2131432363)).setVisibility(8);
        this.cq(((fa)this).getResources().getConfiguration(), ((fa)this).findViewById(2131430262));
        this.aL = this.getString(2132018258);
        this.aM = this.getString(2132018203);
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
            final wtm g = (wtm)this.E.g(bundle, "prestream_fragment");
            this.G = g;
            if (g != null && !TextUtils.equals((CharSequence)z, (CharSequence)"PRE_STREAM_FRAGMENT")) {
                i.m((br)this.G);
            }
            this.H = (wsl)this.E.g(bundle, "live_shared_mde_fragment");
            if (!TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_SHARED_MDE_FRAGMENT")) {
                final wsl h = this.H;
                if (h != null) {
                    i.m((br)h);
                }
            }
            if ((this.F = (wta)this.E.g(bundle, "participant_pre_join_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"PARTICIPANT_PRE_JOIN_FRAGMENT")) {
                i.m((br)this.F);
            }
            if ((this.aB = (wtm)this.E.g(bundle, "edit_settings_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_SETTINGS_PRE_STREAM_FRAGMENT")) {
                i.m((br)this.aB);
            }
            if ((this.aA = (wsl)this.E.g(bundle, "edit_settings_sharedmde_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_SETTINGS_LIVE_SHARED_MDE_FRAGMENT")) {
                i.m((br)this.aA);
            }
            if ((this.aD = (rob)this.E.g(bundle, "live_enablement_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_ENABLEMENT_FRAGMENT_NAME")) {
                i.m((br)this.aD);
            }
            if ((this.I = (wqv)this.E.g(bundle, "choose_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CHOOSE_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.I);
            }
            if ((this.aE = (wqw)this.E.g(bundle, "cool_off_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"COOL_OFF_FRAGMENT_NAME")) {
                i.m((br)this.aE);
            }
            if ((this.Q = (wrb)this.E.g(bundle, "edit_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"EDIT_THUMBNAIL_FRAGMENT_NAME")) {
                i.m((br)this.Q);
            }
            if ((this.J = (wqv)this.E.g(bundle, "confirm_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CONFIRM_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.J);
            }
            if ((this.M = (wse)this.E.g(bundle, "scheduled_costream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"SCHEDULED_COSTREAM_FRAGMENT")) {
                i.m((br)this.M);
            }
            if ((this.K = (wqr)this.E.g(bundle, "capture_thumbnail_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CAPTURE_THUMBNAIL_FRAGMENT")) {
                i.m((br)this.K);
            }
            if ((this.L = (wse)this.E.g(bundle, "invite_screen_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"INVITE_SCREEN_FRAGMENT")) {
                i.m((br)this.L);
            }
            if ((this.aI = (wsr)this.E.g(bundle, "livestream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"LIVE_STREAM_FRAGMENT")) {
                i.m((br)this.aI);
            }
            if ((this.ay = (wte)this.E.g(bundle, "poststream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"POST_STREAM_FRAGMENT")) {
                i.m((br)this.ay);
            }
            if ((this.az = (wtb)this.E.g(bundle, "post_costream_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"POST_COSTREAM_FRAGMENT")) {
                i.m((br)this.az);
            }
            if ((this.aF = (wre)this.E.g(bundle, "errorstate_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"ERROR_STATE_FRAGMENT")) {
                i.m((br)this.aF);
            }
            if ((this.N = (acuy)this.E.g(bundle, "permission_request_fragment")) != null && (!TextUtils.equals((CharSequence)z, (CharSequence)"PERMISSION_REQUEST_FRAGMENT") || !acuq.f((Context)this, LiveCreationActivity.d))) {
                i.m((br)this.N);
            }
            final wto ag = (wto)this.E.g(bundle, "safeguard_fragment");
            this.aG = ag;
            if (ag != null && !TextUtils.equals((CharSequence)z, (CharSequence)"SAFEGUARD_FRAGMENT")) {
                i.m((br)this.aG);
            }
            if ((this.aH = (wto)this.E.g(bundle, "creator_education_fragment")) != null && !TextUtils.equals((CharSequence)z, (CharSequence)"CREATOR_EDUCATION_FRAGMENT")) {
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
            zis.r((Activity)this);
            this.C.a();
        }
    }
    
    protected final void onDestroy() {
        if (this.T == null) {
            this.T = (AudioManager)this.getSystemService("audio");
        }
        this.T.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)this);
        final wuv z = this.Z;
        if (z != null) {
            tbi.f();
            synchronized (z.p) {
                z.o = true;
                final whq l = z.l;
                if (l != null) {
                    l.f();
                }
                monitorexit(z.p);
                z.q.O();
            }
        }
        final xib an = this.an;
        if (an != null) {
            an.O();
            ((Handler)an.b).getLooper().quitSafely();
            this.an = null;
        }
        super.onDestroy();
    }
    
    protected final void onPause() {
        super.onPause();
        final tpz av = this.av;
        if (av != null) {
            av.disable();
        }
        this.Y = true;
        if (this.isFinishing()) {
            this.bC();
        }
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        final usn x = this.X;
        if (x != null) {
            x.b(n, array, array2);
        }
        else {
            ttr.b("No active FragmentPermissionRequester to handle PermissionsResult");
        }
        final acuu ak = this.aK;
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
        this.bH();
        final tpz av = this.av;
        if (av != null) {
            av.enable();
        }
        this.k.f = false;
        if (zis.s((br)this.G)) {
            this.J(this.G.aU());
            return;
        }
        if (zis.s((br)this.H)) {
            this.bA(false);
            return;
        }
        if (zis.s((br)this.aB)) {
            this.J(this.aB.aU());
            return;
        }
        if (zis.s((br)this.aA)) {
            this.J(false);
            return;
        }
        if (zis.s((br)this.I)) {
            this.J(this.I.aX());
            return;
        }
        if (zis.s((br)this.J)) {
            this.J(this.J.aX());
            return;
        }
        if (zis.s((br)this.K)) {
            this.bA(false);
            return;
        }
        if (zis.s((br)this.aI)) {
            this.bA(true);
            return;
        }
        if (!zis.s((br)this.L) && !zis.s((br)this.M)) {
            return;
        }
        this.bA(true);
    }
    
    protected final void onResumeFragments() {
        super.onResumeFragments();
        this.p.f();
    }
    
    protected final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.Y = true;
        final wqw ae = this.aE;
        if (ae != null) {
            this.E.J(bundle, "cool_off_fragment", (br)ae);
        }
        else {
            final wto ag = this.aG;
            if (ag != null && ag.aw()) {
                this.E.J(bundle, "safeguard_fragment", (br)this.aG);
            }
            else {
                final wto ah = this.aH;
                if (ah != null && ah.aw()) {
                    this.E.J(bundle, "creator_education_fragment", (br)this.aH);
                }
                else {
                    final wtm g = this.G;
                    if (g != null) {
                        this.E.J(bundle, "prestream_fragment", (br)g);
                    }
                    else {
                        final wsl h = this.H;
                        if (h != null) {
                            this.E.J(bundle, "live_shared_mde_fragment", (br)h);
                        }
                    }
                }
            }
        }
        final wta f = this.F;
        if (f != null && f.ar()) {
            this.E.J(bundle, "participant_pre_join_fragment", (br)f);
        }
        final wtm ab = this.aB;
        if (ab != null) {
            this.E.J(bundle, "edit_settings_fragment", (br)ab);
        }
        final wsl aa = this.aA;
        if (aa != null) {
            this.E.J(bundle, "edit_settings_sharedmde_fragment", (br)aa);
        }
        final rob ad = this.aD;
        if (ad != null && ((br)ad).ar()) {
            this.E.J(bundle, "live_enablement_fragment", (br)ad);
        }
        final wqv i = this.I;
        if (i != null) {
            this.E.J(bundle, "choose_thumbnail_fragment", (br)i);
        }
        final wqv j = this.J;
        if (j != null && j.ar()) {
            this.E.J(bundle, "confirm_thumbnail_fragment", (br)j);
        }
        final wse m = this.M;
        if (m != null && m.ar()) {
            this.E.J(bundle, "scheduled_costream_fragment", (br)m);
        }
        final wqr k = this.K;
        if (k != null && k.ar()) {
            this.E.J(bundle, "capture_thumbnail_fragment", (br)k);
        }
        final wse l = this.L;
        if (l != null && l.ar()) {
            this.E.J(bundle, "invite_screen_fragment", (br)l);
        }
        final wrb q = this.Q;
        if (q != null && q.ar()) {
            this.E.J(bundle, "edit_thumbnail_fragment", (br)q);
        }
        final wsr ai = this.aI;
        if (ai != null) {
            this.E.J(bundle, "livestream_fragment", (br)ai);
        }
        final wte ay = this.ay;
        if (ay != null) {
            this.E.J(bundle, "poststream_fragment", (br)ay);
        }
        final wtb az = this.az;
        if (az != null) {
            this.E.J(bundle, "post_costream_fragment", (br)az);
        }
        final wre af = this.aF;
        if (af != null) {
            this.E.J(bundle, "errorstate_fragment", (br)af);
        }
        final acuy n = this.N;
        if (n != null) {
            this.E.J(bundle, "permission_request_fragment", (br)n);
        }
        bundle.putParcelable("BUNDLE_STREAM_CONFIG", (Parcelable)this.D);
        final wqm k2 = this.k;
        bundle.putInt("stream_control_state", k2.e);
        bundle.putBoolean("enablement_complete", k2.a);
        bundle.putBoolean("thumbnail_chosen", k2.b);
        bundle.putBoolean("live_stream_complete", k2.d);
        k2.f = true;
        bundle.putBoolean("is_resume_dialog_displayed", this.ac);
        bundle.putParcelable("camera_model_bundle", (Parcelable)this.Z.m);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", ((xac)this.o).L());
    }
    
    protected final void onStart() {
        super.onStart();
        this.Y = false;
        this.j.g((Object)this.ag);
        this.j.f((Object)new wkb());
        if (this.T == null) {
            this.T = (AudioManager)this.getSystemService("audio");
        }
        this.T.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)this, 3, 2);
        if (!this.m.t() && !this.U) {
            this.n.b((Activity)this, (byte[])null, (zmr)null);
        }
        else {
            this.H();
        }
        if (cr(this.getIntent())) {
            this.aJ.setVisibility(4);
        }
        final wqm k = this.k;
        k.c = k.e;
        k.a();
        final wqd au = new wqd(this, 0);
        this.au = (DisplayManager$DisplayListener)au;
        this.u.registerDisplayListener((DisplayManager$DisplayListener)au, this.h);
        this.aZ = true;
        if (this.bJ()) {
            this.bj(this.ai);
        }
    }
    
    protected final void onStop() {
        super.onStop();
        if (this.bU() != null) {
            final StreamConfig d = this.D;
            final wky wky = (wky)this.bU();
            long l;
            if (wky.V) {
                l = wky.h.d() - wky.K;
            }
            else {
                l = wky.L;
            }
            d.o = l;
            this.ce();
        }
        this.u.unregisterDisplayListener(this.au);
        this.j.f((Object)new wkb());
        this.j.m((Object)this.ag);
        this.p.a();
        final CameraStreamViewManager$CameraModelData m = this.Z.m;
        final Parcel obtain = Parcel.obtain();
        m.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.ax = obtain;
        this.bC();
        this.aU = 2;
        this.aZ = false;
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (zis.s((br)this.aI)) {
            final wsr ai = this.aI;
            if (b) {
                ai.aV(true);
            }
        }
    }
    
    public final void p(final aklp aklp) {
        aklm aklm;
        if ((aklm = aklp.f) == null) {
            aklm = aklm.a;
        }
        aklu aklu;
        if ((aklu = aklm.g) == null) {
            aklu = aklu.a;
        }
        final int b = aklu.b;
        final wlx r = this.r;
        aklw aklw;
        if ((aklw = aklp.h) == null) {
            aklw = aklw.a;
        }
        final String c = aklw.c;
        aklw aklw2;
        if ((aklw2 = aklp.h) == null) {
            aklw2 = aklw.a;
        }
        final String d = aklw2.d;
        alsl alsl;
        if ((alsl = aklp.j) == null) {
            alsl = alsl.a;
        }
        boolean b2 = false;
        Label_0178: {
            if ((alsl.b & 0x1) != 0x0) {
                alsl alsl2;
                if ((alsl2 = aklp.j) == null) {
                    alsl2 = alsl.a;
                }
                if (!alsl2.c) {
                    b2 = false;
                    break Label_0178;
                }
            }
            b2 = true;
        }
        alsl alsl3;
        if ((alsl3 = aklp.j) == null) {
            alsl3 = alsl.a;
        }
        final boolean d2 = alsl3.d;
        aklw aklw3;
        if ((aklw3 = aklp.h) == null) {
            aklw3 = aklw.a;
        }
        final boolean h = aklw3.h;
        aklw aklw4;
        if ((aklw4 = aklp.h) == null) {
            aklw4 = aklw.a;
        }
        final boolean k = aklw4.k;
        aklw aklw5;
        if ((aklw5 = aklp.h) == null) {
            aklw5 = aklw.a;
        }
        akls akls;
        if ((akls = aklw5.g) == null) {
            akls = akls.a;
        }
        final aklw h2 = aklp.h;
        aklw a;
        if (h2 == null) {
            a = aklw.a;
        }
        else {
            a = h2;
        }
        int cu;
        if ((cu = aqsx.cu(a.f)) == 0) {
            cu = 1;
        }
        aklw a2;
        if (h2 == null) {
            a2 = aklw.a;
        }
        else {
            a2 = h2;
        }
        int ay;
        if ((ay = adyf.aY(a2.l)) == 0) {
            ay = 1;
        }
        aklm aklm2;
        if ((aklm2 = aklp.f) == null) {
            aklm2 = aklm.a;
        }
        int ak;
        if ((ak = aefb.ak(aklm2.h)) == 0) {
            ak = 1;
        }
        aklw a3;
        if (h2 == null) {
            a3 = aklw.a;
        }
        else {
            a3 = h2;
        }
        Place place;
        if ((a3.b & 0x100) != 0x0) {
            aklw a4;
            if (h2 == null) {
                a4 = aklw.a;
            }
            else {
                a4 = h2;
            }
            final String i = a4.i;
            aklw a5 = h2;
            if (h2 == null) {
                a5 = aklw.a;
            }
            place = new Place(i, a5.j);
        }
        else {
            place = null;
        }
        Integer value;
        if ((b & 0x1) != 0x0) {
            aklm aklm3;
            if ((aklm3 = aklp.f) == null) {
                aklm3 = aklm.a;
            }
            aklu aklu2;
            if ((aklu2 = aklm3.g) == null) {
                aklu2 = aklu.a;
            }
            value = (int)aklu2.c;
        }
        else {
            value = null;
        }
        r.k(c, d, Boolean.valueOf(b2), Boolean.valueOf(d2), Boolean.valueOf(h), Boolean.valueOf(k), akls, cu, ay, ak, place, (Date)null, value, (String)null, (wln)this.H);
    }
    
    public final wyw pF() {
        return this.o;
    }
    
    public final void q(final akui akui) {
        this.r.n(((ahbh)akui.a).createBuilder((ahbh)akui), (wlw)this.aA);
    }
    
    public final wjm r() {
        final wsr ai = this.aI;
        if (ai != null && ai.aw()) {
            return (wjm)this.aI;
        }
        return null;
    }
    
    public final void s(final String c) {
        this.k.e();
        this.k.c();
        final StreamConfig d = this.D;
        final amiu i = d.i;
        if (i != null) {
            this.t(c, i, null);
            return;
        }
        d.c = c;
        d.r = true;
        final wqm k = this.k;
        k.a = true;
        k.b = true;
        k.g();
    }
    
    public final void t(final String c, final amiu i, final Boolean b) {
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
            ajut ajut;
            if ((ajut = i.m) == null) {
                ajut = ajut.a;
            }
            d3.a = acak.b(ajut).toString();
        }
        this.D.d.f = i.q;
        if (b != null) {
            this.D.r = b;
        }
        this.bF();
    }
    
    public final void u(final String s) {
        final wqv j = this.J;
        if (j != null && j.aw()) {
            this.J.u(s);
            return;
        }
        final wqv i = this.I;
        if (i != null && i.aw()) {
            this.I.u(s);
            return;
        }
        final wse l = this.L;
        if (l != null && l.aw()) {
            this.L.u(s);
            return;
        }
        final wse m = this.M;
        if (m != null && m.aw()) {
            this.M.u(s);
        }
    }
    
    public final void v(final String s) {
        final wqv j = this.J;
        if (j != null && j.aw()) {
            this.J.v(s);
            return;
        }
        final wqv i = this.I;
        if (i != null && i.aw()) {
            this.I.v(s);
            return;
        }
        final wse l = this.L;
        if (l != null && l.aw()) {
            this.L.v(s);
            return;
        }
        final wse m = this.M;
        if (m != null && m.aw()) {
            this.M.v(s);
        }
    }
    
    public final void w() {
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018239), 0).show();
    }
    
    public final void x(final String s) {
        final wse l = this.L;
        if (l != null && l.aw()) {
            this.L.aK(s);
        }
        else {
            final wse m = this.M;
            if (m != null && m.aw()) {
                this.M.aK(s);
            }
        }
        Toast.makeText((Context)this, (CharSequence)((fa)this).getResources().getString(2132018305), 0).show();
    }
    
    public final void y() {
        this.cp((br)this.G, "PRE_STREAM_FRAGMENT", true);
        this.k.e();
        this.G.aM();
    }
}

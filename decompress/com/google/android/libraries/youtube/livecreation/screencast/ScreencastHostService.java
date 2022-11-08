// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.screencast;

import android.view.WindowManager$LayoutParams;
import android.widget.SeekBar;
import android.view.Display;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import j$.util.Optional;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.text.TextUtils;
import android.util.Size;
import android.graphics.Point;
import android.view.WindowManager;
import android.os.IBinder;
import android.view.View$OnClickListener;
import android.view.View;
import android.util.Log;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Parcelable;
import android.content.res.Resources;
import android.content.Context;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;

public final class ScreencastHostService extends wmd implements wnm, wir, wiu, wit, wfw, tec
{
    private static final long u;
    private String A;
    private amhy B;
    public tdz a;
    public wwv b;
    public wiz c;
    public wfx d;
    public Executor e;
    public Executor f;
    public arhr g;
    public SharedPreferences h;
    public adfy i;
    public boolean j;
    public boolean k;
    public wnn l;
    public wiy m;
    public wlk n;
    public wmc o;
    public zqk p;
    public xgc q;
    public aeby r;
    public adcr s;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    static {
        u = TimeUnit.SECONDS.toMillis(30L);
    }
    
    private final void E() {
        final Intent intent = new Intent(((Context)this).getApplicationContext(), (Class)ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", true);
        final PendingIntent service = PendingIntent.getService((Context)this, 0, intent, 201326592);
        final Resources resources = this.getResources();
        int n;
        if (!this.k) {
            n = 2132019590;
        }
        else {
            n = 2132019592;
        }
        final afp afp = new afp((Context)this);
        tdb.o(afp);
        afp.q(2131231626);
        afp.w = "status";
        afp.k = 1;
        afp.j((CharSequence)resources.getString(n));
        afp.i((CharSequence)resources.getString(2132019588));
        afp.g = service;
        afp.n(true);
        this.startForeground(123, afp.a());
    }
    
    public static Intent d(final Context context) {
        final Intent intent = new Intent(context.getApplicationContext(), (Class)ScreencastHostService.class);
        intent.putExtra("EXTRA_STOP_SESSION", true);
        return intent;
    }
    
    public static Intent n(final Context context, final zki zki, final String s, final boolean b, final String s2, final String s3, final amhy amhy, final long n, final long n2, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6, final boolean b7, final int n3, final Intent intent) {
        zki.getClass();
        final Intent intent2 = new Intent(context.getApplicationContext(), (Class)ScreencastHostService.class);
        intent2.putExtra("EXTRA_START_SESSION", true);
        intent2.putExtra("EXTRA_ORIENTATION_IS_PORTRAIT", b);
        intent2.putExtra("EXTRA_VIDEO_ID", s);
        intent2.putExtra("EXTRA_STREAM_URL", s2);
        intent2.putExtra("EXTRA_STREAM_KEY", s3);
        intent2.putExtra("EXTRA_USE_CBR_MODE", b3);
        intent2.putExtra("EXTRA_USE_RATE_BOUNCE_MODE", b4);
        intent2.putExtra("EXTRA_ALLOW_240P", b5);
        intent2.putExtra("EXTRA_ALLOW_360P", b6);
        intent2.putExtra("EXTRA_USE_WEBRTC", b7);
        intent2.putExtra("EXTRA_START_WITH_SELF_CAM", true);
        intent2.putExtra("EXTRA_START_WITH_MIC", b2);
        intent2.putExtra("EXTRA_START_WITH_CHAT", false);
        intent2.putExtra("EXTRA_SCREEN_CAPTURE_PERMISSION", (Parcelable)intent);
        intent2.putExtra("EXTRA_TIMER_START_BASE", n);
        intent2.putExtra("EXTRA_TIMER_DURATION", n2);
        intent2.putExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", n3);
        intent2.putExtra("EXTRA_STREAM_SCREEN_RENDERER", (Parcelable)new ParcelableMessageLite((MessageLite)amhy));
        return intent2;
    }
    
    private final Dialog o() {
        final ex ex = new ex(this.getApplicationContext(), 2132084104);
        ex.c(true);
        ex.n(2132019870);
        ex.f(2132019869);
        ex.k(2132018938, (DialogInterface$OnClickListener)new jik(this, 16));
        ex.h(2132017611, (DialogInterface$OnClickListener)null);
        final ey b = ex.b();
        if (this.r.ai()) {
            b.setOnShowListener((DialogInterface$OnShowListener)new stl(b, 7));
        }
        b.getWindow().setType(2038);
        return (Dialog)b;
    }
    
    private final void p() {
        final wnn l = this.l;
        if (l == null) {
            Log.w("ScreencastHostServ", "No screencast controls UI available.");
        }
        else {
            final wns b = l.b;
            b.d();
            if (b.a.getParent() != null) {
                b.g.removeView((View)b.a);
            }
            l.c.c();
            l.c.i();
            l.e();
            final wnl d = l.d;
            if (d != null) {
                d.a();
            }
            l.i = 1;
        }
        this.k = false;
        this.j = false;
        if (!this.w) {
            this.stopSelf();
        }
        this.stopForeground(true);
    }
    
    public final void A(final boolean b) {
        this.v = true;
    }
    
    public final void B() {
    }
    
    public final void C() {
    }
    
    public final void D(final xpb xpb) {
        this.l.e();
        final wnn l = this.l;
        final String string = this.getResources().getString(2132019545);
        final wag wag = new wag(this, xpb, 16, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final uun uun = new uun(xpb, 15, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        if (!wnn.n(l.i)) {
            return;
        }
        l.e();
        l.b();
        l.e.a(1);
        l.e.a.setText((CharSequence)string);
        l.e.c((View$OnClickListener)wag);
        l.e.b((View$OnClickListener)uun);
        l.e.setVisibility(0);
        l.i = 6;
    }
    
    public final void a(final boolean b) {
        if (b) {
            this.q.B((Runnable)new wkw(this, 12));
            return;
        }
        this.q.B((Runnable)new wkw(this, 13));
    }
    
    public final boolean f() {
        return true;
    }
    
    public final void g() {
        Log.e("ScreencastHostServ", "Fatal error from UI controller");
        this.j();
    }
    
    public final void h(final int n, final String s) {
    }
    
    public final void i(final boolean b) {
        this.m.o(b, (wiv)new wmg(this, b));
    }
    
    public final void j() {
        if (this.x) {
            return;
        }
        final wnn l = this.l;
        if (l != null) {
            l.h("");
        }
        this.q.C();
        final wlk n = this.n;
        if (n != null) {
            n.i();
        }
        final wiy m = this.m;
        if (m != null && this.v) {
            m.u(false);
        }
        else {
            this.p();
            this.startActivity(xkm.aG(this.getApplicationContext(), 26, (amho)null, (String)null, (ajsq)null, false));
        }
        final wia b = wia.b();
        b.l((Class)alqu.class);
        b.g((Class)alqu.class, (Class)wmm.class, (why)null);
        this.x = true;
    }
    
    public final void k(final trb trb) {
        this.e.execute((Runnable)new wmi(this, trb, 0));
    }
    
    public final void l(final int n, final ajsq ajsq) {
    }
    
    public final void m(final wiw wiw, final String s) {
        wiw.name();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zkx zkx = (zkx)o;
            final boolean j = this.j;
            array = null;
            if (j) {
                this.j();
                this.l.i(2132019558);
                return null;
            }
        }
        else {
            array = new Class[] { zkx.class };
        }
        return array;
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onDestroy() {
        if (this.z) {
            this.a.m((Object)this);
            this.z = false;
        }
        this.w = true;
        super.onDestroy();
        this.j();
    }
    
    public final int onStartCommand(final Intent intent, int n, int width) {
        if (!this.z) {
            this.a.g((Object)this);
            this.z = true;
        }
        if (intent == null) {
            this.p();
        }
        else if (intent.getBooleanExtra("EXTRA_STOP_SESSION", false)) {
            this.j();
        }
        else if (intent.getBooleanExtra("EXTRA_STOP_SESSION_WITH_CONFIRM", false)) {
            this.o().show();
        }
        else if (intent.getBooleanExtra("EXTRA_START_SESSION", false)) {
            final boolean booleanExtra = intent.getBooleanExtra("EXTRA_ORIENTATION_IS_PORTRAIT", true);
            final boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_DID_START_BROADCAST", false);
            final long longExtra = intent.getLongExtra("EXTRA_TIMER_START_BASE", 0L);
            final long longExtra2 = intent.getLongExtra("EXTRA_TIMER_DURATION", 0L);
            final int intExtra = intent.getIntExtra("EXTRA_SEND_BUFFER_CHUNK_COUNT", 0);
            this.A = intent.getStringExtra("EXTRA_VIDEO_ID");
            final ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite)intent.getParcelableExtra("EXTRA_STREAM_SCREEN_RENDERER");
            if (parcelableMessageLite != null) {
                this.B = (amhy)parcelableMessageLite.a((MessageLite)amhy.a);
            }
            final String stringExtra = intent.getStringExtra("EXTRA_STREAM_URL");
            final String stringExtra2 = intent.getStringExtra("EXTRA_STREAM_KEY");
            final boolean booleanExtra3 = intent.getBooleanExtra("EXTRA_START_WITH_SELF_CAM", true);
            final boolean booleanExtra4 = intent.getBooleanExtra("EXTRA_START_WITH_MIC", true);
            final boolean booleanExtra5 = intent.getBooleanExtra("EXTRA_START_WITH_CHAT", false);
            final boolean booleanExtra6 = intent.getBooleanExtra("EXTRA_USE_CBR_MODE", false);
            final boolean booleanExtra7 = intent.getBooleanExtra("EXTRA_USE_RATE_BOUNCE_MODE", false);
            final boolean booleanExtra8 = intent.getBooleanExtra("EXTRA_ALLOW_240P", false);
            final boolean booleanExtra9 = intent.getBooleanExtra("EXTRA_ALLOW_360P", false);
            final boolean booleanExtra10 = intent.getBooleanExtra("EXTRA_USE_WEBRTC", false);
            final Intent intent2 = (Intent)intent.getParcelableExtra("EXTRA_SCREEN_CAPTURE_PERMISSION");
            final String a = this.A;
            if (this.j) {
                this.o().show();
            }
            else {
                this.E();
                final boolean g = this.s.aY().G;
                final WindowManager windowManager = (WindowManager)this.getSystemService("window");
                n = 720;
                width = 1280;
                Size size;
                if (windowManager != null && g) {
                    final Display defaultDisplay = windowManager.getDefaultDisplay();
                    final Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    final float n2 = Math.min(point.x, point.y) / (float)Math.max(point.x, point.y);
                    if (n2 == 0.5625f) {
                        if (booleanExtra) {
                            width = 608;
                        }
                        if (booleanExtra) {
                            n = 1080;
                        }
                        size = new Size(width, n);
                    }
                    else {
                        width = (int)Math.sqrt(n2 * 921600.0f);
                        final int n3 = (int)Math.sqrt(921600.0f / n2);
                        n = width;
                        if (width % 2 != 0) {
                            n = width + 1;
                        }
                        width = n3;
                        if (n3 % 2 != 0) {
                            width = n3 + 1;
                        }
                        int n4;
                        if (!booleanExtra) {
                            n4 = width;
                        }
                        else {
                            n4 = n;
                        }
                        if (booleanExtra) {
                            n = width;
                        }
                        size = new Size(n4, n);
                        size.getWidth();
                        size.getHeight();
                    }
                }
                else {
                    if (booleanExtra) {
                        width = 608;
                    }
                    if (booleanExtra) {
                        n = 1080;
                    }
                    size = new Size(width, n);
                }
                width = size.getWidth();
                final int height = size.getHeight();
                final wiy a2 = this.c.a((wgf)null, a, booleanExtra, booleanExtra2, false, Integer.valueOf(width), Integer.valueOf(height), stringExtra, stringExtra2, (String)null, longExtra, longExtra2, booleanExtra4, booleanExtra6, booleanExtra7, booleanExtra8, booleanExtra9, booleanExtra10, intExtra, false);
                this.m = a2;
                a2.y = (wix)new wme(this);
                this.j = true;
                final zqk p3 = this.p;
                final Context context = (Context)((atjj)p3.c).a();
                context.getClass();
                final rgm rgm = (rgm)((atjj)p3.g).a();
                rgm.getClass();
                ((atjj)p3.e).a().getClass();
                final wwv wwv = (wwv)((atjj)p3.i).a();
                wwv.getClass();
                final arhr b = ((arjh)p3.d).b();
                b.getClass();
                final acng acng = (acng)((atjj)p3.a).a();
                acng.getClass();
                final aceo aceo = (aceo)((atjj)p3.h).a();
                aceo.getClass();
                final SharedPreferences sharedPreferences = (SharedPreferences)((atjj)p3.b).a();
                sharedPreferences.getClass();
                final uyi uyi = (uyi)((atjj)p3.j).a();
                uyi.getClass();
                final aeby aeby = (aeby)((atjj)p3.f).a();
                aeby.getClass();
                final wnn wnn = new wnn(context, rgm, wwv, b, acng, aceo, sharedPreferences, uyi, aeby, (wnm)this, (byte[])null, (byte[])null, (byte[])null);
                this.l = wnn;
                final amhy b2 = this.B;
                wnn.h = booleanExtra5;
                wnn.l(b2);
                final wns b3 = wnn.b;
                b3.p = (wnq)wnn;
                if (b3.u != 1) {
                    b3.d();
                }
                b3.g(false);
                b3.f(booleanExtra4);
                b3.q = wns.l(b3.f);
                if (!TextUtils.isEmpty((CharSequence)b3.q)) {
                    b3.t = new wmt(b3.f, b3.q, b3.h, b3.b);
                    if (!b3.t.l(b3.w)) {
                        b3.t = null;
                    }
                }
                final boolean o = b3.k() && booleanExtra3;
                b3.o = o;
                if (o) {
                    b3.b.setVisibility(0);
                    b3.c.setVisibility(8);
                    b3.t.h();
                }
                else {
                    b3.b.setVisibility(8);
                    b3.c.setVisibility(0);
                }
                b3.s = new wnr(b3);
                b3.a.setOnTouchListener((View$OnTouchListener)new jjr(b3, new GestureDetector(b3.f, (GestureDetector$OnGestureListener)b3.s), 4));
                b3.r = 0;
                b3.u = 2;
                final wne c = wnn.c;
                final wns b4 = wnn.b;
                agot.D(b4.u != 1);
                final boolean k = b4.k();
                c.m.setOnClickListener((View$OnClickListener)new uun(c, 20));
                c.m.getChildAt(0).setOnClickListener((View$OnClickListener)new wmw(c, 0));
                final ex ex = new ex(c.f, 2132084104);
                ex.f(2132018212);
                ex.i((CharSequence)c.f.getString(2132017611), (DialogInterface$OnClickListener)null);
                ex.l((CharSequence)c.f.getString(2132018938), (DialogInterface$OnClickListener)new jik(c, 17));
                ex.c(false);
                c.N = ex.b();
                if (c.O.ai()) {
                    c.N.setOnShowListener((DialogInterface$OnShowListener)new stl(c, 8));
                }
                c.N.getWindow().setType(2038);
                c.e.setOnClickListener((View$OnClickListener)new wmw(c, 2));
                c.e.setVisibility(0);
                c.g(13765);
                c.g(13767);
                n = 13760;
                c.g(13760);
                c.g(13762);
                c.d.d(null);
                Label_1533: {
                    if (k) {
                        if (booleanExtra3) {
                            c.l(true);
                            break Label_1533;
                        }
                        c.l(false);
                    }
                    else {
                        c.l(false);
                        c.j.setEnabled(false);
                        c.j.setImageTintList(td.d(c.f, 2131102004));
                        c.j.setContentDescription((CharSequence)c.i);
                    }
                    n = 13762;
                }
                c.o.J(3, (wxz)new wws(wya.c(n)), (alff)null);
                c.j.setOnClickListener((View$OnClickListener)new wmw(c, 3));
                c.h.setOnClickListener((View$OnClickListener)new wmw(c, 4));
                c.p(booleanExtra4);
                n = 13761;
                c.g(13761);
                c.g(13763);
                if (!booleanExtra4) {
                    n = 13763;
                }
                c.o.J(3, (wxz)new wws(wya.c(n)), (alff)null);
                c.n(c.H = booleanExtra5);
                c.k.setVisibility(0);
                c.k.setOnClickListener((View$OnClickListener)new wmw(c, 5));
                c.q(false);
                c.l.setOnClickListener((View$OnClickListener)new uun(c, 16));
                c.l.setEnabled(true);
                c.d();
                c.g(19877);
                c.g(19881);
                c.s.setVisibility(0);
                c.s.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)new hfq(c, 5));
                final SeekBar s = c.s;
                s.setProgress(s.getMax());
                c.k();
                c.n.setOnClickListener((View$OnClickListener)new uun(c, 17));
                c.r.setOnClickListener((View$OnClickListener)new wmw(c, 1));
                c.b.setVisibility(8);
                c.a();
                final wne c2 = wnn.c;
                c2.z = (wmu)wnn;
                c2.A = (wng)wnn;
                c2.B = (wmn)wnn;
                c2.C = (wmv)wnn;
                final wns b5 = wnn.b;
                final WindowManager$LayoutParams ah = xkm.aH();
                ah.flags |= 0x100;
                ah.x = 0;
                ah.y = 0;
                b5.r = ah.gravity;
                b5.g.addView((View)b5.a, (ViewGroup$LayoutParams)ah);
                b5.h(b5.h);
                b5.b();
                wnn.i = 2;
                if (wnn.n(2)) {
                    if (wnn.i != 3) {
                        wnn.e();
                        wnn.b.b();
                        if (!((SharedPreferences)wnn.j.a).getBoolean("PREFS_SELF_VIEW_WINDOW_TOOLTIP_SEEN", false)) {
                            final wns b6 = wnn.b;
                            final String string = wnn.a.getString(2132019934);
                            if (b6.m == null) {
                                b6.m = new FrameLayout(b6.f);
                            }
                            if (b6.n == null) {
                                b6.n = new View(b6.f);
                                final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(1, 1);
                                layoutParams.gravity = 81;
                                b6.n.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                b6.m.addView(b6.n);
                            }
                            if (b6.m.getParent() == null) {
                                final WindowManager$LayoutParams ah2 = xkm.aH();
                                ah2.flags |= 0x100;
                                ah2.x = 0;
                                ah2.y = 0;
                                b6.g.addView((View)b6.m, (ViewGroup$LayoutParams)ah2);
                            }
                            b6.m();
                            if (b6.v.aT() && b6.v.aU()) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            final Context f = b6.f;
                            if (1 != n) {
                                n = 2132084546;
                            }
                            else {
                                n = 2132084547;
                            }
                            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(f, n);
                            final YouTubeTextView youTubeTextView = new YouTubeTextView((Context)contextThemeWrapper);
                            youTubeTextView.setText((CharSequence)string);
                            youTubeTextView.setTextColor(tmy.cn((Context)contextThemeWrapper, 2130969780));
                            youTubeTextView.setTextAppearance((Context)contextThemeWrapper, 2130970912);
                            final acun acun = new acun((View)youTubeTextView, b6.n, 1, 2, 0, 0, Optional.of((Object)b6.v));
                            acun.f((acul)new wno(b6));
                            b6.n.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new gzz(b6, acun, 11));
                            b6.n.requestLayout();
                        }
                        wnn.c.i();
                        wnn.c.r();
                        wnn.f();
                        wnn.i = 3;
                    }
                }
                this.q.y((wfd)this.d.a());
                this.q.A((wez)new wmf(this, width, height, intent2), true);
                this.b.b(wya.b(13768), (aioe)null, (alff)null);
                this.o = new wmc(new xpb(this), new xpb(this), this.s.aY().K, this.s.aW(), new xpb(this, (byte[])null), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                final wmm wmm = new wmm(this, booleanExtra);
                final wia b7 = wia.b();
                b7.g((Class)alqu.class, (Class)wmm.class, (why)wmm);
                b7.k((Class)alqu.class, ScreencastHostService.u);
            }
        }
        return 2;
    }
    
    public final void q(final String s) {
    }
    
    public final void r(final String s, final String s2, final aotf aotf) {
        if (wnn.m(this.l)) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                final wnn l = this.l;
                if (wnn.n(l.i)) {
                    l.c.d.f(s);
                }
            }
            if (!TextUtils.isEmpty((CharSequence)s2)) {
                final wnn i = this.l;
                if (wnn.n(i.i)) {
                    i.c.d.e(s2);
                }
            }
        }
    }
    
    public final void s(final int n) {
    }
    
    public final void t(final int n, final String s, final String s2, final amhy b) {
        this.B = b;
        this.k((trb)new swl(s, s2, b, 5));
        final wnn l = this.l;
        if (wnn.m(l)) {
            l.l(b);
        }
    }
    
    public final void u() {
        this.k((trb)vuq.c);
    }
    
    public final void v(final int n, final amho amho, final ajkj ajkj, final String s, final ajsq ajsq, final boolean b) {
        if (!this.y) {
            this.l.d();
            this.p();
            this.startActivity(xkm.aG(this.getApplicationContext(), n, amho, s, ajsq, b));
            final wmc o = this.o;
            o.a();
            if (!o.d) {
                o.h.o("SUCCESS");
            }
            this.y = true;
        }
    }
    
    public final void w() {
        this.o.c = true;
    }
    
    public final void x() {
        final wnn l = this.l;
        if (wnn.m(l) && l.i == 5) {
            l.c.l.setEnabled(true);
        }
    }
    
    public final void y(final long n) {
        this.k = true;
        this.k((trb)new wmj(n));
        final wnn l = this.l;
        if (wnn.m(l)) {
            l.c();
        }
        this.E();
        this.o.c();
    }
    
    public final void z() {
    }
}

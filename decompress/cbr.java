import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.HashMap;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashSet;
import android.widget.ListAdapter;
import java.util.ArrayList;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnClickListener;
import java.util.Iterator;
import android.view.animation.TranslateAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.media.MediaMetadataCompat;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.concurrent.TimeUnit;
import android.widget.SeekBar;
import java.util.Set;
import java.util.List;
import androidx.mediarouter.app.OverlayListView;
import android.widget.RelativeLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.net.Uri;
import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class cbr extends ey
{
    public static final int X = 0;
    static final int b;
    Map A;
    final cbn B;
    public PlaybackStateCompat C;
    MediaDescriptionCompat D;
    cbm E;
    Bitmap F;
    Uri G;
    boolean H;
    Bitmap I;
    int J;
    public boolean K;
    public boolean L;
    public boolean M;
    boolean N;
    boolean O;
    public int P;
    public int Q;
    public int R;
    public Interpolator S;
    public final AccessibilityManager T;
    final Runnable U;
    public eg V;
    final dmo W;
    private final cbo Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private Button ac;
    private Button ad;
    private ImageButton ae;
    private ImageButton af;
    private MediaRouteExpandCollapseButton ag;
    private FrameLayout ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private final boolean al;
    private View am;
    private final Interpolator an;
    private final Interpolator ao;
    public final ccw c;
    public final Context d;
    public View e;
    public FrameLayout f;
    public LinearLayout g;
    FrameLayout h;
    public ImageView i;
    final boolean j;
    public LinearLayout k;
    public RelativeLayout l;
    LinearLayout m;
    public OverlayListView n;
    public cbq o;
    public List p;
    public Set q;
    public Set r;
    public Set s;
    SeekBar t;
    cbp u;
    public ccw v;
    public int w;
    public int x;
    public int y;
    public final int z;
    
    static {
        b = (int)TimeUnit.SECONDS.toMillis(30L);
    }
    
    public cbr(Context i, final int n) {
        i = bih.i(i, n, true);
        super(i, bih.d(i));
        this.al = true;
        this.U = new asa(this, 16);
        final Context context = this.getContext();
        this.d = context;
        this.B = new cbn(this);
        this.W = dmo.T(context);
        this.j = dmo.s();
        this.Y = new cbo(this);
        this.c = dmo.y();
        this.C(dmo.w());
        this.z = context.getResources().getDimensionPixelSize(2131168032);
        this.T = (AccessibilityManager)context.getSystemService("accessibility");
        this.an = AnimationUtils.loadInterpolator(i, 2131558422);
        this.ao = AnimationUtils.loadInterpolator(i, 2131558421);
        new AccelerateDecelerateInterpolator();
    }
    
    private final void C(final MediaSessionCompat$Token mediaSessionCompat$Token) {
        final eg v = this.V;
        final MediaDescriptionCompat mediaDescriptionCompat = null;
        if (v != null) {
            v.o((du)this.B);
            this.V = null;
        }
        if (mediaSessionCompat$Token == null) {
            return;
        }
        if (!this.aa) {
            return;
        }
        final eg v2 = new eg(this.d, mediaSessionCompat$Token);
        this.V = v2;
        final cbn b = this.B;
        if (b != null) {
            Label_0250: {
                if (!((Set<cbn>)v2.d).add(b)) {
                    Log.w("MediaControllerCompat", "the callback has already been registered");
                    break Label_0250;
                }
                final Handler handler = new Handler();
                b.e(handler);
                final Object c = v2.c;
                final dw dw = (dw)c;
                dw.a.registerCallback(b.a, handler);
                synchronized (dw.b) {
                    if (((dw)c).e.a() != null) {
                        final dv c2 = new dv((du)b);
                        ((dw)c).d.put(b, c2);
                        b.c = (do)c2;
                        try {
                            ((dw)c).e.a().b((do)c2);
                            b.d(13, (Object)null, (Bundle)null);
                        }
                        catch (final RemoteException ex) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                        }
                    }
                    else {
                        b.c = null;
                        ((dw)c).c.add(b);
                    }
                    monitorexit(dw.b);
                    final MediaMetadataCompat m = this.V.m();
                    MediaDescriptionCompat b2;
                    if (m == null) {
                        b2 = mediaDescriptionCompat;
                    }
                    else {
                        b2 = m.b();
                    }
                    this.D = b2;
                    this.C = this.V.n();
                    this.oA();
                    this.oz(false);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }
    
    public static int h(final View view) {
        return view.getLayoutParams().height;
    }
    
    static void oy(final View view, final int height) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }
    
    static boolean v(final Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }
    
    final boolean A(final ccw ccw) {
        return this.al && ccw.a() == 1;
    }
    
    public View B() {
        return null;
    }
    
    final int g(final int n, final int n2) {
        if (n >= n2) {
            return (int)(this.ab * (float)n2 / n + 0.5f);
        }
        return (int)(this.ab * 9.0f / 16.0f + 0.5f);
    }
    
    public final int i(final boolean b) {
        int n;
        if (!b && this.m.getVisibility() != 0) {
            n = 0;
        }
        else {
            int n3;
            final int n2 = n3 = this.k.getPaddingTop() + this.k.getPaddingBottom();
            if (b) {
                n3 = n2 + this.l.getMeasuredHeight();
            }
            n = n3;
            if (this.m.getVisibility() == 0) {
                n = n3 + this.m.getMeasuredHeight();
            }
            if (b && this.m.getVisibility() == 0) {
                return n + this.am.getMeasuredHeight();
            }
        }
        return n;
    }
    
    public final void j(final View view, final int n) {
        final cbk cbk = new cbk(h(view), n, view);
        cbk.setDuration((long)this.P);
        cbk.setInterpolator(this.S);
        view.startAnimation((Animation)cbk);
    }
    
    public final void k(final boolean b) {
        final int firstVisiblePosition = this.n.getFirstVisiblePosition();
        for (int i = 0; i < this.n.getChildCount(); ++i) {
            final View child = this.n.getChildAt(i);
            final ccw ccw = (ccw)this.o.getItem(firstVisiblePosition + i);
            if (b) {
                final Set q = this.q;
                if (q != null && q.contains(ccw)) {
                    continue;
                }
            }
            ((LinearLayout)child.findViewById(2131432411)).setVisibility(0);
            final AnimationSet set = new AnimationSet(true);
            final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            ((Animation)alphaAnimation).setDuration(0L);
            set.addAnimation((Animation)alphaAnimation);
            ((Animation)new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f)).setDuration(0L);
            set.setFillAfter(true);
            set.setFillEnabled(true);
            child.clearAnimation();
            child.startAnimation((Animation)set);
        }
        for (final cbv cbv : this.n.a) {
            cbv.k = true;
            cbv.l = true;
            final dhf m = cbv.m;
            if (m != null) {
                m.a();
            }
        }
        if (!b) {
            this.m(false);
        }
    }
    
    final void l() {
        this.H = false;
        this.I = null;
        this.J = 0;
    }
    
    public final void m(final boolean b) {
        this.q = null;
        this.r = null;
        this.N = false;
        if (this.O) {
            this.O = false;
            this.s(b);
        }
        this.n.setEnabled(true);
    }
    
    public final void n() {
        Interpolator s;
        if (this.M) {
            s = this.an;
        }
        else {
            s = this.ao;
        }
        this.S = s;
    }
    
    final void oA() {
        if (this.e == null) {
            final MediaDescriptionCompat d = this.D;
            Object d2 = null;
            Bitmap c;
            if (d == null) {
                c = null;
            }
            else {
                c = d.c;
            }
            if (d != null) {
                d2 = d.d;
            }
            final cbm e = this.E;
            Bitmap bitmap;
            if (e == null) {
                bitmap = this.F;
            }
            else {
                bitmap = e.a;
            }
            Uri uri;
            if (e == null) {
                uri = this.G;
            }
            else {
                uri = e.b;
            }
            if (bitmap == c) {
                if (bitmap != null || (uri != null && uri.equals(d2))) {
                    return;
                }
                if (uri == null && d2 == null) {
                    return;
                }
            }
            if (!this.w() || this.j) {
                final cbm e2 = this.E;
                if (e2 != null) {
                    e2.cancel(true);
                }
                (this.E = new cbm(this)).execute((Object[])new Void[0]);
            }
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = true;
        this.W.H(ccn.a, (bkx)this.Y, 2);
        this.C(dmo.w());
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawableResource(17170445);
        ((qv)this).setContentView(2131624858);
        ((fz)this).findViewById(16908315).setVisibility(8);
        final jm jm = new jm(this, 7);
        (this.f = (FrameLayout)((fz)this).findViewById(2131429947)).setOnClickListener((View$OnClickListener)new jm(this, 4));
        (this.g = (LinearLayout)((fz)this).findViewById(2131429946)).setOnClickListener((View$OnClickListener)new iat(1));
        final Context d = this.d;
        int n;
        if (aia.a(n = bih.g(d, 0, 2130969084), bih.g(d, 0, 16842801)) < 3.0) {
            n = bih.g(d, 0, 2130969037);
        }
        (this.ac = (Button)((fz)this).findViewById(16908314)).setText(2132018684);
        this.ac.setTextColor(n);
        this.ac.setOnClickListener((View$OnClickListener)jm);
        (this.ad = (Button)((fz)this).findViewById(16908313)).setText(2132018691);
        this.ad.setTextColor(n);
        this.ad.setOnClickListener((View$OnClickListener)jm);
        this.ak = (TextView)((fz)this).findViewById(2131429951);
        (this.af = (ImageButton)((fz)this).findViewById(2131429938)).setOnClickListener((View$OnClickListener)jm);
        this.ah = (FrameLayout)((fz)this).findViewById(2131429944);
        this.h = (FrameLayout)((fz)this).findViewById(2131429945);
        final jm jm2 = new jm(this, 5);
        (this.i = (ImageView)((fz)this).findViewById(2131429911)).setOnClickListener((View$OnClickListener)jm2);
        ((fz)this).findViewById(2131429943).setOnClickListener((View$OnClickListener)jm2);
        this.k = (LinearLayout)((fz)this).findViewById(2131429950);
        this.am = ((fz)this).findViewById(2131429939);
        this.l = (RelativeLayout)((fz)this).findViewById(2131429958);
        this.ai = (TextView)((fz)this).findViewById(2131429942);
        this.aj = (TextView)((fz)this).findViewById(2131429941);
        (this.ae = (ImageButton)((fz)this).findViewById(2131429940)).setOnClickListener((View$OnClickListener)jm);
        (this.m = (LinearLayout)((fz)this).findViewById(2131429960)).setVisibility(8);
        (this.t = (SeekBar)((fz)this).findViewById(2131429963)).setTag((Object)this.c);
        final cbp cbp = new cbp(this);
        this.u = cbp;
        this.t.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)cbp);
        this.n = (OverlayListView)((fz)this).findViewById(2131429961);
        this.p = new ArrayList();
        final cbq cbq = new cbq(this, this.n.getContext(), this.p);
        this.o = cbq;
        this.n.setAdapter((ListAdapter)cbq);
        this.s = new HashSet();
        final Context d2 = this.d;
        final LinearLayout k = this.k;
        final OverlayListView n2 = this.n;
        final boolean w = this.w();
        final int g = bih.g(d2, 0, 2130969084);
        final int g2 = bih.g(d2, 0, 2130969087);
        int backgroundColor = g;
        int backgroundColor2 = g2;
        if (w) {
            backgroundColor = g;
            backgroundColor2 = g2;
            if (bih.e(d2, 0) == -570425344) {
                backgroundColor2 = g;
                backgroundColor = -1;
            }
        }
        ((View)k).setBackgroundColor(backgroundColor);
        ((View)n2).setBackgroundColor(backgroundColor2);
        ((View)k).setTag((Object)backgroundColor);
        ((View)n2).setTag((Object)backgroundColor2);
        bih.j(this.d, (MediaRouteVolumeSlider)this.t, (View)this.k);
        (this.A = new HashMap()).put(this.c, this.t);
        final MediaRouteExpandCollapseButton ag = (MediaRouteExpandCollapseButton)((fz)this).findViewById(2131429948);
        this.ag = ag;
        ag.f = (View$OnClickListener)new jm(this, 6);
        this.n();
        this.P = this.d.getResources().getInteger(2131493013);
        this.Q = this.d.getResources().getInteger(2131493014);
        this.R = this.d.getResources().getInteger(2131493015);
        final View b = this.B();
        if ((this.e = b) != null) {
            this.ah.addView(b);
            this.ah.setVisibility(0);
        }
        this.Z = true;
        this.r();
    }
    
    public final void onDetachedFromWindow() {
        this.W.I((bkx)this.Y);
        this.C(null);
        this.aa = false;
        super.onDetachedFromWindow();
    }
    
    public final boolean onKeyDown(int n, final KeyEvent keyEvent) {
        if (n != 25 && n != 24) {
            return super.onKeyDown(n, keyEvent);
        }
        if (this.j || !this.M) {
            final ccw c = this.c;
            if (n == 25) {
                n = -1;
            }
            else {
                n = 1;
            }
            c.f(n);
        }
        return true;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        return n == 25 || n == 24 || super.onKeyUp(n, keyEvent);
    }
    
    public final void oz(final boolean b) {
        if (this.v != null) {
            this.K = true;
            this.L |= b;
            return;
        }
        int visibility = 0;
        this.K = false;
        this.L = false;
        if (!this.c.m() || this.c.j()) {
            ((fz)this).dismiss();
            return;
        }
        if (!this.Z) {
            return;
        }
        this.ak.setText((CharSequence)this.c.d);
        final Button ac = this.ac;
        int visibility2;
        if (!this.c.i) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        ac.setVisibility(visibility2);
        if (this.e == null && this.H) {
            if (v(this.I)) {
                final StringBuilder sb = new StringBuilder("Can't set artwork image with recycled bitmap: ");
                final Bitmap i = this.I;
                sb.append(i);
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: ".concat(String.valueOf(i)));
            }
            else {
                this.i.setImageBitmap(this.I);
                this.i.setBackgroundColor(this.J);
            }
            this.l();
        }
        if (!this.j && this.w()) {
            this.m.setVisibility(8);
            this.M = true;
            this.n.setVisibility(0);
            this.n();
            this.s(false);
        }
        else if ((this.M && !this.j) || !this.A(this.c)) {
            this.m.setVisibility(8);
        }
        else if (this.m.getVisibility() == 8) {
            this.m.setVisibility(0);
            this.t.setMax(this.c.o);
            this.t.setProgress(this.c.n);
            final MediaRouteExpandCollapseButton ag = this.ag;
            int visibility3;
            if (!this.w()) {
                visibility3 = 8;
            }
            else {
                visibility3 = 0;
            }
            ag.setVisibility(visibility3);
        }
        if (this.u()) {
            final MediaDescriptionCompat d = this.D;
            CharSequence b2 = null;
            CharSequence a;
            if (d == null) {
                a = null;
            }
            else {
                a = d.a;
            }
            final boolean b3 = TextUtils.isEmpty(a) ^ true;
            final MediaDescriptionCompat d2 = this.D;
            if (d2 != null) {
                b2 = d2.b;
            }
            final boolean b4 = TextUtils.isEmpty(b2) ^ true;
            boolean b6 = false;
            boolean b8 = false;
            Label_0574: {
                Label_0465: {
                    if (this.c.p != -1) {
                        this.ai.setText(2132018681);
                    }
                    else {
                        final PlaybackStateCompat c = this.C;
                        if (c != null && c.a != 0) {
                            if (!b3 && !b4) {
                                this.ai.setText(2132018686);
                            }
                            else {
                                boolean b5;
                                if (b3) {
                                    this.ai.setText(a);
                                    b5 = true;
                                }
                                else {
                                    b5 = false;
                                }
                                b6 = b5;
                                if (b4) {
                                    this.aj.setText(b2);
                                    final boolean b7 = true;
                                    b6 = b5;
                                    b8 = b7;
                                    break Label_0574;
                                }
                                break Label_0465;
                            }
                        }
                        else {
                            this.ai.setText(2132018687);
                        }
                    }
                    b6 = true;
                }
                b8 = false;
            }
            final TextView ai = this.ai;
            int visibility4;
            if (!b6) {
                visibility4 = 8;
            }
            else {
                visibility4 = 0;
            }
            ai.setVisibility(visibility4);
            final TextView aj = this.aj;
            int visibility5;
            if (!b8) {
                visibility5 = 8;
            }
            else {
                visibility5 = 0;
            }
            aj.setVisibility(visibility5);
            final PlaybackStateCompat c2 = this.C;
            if (c2 != null) {
                final int a2 = c2.a;
                final boolean b9 = a2 == 6 || a2 == 3;
                final Context context = this.ae.getContext();
                int n2 = 0;
                int n3 = 0;
                boolean b10 = false;
                Label_0753: {
                    int n;
                    if (b9 && this.x()) {
                        n = 2132018688;
                        n2 = 2130969892;
                    }
                    else if (b9 && this.z()) {
                        n = 2132018690;
                        n2 = 2130969896;
                    }
                    else {
                        if (b9 || !this.y()) {
                            n3 = 0;
                            n2 = 0;
                            b10 = false;
                            break Label_0753;
                        }
                        n = 2132018689;
                        n2 = 2130969893;
                    }
                    final boolean b11 = true;
                    n3 = n;
                    b10 = b11;
                }
                final ImageButton ae = this.ae;
                if (!b10) {
                    visibility = 8;
                }
                ae.setVisibility(visibility);
                if (b10) {
                    this.ae.setImageResource(bih.h(context, n2));
                    this.ae.setContentDescription(context.getResources().getText(n3));
                }
            }
        }
        this.s(b);
    }
    
    final void r() {
        final int k = bih.k(this.d);
        this.getWindow().setLayout(k, -2);
        final View decorView = this.getWindow().getDecorView();
        this.ab = k - decorView.getPaddingLeft() - decorView.getPaddingRight();
        final Resources resources = this.d.getResources();
        this.w = resources.getDimensionPixelSize(2131168030);
        this.x = resources.getDimensionPixelSize(2131168029);
        this.y = resources.getDimensionPixelSize(2131168031);
        this.F = null;
        this.G = null;
        this.oA();
        this.oz(false);
    }
    
    public final void s(final boolean b) {
        this.h.requestLayout();
        this.h.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new cbj(this, b));
    }
    
    public final void t(final boolean b) {
        final View am = this.am;
        final int visibility = this.m.getVisibility();
        final int n = 0;
        int visibility2;
        if (visibility == 0 && b) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        am.setVisibility(visibility2);
        final LinearLayout k = this.k;
        int visibility3 = n;
        if (this.m.getVisibility() == 8) {
            visibility3 = n;
            if (!b) {
                visibility3 = 8;
            }
        }
        k.setVisibility(visibility3);
    }
    
    public final boolean u() {
        final View e = this.e;
        boolean b = false;
        if (e == null) {
            if (this.D == null) {
                if (this.C != null) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public final boolean w() {
        return this.c.k() && this.c.d().size() > 1;
    }
    
    public final boolean x() {
        return (this.C.e & 0x202L) != 0x0L;
    }
    
    public final boolean y() {
        return (this.C.e & 0x204L) != 0x0L;
    }
    
    public final boolean z() {
        return (this.C.e & 0x1L) != 0x0L;
    }
}

import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.CinematicContainerRendererOuterClass$CinematicContainerRenderer;
import android.text.TextUtils$TruncateAt;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.widget.FrameLayout$LayoutParams;
import android.widget.GridLayout$LayoutParams;
import android.text.Spanned;
import android.widget.LinearLayout$LayoutParams;
import android.text.TextUtils;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import j$.util.Optional;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View$OnLayoutChangeListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.ViewGroup;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import java.util.List;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.cinematics.CinematicImageView;
import android.view.View;
import android.widget.LinearLayout;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgb implements acko, tgg
{
    public final TextView A;
    public final TextView B;
    final FrameLayout C;
    final FrameLayout D;
    final ViewStub E;
    final LinearLayout F;
    final TextView G;
    public final View H;
    final CinematicImageView I;
    public final CinematicImageView J;
    public anio K;
    public aiqj L;
    public aiqj M;
    public aiqj N;
    public aiqj O;
    public Boolean P;
    public boolean Q;
    public final vai R;
    private final Activity S;
    private final tgd T;
    private final acgs U;
    private final gfq V;
    private final fvf W;
    private final fmr X;
    private final atke Y;
    private final int Z;
    public final vcy a;
    private final aeea aA;
    private final int aa;
    private final int ab;
    private final int ac;
    private final acsy ad;
    private final fvr ae;
    private final List af;
    private final fvr ag;
    private final gkx ah;
    private final TextView ai;
    private final FrameLayout aj;
    private final LinearLayout ak;
    private final PlaylistHeaderActionBarView al;
    private final gag am;
    private final TintableImageView an;
    private final boolean ao;
    private final boolean ap;
    private final DisplayMetrics aq;
    private final acpk ar;
    private final List as;
    private fve at;
    private ilk au;
    private gfu av;
    private final vai aw;
    private final ktn ax;
    private final aln ay;
    private final ajb az;
    final acsy b;
    final acsy c;
    public final fyv d;
    final ViewGroup e;
    public final LinearLayout f;
    final TextView g;
    final TextView h;
    final YouTubeTextView i;
    final TextView j;
    final TextView k;
    final LinearLayout l;
    final TextView m;
    final TintableImageView n;
    final TintableImageView o;
    final TintableImageView p;
    final ImageView q;
    final ImageView r;
    final FrameLayout s;
    final ImageView t;
    final CircularImageView u;
    public final ImageView v;
    final OfflineArrowView w;
    final ViewGroup x;
    final View$OnLayoutChangeListener y;
    final YouTubeTextView z;
    
    public jgb(final Activity s, final tgd t, final acgs u, final vcy a, final acpk ar, final lmo lmo, final gfq v, final fvf w, final hyx hyx, final ziy ziy, final fmr x, final ktn ax, final aaih aaih, final atke y, final aeea aa, final ajb az, final aln ay, final cya cya, final vai r, final vai vai, final vai aw, final gkx ah, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7, final byte[] array8) {
        this.S = s;
        this.T = t;
        this.U = u;
        this.a = a;
        this.ar = ar;
        this.V = v;
        this.W = w;
        this.X = x;
        this.ax = ax;
        this.Y = y;
        this.aA = aa;
        this.az = az;
        this.ay = ay;
        this.R = r;
        this.aw = aw;
        this.ah = ah;
        this.Q = false;
        final boolean f = vai.f(45373624L);
        this.ao = f;
        final boolean ap = f && vai.ae();
        this.ap = ap;
        final ViewGroup e = (ViewGroup)LayoutInflater.from((Context)s).inflate(2131625045, viewGroup, false);
        this.e = e;
        this.x = (ViewGroup)e.findViewById(2131431611);
        this.f = (LinearLayout)e.findViewById(2131430474);
        final TextView g = (TextView)e.findViewById(2131430493);
        this.g = g;
        this.h = (TextView)e.findViewById(2131430486);
        PlaylistHeaderActionBarView al;
        if (ap) {
            al = (PlaylistHeaderActionBarView)e.findViewById(2131427489);
        }
        else {
            al = (PlaylistHeaderActionBarView)e.findViewById(2131427488);
        }
        (this.al = al).setVisibility(0);
        YouTubeTextView i;
        if (ap) {
            i = (YouTubeTextView)e.findViewById(2131431315);
        }
        else {
            i = (YouTubeTextView)al.findViewById(2131431314);
        }
        this.i = i;
        this.k = (TextView)e.findViewById(2131430495);
        this.j = (TextView)e.findViewById(2131430473);
        final YouTubeTextView z = (YouTubeTextView)e.findViewById(2131430476);
        this.z = z;
        this.l = (LinearLayout)e.findViewById(2131431799);
        this.m = (TextView)e.findViewById(2131430485);
        final TintableImageView n = (TintableImageView)al.findViewById(2131431401);
        this.n = n;
        final TintableImageView o = (TintableImageView)al.findViewById(2131431468);
        this.o = o;
        final TintableImageView p31 = (TintableImageView)al.findViewById(2131428785);
        this.p = p31;
        this.q = (ImageView)e.findViewById(2131430623);
        this.w = (OfflineArrowView)al.findViewById(2131430125);
        this.s = (FrameLayout)e.findViewById(2131429235);
        final ImageView r2 = (ImageView)e.findViewById(2131429234);
        this.r = r2;
        this.t = (ImageView)e.findViewById(2131428086);
        this.u = (CircularImageView)e.findViewById(2131431581);
        this.v = (ImageView)e.findViewById(2131428938);
        final TextView ai = (TextView)e.findViewById(2131427452);
        this.ai = ai;
        final TextView g2 = (TextView)e.findViewById(2131430136);
        this.G = g2;
        this.aj = (FrameLayout)e.findViewById(2131429064);
        final TextView a2 = (TextView)e.findViewById(2131430412);
        this.A = a2;
        this.F = (LinearLayout)e.findViewById(2131430409);
        this.C = (FrameLayout)e.findViewById(2131430411);
        this.D = (FrameLayout)e.findViewById(2131431541);
        final TextView b = (TextView)e.findViewById(2131431542);
        this.B = b;
        final ViewStub e2 = (ViewStub)e.findViewById(2131429862);
        this.E = e2;
        final TintableImageView tintableImageView = (TintableImageView)al.findViewById(2131431234);
        this.an = tintableImageView;
        this.ak = (LinearLayout)e.findViewById(2131427947);
        final View viewById = e.findViewById(2131428199);
        this.H = viewById;
        (this.I = (CinematicImageView)viewById.findViewById(2131428200)).setScaleType(ImageView$ScaleType.CENTER);
        this.J = (CinematicImageView)viewById.findViewById(2131428198);
        this.am = cya.D((Context)s, e2);
        this.as = new ArrayList();
        v.b(al.findViewById(2131429539));
        this.ad = ziy.ap(ai);
        this.b = ziy.ap(a2);
        this.c = ziy.ap(b);
        final fvr p32 = hyx.p((View)tintableImageView);
        this.ag = p32;
        p32.b = tintableImageView;
        r2.setOnClickListener((View$OnClickListener)new ivc(this, a, 12));
        n.setOnClickListener((View$OnClickListener)new gbw(this, a, lmo, 14, (byte[])null, (byte[])null, (byte[])null));
        o.setOnClickListener((View$OnClickListener)new ivc(this, a, 13));
        p31.setOnClickListener((View$OnClickListener)new ivc(this, a, 14));
        g2.setOnClickListener((View$OnClickListener)new ivc(this, aaih, 15));
        final Resources resources = s.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.aq = displayMetrics;
        this.aa = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.ab = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.ac = s.getResources().getDimensionPixelSize(2131169824);
        this.Z = tpe.aZ(displayMetrics, 8);
        this.ae = hyx.p(al.findViewById(2131432115));
        if (!r.bR()) {
            this.d = new fyv(z, resources.getInteger(2131493048), resources.getInteger(2131493049));
            final jcl y2 = new jcl(this, (View$OnClickListener)new jan(this, 20), 3);
            z.addOnLayoutChangeListener(this.y = (View$OnLayoutChangeListener)y2);
            g.addOnLayoutChangeListener((View$OnLayoutChangeListener)y2);
        }
        else {
            this.y = null;
            this.d = null;
            z.setMaxLines(resources.getInteger(2131493050));
            z.e(false);
            z.setOnClickListener((View$OnClickListener)new ivc(this, a, 11));
        }
        this.af = new ArrayList();
    }
    
    public static boolean l(final anio anio) {
        anip anip;
        if ((anip = anio.K) == null) {
            anip = anip.a;
        }
        aicz aicz;
        if ((aicz = anip.b) == null) {
            aicz = aicz.a;
        }
        return (aicz.b & 0x8000) != 0x0;
    }
    
    public static boolean m(final anio anio) {
        aniq aniq;
        if ((aniq = anio.z) == null) {
            aniq = aniq.a;
        }
        return aniq.b;
    }
    
    private final void n(final View view, final int n) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            final int marginStart = viewGroup$MarginLayoutParams.getMarginStart();
            viewGroup$MarginLayoutParams.setMarginStart(this.S.getResources().getDimensionPixelSize(n));
            this.af.add(new aln(view, Optional.of((Object)marginStart), Optional.empty()));
        }
    }
    
    private static final boolean o(final anio anio) {
        anih anih;
        if ((anih = anio.L) == null) {
            anih = anih.a;
        }
        ajkd ajkd;
        if ((ajkd = anih.b) == null) {
            ajkd = ajkd.a;
        }
        return ajkd.c.size() != 0;
    }
    
    public final View a() {
        return (View)this.e;
    }
    
    public final int b() {
        if (this.X.j(this.K.h)) {
            return ((aabo)this.Y.a()).a().i().a(this.K.h);
        }
        return 0;
    }
    
    public final void c(final acku acku) {
        this.T.m((Object)this);
        this.ak.removeAllViews();
        for (final aln aln : this.af) {
            if (((Optional)aln.a).isPresent()) {
                final ViewGroup$LayoutParams layoutParams = ((View)aln.b).getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart((int)((Optional)aln.a).get());
                }
            }
            if (((Optional)aln.c).isPresent()) {
                ((View)aln.b).setPaddingRelative((int)((Optional)aln.c).get(), ((View)aln.b).getPaddingTop(), ((View)aln.b).getPaddingEnd(), ((View)aln.b).getPaddingBottom());
            }
        }
        this.af.clear();
        this.au = null;
        this.P = null;
    }
    
    public final void d() {
        this.H.setVisibility(8);
        this.Q = false;
        this.g();
    }
    
    public final void f() {
        final int b = this.b();
        final TextView g = this.G;
        String quantityString;
        if (b > 0) {
            quantityString = this.S.getResources().getQuantityString(2131886096, b, new Object[] { b });
        }
        else {
            quantityString = null;
        }
        tpe.t(g, (CharSequence)quantityString);
        final ilk au = this.au;
        if (au != null) {
            ((ikv)au).a();
        }
    }
    
    public final void g() {
        final View viewById = this.e.findViewById(2131427743);
        final boolean q = this.Q;
        final int n = 0;
        final int n2 = 0;
        int cr;
        if (q) {
            cr = 0;
        }
        else {
            cr = tpe.cr((Context)this.S, 2130970845);
        }
        viewById.setBackgroundColor(cr);
        final Activity s = this.S;
        final boolean q2 = this.Q;
        final int n3 = 2130970924;
        int n4;
        if (!q2) {
            n4 = 2130970924;
        }
        else {
            n4 = 2130970884;
        }
        final ColorStateList ct = tpe.ct((Context)s, n4);
        final Activity s2 = this.S;
        final boolean q3 = this.Q;
        final int n5 = 2130970926;
        int n6;
        if (!q3) {
            n6 = 2130970926;
        }
        else {
            n6 = 2130970885;
        }
        final ColorStateList ct2 = tpe.ct((Context)s2, n6);
        final Activity s3 = this.S;
        int n7;
        if (!this.Q) {
            n7 = n3;
        }
        else {
            n7 = 2130970884;
        }
        final int cr2 = tpe.cr((Context)s3, n7);
        final Activity s4 = this.S;
        int n8;
        if (!this.Q) {
            n8 = n5;
        }
        else {
            n8 = 2130970885;
        }
        final int cr3 = tpe.cr((Context)s4, n8);
        final Drawable drawable = this.S.getDrawable(2131231189);
        if (drawable instanceof GradientDrawable) {
            final GradientDrawable background = (GradientDrawable)drawable;
            final Activity s5 = this.S;
            int n9;
            if (!this.Q) {
                n9 = 2130970838;
            }
            else {
                n9 = 2130970879;
            }
            background.setColor(tpe.cr((Context)s5, n9));
            this.n.setBackground((Drawable)background);
            this.o.setBackground((Drawable)background);
            this.w.setBackground((Drawable)background);
            this.an.setBackground((Drawable)background);
            this.p.setBackground((Drawable)background);
        }
        this.n.a(ct);
        this.o.a(ct);
        this.G.setTextColor(cr2);
        final OfflineArrowView w = this.w;
        w.o = ct;
        w.a(w.n, true);
        this.f();
        this.an.a(ct);
        this.p.a(ct);
        this.j.setTextColor(cr2);
        this.g.setTextColor(cr2);
        this.h.setTextColor(cr3);
        this.z.setTextColor(cr2);
        this.q.setImageTintList(ct);
        this.v.setImageTintList(ct);
        if (this.ap) {
            for (int i = n2; i < this.ak.getChildCount(); ++i) {
                final View child = this.ak.getChildAt(i);
                if (child instanceof LinearLayout) {
                    final LinearLayout linearLayout = (LinearLayout)child;
                    ((TintableImageView)linearLayout.findViewById(2131427948)).a(ct2);
                    ((YouTubeTextView)linearLayout.findViewById(2131427949)).setTextColor(cr3);
                }
            }
        }
        else {
            this.i.setTextColor(cr3);
            final Drawable[] compoundDrawables = this.i.getCompoundDrawables();
            for (int length = compoundDrawables.length, j = n; j < length; ++j) {
                final Drawable drawable2 = compoundDrawables[j];
                if (drawable2 != null) {
                    drawable2.setColorFilter((ColorFilter)new PorterDuffColorFilter(cr3, PorterDuff$Mode.SRC_IN));
                }
            }
        }
    }
    
    public final void h() {
        final fyv d = this.d;
        if (d != null) {
            tpe.v((View)this.v, d.d());
            final ImageView v = this.v;
            float rotation;
            if (!this.d.d) {
                rotation = 360.0f;
            }
            else {
                rotation = 180.0f;
            }
            v.setRotation(rotation);
        }
    }
    
    public final void i(final anio anio) {
        aida aida;
        if ((aida = anio.G) == null) {
            aida = aida.a;
        }
        if ((aida.b & 0x2) != 0x0) {
            final fvr ae = this.ae;
            aidi aidi;
            if ((aidi = aida.d) == null) {
                aidi = aidi.a;
            }
            ae.b(aidi);
            return;
        }
        this.ae.b(null);
    }
    
    public final void j(final gfu av) {
        final anio k = this.K;
        if (k != null && av != null && TextUtils.equals((CharSequence)k.h, (CharSequence)av.b())) {
            this.V.f(av.a());
            if (!this.ag.e()) {
                final boolean b = av.a() == alog.a;
                final fvr ag = this.ag;
                final aidi d = ag.d;
                d.getClass();
                if (d.e != b) {
                    ag.c();
                }
            }
            this.av = av;
            return;
        }
        this.av = null;
    }
    
    public final void k(final anio anio) {
        final boolean ap = this.ap;
        Object o = null;
        int visibility = 0;
        if (ap) {
            this.ak.removeAllViews();
            final int size = anio.R.size();
            if (size > 0) {
                final int size2 = this.as.size();
                if (size2 < size) {
                    for (int i = 0; i < size - size2; ++i) {
                        this.as.add(LayoutInflater.from((Context)this.S).inflate(2131624115, (ViewGroup)null));
                    }
                }
                for (int j = 0; j < size; ++j) {
                    final anuv anuv = (anuv)anio.R.get(j);
                    if (((ahbc)anuv).ry((ahaq)anhv.b)) {
                        final anhv anhv = (anhv)((ahbc)anuv).rx((ahaq)anhv.b);
                        final LinearLayout linearLayout = this.as.get(j);
                        final TintableImageView tintableImageView = (TintableImageView)linearLayout.findViewById(2131427948);
                        final YouTubeTextView youTubeTextView = (YouTubeTextView)linearLayout.findViewById(2131427949);
                        final int c = anhv.c;
                        final int n = c & 0x2;
                        final int n2 = c & 0x1;
                        int visibility2;
                        if (n == 0) {
                            visibility2 = 8;
                        }
                        else {
                            visibility2 = 0;
                        }
                        tintableImageView.setVisibility(visibility2);
                        int visibility3;
                        if (n2 == 0) {
                            visibility3 = 8;
                        }
                        else {
                            visibility3 = 0;
                        }
                        youTubeTextView.setVisibility(visibility3);
                        if (n != 0) {
                            final acpk ar = this.ar;
                            akdi akdi;
                            if ((akdi = anhv.e) == null) {
                                akdi = akdi.a;
                            }
                            akdh akdh;
                            if ((akdh = akdh.b(akdi.c)) == null) {
                                akdh = akdh.a;
                            }
                            tintableImageView.setImageResource(ar.a(akdh));
                            final Activity s = this.S;
                            int n3;
                            if (!this.Q) {
                                n3 = 2130970926;
                            }
                            else {
                                n3 = 2130970885;
                            }
                            tintableImageView.a(tpe.ct((Context)s, n3));
                            int n4;
                            if (n2 != 0) {
                                n4 = tpe.aZ(this.aq, 2);
                            }
                            else {
                                n4 = tpe.aZ(this.aq, 8);
                            }
                            tpe.aF((View)tintableImageView, tpe.ay(0, 0, n4, 0), (Class)LinearLayout$LayoutParams.class);
                        }
                        if (n2 != 0) {
                            ajut ajut;
                            if ((ajut = anhv.d) == null) {
                                ajut = ajut.a;
                            }
                            youTubeTextView.setText((CharSequence)acak.b(ajut));
                            final Activity s2 = this.S;
                            int n5;
                            if (!this.Q) {
                                n5 = 2130970926;
                            }
                            else {
                                n5 = 2130970885;
                            }
                            youTubeTextView.setTextColor(tpe.cr((Context)s2, n5));
                        }
                        this.ak.addView((View)linearLayout);
                    }
                }
            }
            this.m.setVisibility(8);
            this.q.setVisibility(8);
            this.ak.setVisibility(0);
            return;
        }
        if (anio.y.size() == 0) {
            ajut ajut2;
            if ((ajut2 = anio.t) == null) {
                ajut2 = ajut.a;
            }
            o = acak.b(ajut2);
        }
        else {
            final ahbx y = anio.y;
            if (((List)y).isEmpty()) {
                o = "";
            }
            else {
                final Iterator iterator = ((List)y).iterator();
                while (iterator.hasNext()) {
                    final Spanned b = acak.b((ajut)iterator.next());
                    if (o == null) {
                        o = TextUtils.concat(new CharSequence[] { (CharSequence)b });
                    }
                    else {
                        o = TextUtils.concat(new CharSequence[] { (CharSequence)o, " · ", (CharSequence)b });
                    }
                }
            }
        }
        tpe.t(this.m, (CharSequence)o);
        final ImageView q = this.q;
        if ((anio.c & 0x80) == 0x0) {
            visibility = 8;
        }
        q.setVisibility(visibility);
        this.ak.setVisibility(8);
    }
    
    public final /* bridge */ void mN(final ackm ackm, Object o) {
        final anio k = (anio)o;
        this.T.g((Object)this);
        final anio i = this.K;
        this.K = k;
        final wyw a = ((wyy)ackm).a;
        if (!this.R.bR()) {
            final fyv d = this.d;
            if (d != null) {
                d.b();
            }
        }
        if (ackm.j("nested_fragment_key", false)) {
            final LinearLayout f = this.f;
            final int paddingStart = ((View)f).getPaddingStart();
            ((View)f).setPaddingRelative(this.ac, ((View)f).getPaddingTop(), ((View)f).getPaddingEnd(), ((View)f).getPaddingBottom());
            this.af.add(new aln((View)f, Optional.empty(), Optional.of((Object)paddingStart)));
            this.n((View)this.al, 2131168530);
            this.n((View)this.k, 2131169824);
            this.n((View)this.z, 2131169824);
            this.n((View)this.ai, 2131169824);
            this.n((View)this.aj, 2131169824);
            this.n((View)this.C, 2131169824);
        }
        final ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
        final anio j = this.K;
        ankh ankh;
        if ((j.c & 0x4) != 0x0) {
            anii anii;
            if ((anii = j.B) == null) {
                anii = anii.a;
            }
            if ((ankh = anii.b) == null) {
                ankh = ankh.a;
            }
        }
        else {
            ankh = null;
        }
        Label_0808: {
            if (layoutParams instanceof ViewGroup$MarginLayoutParams && ankh != null && (ankh.b & 0x1) != 0x0) {
                aotp aotp;
                if ((aotp = ankh.c) == null) {
                    aotp = aotp.a;
                }
                if (aald.S(aotp)) {
                    if (!this.ao || tpe.bf(this.aq, this.ab) >= 600) {
                        this.s.setVisibility(0);
                        if ((ankh.b & 0x10) != 0x0) {
                            aiqj m;
                            if ((m = ankh.e) == null) {
                                m = aiqj.a;
                            }
                            this.M = m;
                        }
                        else {
                            this.M = null;
                        }
                        aotp aotp2;
                        if ((aotp2 = ankh.c) == null) {
                            aotp2 = aotp.a;
                        }
                        final aoto aoto = (aoto)aotp2.c.get(0);
                        if (this.ao) {
                            final FrameLayout s = this.s;
                            final int ac = this.ac;
                            tpe.aF((View)s, tpe.ay(ac, ac, ac, 0), (Class)GridLayout$LayoutParams.class);
                        }
                        final float n = (float)aoto.d;
                        final float n2 = (float)aoto.e;
                        final boolean ao = this.ao;
                        float d2;
                        if (ao) {
                            d2 = 0.5625f;
                        }
                        else {
                            d2 = ankh.d;
                        }
                        int ac2;
                        if (ao) {
                            ac2 = this.ac;
                        }
                        else {
                            ac2 = 0;
                        }
                        final double n3 = this.aa;
                        double n5;
                        final double n4 = n5 = 1.0;
                        if (ao) {
                            final int bf = tpe.bf(this.aq, this.ab);
                            n5 = n4;
                            if (bf < 700) {
                                n5 = n4;
                                if (bf >= 600) {
                                    n5 = 0.85;
                                }
                            }
                        }
                        final float n6 = n / n2;
                        Double.isNaN(n3);
                        final float n7 = (float)((int)(n3 * n5) - (ac2 + ac2));
                        final boolean b = aoto.e >= aoto.d;
                        final ImageView r = this.r;
                        ImageView$ScaleType scaleType;
                        if (!this.ao && !b) {
                            scaleType = ImageView$ScaleType.CENTER_CROP;
                        }
                        else {
                            scaleType = ImageView$ScaleType.CENTER_INSIDE;
                        }
                        final int n8 = (int)(n7 * d2);
                        r.setScaleType(scaleType);
                        if ((this.aw.aS() && b) || this.ao) {
                            final float n9 = (float)n8;
                            this.r.setClipToOutline(true);
                            this.r.setBackgroundResource(2131231033);
                            tpe.aF((View)this.r, tpe.aE((int)(n9 * n6), n8), (Class)FrameLayout$LayoutParams.class);
                        }
                        else {
                            this.r.setBackground((Drawable)null);
                            tpe.aF((View)this.r, tpe.an(new tut[] { tpe.aD(-1), tpe.at(n8) }), (Class)FrameLayout$LayoutParams.class);
                        }
                        this.U.g(this.r, aotp2);
                        break Label_0808;
                    }
                }
            }
            this.s.setVisibility(8);
            this.M = null;
        }
        tpe.v((View)this.u, (this.K.b & 0x8000) != 0x0);
        final acgs u = this.U;
        final CircularImageView u2 = this.u;
        aotp aotp3;
        if ((aotp3 = this.K.r) == null) {
            aotp3 = aotp.a;
        }
        u.g((ImageView)u2, aotp3);
        aida aida;
        if ((aida = this.K.D) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aida.b & 0x1) != 0x0) {
            aida aida2;
            if ((aida2 = this.K.D) == null) {
                aida2 = aida.a;
            }
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
        }
        else {
            aicz = null;
        }
        ((acsx)this.ad).b(aicz, a);
        final anio l = this.K;
        aicz aicz2;
        if (l.d == 63) {
            aicz2 = (aicz)((ahbc)l.e).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            this.C.setVisibility(0);
            this.A.setVisibility(0);
            this.F.setVisibility(0);
        }
        else {
            this.C.setVisibility(8);
            this.A.setVisibility(8);
            this.F.setVisibility(8);
            aicz2 = null;
        }
        ((acsx)this.b).b(aicz2, a);
        final Drawable background = this.A.getBackground();
        this.A.setBackground((Drawable)null);
        this.C.setBackground(background);
        this.C.setOnClickListener((View$OnClickListener)new jan(this, 19));
        final anio k2 = this.K;
        aicz aicz3;
        if (k2.f == 64) {
            aicz3 = (aicz)((ahbc)k2.g).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
            this.D.setVisibility(0);
            this.B.setVisibility(0);
        }
        else {
            this.D.setVisibility(8);
            this.B.setVisibility(8);
            aicz3 = null;
        }
        ((acsx)this.c).b(aicz3, a);
        final Drawable background2 = this.B.getBackground();
        this.B.setBackground((Drawable)null);
        this.D.setBackground(background2);
        this.D.setOnClickListener((View$OnClickListener)new jan(this, 17));
        final anio k3 = this.K;
        final String h = k3.h;
        final ajb az = this.az;
        final OfflineArrowView w = this.w;
        anin anin;
        if ((anin = k3.F) == null) {
            anin = anin.a;
        }
        int n10 = 0;
        Label_1374: {
            if (anin.b == 65153809) {
                n10 = 2;
            }
            else {
                final anin f2 = this.K.F;
                anin a2;
                if (f2 == null) {
                    a2 = anin.a;
                }
                else {
                    a2 = f2;
                }
                if (a2.b == 60572968) {
                    anin a3;
                    if ((a3 = f2) == null) {
                        a3 = anin.a;
                    }
                    amxe a4;
                    if (a3.b == 60572968) {
                        a4 = (amxe)a3.c;
                    }
                    else {
                        a4 = amxe.a;
                    }
                    if (a4.c) {
                        n10 = 1;
                        break Label_1374;
                    }
                }
                n10 = 3;
            }
        }
        final aln ay = this.ay;
        final anin f3 = this.K.F;
        anin a5;
        if (f3 == null) {
            a5 = anin.a;
        }
        else {
            a5 = f3;
        }
        amxe a7;
        if (a5.b == 60572968) {
            anin a6;
            if ((a6 = f3) == null) {
                a6 = anin.a;
            }
            if (a6.b == 60572968) {
                a7 = (amxe)a6.c;
            }
            else {
                a7 = amxe.a;
            }
        }
        else {
            a7 = null;
        }
        final anin f4 = this.K.F;
        anin a8;
        if (f4 == null) {
            a8 = anin.a;
        }
        else {
            a8 = f4;
        }
        aicz a10;
        if (a8.b == 65153809) {
            anin a9;
            if ((a9 = f4) == null) {
                a9 = anin.a;
            }
            if (a9.b == 65153809) {
                a10 = (aicz)a9.c;
            }
            else {
                a10 = aicz.a;
            }
        }
        else {
            a10 = null;
        }
        this.au = az.x(h, w, n10, (View$OnClickListener)ay.I(h, a7, a10, (atke)new jfz(this, 1), (atke)new jfz(this, 0), a));
        Label_2482: {
            if (this.ao) {
                final int az2 = tpe.aZ(this.aq, 40);
                tpe.aF((View)this.n, tpe.an(new tut[] { tpe.aD(az2), tpe.at(az2) }), (Class)giz.class);
                final TintableImageView n11 = this.n;
                final int z = this.Z;
                n11.setPadding(z, z, z, z);
                tpe.aF((View)this.o, tpe.an(new tut[] { tpe.aD(az2), tpe.at(az2) }), (Class)giz.class);
                final TintableImageView o2 = this.o;
                final int z2 = this.Z;
                o2.setPadding(z2, z2, z2, z2);
                tpe.aF((View)this.w, tpe.an(new tut[] { tpe.aD(az2), tpe.at(az2) }), (Class)giz.class);
                final OfflineArrowView w2 = this.w;
                final int z3 = this.Z;
                w2.setPadding(z3, z3, z3, z3);
                tpe.aF((View)this.an, tpe.an(new tut[] { tpe.aD(az2), tpe.at(az2) }), (Class)giz.class);
                final TintableImageView an = this.an;
                final int z4 = this.Z;
                an.setPadding(z4, z4, z4, z4);
                tpe.aF((View)this.p, tpe.an(new tut[] { tpe.aD(az2), tpe.at(az2) }), (Class)giz.class);
                final TintableImageView p2 = this.p;
                final int z5 = this.Z;
                p2.setPadding(z5, z5, z5, z5);
                final TextView j2 = this.j;
                final Activity s2 = this.S;
                j2.setTextAppearance((Context)s2, tpe.cs((Context)s2, 2130970915));
                this.j.setIncludeFontPadding(true);
                this.j.setOnClickListener((View$OnClickListener)new jan(this, 18));
                this.g.setMaxLines(2);
                this.g.setEllipsize(TextUtils$TruncateAt.END);
                final TextView h2 = this.h;
                final Activity s3 = this.S;
                h2.setTextAppearance((Context)s3, tpe.cs((Context)s3, 2130970914));
                final YouTubeTextView z6 = this.z;
                final Activity s4 = this.S;
                z6.setTextAppearance((Context)s4, tpe.cs((Context)s4, 2130970912));
                if (this.ap) {
                    tpe.aF((View)this.n, tpe.ay(this.Z, 0, 0, 0), (Class)giz.class);
                    tpe.aF((View)this.o, tpe.ay(this.Z, 0, 0, 0), (Class)giz.class);
                    tpe.aF((View)this.w, tpe.ay(this.Z, 0, 0, 0), (Class)giz.class);
                    tpe.aF((View)this.an, tpe.ay(this.Z, 0, 0, 0), (Class)giz.class);
                    tpe.aF((View)this.p, tpe.ay(this.Z, 0, 0, 0), (Class)giz.class);
                }
                else {
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.al.getLayoutParams();
                    if (linearLayout$LayoutParams != null) {
                        int n12 = this.S.getResources().getDimensionPixelSize(2131168529);
                        final PlaylistHeaderActionBarView al = this.al;
                        if (!o(this.K)) {
                            n12 = this.ac;
                        }
                        tpe.aF((View)al, tpe.ay(n12, tpe.aZ(this.aq, 8), linearLayout$LayoutParams.getMarginEnd(), linearLayout$LayoutParams.bottomMargin), (Class)LinearLayout$LayoutParams.class);
                    }
                }
                final anio k4 = this.K;
                if ((k4.c & 0x10000000) != 0x0) {
                    anuv anuv;
                    if ((anuv = k4.Q) == null) {
                        anuv = anuv.a;
                    }
                    if (((ahbc)anuv).ry((ahaq)CinematicContainerRendererOuterClass$CinematicContainerRenderer.cinematicContainerRenderer)) {
                        final boolean b2 = this.ah.a() == gkv.a;
                        anuv anuv2;
                        if ((anuv2 = this.K.Q) == null) {
                            anuv2 = anuv.a;
                        }
                        final CinematicContainerRendererOuterClass$CinematicContainerRenderer cinematicContainerRendererOuterClass$CinematicContainerRenderer = (CinematicContainerRendererOuterClass$CinematicContainerRenderer)((ahbc)anuv2).rx((ahaq)CinematicContainerRendererOuterClass$CinematicContainerRenderer.cinematicContainerRenderer);
                        aila aila;
                        if ((aila = cinematicContainerRendererOuterClass$CinematicContainerRenderer.c) == null) {
                            aila = aila.a;
                        }
                        aotp a11;
                        if (aila.b == 1) {
                            a11 = (aotp)aila.c;
                        }
                        else {
                            a11 = aotp.a;
                        }
                        final acgn a12 = acgo.a();
                        a12.c = (acgq)new jga(this, cinematicContainerRendererOuterClass$CinematicContainerRenderer, b2);
                        this.U.j((ImageView)this.I, a11, a12.a());
                        this.H.setVisibility(0);
                        break Label_2482;
                    }
                }
                this.d();
            }
            else {
                tpe.v((View)this.t, (this.K.b & 0x4000) != 0x0);
                final acgs u3 = this.U;
                final ImageView t = this.t;
                aotp aotp4;
                if ((aotp4 = this.K.q) == null) {
                    aotp4 = aotp.a;
                }
                u3.g(t, aotp4);
            }
        }
        if (this.X.j(h)) {
            this.ax.k(h, (tcc)tca.c(this.S, (tcc)new jfw(this, h, 2)));
        }
        final anio k5 = this.K;
        if (k5 != i) {
            alob alob;
            if ((alob = k5.C) == null) {
                alob = alob.a;
            }
            ahbb ahbb;
            if ((alob.b & 0x1) != 0x0) {
                alob alob2;
                if ((alob2 = this.K.C) == null) {
                    alob2 = alob.a;
                }
                aloa aloa;
                if ((aloa = alob2.c) == null) {
                    aloa = aloa.a;
                }
                ahbb = (ahbb)((ahbh)aloa).toBuilder();
            }
            else {
                ahbb = null;
            }
            this.V.i(ahbb);
            if (ahbb != null) {
                final ahaz builder = this.K.toBuilder();
                alob alob3;
                if ((alob3 = this.K.C) == null) {
                    alob3 = alob.a;
                }
                final ahaz builder2 = alob3.toBuilder();
                builder2.copyOnWrite();
                final alob alob4 = (alob)builder2.instance;
                final aloa c = (aloa)((ahaz)ahbb).build();
                c.getClass();
                alob4.c = c;
                alob4.b |= 0x1;
                builder.copyOnWrite();
                final anio anio = (anio)builder.instance;
                final alob c2 = (alob)builder2.build();
                c2.getClass();
                anio.C = c2;
                anio.c |= 0x20;
                this.K = (anio)builder.build();
            }
        }
        this.E.setVisibility(8);
        for (final anuv anuv3 : this.K.P) {
            if (((ahbc)anuv3).ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.am.f((amhp)((ahbc)anuv3).rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                this.E.setVisibility(0);
                break;
            }
        }
        final TextView g = this.g;
        ajut ajut;
        if ((ajut = this.K.n) == null) {
            ajut = ajut.a;
        }
        tpe.t(g, (CharSequence)acak.b(ajut));
        if (this.R.bR()) {
            ajut ajut2;
            if ((ajut2 = this.K.u) == null) {
                ajut2 = ajut.a;
            }
            final Spanned b3 = acak.b(ajut2);
            tpe.t((TextView)this.z, (CharSequence)b3);
            if (b3.length() > 0) {
                final String value = String.valueOf(this.S.getResources().getString(2132017866));
                final boolean ao2 = this.ao;
                String s5 = "\u2026".concat(value);
                if (!ao2) {
                    s5 = s5.toUpperCase(this.S.getResources().getConfiguration().locale);
                }
                o = new SpannableString((CharSequence)s5);
                ((SpannableString)o).setSpan((Object)new StyleSpan(1), 1, ((SpannableString)o).length(), 33);
                if (this.R.f(45377164L)) {
                    final YouTubeTextView z7 = this.z;
                    z7.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new hbl(z7, (CharSequence)b3, (SpannableString)o, 5));
                }
                else {
                    final YouTubeTextView z8 = this.z;
                    z8.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new haq(z8, (SpannableString)o, 8));
                }
            }
        }
        else {
            final YouTubeTextView z9 = this.z;
            ajut ajut3;
            if ((ajut3 = this.K.u) == null) {
                ajut3 = ajut.a;
            }
            tpe.t((TextView)z9, (CharSequence)acak.r(ajut3));
        }
        final TextView h3 = this.h;
        ajut ajut4;
        if ((ajut4 = this.K.o) == null) {
            ajut4 = ajut.a;
        }
        tpe.t(h3, (CharSequence)acak.b(ajut4));
        final TextView k6 = this.k;
        ajut ajut5;
        if ((ajut5 = this.K.p) == null) {
            ajut5 = ajut.a;
        }
        tpe.t(k6, (CharSequence)acak.b(ajut5));
        final TextView j3 = this.j;
        ajut ajut6;
        if ((ajut6 = this.K.w) == null) {
            ajut6 = ajut.a;
        }
        tpe.t(j3, (CharSequence)acak.b(ajut6));
        final anio k7 = this.K;
        if (!o(k7)) {
            tpe.v((View)this.i, false);
        }
        else {
            anih anih;
            if ((anih = k7.L) == null) {
                anih = anih.a;
            }
            ajkd ajkd;
            if ((ajkd = anih.b) == null) {
                ajkd = ajkd.a;
            }
            final ahbx c3 = ajkd.c;
            final fuj fuj = new fuj(this.S);
            for (int n13 = 0; n13 < ((List)c3).size(); ++n13) {
                ajkf ajkf;
                if ((ajkf = ((ajka)((List)c3).get(n13)).e) == null) {
                    ajkf = ajkf.a;
                }
                ajut ajut7;
                if ((ajkf.b & 0x1) != 0x0) {
                    if ((ajut7 = ajkf.e) == null) {
                        ajut7 = ajut.a;
                    }
                }
                else {
                    ajut7 = null;
                }
                final Spanned b4 = acak.b(ajut7);
                if (ajkf.f) {
                    tpe.t((TextView)this.i, (CharSequence)b4);
                }
                if (b4 != null) {
                    fuj.b(b4.toString(), (fui)new jfy(this, b4, ajkf, 0));
                }
            }
            ful.a(fuj, (View)this.i, k7);
        }
        this.x.removeAllViews();
        anil anil;
        if ((anil = k.N) == null) {
            anil = anil.a;
        }
        aoix a13;
        if (anil.b == 76818770) {
            anil anil2;
            if ((anil2 = k.N) == null) {
                anil2 = anil.a;
            }
            if (anil2.b == 76818770) {
                a13 = (aoix)anil2.c;
            }
            else {
                a13 = aoix.a;
            }
        }
        else {
            a13 = null;
        }
        this.x.setVisibility(8);
        if (a13 != null) {
            if (this.at == null) {
                this.at = this.W.d(this.e, 2131625052, 2131625053);
            }
            this.at.b(ackm, a13);
            this.x.addView((View)this.at.c, -2, -2);
            this.x.setVisibility(0);
        }
        final boolean b5 = l(this.K) || m(this.K);
        final TintableImageView n14 = this.n;
        int visibility;
        if (!b5) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        n14.setVisibility(visibility);
        final TintableImageView o3 = this.o;
        anuv anuv4;
        if ((anuv4 = this.K.S) == null) {
            anuv4 = anuv.a;
        }
        int visibility2;
        if ((((aicz)((ahbc)anuv4).rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).b & 0x10000) == 0x0) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        o3.setVisibility(visibility2);
        final anio k8 = this.K;
        if ((k8.c & 0x80) != 0x0) {
            int cu;
            if ((cu = aqsx.cu(k8.E)) == 0) {
                cu = 1;
            }
            if (--cu != 1) {
                if (cu != 2) {
                    this.q.setImageResource(2131233786);
                    this.q.setVisibility(0);
                    this.q.setContentDescription((CharSequence)this.S.getString(2132017342));
                }
                else {
                    this.q.setImageResource(2131233773);
                    this.q.setVisibility(0);
                    this.q.setContentDescription((CharSequence)this.S.getString(2132017345));
                }
            }
            else {
                this.q.setImageResource(2131233722);
                this.q.setVisibility(0);
                this.q.setContentDescription((CharSequence)this.S.getString(2132017343));
            }
            this.q.setVisibility(0);
        }
        else {
            this.q.setImageDrawable((Drawable)null);
            this.q.setVisibility(8);
        }
        this.i(this.K);
        this.k(this.K);
        aiqj l2;
        if ((l2 = this.K.v) == null) {
            l2 = aiqj.a;
        }
        this.L = l2;
        final anio k9 = this.K;
        aiqj n15;
        if ((n15 = k9.i) == null) {
            n15 = aiqj.a;
        }
        this.N = n15;
        aiqj o4;
        if ((o4 = k9.x) == null) {
            o4 = aiqj.a;
        }
        this.O = o4;
        final TintableImageView p3 = this.p;
        final aiqj n16 = this.N;
        int visibility3;
        if (n16 != null && ((ahbc)n16).ry((ahaq)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        p3.setVisibility(visibility3);
        View view = null;
        View view2 = null;
        for (int n17 = 0; n17 < this.l.getChildCount(); ++n17) {
            final View child = this.l.getChildAt(n17);
            View view3;
            if (child.getId() == 2131428705) {
                if (view2 != null && n17 != this.l.getChildCount() - 1) {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    view3 = child;
                }
                else {
                    child.setVisibility(8);
                    view3 = view;
                }
            }
            else {
                view3 = view;
                if (child.getVisibility() == 0) {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    view2 = child;
                    view = null;
                    continue;
                }
            }
            view = view3;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        this.f();
        final anio k10 = this.K;
        aidd aidd;
        if ((aidd = k10.J) == null) {
            aidd = aidd.a;
        }
        if ((aidd.b & 0x1) != 0x0) {
            final fvr ag = this.ag;
            aidd aidd2;
            if ((aidd2 = k10.J) == null) {
                aidd2 = aidd.a;
            }
            aidi aidi;
            if ((aidi = aidd2.c) == null) {
                aidi = aidi.a;
            }
            ag.b(aidi);
        }
        else {
            this.ag.b(null);
        }
        this.j(this.av);
        if (!this.R.bR()) {
            this.z.post((Runnable)new jfu(this, 2));
        }
        if (this.aA.by((MessageLite)this.K)) {
            this.aA.bA(a, (MessageLite)this.K);
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        final Class[] array = null;
        Class[] array2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            case 8: {
                if (!((zxy)o).a.equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 7: {
                if (!((zxx)o).a.d().equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 6: {
                if (!((zxw)o).a.equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 5: {
                if (!((zxv)o).a.d().equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 4: {
                if (!((zxt)o).a.equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 3: {
                if (!((zxs)o).a.equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 2: {
                if (!((zxr)o).a.equals(this.K.h)) {
                    array2 = array;
                    break;
                }
                this.f();
                return null;
            }
            case 1: {
                final vul vul = (vul)o;
                final akxs b = vul.b;
                array2 = array;
                if ((0x4 & b.b) != 0x0) {
                    akxt akxt;
                    if ((akxt = b.d) == null) {
                        akxt = akxt.a;
                    }
                    anio a;
                    if (akxt.b == 53272665) {
                        akxt akxt2;
                        if ((akxt2 = vul.b.d) == null) {
                            akxt2 = akxt.a;
                        }
                        if (akxt2.b == 53272665) {
                            a = (anio)akxt2.c;
                        }
                        else {
                            a = anio.a;
                        }
                    }
                    else {
                        a = null;
                    }
                    this.i(a);
                    this.k(a);
                    array2 = array;
                    break;
                }
                break;
            }
            case 0: {
                this.j((gfu)o);
                array2 = array;
                break;
            }
            case -1: {
                array2 = new Class[] { gfu.class, vul.class, zxr.class, zxs.class, zxt.class, zxv.class, zxw.class, zxx.class, zxy.class };
                break;
            }
        }
        return array2;
    }
}

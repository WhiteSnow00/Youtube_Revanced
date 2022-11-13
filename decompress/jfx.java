import com.google.protobuf.MessageLite;
import java.util.Map;
import java.util.HashMap;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import java.util.ArrayList;
import android.view.View$OnClickListener;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.content.Context;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import java.util.List;
import android.app.Activity;
import android.widget.TextView;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfx implements acko, tgg
{
    final FrameLayout A;
    final LinearLayout B;
    final ViewStub C;
    final TextView D;
    public anio E;
    public aiqj F;
    public Boolean G;
    private final Activity H;
    private final tgd I;
    private final arkg J;
    private final gfq K;
    private final acsx L;
    private final fvf M;
    private final acpk N;
    private final atke O;
    private final atke P;
    private final atke Q;
    private final atke R;
    private final arkg S;
    private final arkg T;
    private final int U;
    private final acsy V;
    private final fvr W;
    private final List X;
    private final gja Y;
    private final fvr Z;
    public final vcy a;
    private final TextView aa;
    private final FrameLayout ab;
    private final PlaylistHeaderActionBarView ac;
    private final gag ad;
    private fve ae;
    private ilk af;
    private gfu ag;
    final acsy b;
    final fvr c;
    public final fyv d;
    final ViewGroup e;
    public final LinearLayout f;
    final TextView g;
    final TextView h;
    final TextView i;
    final TextView j;
    final TextView k;
    final LinearLayout l;
    final TextView m;
    final ImageView n;
    final ImageView o;
    final ImageView p;
    final ImageView q;
    final ImageView r;
    final ImageView s;
    final ImageView t;
    public final ImageView u;
    final OfflineArrowView v;
    final ViewGroup w;
    final View$OnLayoutChangeListener x;
    final TextView y;
    public final TextView z;
    
    public jfx(final Activity h, final tgd i, final arkg j, final vcy a, final lmo lmo, final gfq k, final fvf m, final hyx hyx, final ziy ziy, final aujg aujg, final acpk n, final atke o, final atke p28, final aaih aaih, final atke q, final fzw fzw, final atke r, final arkg s, final arkg t, final cya cya, final vai vai, final vai vai2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.a = a;
        this.K = k;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p28;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        if (!vai2.f(45383835L)) {
            j.a();
            o.a();
            p28.a();
            r.a();
            s.a();
            t.a();
        }
        final ViewGroup e = (ViewGroup)View.inflate((Context)h, 2131625044, (ViewGroup)null);
        this.e = e;
        this.w = (ViewGroup)e.findViewById(2131431611);
        this.f = (LinearLayout)e.findViewById(2131430474);
        final TextView g = (TextView)e.findViewById(2131430493);
        this.g = g;
        this.h = (TextView)e.findViewById(2131430486);
        this.i = (TextView)e.findViewById(2131431314);
        this.k = (TextView)e.findViewById(2131430495);
        this.j = (TextView)e.findViewById(2131430473);
        final TextView y = (TextView)e.findViewById(2131430476);
        this.y = y;
        this.l = (LinearLayout)e.findViewById(2131431799);
        this.m = (TextView)e.findViewById(2131430485);
        final ImageView n2 = (ImageView)e.findViewById(2131431401);
        this.n = n2;
        final ImageView o2 = (ImageView)e.findViewById(2131428785);
        this.o = o2;
        final ImageView p29 = (ImageView)e.findViewById(2131431468);
        this.p = p29;
        final ImageView q2 = (ImageView)e.findViewById(2131431540);
        this.q = q2;
        this.r = (ImageView)e.findViewById(2131430623);
        this.v = (OfflineArrowView)e.findViewById(2131430125);
        this.s = (ImageView)e.findViewById(2131429234);
        final ImageView t2 = (ImageView)e.findViewById(2131428086);
        this.t = t2;
        if (vai.aS()) {
            t2.setClipToOutline(true);
            t2.setBackgroundResource(2131231033);
        }
        this.u = (ImageView)e.findViewById(2131428938);
        final PlaylistHeaderActionBarView ac = (PlaylistHeaderActionBarView)e.findViewById(2131427488);
        this.ac = ac;
        final TextView aa = (TextView)e.findViewById(2131427452);
        this.aa = aa;
        final TextView d = (TextView)e.findViewById(2131430136);
        this.D = d;
        this.ab = (FrameLayout)e.findViewById(2131429064);
        final TextView z = (TextView)e.findViewById(2131430598);
        this.z = z;
        this.A = (FrameLayout)e.findViewById(2131430597);
        final LinearLayout b = (LinearLayout)e.findViewById(2131431321);
        this.B = b;
        final ViewStub c = (ViewStub)e.findViewById(2131429862);
        this.C = c;
        final ImageView b2 = (ImageView)e.findViewById(2131431234);
        this.ad = cya.D((Context)h, c);
        k.b(e.findViewById(2131429539));
        this.V = ziy.ap(aa);
        this.b = ziy.ap(z);
        final fvr p30 = hyx.p((View)b);
        this.c = p30;
        p30.c = (TextView)b.findViewById(2131431329);
        p30.b = (ImageView)b.findViewById(2131431328);
        final fvr p31 = hyx.p((View)b2);
        this.Z = p31;
        p31.b = b2;
        this.Y = fzw.ab((FloatingActionButton)e.findViewById(2131430479));
        n2.setOnClickListener((View$OnClickListener)new gbw(this, a, lmo, 13, (byte[])null, (byte[])null, (byte[])null));
        o2.setOnClickListener((View$OnClickListener)new ivc(this, a, 8));
        p29.setOnClickListener((View$OnClickListener)new ivc(this, a, 9));
        d.setOnClickListener((View$OnClickListener)new ivc(this, aaih, 10));
        this.L = aujg.H((View)q2);
        final Resources resources = h.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.U = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.W = hyx.p(ac.findViewById(2131432115));
        this.d = new fyv(y, resources.getInteger(2131493048), resources.getInteger(2131493049));
        final jcl x = new jcl(this, (View$OnClickListener)new jan(this, 16), 2);
        y.addOnLayoutChangeListener(this.x = (View$OnLayoutChangeListener)x);
        g.addOnLayoutChangeListener((View$OnLayoutChangeListener)x);
        this.X = new ArrayList();
    }
    
    public static boolean k(final anio anio) {
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
    
    public static boolean l(final anio anio) {
        aniq aniq;
        if ((aniq = anio.z) == null) {
            aniq = aniq.a;
        }
        return aniq.b;
    }
    
    private final void m(final View view, final int n) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            final int marginStart = viewGroup$MarginLayoutParams.getMarginStart();
            viewGroup$MarginLayoutParams.setMarginStart(this.H.getResources().getDimensionPixelSize(n));
            this.X.add(new aln(view, aezp.k((Object)marginStart), (aezp)aeyo.a));
        }
    }
    
    public final View a() {
        return (View)this.e;
    }
    
    public final int b() {
        if (((fmr)this.O.a()).j(this.E.h)) {
            return ((aabo)this.Q.a()).a().i().a(this.E.h);
        }
        return 0;
    }
    
    public final void c(final acku acku) {
        this.I.m((Object)this);
        for (final aln aln : this.X) {
            if (((aezp)aln.b).h()) {
                final ViewGroup$LayoutParams layoutParams = ((View)aln.c).getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    ((ViewGroup$MarginLayoutParams)layoutParams).setMarginStart((int)((aezp)aln.b).c());
                }
            }
            final aezp aezp = (aezp)aln.a;
            if (aezp.h()) {
                ((View)aln.c).setPaddingRelative((int)aezp.c(), ((View)aln.c).getPaddingTop(), ((View)aln.c).getPaddingEnd(), ((View)aln.c).getPaddingBottom());
            }
        }
        this.X.clear();
        this.af = null;
        this.G = null;
    }
    
    public final void d() {
        final int b = this.b();
        final TextView d = this.D;
        String quantityString;
        if (b > 0) {
            quantityString = this.H.getResources().getQuantityString(2131886096, b, new Object[] { b });
        }
        else {
            quantityString = null;
        }
        tpe.t(d, (CharSequence)quantityString);
        final ilk af = this.af;
        if (af != null) {
            ((ikv)af).a();
        }
    }
    
    public final void f() {
        tpe.v((View)this.u, this.d.d());
        final ImageView u = this.u;
        float rotation;
        if (!this.d.d) {
            rotation = 360.0f;
        }
        else {
            rotation = 180.0f;
        }
        u.setRotation(rotation);
    }
    
    public final void g(final anio anio) {
        aida aida;
        if ((aida = anio.G) == null) {
            aida = aida.a;
        }
        if ((aida.b & 0x2) != 0x0) {
            final fvr w = this.W;
            aidi aidi;
            if ((aidi = aida.d) == null) {
                aidi = aidi.a;
            }
            w.b(aidi);
            return;
        }
        this.W.a();
    }
    
    public final void h(final anio anio) {
        Object o;
        if ((anio.c & 0x800000) != 0x0) {
            anik anik;
            if ((anik = anio.M) == null) {
                anik = anik.a;
            }
            akav akav;
            if ((akav = anik.c) == null) {
                akav = akav.a;
            }
            o = new gdy(akav);
        }
        else {
            o = null;
        }
        this.Y.a((gdz)o);
    }
    
    public final void i(final gfu ag) {
        final anio e = this.E;
        if (e != null && ag != null && TextUtils.equals((CharSequence)e.h, (CharSequence)ag.b())) {
            this.K.f(ag.a());
            if (!this.Z.e()) {
                final boolean b = ag.a() == alog.a;
                final fvr z = this.Z;
                final aidi d = z.d;
                d.getClass();
                if (d.e != b) {
                    z.c();
                }
            }
            this.ag = ag;
            return;
        }
        this.ag = null;
    }
    
    public final void j(final anio anio) {
        Object o;
        if (anio.y.size() == 0) {
            ajut ajut;
            if ((ajut = anio.t) == null) {
                ajut = ajut.a;
            }
            o = acak.b(ajut);
        }
        else {
            final ahbx y = anio.y;
            o = new SpannedString((CharSequence)"");
            final Iterator iterator = ((List)y).iterator();
            while (iterator.hasNext()) {
                final Spanned b = acak.b((ajut)iterator.next());
                if (((CharSequence)o).length() == 0) {
                    o = TextUtils.concat(new CharSequence[] { (CharSequence)b });
                }
                else {
                    o = TextUtils.concat(new CharSequence[] { (CharSequence)o, " · ", (CharSequence)b });
                }
            }
        }
        tpe.t(this.m, (CharSequence)o);
    }
    
    public final /* bridge */ void mN(final ackm ackm, Object o) {
        final anio e = (anio)o;
        this.I.g((Object)this);
        final anio e2 = this.E;
        this.E = e;
        final wyw a = ((wyy)ackm).a;
        this.d.b();
        if (ackm.j("nested_fragment_key", false)) {
            final LinearLayout f = this.f;
            final int paddingStart = ((View)f).getPaddingStart();
            ((View)f).setPaddingRelative(this.H.getResources().getDimensionPixelSize(2131169824), ((View)f).getPaddingTop(), ((View)f).getPaddingEnd(), ((View)f).getPaddingBottom());
            this.X.add(new aln((View)f, (aezp)aeyo.a, aezp.k((Object)paddingStart)));
            this.m((View)this.ac, 2131168530);
            this.m((View)this.k, 2131169824);
            this.m((View)this.y, 2131169824);
            this.m((View)this.aa, 2131169824);
            this.m((View)this.ab, 2131169824);
            this.m((View)this.A, 2131169824);
        }
        final ViewGroup$LayoutParams layoutParams = this.s.getLayoutParams();
        final anio e3 = this.E;
        ankh ankh;
        if ((e3.c & 0x4) != 0x0) {
            anii anii;
            if ((anii = e3.B) == null) {
                anii = anii.a;
            }
            if ((ankh = anii.b) == null) {
                ankh = ankh.a;
            }
        }
        else {
            ankh = null;
        }
        if (layoutParams instanceof ViewGroup$MarginLayoutParams && ankh != null && (ankh.b & 0x1) != 0x0) {
            this.s.setVisibility(0);
            tpe.aF((View)this.s, tpe.at((int)(this.U * ankh.d)), (Class)ViewGroup$LayoutParams.class);
            final acgs acgs = (acgs)this.J.a();
            final ImageView s = this.s;
            aotp aotp;
            if ((aotp = ankh.c) == null) {
                aotp = aotp.a;
            }
            acgs.g(s, aotp);
        }
        else {
            this.s.setVisibility(8);
        }
        tpe.v((View)this.t, (this.E.b & 0x4000) != 0x0);
        final acgs acgs2 = (acgs)this.J.a();
        final ImageView t = this.t;
        aotp aotp2;
        if ((aotp2 = this.E.q) == null) {
            aotp2 = aotp.a;
        }
        acgs2.g(t, aotp2);
        aida aida;
        if ((aida = this.E.D) == null) {
            aida = aida.a;
        }
        aicz aicz;
        if ((aida.b & 0x1) != 0x0) {
            aida aida2;
            if ((aida2 = this.E.D) == null) {
                aida2 = aida.a;
            }
            if ((aicz = aida2.c) == null) {
                aicz = aicz.a;
            }
        }
        else {
            aicz = null;
        }
        ((acsx)this.V).b(aicz, a);
        final anio e4 = this.E;
        aicz aicz2;
        if ((e4.b & 0x40) != 0x0) {
            anuv anuv;
            if ((anuv = e4.j) == null) {
                anuv = anuv.a;
            }
            aicz2 = (aicz)((ahbc)anuv).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
        }
        else {
            aicz2 = null;
        }
        ((acsx)this.b).b(aicz2, a);
        this.A.setVisibility(this.z.getVisibility());
        this.A.setFocusable(this.z.isFocusable());
        this.A.setClickable(this.z.isClickable());
        this.A.setEnabled(this.z.isEnabled());
        this.A.setContentDescription(this.z.getContentDescription());
        this.z.setClickable(false);
        this.z.setFocusable(false);
        this.z.setContentDescription((CharSequence)null);
        final Drawable background = this.z.getBackground();
        this.z.setBackground((Drawable)null);
        this.A.setBackground(background);
        this.A.setOnClickListener((View$OnClickListener)new jan(this, 15));
        final anio e5 = this.E;
        if ((e5.b & 0x80) != 0x0) {
            anuv anuv2;
            if ((anuv2 = e5.k) == null) {
                anuv2 = anuv.a;
            }
            this.c.b((aidi)((ahbc)anuv2).rx((ahaq)ButtonRendererOuterClass.toggleButtonRenderer));
        }
        else {
            this.c.a();
        }
        final String h = this.E.h;
        final ajb ajb = (ajb)this.S.a();
        final OfflineArrowView v = this.v;
        anin anin;
        if ((anin = this.E.F) == null) {
            anin = anin.a;
        }
        int n = 0;
        Label_0949: {
            if (anin.b == 65153809) {
                n = 2;
            }
            else {
                final anin f2 = this.E.F;
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
                        n = 1;
                        break Label_0949;
                    }
                }
                n = 3;
            }
        }
        final aln aln = (aln)this.T.a();
        final anin f3 = this.E.F;
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
        final anin f4 = this.E.F;
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
        this.af = ajb.x(h, v, n, (View$OnClickListener)aln.I(h, a7, a10, (atke)new esd(this, 19), (atke)new esd(this, 20), a));
        if (((fmr)this.O.a()).j(h)) {
            ((ktn)this.P.a()).k(h, (tcc)tca.c(this.H, (tcc)new jfw(this, h, 0)));
        }
        final anio e6 = this.E;
        if (e6 != e2) {
            alob alob;
            if ((alob = e6.C) == null) {
                alob = alob.a;
            }
            ahbb ahbb;
            if ((alob.b & 0x1) != 0x0) {
                alob alob2;
                if ((alob2 = this.E.C) == null) {
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
            this.K.i(ahbb);
            if (ahbb != null) {
                final ahaz builder = this.E.toBuilder();
                alob alob3;
                if ((alob3 = this.E.C) == null) {
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
                this.E = (anio)builder.build();
            }
        }
        this.C.setVisibility(8);
        for (final anuv anuv3 : this.E.P) {
            if (((ahbc)anuv3).ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.ad.f((amhp)((ahbc)anuv3).rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                this.C.setVisibility(0);
                break;
            }
        }
        final TextView g = this.g;
        ajut ajut;
        if ((ajut = this.E.n) == null) {
            ajut = ajut.a;
        }
        tpe.t(g, (CharSequence)acak.b(ajut));
        final TextView y = this.y;
        ajut ajut2;
        if ((ajut2 = this.E.u) == null) {
            ajut2 = ajut.a;
        }
        tpe.t(y, (CharSequence)acak.r(ajut2));
        final TextView h2 = this.h;
        ajut ajut3;
        if ((ajut3 = this.E.o) == null) {
            ajut3 = ajut.a;
        }
        tpe.t(h2, (CharSequence)acak.b(ajut3));
        final TextView k = this.k;
        ajut ajut4;
        if ((ajut4 = this.E.p) == null) {
            ajut4 = ajut.a;
        }
        tpe.t(k, (CharSequence)acak.b(ajut4));
        final TextView j = this.j;
        ajut ajut5;
        if ((ajut5 = this.E.w) == null) {
            ajut5 = ajut.a;
        }
        tpe.t(j, (CharSequence)acak.b(ajut5));
        final anio e7 = this.E;
        anih anih;
        if ((anih = e7.L) == null) {
            anih = anih.a;
        }
        ajkd ajkd;
        if ((ajkd = anih.b) == null) {
            ajkd = ajkd.a;
        }
        if (ajkd.c.size() == 0) {
            tpe.v((View)this.i, false);
        }
        else {
            anih anih2;
            if ((anih2 = e7.L) == null) {
                anih2 = anih.a;
            }
            ajkd ajkd2;
            if ((ajkd2 = anih2.b) == null) {
                ajkd2 = ajkd.a;
            }
            final ahbx c3 = ajkd2.c;
            final fuj fuj = new fuj(this.H);
            for (int i = 0; i < ((List)c3).size(); ++i) {
                ajkf ajkf;
                if ((ajkf = ((ajka)((List)c3).get(i)).e) == null) {
                    ajkf = ajkf.a;
                }
                ajut ajut6;
                if ((ajkf.b & 0x1) != 0x0) {
                    if ((ajut6 = ajkf.e) == null) {
                        ajut6 = ajut.a;
                    }
                }
                else {
                    ajut6 = null;
                }
                final Spanned b = acak.b(ajut6);
                if (ajkf.f) {
                    tpe.t(this.i, (CharSequence)b);
                }
                if (b != null) {
                    fuj.b(b.toString(), (fui)new jfy(this, b, ajkf, 1));
                }
            }
            ful.a(fuj, (View)this.i, e7);
        }
        this.w.removeAllViews();
        anil anil;
        if ((anil = e.N) == null) {
            anil = anil.a;
        }
        aoix a11;
        if (anil.b == 76818770) {
            anil anil2;
            if ((anil2 = e.N) == null) {
                anil2 = anil.a;
            }
            if (anil2.b == 76818770) {
                a11 = (aoix)anil2.c;
            }
            else {
                a11 = aoix.a;
            }
        }
        else {
            a11 = null;
        }
        this.w.setVisibility(8);
        if (a11 != null) {
            if (this.ae == null) {
                this.ae = this.M.d(this.e, 2131625052, 2131625053);
            }
            this.ae.b(ackm, a11);
            this.w.addView((View)this.ae.c, -2, -2);
            this.w.setVisibility(0);
        }
        final boolean b2 = k(this.E) || l(this.E);
        final ImageView n2 = this.n;
        int visibility;
        if (!b2) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        n2.setVisibility(visibility);
        final ImageView p2 = this.p;
        anuv anuv4;
        if ((anuv4 = this.E.S) == null) {
            anuv4 = anuv.a;
        }
        int visibility2;
        if ((((aicz)((ahbc)anuv4).rx((ahaq)ButtonRendererOuterClass.buttonRenderer)).b & 0x10000) == 0x0) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        p2.setVisibility(visibility2);
        int cu;
        if ((cu = aqsx.cu(this.E.E)) == 0) {
            cu = 1;
        }
        if (--cu != 1) {
            if (cu != 2) {
                this.r.setImageResource(2131233786);
                this.r.setVisibility(0);
                this.r.setContentDescription((CharSequence)this.H.getString(2132017342));
            }
            else {
                this.r.setImageResource(2131233773);
                this.r.setVisibility(0);
                this.r.setContentDescription((CharSequence)this.H.getString(2132017345));
            }
        }
        else {
            this.r.setImageResource(2131233722);
            this.r.setVisibility(0);
            this.r.setContentDescription((CharSequence)this.H.getString(2132017343));
        }
        this.g(this.E);
        this.h(this.E);
        this.j(this.E);
        aiqj f5;
        if ((f5 = this.E.i) == null) {
            f5 = aiqj.a;
        }
        this.F = f5;
        final ImageView o2 = this.o;
        int visibility3;
        if (f5 != null && ((ahbc)f5).ry((ahaq)PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) {
            visibility3 = 0;
        }
        else {
            visibility3 = 8;
        }
        o2.setVisibility(visibility3);
        final anio e8 = this.E;
        Label_2755: {
            if (e8.f == 64) {
                final aicz aicz3 = (aicz)((ahbc)e8.g).rx((ahaq)ButtonRendererOuterClass.buttonRenderer);
                if ((aicz3.b & 0x20) != 0x0) {
                    final acpk n3 = this.N;
                    akdi akdi;
                    if ((akdi = aicz3.g) == null) {
                        akdi = akdi.a;
                    }
                    akdh akdh;
                    if ((akdh = akdh.b(akdi.c)) == null) {
                        akdh = akdh.a;
                    }
                    if (n3.a(akdh) != 0) {
                        final ImageView q = this.q;
                        final acpk n4 = this.N;
                        akdi akdi2;
                        if ((akdi2 = aicz3.g) == null) {
                            akdi2 = akdi.a;
                        }
                        akdh akdh2;
                        if ((akdh2 = akdh.b(akdi2.c)) == null) {
                            akdh2 = akdh.a;
                        }
                        q.setImageResource(n4.a(akdh2));
                        o = new HashMap();
                        ((Map<String, Boolean>)o).put("START_SHUFFLED", Boolean.valueOf(true));
                        this.L.a(aicz3, ((wyy)ackm).a, (Map)o);
                        this.q.setVisibility(0);
                        break Label_2755;
                    }
                }
                this.q.setVisibility(8);
            }
            else {
                this.q.setVisibility(8);
            }
        }
        View view = null;
        View view2 = null;
        View view3;
        for (int l = 0; l < this.l.getChildCount(); ++l, view = view3) {
            final View child = this.l.getChildAt(l);
            if (child.getId() == 2131428705) {
                if (view2 != null && l != this.l.getChildCount() - 1) {
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
                    view3 = null;
                }
            }
        }
        if (view != null) {
            view.setVisibility(8);
        }
        this.d();
        final anio e9 = this.E;
        aidd aidd;
        if ((aidd = e9.J) == null) {
            aidd = aidd.a;
        }
        if ((aidd.b & 0x1) != 0x0) {
            final fvr z = this.Z;
            aidd aidd2;
            if ((aidd2 = e9.J) == null) {
                aidd2 = aidd.a;
            }
            aidi aidi;
            if ((aidi = aidd2.c) == null) {
                aidi = aidi.a;
            }
            z.b(aidi);
        }
        else {
            this.Z.a();
        }
        this.i(this.ag);
        this.y.post((Runnable)new jfu(this, 0));
        if (((aeea)this.R.a()).by((MessageLite)this.E)) {
            ((aeea)this.R.a()).bA(a, (MessageLite)this.E);
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
                if (!((zxy)o).a.equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 7: {
                if (!((zxx)o).a.d().equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 6: {
                if (!((zxw)o).a.equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 5: {
                if (!((zxv)o).a.d().equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 4: {
                if (!((zxt)o).a.equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 3: {
                if (!((zxs)o).a.equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 2: {
                if (!((zxr)o).a.equals(this.E.h)) {
                    array2 = array;
                    break;
                }
                this.d();
                return null;
            }
            case 1: {
                final vul vul = (vul)o;
                final akxs b = vul.b;
                array2 = array;
                if ((0x4 & b.b) == 0x0) {
                    break;
                }
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
                if (a == null) {
                    array2 = array;
                    break;
                }
                this.g(a);
                this.h(a);
                this.j(a);
                return null;
            }
            case 0: {
                this.i((gfu)o);
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

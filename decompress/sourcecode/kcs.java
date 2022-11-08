import android.graphics.drawable.Drawable;
import java.util.Map;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import java.util.Arrays;
import java.util.Iterator;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import java.util.Collection;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.view.ViewStub;
import android.view.View;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kcs implements acil, acif
{
    public alm A;
    public cdn B;
    private ike C;
    private faf D;
    private final jjg E;
    private final qbo F;
    private final cxz G;
    private final List a;
    private fzz b;
    private final View c;
    private final View d;
    private final ViewStub e;
    private gkz f;
    public final Context g;
    public final aceo h;
    public final View i;
    public final TextView j;
    protected final TextView k;
    public final TextView l;
    protected final TextView m;
    protected final TextView n;
    public TextView o;
    public fvh p;
    protected ftq q;
    protected jgc r;
    protected kmb s;
    protected kmb t;
    protected fzy u;
    public kmc v;
    public final ImageView w;
    public final View x;
    public int y;
    public aorm z;
    
    public kcs(final Context g, final aceo h, final acio acio, final View i, final vax vax, final acng acng, final qbo f, final cxz g2, final jjg e, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        this.F = f;
        this.G = g2;
        this.E = e;
        acio.getClass();
        acio.c(i);
        i.getClass();
        this.i = i;
        final TextView j = (TextView)i.findViewById(2131432092);
        this.j = j;
        this.k = (TextView)i.findViewById(2131428624);
        this.l = (TextView)i.findViewById(2131428769);
        this.m = (TextView)gow.f(i, 2131427696, TextView.class);
        this.n = (TextView)gow.f(i, 2131428648, TextView.class);
        this.w = (ImageView)i.findViewById(2131432006);
        this.x = i.findViewById(2131428448);
        int a;
        if (j == null) {
            a = 0;
        }
        else {
            a = apr.a(j);
        }
        this.y = a;
        this.d = i.findViewById(2131431187);
        this.e = (ViewStub)i.findViewById(2131430123);
        final ViewStub viewStub = (ViewStub)i.findViewById(2131431680);
        final fzy fzy = null;
        fzz b;
        if (viewStub == null) {
            b = null;
        }
        else {
            b = new fzz(viewStub, 1);
        }
        this.b = b;
        final ViewStub viewStub2 = (ViewStub)i.findViewById(2131431679);
        jgc a2;
        if (viewStub2 != null && e != null) {
            a2 = e.a(viewStub2);
        }
        else {
            a2 = null;
        }
        this.r = a2;
        final ViewStub viewStub3 = (ViewStub)i.findViewById(2131431678);
        kmb t;
        if (viewStub3 == null) {
            t = null;
        }
        else {
            t = new kmb(viewStub3, g, vax, acng);
        }
        this.t = t;
        final ViewStub viewStub4 = (ViewStub)i.findViewById(2131431963);
        ftq q;
        if (viewStub4 == null) {
            q = null;
        }
        else {
            q = new ftq(viewStub4);
        }
        this.q = q;
        final ViewStub viewStub5 = (ViewStub)i.findViewById(2131431946);
        fvh p15;
        if (viewStub5 == null) {
            p15 = null;
        }
        else {
            p15 = new fvh(viewStub5, g, acng);
        }
        this.p = p15;
        final ViewStub viewStub6 = (ViewStub)i.findViewById(2131432363);
        cdn b2;
        if (viewStub6 == null) {
            b2 = null;
        }
        else {
            b2 = new cdn(viewStub6, g);
        }
        this.B = b2;
        final ViewStub viewStub7 = (ViewStub)i.findViewById(2131431677);
        kmb s;
        if (viewStub7 == null) {
            s = null;
        }
        else {
            s = new kmb(viewStub7, g, vax, acng);
        }
        this.s = s;
        final ViewStub viewStub8 = (ViewStub)i.findViewById(2131430603);
        kmc v;
        if (viewStub8 == null) {
            v = null;
        }
        else {
            v = new kmc(viewStub8, g);
        }
        this.v = v;
        final ViewStub viewStub9 = (ViewStub)i.findViewById(2131432192);
        alm a3;
        if (viewStub9 == null) {
            a3 = null;
        }
        else {
            a3 = new alm(viewStub9, vax);
        }
        this.A = a3;
        final ViewStub viewStub10 = (ViewStub)i.findViewById(2131429862);
        fzy d = fzy;
        if (viewStub10 != null) {
            d = fzy;
            if (g2 != null) {
                d = g2.D(g, viewStub10);
            }
        }
        this.u = d;
        this.a = adwd.ak();
        final View viewById = i.findViewById(2131432026);
        if ((this.c = viewById) != null && uyi != null && uyi.aR()) {
            viewById.setClipToOutline(true);
            viewById.setBackgroundResource(2131231033);
        }
    }
    
    public kcs(final Context context, final aceo aceo, final acio acio, final View view, final vax vax, final qbo qbo, final cxz cxz, final jjg jjg, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this(context, aceo, acio, view, vax, null, qbo, cxz, jjg, uyi, null, null, null, null, null);
    }
    
    public kcs(final Context context, final aceo aceo, final vax vax, final acio acio, final int n, final ViewGroup viewGroup, final qbo qbo, final cxz cxz, final jjg jjg, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this(context, aceo, acio, LayoutInflater.from(context).inflate(n, viewGroup, false), vax, null, qbo, cxz, jjg, uyi, null, null, null, null, null);
    }
    
    public kcs(final Context context, final aceo aceo, final vax vax, final acio acio, final int n, final qbo qbo, final jjg jjg, final uyi uyi, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this(context, aceo, vax, acio, n, null, qbo, null, jjg, uyi, null, null, null, null, null);
    }
    
    protected static final void B(final acij acij, final apin apin) {
        acij.f("VideoPresenterConstants.VIDEO_ID", (Object)apin.c);
    }
    
    protected final void A(final CharSequence text) {
        final TextView j = this.j;
        if (j != null) {
            j.setText(text);
        }
    }
    
    protected final void C(final anss anss, final acij acij, final eg eg, final achv achv) {
        final boolean rs = ((agzd)anss).rs((agyr)aokk.a);
        final ajsq ajsq = null;
        aokj aokj;
        if (rs) {
            aokj = (aokj)((agzd)anss).rr((agyr)aokk.a);
        }
        else {
            aokj = null;
        }
        if (aokj != null && this.D == null) {
            ViewGroup viewById;
            final View view = (View)(viewById = (ViewGroup)this.i.findViewById(2131431809));
            if (view instanceof ViewStub) {
                viewById = (ViewGroup)((ViewStub)view).inflate();
            }
            if (viewById instanceof ViewGroup) {
                final ViewGroup viewGroup = viewById;
                final Context context = (Context)((atjj)eg.d).a();
                context.getClass();
                final fvf fvf = (fvf)((atjj)eg.b).a();
                fvf.getClass();
                final hyc hyc = (hyc)((atjj)eg.c).a();
                hyc.getClass();
                viewGroup.getClass();
                this.D = new faf(context, fvf, hyc, viewGroup, null, null, null);
            }
        }
        final faf d = this.D;
        if (d != null) {
            final wwv a = ((wwx)acij).a;
            if (aokj == null) {
                d.c.setVisibility(8);
            }
            else {
                anss anss2;
                if ((anss2 = aokj.c) == null) {
                    anss2 = anss.a;
                }
                final aokb aokb = (aokb)aaiy.w(anss2, (agyr)SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                if (aokb == null) {
                    d.c.setVisibility(8);
                }
                else {
                    d.c.setVisibility(0);
                    a.t((wxz)new wws(aokj.g), (alff)null);
                    ajsq ajsq2;
                    if ((aokj.b & 0x2) != 0x0) {
                        if ((ajsq2 = aokj.d) == null) {
                            ajsq2 = ajsq.a;
                        }
                    }
                    else {
                        ajsq2 = null;
                    }
                    d.d = (CharSequence)abyh.d(ajsq2, d.a);
                    ajsq ajsq3;
                    if ((aokj.b & 0x4) != 0x0) {
                        if ((ajsq3 = aokj.e) == null) {
                            ajsq3 = ajsq.a;
                        }
                    }
                    else {
                        ajsq3 = null;
                    }
                    d.e = (CharSequence)abyh.d(ajsq3, d.a);
                    ajsq ajsq4 = ajsq;
                    if ((0x8 & aokj.b) != 0x0 && (ajsq4 = aokj.f) == null) {
                        ajsq4 = ajsq.a;
                    }
                    d.f = (CharSequence)abyh.d(ajsq4, d.a);
                    final boolean l = aokb.l;
                    d.b(l, l, false);
                    d.b.d((fvd)d);
                    d.b.j(aokb, a);
                }
            }
        }
        if (((agzd)anss).rs((agyr)aixx.a)) {
            achv.b(acij, (aixw)((agzd)anss).rr((agyr)aixx.a));
        }
    }
    
    public void c(final acir acir) {
        final ike c = this.C;
        if (c != null) {
            c.a();
        }
        final ftq q = this.q;
        if (q != null) {
            final View f = ((fzx)q).f;
            if (f != null) {
                f.animate().cancel();
            }
        }
        final faf d = this.D;
        if (d != null) {
            d.b.f();
        }
    }
    
    protected final void k(final CharSequence charSequence, final List list, final boolean b) {
        final TextView m = this.m;
        if (m != null) {
            ezp.y(m, charSequence);
        }
        final boolean b2 = false;
        if (b) {
            tmy.v((View)this.n, false);
            return;
        }
        if (this.m == null && !TextUtils.isEmpty(charSequence)) {
            this.a.add(0, charSequence);
        }
        this.a.addAll(list);
        Label_0180: {
            if (!this.a.isEmpty()) {
                final TextView n = this.n;
                if (n instanceof WrappingTextView) {
                    ((WrappingTextView)n).a(this.a);
                    final Iterator iterator = this.a.iterator();
                    while (true) {
                        do {
                            final boolean b3 = b2;
                            if (iterator.hasNext()) {
                                continue;
                            }
                            tmy.v((View)this.n, b3);
                            break Label_0180;
                        } while (TextUtils.isEmpty((CharSequence)iterator.next()));
                        final boolean b3 = true;
                        continue;
                    }
                }
                if (!list.isEmpty()) {
                    ezp.y(this.n, list.get(0));
                }
            }
        }
        this.a.clear();
    }
    
    protected final void m(final CharSequence charSequence, final CharSequence charSequence2, final boolean b) {
        this.k(charSequence, Arrays.asList(charSequence2), b);
    }
    
    protected final void n(final CharSequence charSequence) {
        ezp.y(this.k, charSequence);
    }
    
    protected final void o(final CharSequence charSequence, final CharSequence contentDescription) {
        ezp.y(this.l, charSequence);
        if (this.l != null && !TextUtils.isEmpty(charSequence)) {
            this.l.setContentDescription(contentDescription);
            final TextView l = this.l;
            if (l instanceof DurationBadgeView) {
                ((DurationBadgeView)l).a();
            }
        }
    }
    
    protected final void p(final CharSequence charSequence, final CharSequence charSequence2, final List list, final apdo apdo) {
        ezp.B(this.l, charSequence, charSequence2, list, apdo);
    }
    
    public void pB(final Map map) {
        final ImageView w = this.w;
        if (w != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", w);
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", this.z);
        }
    }
    
    protected final void q(final CharSequence charSequence, final CharSequence charSequence2, final aora[] array, final apdo apdo) {
        final TextView l = this.l;
        List<aora> list;
        if (array == null) {
            list = null;
        }
        else {
            list = Arrays.asList(array);
        }
        ezp.B(l, charSequence, charSequence2, list, apdo);
    }
    
    protected final void r(final amfl amfl) {
        final fzy u = this.u;
        if (u == null) {
            return;
        }
        u.f(amfl);
    }
    
    protected final void s(final acij acij, final ikn ikn) {
        final ViewStub e = this.e;
        if (e == null) {
            return;
        }
        if (this.C == null) {
            this.C = this.F.Q(e, ikn);
        }
        this.C.b(acij);
    }
    
    protected final void t(final aoqy aoqy) {
        final View d = this.d;
        if (d == null) {
            return;
        }
        if (this.f == null) {
            this.f = new gkz((ViewStub)d);
        }
        this.f.a(aoqy);
    }
    
    protected final void u(final ahyr ahyr) {
        final kmb s = this.s;
        if (s == null) {
            return;
        }
        s.a(ahyr);
        final TextView j = this.j;
        if (j != null) {
            int y;
            if (ahyr != null) {
                y = this.y - 1;
            }
            else {
                y = this.y;
            }
            j.setMaxLines(y);
        }
    }
    
    protected final void v(final ahys ahys) {
        final jgc r = this.r;
        if (r == null) {
            return;
        }
        r.a(ahys);
        if (ahys != null) {
            final TextView n = this.n;
            if (n != null) {
                n.setVisibility(8);
            }
        }
    }
    
    protected final void w(final ahyu ahyu) {
        final fzz b = this.b;
        if (b == null) {
            return;
        }
        b.a(ahyu);
    }
    
    protected final void x(final aoqu aoqu, final int visibility) {
        final fvh p2 = this.p;
        if (p2 == null) {
            return;
        }
        if (p2.b.getResources().getConfiguration().orientation != 2 && aoqu != null) {
            final ImageView imageView = (ImageView)((fzx)p2).c();
            akbf akbf;
            if ((akbf = aoqu.c) == null) {
                akbf = akbf.a;
            }
            int a2;
            if ((aoqu.b & 0x2) != 0x0) {
                final acng a = p2.a;
                akbe akbe;
                if ((akbe = akbe.b(akbf.c)) == null) {
                    akbe = akbe.a;
                }
                a2 = a.a(akbe);
            }
            else {
                a2 = 0;
            }
            if (a2 != 0) {
                imageView.setImageResource(a2);
            }
            else {
                imageView.setImageDrawable((Drawable)null);
            }
            imageView.setVisibility(visibility);
            p2.c = true;
            return;
        }
        final ViewStub d = ((fzx)p2).d;
        if (d != null) {
            d.setVisibility(8);
        }
    }
    
    protected final void y(final aorm z) {
        this.h.g(this.w, z);
        this.z = z;
    }
    
    protected final void z(final aorm z, final acek acek) {
        this.h.j(this.w, z, acek);
        this.z = z;
    }
}

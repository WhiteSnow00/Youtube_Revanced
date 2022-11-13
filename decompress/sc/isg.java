import android.text.Spannable;
import java.util.Iterator;
import android.animation.TimeInterpolator;
import java.util.Map;
import android.graphics.drawable.Drawable;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import java.util.List;
import android.text.style.ForegroundColorSpan;
import android.text.SpannableString;
import java.util.concurrent.TimeUnit;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.animation.ObjectAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isg implements isb
{
    private acsy A;
    private acsy B;
    private final vai C;
    private final vai D;
    private final hmw E;
    private final cya F;
    final ObjectAnimator a;
    public isi b;
    private final Context c;
    private final wyw d;
    private final acgs e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private View r;
    private isc s;
    private TextView t;
    private TextView u;
    private View v;
    private fkr w;
    private boolean x;
    private long y;
    private View z;
    
    public isg(final Context c, final wyw d, final acgs e, final cya f, final hmw e2, final vai d2, final vai c2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.w = fkr.a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.F = f;
        final int dimensionPixelSize = c.getResources().getDimensionPixelSize(2131165427);
        this.h = dimensionPixelSize;
        final int dimensionPixelSize2 = c.getResources().getDimensionPixelSize(2131165428);
        this.i = dimensionPixelSize2;
        final int dimensionPixelSize3 = c.getResources().getDimensionPixelSize(2131165425);
        this.j = dimensionPixelSize3;
        final int dimensionPixelSize4 = c.getResources().getDimensionPixelSize(2131165426);
        this.k = dimensionPixelSize4;
        this.l = c.getResources().getDimensionPixelSize(2131165429);
        this.m = c.getResources().getDimensionPixelSize(2131165430);
        this.f = dimensionPixelSize3 + (dimensionPixelSize + dimensionPixelSize);
        this.g = dimensionPixelSize4 + (dimensionPixelSize2 + dimensionPixelSize2);
        this.E = e2;
        this.D = d2;
        this.a = new ObjectAnimator();
        this.C = c2;
    }
    
    private final void h(final fkr fkr) {
        final isc s = this.s;
        if (s == null) {
            return;
        }
        final boolean c = fkr.c();
        int n = 2132084079;
        if (c) {
            n = n;
            if (!this.x) {
                n = 2132084082;
            }
        }
        final YouTubeTextView d = s.d;
        d.setTextAppearance(d.getContext(), n);
        final YouTubeTextView d2 = s.d;
        d2.setTextColor(tpe.cr(d2.getContext(), 2130970884));
    }
    
    @Override
    public final int a() {
        int n;
        if (this.w.c()) {
            n = this.g;
        }
        else {
            n = this.f;
        }
        return n;
    }
    
    @Override
    public final void b(final isi b, final ViewGroup viewGroup) {
        this.b = b;
        LayoutInflater.from(this.c).inflate(2131624423, viewGroup, true);
        this.n = (TextView)viewGroup.findViewById(2131428497);
        this.o = (TextView)viewGroup.findViewById(2131432095);
        this.p = (TextView)viewGroup.findViewById(2131427595);
        (this.q = (ImageView)viewGroup.findViewById(2131428234)).setOnClickListener((View$OnClickListener)new iob(b, 8));
        final TextView t = (TextView)viewGroup.findViewById(2131427999);
        this.t = t;
        final gld b2 = this.E.b(t);
        this.A = b2;
        ((acsx)b2).c = (acsw)new ezm(b, 11);
        final TextView u = (TextView)viewGroup.findViewById(2131430410);
        this.u = u;
        final gld b3 = this.E.b(u);
        this.B = b3;
        ((acsx)b3).c = (acsw)new ezm(b, 12);
        this.v = viewGroup.findViewById(2131427444);
        this.r = viewGroup.findViewById(2131429378);
        this.s = new isc(this.r, this.e, this.c, this.F, this.C, null, null, null);
        final View viewById = viewGroup.findViewById(2131427743);
        this.z = viewById;
        this.a.setTarget((Object)viewById);
        this.a.setPropertyName("backgroundColor");
    }
    
    @Override
    public final void c(final int n, final int n2) {
        final boolean x = this.x;
        final boolean b = false;
        if (x != n2 > n) {
            boolean x2 = b;
            if (n2 > n) {
                x2 = true;
            }
            this.x = x2;
            this.h(this.w);
        }
    }
    
    @Override
    public final void d(final fkr w) {
        final fkr w2 = this.w;
        if (w2 == w) {
            return;
        }
        if (this.v != null) {
            if (this.r != null) {
                if (w2.c() != w.c()) {
                    int n;
                    if (w.c()) {
                        n = this.k;
                    }
                    else {
                        n = this.j;
                    }
                    int n2;
                    if (w.c()) {
                        n2 = this.i;
                    }
                    else {
                        n2 = this.h;
                    }
                    tpe.aF(this.v, tpe.an(new tut[] { tpe.at(n), tpe.aq(n2) }), (Class)ViewGroup$MarginLayoutParams.class);
                    int n3;
                    if (w.c()) {
                        n3 = this.m;
                    }
                    else {
                        n3 = this.l;
                    }
                    tpe.aF(this.r, tpe.aq(n3), (Class)ViewGroup$MarginLayoutParams.class);
                    this.h(w);
                }
                this.w = w;
            }
        }
    }
    
    @Override
    public final void e(long seconds, final long n) {
        if (this.n != null) {
            seconds = TimeUnit.MILLISECONDS.toSeconds(n - seconds + 999L);
            if (this.y != seconds) {
                this.y = seconds;
                final TextView n2 = this.n;
                final String string = Long.toString(seconds);
                final String string2 = n2.getResources().getString(2132020021, new Object[] { seconds });
                final int index = string2.indexOf(string);
                final SpannableString text = new SpannableString((CharSequence)string2);
                if (index != -1) {
                    ((Spannable)text).setSpan((Object)new ForegroundColorSpan(tpe.cr(n2.getContext(), 2130970884)), index, string.length() + index, 33);
                }
                n2.setText((CharSequence)text);
            }
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (this.o != null && this.u != null) {
            final TextView n = this.n;
            if (n != null) {
                tpe.v((View)n, b ^ true);
                tpe.v((View)this.o, b);
            }
        }
    }
    
    @Override
    public final void g(final angg i) {
        final isc s = this.s;
        if (s != null && this.t != null && this.u != null && this.o != null && this.p != null && this.z != null) {
            if (this.q != null) {
                s.i = i;
                final angg j = s.i;
                final ajut ajut = null;
                if (j != null) {
                    final acgs a = s.a;
                    final ImageView f = s.f;
                    aotp aotp;
                    if ((aotp = s.a().j) == null) {
                        aotp = aotp.a;
                    }
                    a.g(f, aotp);
                    final YouTubeTextView d = s.d;
                    ajut ajut2;
                    if ((s.a().b & 0x2) != 0x0) {
                        if ((ajut2 = s.a().d) == null) {
                            ajut2 = ajut.a;
                        }
                    }
                    else {
                        ajut2 = null;
                    }
                    d.setText((CharSequence)acak.b(ajut2));
                    final TextView e = s.e;
                    ajut ajut3;
                    if ((s.a().b & 0x4) != 0x0) {
                        if ((ajut3 = s.a().e) == null) {
                            ajut3 = ajut.a;
                        }
                    }
                    else {
                        ajut3 = null;
                    }
                    e.setText((CharSequence)acak.b(ajut3));
                    ezt.B((TextView)s.g, (CharSequence)null, (CharSequence)null, (List)s.a().k, (apfs)null);
                    s.h.setContentDescription(s.d.getText());
                    tpe.v((View)s.c, false);
                    s.c.removeAllViews();
                    final angg k = s.i;
                    Object o;
                    if (k != null) {
                        o = k.o;
                    }
                    else {
                        o = null;
                    }
                    if (o != null && !((List)o).isEmpty()) {
                        for (final anuv anuv : o) {
                            if (((ahbc)anuv).ry((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                                final amhp amhp = (amhp)((ahbc)anuv).rx((ahaq)MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
                                final View inflate = LayoutInflater.from(s.b).inflate(2131624824, (ViewGroup)s.c, false);
                                s.j.C(s.b, inflate).f(amhp);
                                s.c.addView(inflate);
                            }
                        }
                        tpe.v((View)s.c, true);
                    }
                }
                final aicz b = aakt.b(i);
                if (b != null) {
                    this.s.b((View$OnClickListener)new iob(this, 9));
                    if (this.B != null) {
                        this.u.setBackground((Drawable)null);
                        this.u.setForeground((Drawable)null);
                        ((acsx)this.B).a(b, this.d, (Map)null);
                    }
                    tpe.v((View)this.u, true);
                    this.d.t((wzz)new wyt(b.w.I()), (alhi)null);
                }
                else {
                    this.s.b(null);
                    tpe.v((View)this.u, false);
                }
                final aicz a2 = aakt.a(i);
                if (a2 != null) {
                    final ImageView q = this.q;
                    String c;
                    if ((a2.b & 0x80000) != 0x0) {
                        ahik ahik;
                        if ((ahik = a2.s) == null) {
                            ahik = ahik.a;
                        }
                        c = ahik.c;
                    }
                    else {
                        c = null;
                    }
                    q.setContentDescription((CharSequence)c);
                    if (this.A != null) {
                        this.t.setBackground((Drawable)null);
                        this.t.setForeground((Drawable)null);
                        ((acsx)this.A).a(a2, this.d, (Map)null);
                    }
                    tpe.v((View)this.t, true);
                    this.d.t((wzz)new wyt(a2.w.I()), (alhi)null);
                }
                else {
                    final ImageView q2 = this.q;
                    q2.setContentDescription((CharSequence)q2.getResources().getString(2132017233));
                    tpe.v((View)this.t, false);
                }
                if (i == null) {
                    return;
                }
                final TextView o2 = this.o;
                ajut ajut4 = ajut;
                if ((i.b & 0x1) != 0x0 && (ajut4 = i.c) == null) {
                    ajut4 = ajut.a;
                }
                o2.setText((CharSequence)acak.b(ajut4));
                if ((i.b & 0x8) != 0x0) {
                    final TextView p = this.p;
                    ajut ajut5;
                    if ((ajut5 = i.f) == null) {
                        ajut5 = ajut.a;
                    }
                    p.setText((CharSequence)acak.b(ajut5));
                    this.p.setFocusable(true);
                    tpe.v((View)this.p, true);
                }
                else {
                    tpe.v((View)this.p, false);
                }
                if ((i.b & 0x800000) != 0x0 && this.D.f(45376683L)) {
                    anuv anuv2;
                    if ((anuv2 = i.r) == null) {
                        anuv2 = anuv.a;
                    }
                    final angu angu = (angu)((ahbc)anuv2).rx((ahaq)angv.b);
                    this.z.setBackgroundColor(angu.b);
                    this.a.setIntValues(new int[] { angu.b, angu.c });
                    this.a.setInterpolator((TimeInterpolator)apc.c(0.2f, 0.0f, 0.6f, 1.0f));
                    this.a.setDuration(i.l * 1000L);
                    this.a.start();
                    return;
                }
                this.z.setVisibility(8);
            }
        }
    }
}

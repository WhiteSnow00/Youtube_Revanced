import android.content.res.Resources;
import android.text.Spanned;
import android.view.ViewGroup$LayoutParams;
import android.util.TypedValue;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.GradientDrawable;
import java.util.List;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.TextView;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.ViewStub;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjm extends kcs
{
    private final acnj C;
    private final acih D;
    private final acng E;
    private final View F;
    private final ImageView G;
    private final ViewStub H;
    private final jjl I;
    private int J;
    private ike K;
    private apil L;
    private abbu M;
    private final qbo N;
    protected final acio a;
    protected final LinearLayout b;
    public int c;
    public final jjl d;
    public final jjl e;
    public boolean f;
    
    public jjm(final Context context, final aceo aceo, final vax vax, final acnj c, final qbo n, final cxz cxz, final jjg jjg, final aeyr aeyr, final acng e, final uyi uyi, final ViewGroup viewGroup, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        final acio a = (acio)aeyr.a();
        super(context, aceo, vax, a, 2131625704, viewGroup, n, cxz, jjg, uyi, null, null, null, null, null);
        a.getClass();
        this.a = a;
        this.C = c;
        this.D = new acih(vax, a);
        this.N = n;
        this.E = e;
        final View i = super.i;
        i.setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        final LinearLayout b = (LinearLayout)i.findViewById(2131432315);
        this.b = b;
        final RelativeLayout relativeLayout = (RelativeLayout)b.findViewById(2131432026);
        i.setTag(2131430139, (Object)new jji(this, 0));
        ana.N(i, (akv)new jjj());
        this.F = i.findViewById(2131428650);
        this.G = (ImageView)i.findViewById(2131432023);
        this.I = new jjl(2131432458, i);
        this.d = new jjl(2131427696, i);
        this.e = new jjl(2131428648, i);
        this.H = (ViewStub)i.findViewById(2131430124);
    }
    
    private final void d() {
        this.G.setVisibility(8);
        this.G.setBackground((Drawable)null);
        this.G.setImageDrawable((Drawable)null);
    }
    
    public final View a() {
        return this.a.a();
    }
    
    public final void b(final acij acij, final apil l) {
        this.L = l;
        final acih d = this.D;
        final wwv a = ((wwx)acij).a;
        aioe aioe;
        if ((l.b & 0x40) != 0x0) {
            if ((aioe = l.h) == null) {
                aioe = aioe.a;
            }
        }
        else {
            aioe = null;
        }
        d.b(a, aioe, acij.e(), (acif)this);
        ((wwx)acij).a.t((wxz)new wws(l.s), (alff)null);
        final acij acij2 = new acij(acij);
        ((wwx)acij2).b = l.s.I();
        ajsq ajsq;
        if ((l.b & 0x4) != 0x0) {
            if ((ajsq = l.d) == null) {
                ajsq = ajsq.a;
            }
        }
        else {
            ajsq = null;
        }
        this.A((CharSequence)abyh.b(ajsq));
        ajsq ajsq2;
        if ((ajsq2 = l.e) == null) {
            ajsq2 = ajsq.a;
        }
        final Spanned b = abyh.b(ajsq2);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            this.f = true;
            this.d.a((CharSequence)b, 2131427696);
        }
        else {
            this.f = false;
            this.d.b();
        }
        ajsq ajsq3;
        if ((ajsq3 = l.f) == null) {
            ajsq3 = ajsq.a;
        }
        final Spanned b2 = abyh.b(ajsq3);
        ahyq ahyq;
        if ((ahyq = l.k) == null) {
            ahyq = ahyq.a;
        }
        final int b3 = ahyq.b;
        apim apim;
        if ((apim = l.q) == null) {
            apim = apim.a;
        }
        if ((b3 & 0x2) == 0x0 && !TextUtils.isEmpty((CharSequence)b2)) {
            if (apim != null) {
                final int ar = aqql.ar(apim.b);
                if (ar != 0) {
                    if (ar == 3) {
                        final TextView textView = (TextView)this.a().findViewById(2131432092);
                        textView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new jjk(this, textView, 0));
                    }
                }
            }
            this.e.a((CharSequence)b2, 2131428648);
        }
        else {
            this.e.b();
        }
        ajsq ajsq4;
        if ((ajsq4 = l.g) == null) {
            ajsq4 = ajsq.a;
        }
        final Spanned b4 = abyh.b(ajsq4);
        ajsq ajsq5;
        if ((l.b & 0x20) != 0x0) {
            if ((ajsq5 = l.g) == null) {
                ajsq5 = ajsq.a;
            }
        }
        else {
            ajsq5 = null;
        }
        final CharSequence i = abyh.i(ajsq5);
        final agzy o = l.o;
        apdo apdo;
        if ((apdo = l.m) == null) {
            apdo = apdo.a;
        }
        this.p((CharSequence)b4, i, (List)o, apdo);
        aorm aorm;
        if ((aorm = l.c) == null) {
            aorm = aorm.a;
        }
        this.y(aorm);
        final aora[] array = ((List)l.o).toArray(new aora[0]);
        final aoqy aoqy = (aoqy)jfi.d((Object[])array, (jgg)jgf.e);
        final aoqo aoqo = (aoqo)jfi.d((Object[])array, (jgg)jgf.b);
        final int length = array.length;
        String s;
        Object o2 = s = null;
        String b5;
        Object o3;
        for (int j = 0; j < length; ++j, o2 = o3, s = b5) {
            final aora aora = array[j];
            b5 = s;
            if ((aora.b & 0x8) != 0x0) {
                aorb aorb;
                if ((aorb = aora.e) == null) {
                    aorb = aorb.a;
                }
                b5 = aorb.b;
            }
            o3 = o2;
            if ((aora.b & 0x200000) != 0x0 && (o3 = aora.n) == null) {
                o3 = aoqt.a;
            }
        }
        final View f = this.F;
        if (f != null) {
            if (aoqo != null && aoqo.b == 1) {
                if (this.M == null) {
                    this.M = new abbu((ViewStub)f);
                }
                final abbu m = this.M;
                final Spanned b6 = abyh.b((ajsq)aoqo.c);
                if (TextUtils.isEmpty((CharSequence)b6)) {
                    ((ViewStub)m.b).setVisibility(8);
                }
                else {
                    if (!m.a) {
                        m.c = ((ViewStub)m.b).inflate().findViewById(2131431950);
                        m.a = true;
                    }
                    ((TextView)m.c).setText((CharSequence)b6);
                    ((ViewStub)m.b).setVisibility(0);
                    ((TextView)m.c).setVisibility(0);
                }
            }
            else {
                f.setVisibility(8);
            }
        }
        this.t(aoqy);
        if (o2 == null) {
            this.d();
        }
        else {
            akbf akbf;
            if ((akbf = ((aoqt)o2).b) == null) {
                akbf = akbf.a;
            }
            if ((akbf.b & 0x1) != 0x0) {
                final ImageView g = this.G;
                final Resources resources = this.g.getResources();
                final acng e = this.E;
                akbf akbf2;
                if ((akbf2 = ((aoqt)o2).b) == null) {
                    akbf2 = akbf.a;
                }
                akbe akbe;
                if ((akbe = akbe.b(akbf2.c)) == null) {
                    akbe = akbe.a;
                }
                g.setImageDrawable(resources.getDrawable(e.a(akbe)));
                final GradientDrawable background = new GradientDrawable();
                background.setShape(1);
                background.setColor(tmy.cn(this.g, 2130970845));
                this.G.setBackground((Drawable)background);
                this.G.setVisibility(0);
            }
            else {
                this.d();
            }
        }
        if (s != null) {
            this.I.a(s, 2131432457);
        }
        else {
            this.I.b();
        }
        final wwv a2 = ((wwx)acij2).a;
        final acnj c = this.C;
        final View a3 = this.a.a();
        final View x = super.x;
        amer amer;
        if ((amer = l.p) == null) {
            amer = amer.a;
        }
        ameo ameo;
        if ((amer.b & 0x1) != 0x0) {
            amer amer2;
            if ((amer2 = l.p) == null) {
                amer2 = amer.a;
            }
            if ((ameo = amer2.c) == null) {
                ameo = ameo.a;
            }
        }
        else {
            ameo = null;
        }
        c.f(a3, x, ameo, l, a2);
        ahyu ahyu;
        if ((l.b & 0x800) != 0x0) {
            ahyq ahyq2;
            if ((ahyq2 = l.j) == null) {
                ahyq2 = ahyq.a;
            }
            if ((ahyu = ahyq2.c) == null) {
                ahyu = ahyu.a;
            }
        }
        else {
            ahyu = null;
        }
        this.w(ahyu);
        ahys ahys;
        if ((l.b & 0x1000) != 0x0) {
            ahyq ahyq3;
            if ((ahyq3 = l.k) == null) {
                ahyq3 = ahyq.a;
            }
            if ((ahys = ahyq3.d) == null) {
                ahys = ahys.a;
            }
        }
        else {
            ahys = null;
        }
        this.v(ahys);
        amfl amfl;
        if ((l.b & 0x1000) != 0x0) {
            ahyq ahyq4;
            if ((ahyq4 = l.k) == null) {
                ahyq4 = ahyq.a;
            }
            if ((amfl = ahyq4.f) == null) {
                amfl = amfl.a;
            }
        }
        else {
            amfl = null;
        }
        this.r(amfl);
        ahyr ahyr;
        if ((l.b & 0x400) != 0x0) {
            ahyq ahyq5;
            if ((ahyq5 = l.i) == null) {
                ahyq5 = ahyq.a;
            }
            if ((ahyr = ahyq5.e) == null) {
                ahyr = ahyr.a;
            }
        }
        else {
            ahyr = null;
        }
        this.u(ahyr);
        apin apin;
        if ((apin = l.r) == null) {
            apin = apin.a;
        }
        if ((apin.b & 0x1) != 0x0) {
            apin apin2;
            if ((apin2 = l.r) == null) {
                apin2 = apin.a;
            }
            kcs.B(acij, apin2);
            final ViewStub h = this.H;
            if (h != null) {
                if ((this.L.b & 0x8) != 0x0) {
                    super.s(acij, null);
                }
                else {
                    if (this.K == null) {
                        this.K = this.N.Q(h, (ikn)null);
                    }
                    this.K.b(acij);
                }
            }
        }
        final apim q = l.q;
        apim a4;
        if (q == null) {
            a4 = apim.a;
        }
        else {
            a4 = q;
        }
        final int ar2 = aqql.ar(a4.b);
        Label_1942: {
            if (ar2 != 0) {
                if (ar2 == 3) {
                    final int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(2131168626);
                    this.J = dimensionPixelSize;
                    this.J = dimensionPixelSize + (super.i.getPaddingLeft() + super.i.getPaddingRight());
                    this.y = this.g.getResources().getInteger(2131493055);
                    this.c = this.g.getResources().getInteger(2131493056);
                    alk.g((ViewGroup$MarginLayoutParams)super.x.getLayoutParams(), this.g.getResources().getDimensionPixelSize(2131168625));
                    super.j.setMaxLines(this.y);
                    alk.f((ViewGroup$MarginLayoutParams)((View)super.j).getLayoutParams(), this.g.getResources().getDimensionPixelSize(2131168624));
                    super.i.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new gzz(this, l, 5));
                    break Label_1942;
                }
            }
            apim a5;
            if ((a5 = q) == null) {
                a5 = apim.a;
            }
            final int ar3 = aqql.ar(a5.b);
            if (ar3 != 0) {
                if (ar3 == 4) {
                    final TypedValue typedValue = new TypedValue();
                    this.g.getResources().getValue(2131165515, typedValue, true);
                    this.J = (int)(tmy.bd(this.g) * typedValue.getFloat());
                    final int integer = this.g.getResources().getInteger(2131493119);
                    this.y = integer;
                    super.j.setMaxLines(integer);
                    break Label_1942;
                }
            }
            final int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(2131170243);
            this.J = dimensionPixelSize2;
            this.J = dimensionPixelSize2 + (super.i.getPaddingLeft() + super.i.getPaddingRight());
            final int integer2 = this.g.getResources().getInteger(2131493119);
            this.y = integer2;
            super.j.setMaxLines(integer2);
        }
        tmy.aF(this.a(), tmy.aD(this.J), (Class)ViewGroup$LayoutParams.class);
        this.a.e(acij2);
    }
    
    @Override
    public final void c(final acir acir) {
        super.c(acir);
        this.L = null;
        final ike k = this.K;
        if (k != null) {
            k.a();
        }
        this.d();
        this.D.c();
    }
}

import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ProgressBar;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfo implements acil, tec
{
    public acoa a;
    private final Context b;
    private final acio c;
    private final tdz d;
    private final FrameLayout e;
    private final YouTubeTextView f;
    private final View$OnClickListener g;
    private final Drawable h;
    private ProgressBar i;
    private View j;
    private View k;
    private int l;
    
    public gfo(final Context context, final acjc acjc, final tdz tdz) {
        this(context, acjc, tdz, null, null);
    }
    
    public gfo(final Context b, final acjc c, final tdz d, final ViewGroup viewGroup, final Drawable h) {
        this.l = -1;
        this.b = b;
        this.c = (acio)c;
        this.d = d;
        this.h = h;
        final FrameLayout e = (FrameLayout)LayoutInflater.from(b).inflate(2131624778, viewGroup, viewGroup != null);
        this.e = e;
        this.f = (YouTubeTextView)e.findViewById(2131429559);
        c.c((View)e);
        this.g = (View$OnClickListener)new fuh(this, 8);
    }
    
    private final void h() {
        tmy.v((View)this.f, false);
    }
    
    private final void i() {
        final View j = this.j;
        if (j != null) {
            tmy.v(j, false);
        }
        final View k = this.k;
        if (k != null) {
            tmy.v(k, false);
        }
    }
    
    private final void j() {
        final ProgressBar i = this.i;
        if (i != null) {
            tmy.v((View)i, false);
        }
    }
    
    private final void k(final View view, final acmo acmo, View$OnClickListener onClickListener) {
        ((TextView)view.findViewById(2131428917)).setText(acmo.c());
        final View viewById = view.findViewById(2131428919);
        tmy.v(viewById, acmo.d());
        if (!acmo.d()) {
            onClickListener = null;
        }
        viewById.setOnClickListener(onClickListener);
        final ImageView imageView = (ImageView)view.findViewById(2131428913);
        if (imageView != null) {
            int n;
            if (1 != acmo.a()) {
                n = 2131232701;
            }
            else {
                n = 2131232669;
            }
            imageView.setImageDrawable(agw.a(this.b, n));
        }
        tmy.v(view, true);
    }
    
    @Override
    public final View a() {
        return ((acjc)this.c).a;
    }
    
    public final void b(final acmk acmk) {
        if (acmk.c()) {
            this.g();
            return;
        }
        this.j();
        this.i();
        tmy.v((View)this.f, true);
    }
    
    @Override
    public final void c(final acir acir) {
        this.d.m((Object)this);
    }
    
    public final void d(final acij acij, final acoa a) {
        final Object b = a.b;
        if (b != null) {
            final acoa a2 = this.a;
            if (a2 == null || a2.b != b) {
                this.d.m((Object)this);
                this.d.i((Object)this, b);
            }
        }
        this.a = a;
        this.c.d(a.c);
        this.f.setText(2132018389);
        tmy.aF((View)this.e, tmy.at(-2), (Class)ViewGroup$LayoutParams.class);
        this.l = acij.b("position", -1);
        final acmq a3 = a.a;
        Label_0387: {
            if (a3 instanceof acmk) {
                this.b((acmk)a3);
            }
            else if (a3 instanceof acmp) {
                final acmp acmp = (acmp)a3;
                this.g();
                final wwv a4 = acij.a;
                if (this.a != null && a4 != null && acmp.b().h() && (abxw.b.a((abxx)acmp.b().c()) || abxw.d.a((abxx)acmp.b().c())) && ((abxx)acmp.b().c()).e().length > 0) {
                    final agza builder = apni.a.createBuilder();
                    final agyc x = agyc.x(((abxx)acmp.b().c()).e());
                    builder.copyOnWrite();
                    final apni apni = (apni)builder.instance;
                    apni.b |= 0x1;
                    apni.c = x;
                    final apni apni2 = (apni)builder.build();
                    final int ordinal = ((abxx)acmp.b().c()).a().ordinal();
                    wyb wyb;
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            break Label_0387;
                        }
                        wyb = wya.c(113855);
                    }
                    else {
                        wyb = wya.c(66790);
                    }
                    a4.m(xkm.aq(a4.g((Object)this.a, wyb)), xkm.aq(apni2));
                }
            }
            else if (a3 instanceof acmo) {
                this.f((acmo)a3);
            }
        }
        this.c.e(acij);
    }
    
    public final void f(final acmo acmo) {
        this.h();
        this.j();
        this.i();
        if (acmo.a() == 1) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.e.getLayoutParams();
        if (this.l < 2 && abxw.d.a(acmo.b())) {
            if (this.k == null) {
                this.k = ((ViewStub)this.e.findViewById(2131428912)).inflate();
            }
            if (layoutParams != null) {
                layoutParams.height = -1;
            }
            this.k(this.k, acmo, this.g);
            return;
        }
        if (this.j == null) {
            this.j = ((ViewStub)this.e.findViewById(2131428908)).inflate();
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        this.k(this.j, acmo, this.g);
    }
    
    public final void g() {
        if (this.i == null) {
            final ProgressBar i = (ProgressBar)((ViewStub)this.e.findViewById(2131429667)).inflate();
            this.i = i;
            final Drawable h = this.h;
            if (h != null) {
                i.setIndeterminateDrawable(h);
            }
        }
        this.h();
        this.i();
        tmy.v((View)this.i, true);
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    final acmp acmp = (acmp)o;
                    this.g();
                }
                else {
                    this.f((acmo)o);
                }
            }
            else {
                this.b((acmk)o);
            }
        }
        else {
            array = new Class[] { acmk.class, acmo.class, acmp.class };
        }
        return array;
    }
}

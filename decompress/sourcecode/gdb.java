import android.view.View$OnLayoutChangeListener;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.content.Context;
import android.widget.TextView;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdb implements gda
{
    public final gau a;
    public FrameLayout b;
    public TextView c;
    private final Context d;
    private final acng e;
    private Animation f;
    private Animation g;
    private gcz h;
    private final gcw i;
    private FrameLayout j;
    private boolean k;
    private final uyi l;
    
    public gdb(final Context d, final acng e, final gau a, final uyi l) {
        this.d = d;
        this.e = e;
        this.k = false;
        this.i = new gcw();
        this.a = a;
        this.l = l;
    }
    
    private final void j() {
        this.j.addView((View)this.b);
        final FrameLayout b = (FrameLayout)this.j.findViewById(2131428433);
        this.b = b;
        this.c = (TextView)b.findViewById(2131428434);
    }
    
    @Override
    public final aexq a() {
        if (this.b().h()) {
            return aexq.j(this.c);
        }
        return (aexq)aewp.a;
    }
    
    @Override
    public final aexq b() {
        return aexq.j(this.h);
    }
    
    @Override
    public final aexq c() {
        if (this.b().h()) {
            return aexq.j(this.b);
        }
        return (aexq)aewp.a;
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.c != null) {
            if (this.j != null) {
                if (b) {
                    final gcw i = this.i;
                    if (i.b) {
                        return;
                    }
                    if (i.a) {
                        this.g.cancel();
                    }
                    this.c.startAnimation(this.f);
                }
                else {
                    this.i();
                }
            }
        }
    }
    
    @Override
    public final void e(final FrameLayout j) {
        this.f();
        this.j = j;
        if (this.b != null) {
            this.j();
        }
    }
    
    @Override
    public final void f() {
        final FrameLayout j = this.j;
        if (j != null) {
            final FrameLayout b = this.b;
            if (b != null) {
                j.removeView((View)b);
            }
        }
        this.h = null;
        this.j = null;
        this.i.a();
    }
    
    @Override
    public final void g(final gcz h, final boolean b) {
        if (this.j != null) {
            if (this.b == null) {
                this.b = (FrameLayout)LayoutInflater.from(this.d).inflate(2131624287, (ViewGroup)this.j, false);
                this.j();
            }
            if (!this.k) {
                (this.g = AnimationUtils.loadAnimation(this.d, 2130772074)).setAnimationListener((Animation$AnimationListener)new cbh(this, 5));
                (this.f = AnimationUtils.loadAnimation(this.d, 2130772075)).setAnimationListener((Animation$AnimationListener)new cbh(this, 6));
                this.k = true;
            }
            if (h != this.h) {
                this.h = h;
                this.c.setText(h.a);
                final Drawable drawable = this.d.getResources().getDrawable(this.e.a(h.b));
                if (drawable != null) {
                    api.j(this.c, drawable, (Drawable)null, (Drawable)null);
                }
                final int i = h.i;
                final TypedValue typedValue = new TypedValue();
                int n;
                if (i == 2) {
                    n = 2130970916;
                }
                else {
                    n = 2130970920;
                }
                this.d.getTheme().resolveAttribute(n, typedValue, true);
                this.c.setTextAppearance(typedValue.data);
                if (this.l.aO()) {
                    this.c.setAllCaps(false);
                }
                final int j = h.i;
                int height = this.d.getResources().getDimensionPixelSize(2131166148);
                int n2 = this.d.getResources().getDimensionPixelSize(2131166153);
                int dimensionPixelSize = this.d.getResources().getDimensionPixelSize(2131166152);
                int compoundDrawablePadding = this.d.getResources().getDimensionPixelSize(2131166143);
                int n3 = this.d.getResources().getDimensionPixelSize(2131166146);
                if (j == 2) {
                    height = this.d.getResources().getDimensionPixelSize(2131166155);
                    n2 = this.d.getResources().getDimensionPixelSize(2131166156);
                    compoundDrawablePadding = this.d.getResources().getDimensionPixelSize(2131166144);
                    n3 = this.d.getResources().getDimensionPixelSize(2131166147);
                    dimensionPixelSize = n2;
                }
                this.c.setCompoundDrawablePadding(compoundDrawablePadding);
                this.c.setPaddingRelative(n2, 0, dimensionPixelSize, 0);
                this.c.getLayoutParams().height = height;
                final TextView c = this.c;
                int backgroundResource;
                if (j == 2) {
                    backgroundResource = 2131231245;
                }
                else {
                    backgroundResource = 2131231244;
                }
                c.setBackgroundResource(backgroundResource);
                this.c.setElevation((float)n3);
                final Context d = this.d;
                final TextView c2 = this.c;
                final int color = d.getResources().getColor(2131102393);
                final int color2 = this.d.getResources().getColor(2131102393);
                final int color3 = this.d.getResources().getColor(2131099825);
                if (this.b().h()) {
                    final aoqe f = ((gcz)this.b().c()).f;
                    aoqb aoqb;
                    if ((aoqb = aoqb.b(f.c)) == null) {
                        aoqb = aoqb.a;
                    }
                    final int a = actf.a(d, aoqb, color);
                    aoqb aoqb2;
                    if ((aoqb2 = aoqb.b(f.e)) == null) {
                        aoqb2 = aoqb.a;
                    }
                    final int a2 = actf.a(d, aoqb2, color3);
                    aoqb aoqb3;
                    if ((aoqb3 = aoqb.b(f.d)) == null) {
                        aoqb3 = aoqb.a;
                    }
                    final int a3 = actf.a(d, aoqb3, color2);
                    if (c2 != null) {
                        c2.setTextColor(a);
                    }
                    if (c2 != null) {
                        ((View)c2).setBackgroundTintList(ColorStateList.valueOf(a2));
                    }
                    if (drawable != null) {
                        drawable.setTint(a3);
                    }
                }
            }
            this.b.bringToFront();
            this.c.setVisibility(0);
            if (b) {
                final gcw k = this.i;
                if (!k.a) {
                    if (k.b) {
                        this.f.cancel();
                    }
                    this.c.startAnimation(this.g);
                    return;
                }
            }
            this.b.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fta(this, 6));
            return;
        }
        throw new IllegalStateException("Controller must be initialized for a feed before the content pill can be shown.");
    }
    
    @Override
    public final boolean h() {
        final TextView c = this.c;
        boolean b = false;
        if (c != null) {
            if (c.getVisibility() != 0) {
                if (this.i.a) {
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
    
    public final void i() {
        this.c.setVisibility(8);
        this.a.m(fxr.f, 0);
    }
}

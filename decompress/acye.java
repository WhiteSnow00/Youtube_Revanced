import java.util.concurrent.TimeUnit;
import android.app.Activity;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import android.widget.PopupWindow$OnDismissListener;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View$OnClickListener;
import android.view.View$MeasureSpec;
import android.graphics.Rect;
import android.widget.PopupWindow;
import j$.util.Optional;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acye
{
    public final int a;
    public final int b;
    public final int c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public acye(final View h, final View d, int bottom, final int b, final int c, final int n, final Optional optional) {
        h.getClass();
        d.getClass();
        this.d = d;
        this.a = bottom;
        this.b = b;
        this.c = c;
        final acyd e = new acyd(h.getContext(), n);
        this.e = e;
        if (optional.isPresent() && ((vbs)optional.get()).aV()) {
            final acyd acyd = e;
            e.b = tqf.aZ(e.a.getResources().getDisplayMetrics(), 12);
        }
        final acyd acyd2 = e;
        e.h = h;
        e.d = new PopupWindow((View)e);
        e.addView(h);
        final Rect f = new Rect();
        this.f = f;
        final acyd acyd3 = e;
        bottom = e.getResources().getDisplayMetrics().widthPixels;
        final Rect rect = f;
        f.right = bottom;
        final acyd acyd4 = e;
        bottom = e.getResources().getDisplayMetrics().heightPixels;
        final Rect rect2 = f;
        f.bottom = bottom;
    }
    
    public acye(final quv f, final afce d, final afce e) {
        this.b = 4;
        this.a = 5;
        this.c = 6;
        this.f = f;
        this.d = d;
        this.e = e;
    }
    
    public static int a(final int n, final View view) {
        final int f = anc.f(view);
        if (n != 1) {
            int n2 = 2;
            if (n != 2) {
                n2 = 4;
                if (n != 3) {
                    if (n != 4) {
                        throw new IllegalArgumentException();
                    }
                    if (f != 1) {
                        return 4;
                    }
                    return 3;
                }
                else if (f != 1) {
                    return 3;
                }
            }
            return n2;
        }
        return 1;
    }
    
    private static int m(final View view) {
        final int width = view.getWidth();
        if (width == 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(measureSpec, measureSpec);
            return view.getMeasuredWidth();
        }
        return width;
    }
    
    private static boolean n(final int n) {
        return n == 1 || n == 2;
    }
    
    public final void b(final int n) {
        ((acyd)this.e).b(n);
    }
    
    public final void c(final Rect rect, final int n, final int n2) {
        ((acyd)this.e).c((View)this.d, rect, n, n2, this.c);
    }
    
    public final void d(final boolean f) {
        ((acyd)this.e).f = f;
    }
    
    public final void e(final View$OnClickListener onClickListener) {
        ((acyd)this.e).setOnClickListener(onClickListener);
    }
    
    public final void f(final acyc e) {
        ((acyd)this.e).e = e;
    }
    
    public final void g(final Rect rect) {
        final int a = this.a;
        final int b = this.b;
        this.c(rect, a, b);
        final boolean n = n(a);
        boolean e = true;
        int n2 = 0;
        Label_0168: {
            Label_0166: {
                if (n) {
                    if (!this.h(a, rect)) {
                        if (a == 1) {
                            n2 = 2;
                            break Label_0168;
                        }
                        n2 = 1;
                        break Label_0168;
                    }
                }
                else {
                    final Object d = this.d;
                    if (!n(a)) {
                        final int a2 = a(a, (View)d);
                        final int m = m((View)this.e);
                        final int width = ((Rect)this.f).width();
                        n2 = 3;
                        if (a2 == 3) {
                            if (m < rect.left - ((Rect)this.f).left) {
                                break Label_0166;
                            }
                        }
                        else if (m < width - rect.width() - rect.left) {
                            break Label_0166;
                        }
                        if (a == 3) {
                            n2 = 4;
                        }
                        break Label_0168;
                    }
                }
            }
            n2 = a;
        }
        if (n2 != this.a) {
            ((acyd)this.e).c((View)this.d, rect, n2, b, this.c);
            m((View)this.e);
        }
        final acyd acyd = (acyd)this.e;
        acyd.d.setClippingEnabled(false);
        acyd.d.setAnimationStyle(16973826);
        if (!acyd.g && acyd.k != 1) {
            acyd.d.setBackgroundDrawable((Drawable)new BitmapDrawable(acyd.a.getResources(), ""));
            acyd.d.setOutsideTouchable(acyd.f);
            acyd.d.setOnDismissListener((PopupWindow$OnDismissListener)new kvm(acyd, 5));
        }
        else {
            if (acyd.k != 1) {
                e = false;
            }
            acyd.c = new acxu(acyd.a, acyd, acyd.i, acyd.f);
            if (acyd.i.getRootView() instanceof ViewGroup) {
                ((ViewGroup)acyd.i.getRootView()).addView((View)acyd.c);
            }
            acyd.d.setOutsideTouchable(false);
            acyd.c.e = e;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            acyd.f();
        }
        final Activity a3 = acyd.a(acyd.a);
        if (a3 != null && !a3.isDestroyed() && !a3.isFinishing()) {
            acyd.d.showAtLocation(acyd.i, 0, acyd.m, acyd.n);
        }
    }
    
    public final boolean h(final int n, final Rect rect) {
        if (!n(n)) {
            return true;
        }
        final View view = (View)this.e;
        int n2;
        if ((n2 = view.getHeight()) == 0) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(measureSpec, measureSpec);
            n2 = view.getMeasuredHeight();
        }
        final int height = ((Rect)this.f).height();
        if (n == 1) {
            return n2 < rect.top - ((Rect)this.f).top;
        }
        return n2 < height - rect.height() - rect.top;
    }
    
    public final boolean i() {
        return ((acyd)this.e).isShown();
    }
    
    public final void j(final agwh agwh) {
        if (!((afce)this.d).a) {
            return;
        }
        final Object f = this.f;
        final ahcr builder = agun.a.createBuilder();
        final aguk c = agul.c();
        final ahcr builder2 = agus.a.createBuilder();
        final aqyq d = aqyq.d;
        builder2.copyOnWrite();
        final agus agus = (agus)builder2.instance;
        agus.d = d.B;
        agus.b |= 0x2;
        final aqyp e = aqyp.e;
        builder2.copyOnWrite();
        final agus agus2 = (agus)builder2.instance;
        agus2.c = e.l;
        agus2.b |= 0x1;
        ((ahcr)c).copyOnWrite();
        agul.e((agul)c.instance, (agus)builder2.build());
        final afce afce = (afce)this.d;
        afce.g();
        final long a = afce.a(TimeUnit.MICROSECONDS);
        ((ahcr)c).copyOnWrite();
        agul.h((agul)c.instance, a);
        final ahcr builder3 = aguj.a.createBuilder();
        builder3.copyOnWrite();
        final aguj aguj = (aguj)builder3.instance;
        aguj.c = agwh.s;
        aguj.b |= 0x1;
        ((ahcr)c).copyOnWrite();
        agul.i((agul)c.instance, (aguj)builder3.build());
        builder.an(c);
        final ahcr builder4 = agup.a.createBuilder();
        builder4.copyOnWrite();
        final agup agup = (agup)builder4.instance;
        agup.c = 3;
        agup.b |= 0x1;
        builder.copyOnWrite();
        final agun agun = (agun)builder.instance;
        final agup d2 = (agup)builder4.build();
        d2.getClass();
        agun.d = d2;
        agun.b |= 0x1;
        ((quv)f).c((agun)builder.build());
    }
    
    public final void k(final aguk aguk) {
        final Object f = this.f;
        final ahcr builder = agun.a.createBuilder();
        final long a = ((afce)this.e).a(TimeUnit.MICROSECONDS);
        ((ahcr)aguk).copyOnWrite();
        agul.h((agul)aguk.instance, a);
        builder.an(aguk);
        final ahcr builder2 = agup.a.createBuilder();
        builder2.copyOnWrite();
        final agup agup = (agup)builder2.instance;
        agup.c = 4;
        agup.b |= 0x1;
        builder.copyOnWrite();
        final agun agun = (agun)builder.instance;
        final agup d = (agup)builder2.build();
        d.getClass();
        agun.d = d;
        agun.b |= 0x1;
        ((quv)f).c((agun)builder.build());
    }
    
    public final void l(final agul agul) {
        final Object f = this.f;
        final ahcr builder = agun.a.createBuilder();
        builder.ao(agul);
        final ahcr builder2 = agup.a.createBuilder();
        builder2.copyOnWrite();
        final agup agup = (agup)builder2.instance;
        agup.c = 5;
        agup.b |= 0x1;
        builder.copyOnWrite();
        final agun agun = (agun)builder.instance;
        final agup d = (agup)builder2.build();
        d.getClass();
        agun.d = d;
        agun.b |= 0x1;
        ((quv)f).c((agun)builder.build());
    }
}

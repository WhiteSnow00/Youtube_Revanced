import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.util.function.Function;
import j$.util.Optional;
import java.util.List;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;

// 
// Decompiled by Procyon v0.6.0
// 

public class fzx
{
    public ViewStub d;
    public boolean e;
    public View f;
    
    protected fzx(final View f) {
        this.e = false;
        f.getClass();
        this.f = f;
        this.e = true;
    }
    
    protected fzx(final ViewStub d) {
        this.e = false;
        d.getClass();
        this.d = d;
    }
    
    protected static Drawable b(final Context context) {
        return (Drawable)tmy.cs(context, 2130970317).orElse((Object)agw.a(context, 2131233301));
    }
    
    public static void d(final Context context, final ViewGroup viewGroup, final acng acng, final List list) {
        e(context, viewGroup, acng, (ahyq[])Optional.ofNullable((Object)list).map((Function)fwc.e).orElse((Object)new ahyq[0]));
    }
    
    public static void e(final Context context, final ViewGroup viewGroup, final acng acng, final ahyq[] array) {
        if (array == null) {
            return;
        }
        viewGroup.removeAllViews();
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166982);
        for (final ahyq ahyq : array) {
            if (ahyq != null) {
                View view;
                if ((ahyq.b & 0x1) != 0x0) {
                    final View inflate = View.inflate(context, 2131625493, (ViewGroup)null);
                    final fzz fzz = new fzz(inflate, 1);
                    ahyu ahyu;
                    if ((ahyu = ahyq.c) == null) {
                        ahyu = ahyu.a;
                    }
                    fzz.a(ahyu);
                    view = inflate;
                }
                else {
                    view = null;
                }
                if ((ahyq.b & 0x8) != 0x0) {
                    final View inflate2 = View.inflate(context, 2131624823, (ViewGroup)null);
                    final fzy fzy = new fzy(acng, context, inflate2);
                    amfl amfl;
                    if ((amfl = ahyq.f) == null) {
                        amfl = amfl.a;
                    }
                    fzy.f(amfl);
                    view = inflate2;
                }
                if (view != null) {
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
                    alk.f((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, dimensionPixelSize);
                    viewGroup.addView(view, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                }
            }
        }
    }
    
    public final View c() {
        if (this.e) {
            final View f = this.f;
            if (f != null) {
                return f;
            }
        }
        final View f2 = (View)Optional.ofNullable((Object)this.d).map((Function)fwc.d).orElse((Object)null);
        f2.getClass();
        this.f = f2;
        this.e = true;
        return f2;
    }
}

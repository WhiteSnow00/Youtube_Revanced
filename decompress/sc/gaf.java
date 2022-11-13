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

public class gaf
{
    public ViewStub d;
    public boolean e;
    public View f;
    
    protected gaf(final View f) {
        this.e = false;
        f.getClass();
        this.f = f;
        this.e = true;
    }
    
    protected gaf(final ViewStub d) {
        this.e = false;
        d.getClass();
        this.d = d;
    }
    
    protected static Drawable b(final Context context) {
        return (Drawable)tpe.cw(context, 2130970317).orElse((Object)agx.a(context, 2131233301));
    }
    
    public static void d(final Context context, final ViewGroup viewGroup, final acpk acpk, final List list) {
        e(context, viewGroup, acpk, (aiao[])Optional.ofNullable((Object)list).map((Function)fwk.e).orElse((Object)new aiao[0]));
    }
    
    public static void e(final Context context, final ViewGroup viewGroup, final acpk acpk, final aiao[] array) {
        if (array == null) {
            return;
        }
        viewGroup.removeAllViews();
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166981);
        for (int i = 0; i < array.length; ++i) {
            final aiao aiao = array[i];
            if (aiao != null) {
                View view;
                if ((aiao.b & 0x1) != 0x0) {
                    final View inflate = View.inflate(context, 2131625498, (ViewGroup)null);
                    final gah gah = new gah(inflate, 1);
                    aias aias;
                    if ((aias = aiao.c) == null) {
                        aias = aias.a;
                    }
                    gah.a(aias);
                    view = inflate;
                }
                else {
                    view = null;
                }
                if ((aiao.b & 0x8) != 0x0) {
                    final View inflate2 = View.inflate(context, 2131624824, (ViewGroup)null);
                    final gag gag = new gag(acpk, context, inflate2);
                    amhp amhp;
                    if ((amhp = aiao.f) == null) {
                        amhp = amhp.a;
                    }
                    gag.f(amhp);
                    view = inflate2;
                }
                if (view != null) {
                    final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-2, -2);
                    all.f((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, dimensionPixelSize);
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
        final View f2 = (View)Optional.ofNullable((Object)this.d).map((Function)fwk.d).orElse((Object)null);
        f2.getClass();
        this.f = f2;
        this.e = true;
        return f2;
    }
}

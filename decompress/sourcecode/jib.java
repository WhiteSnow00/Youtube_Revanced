import java.util.Iterator;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import android.graphics.ColorFilter;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayDeque;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextViewForClarifyBox;
import android.view.View;
import android.content.res.Resources;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class jib extends acja
{
    protected final Context a;
    protected final Resources b;
    protected final acnj c;
    protected final aceo d;
    protected final acih e;
    protected final acng f;
    protected final View g;
    protected final WrappingTextViewForClarifyBox h;
    protected final TextView i;
    protected final ImageView j;
    protected final Handler k;
    private final ImageView l;
    private final View m;
    private final View n;
    
    public jib(final Context a, final aceo d, final vax vax, final acnj c, final Handler k, final acng f, final int n, final ViewGroup viewGroup) {
        this.a = a;
        this.b = a.getResources();
        this.c = c;
        this.d = d;
        this.k = k;
        this.f = f;
        final View inflate = LayoutInflater.from(a).inflate(n, viewGroup, false);
        this.g = inflate;
        this.e = new acih(vax, inflate);
        this.l = (ImageView)inflate.findViewById(2131428207);
        this.m = inflate.findViewById(2131428448);
        this.h = (WrappingTextViewForClarifyBox)inflate.findViewById(2131428209);
        this.i = (TextView)inflate.findViewById(2131431611);
        this.j = (ImageView)inflate.findViewById(2131430178);
        this.n = inflate.findViewById(2131427859);
    }
    
    public final View a() {
        return this.g;
    }
    
    public final void c(final acir acir) {
        this.e.c();
    }
    
    protected void f(final aijg aijg) {
        final TextView i = this.i;
        ajsq ajsq;
        if ((ajsq = aijg.h) == null) {
            ajsq = ajsq.a;
        }
        tmy.t(i, (CharSequence)abyh.b(ajsq));
        tmy.v((View)this.j, this.i.getVisibility() == 0);
    }
    
    public void g(int n, final boolean b) {
        final int dimensionPixelOffset = this.b.getDimensionPixelOffset(2131165817);
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.j.getLayoutParams();
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = (RelativeLayout$LayoutParams)this.i.getLayoutParams();
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (b && n >= 0) {
            arrayDeque.add(tmy.ap(16, 2131428448));
            arrayDeque.add(tmy.ap(8, 2131428209));
            arrayDeque.add(tmy.az(18));
            arrayDeque.add(tmy.az(3));
            n += this.b.getDimensionPixelOffset(2131165819);
        }
        else {
            arrayDeque.add(tmy.az(16));
            arrayDeque.add(tmy.az(8));
            arrayDeque.add(tmy.ap(18, 2131428209));
            arrayDeque.add(tmy.ap(3, 2131428209));
            n = 0;
        }
        arrayDeque.add(tmy.aw(dimensionPixelOffset + n));
        final boolean a = tmy.aK(arrayDeque).a((ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
        boolean ai = tmy.aI((ViewGroup$LayoutParams)relativeLayout$LayoutParams, tmy.ax(-n));
        if (!a) {
            if (!ai) {
                return;
            }
            ai = true;
        }
        this.k.post((Runnable)new jhz(this, a, relativeLayout$LayoutParams2, ai, relativeLayout$LayoutParams));
    }
}

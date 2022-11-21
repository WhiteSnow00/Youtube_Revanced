// 
// Decompiled by Procyon v0.6.0
// 

package androidx.cardview.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
    public static final sh e;
    private static final int[] g;
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final aqv f;
    
    static {
        g = new int[] { 16842801 };
        e = new sh();
    }
    
    public CardView(final Context context) {
        this(context, null);
    }
    
    public CardView(final Context context, final AttributeSet set) {
        this(context, set, 2130968886);
    }
    
    public CardView(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        final Rect c = new Rect();
        this.c = c;
        this.d = new Rect();
        final aqv f = new aqv(this);
        this.f = f;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aaz.a, n, 2132083199);
        anc.M((View)this, context, aaz.a, set, obtainStyledAttributes, n, 2132083199);
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(2)) {
            list = obtainStyledAttributes.getColorStateList(2);
        }
        else {
            final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(CardView.g);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            if (array[2] > 0.5f) {
                n = this.getResources().getColor(2131099764);
            }
            else {
                n = this.getResources().getColor(2131099763);
            }
            list = ColorStateList.valueOf(n);
        }
        final float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        final float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        c.left = obtainStyledAttributes.getDimensionPixelSize(10, n);
        c.top = obtainStyledAttributes.getDimensionPixelSize(12, n);
        c.right = obtainStyledAttributes.getDimensionPixelSize(11, n);
        c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, n);
        float n2 = dimension3;
        if (dimension2 > dimension3) {
            n2 = dimension2;
        }
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        final sh e = CardView.e;
        final aba aba = new aba(list, dimension);
        f.a = aba;
        ((CardView)f.b).setBackgroundDrawable((Drawable)aba);
        final View view = (View)f.b;
        view.setClipToOutline(true);
        view.setElevation(dimension2);
        e.c(f, n2);
    }
    
    public static void c(final CardView cardView, final int n, final int n2, final int n3, final int n4) {
        cardView.setPadding(n, n2, n3, n4);
    }
    
    public float b() {
        return sh.e(this.f);
    }
    
    public void d(final int n) {
        final aqv f = this.f;
        final ColorStateList value = ColorStateList.valueOf(n);
        final aba aba = (aba)f.a;
        aba.a(value);
        aba.invalidateSelf();
    }
    
    public void e(final float n) {
        CardView.e.c(this.f, n);
    }
    
    public void f(final float a) {
        final aba aba = (aba)this.f.a;
        if (a == aba.a) {
            return;
        }
        aba.a = a;
        aba.b((Rect)null);
        aba.invalidateSelf();
    }
    
    public void g() {
        ((View)this.f.b).setElevation(0.0f);
    }
    
    public final float mv() {
        return sh.d(this.f);
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
}

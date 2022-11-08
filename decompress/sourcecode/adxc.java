import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.WindowInsets;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class adxc extends FrameLayout
{
    private static final View$OnTouchListener h;
    public adxd a;
    adwk b;
    public int c;
    public final float d;
    public final int e;
    public Rect f;
    public boolean g;
    private final float i;
    private final int j;
    private ColorStateList k;
    private PorterDuff$Mode l;
    
    static {
        h = (View$OnTouchListener)new gmg(11);
    }
    
    protected adxc(final Context context) {
        this(context, null);
    }
    
    protected adxc(final Context context, final AttributeSet set) {
        super(adyy.a(context, set, 0, 0), set);
        final Context context2 = this.getContext();
        final TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(set, adxf.a);
        if (obtainStyledAttributes.hasValue(6)) {
            ana.U((View)this, (float)obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.b = adwk.c(context2, set, 0, 0).a();
        }
        final float float1 = obtainStyledAttributes.getFloat(3, 1.0f);
        this.i = float1;
        this.setBackgroundTintList(adwd.f(context2, obtainStyledAttributes, 4));
        this.setBackgroundTintMode(adwd.q(obtainStyledAttributes.getInt(5, -1), PorterDuff$Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.e = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        this.setOnTouchListener(adxc.h);
        this.setFocusable(true);
        if (this.getBackground() == null) {
            final int c = adwd.C(adwd.A((View)this, 2130969109), adwd.A((View)this, 2130969073), float1);
            final adwk b = this.b;
            Object o;
            if (b != null) {
                final String c2 = adxd.c;
                o = new adwf(b);
                ((adwf)o).o(ColorStateList.valueOf(c));
            }
            else {
                final Resources resources = this.getResources();
                final String c3 = adxd.c;
                final float dimension = resources.getDimension(2131168195);
                o = new GradientDrawable();
                ((GradientDrawable)o).setShape(0);
                ((GradientDrawable)o).setCornerRadius(dimension);
                ((GradientDrawable)o).setColor(c);
            }
            final ColorStateList k = this.k;
            if (k != null) {
                aip.g((Drawable)o, k);
            }
            ana.Q((View)this, (Drawable)o);
        }
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final adxd a = this.a;
        if (a != null && Build$VERSION.SDK_INT >= 29) {
            final WindowInsets rootWindowInsets = a.k.getRootWindowInsets();
            if (rootWindowInsets != null) {
                a.q = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                a.j();
            }
        }
        ana.L((View)this);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final adxd a = this.a;
        if (a != null) {
            final adxj a2 = adxj.a();
            final aepj v = a.v;
            synchronized (a2.a) {
                final boolean g = a2.g(v);
                int n = 1;
                if (!g) {
                    if (a2.h(v)) {
                        n = n;
                    }
                    else {
                        n = 0;
                    }
                }
                monitorexit(a2.a);
                if (n != 0) {
                    adxd.b.post((Runnable)new admc(a, 14));
                }
            }
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final adxd a = this.a;
        if (a != null && a.s) {
            a.i();
            a.s = false;
        }
    }
    
    protected void onMeasure(int measuredWidth, final int n) {
        super.onMeasure(measuredWidth, n);
        if (this.j > 0) {
            measuredWidth = this.getMeasuredWidth();
            final int j = this.j;
            if (measuredWidth > j) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(j, 1073741824), n);
            }
        }
    }
    
    public final void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (this.k != null) {
                mutate = drawable.mutate();
                aip.g(mutate, this.k);
                aip.h(mutate, this.l);
            }
        }
        super.setBackgroundDrawable(mutate);
    }
    
    public final void setBackgroundTintList(final ColorStateList k) {
        this.k = k;
        if (this.getBackground() != null) {
            final Drawable mutate = this.getBackground().mutate();
            aip.g(mutate, k);
            aip.h(mutate, this.l);
            if (mutate != this.getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode l) {
        this.l = l;
        if (this.getBackground() != null) {
            final Drawable mutate = this.getBackground().mutate();
            aip.h(mutate, l);
            if (mutate != this.getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }
    
    public final void setLayoutParams(final ViewGroup$LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.g && layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            this.f = new Rect(viewGroup$MarginLayoutParams.leftMargin, viewGroup$MarginLayoutParams.topMargin, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
            final adxd a = this.a;
            if (a != null) {
                a.j();
            }
        }
    }
    
    public final void setOnClickListener(final View$OnClickListener onClickListener) {
        View$OnTouchListener h;
        if (onClickListener != null) {
            h = null;
        }
        else {
            h = adxc.h;
        }
        this.setOnTouchListener(h);
        super.setOnClickListener(onClickListener);
    }
}

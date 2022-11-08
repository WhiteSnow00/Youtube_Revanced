import android.text.Layout;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.PorterDuff$Mode;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnLayoutChangeListener;
import android.content.res.ColorStateList;
import android.view.View;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adxv extends LinearLayout
{
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private adxt e;
    private int f;
    
    public adxv(final TabLayout d, final Context context) {
        this.d = d;
        super(context);
        this.f = 2;
        final int p2 = d.p;
        final GradientDrawable gradientDrawable = null;
        if (p2 != 0) {
            final Drawable b = fc.b(context, p2);
            this.c = b;
            if (b != null && b.isStateful()) {
                b.setState(this.getDrawableState());
            }
        }
        else {
            this.c = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Object o = gradientDrawable2;
        if (d.k != null) {
            Object o2 = new GradientDrawable();
            ((GradientDrawable)o2).setCornerRadius(1.0E-5f);
            ((GradientDrawable)o2).setColor(-1);
            final ColorStateList a = advx.a(d.k);
            final boolean y = d.y;
            if (y) {
                gradientDrawable2 = null;
            }
            if (y) {
                o2 = gradientDrawable;
            }
            o = new RippleDrawable(a, (Drawable)gradientDrawable2, (Drawable)o2);
        }
        ana.Q((View)this, (Drawable)o);
        d.invalidate();
        ana.ab((View)this, d.b, d.c, d.d, d.e);
        this.setGravity(17);
        this.setOrientation((int)((d.v ^ true) ? 1 : 0));
        this.setClickable(true);
        ana.aC((View)this, new bx(alz.b(this.getContext(), 1002)));
    }
    
    private static final void c(final View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener((View$OnLayoutChangeListener)new zdh(view, 6));
    }
    
    public final void a(final adxt e) {
        if (e != this.e) {
            this.e = e;
            this.b();
        }
    }
    
    public final void b() {
        final adxt e = this.e;
        final ImageView b = this.b;
        final boolean b2 = false;
        if (b == null) {
            ((ViewGroup)this).addView((View)(this.b = (ImageView)LayoutInflater.from(this.getContext()).inflate(2131624337, (ViewGroup)this, false)), 0);
        }
        if (this.a == null) {
            ((ViewGroup)this).addView((View)(this.a = (TextView)LayoutInflater.from(this.getContext()).inflate(2131624338, (ViewGroup)this, false)));
            this.f = apr.a(this.a);
        }
        this.a.setTextAppearance(this.d.f);
        Label_0153: {
            if (this.isSelected()) {
                final int h = this.d.h;
                if (h != -1) {
                    this.a.setTextAppearance(h);
                    break Label_0153;
                }
            }
            this.a.setTextAppearance(this.d.g);
        }
        final ColorStateList i = this.d.i;
        if (i != null) {
            this.a.setTextColor(i);
        }
        final TextView a = this.a;
        final ImageView b3 = this.b;
        final adxt e2 = this.e;
        final CharSequence charSequence = null;
        Drawable mutate = null;
        Label_0218: {
            if (e2 != null) {
                final Drawable a2 = e2.a;
                if (a2 != null) {
                    mutate = a2.mutate();
                    break Label_0218;
                }
            }
            mutate = null;
        }
        if (mutate != null) {
            aip.g(mutate, this.d.j);
            final PorterDuff$Mode m = this.d.m;
            if (m != null) {
                aip.h(mutate, m);
            }
        }
        final adxt e3 = this.e;
        CharSequence b4;
        if (e3 != null) {
            b4 = e3.b;
        }
        else {
            b4 = null;
        }
        if (b3 != null) {
            if (mutate != null) {
                b3.setImageDrawable(mutate);
                b3.setVisibility(0);
                this.setVisibility(0);
            }
            else {
                b3.setVisibility(8);
                b3.setImageDrawable((Drawable)null);
            }
        }
        final boolean b5 = TextUtils.isEmpty(b4) ^ true;
        int n2;
        if (a != null) {
            int n;
            if (b5) {
                final int f = this.e.f;
                n = 1;
            }
            else {
                n = 0;
            }
            CharSequence text;
            if (!b5) {
                text = null;
            }
            else {
                text = b4;
            }
            a.setText(text);
            int visibility;
            if (n == 0) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            a.setVisibility(visibility);
            n2 = n;
            if (b5) {
                this.setVisibility(0);
                n2 = n;
            }
        }
        else {
            n2 = 0;
        }
        if (b3 != null) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)b3.getLayoutParams();
            int bottomMargin;
            if (n2 != 0 && b3.getVisibility() == 0) {
                bottomMargin = (int)adwd.p(this.getContext(), 8);
            }
            else {
                bottomMargin = 0;
            }
            if (this.d.v) {
                if (bottomMargin != alk.b(viewGroup$MarginLayoutParams)) {
                    alk.f(viewGroup$MarginLayoutParams, bottomMargin);
                    viewGroup$MarginLayoutParams.bottomMargin = 0;
                    b3.setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                    b3.requestLayout();
                }
            }
            else if (bottomMargin != viewGroup$MarginLayoutParams.bottomMargin) {
                viewGroup$MarginLayoutParams.bottomMargin = bottomMargin;
                alk.f(viewGroup$MarginLayoutParams, 0);
                b3.setLayoutParams((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
                b3.requestLayout();
            }
        }
        final adxt e4 = this.e;
        CharSequence c = charSequence;
        if (e4 != null) {
            c = e4.c;
        }
        if (!b5) {
            b4 = c;
        }
        py.a((View)this, b4);
        c((View)this.b);
        c((View)this.a);
        if (e != null && !TextUtils.isEmpty(e.c)) {
            this.setContentDescription(e.c);
        }
        boolean selected = b2;
        if (e != null) {
            final TabLayout g = e.g;
            if (g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            final int a3 = g.a();
            selected = b2;
            if (a3 != -1) {
                selected = b2;
                if (a3 == e.d) {
                    selected = true;
                }
            }
        }
        this.setSelected(selected);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable c = this.c;
        if (c != null && c.isStateful() && this.c.setState(drawableState)) {
            this.invalidate();
            this.d.invalidate();
        }
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final aol c = aol.c(accessibilityNodeInfo);
        c.t((Object)bx.J(0, 1, this.e.d, 1, false, this.isSelected()));
        if (this.isSelected()) {
            c.r(false);
            c.M(aok.c);
        }
        c.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", (CharSequence)this.getResources().getString(2132018190));
    }
    
    public final void onMeasure(int maxLines, final int n) {
        final int size = View$MeasureSpec.getSize(maxLines);
        final int mode = View$MeasureSpec.getMode(maxLines);
        final int q = this.d.q;
        int measureSpec = maxLines;
        Label_0052: {
            if (q > 0) {
                if (mode != 0) {
                    measureSpec = maxLines;
                    if (size <= q) {
                        break Label_0052;
                    }
                }
                measureSpec = View$MeasureSpec.makeMeasureSpec(q, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(measureSpec, n);
        if (this.a != null) {
            final float n2 = this.d.n;
            final int f = this.f;
            final ImageView b = this.b;
            float o;
            if (b != null && b.getVisibility() == 0) {
                maxLines = 1;
                o = n2;
            }
            else {
                final TextView a = this.a;
                o = n2;
                maxLines = f;
                if (a != null) {
                    o = n2;
                    maxLines = f;
                    if (a.getLineCount() > 1) {
                        o = this.d.o;
                        maxLines = f;
                    }
                }
            }
            final float textSize = this.a.getTextSize();
            final int lineCount = this.a.getLineCount();
            final int a2 = apr.a(this.a);
            if (o != textSize || (a2 >= 0 && maxLines != a2)) {
                if (this.d.u == 1 && o > textSize && lineCount == 1) {
                    final Layout layout = this.a.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if (layout.getLineWidth(0) * (o / layout.getPaint().getTextSize()) > this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight()) {
                        return;
                    }
                }
                this.a.setTextSize(0, o);
                this.a.setMaxLines(maxLines);
                super.onMeasure(measureSpec, n);
            }
        }
    }
    
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                this.playSoundEffect(0);
            }
            this.e.a();
            performClick = true;
        }
        return performClick;
    }
    
    public final void setSelected(final boolean selected) {
        this.isSelected();
        super.setSelected(selected);
        final TextView a = this.a;
        if (a != null) {
            a.setSelected(selected);
        }
        final ImageView b = this.b;
        if (b != null) {
            b.setSelected(selected);
        }
    }
}

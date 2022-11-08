// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.view.menu;

import android.view.MotionEvent;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.widget.Button;
import android.content.res.Configuration;
import android.view.View;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.support.v7.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements View$OnClickListener, ja, ju
{
    public io a;
    public il b;
    public qpt c;
    private CharSequence d;
    private Drawable e;
    private ml f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    
    public ActionMenuItemView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.g = this.k();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, gl.c, n, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.j = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener((View$OnClickListener)this);
        this.i = -1;
        this.setSaveEnabled(false);
    }
    
    private final void j() {
        final boolean empty = TextUtils.isEmpty(this.d);
        boolean b = true;
        Label_0043: {
            if (this.e != null) {
                if ((this.a.n & 0x4) == 0x4) {
                    b = b;
                    if (this.g) {
                        break Label_0043;
                    }
                }
                b = false;
            }
        }
        final boolean b2 = (empty ^ true) & b;
        final CharSequence charSequence = null;
        CharSequence d;
        if (b2) {
            d = this.d;
        }
        else {
            d = null;
        }
        this.setText(d);
        final CharSequence l = this.a.l;
        if (TextUtils.isEmpty(l)) {
            CharSequence d2;
            if (b2) {
                d2 = null;
            }
            else {
                d2 = this.a.d;
            }
            this.setContentDescription(d2);
        }
        else {
            this.setContentDescription(l);
        }
        final CharSequence m = this.a.m;
        if (TextUtils.isEmpty(m)) {
            CharSequence d3;
            if (b2) {
                d3 = charSequence;
            }
            else {
                d3 = this.a.d;
            }
            py.a((View)this, d3);
            return;
        }
        py.a((View)this, m);
    }
    
    private final boolean k() {
        final Configuration configuration = this.getContext().getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        return screenWidthDp >= 480 || configuration.orientation == 2;
    }
    
    public final io a() {
        return this.a;
    }
    
    public final boolean b() {
        return !TextUtils.isEmpty(this.getText());
    }
    
    public final boolean c() {
        return this.b();
    }
    
    public final boolean d() {
        return this.b() && this.a.getIcon() == null;
    }
    
    public final boolean e() {
        return true;
    }
    
    public final void f(final io a) {
        this.a = a;
        final Drawable icon = a.getIcon();
        this.e = icon;
        final int n = 0;
        if (icon != null) {
            final int intrinsicWidth = icon.getIntrinsicWidth();
            final int intrinsicHeight = icon.getIntrinsicHeight();
            int j = this.j;
            int n2 = intrinsicWidth;
            int n3 = intrinsicHeight;
            if (intrinsicWidth > j) {
                n3 = (int)(intrinsicHeight * (j / (float)intrinsicWidth));
                n2 = j;
            }
            if (n3 > j) {
                n2 *= (int)(j / (float)n3);
            }
            else {
                j = n3;
            }
            icon.setBounds(0, 0, n2, j);
        }
        this.setCompoundDrawables(icon, (Drawable)null, (Drawable)null, (Drawable)null);
        this.j();
        this.d = a.f((ja)this);
        this.j();
        this.setId(a.a);
        int visibility = n;
        if (!a.isVisible()) {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setEnabled(a.isEnabled());
        if (a.hasSubMenu() && this.f == null) {
            this.f = (ml)new ib(this);
        }
    }
    
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
    
    public final void onClick(final View view) {
        final il b = this.b;
        if (b != null) {
            b.b(this.a);
        }
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = this.k();
        this.j();
    }
    
    protected final void onMeasure(int n, final int n2) {
        final boolean b = this.b();
        if (b) {
            final int i = this.i;
            if (i >= 0) {
                super.setPadding(i, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
            }
        }
        super.onMeasure(n, n2);
        final int mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        final int measuredWidth = this.getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            n = Math.min(n, this.h);
        }
        else {
            n = this.h;
        }
        if (mode != 1073741824 && this.h > 0 && measuredWidth < n) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), n2);
        }
        if (!b && this.e != null) {
            super.setPadding((this.getMeasuredWidth() - this.e.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable)null);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.a.hasSubMenu()) {
            final ml f = this.f;
            if (f != null && f.onTouch((View)this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setPadding(final int i, final int n, final int n2, final int n3) {
        super.setPadding(this.i = i, n, n2, n3);
    }
}

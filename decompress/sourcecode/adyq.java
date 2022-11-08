import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputLayout;
import android.content.res.TypedArray;
import android.widget.ListAdapter;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adyq extends jz
{
    public final nb a;
    public final float b;
    public final int c;
    public final ColorStateList d;
    private final AccessibilityManager e;
    private final Rect f;
    private final int g;
    
    public adyq(final Context context, final AttributeSet set) {
        super(adyy.a(context, set, 2130968761, 0), set, 2130968761);
        this.f = new Rect();
        final Context context2 = this.getContext();
        final TypedArray a = aduf.a(context2, set, adys.a, 2130968761, 2132084593, new int[0]);
        if (a.hasValue(0) && a.getInt(0, 0) == 0) {
            this.setKeyListener((KeyListener)null);
        }
        final int resourceId = a.getResourceId(2, 2131624868);
        this.g = resourceId;
        this.b = (float)a.getDimensionPixelOffset(1, 2131168095);
        this.c = a.getColor(3, 0);
        this.d = adwd.f(context2, a, 4);
        this.e = (AccessibilityManager)context2.getSystemService("accessibility");
        final nb a2 = new nb(context2);
        (this.a = a2).z();
        a2.l = (View)this;
        a2.y();
        a2.e(this.getAdapter());
        a2.m = (AdapterView$OnItemClickListener)new ou(this, 6);
        if (a.hasValue(5)) {
            this.setAdapter((ListAdapter)new adyp(this, this.getContext(), resourceId, this.getResources().getStringArray(a.getResourceId(5, 0))));
        }
        a.recycle();
    }
    
    private final TextInputLayout b() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    public final void a(final Object o) {
        this.setText(this.convertSelectionToString(o), false);
    }
    
    public final CharSequence getHint() {
        final TextInputLayout b = this.b();
        if (b != null && b.k) {
            return b.e();
        }
        return super.getHint();
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout b = this.b();
        if (b != null && b.k && super.getHint() == null && adwd.t()) {
            this.setHint((CharSequence)"");
        }
    }
    
    protected final void onMeasure(final int n, int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            final int measuredWidth = this.getMeasuredWidth();
            final ListAdapter adapter = this.getAdapter();
            final TextInputLayout b = this.b();
            final int n3 = 0;
            int n4 = 0;
            n2 = n3;
            if (adapter != null) {
                if (b == null) {
                    n2 = n3;
                }
                else {
                    final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
                    n2 = Math.max(0, this.a.o());
                    final int min = Math.min(adapter.getCount(), n2 + 15);
                    int i = Math.max(0, min - 15);
                    View view = null;
                    n2 = 0;
                    while (i < min) {
                        final int itemViewType = adapter.getItemViewType(i);
                        int n5;
                        if (itemViewType != n4) {
                            n5 = itemViewType;
                        }
                        else {
                            n5 = n4;
                        }
                        if (itemViewType != n4) {
                            view = null;
                        }
                        view = adapter.getView(i, view, (ViewGroup)b);
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                        }
                        view.measure(measureSpec, measureSpec2);
                        n2 = Math.max(n2, view.getMeasuredWidth());
                        ++i;
                        n4 = n5;
                    }
                    final Drawable c = this.a.c();
                    int n6 = n2;
                    if (c != null) {
                        c.getPadding(this.f);
                        n6 = n2 + (this.f.left + this.f.right);
                    }
                    n2 = n6 + b.b.d.getMeasuredWidth();
                }
            }
            this.setMeasuredDimension(Math.min(Math.max(measuredWidth, n2), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public final void setAdapter(final ListAdapter adapter) {
        super.setAdapter(adapter);
        this.a.e(this.getAdapter());
    }
    
    public final void setDropDownBackgroundDrawable(final Drawable dropDownBackgroundDrawable) {
        super.setDropDownBackgroundDrawable(dropDownBackgroundDrawable);
        final nb a = this.a;
        if (a != null) {
            a.f(dropDownBackgroundDrawable);
        }
    }
    
    public final void setOnItemSelectedListener(final AdapterView$OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.n = this.getOnItemSelectedListener();
    }
    
    public final void setRawInputType(final int rawInputType) {
        super.setRawInputType(rawInputType);
        final TextInputLayout b = this.b();
        if (b != null) {
            b.F();
        }
    }
    
    public final void showDropDown() {
        final AccessibilityManager e = this.e;
        if (e != null && e.isTouchExplorationEnabled()) {
            this.a.v();
            return;
        }
        super.showDropDown();
    }
}

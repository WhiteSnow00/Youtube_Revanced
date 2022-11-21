// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.ArrayAdapter;
import android.content.res.TypedArray;
import android.view.View;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import android.graphics.Rect;
import android.content.Context;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner
{
    private static final int[] e;
    public final Context a;
    public kw b;
    public int c;
    public final Rect d;
    private final kb f;
    private mm g;
    private SpinnerAdapter h;
    private final boolean i;
    
    static {
        e = new int[] { 16843505 };
    }
    
    public AppCompatSpinner(final Context context) {
        this(context, null);
    }
    
    public AppCompatSpinner(final Context context, final int n) {
        this(context, null, 2130970297, n);
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set) {
        this(context, set, 2130970297);
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, -1);
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set, final int n, final int n2) {
        this(context, set, n, n2, null);
    }
    
    public AppCompatSpinner(final Context a, AttributeSet set, final int n, int int1, Resources$Theme obtainStyledAttributes) {
        super(a, set, n);
        this.d = new Rect();
        pn.d((View)this, this.getContext());
        final cdr w = cdr.w(a, set, gm.v, n, 0);
        this.f = new kb((View)this);
        if (obtainStyledAttributes != null) {
            this.a = (Context)new rr(a, (Resources$Theme)obtainStyledAttributes);
        }
        else {
            final int i = w.i(4, 0);
            if (i != 0) {
                this.a = (Context)new rr(a, i);
            }
            else {
                this.a = a;
            }
        }
        final int n2 = -1;
        final AttributeSet set2 = null;
        int n3 = int1;
        Label_0356: {
            if (int1 == -1) {
                try {
                    obtainStyledAttributes = (Exception)a.obtainStyledAttributes(set, AppCompatSpinner.e, n, 0);
                    int1 = n2;
                    try {
                        if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                            int1 = ((TypedArray)obtainStyledAttributes).getInt(0, 0);
                        }
                        if (obtainStyledAttributes != null) {
                            ((TypedArray)obtainStyledAttributes).recycle();
                        }
                        n3 = int1;
                    }
                    catch (final Exception set2) {}
                }
                catch (Exception obtainStyledAttributes) {
                    obtainStyledAttributes = null;
                }
                finally {
                    set = set2;
                }
                if (obtainStyledAttributes != null) {
                    ((TypedArray)obtainStyledAttributes).recycle();
                }
                break Label_0356;
            }
            if (n3 != 0) {
                if (n3 == 1) {
                    final kv b = new kv(this, this.a, set, n);
                    final cdr w2 = cdr.w(this.a, set, gm.v, n, 0);
                    this.c = w2.h(3, -2);
                    ((nc)b).f(w2.k(1));
                    b.a = w.n(2);
                    w2.o();
                    this.b = (kw)b;
                    this.g = (mm)new kp(this, (View)this, b);
                }
            }
            else {
                (this.b = (kw)new kt(this)).i((CharSequence)w.n(2));
            }
        }
        final CharSequence[] textArray = ((TypedArray)w.a).getTextArray(0);
        if (textArray != null) {
            final ArrayAdapter adapter = new ArrayAdapter(a, 17367048, (Object[])textArray);
            adapter.setDropDownViewResource(2131625617);
            this.setAdapter((SpinnerAdapter)adapter);
        }
        w.o();
        this.i = true;
        final SpinnerAdapter h = this.h;
        if (h != null) {
            this.setAdapter(h);
            this.h = null;
        }
        this.f.b(set, n);
    }
    
    public final int a(final SpinnerAdapter spinnerAdapter, final Drawable drawable) {
        int n = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        final int max = Math.max(0, this.getSelectedItemPosition());
        final int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int i = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int max2 = 0;
        while (i < min) {
            final int itemViewType = spinnerAdapter.getItemViewType(i);
            int n2;
            if (itemViewType != n) {
                n2 = itemViewType;
            }
            else {
                n2 = n;
            }
            if (itemViewType != n) {
                view = null;
            }
            view = spinnerAdapter.getView(i, view, (ViewGroup)this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
            }
            view.measure(measureSpec, measureSpec2);
            max2 = Math.max(max2, view.getMeasuredWidth());
            ++i;
            n = n2;
        }
        int n3 = max2;
        if (drawable != null) {
            drawable.getPadding(this.d);
            n3 = max2 + (this.d.left + this.d.right);
        }
        return n3;
    }
    
    public final void b() {
        this.b.k(kr.b((View)this), kr.a((View)this));
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final kb f = this.f;
        if (f != null) {
            f.a();
        }
    }
    
    public final int getDropDownHorizontalOffset() {
        final kw b = this.b;
        if (b != null) {
            return b.a();
        }
        return super.getDropDownHorizontalOffset();
    }
    
    public final int getDropDownVerticalOffset() {
        final kw b = this.b;
        if (b != null) {
            return b.b();
        }
        return super.getDropDownVerticalOffset();
    }
    
    public final int getDropDownWidth() {
        if (this.b != null) {
            return this.c;
        }
        return super.getDropDownWidth();
    }
    
    public final Drawable getPopupBackground() {
        final kw b = this.b;
        if (b != null) {
            return b.c();
        }
        return super.getPopupBackground();
    }
    
    public final Context getPopupContext() {
        return this.a;
    }
    
    public final CharSequence getPrompt() {
        final kw b = this.b;
        CharSequence charSequence;
        if (b != null) {
            charSequence = b.d();
        }
        else {
            charSequence = super.getPrompt();
        }
        return charSequence;
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final kw b = this.b;
        if (b != null && b.x()) {
            this.b.m();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (this.b != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState)parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.a) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new jf(this, 2));
            }
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        final kw b = this.b;
        boolean a = false;
        if (b != null) {
            a = a;
            if (b.x()) {
                a = true;
            }
        }
        appCompatSpinner$SavedState.a = a;
        return (Parcelable)appCompatSpinner$SavedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final mm g = this.g;
        return (g != null && g.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final boolean performClick() {
        final kw b = this.b;
        if (b != null) {
            if (!b.x()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }
    
    public final /* bridge */ void setAdapter(final Adapter adapter) {
        this.setAdapter((SpinnerAdapter)adapter);
    }
    
    public final void setAdapter(final SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context;
            if ((context = this.a) == null) {
                context = this.getContext();
            }
            this.b.e((ListAdapter)new ku(spinnerAdapter, context.getTheme()));
        }
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final kb f = this.f;
        if (f != null) {
            f.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final kb f = this.f;
        if (f != null) {
            f.c(backgroundResource);
        }
    }
    
    public final void setDropDownHorizontalOffset(final int dropDownHorizontalOffset) {
        final kw b = this.b;
        if (b != null) {
            b.h(dropDownHorizontalOffset);
            this.b.g(dropDownHorizontalOffset);
            return;
        }
        super.setDropDownHorizontalOffset(dropDownHorizontalOffset);
    }
    
    public final void setDropDownVerticalOffset(final int dropDownVerticalOffset) {
        final kw b = this.b;
        if (b != null) {
            b.j(dropDownVerticalOffset);
            return;
        }
        super.setDropDownVerticalOffset(dropDownVerticalOffset);
    }
    
    public final void setDropDownWidth(final int n) {
        if (this.b != null) {
            this.c = n;
            return;
        }
        super.setDropDownWidth(n);
    }
    
    public final void setPopupBackgroundDrawable(final Drawable popupBackgroundDrawable) {
        final kw b = this.b;
        if (b != null) {
            b.f(popupBackgroundDrawable);
            return;
        }
        super.setPopupBackgroundDrawable(popupBackgroundDrawable);
    }
    
    public final void setPopupBackgroundResource(final int n) {
        this.setPopupBackgroundDrawable(fc.b(this.a, n));
    }
    
    public final void setPrompt(final CharSequence prompt) {
        final kw b = this.b;
        if (b != null) {
            b.i(prompt);
            return;
        }
        super.setPrompt(prompt);
    }
}

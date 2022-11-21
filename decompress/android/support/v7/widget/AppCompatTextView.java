// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.graphics.Typeface;
import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.os.Build$VERSION;
import android.view.textclassifier.TextClassifier;
import android.view.ActionMode$Callback;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class AppCompatTextView extends TextView
{
    private final kb a;
    private final ld b;
    private kh c;
    private boolean d;
    private le e;
    private final bkl f;
    
    public AppCompatTextView(final Context context) {
        this(context, null);
    }
    
    public AppCompatTextView(final Context context, final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public AppCompatTextView(final Context context, final AttributeSet set, final int n) {
        pp.a(context);
        super(context, set, n);
        this.d = false;
        this.e = null;
        pn.d((View)this, this.getContext());
        (this.a = new kb((View)this)).b(set, n);
        final ld b = new ld((TextView)this);
        (this.b = b).g(set, n);
        b.e();
        this.f = new bkl((TextView)this);
        this.a().a(set, n);
    }
    
    private final kh a() {
        if (this.c == null) {
            this.c = new kh((TextView)this);
        }
        return this.c;
    }
    
    public static void g(final AppCompatTextView appCompatTextView, final int firstBaselineToTopHeight) {
        appCompatTextView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
    }
    
    public static void h(final AppCompatTextView appCompatTextView, final int lastBaselineToBottomHeight) {
        appCompatTextView.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final kb a = this.a;
        if (a != null) {
            a.a();
        }
        final ld b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final int getAutoSizeMaxTextSize() {
        if (qc.b) {
            return this.i().a.getAutoSizeMaxTextSize();
        }
        final ld b = this.b;
        if (b != null) {
            return b.a();
        }
        return -1;
    }
    
    public final int getAutoSizeMinTextSize() {
        if (qc.b) {
            return this.i().a.getAutoSizeMinTextSize();
        }
        final ld b = this.b;
        if (b != null) {
            return b.b();
        }
        return -1;
    }
    
    public final int getAutoSizeStepGranularity() {
        if (qc.b) {
            return this.i().a.getAutoSizeStepGranularity();
        }
        final ld b = this.b;
        if (b != null) {
            return b.c();
        }
        return -1;
    }
    
    public final int[] getAutoSizeTextAvailableSizes() {
        if (qc.b) {
            return this.i().a.getAutoSizeTextAvailableSizes();
        }
        final ld b = this.b;
        if (b != null) {
            return b.p();
        }
        return new int[0];
    }
    
    public final int getAutoSizeTextType() {
        if (qc.b) {
            if (this.i().a.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        else {
            final ld b = this.b;
            if (b != null) {
                return b.d();
            }
            return 0;
        }
    }
    
    public final ActionMode$Callback getCustomSelectionActionModeCallback() {
        return apj.b(super.getCustomSelectionActionModeCallback());
    }
    
    public final int getFirstBaselineToTopHeight() {
        return this.getPaddingTop() - this.getPaint().getFontMetricsInt().top;
    }
    
    public final int getLastBaselineToBottomHeight() {
        return this.getPaddingBottom() + this.getPaint().getFontMetricsInt().bottom;
    }
    
    public final TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final bkl f = this.f;
            if (f != null) {
                return f.i();
            }
        }
        return this.i().a.getTextClassifier();
    }
    
    final le i() {
        if (this.e == null) {
            Object e;
            if (Build$VERSION.SDK_INT >= 28) {
                e = new lf(this);
            }
            else {
                e = new le(this);
            }
            this.e = (le)e;
        }
        return this.e;
    }
    
    public final InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ld.r((TextView)this, onCreateInputConnection, editorInfo);
        fn.e(onCreateInputConnection, editorInfo, (View)this);
        return onCreateInputConnection;
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final ld b2 = this.b;
        if (b2 != null) {
            b2.q();
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
    }
    
    protected final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        if (this.b != null && !qc.b && this.b.o()) {
            this.b.f();
        }
    }
    
    public final void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.a();
        asx.e();
    }
    
    public final void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) {
        if (qc.b) {
            this.i().a.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
            return;
        }
        final ld b = this.b;
        if (b != null) {
            b.j(n, n2, n3, n4);
        }
    }
    
    public final void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) {
        if (qc.b) {
            this.i().a.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
            return;
        }
        final ld b = this.b;
        if (b != null) {
            b.k(array, n);
        }
    }
    
    public final void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (qc.b) {
            this.i().a.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
            return;
        }
        final ld b = this.b;
        if (b != null) {
            b.l(autoSizeTextTypeWithDefaults);
        }
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final kb a = this.a;
        if (a != null) {
            a.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final kb a = this.a;
        if (a != null) {
            a.c(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final ld b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final ld b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = fc.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = fc.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = fc.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = fc.b(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, b);
        final ld b5 = this.b;
        if (b5 != null) {
            b5.e();
        }
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final ld b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable b = null;
        Drawable b2;
        if (n != 0) {
            b2 = fc.b(context, n);
        }
        else {
            b2 = null;
        }
        Drawable b3;
        if (n2 != 0) {
            b3 = fc.b(context, n2);
        }
        else {
            b3 = null;
        }
        Drawable b4;
        if (n3 != 0) {
            b4 = fc.b(context, n3);
        }
        else {
            b4 = null;
        }
        if (n4 != 0) {
            b = fc.b(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b);
        final ld b5 = this.b;
        if (b5 != null) {
            b5.e();
        }
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final ld b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(apj.c(this, actionMode$Callback));
    }
    
    public final void setFilters(final InputFilter[] filters) {
        this.a();
        asx.e();
        super.setFilters(filters);
    }
    
    public final void setFirstBaselineToTopHeight(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.i().a(n);
            return;
        }
        apj.d(this, n);
    }
    
    public final void setLastBaselineToBottomHeight(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.i().b(n);
            return;
        }
        apj.e(this, n);
    }
    
    public final void setLineHeight(final int n) {
        apj.f(this, n);
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ld b = this.b;
        if (b != null) {
            b.h(context, n);
        }
    }
    
    public final void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final bkl f = this.f;
            if (f != null) {
                f.b = textClassifier;
                return;
            }
        }
        this.i().a.setTextClassifier(textClassifier);
    }
    
    public final void setTextSize(final int n, final float n2) {
        if (qc.b) {
            super.setTextSize(n, n2);
            return;
        }
        final ld b = this.b;
        if (b != null) {
            b.n(n, n2);
        }
    }
    
    public final void setTypeface(Typeface typeface, final int n) {
        if (this.d) {
            return;
        }
        Typeface a;
        final Typeface typeface2 = a = null;
        if (typeface != null) {
            a = typeface2;
            if (n > 0) {
                a = aih.a(this.getContext(), typeface, n);
            }
        }
        this.d = true;
        if (a != null) {
            typeface = a;
        }
        try {
            super.setTypeface(typeface, n);
        }
        finally {
            this.d = false;
        }
    }
}

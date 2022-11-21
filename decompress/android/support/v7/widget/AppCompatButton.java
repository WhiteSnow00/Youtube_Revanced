// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.text.InputFilter;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class AppCompatButton extends Button
{
    private kh mAppCompatEmojiTextHelper;
    private final kb mBackgroundTintHelper;
    private final ld mTextHelper;
    
    public AppCompatButton(final Context context) {
        this(context, null);
    }
    
    public AppCompatButton(final Context context, final AttributeSet set) {
        this(context, set, 2130968860);
    }
    
    public AppCompatButton(final Context context, final AttributeSet set, final int n) {
        pp.a(context);
        super(context, set, n);
        pn.d((View)this, this.getContext());
        (this.mBackgroundTintHelper = new kb((View)this)).b(set, n);
        final ld mTextHelper = new ld((TextView)this);
        (this.mTextHelper = mTextHelper).g(set, n);
        mTextHelper.e();
        this.getEmojiTextViewHelper().a(set, n);
    }
    
    private kh getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new kh((TextView)this);
        }
        return this.mAppCompatEmojiTextHelper;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.a();
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.e();
        }
    }
    
    public int getAutoSizeMaxTextSize() {
        if (qc.b) {
            return super.getAutoSizeMaxTextSize();
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.a();
        }
        return -1;
    }
    
    public int getAutoSizeMinTextSize() {
        if (qc.b) {
            return super.getAutoSizeMinTextSize();
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.b();
        }
        return -1;
    }
    
    public int getAutoSizeStepGranularity() {
        if (qc.b) {
            return super.getAutoSizeStepGranularity();
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.c();
        }
        return -1;
    }
    
    public int[] getAutoSizeTextAvailableSizes() {
        if (qc.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            return mTextHelper.p();
        }
        return new int[0];
    }
    
    public int getAutoSizeTextType() {
        if (qc.b) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        else {
            final ld mTextHelper = this.mTextHelper;
            if (mTextHelper != null) {
                return mTextHelper.d();
            }
            return 0;
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return apj.b(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            final ajm a = mBackgroundTintHelper.a;
            if (a != null) {
                return (ColorStateList)a.d;
            }
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            final ajm a = mBackgroundTintHelper.a;
            if (a != null) {
                return (PorterDuff$Mode)a.b;
            }
        }
        return null;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        final ajm d = this.mTextHelper.d;
        if (d != null) {
            return (ColorStateList)d.d;
        }
        return null;
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        final ajm d = this.mTextHelper.d;
        if (d != null) {
            return (PorterDuff$Mode)d.b;
        }
        return null;
    }
    
    public boolean isEmojiCompatEnabled() {
        return this.getEmojiTextViewHelper().c();
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.q();
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        if (this.mTextHelper != null && !qc.b && this.mTextHelper.o()) {
            this.mTextHelper.f();
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        this.getEmojiTextViewHelper();
        asx.e();
    }
    
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) {
        if (qc.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
            return;
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.j(n, n2, n3, n4);
        }
    }
    
    public void setAutoSizeTextTypeUniformWithPresetSizes(final int[] array, final int n) {
        if (qc.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
            return;
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.k(array, n);
        }
    }
    
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (qc.b) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
            return;
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.l(autoSizeTextTypeWithDefaults);
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            mBackgroundTintHelper.c(backgroundResource);
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(apj.c((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.getEmojiTextViewHelper().b(b);
    }
    
    public void setFilters(final InputFilter[] filters) {
        this.getEmojiTextViewHelper();
        asx.e();
        super.setFilters(filters);
    }
    
    public void setSupportAllCaps(final boolean b) {
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.i(b);
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList d) {
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            if (mBackgroundTintHelper.a == null) {
                mBackgroundTintHelper.a = new ajm();
            }
            final ajm a = mBackgroundTintHelper.a;
            a.d = d;
            a.c = true;
            mBackgroundTintHelper.a();
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode b) {
        final kb mBackgroundTintHelper = this.mBackgroundTintHelper;
        if (mBackgroundTintHelper != null) {
            if (mBackgroundTintHelper.a == null) {
                mBackgroundTintHelper.a = new ajm();
            }
            final ajm a = mBackgroundTintHelper.a;
            a.b = b;
            a.a = true;
            mBackgroundTintHelper.a();
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList d) {
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper.d == null) {
            mTextHelper.d = new ajm();
        }
        final ajm d2 = mTextHelper.d;
        d2.d = d;
        d2.c = (d != null);
        mTextHelper.m();
        this.mTextHelper.e();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode b) {
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper.d == null) {
            mTextHelper.d = new ajm();
        }
        final ajm d = mTextHelper.d;
        d.b = b;
        d.a = (b != null);
        mTextHelper.m();
        this.mTextHelper.e();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.h(context, n);
        }
    }
    
    public void setTextSize(final int n, final float n2) {
        if (qc.b) {
            super.setTextSize(n, n2);
            return;
        }
        final ld mTextHelper = this.mTextHelper;
        if (mTextHelper != null) {
            mTextHelper.n(n, n2);
        }
    }
}

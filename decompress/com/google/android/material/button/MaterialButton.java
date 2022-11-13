// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.graphics.Paint;
import java.util.Iterator;
import android.util.Log;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.graphics.Rect;
import android.widget.TextView;
import java.io.Serializable;
import android.widget.CompoundButton;
import android.widget.Button;
import android.content.res.TypedArray;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.util.LinkedHashSet;
import android.widget.Checkable;
import android.support.v7.widget.AppCompatButton;

public class MaterialButton extends AppCompatButton implements Checkable, adyx
{
    private static final int[] d;
    private static final int[] e;
    public final adtw a;
    public boolean b;
    public afhd c;
    private final LinkedHashSet f;
    private PorterDuff$Mode g;
    private ColorStateList h;
    private Drawable i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private int o;
    
    static {
        d = new int[] { 16842911 };
        e = new int[] { 16842912 };
    }
    
    public MaterialButton(final Context context) {
        this(context, null);
    }
    
    public MaterialButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969835);
    }
    
    public MaterialButton(final Context context, final AttributeSet set, int g) {
        super(aeba.a(context, set, g, 2132085168), set, g);
        this.f = new LinkedHashSet();
        this.b = false;
        this.n = false;
        final Context context2 = this.getContext();
        final TypedArray a = adwh.a(context2, set, adua.a, g, 2132085168, new int[0]);
        this.m = a.getDimensionPixelSize(12, 0);
        this.g = adds.K(a.getInt(15, -1), PorterDuff$Mode.SRC_IN);
        this.h = adds.z(this.getContext(), a, 14);
        this.i = adds.A(this.getContext(), a, 10);
        this.o = a.getInteger(11, 1);
        this.j = a.getDimensionPixelSize(13, 0);
        final adtw a2 = new adtw(this, adym.c(context2, set, g, 2132085168).a());
        this.a = a2;
        a2.c = a.getDimensionPixelOffset(1, 0);
        a2.d = a.getDimensionPixelOffset(2, 0);
        a2.e = a.getDimensionPixelOffset(3, 0);
        a2.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            g = a.getDimensionPixelSize(8, -1);
            a2.g = g;
            a2.e(a2.b.f((float)g));
        }
        a2.h = a.getDimensionPixelSize(20, 0);
        a2.i = adds.K(a.getInt(7, -1), PorterDuff$Mode.SRC_IN);
        a2.j = adds.z(a2.a.getContext(), a, 6);
        a2.k = adds.z(a2.a.getContext(), a, 19);
        a2.l = adds.z(a2.a.getContext(), a, 16);
        a2.p = a.getBoolean(5, false);
        a2.s = a.getDimensionPixelSize(9, 0);
        a2.q = a.getBoolean(21, true);
        final int j = anb.j((View)a2.a);
        final int paddingTop = a2.a.getPaddingTop();
        final int i = anb.i((View)a2.a);
        final int paddingBottom = a2.a.getPaddingBottom();
        if (a.hasValue(0)) {
            a2.d();
        }
        else {
            final MaterialButton a3 = a2.a;
            final adyh adyh = new adyh(a2.b);
            adyh.m(a2.a.getContext());
            aiq.g((Drawable)adyh, a2.j);
            final PorterDuff$Mode k = a2.i;
            if (k != null) {
                aiq.h((Drawable)adyh, k);
            }
            adyh.t((float)a2.h, a2.k);
            final adyh adyh2 = new adyh(a2.b);
            adyh2.setTint(0);
            final float n = (float)a2.h;
            if (a2.n) {
                g = adds.U((View)a2.a, 2130969109);
            }
            else {
                g = 0;
            }
            adyh2.s(n, g);
            aiq.f(a2.m = (Drawable)new adyh(a2.b), -1);
            a3.setBackgroundDrawable((Drawable)(a2.r = (LayerDrawable)new RippleDrawable(adxz.b(a2.l), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[] { (Drawable)adyh2, (Drawable)adyh }), a2.c, a2.e, a2.d, a2.f), a2.m)));
            final adyh a4 = a2.a();
            if (a4 != null) {
                a4.n((float)a2.s);
                a4.setState(a2.a.getDrawableState());
            }
        }
        anb.ab((View)a2.a, j + a2.c, paddingTop + a2.e, i + a2.d, paddingBottom + a2.f);
        a.recycle();
        this.setCompoundDrawablePadding(this.m);
        this.h(this.i != null);
    }
    
    private final String a() {
        Serializable s;
        if (!this.e()) {
            s = Button.class;
        }
        else {
            s = CompoundButton.class;
        }
        return ((Class)s).getName();
    }
    
    private final void g() {
        if (this.k()) {
            apt.d((TextView)this, this.i, (Drawable)null, (Drawable)null, (Drawable)null);
            return;
        }
        if (this.j()) {
            apt.d((TextView)this, (Drawable)null, (Drawable)null, this.i, (Drawable)null);
            return;
        }
        if (this.l()) {
            apt.d((TextView)this, (Drawable)null, this.i, (Drawable)null, (Drawable)null);
        }
    }
    
    private final void h(final boolean b) {
        final Drawable i = this.i;
        if (i != null) {
            aiq.g(this.i = i.mutate(), this.h);
            final PorterDuff$Mode g = this.g;
            if (g != null) {
                aiq.h(this.i, g);
            }
            int n;
            if ((n = this.j) == 0) {
                n = this.i.getIntrinsicWidth();
            }
            int n2;
            if ((n2 = this.j) == 0) {
                n2 = this.i.getIntrinsicHeight();
            }
            final Drawable j = this.i;
            final int k = this.k;
            final int l = this.l;
            j.setBounds(k, l, n + k, n2 + l);
            this.i.setVisible(true, b);
        }
        if (!b) {
            final Drawable[] h = apt.h((TextView)this);
            final Drawable drawable = h[0];
            final Drawable drawable2 = h[1];
            final Drawable drawable3 = h[2];
            if ((this.k() && drawable != this.i) || (this.j() && drawable3 != this.i) || (this.l() && drawable2 != this.i)) {
                this.g();
            }
            return;
        }
        this.g();
    }
    
    private final void i(int l, int n) {
        if (this.i != null) {
            if (this.getLayout() != null) {
                final boolean k = this.k();
                final int n2 = 1;
                if (!k && !this.j()) {
                    if (this.l()) {
                        this.k = 0;
                        if (this.o == 16) {
                            this.l = 0;
                            this.h(false);
                            return;
                        }
                        if ((l = this.j) == 0) {
                            l = this.i.getIntrinsicHeight();
                        }
                        int n3;
                        if (this.getLineCount() > 1) {
                            n3 = this.getLayout().getHeight();
                        }
                        else {
                            final TextPaint paint = this.getPaint();
                            String s2;
                            final String s = s2 = this.getText().toString();
                            if (this.getTransformationMethod() != null) {
                                s2 = this.getTransformationMethod().getTransformation((CharSequence)s, (View)this).toString();
                            }
                            final Rect rect = new Rect();
                            ((Paint)paint).getTextBounds(s2, 0, s2.length(), rect);
                            n3 = Math.min(rect.height(), this.getLayout().getHeight());
                        }
                        l = Math.max(0, (n - n3 - this.getPaddingTop() - l - this.m - this.getPaddingBottom()) / 2);
                        if (this.l != l) {
                            this.l = l;
                            this.h(false);
                        }
                    }
                }
                else {
                    this.l = 0;
                    n = this.getTextAlignment();
                    Layout$Alignment layout$Alignment = null;
                    Label_0332: {
                        Label_0293: {
                            if (n != 1) {
                                if (n == 6 || n == 3) {
                                    break Label_0293;
                                }
                                if (n != 4) {
                                    layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                                    break Label_0332;
                                }
                            }
                            else {
                                n = (this.getGravity() & 0x800007);
                                if (n != 1) {
                                    if (n != 5 && n != 8388613) {
                                        layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                                        break Label_0332;
                                    }
                                    break Label_0293;
                                }
                            }
                            layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                            break Label_0332;
                        }
                        layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                    }
                    n = this.o;
                    if (n == 1 || n == 3 || (n == 2 && layout$Alignment == Layout$Alignment.ALIGN_NORMAL) || (this.o == 4 && layout$Alignment == Layout$Alignment.ALIGN_OPPOSITE)) {
                        this.k = 0;
                        this.h(false);
                        return;
                    }
                    if ((n = this.j) == 0) {
                        n = this.i.getIntrinsicWidth();
                    }
                    final int lineCount = this.getLineCount();
                    float max = 0.0f;
                    for (int i = 0; i < lineCount; ++i) {
                        max = Math.max(max, this.getLayout().getLineWidth(i));
                    }
                    n = (l = l - (int)Math.ceil(max) - anb.i((View)this) - n - this.m - anb.j((View)this));
                    if (layout$Alignment == Layout$Alignment.ALIGN_CENTER) {
                        l = n / 2;
                    }
                    if (anb.f((View)this) != 1) {
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                    int n4 = n2;
                    if (this.o != 4) {
                        n4 = 0;
                    }
                    int j = l;
                    if (n != n4) {
                        j = -l;
                    }
                    if (this.k != j) {
                        this.k = j;
                        this.h(false);
                    }
                }
            }
        }
    }
    
    private final boolean j() {
        final int o = this.o;
        return o == 3 || o == 4;
    }
    
    private final boolean k() {
        final int o = this.o;
        return o == 1 || o == 2;
    }
    
    private final boolean l() {
        final int o = this.o;
        return o == 16 || o == 32;
    }
    
    public final int b() {
        if (this.f()) {
            return this.a.h;
        }
        return 0;
    }
    
    public final adym c() {
        if (this.f()) {
            return this.a.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }
    
    public final boolean e() {
        final adtw a = this.a;
        return a != null && a.p;
    }
    
    public final boolean f() {
        final adtw a = this.a;
        return a != null && !a.o;
    }
    
    public final ColorStateList getBackgroundTintList() {
        ColorStateList list;
        if (this.f()) {
            list = this.a.j;
        }
        else {
            list = super.getSupportBackgroundTintList();
        }
        return list;
    }
    
    public final PorterDuff$Mode getBackgroundTintMode() {
        PorterDuff$Mode porterDuff$Mode;
        if (this.f()) {
            porterDuff$Mode = this.a.i;
        }
        else {
            porterDuff$Mode = super.getSupportBackgroundTintMode();
        }
        return porterDuff$Mode;
    }
    
    public final ColorStateList getSupportBackgroundTintList() {
        if (this.f()) {
            return this.a.j;
        }
        return super.getSupportBackgroundTintList();
    }
    
    public final PorterDuff$Mode getSupportBackgroundTintMode() {
        if (this.f()) {
            return this.a.i;
        }
        return super.getSupportBackgroundTintMode();
    }
    
    public final boolean isChecked() {
        return this.b;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f()) {
            adyf.g((View)this, this.a.a());
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.e()) {
            mergeDrawableStates(onCreateDrawableState, MaterialButton.d);
        }
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, MaterialButton.e);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)this.a());
        accessibilityEvent.setChecked(this.b);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.a());
        accessibilityNodeInfo.setCheckable(this.e());
        accessibilityNodeInfo.setChecked(this.b);
        accessibilityNodeInfo.setClickable(this.isClickable());
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof MaterialButton$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final MaterialButton$SavedState materialButton$SavedState = (MaterialButton$SavedState)parcelable;
        super.onRestoreInstanceState(materialButton$SavedState.d);
        this.setChecked(materialButton$SavedState.a);
    }
    
    public final Parcelable onSaveInstanceState() {
        final MaterialButton$SavedState materialButton$SavedState = new MaterialButton$SavedState(super.onSaveInstanceState());
        materialButton$SavedState.a = this.b;
        return (Parcelable)materialButton$SavedState;
    }
    
    protected final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final boolean performClick() {
        if (this.a.q) {
            this.toggle();
        }
        return super.performClick();
    }
    
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null && this.i.setState(this.getDrawableState())) {
            this.invalidate();
        }
    }
    
    public final void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void setBackgroundColor(final int n) {
        if (this.f()) {
            final adtw a = this.a;
            if (a.a() != null) {
                a.a().setTint(n);
            }
            return;
        }
        super.setBackgroundColor(n);
    }
    
    public final void setBackgroundDrawable(final Drawable drawable) {
        if (!this.f()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable != this.getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.a.d();
            super.setBackgroundDrawable(drawable);
            return;
        }
        this.getBackground().setState(drawable.getState());
    }
    
    public final void setBackgroundResource(final int n) {
        Drawable b;
        if (n != 0) {
            b = fc.b(this.getContext(), n);
        }
        else {
            b = null;
        }
        this.setBackgroundDrawable(b);
    }
    
    public final void setBackgroundTintList(final ColorStateList supportBackgroundTintList) {
        this.setSupportBackgroundTintList(supportBackgroundTintList);
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode supportBackgroundTintMode) {
        this.setSupportBackgroundTintMode(supportBackgroundTintMode);
    }
    
    public final void setChecked(final boolean b) {
        if (this.e() && this.isEnabled() && this.b != b) {
            this.b = b;
            this.refreshDrawableState();
            if (this.getParent() instanceof MaterialButtonToggleGroup) {
                final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup)this.getParent();
                final boolean b2 = this.b;
                if (!materialButtonToggleGroup.a) {
                    materialButtonToggleGroup.a(this.getId(), b2);
                }
            }
            if (this.n) {
                return;
            }
            this.n = true;
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                ((adtv)iterator.next()).a();
            }
            this.n = false;
        }
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        if (this.f()) {
            this.a.a().n(elevation);
        }
    }
    
    public final void setPressed(final boolean pressed) {
        final afhd c = this.c;
        if (c != null) {
            ((MaterialButtonToggleGroup)c.a).invalidate();
        }
        super.setPressed(pressed);
    }
    
    public final void setSupportBackgroundTintList(final ColorStateList list) {
        if (this.f()) {
            final adtw a = this.a;
            if (a.j != list) {
                a.j = list;
                if (a.a() != null) {
                    aiq.g((Drawable)a.a(), a.j);
                }
            }
            return;
        }
        super.setSupportBackgroundTintList(list);
    }
    
    public final void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.f()) {
            final adtw a = this.a;
            if (a.i != porterDuff$Mode) {
                a.i = porterDuff$Mode;
                if (a.a() != null && a.i != null) {
                    aiq.h((Drawable)a.a(), a.i);
                }
            }
            return;
        }
        super.setSupportBackgroundTintMode(porterDuff$Mode);
    }
    
    public final void setTextAlignment(final int textAlignment) {
        super.setTextAlignment(textAlignment);
        this.i(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final void tn(final adym adym) {
        if (this.f()) {
            this.a.e(adym);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }
    
    public final void toggle() {
        this.setChecked(this.b ^ true);
    }
}

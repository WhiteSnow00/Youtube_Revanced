// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.Point;
import android.view.ViewParent;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatEditText;

public class TextInputEditText extends AppCompatEditText
{
    private final Rect a;
    private boolean b;
    
    public TextInputEditText(final Context context) {
        this(context, null);
    }
    
    public TextInputEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130969300);
    }
    
    public TextInputEditText(final Context context, final AttributeSet set, final int n) {
        super(aeba.a(context, set, n, 0), set, n);
        this.a = new Rect();
        final TypedArray a = adwh.a(context, set, aeau.b, n, 2132084679, new int[0]);
        this.b = a.getBoolean(0, false);
        a.recycle();
    }
    
    private final TextInputLayout b() {
        for (ViewParent viewParent = this.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    private final boolean c(final TextInputLayout textInputLayout) {
        return textInputLayout != null && this.b;
    }
    
    public final void getFocusedRect(final Rect rect) {
        super.getFocusedRect(rect);
        final TextInputLayout b = this.b();
        if (this.c(b) && rect != null) {
            b.getFocusedRect(this.a);
            rect.bottom = this.a.bottom;
        }
    }
    
    public final boolean getGlobalVisibleRect(final Rect rect, final Point point) {
        final TextInputLayout b = this.b();
        boolean b2;
        if (this.c(b)) {
            b2 = b.getGlobalVisibleRect(rect, point);
        }
        else {
            b2 = super.getGlobalVisibleRect(rect, point);
        }
        return b2;
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
        if (b != null && b.k && super.getHint() == null && adds.M()) {
            this.setHint((CharSequence)"");
        }
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            final TextInputLayout b = this.b();
            CharSequence e;
            if (b != null) {
                e = b.e();
            }
            else {
                e = null;
            }
            editorInfo.hintText = e;
        }
        return onCreateInputConnection;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b();
    }
    
    public final boolean requestRectangleOnScreen(final Rect rect) {
        final TextInputLayout b = this.b();
        if (this.c(b) && rect != null) {
            this.a.set(rect.left, rect.top, rect.right, rect.bottom + (b.getHeight() - this.getHeight()));
            return super.requestRectangleOnScreen(this.a);
        }
        return super.requestRectangleOnScreen(rect);
    }
}

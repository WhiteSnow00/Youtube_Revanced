// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.playlist;

import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.SpinnerAdapter;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;
import j$.util.Optional;
import android.app.Dialog;
import android.view.LayoutInflater;
import java.util.Map;
import android.widget.Spinner;

public class PrivacySpinner extends Spinner
{
    private static final Map e;
    private static final Map f;
    private static final Map g;
    public final LayoutInflater a;
    public Map b;
    public Dialog c;
    public Optional d;
    
    static {
        final HashMap e2 = new HashMap();
        (e = e2).put(glx.c, 2132020140);
        final glx a = glx.a;
        final Integer value = 2132020142;
        e2.put(a, value);
        final glx b = glx.b;
        final Integer value2 = 2132020144;
        e2.put(b, value2);
        final HashMap f2 = new HashMap();
        (f = f2).put(glx.c, 2132020145);
        f2.put(glx.a, value);
        f2.put(glx.b, value2);
        final HashMap g2 = new HashMap();
        (g = g2).put(glx.c, 2132019166);
        g2.put(glx.a, 2132019167);
        g2.put(glx.b, 2132019168);
    }
    
    public PrivacySpinner(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = Optional.empty();
        this.a = LayoutInflater.from(context);
        this.c(1);
    }
    
    public final glx a() {
        return (glx)this.getSelectedItem();
    }
    
    public final void b(final glx glx) {
        glx.getClass();
        this.setSelection(glx.ordinal());
    }
    
    public final void c(int n) {
        final glx a = glx.a;
        Label_0042: {
            Map b;
            if (--n != 0) {
                if (n != 1) {
                    this.b = PrivacySpinner.g;
                    break Label_0042;
                }
                b = PrivacySpinner.f;
            }
            else {
                b = PrivacySpinner.e;
            }
            this.b = b;
        }
        this.setAdapter((SpinnerAdapter)new gjf(this));
    }
    
    public final int d() {
        final glx a = this.a();
        final glx a2 = glx.a;
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown privacy status: ".concat(String.valueOf(String.valueOf(a))));
    }
    
    public final void e(int n) {
        final glx a = glx.a;
        if (n == 0) {
            throw null;
        }
        if (--n == 1) {
            this.b(glx.a);
            return;
        }
        if (n != 2) {
            this.b(glx.c);
            return;
        }
        this.b(glx.b);
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.getLayoutParams();
        this.setDropDownWidth(n - viewGroup$MarginLayoutParams.leftMargin - viewGroup$MarginLayoutParams.rightMargin);
    }
    
    public final boolean performClick() {
        final Dialog c = this.c;
        if (c != null) {
            final View currentFocus = c.getCurrentFocus();
            if (currentFocus != null) {
                tpe.p(currentFocus);
            }
        }
        else {
            tpe.o(tpe.F(this.getContext()));
        }
        return super.performClick();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.account.verification.ui;

import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.content.res.Resources$Theme;
import android.view.ViewGroup$LayoutParams;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class CodeInputView extends RelativeLayout implements View$OnClickListener, rnm
{
    public CodeInputEditText[] a;
    public rno b;
    public boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private View[] j;
    private int k;
    
    public CodeInputView(final Context context) {
        super(context);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        this.j(context, null, 0);
    }
    
    public CodeInputView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        this.j(context, set, 0);
    }
    
    public CodeInputView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        this.j(context, set, n);
    }
    
    public static final int i(final CodeInputEditText codeInputEditText) {
        adkp.I(codeInputEditText.getTag() instanceof Integer, "Digit tag should be an integer.");
        return (int)codeInputEditText.getTag();
    }
    
    private final void j(final Context context, AttributeSet obtainStyledAttributes, int length) {
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(2131624196, (ViewGroup)this, true);
        final Resources$Theme theme = context.getTheme();
        final int[] a = rnx.a;
        final int n = 0;
        obtainStyledAttributes = (AttributeSet)theme.obtainStyledAttributes(obtainStyledAttributes, a, length, 0);
        try {
            this.d = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(1, -1);
            this.e = ((TypedArray)obtainStyledAttributes).getColor(0, -1);
            this.f = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(4, -1);
            this.g = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(5, -1);
            this.h = ((TypedArray)obtainStyledAttributes).getColor(2, -1);
            this.i = ((TypedArray)obtainStyledAttributes).getColor(3, -1);
            ((TypedArray)obtainStyledAttributes).recycle();
            final ViewGroup viewGroup = (ViewGroup)this.findViewById(2131428674);
            final ViewGroup viewGroup2 = (ViewGroup)this.findViewById(2131428677);
            final ViewGroup viewGroup3 = (ViewGroup)this.findViewById(2131428676);
            final ViewGroup viewGroup4 = (ViewGroup)this.findViewById(2131428673);
            final ViewGroup viewGroup5 = (ViewGroup)this.findViewById(2131428672);
            obtainStyledAttributes = (AttributeSet)this.findViewById(2131428675);
            this.a[0] = (CodeInputEditText)viewGroup.findViewById(2131428671);
            this.a[1] = (CodeInputEditText)viewGroup2.findViewById(2131428671);
            this.a[2] = (CodeInputEditText)viewGroup3.findViewById(2131428671);
            this.a[3] = (CodeInputEditText)viewGroup4.findViewById(2131428671);
            this.a[4] = (CodeInputEditText)viewGroup5.findViewById(2131428671);
            this.a[5] = (CodeInputEditText)((ViewGroup)obtainStyledAttributes).findViewById(2131428671);
            this.j[0] = viewGroup.findViewById(2131432220);
            this.j[1] = viewGroup2.findViewById(2131432220);
            this.j[2] = viewGroup3.findViewById(2131432220);
            this.j[3] = viewGroup4.findViewById(2131432220);
            this.j[4] = viewGroup5.findViewById(2131432220);
            this.j[5] = ((ViewGroup)obtainStyledAttributes).findViewById(2131432220);
            length = 0;
            int n2;
            while (true) {
                final CodeInputEditText[] a2 = this.a;
                final int length2 = a2.length;
                n2 = n;
                if (length >= 6) {
                    break;
                }
                a2[length].setTag((Object)length);
                this.a[length].setTextColor(this.e);
                this.a[length].setTextSize((float)this.d);
                this.a[length].addTextChangedListener((TextWatcher)new rnn(this, length));
                this.a[length].a = (rnm)this;
                ++length;
            }
            while (true) {
                final View[] j = this.j;
                length = j.length;
                if (n2 >= 6) {
                    break;
                }
                j[n2].setBackgroundColor(this.i);
                tpe.aF(this.j[n2], tpe.at(this.g), (Class)ViewGroup$LayoutParams.class);
                ++n2;
            }
            this.setOnClickListener((View$OnClickListener)this);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
            while (true) {}
        }
    }
    
    public final void a(final CodeInputEditText codeInputEditText) {
        if (!this.c) {
            return;
        }
        final int i = i(codeInputEditText);
        if (i > 0) {
            int n;
            if ((n = i) == 5) {
                if (codeInputEditText.getText().length() > 0) {
                    this.d(5);
                    return;
                }
                n = 5;
            }
            this.d(n - 1);
        }
    }
    
    public final String b() {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        while (true) {
            final CodeInputEditText[] a = this.a;
            final int length = a.length;
            if (n >= 6) {
                break;
            }
            sb.append(a[n].getText().toString().trim());
            ++n;
        }
        return sb.toString();
    }
    
    public final void c() {
        final Context context = this.getContext();
        if (context != null) {
            ((InputMethodManager)context.getSystemService("input_method")).hideSoftInputFromWindow(this.a[this.k].getWindowToken(), 0);
        }
    }
    
    public final void d(final int n) {
        boolean b = false;
        if (n >= 0) {
            b = b;
            if (n < 6) {
                b = true;
            }
        }
        adkp.H(b);
        this.e(n);
        final CodeInputEditText codeInputEditText = this.a[n];
        codeInputEditText.requestFocus();
        codeInputEditText.setSelection(codeInputEditText.getText().length());
        if (n == 5 && codeInputEditText.getText().length() != 0) {
            return;
        }
        this.f(n);
    }
    
    public final void e(final int k) {
        boolean b = false;
        if (k >= 0) {
            b = b;
            if (k < 6) {
                b = true;
            }
        }
        adkp.H(b);
        this.k = k;
    }
    
    public final void f(final int n) {
        int n2 = 0;
        while (true) {
            final View[] j = this.j;
            final int length = j.length;
            if (n2 >= 6) {
                break;
            }
            final View view = j[n2];
            int backgroundColor;
            if (n2 == n) {
                backgroundColor = this.h;
            }
            else {
                backgroundColor = this.i;
            }
            view.setBackgroundColor(backgroundColor);
            int n3;
            if (n2 == n) {
                n3 = this.f;
            }
            else {
                n3 = this.g;
            }
            tpe.aF(this.j[n2], tpe.at(n3), (Class)ViewGroup$LayoutParams.class);
            ++n2;
        }
    }
    
    public final void g(final String s) {
        final int length = s.length();
        int i = 0;
        adkp.H(length <= 6);
        final int length2 = this.a.length;
        adkp.H(true);
        this.c = false;
        while (i < s.length()) {
            final CodeInputEditText codeInputEditText = this.a[i];
            final int n = i + 1;
            codeInputEditText.setText((CharSequence)s.substring(i, n));
            i = n;
        }
        this.c = true;
    }
    
    public final void h() {
        if (!this.a[this.k].isFocused()) {
            this.d(this.k);
        }
        final Context context = this.getContext();
        if (context != null) {
            ((InputMethodManager)context.getSystemService("input_method")).showSoftInput((View)this.a[this.k], 0);
        }
    }
    
    public final void onClick(final View view) {
        this.h();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return true;
    }
    
    public final void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        int n = 0;
        while (true) {
            final CodeInputEditText[] a = this.a;
            final int length = a.length;
            if (n >= 6) {
                break;
            }
            a[n].setEnabled(enabled);
            this.j[n].setEnabled(enabled);
            ++n;
        }
    }
}

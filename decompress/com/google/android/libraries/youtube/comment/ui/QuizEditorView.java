// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import android.text.Spanned;
import android.text.TextWatcher;
import android.view.View$OnFocusChangeListener;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import j$.util.Optional;
import android.widget.LinearLayout;

public class QuizEditorView extends LinearLayout
{
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Optional f;
    public anrf g;
    public Optional h;
    public Optional i;
    public Optional j;
    public Optional k;
    
    public QuizEditorView(final Context context) {
        super(context);
        this.c = -1;
        this.d = 0;
        this.e = false;
        this.f = Optional.empty();
        this.g = anrf.a;
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.j(context);
    }
    
    public QuizEditorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = -1;
        this.d = 0;
        this.e = false;
        this.f = Optional.empty();
        this.g = anrf.a;
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.j(context);
    }
    
    public QuizEditorView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = -1;
        this.d = 0;
        this.e = false;
        this.f = Optional.empty();
        this.g = anrf.a;
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.j(context);
    }
    
    private final View h(final int n) {
        return this.getChildAt(n).findViewById(2131428964);
    }
    
    private final EditText i(final int n) {
        return (EditText)this.getChildAt(n).findViewById(2131428966);
    }
    
    private final void j(final Context context) {
        this.a = tpe.cx(context, 2130970926).orElse(0);
        this.b = tpe.cr(context, 2130970903);
    }
    
    public final int a(final View view) {
        for (int i = 0; i < this.d; ++i) {
            if (this.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }
    
    public final View b(final int n) {
        return this.getChildAt(n).findViewById(2131429726);
    }
    
    public final View c(final int n) {
        return this.getChildAt(n).findViewById(2131429727);
    }
    
    public final EditText d(final int n) {
        return (EditText)this.getChildAt(n).findViewById(2131430196);
    }
    
    public final TextView e(final int n) {
        return (TextView)this.getChildAt(n).findViewById(2131428965);
    }
    
    public final void f(final ssm ssm) {
        final int d = this.d;
        final int n = 0;
        adkp.R(d + 1 > 0 && !this.h.isEmpty(), "The create option button must be added to the view before adding options");
        if (this.d >= this.g.g) {
            return;
        }
        final View inflate = LayoutInflater.from(this.getContext()).inflate(2131625177, (ViewGroup)this, false);
        final View viewById = inflate.findViewById(2131431145);
        final View viewById2 = inflate.findViewById(2131429726);
        final TextView textView = (TextView)inflate.findViewById(2131430194);
        final EditText editText = (EditText)inflate.findViewById(2131430196);
        final TextView textView2 = (TextView)inflate.findViewById(2131428965);
        final EditText editText2 = (EditText)inflate.findViewById(2131428966);
        editText.setText((CharSequence)ssm.a);
        editText2.setText((CharSequence)ssm.b);
        if (this.f.isPresent()) {
            viewById2.setOnClickListener((View$OnClickListener)new suf(this, inflate, 8));
        }
        final anrf g = this.g;
        final int b = g.b;
        final ajut ajut = null;
        ajut ajut2;
        if ((b & 0x2) != 0x0) {
            if ((ajut2 = g.d) == null) {
                ajut2 = ajut.a;
            }
        }
        else {
            ajut2 = null;
        }
        final Spanned b2 = acak.b(ajut2);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            final String string = b2.toString();
            final int d2 = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" ");
            sb.append(d2 + 1);
            editText.setHint((CharSequence)sb.toString());
        }
        final anrf g2 = this.g;
        ajut ajut3 = ajut;
        if ((g2.b & 0x4) != 0x0 && (ajut3 = g2.e) == null) {
            ajut3 = ajut.a;
        }
        final Spanned b3 = acak.b(ajut3);
        if (!TextUtils.isEmpty((CharSequence)b3)) {
            editText2.setHint((CharSequence)b3);
        }
        if (this.g.i > 0) {
            editText.setOnFocusChangeListener((View$OnFocusChangeListener)new svl(this, textView, 1));
            editText.addTextChangedListener((TextWatcher)new svk(this, inflate, editText2, viewById2));
        }
        if (this.g.k > 0) {
            editText2.setOnFocusChangeListener((View$OnFocusChangeListener)new svl(this, textView2, 0));
            editText2.addTextChangedListener((TextWatcher)new svm(this, inflate, editText, viewById2));
        }
        viewById.setOnClickListener((View$OnClickListener)new suf(this, inflate, 9));
        this.addView(inflate, this.d);
        ++this.d;
        int i = n;
        if (ssm.c) {
            this.g(this.a(inflate));
            i = n;
        }
        while (i < this.d) {
            if (!TextUtils.isEmpty((CharSequence)this.d(i).getText().toString())) {
                editText.requestFocus();
                return;
            }
            ++i;
        }
    }
    
    public final void g(int i) {
        if (i >= 0) {
            final int d = this.d;
            if (i < d) {
                final int c = this.c;
                final String s = "";
                boolean b = true;
                final int n = 0;
                String string = s;
                if (c >= 0) {
                    string = s;
                    if (c < d) {
                        final EditText j = this.i(c);
                        tpe.v(this.h(this.c), false);
                        tpe.v(this.b(this.c), true);
                        tpe.v(this.c(this.c), false);
                        string = j.getText().toString();
                        j.setText((CharSequence)"");
                        tpe.v((View)this.e(this.c), false);
                    }
                }
                tpe.v(this.h(i), true);
                tpe.v(this.b(i), false);
                tpe.v(this.c(i), true);
                this.i(i).setText((CharSequence)string);
                final TextView e = this.e(i);
                if (string.length() <= this.g.k) {
                    b = false;
                }
                tpe.v((View)e, b);
                this.c = i;
                for (i = n; i < this.d; ++i) {
                    this.d(i).clearFocus();
                    this.i(i).clearFocus();
                }
            }
        }
    }
}

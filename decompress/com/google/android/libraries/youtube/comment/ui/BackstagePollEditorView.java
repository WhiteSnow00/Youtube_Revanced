// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.comment.ui;

import java.util.Iterator;
import android.text.Spanned;
import android.view.View;
import android.os.Handler;
import android.text.TextWatcher;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import android.util.AttributeSet;
import android.content.Context;
import j$.util.Optional;
import android.widget.TextView;
import android.widget.LinearLayout;

public class BackstagePollEditorView extends LinearLayout
{
    public ankw a;
    public TextView b;
    public Optional c;
    public xra d;
    private int e;
    private int f;
    
    public BackstagePollEditorView(final Context context) {
        super(context);
        this.c = Optional.empty();
        this.e(context);
    }
    
    public BackstagePollEditorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = Optional.empty();
        this.e(context);
    }
    
    public BackstagePollEditorView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = Optional.empty();
        this.e(context);
    }
    
    private final void e(final Context context) {
        this.setOrientation(1);
        this.setGravity(8388611);
        this.e = tpe.cx(context, 2130970926).orElse(0);
        this.f = tpe.cr(context, 2130970903);
    }
    
    public final List a() {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < this.getChildCount() - 1; ++i) {
            list.add(((EditText)this.getChildAt(i).findViewById(2131430196)).getText().toString().trim());
        }
        return list;
    }
    
    public final void b(final String text) {
        adkp.R(this.getChildCount() > 0 && this.b != null, "The create option button must be added to the view before adding options");
        if (this.getChildCount() - 1 >= this.a.f) {
            return;
        }
        final View inflate = LayoutInflater.from(this.getContext()).inflate(2131624072, (ViewGroup)this, false);
        final View viewById = inflate.findViewById(2131431145);
        final TextView textView = (TextView)inflate.findViewById(2131428167);
        final EditText editText = (EditText)inflate.findViewById(2131430196);
        editText.setText((CharSequence)text);
        this.d(text.length(), textView);
        viewById.setOnClickListener((View$OnClickListener)new qvy(this, inflate, 18));
        final ankw a = this.a;
        ajut ajut;
        if ((a.b & 0x2) != 0x0) {
            if ((ajut = a.d) == null) {
                ajut = ajut.a;
            }
        }
        else {
            ajut = null;
        }
        final Spanned b = acak.b(ajut);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            editText.setHint((CharSequence)b);
        }
        if (this.a.h > 0) {
            editText.addTextChangedListener((TextWatcher)new hdw(this, textView, 3));
        }
        final Iterator iterator = this.a().iterator();
        while (iterator.hasNext()) {
            if (!TextUtils.isEmpty((CharSequence)iterator.next())) {
                editText.requestFocus();
                if (tsy.e(this.getContext())) {
                    new Handler().postDelayed((Runnable)new srv(editText, 3), 500L);
                    break;
                }
                break;
            }
        }
        this.addView(inflate, this.getChildCount() - 1);
        if (this.getChildCount() - 1 >= this.a.f) {
            tpe.v((View)this.b, false);
        }
    }
    
    public final void c() {
        this.removeAllViews();
        this.b = null;
    }
    
    public final void d(int textColor, final TextView textView) {
        String string;
        if (textColor > 0) {
            final int h = this.a.h;
            final StringBuilder sb = new StringBuilder();
            sb.append(textColor);
            sb.append(" / ");
            sb.append(h);
            string = sb.toString();
        }
        else {
            string = "";
        }
        textView.setText((CharSequence)string);
        if (textColor > this.a.h) {
            textColor = this.f;
        }
        else {
            textColor = this.e;
        }
        textView.setTextColor(textColor);
    }
}

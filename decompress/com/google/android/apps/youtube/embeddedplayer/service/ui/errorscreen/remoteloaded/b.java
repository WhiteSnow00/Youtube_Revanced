// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.content.Context;
import android.text.Spanned;

public final class b extends abcq
{
    public Spanned a;
    public CharSequence b;
    public boolean c;
    public boolean d;
    public oqz e;
    private String f;
    
    public b(final Context context) {
        super(context);
    }
    
    private final void m(final TextView textView) {
        if (!this.c) {
            textView.setAutoLinkMask(15);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
    
    private final void n(final Context context, final FrameLayout frameLayout) {
        if (this.mm()) {
            String f;
            if (tqf.bm(context)) {
                f = context.getString(2132019936);
            }
            else {
                f = context.getString(2132017710);
            }
            this.f = f;
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            final CharSequence b = this.b;
            final String s = "";
            CharSequence charSequence = b;
            if (b == null) {
                charSequence = "";
            }
            final SpannableStringBuilder append = spannableStringBuilder.append(charSequence);
            String concat = s;
            if (this.c) {
                concat = "\n\n".concat(String.valueOf(this.f));
            }
            final SpannableStringBuilder append2 = append.append((CharSequence)concat);
            final TextView textView = (TextView)frameLayout.findViewById(2131430600);
            textView.setText((CharSequence)append2);
            this.m(textView);
        }
        if (!this.mm()) {
            return;
        }
        if (this.a == null) {
            ((TextView)frameLayout.findViewById(2131432449)).setVisibility(8);
            return;
        }
        adme.K(this.c ^ true);
        final TextView textView2 = (TextView)frameLayout.findViewById(2131432449);
        textView2.setText((CharSequence)this.a);
        textView2.setVisibility(0);
        this.m(textView2);
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final /* bridge */ View c(final Context context) {
        final LayoutInflater from = LayoutInflater.from(context);
        final a a = new a(this, context);
        from.inflate(2131624391, (ViewGroup)a);
        this.n(context, a);
        return (View)a;
    }
    
    public final /* bridge */ void e(final Context context, final View view) {
        final FrameLayout frameLayout = (FrameLayout)view;
        if (this.ab(1)) {
            this.n(context, frameLayout);
        }
    }
    
    public final boolean oW() {
        return this.d;
    }
}

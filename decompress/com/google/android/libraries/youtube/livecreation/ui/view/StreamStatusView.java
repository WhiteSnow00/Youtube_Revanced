// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.livecreation.ui.view;

import android.text.TextUtils;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.LinearLayout;

public class StreamStatusView extends LinearLayout
{
    public TextView a;
    private wiw b;
    private String c;
    private LinearLayout d;
    private FrameLayout e;
    private Chronometer f;
    private TextView g;
    private TextView h;
    private TextView i;
    private View j;
    private View k;
    private View l;
    
    public StreamStatusView(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = wiw.a;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(2131624654, (ViewGroup)this);
    }
    
    public final void a() {
        this.b(SystemClock.elapsedRealtime());
    }
    
    public final void b(final long base) {
        this.f.stop();
        this.f.setBase(base);
    }
    
    public final void c(wiw a, final String c) {
        String.valueOf(a);
        String.valueOf(this.b);
        this.b = a;
        this.c = c;
        final boolean b = TextUtils.equals((CharSequence)c, (CharSequence)this.getContext().getString(2132018234)) && !TextUtils.isEmpty((CharSequence)this.c);
        a = wiw.a;
        final int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            this.d.setVisibility(8);
            if (b) {
                this.i.setText((CharSequence)this.c);
            }
            else {
                this.i.setText(2132018322);
            }
            this.e.setVisibility(0);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        this.d.setVisibility(8);
        if (b) {
            this.i.setText((CharSequence)this.c);
        }
        else {
            this.i.setText(2132018320);
        }
        this.e.setVisibility(0);
    }
    
    public final void d(final String text) {
        this.h.setText((CharSequence)text);
        int n;
        if (!TextUtils.isEmpty((CharSequence)text)) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.h.setVisibility(n);
        this.l.setVisibility(n);
    }
    
    public final void e(final String text) {
        this.g.setText((CharSequence)text);
        int n;
        if (!TextUtils.isEmpty((CharSequence)text)) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.g.setVisibility(n);
        this.k.setVisibility(n);
    }
    
    public final void f(final String text) {
        this.a.setText((CharSequence)text);
        int n;
        if (!TextUtils.isEmpty((CharSequence)text)) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.a.setVisibility(n);
        this.j.setVisibility(n);
    }
    
    public final void g(final long base) {
        this.f.setBase(base);
        this.f.start();
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (LinearLayout)this.findViewById(2131429225);
        this.f = (Chronometer)this.findViewById(2131431771);
        this.j = this.findViewById(2131431788);
        this.a = (TextView)this.findViewById(2131431787);
        this.g = (TextView)this.findViewById(2131431785);
        this.h = (TextView)this.findViewById(2131431887);
        this.k = this.findViewById(2131431786);
        this.l = this.findViewById(2131431888);
        this.e = (FrameLayout)this.findViewById(2131430621);
        this.i = (TextView)this.findViewById(2131431784);
        this.c(this.b, this.c);
    }
}

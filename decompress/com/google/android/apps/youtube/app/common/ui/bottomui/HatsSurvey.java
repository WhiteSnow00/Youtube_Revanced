// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.Space;
import java.util.List;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.GridLayout;

public class HatsSurvey extends GridLayout
{
    TextView c;
    public ViewGroup d;
    View e;
    TextView f;
    View g;
    
    public HatsSurvey(final Context context) {
        super(context);
    }
    
    public HatsSurvey(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public HatsSurvey(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected boolean c() {
        return false;
    }
    
    public final void d(final CharSequence charSequence) {
        tpe.t(this.c, charSequence);
    }
    
    public final void e(final List list) {
        this.d.removeAllViews();
        for (int i = 0; i < list.size(); ++i) {
            this.d.addView((View)list.get(i));
            if (this.c() && i < list.size() - 1) {
                final ViewGroup d = this.d;
                final Space space = new Space(this.getContext());
                space.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, 0, 1.0f));
                d.addView((View)space);
            }
        }
    }
    
    public final void f(final aicz aicz, final View$OnClickListener onClickListener) {
        final boolean b = aicz != null;
        tpe.v(this.e, b);
        tpe.v((View)this.f, b);
        tpe.v(this.g, b);
        if (aicz != null) {
            final TextView f = this.f;
            ajut ajut;
            if ((ajut = aicz.i) == null) {
                ajut = ajut.a;
            }
            f.setText((CharSequence)acak.b(ajut));
            this.f.setOnClickListener(onClickListener);
        }
    }
    
    public final void g(final boolean b) {
        if (this.f.isClickable() == b) {
            return;
        }
        this.f.setClickable(b);
        this.f.setFocusable(b);
        final TextView f = this.f;
        final Context context = this.getContext();
        int n;
        if (b) {
            n = 2130970852;
        }
        else {
            n = 2130970865;
        }
        f.setTextColor(tpe.cr(context, n));
        final TextView f2 = this.f;
        Drawable cu;
        if (b) {
            cu = tpe.cu(this.getContext(), 2130970231);
        }
        else {
            cu = null;
        }
        f2.setBackground(cu);
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView)this.findViewById(2131429193);
        this.e = this.findViewById(2131429180);
        this.f = (TextView)this.findViewById(2131429190);
        this.g = this.findViewById(2131429191);
        this.d = (ViewGroup)this.findViewById(2131429194);
    }
}

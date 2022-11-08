// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.util.DisplayMetrics;

public class MainAppEngagementPanelDataProvider implements tff, uut
{
    public final osb a;
    public final DisplayMetrics b;
    public alvp c;
    public final agza d;
    private final utk e;
    private View$OnLayoutChangeListener f;
    private View g;
    private String h;
    
    public MainAppEngagementPanelDataProvider(final Context context, final osb a, final utk e) {
        this.b = context.getResources().getDisplayMetrics();
        this.a = a;
        this.e = e;
        this.d = ((agzi)alvp.a).createBuilder();
    }
    
    public final void mM(final aum aum) {
        this.e.E().j((uut)this);
        this.c = null;
        this.g = null;
        this.h = null;
    }
    
    public final void mq(final aum aum) {
        this.e.E().i((uut)this);
        this.f = (View$OnLayoutChangeListener)new jbw(this, 11);
    }
    
    public final void pw(final utd utd) {
        final View$OnLayoutChangeListener f = this.f;
        f.getClass();
        final View g = this.g;
        if (g != null) {
            g.removeOnLayoutChangeListener(f);
        }
        final String s = null;
        View g2;
        if (utd != null) {
            final View a = utd.a();
            if ((g2 = a) != null) {
                a.addOnLayoutChangeListener(f);
                g2 = a;
            }
        }
        else {
            g2 = null;
        }
        this.g = g2;
        String w = s;
        if (utd != null) {
            w = s;
            if (utd.C() != null) {
                w = vem.w(utd.C());
            }
        }
        final String h = this.h;
        if (h != null) {
            this.d.bj(h, false);
        }
        if (w != null) {
            this.d.bj(w, true);
        }
        final alvp c = (alvp)this.d.build();
        this.c = c;
        this.a.b("/youtube/app/engagement_panel", ((agxl)c).toByteArray());
        this.h = w;
    }
}

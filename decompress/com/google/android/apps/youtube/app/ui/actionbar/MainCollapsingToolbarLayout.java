// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.ui.actionbar;

import android.view.View;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.RecyclerView;

public class MainCollapsingToolbarLayout extends adqt
{
    public fyx a;
    public boolean b;
    public fzh c;
    private RecyclerView j;
    private boolean k;
    private iw l;
    
    public MainCollapsingToolbarLayout(final Context context) {
        super(context);
        this.c = fzh.a().a();
        this.l = new jwm(this);
    }
    
    public MainCollapsingToolbarLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = fzh.a().a();
        this.l = new jwm(this);
    }
    
    public MainCollapsingToolbarLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = fzh.a().a();
        this.l = new jwm(this);
    }
    
    private final boolean p() {
        if (this.a.s() && (super.f != null || super.g != null)) {
            final RecyclerView j = this.j;
            if (j != null && j.getChildCount() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void a(final boolean k) {
        this.m(this.k = k);
    }
    
    public final void b(final RecyclerView j) {
        final RecyclerView i = this.j;
        if (i == j) {
            this.d(false);
            return;
        }
        if (i != null) {
            i.aH(this.l);
        }
        if ((this.j = j) != null) {
            j.aE(this.l);
            this.d(false);
        }
    }
    
    public final void c(boolean b, final boolean b2) {
        if (this.p()) {
            final int k = ((LinearLayoutManager)this.j.n).K();
            boolean b3 = true;
            Label_0076: {
                if (k <= 0) {
                    final View child = this.j.getChildAt(0);
                    final int n = child.getHeight() * 3 / 4;
                    final int bottom = child.getBottom();
                    if (bottom <= 0 || bottom > n) {
                        b = false;
                        break Label_0076;
                    }
                }
                b = true;
            }
            if (this.getParent() instanceof ElevatedAppBarLayout) {
                ((ElevatedAppBarLayout)this.getParent()).b(b ^ true);
            }
            if (!this.k || b) {
                b3 = false;
            }
            this.m(b3);
        }
        super.c(this.b = b, b2);
    }
    
    public final boolean d(final boolean b) {
        if (this.p()) {
            this.c(false, b);
            return true;
        }
        return false;
    }
    
    public final int e() {
        return this.c.c;
    }
}

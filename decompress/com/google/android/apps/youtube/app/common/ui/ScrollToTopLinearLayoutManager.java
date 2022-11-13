// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.rendering.ui.OverScrollLinearLayoutManager;

public class ScrollToTopLinearLayoutManager extends OverScrollLinearLayoutManager implements acrl
{
    public int a;
    public boolean b;
    
    public ScrollToTopLinearLayoutManager() {
        this.b = true;
    }
    
    public final void aO(final RecyclerView recyclerView) {
        this.a = 0;
    }
    
    public final boolean af() {
        return this.b && super.af();
    }
    
    public final void ao(final RecyclerView recyclerView, final int n) {
        this.c(recyclerView, n, 0);
    }
    
    public final void c(final RecyclerView recyclerView, final int b, final int n) {
        final fys fys = new fys(this, recyclerView.getContext(), Math.abs(b - ((LinearLayoutManager)this).J()) <= 2, n);
        ((oj)fys).b = b;
        ((nw)this).bf((oj)fys);
    }
    
    public final int e(int e, final oc oc, final ok ok) {
        e = super.e(e, oc, ok);
        this.a += e;
        return e;
    }
    
    public final void o(final oc oc, final ok ok) {
        try {
            super.o(oc, ok);
        }
        catch (final ClassCastException ex) {
            final View ac = ((nw)this).aC();
            if (ac != null && ac.getLayoutParams() != null && !(ac.getLayoutParams() instanceof nx)) {
                final String string = ac.toString();
                final String name = ac.getLayoutParams().getClass().getName();
                final String value = String.valueOf(ac.getParent());
                final StringBuilder sb = new StringBuilder("UnsafeLayoutParams.\nFOCUSED VIEW: ");
                sb.append(string);
                sb.append(" LayoutParams:");
                sb.append(name);
                sb.append("\nPARENT  VIEW: ");
                sb.append(value);
                sb.append("\n");
                final boolean g = zlm.g(zll.b, zlk.y, sb.toString(), (Throwable)ex, 0.05000000074505806);
                if (ac.getParent() instanceof ViewGroup) {
                    ((ViewGroup)ac.getParent()).clearFocus();
                    try {
                        super.o(oc, ok);
                        return;
                    }
                    catch (final ClassCastException ex2) {
                        if (g) {
                            zlm.c(zll.b, zlk.y, "UnsafeLayoutParams clear focus and retry layout failed.\n", (Throwable)ex2);
                        }
                        throw ex2;
                    }
                }
                throw ex;
            }
            throw ex;
        }
    }
}

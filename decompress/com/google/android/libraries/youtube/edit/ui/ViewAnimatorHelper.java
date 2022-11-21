// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.ui;

import android.view.View;
import android.view.ViewStub;
import android.util.AttributeSet;
import android.content.Context;
import android.util.SparseArray;
import android.widget.ViewAnimator;

public class ViewAnimatorHelper extends ViewAnimator
{
    private final SparseArray a;
    
    public ViewAnimatorHelper(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new SparseArray();
    }
    
    public final int a() {
        return this.getChildAt(this.getDisplayedChild()).getId();
    }
    
    public final void b(final int id) {
        Object child = null;
        int i;
        for (i = 0; i < this.getChildCount(); ++i) {
            child = this.getChildAt(i);
            if (((View)child).getId() == id) {
                break;
            }
        }
        if (child != null) {
            View inflate = (View)child;
            if (child instanceof ViewStub) {
                final View view = inflate = ((ViewStub)child).inflate();
                if (view.getId() == -1) {
                    view.setId(id);
                    inflate = view;
                }
            }
            this.setDisplayedChild(i);
            final tui tui = (tui)this.a.get(id);
            if (tui != null) {
                tui.a((Object)inflate);
            }
            return;
        }
        throw new IllegalArgumentException(String.format("No such child with id: %s", id));
    }
    
    public final void c(final int n, final tui tui) {
        this.a.put(n, (Object)tui);
    }
}

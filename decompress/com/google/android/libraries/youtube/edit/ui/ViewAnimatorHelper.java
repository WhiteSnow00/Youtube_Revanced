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
        ViewStub child = null;
        int i;
        View view;
        for (i = 0; i < this.getChildCount(); ++i, child = (ViewStub)view) {
            view = (View)(child = (ViewStub)this.getChildAt(i));
            if (view.getId() == id) {
                break;
            }
        }
        if (child != null) {
            Object inflate = child;
            if (child instanceof ViewStub) {
                final View view2 = (View)(inflate = child.inflate());
                if (view2.getId() == -1) {
                    view2.setId(id);
                    inflate = view2;
                }
            }
            this.setDisplayedChild(i);
            final trb trb = (trb)this.a.get(id);
            if (trb != null) {
                trb.a(inflate);
            }
            return;
        }
        throw new IllegalArgumentException(String.format("No such child with id: %s", id));
    }
    
    public final void c(final int n, final trb trb) {
        this.a.put(n, (Object)trb);
    }
}

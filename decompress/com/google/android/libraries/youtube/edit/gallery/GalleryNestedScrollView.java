// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.edit.gallery;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.widget.NestedScrollView;

public class GalleryNestedScrollView extends NestedScrollView
{
    public usl d;
    public int e;
    
    public GalleryNestedScrollView(final Context context) {
        this(context, null);
    }
    
    public GalleryNestedScrollView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public GalleryNestedScrollView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.e = 0;
    }
    
    public final void c(final int n) {
        if (n > 0) {
            this.w(false);
        }
        else {
            this.x();
        }
        anc.H((View)this);
    }
    
    public final boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (n2 > 0.0f) {
            this.w(true);
        }
        else {
            final usl d = this.d;
            if (d != null) {
                d.n();
            }
        }
        return false;
    }
    
    public final void onNestedPreScroll(final View view, int n, final int n2, final int[] array) {
        n = this.getScrollY();
        if (n2 > 0) {
            final int e = this.e;
            if (n < e) {
                n = Math.min(e - n, n2);
                this.scrollBy(0, n);
                array[1] = n;
            }
        }
    }
    
    public final void stopNestedScroll() {
        super.stopNestedScroll();
        final usl d = this.d;
        if (d != null) {
            d.n();
        }
    }
    
    public final void w(final boolean b) {
        if (b) {
            this.i(0, this.e);
            return;
        }
        this.scrollTo(0, this.e);
    }
    
    public final void x() {
        this.scrollTo(0, 0);
    }
}

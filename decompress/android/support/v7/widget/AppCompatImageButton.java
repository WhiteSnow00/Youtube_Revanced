// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton
{
    private final kb a;
    private boolean b;
    private final arhz c;
    
    public AppCompatImageButton(final Context context) {
        this(context, null);
    }
    
    public AppCompatImageButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969557);
    }
    
    public AppCompatImageButton(final Context context, final AttributeSet set, final int n) {
        pp.a(context);
        super(context, set, n);
        this.b = false;
        pn.d((View)this, this.getContext());
        (this.a = new kb((View)this)).b(set, n);
        (this.c = new arhz((ImageView)this)).n(set, n);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final kb a = this.a;
        if (a != null) {
            a.a();
        }
        final arhz c = this.c;
        if (c != null) {
            c.m();
        }
    }
    
    public final boolean hasOverlappingRendering() {
        return this.c.q() && super.hasOverlappingRendering();
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final kb a = this.a;
        if (a != null) {
            a.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final kb a = this.a;
        if (a != null) {
            a.c(backgroundResource);
        }
    }
    
    public final void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final arhz c = this.c;
        if (c != null) {
            c.m();
        }
    }
    
    public final void setImageDrawable(final Drawable imageDrawable) {
        final arhz c = this.c;
        if (c != null && imageDrawable != null && !this.b) {
            c.o(imageDrawable);
        }
        super.setImageDrawable(imageDrawable);
        final arhz c2 = this.c;
        if (c2 != null) {
            c2.m();
            if (!this.b) {
                this.c.l();
            }
        }
    }
    
    public final void setImageLevel(final int imageLevel) {
        super.setImageLevel(imageLevel);
        this.b = true;
    }
    
    public final void setImageResource(final int n) {
        this.c.p(n);
    }
    
    public final void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        final arhz c = this.c;
        if (c != null) {
            c.m();
        }
    }
}

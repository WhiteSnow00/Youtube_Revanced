import android.graphics.Outline;
import android.view.Gravity;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiw extends aix
{
    public aiw(final Resources resources, final Bitmap bitmap) {
        super(resources, bitmap);
    }
    
    public final void a(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        Gravity.apply(n, n2, n3, rect, rect2, 0);
    }
    
    public final void getOutline(final Outline outline) {
        this.b();
        outline.setRoundRect(this.c, super.b);
    }
}

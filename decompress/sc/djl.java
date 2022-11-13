import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class djl implements ddt
{
    public final dfy b(final Context context, final dfy dfy, int height, final int n) {
        if (!dph.q(height, n)) {
            final StringBuilder sb = new StringBuilder("Cannot apply transformation on width: ");
            sb.append(height);
            sb.append(" or height: ");
            sb.append(n);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        final dgg a = dbp.b(context).a;
        final Bitmap bitmap = (Bitmap)dfy.c();
        int width;
        if ((width = height) == Integer.MIN_VALUE) {
            width = bitmap.getWidth();
        }
        if ((height = n) == Integer.MIN_VALUE) {
            height = bitmap.getHeight();
        }
        final Bitmap c = this.c(a, bitmap, width, height);
        if (bitmap.equals(c)) {
            return dfy;
        }
        return djk.f(c, a);
    }
    
    protected abstract Bitmap c(final dgg p0, final Bitmap p1, final int p2, final int p3);
}

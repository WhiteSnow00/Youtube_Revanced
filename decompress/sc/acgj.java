import android.graphics.Bitmap;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgj implements tcc
{
    private final tcc a;
    
    public acgj(final tcc a) {
        this.a = a;
    }
    
    public final /* bridge */ void b(final Object o, final Object o2) {
        final Uri uri = (Uri)o;
        final Bitmap bitmap = (Bitmap)o2;
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final double n = width;
        final double n2 = height;
        Double.isNaN(n);
        Double.isNaN(n2);
        final double n3 = n / n2;
        int n4;
        int n5;
        if (n3 < 0.5625) {
            Double.isNaN(n);
            n4 = (int)(n / 0.5625);
            n5 = width;
        }
        else {
            if (n3 > 0.5625) {
                Double.isNaN(n2);
                n5 = (int)(n2 * 0.5625);
            }
            else {
                n5 = width;
            }
            n4 = height;
        }
        Bitmap bitmap2 = null;
        Label_0158: {
            if (n5 == width) {
                bitmap2 = bitmap;
                if (n4 == height) {
                    break Label_0158;
                }
            }
            bitmap2 = Bitmap.createBitmap(bitmap, (width - n5) / 2, (height - n4) / 2, n5, n4);
        }
        this.a.b((Object)uri, (Object)bitmap2);
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        this.a.sd((Object)o, ex);
    }
}

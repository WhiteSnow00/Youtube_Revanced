import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class hqm extends tpg
{
    final hqo a;
    private final Rect b;
    
    public hqm(final hqo a) {
        this.a = a;
        this.b = new Rect();
    }
    
    public final void a(final ImageView imageView, final Bitmap bitmap) {
        final hqo a = this.a;
        Bitmap bitmap2 = bitmap;
        Label_0191: {
            if (imageView != a.e) {
                final aotp h = a.h;
                if (h != null && h.f) {
                    bitmap2 = bitmap;
                }
                else {
                    final int width = bitmap.getWidth();
                    final double n = width;
                    final int height = bitmap.getHeight();
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
                    if (n5 == width) {
                        bitmap2 = bitmap;
                        if (n4 == height) {
                            break Label_0191;
                        }
                    }
                    bitmap2 = Bitmap.createBitmap(bitmap, (width - n5) / 2, (height - n4) / 2, n5, n4);
                }
            }
        }
        imageView.setImageBitmap(bitmap2);
        final double n6 = bitmap2.getHeight();
        final double n7 = bitmap2.getWidth();
        imageView.getWindowVisibleDisplayFrame(this.b);
        final double n8 = this.b.height();
        final double n9 = this.b.width();
        final hqo a2 = this.a;
        if (a2.j) {
            imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
            return;
        }
        Double.isNaN(n6);
        Double.isNaN(n7);
        final double n10 = n6 / n7;
        final answ answ = (answ)a2.b.a();
        if (answ != null && (answ.b & 0x10000000) != 0x0 && answ.t && this.a.i && n10 > 1.5) {
            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
            return;
        }
        if (this.a.i) {
            Double.isNaN(n8);
            Double.isNaN(n9);
            if (n10 < n8 / n9) {
                imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
                return;
            }
        }
        imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
    }
}

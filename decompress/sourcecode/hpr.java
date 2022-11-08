import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class hpr extends tna
{
    final /* synthetic */ hpt a;
    private final Rect b;
    
    public hpr(final hpt a) {
        this.a = a;
        this.b = new Rect();
    }
    
    public final void a(final ImageView imageView, final Bitmap bitmap) {
        final hpt a = this.a;
        Bitmap bitmap2 = bitmap;
        Label_0197: {
            if (imageView != a.e) {
                final aorm h = a.h;
                if (h != null && h.f) {
                    bitmap2 = bitmap;
                }
                else {
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
                    final int n6 = (width - n5) / 2;
                    final int n7 = (height - n4) / 2;
                    if (n5 == width) {
                        bitmap2 = bitmap;
                        if (n4 == height) {
                            break Label_0197;
                        }
                    }
                    bitmap2 = Bitmap.createBitmap(bitmap, n6, n7, n5, n4);
                }
            }
        }
        imageView.setImageBitmap(bitmap2);
        final double n8 = bitmap2.getHeight();
        final double n9 = bitmap2.getWidth();
        Double.isNaN(n8);
        Double.isNaN(n9);
        final double n10 = n8 / n9;
        imageView.getWindowVisibleDisplayFrame(this.b);
        final double n11 = this.b.height();
        final double n12 = this.b.width();
        Double.isNaN(n11);
        Double.isNaN(n12);
        final double n13 = n11 / n12;
        final hpt a2 = this.a;
        if (a2.j) {
            imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
            return;
        }
        final anqt anqt = (anqt)a2.b.a();
        if (anqt != null && (anqt.b & 0x10000000) != 0x0 && anqt.t && this.a.i && n10 > 1.5) {
            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
            return;
        }
        if (this.a.i && n10 < n13) {
            imageView.setScaleType(ImageView$ScaleType.FIT_CENTER);
            return;
        }
        imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
    }
}

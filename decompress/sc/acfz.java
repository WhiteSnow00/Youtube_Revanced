import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfz implements zjp
{
    private final int a;
    private final Bitmap$Config b;
    
    public acfz() {
        this.a = 0;
        this.b = Bitmap$Config.ARGB_8888;
    }
    
    public acfz(final int a, final Bitmap$Config b) {
        adkp.I(a > 0, (Object)"desiredWidth must be > 0");
        this.a = a;
        this.b = b;
    }
    
    public final Bitmap a(final byte[] array) {
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(array, 0, array.length, bitmapFactory$Options);
        Bitmap decodeByteArray;
        if (bitmapFactory$Options.outWidth < 0) {
            decodeByteArray = null;
        }
        else {
            final int a = this.a;
            int inSampleSize;
            if (a == 0) {
                inSampleSize = 1;
            }
            else {
                int outWidth = bitmapFactory$Options.outWidth;
                int n = 1;
                while (true) {
                    final int n2 = outWidth >> 1;
                    inSampleSize = n;
                    if (n2 < a) {
                        break;
                    }
                    n += n;
                    outWidth = n2;
                }
            }
            bitmapFactory$Options.inSampleSize = inSampleSize;
            bitmapFactory$Options.inJustDecodeBounds = false;
            bitmapFactory$Options.inPreferredConfig = this.b;
            bitmapFactory$Options.inPurgeable = true;
            bitmapFactory$Options.inInputShareable = false;
            decodeByteArray = BitmapFactory.decodeByteArray(array, 0, array.length, bitmapFactory$Options);
        }
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new twc("failed to decode bitmap");
    }
    
    public final /* bridge */ Object d(final Object o) {
        return this.a((byte[])o);
    }
}

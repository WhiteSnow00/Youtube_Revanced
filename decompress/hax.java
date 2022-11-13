import android.graphics.Bitmap$CompressFormat;
import java.io.File;
import android.graphics.Bitmap;
import java.io.IOException;
import android.provider.MediaStore$Images$Media;
import android.graphics.ImageDecoder;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hax implements Callable
{
    public final uby a;
    public final DeviceLocalFile b;
    public final ContentResolver c;
    public final int d;
    public final int e;
    
    public hax(final uby a, final DeviceLocalFile b, final ContentResolver c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object call() {
        final uby a = this.a;
        final DeviceLocalFile b = this.b;
        final ContentResolver c = this.c;
        final int d = this.d;
        final int e = this.e;
        final Object o = null;
        Object o2;
        if (a == null) {
            o2 = o;
        }
        else {
            Bitmap scaledBitmap = null;
            Block_5: {
                if (b.a() == 1 || b.a() == 2) {
                    Bitmap bitmap;
                    try {
                        if (Build$VERSION.SDK_INT >= 29) {
                            bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(c, b.f()));
                        }
                        else {
                            bitmap = MediaStore$Images$Media.getBitmap(c, b.f());
                        }
                    }
                    catch (final IOException ex) {
                        zlm.c(zll.a, zlk.f, "[ShortsCreation][Android][Camera]Failed loading image", (Throwable)ex);
                        bitmap = null;
                    }
                    final double n = d;
                    final double n2 = e;
                    Double.isNaN(n);
                    Double.isNaN(n2);
                    final Bitmap c2 = hcc.c(bitmap, n / n2);
                    if (c2 != null) {
                        scaledBitmap = Bitmap.createScaledBitmap(c2, e, d, true);
                        break Block_5;
                    }
                }
                scaledBitmap = null;
            }
            try {
                final File tempFile = File.createTempFile("green_screen_image", null, ((ucd)a).g());
                vdh.aA(scaledBitmap, tempFile, Bitmap$CompressFormat.PNG);
                if (scaledBitmap != null) {
                    scaledBitmap.recycle();
                }
                o2 = tempFile;
            }
            catch (final IOException ex2) {
                ttr.f("ShortsProject", "Error saving green screen background image", (Throwable)ex2);
                zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][ProjectState]Error saving green screen background image", (Throwable)ex2);
                o2 = o;
            }
        }
        return aezp.j(o2);
    }
}

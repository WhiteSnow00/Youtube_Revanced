import java.util.List;
import android.graphics.Bitmap;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcc
{
    public static aoeu a(final aiqj aiqj) {
        if (((ahbc)aiqj).ry((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            final ShortsCreationEndpointOuterClass$ShortsCreationEndpoint shortsCreationEndpointOuterClass$ShortsCreationEndpoint = (ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((ahbc)aiqj).rx((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint);
            if ((shortsCreationEndpointOuterClass$ShortsCreationEndpoint.b & 0x2) != 0x0) {
                aoeu aoeu;
                if ((aoeu = aoeu.b(shortsCreationEndpointOuterClass$ShortsCreationEndpoint.d)) == null) {
                    aoeu = aoeu.a;
                }
                return aoeu;
            }
            zlm.b(zll.a, zlk.f, "[ShortsCreation][Android][ProjectState]No creation surface specified");
        }
        else {
            zlm.b(zll.a, zlk.f, "[ShortsCreation][Android][ProjectState]No shorts creation endpoint specified");
        }
        return aoeu.a;
    }
    
    static boolean b(final aiqj aiqj) {
        return aiqj != null && ((ahbc)aiqj).ry((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint) && !((List)((ShortsCreationEndpointOuterClass$ShortsCreationEndpoint)((ahbc)aiqj).rx((ahaq)ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)).c).isEmpty();
    }
    
    public static Bitmap c(Bitmap bitmap, final double n) {
        if (bitmap == null) {
            return null;
        }
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final double n2 = height;
        final double n3 = width;
        Double.isNaN(n2);
        Double.isNaN(n3);
        int n4;
        int n5;
        if (n2 / n3 > n) {
            Double.isNaN(n3);
            n4 = (int)(n3 * n);
            n5 = width;
        }
        else {
            Double.isNaN(n2);
            n5 = (int)(n2 / n);
            n4 = height;
        }
        try {
            bitmap = Bitmap.createBitmap(bitmap, (width - n5) / 2, (height - n4) / 2, n5, n4);
            return bitmap;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            zlm.c(zll.b, zlk.f, "[ShortsCreation][Android][Camera]Out of memory when creating bitmap", (Throwable)outOfMemoryError);
            return null;
        }
    }
    
    public static int d(final long n) {
        final int n2 = (int)n;
        if (n == n2) {
            return n2;
        }
        throw new ArithmeticException();
    }
    
    public static void e(final Throwable t, final Throwable t2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t, t2);
        }
        catch (final Exception ex) {}
    }
}

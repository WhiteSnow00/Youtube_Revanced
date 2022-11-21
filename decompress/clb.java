import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clb
{
    public static boolean a(final Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
    
    public static boolean b(final int n, final int n2) {
        return n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE && n <= 512 && n2 <= 384;
    }
    
    public static boolean c(final Uri uri) {
        return uri.getPathSegments().contains("video");
    }
    
    public static int d(final List list, final InputStream inputStream, final dgi dgi) {
        if (inputStream == null) {
            return -1;
        }
        Object o = inputStream;
        if (!inputStream.markSupported()) {
            o = new dkq(inputStream, dgi);
        }
        ((InputStream)o).mark(5242880);
        return e(list, (ddl)new ddk((InputStream)o, dgi, 0));
    }
    
    public static int e(final List list, final ddl ddl) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final int a = ddl.a((ddh)list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }
    
    public static ImageHeaderParser$ImageType f(final List list, final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return h(list, (ddm)new ddi(byteBuffer, 0));
    }
    
    public static ImageHeaderParser$ImageType g(final List list, final InputStream inputStream, final dgi dgi) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        Object o = inputStream;
        if (!inputStream.markSupported()) {
            o = new dkq(inputStream, dgi);
        }
        ((InputStream)o).mark(5242880);
        return h(list, (ddm)new ddi((InputStream)o, 1));
    }
    
    public static ImageHeaderParser$ImageType h(final List list, final ddm ddm) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ImageHeaderParser$ImageType a = ddm.a((ddh)list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}

import java.io.InputStream;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djs implements ddd
{
    static final byte[] a;
    private static final int[] b;
    
    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    }
    
    private static final int e(final djq djq, final dgd dgd) {
        try {
            final int a = djq.a();
            if ((a & 0xFFD8) != 0xFFD8 && a != 19789) {
                if (a != 18761) {
                    return -1;
                }
            }
            while (true) {
                while (djq.d() == 255) {
                    final short d = djq.d();
                    if (d == 218) {
                        break;
                    }
                    if (d == 217) {
                        break;
                    }
                    final int n2;
                    final int n = n2 = djq.a() - 2;
                    if (d != 225) {
                        final long n3 = n;
                        if (djq.c(n3) != n3) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (n2 == -1) {
                            return -1;
                        }
                        final byte[] array = (byte[])dgd.a(n2, (Class)byte[].class);
                        try {
                            if (djq.b(array, n2) == n2 && n2 > djs.a.length) {
                                final int n4 = 0;
                                int n5 = 0;
                                while (true) {
                                    final byte[] a2 = djs.a;
                                    if (n5 >= a2.length) {
                                        final ByteBuffer byteBuffer = (ByteBuffer)ByteBuffer.wrap(array).order(ByteOrder.BIG_ENDIAN).limit(n2);
                                        final short e = ckx.e(6, byteBuffer);
                                        ByteOrder byteOrder;
                                        if (e != 18761) {
                                            if (e != 19789) {
                                                byteOrder = ByteOrder.BIG_ENDIAN;
                                            }
                                            else {
                                                byteOrder = ByteOrder.BIG_ENDIAN;
                                            }
                                        }
                                        else {
                                            byteOrder = ByteOrder.LITTLE_ENDIAN;
                                        }
                                        byteBuffer.order(byteOrder);
                                        final int n6 = ckx.d(10, byteBuffer) + 6;
                                        for (short e2 = ckx.e(n6, byteBuffer), n7 = (short)n4; n7 < e2; ++n7) {
                                            int n8 = n6 + 2 + n7 * 12;
                                            if (ckx.e(n8, byteBuffer) == 274) {
                                                final short e3 = ckx.e(n8 + 2, byteBuffer);
                                                if (e3 > 0 && e3 <= 12) {
                                                    final int d2 = ckx.d(n8 + 4, byteBuffer);
                                                    if (d2 >= 0) {
                                                        final int n9 = d2 + djs.b[e3];
                                                        if (n9 <= 4) {
                                                            n8 += 8;
                                                            if (n8 >= 0 && n8 <= byteBuffer.remaining() && n9 >= 0 && n9 + n8 <= byteBuffer.remaining()) {
                                                                return ckx.e(n8, byteBuffer);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (array[n5] != a2[n5]) {
                                        break;
                                    }
                                    ++n5;
                                }
                            }
                            return -1;
                        }
                        finally {
                            dgd.c((Object)array);
                        }
                    }
                }
                int n2 = -1;
                continue;
            }
        }
        catch (final djp djp) {
            return -1;
        }
    }
    
    private static final ImageHeaderParser$ImageType f(final djq djq) {
        try {
            final int a = djq.a();
            if (a == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            final int n = a << 8 | djq.d();
            if (n == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            final int n2 = n << 8 | djq.d();
            if (n2 == -1991225785) {
                djq.c(21L);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType;
                    if (djq.d() >= 3) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG_A;
                    }
                    else {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG;
                    }
                    return imageHeaderParser$ImageType;
                }
                catch (final djp djp) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (n2 != 1380533830) {
                if ((djq.a() << 16 | djq.a()) == 0x66747970) {
                    final int n3 = djq.a() << 16 | djq.a();
                    if (n3 != 1635150182) {
                        if (n3 != 1635150195) {
                            djq.c(4L);
                            int n4 = n2 - 16;
                            if (n4 % 4 == 0) {
                                for (int n5 = 0; n5 < 5 && n4 > 0; ++n5, n4 -= 4) {
                                    final int n6 = djq.a() << 16 | djq.a();
                                    if (n6 == 1635150182 || n6 == 1635150195) {
                                        return ImageHeaderParser$ImageType.AVIF;
                                    }
                                }
                                return ImageHeaderParser$ImageType.UNKNOWN;
                            }
                            return ImageHeaderParser$ImageType.UNKNOWN;
                        }
                    }
                    return ImageHeaderParser$ImageType.AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            djq.c(4L);
            if ((djq.a() << 16 | djq.a()) != 0x57454250) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n7 = djq.a() << 16 | djq.a();
            if ((n7 & 0xFFFFFF00) != 0x56503800) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n8 = n7 & 0xFF;
            if (n8 == 88) {
                djq.c(4L);
                final short d = djq.d();
                if ((d & 0x2) != 0x0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                if ((d & 0x10) != 0x0) {
                    return ImageHeaderParser$ImageType.WEBP_A;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            else {
                if (n8 == 76) {
                    djq.c(4L);
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType3;
                    if ((djq.d() & 0x8) != 0x0) {
                        imageHeaderParser$ImageType3 = ImageHeaderParser$ImageType.WEBP_A;
                    }
                    else {
                        imageHeaderParser$ImageType3 = ImageHeaderParser$ImageType.WEBP;
                    }
                    return imageHeaderParser$ImageType3;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
        }
        catch (final djp djp2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }
    
    public final int a(final InputStream inputStream, final dgd dgd) {
        cll.h((Object)inputStream);
        final djr djr = new djr(inputStream, 0);
        cll.h((Object)dgd);
        return e((djq)djr, dgd);
    }
    
    public final int b(final ByteBuffer byteBuffer, final dgd dgd) {
        cll.h((Object)byteBuffer);
        final djr djr = new djr(byteBuffer, 1);
        cll.h((Object)dgd);
        return e((djq)djr, dgd);
    }
    
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        cll.h((Object)inputStream);
        return f((djq)new djr(inputStream, 0));
    }
    
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        cll.h((Object)byteBuffer);
        return f((djq)new djr(byteBuffer, 1));
    }
}

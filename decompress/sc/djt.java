import java.io.InputStream;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djt implements dde
{
    static final byte[] a;
    private static final int[] b;
    
    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8 };
    }
    
    private static final int e(final djr djr, final dge dge) {
        try {
            final int a = djr.a();
            if ((a & 0xFFD8) != 0xFFD8 && a != 19789) {
                if (a != 18761) {
                    return -1;
                }
            }
            while (true) {
                while (djr.d() == 255) {
                    final short d = djr.d();
                    if (d == 218) {
                        break;
                    }
                    if (d == 217) {
                        break;
                    }
                    final int n2;
                    final int n = n2 = djr.a() - 2;
                    if (d != 225) {
                        final long n3 = n;
                        if (djr.c(n3) != n3) {
                            break;
                        }
                        continue;
                    }
                    else {
                        if (n2 == -1) {
                            return -1;
                        }
                        final byte[] array = (byte[])dge.a(n2, byte[].class);
                        try {
                            if (djr.b(array, n2) == n2 && n2 > djt.a.length) {
                                final int n4 = 0;
                                int n5 = 0;
                                while (true) {
                                    final byte[] a2 = djt.a;
                                    if (n5 >= a2.length) {
                                        final ByteBuffer byteBuffer = (ByteBuffer)ByteBuffer.wrap(array).order(ByteOrder.BIG_ENDIAN).limit(n2);
                                        final short e = cky.e(6, byteBuffer);
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
                                        final int n6 = cky.d(10, byteBuffer) + 6;
                                        for (short e2 = cky.e(n6, byteBuffer), n7 = (short)n4; n7 < e2; ++n7) {
                                            int n8 = n6 + 2 + n7 * 12;
                                            if (cky.e(n8, byteBuffer) == 274) {
                                                final short e3 = cky.e(n8 + 2, byteBuffer);
                                                if (e3 > 0 && e3 <= 12) {
                                                    final int d2 = cky.d(n8 + 4, byteBuffer);
                                                    if (d2 >= 0) {
                                                        final int n9 = d2 + djt.b[e3];
                                                        if (n9 <= 4) {
                                                            n8 += 8;
                                                            if (n8 >= 0 && n8 <= byteBuffer.remaining() && n9 >= 0 && n9 + n8 <= byteBuffer.remaining()) {
                                                                return cky.e(n8, byteBuffer);
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
                            dge.c(array);
                        }
                    }
                }
                int n2 = -1;
                continue;
            }
        }
        catch (final djq djq) {
            return -1;
        }
    }
    
    private static final ImageHeaderParser$ImageType f(final djr djr) {
        try {
            final int a = djr.a();
            if (a == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            final int n = a << 8 | djr.d();
            if (n == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            final int n2 = n << 8 | djr.d();
            if (n2 == -1991225785) {
                djr.c(21L);
                try {
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType;
                    if (djr.d() >= 3) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG_A;
                    }
                    else {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG;
                    }
                    return imageHeaderParser$ImageType;
                }
                catch (final djq djq) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (n2 != 1380533830) {
                if ((djr.a() << 16 | djr.a()) == 0x66747970) {
                    final int n3 = djr.a() << 16 | djr.a();
                    if (n3 != 1635150182) {
                        if (n3 != 1635150195) {
                            djr.c(4L);
                            int n4 = n2 - 16;
                            if (n4 % 4 == 0) {
                                for (int n5 = 0; n5 < 5 && n4 > 0; n4 -= 4, ++n5) {
                                    final int n6 = djr.a() << 16 | djr.a();
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
            djr.c(4L);
            if ((djr.a() << 16 | djr.a()) != 0x57454250) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n7 = djr.a() << 16 | djr.a();
            if ((n7 & 0xFFFFFF00) != 0x56503800) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            final int n8 = n7 & 0xFF;
            if (n8 == 88) {
                djr.c(4L);
                final short d = djr.d();
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
                    djr.c(4L);
                    ImageHeaderParser$ImageType imageHeaderParser$ImageType3;
                    if ((djr.d() & 0x8) != 0x0) {
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
        catch (final djq djq2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }
    
    @Override
    public final int a(final InputStream inputStream, final dge dge) {
        clm.h((Object)inputStream);
        final djs djs = new djs(inputStream, 0);
        clm.h((Object)dge);
        return e(djs, dge);
    }
    
    @Override
    public final int b(final ByteBuffer byteBuffer, final dge dge) {
        clm.h((Object)byteBuffer);
        final djs djs = new djs(byteBuffer, 1);
        clm.h((Object)dge);
        return e(djs, dge);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        clm.h((Object)inputStream);
        return f(new djs(inputStream, 0));
    }
    
    @Override
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        clm.h((Object)byteBuffer);
        return f(new djs(byteBuffer, 1));
    }
}

import android.util.Log;
import java.io.EOFException;
import java.util.zip.CRC32;
import java.io.IOException;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.regex.Pattern;
import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.util.Collection;
import java.util.Arrays;
import java.nio.ByteOrder;
import java.util.Set;
import android.content.res.AssetManager$AssetInputStream;
import java.io.FileDescriptor;
import java.util.HashSet;
import java.text.SimpleDateFormat;
import java.nio.charset.Charset;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ata
{
    private static final HashMap A;
    private static final byte[] B;
    private static final aerj[] N;
    private static final aerj[] O;
    private static final aerj[] P;
    private static final aerj[] Q;
    private static final aerj[] R;
    private static final aerj S;
    private static final aerj[] T;
    private static final aerj[] U;
    private static final aerj[] V;
    private static final aerj[] W;
    private static final aerj[] X;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final Charset g;
    static final byte[] h;
    static final aerj[][] i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static SimpleDateFormat v;
    private static SimpleDateFormat w;
    private static final HashMap[] x;
    private static final HashMap[] y;
    private static final HashSet z;
    private FileDescriptor C;
    private AssetManager$AssetInputStream D;
    private int E;
    private final HashMap[] F;
    private final Set G;
    private ByteOrder H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    private int M;
    
    static {
        final Integer value = 1;
        final Integer value2 = 3;
        final Integer value3 = 2;
        final Integer value4 = 8;
        Arrays.asList(value, 6, value2, value4);
        final Integer value5 = 7;
        final Integer value6 = 5;
        Arrays.asList(value3, value5, 4, value6);
        a = new int[] { 8, 8, 8 };
        b = new int[] { 8 };
        c = new byte[] { -1, -40, -1 };
        j = new byte[] { 102, 116, 121, 112 };
        k = new byte[] { 109, 105, 102, 49 };
        l = new byte[] { 104, 101, 105, 99 };
        m = new byte[] { 79, 76, 89, 77, 80, 0 };
        n = new byte[] { 79, 76, 89, 77, 80, 85, 83, 0, 73, 73 };
        o = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
        p = new byte[] { 101, 88, 73, 102 };
        q = new byte[] { 73, 72, 68, 82 };
        r = new byte[] { 73, 69, 78, 68 };
        s = new byte[] { 82, 73, 70, 70 };
        t = new byte[] { 87, 69, 66, 80 };
        u = new byte[] { 69, 88, 73, 70 };
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[] { "", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD" };
        e = new int[] { 0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1 };
        f = new byte[] { 65, 83, 67, 73, 73, 0, 0, 0 };
        final aerj[] array = N = new aerj[] { new aerj("NewSubfileType", 254, 4), new aerj("SubfileType", 255, 4), new aerj("ImageWidth", 256, 3, 4), new aerj("ImageLength", 257, 3, 4), new aerj("BitsPerSample", 258, 3), new aerj("Compression", 259, 3), new aerj("PhotometricInterpretation", 262, 3), new aerj("ImageDescription", 270, 2), new aerj("Make", 271, 2), new aerj("Model", 272, 2), new aerj("StripOffsets", 273, 3, 4), new aerj("Orientation", 274, 3), new aerj("SamplesPerPixel", 277, 3), new aerj("RowsPerStrip", 278, 3, 4), new aerj("StripByteCounts", 279, 3, 4), new aerj("XResolution", 282, 5), new aerj("YResolution", 283, 5), new aerj("PlanarConfiguration", 284, 3), new aerj("ResolutionUnit", 296, 3), new aerj("TransferFunction", 301, 3), new aerj("Software", 305, 2), new aerj("DateTime", 306, 2), new aerj("Artist", 315, 2), new aerj("WhitePoint", 318, 5), new aerj("PrimaryChromaticities", 319, 5), new aerj("SubIFDPointer", 330, 4), new aerj("JPEGInterchangeFormat", 513, 4), new aerj("JPEGInterchangeFormatLength", 514, 4), new aerj("YCbCrCoefficients", 529, 5), new aerj("YCbCrSubSampling", 530, 3), new aerj("YCbCrPositioning", 531, 3), new aerj("ReferenceBlackWhite", 532, 5), new aerj("Copyright", 33432, 2), new aerj("ExifIFDPointer", 34665, 4), new aerj("GPSInfoIFDPointer", 34853, 4), new aerj("SensorTopBorder", 4, 4), new aerj("SensorLeftBorder", 5, 4), new aerj("SensorBottomBorder", 6, 4), new aerj("SensorRightBorder", 7, 4), new aerj("ISO", 23, 3), new aerj("JpgFromRaw", 46, 7), new aerj("Xmp", 700, 1) };
        final aerj[] array2 = O = new aerj[] { new aerj("ExposureTime", 33434, 5), new aerj("FNumber", 33437, 5), new aerj("ExposureProgram", 34850, 3), new aerj("SpectralSensitivity", 34852, 2), new aerj("PhotographicSensitivity", 34855, 3), new aerj("OECF", 34856, 7), new aerj("SensitivityType", 34864, 3), new aerj("StandardOutputSensitivity", 34865, 4), new aerj("RecommendedExposureIndex", 34866, 4), new aerj("ISOSpeed", 34867, 4), new aerj("ISOSpeedLatitudeyyy", 34868, 4), new aerj("ISOSpeedLatitudezzz", 34869, 4), new aerj("ExifVersion", 36864, 2), new aerj("DateTimeOriginal", 36867, 2), new aerj("DateTimeDigitized", 36868, 2), new aerj("OffsetTime", 36880, 2), new aerj("OffsetTimeOriginal", 36881, 2), new aerj("OffsetTimeDigitized", 36882, 2), new aerj("ComponentsConfiguration", 37121, 7), new aerj("CompressedBitsPerPixel", 37122, 5), new aerj("ShutterSpeedValue", 37377, 10), new aerj("ApertureValue", 37378, 5), new aerj("BrightnessValue", 37379, 10), new aerj("ExposureBiasValue", 37380, 10), new aerj("MaxApertureValue", 37381, 5), new aerj("SubjectDistance", 37382, 5), new aerj("MeteringMode", 37383, 3), new aerj("LightSource", 37384, 3), new aerj("Flash", 37385, 3), new aerj("FocalLength", 37386, 5), new aerj("SubjectArea", 37396, 3), new aerj("MakerNote", 37500, 7), new aerj("UserComment", 37510, 7), new aerj("SubSecTime", 37520, 2), new aerj("SubSecTimeOriginal", 37521, 2), new aerj("SubSecTimeDigitized", 37522, 2), new aerj("FlashpixVersion", 40960, 7), new aerj("ColorSpace", 40961, 3), new aerj("PixelXDimension", 40962, 3, 4), new aerj("PixelYDimension", 40963, 3, 4), new aerj("RelatedSoundFile", 40964, 2), new aerj("InteroperabilityIFDPointer", 40965, 4), new aerj("FlashEnergy", 41483, 5), new aerj("SpatialFrequencyResponse", 41484, 7), new aerj("FocalPlaneXResolution", 41486, 5), new aerj("FocalPlaneYResolution", 41487, 5), new aerj("FocalPlaneResolutionUnit", 41488, 3), new aerj("SubjectLocation", 41492, 3), new aerj("ExposureIndex", 41493, 5), new aerj("SensingMethod", 41495, 3), new aerj("FileSource", 41728, 7), new aerj("SceneType", 41729, 7), new aerj("CFAPattern", 41730, 7), new aerj("CustomRendered", 41985, 3), new aerj("ExposureMode", 41986, 3), new aerj("WhiteBalance", 41987, 3), new aerj("DigitalZoomRatio", 41988, 5), new aerj("FocalLengthIn35mmFilm", 41989, 3), new aerj("SceneCaptureType", 41990, 3), new aerj("GainControl", 41991, 3), new aerj("Contrast", 41992, 3), new aerj("Saturation", 41993, 3), new aerj("Sharpness", 41994, 3), new aerj("DeviceSettingDescription", 41995, 7), new aerj("SubjectDistanceRange", 41996, 3), new aerj("ImageUniqueID", 42016, 2), new aerj("CameraOwnerName", 42032, 2), new aerj("BodySerialNumber", 42033, 2), new aerj("LensSpecification", 42034, 5), new aerj("LensMake", 42035, 2), new aerj("LensModel", 42036, 2), new aerj("Gamma", 42240, 5), new aerj("DNGVersion", 50706, 1), new aerj("DefaultCropSize", 50720, 3, 4) };
        final aerj[] array3 = P = new aerj[] { new aerj("GPSVersionID", 0, 1), new aerj("GPSLatitudeRef", 1, 2), new aerj("GPSLatitude", 2, 5, 10), new aerj("GPSLongitudeRef", 3, 2), new aerj("GPSLongitude", 4, 5, 10), new aerj("GPSAltitudeRef", 5, 1), new aerj("GPSAltitude", 6, 5), new aerj("GPSTimeStamp", 7, 5), new aerj("GPSSatellites", 8, 2), new aerj("GPSStatus", 9, 2), new aerj("GPSMeasureMode", 10, 2), new aerj("GPSDOP", 11, 5), new aerj("GPSSpeedRef", 12, 2), new aerj("GPSSpeed", 13, 5), new aerj("GPSTrackRef", 14, 2), new aerj("GPSTrack", 15, 5), new aerj("GPSImgDirectionRef", 16, 2), new aerj("GPSImgDirection", 17, 5), new aerj("GPSMapDatum", 18, 2), new aerj("GPSDestLatitudeRef", 19, 2), new aerj("GPSDestLatitude", 20, 5), new aerj("GPSDestLongitudeRef", 21, 2), new aerj("GPSDestLongitude", 22, 5), new aerj("GPSDestBearingRef", 23, 2), new aerj("GPSDestBearing", 24, 5), new aerj("GPSDestDistanceRef", 25, 2), new aerj("GPSDestDistance", 26, 5), new aerj("GPSProcessingMethod", 27, 7), new aerj("GPSAreaInformation", 28, 7), new aerj("GPSDateStamp", 29, 2), new aerj("GPSDifferential", 30, 3), new aerj("GPSHPositioningError", 31, 5) };
        final aerj[] array4 = Q = new aerj[] { new aerj("InteroperabilityIndex", 1, 2) };
        final aerj[] array5 = R = new aerj[] { new aerj("NewSubfileType", 254, 4), new aerj("SubfileType", 255, 4), new aerj("ThumbnailImageWidth", 256, 3, 4), new aerj("ThumbnailImageLength", 257, 3, 4), new aerj("BitsPerSample", 258, 3), new aerj("Compression", 259, 3), new aerj("PhotometricInterpretation", 262, 3), new aerj("ImageDescription", 270, 2), new aerj("Make", 271, 2), new aerj("Model", 272, 2), new aerj("StripOffsets", 273, 3, 4), new aerj("ThumbnailOrientation", 274, 3), new aerj("SamplesPerPixel", 277, 3), new aerj("RowsPerStrip", 278, 3, 4), new aerj("StripByteCounts", 279, 3, 4), new aerj("XResolution", 282, 5), new aerj("YResolution", 283, 5), new aerj("PlanarConfiguration", 284, 3), new aerj("ResolutionUnit", 296, 3), new aerj("TransferFunction", 301, 3), new aerj("Software", 305, 2), new aerj("DateTime", 306, 2), new aerj("Artist", 315, 2), new aerj("WhitePoint", 318, 5), new aerj("PrimaryChromaticities", 319, 5), new aerj("SubIFDPointer", 330, 4), new aerj("JPEGInterchangeFormat", 513, 4), new aerj("JPEGInterchangeFormatLength", 514, 4), new aerj("YCbCrCoefficients", 529, 5), new aerj("YCbCrSubSampling", 530, 3), new aerj("YCbCrPositioning", 531, 3), new aerj("ReferenceBlackWhite", 532, 5), new aerj("Copyright", 33432, 2), new aerj("ExifIFDPointer", 34665, 4), new aerj("GPSInfoIFDPointer", 34853, 4), new aerj("DNGVersion", 50706, 1), new aerj("DefaultCropSize", 50720, 3, 4) };
        S = new aerj("StripOffsets", 273, 3);
        i = new aerj[][] { array, array2, array3, array4, array5, array, T = new aerj[] { new aerj("ThumbnailImage", 256, 7), new aerj("CameraSettingsIFDPointer", 8224, 4), new aerj("ImageProcessingIFDPointer", 8256, 4) }, U = new aerj[] { new aerj("PreviewImageStart", 257, 4), new aerj("PreviewImageLength", 258, 4) }, V = new aerj[] { new aerj("AspectFrame", 4371, 3) }, W = new aerj[] { new aerj("ColorSpace", 55, 3) } };
        X = new aerj[] { new aerj("SubIFDPointer", 330, 4), new aerj("ExifIFDPointer", 34665, 4), new aerj("GPSInfoIFDPointer", 34853, 4), new aerj("InteroperabilityIFDPointer", 40965, 4), new aerj("CameraSettingsIFDPointer", 8224, 1), new aerj("ImageProcessingIFDPointer", 8256, 1) };
        x = new HashMap[10];
        y = new HashMap[10];
        z = new HashSet((Collection<? extends E>)Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        A = new HashMap();
        final Charset charset = g = Charset.forName("US-ASCII");
        h = "Exif\u0000\u0000".getBytes(charset);
        B = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset);
        (ata.v = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        (ata.w = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int n2 = 0;
        while (true) {
            final aerj[][] i2 = ata.i;
            final int length = i2.length;
            if (n2 >= 10) {
                break;
            }
            ata.x[n2] = new HashMap();
            ata.y[n2] = new HashMap();
            for (final aerj aerj : i2[n2]) {
                ata.x[n2].put(aerj.b, aerj);
                ata.y[n2].put(aerj.d, aerj);
            }
            ++n2;
        }
        final HashMap a2 = ata.A;
        final aerj[] x2 = ata.X;
        a2.put(x2[0].b, value6);
        a2.put(x2[1].b, value);
        a2.put(x2[2].b, value3);
        a2.put(x2[3].b, value2);
        a2.put(x2[4].b, value5);
        a2.put(x2[5].b, value4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }
    
    public ata(final InputStream inputStream) {
        final int length = ata.i.length;
        this.F = new HashMap[10];
        this.G = new HashSet(10);
        this.H = ByteOrder.BIG_ENDIAN;
        Label_0125: {
            if (inputStream == null) {
                break Label_0125;
            }
        Label_0109_Outer:
            while (true) {
                if (inputStream instanceof AssetManager$AssetInputStream) {
                    this.D = (AssetManager$AssetInputStream)inputStream;
                    this.C = null;
                    break Label_0119;
                }
                while (true) {
                    if (!(inputStream instanceof FileInputStream)) {
                        break Label_0109;
                    }
                    final FileInputStream fileInputStream = (FileInputStream)inputStream;
                    final FileDescriptor fd = fileInputStream.getFD();
                    try {
                        atb.a(fd, 0L, OsConstants.SEEK_CUR);
                        this.D = null;
                        this.C = fileInputStream.getFD();
                        this.j(inputStream);
                        return;
                        this.D = null;
                        this.C = null;
                        continue Label_0109_Outer;
                        throw new NullPointerException("inputStream cannot be null");
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private final asy c(final String s) {
        String s2 = s;
        if ("ISOSpeedRatings".equals(s)) {
            s2 = "PhotographicSensitivity";
        }
        int n = 0;
        while (true) {
            final int length = ata.i.length;
            if (n >= 10) {
                return null;
            }
            final asy asy = this.F[n].get(s2);
            if (asy != null) {
                return asy;
            }
            ++n;
        }
    }
    
    private final void d() {
        final String a = this.a("DateTimeOriginal");
        if (a != null && this.a("DateTime") == null) {
            this.F[0].put("DateTime", asy.b(a));
        }
        if (this.a("ImageWidth") == null) {
            this.F[0].put("ImageWidth", asy.c(0L, this.H));
        }
        if (this.a("ImageLength") == null) {
            this.F[0].put("ImageLength", asy.c(0L, this.H));
        }
        if (this.a("Orientation") == null) {
            this.F[0].put("Orientation", asy.c(0L, this.H));
        }
        if (this.a("LightSource") == null) {
            this.F[1].put("LightSource", asy.c(0L, this.H));
        }
    }
    
    private final void e(final asx asx, final int n, final int n2) {
        asx.c = ByteOrder.BIG_ENDIAN;
        final byte byte1 = asx.readByte();
        if (byte1 != -1) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(0xFF & byte1))));
        }
        if (asx.readByte() != -40) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(255))));
        }
        int n3 = 2;
        while (true) {
            final byte byte2 = asx.readByte();
            if (byte2 != -1) {
                throw new IOException("Invalid marker:".concat(String.valueOf(Integer.toHexString(0xFF & byte2))));
            }
            final byte byte3 = asx.readByte();
            if (byte3 == -39 || byte3 == -38) {
                asx.c = this.H;
                return;
            }
            final int n4 = asx.readUnsignedShort() - 2;
            int n5 = n3 + 4;
            if (n4 < 0) {
                throw new IOException("Invalid length");
            }
            int n6 = 0;
            Label_0556: {
                int n7 = 0;
                if (byte3 != -31) {
                    if (byte3 != -2) {
                        switch (byte3) {
                            default:
                                Label_0223: {
                                    switch (byte3) {
                                        default: {
                                            switch (byte3) {
                                                default: {
                                                    switch (byte3) {
                                                        default: {
                                                            n6 = n4;
                                                            break Label_0556;
                                                        }
                                                        case -51:
                                                        case -50:
                                                        case -49: {
                                                            break Label_0223;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case -55:
                                                case -54:
                                                case -53: {
                                                    break Label_0223;
                                                }
                                            }
                                            break;
                                        }
                                        case -59:
                                        case -58:
                                        case -57: {
                                            break Label_0223;
                                        }
                                    }
                                    break;
                                }
                            case -64:
                            case -63:
                            case -62:
                            case -61: {
                                asx.b(1);
                                final HashMap hashMap = this.F[n2];
                                String s;
                                if (n2 != 4) {
                                    s = "ImageLength";
                                }
                                else {
                                    s = "ThumbnailImageLength";
                                }
                                hashMap.put(s, asy.c(asx.readUnsignedShort(), this.H));
                                final HashMap hashMap2 = this.F[n2];
                                String s2;
                                if (n2 != 4) {
                                    s2 = "ImageWidth";
                                }
                                else {
                                    s2 = "ThumbnailImageWidth";
                                }
                                hashMap2.put(s2, asy.c(asx.readUnsignedShort(), this.H));
                                n6 = n4 - 5;
                                break Label_0556;
                            }
                        }
                    }
                    else {
                        final byte[] array = new byte[n4];
                        asx.readFully(array);
                        n7 = n5;
                        if (this.a("UserComment") == null) {
                            this.F[1].put("UserComment", asy.b(new String(array, ata.g)));
                            n7 = n5;
                        }
                    }
                }
                else {
                    final byte[] array2 = new byte[n4];
                    asx.readFully(array2);
                    final byte[] h = ata.h;
                    if (aps.i(array2, h)) {
                        final byte[] copyOfRange = Arrays.copyOfRange(array2, h.length, n4);
                        this.J = n + n5 + h.length;
                        this.l(copyOfRange, n2);
                        this.n(new asx(copyOfRange));
                    }
                    else {
                        final byte[] b = ata.B;
                        if (aps.i(array2, b)) {
                            final int length = b.length;
                            final byte[] copyOfRange2 = Arrays.copyOfRange(array2, length, n4);
                            if (this.a("Xmp") == null) {
                                this.F[0].put("Xmp", new asy(1, copyOfRange2.length, n5 + length, copyOfRange2));
                            }
                        }
                    }
                    n7 = n5 + n4;
                }
                final int n8 = 0;
                n5 = n7;
                n6 = n8;
            }
            if (n6 < 0) {
                throw new IOException("Invalid length");
            }
            asx.b(n6);
            n3 = n5 + n6;
        }
    }
    
    private final void f(final asx asx) {
        asx.c = ByteOrder.BIG_ENDIAN;
        final byte[] o = ata.o;
        final int length = o.length;
        asx.b(8);
        final int length2 = o.length;
        int n = 8;
        try {
            while (true) {
                final int int1 = asx.readInt();
                final byte[] array = new byte[4];
                asx.readFully(array);
                int j;
                if ((j = n + 8) == 16) {
                    if (!Arrays.equals(array, ata.q)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    j = 16;
                }
                if (Arrays.equals(array, ata.r)) {
                    return;
                }
                if (Arrays.equals(array, ata.p)) {
                    final byte[] array2 = new byte[int1];
                    asx.readFully(array2);
                    final int int2 = asx.readInt();
                    final CRC32 crc32 = new CRC32();
                    crc32.update(array);
                    crc32.update(array2);
                    if ((int)crc32.getValue() == int2) {
                        this.J = j;
                        this.l(array2, 0);
                        this.p();
                        this.n(new asx(array2));
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    sb.append(int2);
                    sb.append(", calculated CRC value: ");
                    sb.append(crc32.getValue());
                    throw new IOException(sb.toString());
                }
                else {
                    final int n2 = int1 + 4;
                    asx.b(n2);
                    n = j + n2;
                }
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }
    
    private final void g(final asx asx) {
        asx.c = ByteOrder.LITTLE_ENDIAN;
        final int length = ata.s.length;
        asx.b(4);
        final int n = asx.readInt() + 8;
        final byte[] t = ata.t;
        final int length2 = t.length;
        asx.b(4);
        final int length3 = t.length;
        int n2 = 12;
        try {
            while (true) {
                final byte[] array = new byte[4];
                asx.readFully(array);
                final int int1 = asx.readInt();
                final int j = n2 + 8;
                if (Arrays.equals(ata.u, array)) {
                    final byte[] array2 = new byte[int1];
                    asx.readFully(array2);
                    this.J = j;
                    this.l(array2, 0);
                    this.n(new asx(array2));
                    return;
                }
                int n3 = int1;
                if (int1 % 2 == 1) {
                    n3 = int1 + 1;
                }
                final int n4 = j + n3;
                if (n4 == n) {
                    return;
                }
                if (n4 > n) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                asx.b(n3);
                n2 = n4;
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }
    
    private final void h(final asx asx, final HashMap hashMap) {
        final asy asy = hashMap.get("JPEGInterchangeFormat");
        final asy asy2 = hashMap.get("JPEGInterchangeFormatLength");
        if (asy != null && asy2 != null) {
            final int a = asy.a(this.H);
            final int a2 = asy2.a(this.H);
            int n = a;
            if (this.E == 7) {
                n = a + this.K;
            }
            if (n > 0 && a2 > 0 && this.D == null && this.C == null) {
                final byte[] array = new byte[a2];
                asx.b(n);
                asx.readFully(array);
            }
        }
    }
    
    private final void i(final asx asx, final HashMap hashMap) {
        final asy asy = hashMap.get("StripOffsets");
        final asy asy2 = hashMap.get("StripByteCounts");
        if (asy != null && asy2 != null) {
            final long[] j = aps.j(asy.f(this.H));
            final long[] i = aps.j(asy2.f(this.H));
            if (j != null) {
                final int length = j.length;
                if (length != 0) {
                    if (i != null) {
                        final int length2 = i.length;
                        if (length2 != 0) {
                            if (length != length2) {
                                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                return;
                            }
                            long n = 0L;
                            for (int k = 0; k < length2; ++k) {
                                n += i[k];
                            }
                            final byte[] array = new byte[(int)n];
                            this.I = true;
                            int n2 = 0;
                            int n3 = 0;
                            int n4 = 0;
                            while (true) {
                                final int length3 = j.length;
                                if (n2 >= length3) {
                                    break;
                                }
                                final int n5 = (int)j[n2];
                                final int n6 = (int)i[n2];
                                if (n2 < length3 - 1 && n5 + n6 != j[n2 + 1]) {
                                    this.I = false;
                                }
                                final int n7 = n5 - n3;
                                if (n7 < 0) {
                                    return;
                                }
                                try {
                                    asx.b(n7);
                                    final byte[] array2 = new byte[n6];
                                    asx.readFully(array2);
                                    n3 = n3 + n7 + n6;
                                    System.arraycopy(array2, 0, array, n4, n6);
                                    n4 += n6;
                                    ++n2;
                                    continue;
                                }
                                catch (final EOFException ex) {
                                    return;
                                }
                                break;
                            }
                            if (this.I) {
                                final long n8 = j[0];
                            }
                            return;
                        }
                    }
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }
    
    private final void j(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: getstatic       ata.i:[[Laerj;
        //     5: arraylength    
        //     6: istore_3       
        //     7: iload_2        
        //     8: bipush          10
        //    10: if_icmpge       32
        //    13: aload_0        
        //    14: getfield        ata.F:[Ljava/util/HashMap;
        //    17: iload_2        
        //    18: new             Ljava/util/HashMap;
        //    21: dup            
        //    22: invokespecial   java/util/HashMap.<init>:()V
        //    25: aastore        
        //    26: iinc            2, 1
        //    29: goto            2
        //    32: new             Ljava/io/BufferedInputStream;
        //    35: astore          4
        //    37: aload           4
        //    39: aload_1        
        //    40: sipush          5000
        //    43: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //    46: aload           4
        //    48: sipush          5000
        //    51: invokevirtual   java/io/BufferedInputStream.mark:(I)V
        //    54: sipush          5000
        //    57: newarray        B
        //    59: astore          5
        //    61: aload           4
        //    63: aload           5
        //    65: invokevirtual   java/io/BufferedInputStream.read:([B)I
        //    68: pop            
        //    69: aload           4
        //    71: invokevirtual   java/io/BufferedInputStream.reset:()V
        //    74: iconst_0       
        //    75: istore_2       
        //    76: getstatic       ata.c:[B
        //    79: astore_1       
        //    80: aload_1        
        //    81: arraylength    
        //    82: istore_3       
        //    83: aconst_null    
        //    84: astore          6
        //    86: aconst_null    
        //    87: astore          7
        //    89: aconst_null    
        //    90: astore          8
        //    92: iload_2        
        //    93: iconst_3       
        //    94: if_icmpge       492
        //    97: aload           5
        //    99: iload_2        
        //   100: baload         
        //   101: aload_1        
        //   102: iload_2        
        //   103: baload         
        //   104: if_icmpeq       486
        //   107: ldc_w           "FUJIFILMCCD-RAW"
        //   110: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   113: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   116: astore_1       
        //   117: iconst_0       
        //   118: istore_2       
        //   119: iload_2        
        //   120: aload_1        
        //   121: arraylength    
        //   122: if_icmpge       480
        //   125: aload           5
        //   127: iload_2        
        //   128: baload         
        //   129: aload_1        
        //   130: iload_2        
        //   131: baload         
        //   132: if_icmpeq       474
        //   135: aload           5
        //   137: invokestatic    ata.u:([B)Z
        //   140: istore          9
        //   142: iload           9
        //   144: ifeq            153
        //   147: bipush          12
        //   149: istore_2       
        //   150: goto            494
        //   153: new             Lasx;
        //   156: astore_1       
        //   157: aload_1        
        //   158: aload           5
        //   160: invokespecial   asx.<init>:([B)V
        //   163: aload_1        
        //   164: invokestatic    ata.v:(Lasx;)Ljava/nio/ByteOrder;
        //   167: astore          8
        //   169: aload_0        
        //   170: aload           8
        //   172: putfield        ata.H:Ljava/nio/ByteOrder;
        //   175: aload_1        
        //   176: aload           8
        //   178: putfield        asx.c:Ljava/nio/ByteOrder;
        //   181: aload_1        
        //   182: invokevirtual   asx.readShort:()S
        //   185: istore_2       
        //   186: iload_2        
        //   187: sipush          20306
        //   190: if_icmpeq       208
        //   193: iload_2        
        //   194: sipush          21330
        //   197: if_icmpne       203
        //   200: goto            208
        //   203: iconst_0       
        //   204: istore_2       
        //   205: goto            210
        //   208: iconst_1       
        //   209: istore_2       
        //   210: aload_1        
        //   211: invokevirtual   asx.close:()V
        //   214: iload_2        
        //   215: ifeq            269
        //   218: bipush          7
        //   220: istore_2       
        //   221: goto            494
        //   224: astore          7
        //   226: aload_1        
        //   227: astore          6
        //   229: goto            245
        //   232: astore          8
        //   234: goto            261
        //   237: astore_1       
        //   238: aload           8
        //   240: astore          6
        //   242: aload_1        
        //   243: astore          7
        //   245: aload           6
        //   247: ifnull          255
        //   250: aload           6
        //   252: invokevirtual   asx.close:()V
        //   255: aload           7
        //   257: athrow         
        //   258: astore_1       
        //   259: aconst_null    
        //   260: astore_1       
        //   261: aload_1        
        //   262: ifnull          269
        //   265: aload_1        
        //   266: invokevirtual   asx.close:()V
        //   269: new             Lasx;
        //   272: astore_1       
        //   273: aload_1        
        //   274: aload           5
        //   276: invokespecial   asx.<init>:([B)V
        //   279: aload_1        
        //   280: invokestatic    ata.v:(Lasx;)Ljava/nio/ByteOrder;
        //   283: astore          6
        //   285: aload_0        
        //   286: aload           6
        //   288: putfield        ata.H:Ljava/nio/ByteOrder;
        //   291: aload_1        
        //   292: aload           6
        //   294: putfield        asx.c:Ljava/nio/ByteOrder;
        //   297: aload_1        
        //   298: invokevirtual   asx.readShort:()S
        //   301: istore_2       
        //   302: aload_1        
        //   303: invokevirtual   asx.close:()V
        //   306: iload_2        
        //   307: bipush          85
        //   309: if_icmpne       355
        //   312: bipush          10
        //   314: istore_2       
        //   315: goto            494
        //   318: astore          7
        //   320: goto            333
        //   323: astore          6
        //   325: goto            347
        //   328: astore          7
        //   330: aload           6
        //   332: astore_1       
        //   333: aload_1        
        //   334: ifnull          341
        //   337: aload_1        
        //   338: invokevirtual   asx.close:()V
        //   341: aload           7
        //   343: athrow         
        //   344: astore_1       
        //   345: aconst_null    
        //   346: astore_1       
        //   347: aload_1        
        //   348: ifnull          355
        //   351: aload_1        
        //   352: invokevirtual   asx.close:()V
        //   355: iconst_0       
        //   356: istore_2       
        //   357: getstatic       ata.o:[B
        //   360: astore_1       
        //   361: aload_1        
        //   362: arraylength    
        //   363: istore_3       
        //   364: iload_2        
        //   365: bipush          8
        //   367: if_icmpge       468
        //   370: aload           5
        //   372: iload_2        
        //   373: baload         
        //   374: aload_1        
        //   375: iload_2        
        //   376: baload         
        //   377: if_icmpeq       462
        //   380: iconst_0       
        //   381: istore_2       
        //   382: getstatic       ata.s:[B
        //   385: astore_1       
        //   386: aload_1        
        //   387: arraylength    
        //   388: istore_3       
        //   389: iload_2        
        //   390: iconst_4       
        //   391: if_icmpge       415
        //   394: aload           5
        //   396: iload_2        
        //   397: baload         
        //   398: aload_1        
        //   399: iload_2        
        //   400: baload         
        //   401: if_icmpeq       409
        //   404: iconst_0       
        //   405: istore_2       
        //   406: goto            494
        //   409: iinc            2, 1
        //   412: goto            382
        //   415: iconst_0       
        //   416: istore_2       
        //   417: getstatic       ata.t:[B
        //   420: astore_1       
        //   421: aload_1        
        //   422: arraylength    
        //   423: istore_3       
        //   424: iload_2        
        //   425: iconst_4       
        //   426: if_icmpge       456
        //   429: getstatic       ata.s:[B
        //   432: arraylength    
        //   433: istore_3       
        //   434: aload           5
        //   436: iload_2        
        //   437: bipush          8
        //   439: iadd           
        //   440: baload         
        //   441: aload_1        
        //   442: iload_2        
        //   443: baload         
        //   444: if_icmpeq       450
        //   447: goto            404
        //   450: iinc            2, 1
        //   453: goto            417
        //   456: bipush          14
        //   458: istore_2       
        //   459: goto            494
        //   462: iinc            2, 1
        //   465: goto            357
        //   468: bipush          13
        //   470: istore_2       
        //   471: goto            494
        //   474: iinc            2, 1
        //   477: goto            119
        //   480: bipush          9
        //   482: istore_2       
        //   483: goto            494
        //   486: iinc            2, 1
        //   489: goto            76
        //   492: iconst_4       
        //   493: istore_2       
        //   494: aload_0        
        //   495: iload_2        
        //   496: putfield        ata.E:I
        //   499: iload_2        
        //   500: iconst_4       
        //   501: if_icmpeq       1644
        //   504: iload_2        
        //   505: bipush          9
        //   507: if_icmpeq       1644
        //   510: iload_2        
        //   511: bipush          13
        //   513: if_icmpeq       1644
        //   516: iload_2        
        //   517: bipush          14
        //   519: if_icmpne       525
        //   522: goto            1644
        //   525: new             Lasx;
        //   528: astore          8
        //   530: aload           8
        //   532: aload           4
        //   534: aconst_null    
        //   535: invokespecial   asx.<init>:(Ljava/io/InputStream;[B)V
        //   538: aload_0        
        //   539: getfield        ata.E:I
        //   542: istore_2       
        //   543: iload_2        
        //   544: bipush          12
        //   546: if_icmpne       1089
        //   549: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   552: bipush          28
        //   554: if_icmplt       1076
        //   557: new             Landroid/media/MediaMetadataRetriever;
        //   560: astore          4
        //   562: aload           4
        //   564: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   567: new             Lasw;
        //   570: astore_1       
        //   571: aload_1        
        //   572: aload           8
        //   574: invokespecial   asw.<init>:(Lasx;)V
        //   577: aload           4
        //   579: aload_1        
        //   580: invokestatic    atc.a:(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V
        //   583: aload           4
        //   585: bipush          33
        //   587: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   590: astore          5
        //   592: aload           4
        //   594: bipush          34
        //   596: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   599: astore          10
        //   601: aload           4
        //   603: bipush          26
        //   605: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   608: astore_1       
        //   609: aload           4
        //   611: bipush          17
        //   613: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   616: astore          6
        //   618: ldc_w           "yes"
        //   621: aload_1        
        //   622: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   625: ifeq            657
        //   628: aload           4
        //   630: bipush          29
        //   632: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   635: astore          7
        //   637: aload           4
        //   639: bipush          30
        //   641: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   644: astore_1       
        //   645: aload           4
        //   647: bipush          31
        //   649: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   652: astore          6
        //   654: goto            702
        //   657: ldc_w           "yes"
        //   660: aload           6
        //   662: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   665: ifeq            697
        //   668: aload           4
        //   670: bipush          18
        //   672: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   675: astore          7
        //   677: aload           4
        //   679: bipush          19
        //   681: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   684: astore_1       
        //   685: aload           4
        //   687: bipush          24
        //   689: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   692: astore          6
        //   694: goto            702
        //   697: aconst_null    
        //   698: astore_1       
        //   699: aload_1        
        //   700: astore          6
        //   702: aload           7
        //   704: ifnull          731
        //   707: aload_0        
        //   708: getfield        ata.F:[Ljava/util/HashMap;
        //   711: iconst_0       
        //   712: aaload         
        //   713: ldc             "ImageWidth"
        //   715: aload           7
        //   717: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   720: aload_0        
        //   721: getfield        ata.H:Ljava/nio/ByteOrder;
        //   724: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //   727: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   730: pop            
        //   731: aload_1        
        //   732: ifnull          758
        //   735: aload_0        
        //   736: getfield        ata.F:[Ljava/util/HashMap;
        //   739: iconst_0       
        //   740: aaload         
        //   741: ldc             "ImageLength"
        //   743: aload_1        
        //   744: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   747: aload_0        
        //   748: getfield        ata.H:Ljava/nio/ByteOrder;
        //   751: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //   754: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   757: pop            
        //   758: aload           6
        //   760: ifnull          828
        //   763: aload           6
        //   765: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   768: istore_2       
        //   769: iload_2        
        //   770: bipush          90
        //   772: if_icmpeq       805
        //   775: iload_2        
        //   776: sipush          180
        //   779: if_icmpeq       800
        //   782: iload_2        
        //   783: sipush          270
        //   786: if_icmpeq       794
        //   789: iconst_1       
        //   790: istore_2       
        //   791: goto            808
        //   794: bipush          8
        //   796: istore_2       
        //   797: goto            808
        //   800: iconst_3       
        //   801: istore_2       
        //   802: goto            808
        //   805: bipush          6
        //   807: istore_2       
        //   808: aload_0        
        //   809: getfield        ata.F:[Ljava/util/HashMap;
        //   812: iconst_0       
        //   813: aaload         
        //   814: ldc             "Orientation"
        //   816: iload_2        
        //   817: aload_0        
        //   818: getfield        ata.H:Ljava/nio/ByteOrder;
        //   821: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //   824: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   827: pop            
        //   828: aload           5
        //   830: ifnull          940
        //   833: aload           10
        //   835: ifnull          940
        //   838: aload           5
        //   840: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   843: istore_3       
        //   844: aload           10
        //   846: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   849: istore_2       
        //   850: iload_2        
        //   851: bipush          6
        //   853: if_icmple       927
        //   856: aload           8
        //   858: iload_3        
        //   859: i2l            
        //   860: invokevirtual   asx.c:(J)V
        //   863: bipush          6
        //   865: newarray        B
        //   867: astore_1       
        //   868: aload           8
        //   870: aload_1        
        //   871: invokevirtual   asx.readFully:([B)V
        //   874: aload_1        
        //   875: getstatic       ata.h:[B
        //   878: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   881: ifeq            914
        //   884: iload_2        
        //   885: bipush          6
        //   887: isub           
        //   888: newarray        B
        //   890: astore_1       
        //   891: aload           8
        //   893: aload_1        
        //   894: invokevirtual   asx.readFully:([B)V
        //   897: aload_0        
        //   898: iload_3        
        //   899: bipush          6
        //   901: iadd           
        //   902: putfield        ata.J:I
        //   905: aload_0        
        //   906: aload_1        
        //   907: iconst_0       
        //   908: invokespecial   ata.l:([BI)V
        //   911: goto            940
        //   914: new             Ljava/io/IOException;
        //   917: astore_1       
        //   918: aload_1        
        //   919: ldc_w           "Invalid identifier"
        //   922: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   925: aload_1        
        //   926: athrow         
        //   927: new             Ljava/io/IOException;
        //   930: astore_1       
        //   931: aload_1        
        //   932: ldc_w           "Invalid exif length"
        //   935: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   938: aload_1        
        //   939: athrow         
        //   940: aload           4
        //   942: bipush          41
        //   944: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   947: astore          7
        //   949: aload           4
        //   951: bipush          42
        //   953: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   956: astore_1       
        //   957: aload           7
        //   959: ifnull          1043
        //   962: aload_1        
        //   963: ifnull          1043
        //   966: aload           7
        //   968: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   971: istore_2       
        //   972: aload_1        
        //   973: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   976: istore_3       
        //   977: iload_2        
        //   978: i2l            
        //   979: lstore          11
        //   981: aload           8
        //   983: lload           11
        //   985: invokevirtual   asx.c:(J)V
        //   988: iload_3        
        //   989: newarray        B
        //   991: astore          7
        //   993: aload           8
        //   995: aload           7
        //   997: invokevirtual   asx.readFully:([B)V
        //  1000: aload_0        
        //  1001: ldc_w           "Xmp"
        //  1004: invokevirtual   ata.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1007: ifnonnull       1043
        //  1010: aload_0        
        //  1011: getfield        ata.F:[Ljava/util/HashMap;
        //  1014: iconst_0       
        //  1015: aaload         
        //  1016: astore_1       
        //  1017: new             Lasy;
        //  1020: astore          6
        //  1022: aload           6
        //  1024: iconst_1       
        //  1025: iload_3        
        //  1026: lload           11
        //  1028: aload           7
        //  1030: invokespecial   asy.<init>:(IIJ[B)V
        //  1033: aload_1        
        //  1034: ldc_w           "Xmp"
        //  1037: aload           6
        //  1039: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1042: pop            
        //  1043: aload           4
        //  1045: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1048: goto            1625
        //  1051: astore_1       
        //  1052: goto            1069
        //  1055: astore_1       
        //  1056: new             Ljava/lang/UnsupportedOperationException;
        //  1059: astore_1       
        //  1060: aload_1        
        //  1061: ldc_w           "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
        //  1064: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1067: aload_1        
        //  1068: athrow         
        //  1069: aload           4
        //  1071: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1074: aload_1        
        //  1075: athrow         
        //  1076: new             Ljava/lang/UnsupportedOperationException;
        //  1079: astore_1       
        //  1080: aload_1        
        //  1081: ldc_w           "Reading EXIF from HEIF files is supported from SDK 28 and above"
        //  1084: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1087: aload_1        
        //  1088: athrow         
        //  1089: iload_2        
        //  1090: bipush          7
        //  1092: if_icmpne       1501
        //  1095: aload_0        
        //  1096: aload           8
        //  1098: invokespecial   ata.r:(Lasx;)V
        //  1101: aload_0        
        //  1102: getfield        ata.F:[Ljava/util/HashMap;
        //  1105: iconst_1       
        //  1106: aaload         
        //  1107: ldc_w           "MakerNote"
        //  1110: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1113: checkcast       Lasy;
        //  1116: astore          7
        //  1118: aload           7
        //  1120: ifnull          1625
        //  1123: new             Lasx;
        //  1126: astore_1       
        //  1127: aload_1        
        //  1128: aload           7
        //  1130: getfield        asy.d:[B
        //  1133: aconst_null    
        //  1134: invokespecial   asx.<init>:([B[B)V
        //  1137: aload_1        
        //  1138: aload_0        
        //  1139: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1142: putfield        asx.c:Ljava/nio/ByteOrder;
        //  1145: getstatic       ata.m:[B
        //  1148: astore          6
        //  1150: aload           6
        //  1152: arraylength    
        //  1153: istore_2       
        //  1154: bipush          6
        //  1156: newarray        B
        //  1158: astore          5
        //  1160: aload_1        
        //  1161: aload           5
        //  1163: invokevirtual   asx.readFully:([B)V
        //  1166: aload_1        
        //  1167: lconst_0       
        //  1168: invokevirtual   asx.c:(J)V
        //  1171: getstatic       ata.n:[B
        //  1174: astore          4
        //  1176: aload           4
        //  1178: arraylength    
        //  1179: istore_2       
        //  1180: bipush          10
        //  1182: newarray        B
        //  1184: astore          7
        //  1186: aload_1        
        //  1187: aload           7
        //  1189: invokevirtual   asx.readFully:([B)V
        //  1192: aload           5
        //  1194: aload           6
        //  1196: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1199: ifeq            1212
        //  1202: aload_1        
        //  1203: ldc2_w          8
        //  1206: invokevirtual   asx.c:(J)V
        //  1209: goto            1229
        //  1212: aload           7
        //  1214: aload           4
        //  1216: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1219: ifeq            1229
        //  1222: aload_1        
        //  1223: ldc2_w          12
        //  1226: invokevirtual   asx.c:(J)V
        //  1229: aload_0        
        //  1230: aload_1        
        //  1231: bipush          6
        //  1233: invokespecial   ata.s:(Lasx;I)V
        //  1236: aload_0        
        //  1237: getfield        ata.F:[Ljava/util/HashMap;
        //  1240: bipush          7
        //  1242: aaload         
        //  1243: ldc_w           "PreviewImageStart"
        //  1246: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1249: checkcast       Lasy;
        //  1252: astore          7
        //  1254: aload_0        
        //  1255: getfield        ata.F:[Ljava/util/HashMap;
        //  1258: bipush          7
        //  1260: aaload         
        //  1261: ldc_w           "PreviewImageLength"
        //  1264: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1267: checkcast       Lasy;
        //  1270: astore_1       
        //  1271: aload           7
        //  1273: ifnull          1309
        //  1276: aload_1        
        //  1277: ifnull          1309
        //  1280: aload_0        
        //  1281: getfield        ata.F:[Ljava/util/HashMap;
        //  1284: iconst_5       
        //  1285: aaload         
        //  1286: ldc_w           "JPEGInterchangeFormat"
        //  1289: aload           7
        //  1291: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1294: pop            
        //  1295: aload_0        
        //  1296: getfield        ata.F:[Ljava/util/HashMap;
        //  1299: iconst_5       
        //  1300: aaload         
        //  1301: ldc_w           "JPEGInterchangeFormatLength"
        //  1304: aload_1        
        //  1305: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1308: pop            
        //  1309: aload_0        
        //  1310: getfield        ata.F:[Ljava/util/HashMap;
        //  1313: bipush          8
        //  1315: aaload         
        //  1316: ldc_w           "AspectFrame"
        //  1319: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1322: checkcast       Lasy;
        //  1325: astore_1       
        //  1326: aload_1        
        //  1327: ifnull          1625
        //  1330: aload_1        
        //  1331: aload_0        
        //  1332: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1335: invokevirtual   asy.f:(Ljava/nio/ByteOrder;)Ljava/lang/Object;
        //  1338: checkcast       [I
        //  1341: astore_1       
        //  1342: aload_1        
        //  1343: ifnull          1478
        //  1346: aload_1        
        //  1347: arraylength    
        //  1348: iconst_4       
        //  1349: if_icmpeq       1355
        //  1352: goto            1478
        //  1355: aload_1        
        //  1356: iconst_2       
        //  1357: iaload         
        //  1358: istore          13
        //  1360: aload_1        
        //  1361: iconst_0       
        //  1362: iaload         
        //  1363: istore          14
        //  1365: iload           13
        //  1367: iload           14
        //  1369: if_icmple       1625
        //  1372: aload_1        
        //  1373: iconst_3       
        //  1374: iaload         
        //  1375: istore_3       
        //  1376: aload_1        
        //  1377: iconst_1       
        //  1378: iaload         
        //  1379: istore_2       
        //  1380: iload_3        
        //  1381: iload_2        
        //  1382: if_icmple       1625
        //  1385: iload           13
        //  1387: iload           14
        //  1389: isub           
        //  1390: iconst_1       
        //  1391: iadd           
        //  1392: istore          13
        //  1394: iload_3        
        //  1395: iload_2        
        //  1396: isub           
        //  1397: iconst_1       
        //  1398: iadd           
        //  1399: istore          14
        //  1401: iload           13
        //  1403: istore_3       
        //  1404: iload           14
        //  1406: istore_2       
        //  1407: iload           13
        //  1409: iload           14
        //  1411: if_icmpge       1429
        //  1414: iload           13
        //  1416: iload           14
        //  1418: iadd           
        //  1419: istore_3       
        //  1420: iload_3        
        //  1421: iload           14
        //  1423: isub           
        //  1424: istore_2       
        //  1425: iload_3        
        //  1426: iload_2        
        //  1427: isub           
        //  1428: istore_3       
        //  1429: iload_3        
        //  1430: aload_0        
        //  1431: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1434: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //  1437: astore_1       
        //  1438: iload_2        
        //  1439: aload_0        
        //  1440: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1443: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //  1446: astore          7
        //  1448: aload_0        
        //  1449: getfield        ata.F:[Ljava/util/HashMap;
        //  1452: iconst_0       
        //  1453: aaload         
        //  1454: ldc             "ImageWidth"
        //  1456: aload_1        
        //  1457: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1460: pop            
        //  1461: aload_0        
        //  1462: getfield        ata.F:[Ljava/util/HashMap;
        //  1465: iconst_0       
        //  1466: aaload         
        //  1467: ldc             "ImageLength"
        //  1469: aload           7
        //  1471: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1474: pop            
        //  1475: goto            1625
        //  1478: ldc_w           "ExifInterface"
        //  1481: ldc_w           "Invalid aspect frame values. frame="
        //  1484: aload_1        
        //  1485: invokestatic    java/util/Arrays.toString:([I)Ljava/lang/String;
        //  1488: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1491: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1494: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  1497: pop            
        //  1498: goto            1625
        //  1501: iload_2        
        //  1502: bipush          10
        //  1504: if_icmpne       1619
        //  1507: aload_0        
        //  1508: aload           8
        //  1510: invokespecial   ata.r:(Lasx;)V
        //  1513: aload_0        
        //  1514: getfield        ata.F:[Ljava/util/HashMap;
        //  1517: iconst_0       
        //  1518: aaload         
        //  1519: ldc_w           "JpgFromRaw"
        //  1522: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1525: checkcast       Lasy;
        //  1528: astore_1       
        //  1529: aload_1        
        //  1530: ifnull          1559
        //  1533: new             Lasx;
        //  1536: astore          7
        //  1538: aload           7
        //  1540: aload_1        
        //  1541: getfield        asy.d:[B
        //  1544: invokespecial   asx.<init>:([B)V
        //  1547: aload_0        
        //  1548: aload           7
        //  1550: aload_1        
        //  1551: getfield        asy.c:J
        //  1554: l2i            
        //  1555: iconst_5       
        //  1556: invokespecial   ata.e:(Lasx;II)V
        //  1559: aload_0        
        //  1560: getfield        ata.F:[Ljava/util/HashMap;
        //  1563: iconst_0       
        //  1564: aaload         
        //  1565: ldc_w           "ISO"
        //  1568: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1571: checkcast       Lasy;
        //  1574: astore          7
        //  1576: aload_0        
        //  1577: getfield        ata.F:[Ljava/util/HashMap;
        //  1580: iconst_1       
        //  1581: aaload         
        //  1582: ldc_w           "PhotographicSensitivity"
        //  1585: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1588: checkcast       Lasy;
        //  1591: astore_1       
        //  1592: aload           7
        //  1594: ifnull          1625
        //  1597: aload_1        
        //  1598: ifnonnull       1625
        //  1601: aload_0        
        //  1602: getfield        ata.F:[Ljava/util/HashMap;
        //  1605: iconst_1       
        //  1606: aaload         
        //  1607: ldc_w           "PhotographicSensitivity"
        //  1610: aload           7
        //  1612: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1615: pop            
        //  1616: goto            1625
        //  1619: aload_0        
        //  1620: aload           8
        //  1622: invokespecial   ata.r:(Lasx;)V
        //  1625: aload           8
        //  1627: aload_0        
        //  1628: getfield        ata.J:I
        //  1631: i2l            
        //  1632: invokevirtual   asx.c:(J)V
        //  1635: aload_0        
        //  1636: aload           8
        //  1638: invokespecial   ata.n:(Lasx;)V
        //  1641: goto            1937
        //  1644: new             Lasx;
        //  1647: astore_1       
        //  1648: aload_1        
        //  1649: aload           4
        //  1651: invokespecial   asx.<init>:(Ljava/io/InputStream;)V
        //  1654: aload_0        
        //  1655: getfield        ata.E:I
        //  1658: istore_2       
        //  1659: iload_2        
        //  1660: iconst_4       
        //  1661: if_icmpne       1674
        //  1664: aload_0        
        //  1665: aload_1        
        //  1666: iconst_0       
        //  1667: iconst_0       
        //  1668: invokespecial   ata.e:(Lasx;II)V
        //  1671: goto            1937
        //  1674: iload_2        
        //  1675: bipush          13
        //  1677: if_icmpne       1688
        //  1680: aload_0        
        //  1681: aload_1        
        //  1682: invokespecial   ata.f:(Lasx;)V
        //  1685: goto            1937
        //  1688: iload_2        
        //  1689: bipush          9
        //  1691: if_icmpne       1926
        //  1694: aload_1        
        //  1695: bipush          84
        //  1697: invokevirtual   asx.b:(I)V
        //  1700: iconst_4       
        //  1701: newarray        B
        //  1703: astore          7
        //  1705: iconst_4       
        //  1706: newarray        B
        //  1708: astore          6
        //  1710: iconst_4       
        //  1711: newarray        B
        //  1713: astore          8
        //  1715: aload_1        
        //  1716: aload           7
        //  1718: invokevirtual   asx.readFully:([B)V
        //  1721: aload_1        
        //  1722: aload           6
        //  1724: invokevirtual   asx.readFully:([B)V
        //  1727: aload_1        
        //  1728: aload           8
        //  1730: invokevirtual   asx.readFully:([B)V
        //  1733: aload           7
        //  1735: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1738: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1741: istore_3       
        //  1742: aload           6
        //  1744: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1747: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1750: istore          13
        //  1752: aload           8
        //  1754: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1757: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1760: istore_2       
        //  1761: iload           13
        //  1763: newarray        B
        //  1765: astore          6
        //  1767: aload_1        
        //  1768: iload_3        
        //  1769: aload_1        
        //  1770: getfield        asx.b:I
        //  1773: isub           
        //  1774: invokevirtual   asx.b:(I)V
        //  1777: aload_1        
        //  1778: aload           6
        //  1780: invokevirtual   asx.readFully:([B)V
        //  1783: new             Lasx;
        //  1786: astore          7
        //  1788: aload           7
        //  1790: aload           6
        //  1792: invokespecial   asx.<init>:([B)V
        //  1795: aload_0        
        //  1796: aload           7
        //  1798: iload_3        
        //  1799: iconst_5       
        //  1800: invokespecial   ata.e:(Lasx;II)V
        //  1803: aload_1        
        //  1804: iload_2        
        //  1805: aload_1        
        //  1806: getfield        asx.b:I
        //  1809: isub           
        //  1810: invokevirtual   asx.b:(I)V
        //  1813: aload_1        
        //  1814: getstatic       java/nio/ByteOrder.BIG_ENDIAN:Ljava/nio/ByteOrder;
        //  1817: putfield        asx.c:Ljava/nio/ByteOrder;
        //  1820: aload_1        
        //  1821: invokevirtual   asx.readInt:()I
        //  1824: istore_3       
        //  1825: iconst_0       
        //  1826: istore_2       
        //  1827: iload_2        
        //  1828: iload_3        
        //  1829: if_icmpge       1937
        //  1832: aload_1        
        //  1833: invokevirtual   asx.readUnsignedShort:()I
        //  1836: istore          14
        //  1838: aload_1        
        //  1839: invokevirtual   asx.readUnsignedShort:()I
        //  1842: istore          13
        //  1844: iload           14
        //  1846: getstatic       ata.S:Laerj;
        //  1849: getfield        aerj.b:I
        //  1852: if_icmpne       1914
        //  1855: aload_1        
        //  1856: invokevirtual   asx.readShort:()S
        //  1859: istore_2       
        //  1860: aload_1        
        //  1861: invokevirtual   asx.readShort:()S
        //  1864: istore_3       
        //  1865: iload_2        
        //  1866: aload_0        
        //  1867: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1870: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //  1873: astore_1       
        //  1874: iload_3        
        //  1875: aload_0        
        //  1876: getfield        ata.H:Ljava/nio/ByteOrder;
        //  1879: invokestatic    asy.e:(ILjava/nio/ByteOrder;)Lasy;
        //  1882: astore          7
        //  1884: aload_0        
        //  1885: getfield        ata.F:[Ljava/util/HashMap;
        //  1888: iconst_0       
        //  1889: aaload         
        //  1890: ldc             "ImageLength"
        //  1892: aload_1        
        //  1893: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1896: pop            
        //  1897: aload_0        
        //  1898: getfield        ata.F:[Ljava/util/HashMap;
        //  1901: iconst_0       
        //  1902: aaload         
        //  1903: ldc             "ImageWidth"
        //  1905: aload           7
        //  1907: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1910: pop            
        //  1911: goto            1937
        //  1914: aload_1        
        //  1915: iload           13
        //  1917: invokevirtual   asx.b:(I)V
        //  1920: iinc            2, 1
        //  1923: goto            1827
        //  1926: iload_2        
        //  1927: bipush          14
        //  1929: if_icmpne       1937
        //  1932: aload_0        
        //  1933: aload_1        
        //  1934: invokespecial   ata.g:(Lasx;)V
        //  1937: aload_0        
        //  1938: invokespecial   ata.d:()V
        //  1941: return         
        //  1942: astore_1       
        //  1943: aload_0        
        //  1944: invokespecial   ata.d:()V
        //  1947: aload_1        
        //  1948: athrow         
        //  1949: astore_1       
        //  1950: aload_0        
        //  1951: invokespecial   ata.d:()V
        //  1954: return         
        //  1955: astore_1       
        //  1956: goto            1625
        //  1959: astore          7
        //  1961: goto            1074
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  2      7      1949   1955   Ljava/io/IOException;
        //  2      7      1949   1955   Ljava/lang/UnsupportedOperationException;
        //  2      7      1942   1949   Any
        //  13     26     1949   1955   Ljava/io/IOException;
        //  13     26     1949   1955   Ljava/lang/UnsupportedOperationException;
        //  13     26     1942   1949   Any
        //  32     74     1949   1955   Ljava/io/IOException;
        //  32     74     1949   1955   Ljava/lang/UnsupportedOperationException;
        //  32     74     1942   1949   Any
        //  76     83     1949   1955   Ljava/io/IOException;
        //  76     83     1949   1955   Ljava/lang/UnsupportedOperationException;
        //  76     83     1942   1949   Any
        //  107    117    1949   1955   Ljava/io/IOException;
        //  107    117    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  107    117    1942   1949   Any
        //  119    125    1949   1955   Ljava/io/IOException;
        //  119    125    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  119    125    1942   1949   Any
        //  135    142    1949   1955   Ljava/io/IOException;
        //  135    142    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  135    142    1942   1949   Any
        //  153    163    258    261    Ljava/lang/Exception;
        //  153    163    237    245    Any
        //  163    186    232    237    Ljava/lang/Exception;
        //  163    186    224    232    Any
        //  210    214    1949   1955   Ljava/io/IOException;
        //  210    214    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  210    214    1942   1949   Any
        //  250    255    1949   1955   Ljava/io/IOException;
        //  250    255    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  250    255    1942   1949   Any
        //  255    258    1949   1955   Ljava/io/IOException;
        //  255    258    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  255    258    1942   1949   Any
        //  265    269    1949   1955   Ljava/io/IOException;
        //  265    269    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  265    269    1942   1949   Any
        //  269    279    344    347    Ljava/lang/Exception;
        //  269    279    328    333    Any
        //  279    302    323    328    Ljava/lang/Exception;
        //  279    302    318    323    Any
        //  302    306    1949   1955   Ljava/io/IOException;
        //  302    306    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  302    306    1942   1949   Any
        //  337    341    1949   1955   Ljava/io/IOException;
        //  337    341    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  337    341    1942   1949   Any
        //  341    344    1949   1955   Ljava/io/IOException;
        //  341    344    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  341    344    1942   1949   Any
        //  351    355    1949   1955   Ljava/io/IOException;
        //  351    355    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  351    355    1942   1949   Any
        //  357    364    1949   1955   Ljava/io/IOException;
        //  357    364    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  357    364    1942   1949   Any
        //  382    389    1949   1955   Ljava/io/IOException;
        //  382    389    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  382    389    1942   1949   Any
        //  417    424    1949   1955   Ljava/io/IOException;
        //  417    424    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  417    424    1942   1949   Any
        //  429    434    1949   1955   Ljava/io/IOException;
        //  429    434    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  429    434    1942   1949   Any
        //  494    499    1949   1955   Ljava/io/IOException;
        //  494    499    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  494    499    1942   1949   Any
        //  525    543    1949   1955   Ljava/io/IOException;
        //  525    543    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  525    543    1942   1949   Any
        //  549    567    1949   1955   Ljava/io/IOException;
        //  549    567    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  549    567    1942   1949   Any
        //  567    654    1055   1069   Ljava/lang/RuntimeException;
        //  567    654    1051   1076   Any
        //  657    694    1055   1069   Ljava/lang/RuntimeException;
        //  657    694    1051   1076   Any
        //  707    731    1055   1069   Ljava/lang/RuntimeException;
        //  707    731    1051   1076   Any
        //  735    758    1055   1069   Ljava/lang/RuntimeException;
        //  735    758    1051   1076   Any
        //  763    769    1055   1069   Ljava/lang/RuntimeException;
        //  763    769    1051   1076   Any
        //  808    828    1055   1069   Ljava/lang/RuntimeException;
        //  808    828    1051   1076   Any
        //  838    850    1055   1069   Ljava/lang/RuntimeException;
        //  838    850    1051   1076   Any
        //  856    911    1055   1069   Ljava/lang/RuntimeException;
        //  856    911    1051   1076   Any
        //  914    927    1055   1069   Ljava/lang/RuntimeException;
        //  914    927    1051   1076   Any
        //  927    940    1055   1069   Ljava/lang/RuntimeException;
        //  927    940    1051   1076   Any
        //  940    957    1055   1069   Ljava/lang/RuntimeException;
        //  940    957    1051   1076   Any
        //  966    977    1055   1069   Ljava/lang/RuntimeException;
        //  966    977    1051   1076   Any
        //  981    1043   1055   1069   Ljava/lang/RuntimeException;
        //  981    1043   1051   1076   Any
        //  1043   1048   1955   1959   Ljava/io/IOException;
        //  1043   1048   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1043   1048   1942   1949   Any
        //  1056   1069   1051   1076   Any
        //  1069   1074   1959   1964   Ljava/io/IOException;
        //  1069   1074   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1069   1074   1942   1949   Any
        //  1074   1076   1949   1955   Ljava/io/IOException;
        //  1074   1076   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1074   1076   1942   1949   Any
        //  1076   1089   1949   1955   Ljava/io/IOException;
        //  1076   1089   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1076   1089   1942   1949   Any
        //  1095   1118   1949   1955   Ljava/io/IOException;
        //  1095   1118   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1095   1118   1942   1949   Any
        //  1123   1209   1949   1955   Ljava/io/IOException;
        //  1123   1209   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1123   1209   1942   1949   Any
        //  1212   1229   1949   1955   Ljava/io/IOException;
        //  1212   1229   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1212   1229   1942   1949   Any
        //  1229   1271   1949   1955   Ljava/io/IOException;
        //  1229   1271   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1229   1271   1942   1949   Any
        //  1280   1309   1949   1955   Ljava/io/IOException;
        //  1280   1309   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1280   1309   1942   1949   Any
        //  1309   1326   1949   1955   Ljava/io/IOException;
        //  1309   1326   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1309   1326   1942   1949   Any
        //  1330   1342   1949   1955   Ljava/io/IOException;
        //  1330   1342   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1330   1342   1942   1949   Any
        //  1346   1352   1949   1955   Ljava/io/IOException;
        //  1346   1352   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1346   1352   1942   1949   Any
        //  1429   1475   1949   1955   Ljava/io/IOException;
        //  1429   1475   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1429   1475   1942   1949   Any
        //  1478   1498   1949   1955   Ljava/io/IOException;
        //  1478   1498   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1478   1498   1942   1949   Any
        //  1507   1529   1949   1955   Ljava/io/IOException;
        //  1507   1529   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1507   1529   1942   1949   Any
        //  1533   1559   1949   1955   Ljava/io/IOException;
        //  1533   1559   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1533   1559   1942   1949   Any
        //  1559   1592   1949   1955   Ljava/io/IOException;
        //  1559   1592   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1559   1592   1942   1949   Any
        //  1601   1616   1949   1955   Ljava/io/IOException;
        //  1601   1616   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1601   1616   1942   1949   Any
        //  1619   1625   1949   1955   Ljava/io/IOException;
        //  1619   1625   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1619   1625   1942   1949   Any
        //  1625   1641   1949   1955   Ljava/io/IOException;
        //  1625   1641   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1625   1641   1942   1949   Any
        //  1644   1659   1949   1955   Ljava/io/IOException;
        //  1644   1659   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1644   1659   1942   1949   Any
        //  1664   1671   1949   1955   Ljava/io/IOException;
        //  1664   1671   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1664   1671   1942   1949   Any
        //  1680   1685   1949   1955   Ljava/io/IOException;
        //  1680   1685   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1680   1685   1942   1949   Any
        //  1694   1825   1949   1955   Ljava/io/IOException;
        //  1694   1825   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1694   1825   1942   1949   Any
        //  1832   1911   1949   1955   Ljava/io/IOException;
        //  1832   1911   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1832   1911   1942   1949   Any
        //  1914   1920   1949   1955   Ljava/io/IOException;
        //  1914   1920   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1914   1920   1942   1949   Any
        //  1932   1937   1949   1955   Ljava/io/IOException;
        //  1932   1937   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1932   1937   1942   1949   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1023, Size: 1023
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void k(final asx asx) {
        final ByteOrder v = v(asx);
        this.H = v;
        asx.c = v;
        final int unsignedShort = asx.readUnsignedShort();
        final int e = this.E;
        if (e != 7 && e != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int int1 = asx.readInt();
        if (int1 >= 8) {
            int1 -= 8;
            if (int1 > 0) {
                asx.b(int1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid first Ifd offset: ");
        sb.append(int1);
        throw new IOException(sb.toString());
    }
    
    private final void l(final byte[] array, final int n) {
        final asx asx = new asx(array, null);
        this.k(asx);
        this.s(asx, n);
    }
    
    private final void m(final int n, final String s, final String s2) {
        if (!this.F[n].isEmpty() && this.F[n].get(s) != null) {
            final HashMap hashMap = this.F[n];
            hashMap.put(s2, hashMap.get(s));
            this.F[n].remove(s);
        }
    }
    
    private final void n(final asx asx) {
        final HashMap hashMap = this.F[4];
        final asy asy = hashMap.get("Compression");
        if (asy != null) {
            final int a = asy.a(this.H);
            if (a != 1) {
                if (a == 6) {
                    this.h(asx, hashMap);
                    return;
                }
                if (a != 7) {
                    return;
                }
            }
            final asy asy2 = hashMap.get("BitsPerSample");
            if (asy2 != null) {
                final int[] array = (int[])asy2.f(this.H);
                final int[] a2 = ata.a;
                if (!Arrays.equals(a2, array)) {
                    if (this.E != 3) {
                        return;
                    }
                    final asy asy3 = hashMap.get("PhotometricInterpretation");
                    if (asy3 == null) {
                        return;
                    }
                    final int a3 = asy3.a(this.H);
                    if (a3 == 1) {
                        if (!Arrays.equals(array, ata.b)) {
                            return;
                        }
                    }
                    else if (a3 != 6 || !Arrays.equals(array, a2)) {
                        return;
                    }
                }
                this.i(asx, hashMap);
            }
            return;
        }
        this.h(asx, hashMap);
    }
    
    private final void o(final int n, final int n2) {
        if (!this.F[n].isEmpty()) {
            if (!this.F[n2].isEmpty()) {
                final asy asy = this.F[n].get("ImageLength");
                final asy asy2 = this.F[n].get("ImageWidth");
                final asy asy3 = this.F[n2].get("ImageLength");
                final asy asy4 = this.F[n2].get("ImageWidth");
                if (asy != null) {
                    if (asy2 != null) {
                        if (asy3 != null && asy4 != null) {
                            final int a = asy.a(this.H);
                            final int a2 = asy2.a(this.H);
                            final int a3 = asy3.a(this.H);
                            final int a4 = asy4.a(this.H);
                            if (a < a3 && a2 < a4) {
                                final HashMap[] f = this.F;
                                final HashMap hashMap = f[n];
                                f[n] = f[n2];
                                f[n2] = hashMap;
                            }
                        }
                    }
                }
            }
        }
    }
    
    private final void p() {
        this.o(0, 5);
        this.o(0, 4);
        this.o(5, 4);
        final asy asy = this.F[1].get("PixelXDimension");
        final asy asy2 = this.F[1].get("PixelYDimension");
        if (asy != null && asy2 != null) {
            this.F[0].put("ImageWidth", asy);
            this.F[0].put("ImageLength", asy2);
        }
        if (this.F[4].isEmpty() && this.q(this.F[5])) {
            final HashMap[] f = this.F;
            f[4] = f[5];
            f[5] = new HashMap();
        }
        this.q(this.F[4]);
        this.m(0, "ThumbnailOrientation", "Orientation");
        this.m(0, "ThumbnailImageLength", "ImageLength");
        this.m(0, "ThumbnailImageWidth", "ImageWidth");
        this.m(5, "ThumbnailOrientation", "Orientation");
        this.m(5, "ThumbnailImageLength", "ImageLength");
        this.m(5, "ThumbnailImageWidth", "ImageWidth");
        this.m(4, "Orientation", "ThumbnailOrientation");
        this.m(4, "ImageLength", "ThumbnailImageLength");
        this.m(4, "ImageWidth", "ThumbnailImageWidth");
    }
    
    private final boolean q(final HashMap hashMap) {
        final asy asy = hashMap.get("ImageLength");
        final asy asy2 = hashMap.get("ImageWidth");
        if (asy != null && asy2 != null) {
            final int a = asy.a(this.H);
            final int a2 = asy2.a(this.H);
            if (a <= 512 && a2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    private final void r(asx asx) {
        this.k(asx);
        this.s(asx, 0);
        this.t(asx, 0);
        this.t(asx, 5);
        this.t(asx, 4);
        this.p();
        if (this.E == 8) {
            final asy asy = this.F[1].get("MakerNote");
            if (asy != null) {
                asx = new asx(asy.d, null);
                asx.c = this.H;
                asx.b(6);
                this.s(asx, 9);
                final asy asy2 = this.F[9].get("ColorSpace");
                if (asy2 != null) {
                    this.F[1].put("ColorSpace", asy2);
                }
            }
        }
    }
    
    private final void s(final asx asx, int int1) {
        this.G.add(asx.b);
        final short short1 = asx.readShort();
        if (short1 > 0) {
            short n = 0;
            while (true) {
                final int n2 = int1;
                if (n >= short1) {
                    break;
                }
                final int unsignedShort = asx.readUnsignedShort();
                int unsignedShort2 = asx.readUnsignedShort();
                final int int2 = asx.readInt();
                final long n3 = asx.b + 4L;
                final HashMap hashMap = ata.x[n2];
                final Integer value = unsignedShort;
                final aerj aerj = hashMap.get(value);
                long n7 = 0L;
                boolean b = false;
                Label_0304: {
                    Label_0102: {
                        Label_0099: {
                            if (aerj != null && unsignedShort2 > 0) {
                                final int[] e = ata.e;
                                final int length = e.length;
                                if (unsignedShort2 < 14) {
                                    final int c = aerj.c;
                                    Label_0231: {
                                        if (c != 7) {
                                            if (unsignedShort2 != 7) {
                                                if (c != unsignedShort2) {
                                                    final int a = aerj.a;
                                                    if (a != unsignedShort2) {
                                                        int n4 = a;
                                                        Label_0207: {
                                                            if (c != 4) {
                                                                if ((n4 = a) != 4) {
                                                                    break Label_0207;
                                                                }
                                                                n4 = 4;
                                                            }
                                                            if (unsignedShort2 == 3) {
                                                                break Label_0231;
                                                            }
                                                        }
                                                        if (c != 9 && n4 != 9) {
                                                            break Label_0099;
                                                        }
                                                        if (unsignedShort2 != 8) {
                                                            break Label_0099;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    int n5;
                                    if ((n5 = unsignedShort2) == 7) {
                                        n5 = c;
                                    }
                                    final long n6 = n7 = int2 * (long)e[n5];
                                    unsignedShort2 = n5;
                                    if (n6 < 0L) {
                                        break Label_0102;
                                    }
                                    if (n6 > 2147483647L) {
                                        n7 = n6;
                                        unsignedShort2 = n5;
                                        break Label_0102;
                                    }
                                    b = true;
                                    unsignedShort2 = n5;
                                    n7 = n6;
                                    break Label_0304;
                                }
                            }
                        }
                        n7 = 0L;
                    }
                    b = false;
                }
                if (!b) {
                    asx.c(n3);
                }
                else {
                    int n8;
                    if (n7 > 4L) {
                        final int int3 = asx.readInt();
                        Label_0510: {
                            if (this.E == 7) {
                                if ("MakerNote".equals(aerj.d)) {
                                    this.K = int3;
                                }
                                else if (n2 == 6) {
                                    if ("ThumbnailImage".equals(aerj.d)) {
                                        this.L = int3;
                                        this.M = int2;
                                        final asy e2 = asy.e(6, this.H);
                                        final asy c2 = asy.c(this.L, this.H);
                                        final asy c3 = asy.c(this.M, this.H);
                                        this.F[4].put("Compression", e2);
                                        this.F[4].put("JPEGInterchangeFormat", c2);
                                        this.F[4].put("JPEGInterchangeFormatLength", c3);
                                    }
                                    n8 = 6;
                                    break Label_0510;
                                }
                            }
                            n8 = int1;
                        }
                        asx.c(int3);
                    }
                    else {
                        n8 = int1;
                    }
                    final Integer n9 = ata.A.get(value);
                    if (n9 != null) {
                        long a2 = 0L;
                        Label_0620: {
                            int n10;
                            if (unsignedShort2 != 3) {
                                if (unsignedShort2 == 4) {
                                    a2 = asx.a();
                                    break Label_0620;
                                }
                                if (unsignedShort2 != 8) {
                                    if (unsignedShort2 != 9 && unsignedShort2 != 13) {
                                        a2 = -1L;
                                        break Label_0620;
                                    }
                                    n10 = asx.readInt();
                                }
                                else {
                                    n10 = asx.readShort();
                                }
                            }
                            else {
                                n10 = asx.readUnsignedShort();
                            }
                            a2 = n10;
                        }
                        if (a2 > 0L && !this.G.contains((int)a2)) {
                            asx.c(a2);
                            this.s(asx, n9);
                        }
                        asx.c(n3);
                    }
                    else {
                        final int b2 = asx.b;
                        final int j = this.J;
                        final byte[] array = new byte[(int)n7];
                        asx.readFully(array);
                        final asy asy = new asy(unsignedShort2, int2, b2 + j, array);
                        this.F[n8].put(aerj.d, asy);
                        if ("DNGVersion".equals(aerj.d)) {
                            this.E = 3;
                        }
                        if ((("Make".equals(aerj.d) || "Model".equals(aerj.d)) && asy.g(this.H).contains("PENTAX")) || ("Compression".equals(aerj.d) && asy.a(this.H) == 65535)) {
                            this.E = 8;
                        }
                        if (asx.b != n3) {
                            asx.c(n3);
                        }
                    }
                }
                ++n;
            }
            int1 = asx.readInt();
            final long n11 = int1;
            if (n11 > 0L && !this.G.contains(int1)) {
                asx.c(n11);
                if (this.F[4].isEmpty()) {
                    this.s(asx, 4);
                    return;
                }
                if (this.F[5].isEmpty()) {
                    this.s(asx, 5);
                }
            }
        }
    }
    
    private final void t(final asx asx, final int n) {
        final asy asy = this.F[n].get("DefaultCropSize");
        final asy asy2 = this.F[n].get("SensorTopBorder");
        final asy asy3 = this.F[n].get("SensorLeftBorder");
        final asy asy4 = this.F[n].get("SensorBottomBorder");
        final asy asy5 = this.F[n].get("SensorRightBorder");
        if (asy != null) {
            asy asy6;
            asy asy7;
            if (asy.a == 5) {
                final asz[] array = (asz[])asy.f(this.H);
                if (array == null || array.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(array))));
                    return;
                }
                asy6 = asy.d(array[0], this.H);
                asy7 = asy.d(array[1], this.H);
            }
            else {
                final int[] array2 = (int[])asy.f(this.H);
                if (array2 == null || array2.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(array2))));
                    return;
                }
                asy6 = asy.e(array2[0], this.H);
                asy7 = asy.e(array2[1], this.H);
            }
            this.F[n].put("ImageWidth", asy6);
            this.F[n].put("ImageLength", asy7);
            return;
        }
        if (asy2 != null && asy3 != null && asy4 != null && asy5 != null) {
            final int a = asy2.a(this.H);
            final int a2 = asy4.a(this.H);
            final int a3 = asy5.a(this.H);
            final int a4 = asy3.a(this.H);
            if (a2 > a && a3 > a4) {
                final asy e = asy.e(a2 - a, this.H);
                final asy e2 = asy.e(a3 - a4, this.H);
                this.F[n].put("ImageLength", e);
                this.F[n].put("ImageWidth", e2);
            }
        }
        else {
            final asy asy8 = this.F[n].get("ImageLength");
            final asy asy9 = this.F[n].get("ImageWidth");
            if (asy8 == null || asy9 == null) {
                final asy asy10 = this.F[n].get("JPEGInterchangeFormat");
                final asy asy11 = this.F[n].get("JPEGInterchangeFormatLength");
                if (asy10 != null && asy11 != null) {
                    final int a5 = asy10.a(this.H);
                    final int a6 = asy10.a(this.H);
                    asx.c(a5);
                    final byte[] array3 = new byte[a6];
                    asx.readFully(array3);
                    this.e(new asx(array3), a5, n);
                }
            }
        }
    }
    
    private static final boolean u(byte[] array) {
        final InputStream inputStream = null;
        InputStream inputStream2 = null;
        try {
            final asx asx = new asx(array);
            try {
                long long1 = asx.readInt();
                array = new byte[4];
                asx.readFully(array);
                if (!Arrays.equals(array, ata.j)) {
                    asx.close();
                    return false;
                }
                long n;
                if (long1 == 1L) {
                    long1 = asx.readLong();
                    n = 16L;
                    if (long1 < 16L) {
                        asx.close();
                        return false;
                    }
                }
                else {
                    n = 8L;
                }
                long n2 = long1;
                if (long1 > 5000L) {
                    n2 = 5000L;
                }
                final long n3 = n2 - n;
                if (n3 < 8L) {
                    asx.close();
                    return false;
                }
                array = new byte[4];
                long n4 = 0L;
                int n5 = 0;
                int n6 = 0;
                while (n4 < n3 >> 2) {
                    try {
                        asx.readFully(array);
                        int n7;
                        if (n4 == 1L) {
                            n7 = n5;
                        }
                        else {
                            int n8;
                            if (Arrays.equals(array, ata.k)) {
                                n8 = 1;
                            }
                            else {
                                final boolean equals = Arrays.equals(array, ata.l);
                                n8 = n6;
                                if (equals) {
                                    n5 = 1;
                                    n8 = n6;
                                }
                            }
                            n7 = n5;
                            if ((n6 = n8) != 0) {
                                n7 = n5;
                                n6 = n8;
                                if (n5 != 0) {
                                    asx.close();
                                    return true;
                                }
                            }
                        }
                        ++n4;
                        n5 = n7;
                        continue;
                    }
                    catch (final EOFException ex) {
                        asx.close();
                        return false;
                    }
                    break;
                }
                asx.close();
                return false;
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {
            inputStream2 = inputStream;
        }
        if (inputStream2 != null) {
            inputStream2.close();
        }
        return false;
    }
    
    private static final ByteOrder v(final asx asx) {
        final short short1 = asx.readShort();
        if (short1 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(short1))));
    }
    
    public final String a(final String s) {
        final asy c = this.c(s);
        Label_0480: {
            if (c == null) {
                break Label_0480;
            }
            if (!ata.z.contains(s)) {
                return c.g(this.H);
            }
            if (s.equals("GPSTimeStamp")) {
                final int a = c.a;
                if (a != 5 && a != 10) {
                    final StringBuilder sb = new StringBuilder("GPS Timestamp format is not rational. format=");
                    sb.append(c.a);
                    Log.w("ExifInterface", sb.toString());
                    return null;
                }
                final asz[] array = (asz[])c.f(this.H);
                if (array != null && array.length == 3) {
                    final asz asz = array[0];
                    final int n = (int)(asz.a / (float)asz.b);
                    final asz asz2 = array[1];
                    final int n2 = (int)(asz2.a / (float)asz2.b);
                    final asz asz3 = array[2];
                    return String.format("%02d:%02d:%02d", n, n2, (int)(asz3.a / (float)asz3.b));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(array))));
                return null;
            }
            try {
                final Object f = c.f(this.H);
                if (f != null) {
                    double double1;
                    if (f instanceof String) {
                        double1 = Double.parseDouble((String)f);
                    }
                    else if (f instanceof long[]) {
                        final long[] array2 = (long[])f;
                        if (array2.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = (double)array2[0];
                    }
                    else if (f instanceof int[]) {
                        final int[] array3 = (int[])f;
                        if (array3.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = array3[0];
                    }
                    else if (f instanceof double[]) {
                        final double[] array4 = (double[])f;
                        if (array4.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        double1 = array4[0];
                    }
                    else {
                        if (!(f instanceof asz[])) {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                        final asz[] array5 = (asz[])f;
                        if (array5.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        final asz asz4 = array5[0];
                        final double n3 = (double)asz4.a;
                        final double n4 = (double)asz4.b;
                        Double.isNaN(n3);
                        Double.isNaN(n4);
                        double1 = n3 / n4;
                    }
                    return Double.toString(double1);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
                return null;
            }
            catch (final NumberFormatException ex) {
                return null;
            }
        }
    }
    
    public final int b() {
        final asy c = this.c("Orientation");
        if (c == null) {
            return 1;
        }
        try {
            return c.a(this.H);
        }
        catch (final NumberFormatException ex) {
            return 1;
        }
    }
}

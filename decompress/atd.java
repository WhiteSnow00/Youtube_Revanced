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

public final class atd
{
    private static final HashMap A;
    private static final byte[] B;
    private static final aevc[] N;
    private static final aevc[] O;
    private static final aevc[] P;
    private static final aevc[] Q;
    private static final aevc[] R;
    private static final aevc S;
    private static final aevc[] T;
    private static final aevc[] U;
    private static final aevc[] V;
    private static final aevc[] W;
    private static final aevc[] X;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final Charset g;
    static final byte[] h;
    static final aevc[][] i;
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
        final aevc[] array = N = new aevc[] { new aevc("NewSubfileType", 254, 4), new aevc("SubfileType", 255, 4), new aevc("ImageWidth", 256, 3, 4), new aevc("ImageLength", 257, 3, 4), new aevc("BitsPerSample", 258, 3), new aevc("Compression", 259, 3), new aevc("PhotometricInterpretation", 262, 3), new aevc("ImageDescription", 270, 2), new aevc("Make", 271, 2), new aevc("Model", 272, 2), new aevc("StripOffsets", 273, 3, 4), new aevc("Orientation", 274, 3), new aevc("SamplesPerPixel", 277, 3), new aevc("RowsPerStrip", 278, 3, 4), new aevc("StripByteCounts", 279, 3, 4), new aevc("XResolution", 282, 5), new aevc("YResolution", 283, 5), new aevc("PlanarConfiguration", 284, 3), new aevc("ResolutionUnit", 296, 3), new aevc("TransferFunction", 301, 3), new aevc("Software", 305, 2), new aevc("DateTime", 306, 2), new aevc("Artist", 315, 2), new aevc("WhitePoint", 318, 5), new aevc("PrimaryChromaticities", 319, 5), new aevc("SubIFDPointer", 330, 4), new aevc("JPEGInterchangeFormat", 513, 4), new aevc("JPEGInterchangeFormatLength", 514, 4), new aevc("YCbCrCoefficients", 529, 5), new aevc("YCbCrSubSampling", 530, 3), new aevc("YCbCrPositioning", 531, 3), new aevc("ReferenceBlackWhite", 532, 5), new aevc("Copyright", 33432, 2), new aevc("ExifIFDPointer", 34665, 4), new aevc("GPSInfoIFDPointer", 34853, 4), new aevc("SensorTopBorder", 4, 4), new aevc("SensorLeftBorder", 5, 4), new aevc("SensorBottomBorder", 6, 4), new aevc("SensorRightBorder", 7, 4), new aevc("ISO", 23, 3), new aevc("JpgFromRaw", 46, 7), new aevc("Xmp", 700, 1) };
        final aevc[] array2 = O = new aevc[] { new aevc("ExposureTime", 33434, 5), new aevc("FNumber", 33437, 5), new aevc("ExposureProgram", 34850, 3), new aevc("SpectralSensitivity", 34852, 2), new aevc("PhotographicSensitivity", 34855, 3), new aevc("OECF", 34856, 7), new aevc("SensitivityType", 34864, 3), new aevc("StandardOutputSensitivity", 34865, 4), new aevc("RecommendedExposureIndex", 34866, 4), new aevc("ISOSpeed", 34867, 4), new aevc("ISOSpeedLatitudeyyy", 34868, 4), new aevc("ISOSpeedLatitudezzz", 34869, 4), new aevc("ExifVersion", 36864, 2), new aevc("DateTimeOriginal", 36867, 2), new aevc("DateTimeDigitized", 36868, 2), new aevc("OffsetTime", 36880, 2), new aevc("OffsetTimeOriginal", 36881, 2), new aevc("OffsetTimeDigitized", 36882, 2), new aevc("ComponentsConfiguration", 37121, 7), new aevc("CompressedBitsPerPixel", 37122, 5), new aevc("ShutterSpeedValue", 37377, 10), new aevc("ApertureValue", 37378, 5), new aevc("BrightnessValue", 37379, 10), new aevc("ExposureBiasValue", 37380, 10), new aevc("MaxApertureValue", 37381, 5), new aevc("SubjectDistance", 37382, 5), new aevc("MeteringMode", 37383, 3), new aevc("LightSource", 37384, 3), new aevc("Flash", 37385, 3), new aevc("FocalLength", 37386, 5), new aevc("SubjectArea", 37396, 3), new aevc("MakerNote", 37500, 7), new aevc("UserComment", 37510, 7), new aevc("SubSecTime", 37520, 2), new aevc("SubSecTimeOriginal", 37521, 2), new aevc("SubSecTimeDigitized", 37522, 2), new aevc("FlashpixVersion", 40960, 7), new aevc("ColorSpace", 40961, 3), new aevc("PixelXDimension", 40962, 3, 4), new aevc("PixelYDimension", 40963, 3, 4), new aevc("RelatedSoundFile", 40964, 2), new aevc("InteroperabilityIFDPointer", 40965, 4), new aevc("FlashEnergy", 41483, 5), new aevc("SpatialFrequencyResponse", 41484, 7), new aevc("FocalPlaneXResolution", 41486, 5), new aevc("FocalPlaneYResolution", 41487, 5), new aevc("FocalPlaneResolutionUnit", 41488, 3), new aevc("SubjectLocation", 41492, 3), new aevc("ExposureIndex", 41493, 5), new aevc("SensingMethod", 41495, 3), new aevc("FileSource", 41728, 7), new aevc("SceneType", 41729, 7), new aevc("CFAPattern", 41730, 7), new aevc("CustomRendered", 41985, 3), new aevc("ExposureMode", 41986, 3), new aevc("WhiteBalance", 41987, 3), new aevc("DigitalZoomRatio", 41988, 5), new aevc("FocalLengthIn35mmFilm", 41989, 3), new aevc("SceneCaptureType", 41990, 3), new aevc("GainControl", 41991, 3), new aevc("Contrast", 41992, 3), new aevc("Saturation", 41993, 3), new aevc("Sharpness", 41994, 3), new aevc("DeviceSettingDescription", 41995, 7), new aevc("SubjectDistanceRange", 41996, 3), new aevc("ImageUniqueID", 42016, 2), new aevc("CameraOwnerName", 42032, 2), new aevc("BodySerialNumber", 42033, 2), new aevc("LensSpecification", 42034, 5), new aevc("LensMake", 42035, 2), new aevc("LensModel", 42036, 2), new aevc("Gamma", 42240, 5), new aevc("DNGVersion", 50706, 1), new aevc("DefaultCropSize", 50720, 3, 4) };
        final aevc[] array3 = P = new aevc[] { new aevc("GPSVersionID", 0, 1), new aevc("GPSLatitudeRef", 1, 2), new aevc("GPSLatitude", 2, 5, 10), new aevc("GPSLongitudeRef", 3, 2), new aevc("GPSLongitude", 4, 5, 10), new aevc("GPSAltitudeRef", 5, 1), new aevc("GPSAltitude", 6, 5), new aevc("GPSTimeStamp", 7, 5), new aevc("GPSSatellites", 8, 2), new aevc("GPSStatus", 9, 2), new aevc("GPSMeasureMode", 10, 2), new aevc("GPSDOP", 11, 5), new aevc("GPSSpeedRef", 12, 2), new aevc("GPSSpeed", 13, 5), new aevc("GPSTrackRef", 14, 2), new aevc("GPSTrack", 15, 5), new aevc("GPSImgDirectionRef", 16, 2), new aevc("GPSImgDirection", 17, 5), new aevc("GPSMapDatum", 18, 2), new aevc("GPSDestLatitudeRef", 19, 2), new aevc("GPSDestLatitude", 20, 5), new aevc("GPSDestLongitudeRef", 21, 2), new aevc("GPSDestLongitude", 22, 5), new aevc("GPSDestBearingRef", 23, 2), new aevc("GPSDestBearing", 24, 5), new aevc("GPSDestDistanceRef", 25, 2), new aevc("GPSDestDistance", 26, 5), new aevc("GPSProcessingMethod", 27, 7), new aevc("GPSAreaInformation", 28, 7), new aevc("GPSDateStamp", 29, 2), new aevc("GPSDifferential", 30, 3), new aevc("GPSHPositioningError", 31, 5) };
        final aevc[] array4 = Q = new aevc[] { new aevc("InteroperabilityIndex", 1, 2) };
        final aevc[] array5 = R = new aevc[] { new aevc("NewSubfileType", 254, 4), new aevc("SubfileType", 255, 4), new aevc("ThumbnailImageWidth", 256, 3, 4), new aevc("ThumbnailImageLength", 257, 3, 4), new aevc("BitsPerSample", 258, 3), new aevc("Compression", 259, 3), new aevc("PhotometricInterpretation", 262, 3), new aevc("ImageDescription", 270, 2), new aevc("Make", 271, 2), new aevc("Model", 272, 2), new aevc("StripOffsets", 273, 3, 4), new aevc("ThumbnailOrientation", 274, 3), new aevc("SamplesPerPixel", 277, 3), new aevc("RowsPerStrip", 278, 3, 4), new aevc("StripByteCounts", 279, 3, 4), new aevc("XResolution", 282, 5), new aevc("YResolution", 283, 5), new aevc("PlanarConfiguration", 284, 3), new aevc("ResolutionUnit", 296, 3), new aevc("TransferFunction", 301, 3), new aevc("Software", 305, 2), new aevc("DateTime", 306, 2), new aevc("Artist", 315, 2), new aevc("WhitePoint", 318, 5), new aevc("PrimaryChromaticities", 319, 5), new aevc("SubIFDPointer", 330, 4), new aevc("JPEGInterchangeFormat", 513, 4), new aevc("JPEGInterchangeFormatLength", 514, 4), new aevc("YCbCrCoefficients", 529, 5), new aevc("YCbCrSubSampling", 530, 3), new aevc("YCbCrPositioning", 531, 3), new aevc("ReferenceBlackWhite", 532, 5), new aevc("Copyright", 33432, 2), new aevc("ExifIFDPointer", 34665, 4), new aevc("GPSInfoIFDPointer", 34853, 4), new aevc("DNGVersion", 50706, 1), new aevc("DefaultCropSize", 50720, 3, 4) };
        S = new aevc("StripOffsets", 273, 3);
        i = new aevc[][] { array, array2, array3, array4, array5, array, T = new aevc[] { new aevc("ThumbnailImage", 256, 7), new aevc("CameraSettingsIFDPointer", 8224, 4), new aevc("ImageProcessingIFDPointer", 8256, 4) }, U = new aevc[] { new aevc("PreviewImageStart", 257, 4), new aevc("PreviewImageLength", 258, 4) }, V = new aevc[] { new aevc("AspectFrame", 4371, 3) }, W = new aevc[] { new aevc("ColorSpace", 55, 3) } };
        X = new aevc[] { new aevc("SubIFDPointer", 330, 4), new aevc("ExifIFDPointer", 34665, 4), new aevc("GPSInfoIFDPointer", 34853, 4), new aevc("InteroperabilityIFDPointer", 40965, 4), new aevc("CameraSettingsIFDPointer", 8224, 1), new aevc("ImageProcessingIFDPointer", 8256, 1) };
        x = new HashMap[10];
        y = new HashMap[10];
        z = new HashSet((Collection<? extends E>)Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        A = new HashMap();
        final Charset charset = g = Charset.forName("US-ASCII");
        h = "Exif\u0000\u0000".getBytes(charset);
        B = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset);
        (atd.v = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        (atd.w = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int n2 = 0;
        while (true) {
            final aevc[][] i2 = atd.i;
            final int length = i2.length;
            if (n2 >= 10) {
                break;
            }
            atd.x[n2] = new HashMap();
            atd.y[n2] = new HashMap();
            for (final aevc aevc : i2[n2]) {
                atd.x[n2].put(aevc.b, aevc);
                atd.y[n2].put(aevc.d, aevc);
            }
            ++n2;
        }
        final HashMap a2 = atd.A;
        final aevc[] x2 = atd.X;
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
    
    public atd(final InputStream inputStream) {
        final int length = atd.i.length;
        this.F = new HashMap[10];
        this.G = new HashSet(10);
        this.H = ByteOrder.BIG_ENDIAN;
        Label_0126: {
            if (inputStream == null) {
                break Label_0126;
            }
        Label_0110_Outer:
            while (true) {
                if (inputStream instanceof AssetManager$AssetInputStream) {
                    this.D = (AssetManager$AssetInputStream)inputStream;
                    this.C = null;
                    break Label_0120;
                }
                while (true) {
                    if (!(inputStream instanceof FileInputStream)) {
                        break Label_0110;
                    }
                    final FileInputStream fileInputStream = (FileInputStream)inputStream;
                    final FileDescriptor fd = fileInputStream.getFD();
                    try {
                        ate.a(fd, 0L, OsConstants.SEEK_CUR);
                        this.D = null;
                        this.C = fileInputStream.getFD();
                        this.j(inputStream);
                        return;
                        throw new NullPointerException("inputStream cannot be null");
                        this.D = null;
                        this.C = null;
                        continue Label_0110_Outer;
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
    
    private final atb c(final String s) {
        String s2 = s;
        if ("ISOSpeedRatings".equals(s)) {
            s2 = "PhotographicSensitivity";
        }
        int n = 0;
        while (true) {
            final int length = atd.i.length;
            if (n >= 10) {
                return null;
            }
            final atb atb = this.F[n].get(s2);
            if (atb != null) {
                return atb;
            }
            ++n;
        }
    }
    
    private final void d() {
        final String a = this.a("DateTimeOriginal");
        if (a != null && this.a("DateTime") == null) {
            this.F[0].put("DateTime", atb.b(a));
        }
        if (this.a("ImageWidth") == null) {
            this.F[0].put("ImageWidth", atb.c(0L, this.H));
        }
        if (this.a("ImageLength") == null) {
            this.F[0].put("ImageLength", atb.c(0L, this.H));
        }
        if (this.a("Orientation") == null) {
            this.F[0].put("Orientation", atb.c(0L, this.H));
        }
        if (this.a("LightSource") == null) {
            this.F[1].put("LightSource", atb.c(0L, this.H));
        }
    }
    
    private final void e(final ata ata, final int n, final int n2) {
        ata.c = ByteOrder.BIG_ENDIAN;
        final byte byte1 = ata.readByte();
        if (byte1 != -1) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(0xFF & byte1))));
        }
        if (ata.readByte() != -40) {
            throw new IOException("Invalid marker: ".concat(String.valueOf(Integer.toHexString(255))));
        }
        int n3 = 2;
        while (true) {
            final byte byte2 = ata.readByte();
            if (byte2 != -1) {
                throw new IOException("Invalid marker:".concat(String.valueOf(Integer.toHexString(0xFF & byte2))));
            }
            final byte byte3 = ata.readByte();
            if (byte3 == -39 || byte3 == -38) {
                ata.c = this.H;
                return;
            }
            final int n4 = ata.readUnsignedShort() - 2;
            int n5 = n3 + 4;
            if (n4 < 0) {
                throw new IOException("Invalid length");
            }
            int n6 = 0;
            Label_0564: {
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
                                                            break Label_0564;
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
                                ata.b(1);
                                final HashMap hashMap = this.F[n2];
                                final atb c = atb.c(ata.readUnsignedShort(), this.H);
                                String s;
                                if (n2 != 4) {
                                    s = "ImageLength";
                                }
                                else {
                                    s = "ThumbnailImageLength";
                                }
                                hashMap.put(s, c);
                                final HashMap hashMap2 = this.F[n2];
                                final atb c2 = atb.c(ata.readUnsignedShort(), this.H);
                                String s2;
                                if (n2 != 4) {
                                    s2 = "ImageWidth";
                                }
                                else {
                                    s2 = "ThumbnailImageWidth";
                                }
                                hashMap2.put(s2, c2);
                                n6 = n4 - 5;
                                break Label_0564;
                            }
                        }
                    }
                    else {
                        final byte[] array = new byte[n4];
                        ata.readFully(array);
                        n7 = n5;
                        if (this.a("UserComment") == null) {
                            this.F[1].put("UserComment", atb.b(new String(array, atd.g)));
                            n7 = n5;
                        }
                    }
                }
                else {
                    final byte[] array2 = new byte[n4];
                    ata.readFully(array2);
                    final byte[] h = atd.h;
                    if (apt.d(array2, h)) {
                        final byte[] copyOfRange = Arrays.copyOfRange(array2, h.length, n4);
                        this.J = n + n5 + h.length;
                        this.l(copyOfRange, n2);
                        this.n(new ata(copyOfRange));
                    }
                    else {
                        final byte[] b = atd.B;
                        if (apt.d(array2, b)) {
                            final int length = b.length;
                            final byte[] copyOfRange2 = Arrays.copyOfRange(array2, length, n4);
                            if (this.a("Xmp") == null) {
                                this.F[0].put("Xmp", new atb(1, copyOfRange2.length, n5 + length, copyOfRange2));
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
            ata.b(n6);
            n3 = n5 + n6;
        }
    }
    
    private final void f(final ata ata) {
        ata.c = ByteOrder.BIG_ENDIAN;
        final byte[] o = atd.o;
        final int length = o.length;
        ata.b(8);
        final int length2 = o.length;
        int n = 8;
        try {
            while (true) {
                final int int1 = ata.readInt();
                final byte[] array = new byte[4];
                ata.readFully(array);
                int j;
                if ((j = n + 8) == 16) {
                    if (!Arrays.equals(array, atd.q)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    j = 16;
                }
                if (Arrays.equals(array, atd.r)) {
                    return;
                }
                if (Arrays.equals(array, atd.p)) {
                    final byte[] array2 = new byte[int1];
                    ata.readFully(array2);
                    final int int2 = ata.readInt();
                    final CRC32 crc32 = new CRC32();
                    crc32.update(array);
                    crc32.update(array2);
                    if ((int)crc32.getValue() == int2) {
                        this.J = j;
                        this.l(array2, 0);
                        this.p();
                        this.n(new ata(array2));
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
                    ata.b(n2);
                    n = j + n2;
                }
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }
    
    private final void g(final ata ata) {
        ata.c = ByteOrder.LITTLE_ENDIAN;
        final int length = atd.s.length;
        ata.b(4);
        final int n = ata.readInt() + 8;
        final byte[] t = atd.t;
        final int length2 = t.length;
        ata.b(4);
        final int length3 = t.length;
        int n2 = 12;
        try {
            while (true) {
                final byte[] array = new byte[4];
                ata.readFully(array);
                final int int1 = ata.readInt();
                final int j = n2 + 8;
                if (Arrays.equals(atd.u, array)) {
                    final byte[] array2 = new byte[int1];
                    ata.readFully(array2);
                    this.J = j;
                    this.l(array2, 0);
                    this.n(new ata(array2));
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
                ata.b(n3);
                n2 = n4;
            }
        }
        catch (final EOFException ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }
    
    private final void h(final ata ata, final HashMap hashMap) {
        final atb atb = hashMap.get("JPEGInterchangeFormat");
        final atb atb2 = hashMap.get("JPEGInterchangeFormatLength");
        if (atb != null && atb2 != null) {
            final int a = atb.a(this.H);
            final int a2 = atb2.a(this.H);
            int n = a;
            if (this.E == 7) {
                n = a + this.K;
            }
            if (n > 0 && a2 > 0 && this.D == null && this.C == null) {
                final byte[] array = new byte[a2];
                ata.b(n);
                ata.readFully(array);
            }
        }
    }
    
    private final void i(final ata ata, final HashMap hashMap) {
        final atb atb = hashMap.get("StripOffsets");
        final atb atb2 = hashMap.get("StripByteCounts");
        if (atb != null && atb2 != null) {
            final long[] e = apt.e(atb.f(this.H));
            final long[] e2 = apt.e(atb2.f(this.H));
            if (e != null) {
                final int length = e.length;
                if (length != 0) {
                    if (e2 != null) {
                        final int length2 = e2.length;
                        if (length2 != 0) {
                            if (length != length2) {
                                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                return;
                            }
                            long n = 0L;
                            for (int i = 0; i < length2; ++i) {
                                n += e2[i];
                            }
                            final byte[] array = new byte[(int)n];
                            this.I = true;
                            int n2 = 0;
                            int n3 = 0;
                            int n4 = 0;
                            while (true) {
                                final int length3 = e.length;
                                if (n2 >= length3) {
                                    break;
                                }
                                final int n5 = (int)e[n2];
                                final int n6 = (int)e2[n2];
                                if (n2 < length3 - 1 && n5 + n6 != e[n2 + 1]) {
                                    this.I = false;
                                }
                                final int n7 = n5 - n3;
                                if (n7 < 0) {
                                    return;
                                }
                                try {
                                    ata.b(n7);
                                    final byte[] array2 = new byte[n6];
                                    ata.readFully(array2);
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
                                final long n8 = e[0];
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
        //     2: getstatic       atd.i:[[Laevc;
        //     5: arraylength    
        //     6: istore_3       
        //     7: iload_2        
        //     8: bipush          10
        //    10: if_icmpge       32
        //    13: aload_0        
        //    14: getfield        atd.F:[Ljava/util/HashMap;
        //    17: iload_2        
        //    18: new             Ljava/util/HashMap;
        //    21: dup            
        //    22: invokespecial   java/util/HashMap.<init>:()V
        //    25: aastore        
        //    26: iinc            2, 1
        //    29: goto            2
        //    32: new             Ljava/io/BufferedInputStream;
        //    35: astore          12
        //    37: aload           12
        //    39: aload_1        
        //    40: sipush          5000
        //    43: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //    46: aload           12
        //    48: sipush          5000
        //    51: invokevirtual   java/io/BufferedInputStream.mark:(I)V
        //    54: sipush          5000
        //    57: newarray        B
        //    59: astore          13
        //    61: aload           12
        //    63: aload           13
        //    65: invokevirtual   java/io/BufferedInputStream.read:([B)I
        //    68: pop            
        //    69: aload           12
        //    71: invokevirtual   java/io/BufferedInputStream.reset:()V
        //    74: iconst_0       
        //    75: istore_2       
        //    76: getstatic       atd.c:[B
        //    79: astore_1       
        //    80: aload_1        
        //    81: arraylength    
        //    82: istore_3       
        //    83: aconst_null    
        //    84: astore          10
        //    86: aconst_null    
        //    87: astore          9
        //    89: aconst_null    
        //    90: astore          11
        //    92: iload_2        
        //    93: iconst_3       
        //    94: if_icmpge       491
        //    97: aload           13
        //    99: iload_2        
        //   100: baload         
        //   101: aload_1        
        //   102: iload_2        
        //   103: baload         
        //   104: if_icmpeq       485
        //   107: ldc_w           "FUJIFILMCCD-RAW"
        //   110: invokestatic    java/nio/charset/Charset.defaultCharset:()Ljava/nio/charset/Charset;
        //   113: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   116: astore_1       
        //   117: iconst_0       
        //   118: istore_2       
        //   119: iload_2        
        //   120: aload_1        
        //   121: arraylength    
        //   122: if_icmpge       479
        //   125: aload           13
        //   127: iload_2        
        //   128: baload         
        //   129: aload_1        
        //   130: iload_2        
        //   131: baload         
        //   132: if_icmpeq       473
        //   135: aload           13
        //   137: invokestatic    atd.u:([B)Z
        //   140: istore          6
        //   142: iload           6
        //   144: ifeq            153
        //   147: bipush          12
        //   149: istore_2       
        //   150: goto            493
        //   153: new             Lata;
        //   156: astore_1       
        //   157: aload_1        
        //   158: aload           13
        //   160: invokespecial   ata.<init>:([B)V
        //   163: aload_1        
        //   164: invokestatic    atd.v:(Lata;)Ljava/nio/ByteOrder;
        //   167: astore          11
        //   169: aload_0        
        //   170: aload           11
        //   172: putfield        atd.H:Ljava/nio/ByteOrder;
        //   175: aload_1        
        //   176: aload           11
        //   178: putfield        ata.c:Ljava/nio/ByteOrder;
        //   181: aload_1        
        //   182: invokevirtual   ata.readShort:()S
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
        //   211: invokevirtual   ata.close:()V
        //   214: iload_2        
        //   215: ifeq            268
        //   218: bipush          7
        //   220: istore_2       
        //   221: goto            493
        //   224: astore          9
        //   226: aload_1        
        //   227: astore          10
        //   229: aload           9
        //   231: astore_1       
        //   232: goto            245
        //   235: astore          11
        //   237: goto            260
        //   240: astore_1       
        //   241: aload           11
        //   243: astore          10
        //   245: aload           10
        //   247: ifnull          255
        //   250: aload           10
        //   252: invokevirtual   ata.close:()V
        //   255: aload_1        
        //   256: athrow         
        //   257: astore_1       
        //   258: aconst_null    
        //   259: astore_1       
        //   260: aload_1        
        //   261: ifnull          268
        //   264: aload_1        
        //   265: invokevirtual   ata.close:()V
        //   268: new             Lata;
        //   271: astore_1       
        //   272: aload_1        
        //   273: aload           13
        //   275: invokespecial   ata.<init>:([B)V
        //   278: aload_1        
        //   279: invokestatic    atd.v:(Lata;)Ljava/nio/ByteOrder;
        //   282: astore          10
        //   284: aload_0        
        //   285: aload           10
        //   287: putfield        atd.H:Ljava/nio/ByteOrder;
        //   290: aload_1        
        //   291: aload           10
        //   293: putfield        ata.c:Ljava/nio/ByteOrder;
        //   296: aload_1        
        //   297: invokevirtual   ata.readShort:()S
        //   300: istore_2       
        //   301: aload_1        
        //   302: invokevirtual   ata.close:()V
        //   305: iload_2        
        //   306: bipush          85
        //   308: if_icmpne       354
        //   311: bipush          10
        //   313: istore_2       
        //   314: goto            493
        //   317: astore          9
        //   319: goto            332
        //   322: astore          10
        //   324: goto            346
        //   327: astore          9
        //   329: aload           10
        //   331: astore_1       
        //   332: aload_1        
        //   333: ifnull          340
        //   336: aload_1        
        //   337: invokevirtual   ata.close:()V
        //   340: aload           9
        //   342: athrow         
        //   343: astore_1       
        //   344: aconst_null    
        //   345: astore_1       
        //   346: aload_1        
        //   347: ifnull          354
        //   350: aload_1        
        //   351: invokevirtual   ata.close:()V
        //   354: iconst_0       
        //   355: istore_2       
        //   356: getstatic       atd.o:[B
        //   359: astore_1       
        //   360: aload_1        
        //   361: arraylength    
        //   362: istore_3       
        //   363: iload_2        
        //   364: bipush          8
        //   366: if_icmpge       467
        //   369: aload           13
        //   371: iload_2        
        //   372: baload         
        //   373: aload_1        
        //   374: iload_2        
        //   375: baload         
        //   376: if_icmpeq       461
        //   379: iconst_0       
        //   380: istore_2       
        //   381: getstatic       atd.s:[B
        //   384: astore_1       
        //   385: aload_1        
        //   386: arraylength    
        //   387: istore_3       
        //   388: iload_2        
        //   389: iconst_4       
        //   390: if_icmpge       414
        //   393: aload           13
        //   395: iload_2        
        //   396: baload         
        //   397: aload_1        
        //   398: iload_2        
        //   399: baload         
        //   400: if_icmpeq       408
        //   403: iconst_0       
        //   404: istore_2       
        //   405: goto            493
        //   408: iinc            2, 1
        //   411: goto            381
        //   414: iconst_0       
        //   415: istore_2       
        //   416: getstatic       atd.t:[B
        //   419: astore_1       
        //   420: aload_1        
        //   421: arraylength    
        //   422: istore_3       
        //   423: iload_2        
        //   424: iconst_4       
        //   425: if_icmpge       455
        //   428: getstatic       atd.s:[B
        //   431: arraylength    
        //   432: istore_3       
        //   433: aload           13
        //   435: iload_2        
        //   436: bipush          8
        //   438: iadd           
        //   439: baload         
        //   440: aload_1        
        //   441: iload_2        
        //   442: baload         
        //   443: if_icmpeq       449
        //   446: goto            403
        //   449: iinc            2, 1
        //   452: goto            416
        //   455: bipush          14
        //   457: istore_2       
        //   458: goto            493
        //   461: iinc            2, 1
        //   464: goto            356
        //   467: bipush          13
        //   469: istore_2       
        //   470: goto            493
        //   473: iinc            2, 1
        //   476: goto            119
        //   479: bipush          9
        //   481: istore_2       
        //   482: goto            493
        //   485: iinc            2, 1
        //   488: goto            76
        //   491: iconst_4       
        //   492: istore_2       
        //   493: aload_0        
        //   494: iload_2        
        //   495: putfield        atd.E:I
        //   498: iload_2        
        //   499: iconst_4       
        //   500: if_icmpeq       1644
        //   503: iload_2        
        //   504: bipush          9
        //   506: if_icmpeq       1644
        //   509: iload_2        
        //   510: bipush          13
        //   512: if_icmpeq       1644
        //   515: iload_2        
        //   516: bipush          14
        //   518: if_icmpne       524
        //   521: goto            1644
        //   524: new             Lata;
        //   527: astore          11
        //   529: aload           11
        //   531: aload           12
        //   533: aconst_null    
        //   534: invokespecial   ata.<init>:(Ljava/io/InputStream;[B)V
        //   537: aload_0        
        //   538: getfield        atd.E:I
        //   541: istore_2       
        //   542: iload_2        
        //   543: bipush          12
        //   545: if_icmpeq       1088
        //   548: iload_2        
        //   549: bipush          7
        //   551: if_icmpne       960
        //   554: aload_0        
        //   555: aload           11
        //   557: invokespecial   atd.r:(Lata;)V
        //   560: aload_0        
        //   561: getfield        atd.F:[Ljava/util/HashMap;
        //   564: iconst_1       
        //   565: aaload         
        //   566: ldc_w           "MakerNote"
        //   569: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   572: checkcast       Latb;
        //   575: astore          9
        //   577: aload           9
        //   579: ifnull          1587
        //   582: new             Lata;
        //   585: astore_1       
        //   586: aload_1        
        //   587: aload           9
        //   589: getfield        atb.d:[B
        //   592: aconst_null    
        //   593: invokespecial   ata.<init>:([B[B)V
        //   596: aload_1        
        //   597: aload_0        
        //   598: getfield        atd.H:Ljava/nio/ByteOrder;
        //   601: putfield        ata.c:Ljava/nio/ByteOrder;
        //   604: getstatic       atd.m:[B
        //   607: astore          12
        //   609: aload           12
        //   611: arraylength    
        //   612: istore_2       
        //   613: bipush          6
        //   615: newarray        B
        //   617: astore          9
        //   619: aload_1        
        //   620: aload           9
        //   622: invokevirtual   ata.readFully:([B)V
        //   625: aload_1        
        //   626: lconst_0       
        //   627: invokevirtual   ata.c:(J)V
        //   630: getstatic       atd.n:[B
        //   633: astore          10
        //   635: aload           10
        //   637: arraylength    
        //   638: istore_2       
        //   639: bipush          10
        //   641: newarray        B
        //   643: astore          13
        //   645: aload_1        
        //   646: aload           13
        //   648: invokevirtual   ata.readFully:([B)V
        //   651: aload           9
        //   653: aload           12
        //   655: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   658: ifeq            671
        //   661: aload_1        
        //   662: ldc2_w          8
        //   665: invokevirtual   ata.c:(J)V
        //   668: goto            688
        //   671: aload           13
        //   673: aload           10
        //   675: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   678: ifeq            688
        //   681: aload_1        
        //   682: ldc2_w          12
        //   685: invokevirtual   ata.c:(J)V
        //   688: aload_0        
        //   689: aload_1        
        //   690: bipush          6
        //   692: invokespecial   atd.s:(Lata;I)V
        //   695: aload_0        
        //   696: getfield        atd.F:[Ljava/util/HashMap;
        //   699: bipush          7
        //   701: aaload         
        //   702: ldc_w           "PreviewImageStart"
        //   705: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   708: checkcast       Latb;
        //   711: astore_1       
        //   712: aload_0        
        //   713: getfield        atd.F:[Ljava/util/HashMap;
        //   716: bipush          7
        //   718: aaload         
        //   719: ldc_w           "PreviewImageLength"
        //   722: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   725: checkcast       Latb;
        //   728: astore          9
        //   730: aload_1        
        //   731: ifnull          768
        //   734: aload           9
        //   736: ifnull          768
        //   739: aload_0        
        //   740: getfield        atd.F:[Ljava/util/HashMap;
        //   743: iconst_5       
        //   744: aaload         
        //   745: ldc_w           "JPEGInterchangeFormat"
        //   748: aload_1        
        //   749: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   752: pop            
        //   753: aload_0        
        //   754: getfield        atd.F:[Ljava/util/HashMap;
        //   757: iconst_5       
        //   758: aaload         
        //   759: ldc_w           "JPEGInterchangeFormatLength"
        //   762: aload           9
        //   764: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   767: pop            
        //   768: aload_0        
        //   769: getfield        atd.F:[Ljava/util/HashMap;
        //   772: bipush          8
        //   774: aaload         
        //   775: ldc_w           "AspectFrame"
        //   778: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   781: checkcast       Latb;
        //   784: astore_1       
        //   785: aload_1        
        //   786: ifnull          1587
        //   789: aload_1        
        //   790: aload_0        
        //   791: getfield        atd.H:Ljava/nio/ByteOrder;
        //   794: invokevirtual   atb.f:(Ljava/nio/ByteOrder;)Ljava/lang/Object;
        //   797: checkcast       [I
        //   800: astore_1       
        //   801: aload_1        
        //   802: ifnull          937
        //   805: aload_1        
        //   806: arraylength    
        //   807: iconst_4       
        //   808: if_icmpeq       814
        //   811: goto            937
        //   814: aload_1        
        //   815: iconst_2       
        //   816: iaload         
        //   817: istore          4
        //   819: aload_1        
        //   820: iconst_0       
        //   821: iaload         
        //   822: istore          5
        //   824: iload           4
        //   826: iload           5
        //   828: if_icmple       1587
        //   831: aload_1        
        //   832: iconst_3       
        //   833: iaload         
        //   834: istore_2       
        //   835: aload_1        
        //   836: iconst_1       
        //   837: iaload         
        //   838: istore_3       
        //   839: iload_2        
        //   840: iload_3        
        //   841: if_icmple       1587
        //   844: iload           4
        //   846: iload           5
        //   848: isub           
        //   849: iconst_1       
        //   850: iadd           
        //   851: istore          4
        //   853: iload_2        
        //   854: iload_3        
        //   855: isub           
        //   856: iconst_1       
        //   857: iadd           
        //   858: istore          5
        //   860: iload           4
        //   862: istore_3       
        //   863: iload           5
        //   865: istore_2       
        //   866: iload           4
        //   868: iload           5
        //   870: if_icmpge       888
        //   873: iload           4
        //   875: iload           5
        //   877: iadd           
        //   878: istore_3       
        //   879: iload_3        
        //   880: iload           5
        //   882: isub           
        //   883: istore_2       
        //   884: iload_3        
        //   885: iload_2        
        //   886: isub           
        //   887: istore_3       
        //   888: iload_3        
        //   889: aload_0        
        //   890: getfield        atd.H:Ljava/nio/ByteOrder;
        //   893: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //   896: astore_1       
        //   897: iload_2        
        //   898: aload_0        
        //   899: getfield        atd.H:Ljava/nio/ByteOrder;
        //   902: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //   905: astore          9
        //   907: aload_0        
        //   908: getfield        atd.F:[Ljava/util/HashMap;
        //   911: iconst_0       
        //   912: aaload         
        //   913: ldc             "ImageWidth"
        //   915: aload_1        
        //   916: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   919: pop            
        //   920: aload_0        
        //   921: getfield        atd.F:[Ljava/util/HashMap;
        //   924: iconst_0       
        //   925: aaload         
        //   926: ldc             "ImageLength"
        //   928: aload           9
        //   930: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   933: pop            
        //   934: goto            1587
        //   937: ldc_w           "ExifInterface"
        //   940: ldc_w           "Invalid aspect frame values. frame="
        //   943: aload_1        
        //   944: invokestatic    java/util/Arrays.toString:([I)Ljava/lang/String;
        //   947: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   950: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   953: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   956: pop            
        //   957: goto            1587
        //   960: iload_2        
        //   961: bipush          10
        //   963: if_icmpne       1079
        //   966: aload_0        
        //   967: aload           11
        //   969: invokespecial   atd.r:(Lata;)V
        //   972: aload_0        
        //   973: getfield        atd.F:[Ljava/util/HashMap;
        //   976: iconst_0       
        //   977: aaload         
        //   978: ldc_w           "JpgFromRaw"
        //   981: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   984: checkcast       Latb;
        //   987: astore          9
        //   989: aload           9
        //   991: ifnull          1019
        //   994: new             Lata;
        //   997: astore_1       
        //   998: aload_1        
        //   999: aload           9
        //  1001: getfield        atb.d:[B
        //  1004: invokespecial   ata.<init>:([B)V
        //  1007: aload_0        
        //  1008: aload_1        
        //  1009: aload           9
        //  1011: getfield        atb.c:J
        //  1014: l2i            
        //  1015: iconst_5       
        //  1016: invokespecial   atd.e:(Lata;II)V
        //  1019: aload_0        
        //  1020: getfield        atd.F:[Ljava/util/HashMap;
        //  1023: iconst_0       
        //  1024: aaload         
        //  1025: ldc_w           "ISO"
        //  1028: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1031: checkcast       Latb;
        //  1034: astore          9
        //  1036: aload_0        
        //  1037: getfield        atd.F:[Ljava/util/HashMap;
        //  1040: iconst_1       
        //  1041: aaload         
        //  1042: ldc_w           "PhotographicSensitivity"
        //  1045: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1048: checkcast       Latb;
        //  1051: astore_1       
        //  1052: aload           9
        //  1054: ifnull          1587
        //  1057: aload_1        
        //  1058: ifnonnull       1587
        //  1061: aload_0        
        //  1062: getfield        atd.F:[Ljava/util/HashMap;
        //  1065: iconst_1       
        //  1066: aaload         
        //  1067: ldc_w           "PhotographicSensitivity"
        //  1070: aload           9
        //  1072: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1075: pop            
        //  1076: goto            1587
        //  1079: aload_0        
        //  1080: aload           11
        //  1082: invokespecial   atd.r:(Lata;)V
        //  1085: goto            1587
        //  1088: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1091: bipush          28
        //  1093: if_icmplt       1631
        //  1096: new             Landroid/media/MediaMetadataRetriever;
        //  1099: astore          12
        //  1101: aload           12
        //  1103: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //  1106: new             Lasz;
        //  1109: astore_1       
        //  1110: aload_1        
        //  1111: aload           11
        //  1113: invokespecial   asz.<init>:(Lata;)V
        //  1116: aload           12
        //  1118: aload_1        
        //  1119: invokestatic    atf.a:(Landroid/media/MediaMetadataRetriever;Landroid/media/MediaDataSource;)V
        //  1122: aload           12
        //  1124: bipush          33
        //  1126: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1129: astore          13
        //  1131: aload           12
        //  1133: bipush          34
        //  1135: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1138: astore          14
        //  1140: aload           12
        //  1142: bipush          26
        //  1144: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1147: astore_1       
        //  1148: aload           12
        //  1150: bipush          17
        //  1152: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1155: astore          10
        //  1157: ldc_w           "yes"
        //  1160: aload_1        
        //  1161: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1164: ifeq            1196
        //  1167: aload           12
        //  1169: bipush          29
        //  1171: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1174: astore          9
        //  1176: aload           12
        //  1178: bipush          30
        //  1180: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1183: astore_1       
        //  1184: aload           12
        //  1186: bipush          31
        //  1188: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1191: astore          10
        //  1193: goto            1241
        //  1196: ldc_w           "yes"
        //  1199: aload           10
        //  1201: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1204: ifeq            1236
        //  1207: aload           12
        //  1209: bipush          18
        //  1211: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1214: astore          9
        //  1216: aload           12
        //  1218: bipush          19
        //  1220: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1223: astore_1       
        //  1224: aload           12
        //  1226: bipush          24
        //  1228: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1231: astore          10
        //  1233: goto            1241
        //  1236: aconst_null    
        //  1237: astore_1       
        //  1238: aconst_null    
        //  1239: astore          10
        //  1241: aload           9
        //  1243: ifnull          1270
        //  1246: aload_0        
        //  1247: getfield        atd.F:[Ljava/util/HashMap;
        //  1250: iconst_0       
        //  1251: aaload         
        //  1252: ldc             "ImageWidth"
        //  1254: aload           9
        //  1256: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1259: aload_0        
        //  1260: getfield        atd.H:Ljava/nio/ByteOrder;
        //  1263: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //  1266: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1269: pop            
        //  1270: aload_1        
        //  1271: ifnull          1297
        //  1274: aload_0        
        //  1275: getfield        atd.F:[Ljava/util/HashMap;
        //  1278: iconst_0       
        //  1279: aaload         
        //  1280: ldc             "ImageLength"
        //  1282: aload_1        
        //  1283: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1286: aload_0        
        //  1287: getfield        atd.H:Ljava/nio/ByteOrder;
        //  1290: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //  1293: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1296: pop            
        //  1297: aload           10
        //  1299: ifnull          1367
        //  1302: aload           10
        //  1304: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1307: istore_2       
        //  1308: iload_2        
        //  1309: bipush          90
        //  1311: if_icmpeq       1344
        //  1314: iload_2        
        //  1315: sipush          180
        //  1318: if_icmpeq       1339
        //  1321: iload_2        
        //  1322: sipush          270
        //  1325: if_icmpeq       1333
        //  1328: iconst_1       
        //  1329: istore_2       
        //  1330: goto            1347
        //  1333: bipush          8
        //  1335: istore_2       
        //  1336: goto            1347
        //  1339: iconst_3       
        //  1340: istore_2       
        //  1341: goto            1347
        //  1344: bipush          6
        //  1346: istore_2       
        //  1347: aload_0        
        //  1348: getfield        atd.F:[Ljava/util/HashMap;
        //  1351: iconst_0       
        //  1352: aaload         
        //  1353: ldc             "Orientation"
        //  1355: iload_2        
        //  1356: aload_0        
        //  1357: getfield        atd.H:Ljava/nio/ByteOrder;
        //  1360: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //  1363: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1366: pop            
        //  1367: aload           13
        //  1369: ifnull          1479
        //  1372: aload           14
        //  1374: ifnull          1479
        //  1377: aload           13
        //  1379: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1382: istore_2       
        //  1383: aload           14
        //  1385: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1388: istore_3       
        //  1389: iload_3        
        //  1390: bipush          6
        //  1392: if_icmple       1466
        //  1395: aload           11
        //  1397: iload_2        
        //  1398: i2l            
        //  1399: invokevirtual   ata.c:(J)V
        //  1402: bipush          6
        //  1404: newarray        B
        //  1406: astore_1       
        //  1407: aload           11
        //  1409: aload_1        
        //  1410: invokevirtual   ata.readFully:([B)V
        //  1413: aload_1        
        //  1414: getstatic       atd.h:[B
        //  1417: invokestatic    java/util/Arrays.equals:([B[B)Z
        //  1420: ifeq            1453
        //  1423: iload_3        
        //  1424: bipush          6
        //  1426: isub           
        //  1427: newarray        B
        //  1429: astore_1       
        //  1430: aload           11
        //  1432: aload_1        
        //  1433: invokevirtual   ata.readFully:([B)V
        //  1436: aload_0        
        //  1437: iload_2        
        //  1438: bipush          6
        //  1440: iadd           
        //  1441: putfield        atd.J:I
        //  1444: aload_0        
        //  1445: aload_1        
        //  1446: iconst_0       
        //  1447: invokespecial   atd.l:([BI)V
        //  1450: goto            1479
        //  1453: new             Ljava/io/IOException;
        //  1456: astore_1       
        //  1457: aload_1        
        //  1458: ldc_w           "Invalid identifier"
        //  1461: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1464: aload_1        
        //  1465: athrow         
        //  1466: new             Ljava/io/IOException;
        //  1469: astore_1       
        //  1470: aload_1        
        //  1471: ldc_w           "Invalid exif length"
        //  1474: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1477: aload_1        
        //  1478: athrow         
        //  1479: aload           12
        //  1481: bipush          41
        //  1483: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1486: astore_1       
        //  1487: aload           12
        //  1489: bipush          42
        //  1491: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //  1494: astore          9
        //  1496: aload_1        
        //  1497: ifnull          1582
        //  1500: aload           9
        //  1502: ifnull          1582
        //  1505: aload_1        
        //  1506: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1509: istore_2       
        //  1510: aload           9
        //  1512: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  1515: istore_3       
        //  1516: iload_2        
        //  1517: i2l            
        //  1518: lstore          7
        //  1520: aload           11
        //  1522: lload           7
        //  1524: invokevirtual   ata.c:(J)V
        //  1527: iload_3        
        //  1528: newarray        B
        //  1530: astore          10
        //  1532: aload           11
        //  1534: aload           10
        //  1536: invokevirtual   ata.readFully:([B)V
        //  1539: aload_0        
        //  1540: ldc_w           "Xmp"
        //  1543: invokevirtual   atd.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1546: ifnonnull       1582
        //  1549: aload_0        
        //  1550: getfield        atd.F:[Ljava/util/HashMap;
        //  1553: iconst_0       
        //  1554: aaload         
        //  1555: astore_1       
        //  1556: new             Latb;
        //  1559: astore          9
        //  1561: aload           9
        //  1563: iconst_1       
        //  1564: iload_3        
        //  1565: lload           7
        //  1567: aload           10
        //  1569: invokespecial   atb.<init>:(IIJ[B)V
        //  1572: aload_1        
        //  1573: ldc_w           "Xmp"
        //  1576: aload           9
        //  1578: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1581: pop            
        //  1582: aload           12
        //  1584: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1587: aload           11
        //  1589: aload_0        
        //  1590: getfield        atd.J:I
        //  1593: i2l            
        //  1594: invokevirtual   ata.c:(J)V
        //  1597: aload_0        
        //  1598: aload           11
        //  1600: invokespecial   atd.n:(Lata;)V
        //  1603: goto            1937
        //  1606: astore_1       
        //  1607: goto            1624
        //  1610: astore_1       
        //  1611: new             Ljava/lang/UnsupportedOperationException;
        //  1614: astore_1       
        //  1615: aload_1        
        //  1616: ldc_w           "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
        //  1619: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1622: aload_1        
        //  1623: athrow         
        //  1624: aload           12
        //  1626: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1629: aload_1        
        //  1630: athrow         
        //  1631: new             Ljava/lang/UnsupportedOperationException;
        //  1634: astore_1       
        //  1635: aload_1        
        //  1636: ldc_w           "Reading EXIF from HEIF files is supported from SDK 28 and above"
        //  1639: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1642: aload_1        
        //  1643: athrow         
        //  1644: new             Lata;
        //  1647: astore_1       
        //  1648: aload_1        
        //  1649: aload           12
        //  1651: invokespecial   ata.<init>:(Ljava/io/InputStream;)V
        //  1654: aload_0        
        //  1655: getfield        atd.E:I
        //  1658: istore_2       
        //  1659: iload_2        
        //  1660: iconst_4       
        //  1661: if_icmpne       1674
        //  1664: aload_0        
        //  1665: aload_1        
        //  1666: iconst_0       
        //  1667: iconst_0       
        //  1668: invokespecial   atd.e:(Lata;II)V
        //  1671: goto            1937
        //  1674: iload_2        
        //  1675: bipush          13
        //  1677: if_icmpne       1688
        //  1680: aload_0        
        //  1681: aload_1        
        //  1682: invokespecial   atd.f:(Lata;)V
        //  1685: goto            1937
        //  1688: iload_2        
        //  1689: bipush          9
        //  1691: if_icmpne       1926
        //  1694: aload_1        
        //  1695: bipush          84
        //  1697: invokevirtual   ata.b:(I)V
        //  1700: iconst_4       
        //  1701: newarray        B
        //  1703: astore          11
        //  1705: iconst_4       
        //  1706: newarray        B
        //  1708: astore          10
        //  1710: iconst_4       
        //  1711: newarray        B
        //  1713: astore          9
        //  1715: aload_1        
        //  1716: aload           11
        //  1718: invokevirtual   ata.readFully:([B)V
        //  1721: aload_1        
        //  1722: aload           10
        //  1724: invokevirtual   ata.readFully:([B)V
        //  1727: aload_1        
        //  1728: aload           9
        //  1730: invokevirtual   ata.readFully:([B)V
        //  1733: aload           11
        //  1735: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1738: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1741: istore_2       
        //  1742: aload           10
        //  1744: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1747: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1750: istore          4
        //  1752: aload           9
        //  1754: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  1757: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //  1760: istore_3       
        //  1761: iload           4
        //  1763: newarray        B
        //  1765: astore          9
        //  1767: aload_1        
        //  1768: iload_2        
        //  1769: aload_1        
        //  1770: getfield        ata.b:I
        //  1773: isub           
        //  1774: invokevirtual   ata.b:(I)V
        //  1777: aload_1        
        //  1778: aload           9
        //  1780: invokevirtual   ata.readFully:([B)V
        //  1783: new             Lata;
        //  1786: astore          10
        //  1788: aload           10
        //  1790: aload           9
        //  1792: invokespecial   ata.<init>:([B)V
        //  1795: aload_0        
        //  1796: aload           10
        //  1798: iload_2        
        //  1799: iconst_5       
        //  1800: invokespecial   atd.e:(Lata;II)V
        //  1803: aload_1        
        //  1804: iload_3        
        //  1805: aload_1        
        //  1806: getfield        ata.b:I
        //  1809: isub           
        //  1810: invokevirtual   ata.b:(I)V
        //  1813: aload_1        
        //  1814: getstatic       java/nio/ByteOrder.BIG_ENDIAN:Ljava/nio/ByteOrder;
        //  1817: putfield        ata.c:Ljava/nio/ByteOrder;
        //  1820: aload_1        
        //  1821: invokevirtual   ata.readInt:()I
        //  1824: istore_3       
        //  1825: iconst_0       
        //  1826: istore_2       
        //  1827: iload_2        
        //  1828: iload_3        
        //  1829: if_icmpge       1937
        //  1832: aload_1        
        //  1833: invokevirtual   ata.readUnsignedShort:()I
        //  1836: istore          4
        //  1838: aload_1        
        //  1839: invokevirtual   ata.readUnsignedShort:()I
        //  1842: istore          5
        //  1844: iload           4
        //  1846: getstatic       atd.S:Laevc;
        //  1849: getfield        aevc.b:I
        //  1852: if_icmpne       1914
        //  1855: aload_1        
        //  1856: invokevirtual   ata.readShort:()S
        //  1859: istore_3       
        //  1860: aload_1        
        //  1861: invokevirtual   ata.readShort:()S
        //  1864: istore_2       
        //  1865: iload_3        
        //  1866: aload_0        
        //  1867: getfield        atd.H:Ljava/nio/ByteOrder;
        //  1870: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //  1873: astore          9
        //  1875: iload_2        
        //  1876: aload_0        
        //  1877: getfield        atd.H:Ljava/nio/ByteOrder;
        //  1880: invokestatic    atb.e:(ILjava/nio/ByteOrder;)Latb;
        //  1883: astore_1       
        //  1884: aload_0        
        //  1885: getfield        atd.F:[Ljava/util/HashMap;
        //  1888: iconst_0       
        //  1889: aaload         
        //  1890: ldc             "ImageLength"
        //  1892: aload           9
        //  1894: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1897: pop            
        //  1898: aload_0        
        //  1899: getfield        atd.F:[Ljava/util/HashMap;
        //  1902: iconst_0       
        //  1903: aaload         
        //  1904: ldc             "ImageWidth"
        //  1906: aload_1        
        //  1907: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1910: pop            
        //  1911: goto            1937
        //  1914: aload_1        
        //  1915: iload           5
        //  1917: invokevirtual   ata.b:(I)V
        //  1920: iinc            2, 1
        //  1923: goto            1827
        //  1926: iload_2        
        //  1927: bipush          14
        //  1929: if_icmpne       1937
        //  1932: aload_0        
        //  1933: aload_1        
        //  1934: invokespecial   atd.g:(Lata;)V
        //  1937: aload_0        
        //  1938: invokespecial   atd.d:()V
        //  1941: return         
        //  1942: astore_1       
        //  1943: aload_0        
        //  1944: invokespecial   atd.d:()V
        //  1947: aload_1        
        //  1948: athrow         
        //  1949: astore_1       
        //  1950: aload_0        
        //  1951: invokespecial   atd.d:()V
        //  1954: return         
        //  1955: astore_1       
        //  1956: goto            1587
        //  1959: astore          9
        //  1961: goto            1629
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
        //  153    163    257    260    Ljava/lang/Exception;
        //  153    163    240    245    Any
        //  163    186    235    240    Ljava/lang/Exception;
        //  163    186    224    235    Any
        //  210    214    1949   1955   Ljava/io/IOException;
        //  210    214    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  210    214    1942   1949   Any
        //  250    255    1949   1955   Ljava/io/IOException;
        //  250    255    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  250    255    1942   1949   Any
        //  255    257    1949   1955   Ljava/io/IOException;
        //  255    257    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  255    257    1942   1949   Any
        //  264    268    1949   1955   Ljava/io/IOException;
        //  264    268    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  264    268    1942   1949   Any
        //  268    278    343    346    Ljava/lang/Exception;
        //  268    278    327    332    Any
        //  278    301    322    327    Ljava/lang/Exception;
        //  278    301    317    322    Any
        //  301    305    1949   1955   Ljava/io/IOException;
        //  301    305    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  301    305    1942   1949   Any
        //  336    340    1949   1955   Ljava/io/IOException;
        //  336    340    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  336    340    1942   1949   Any
        //  340    343    1949   1955   Ljava/io/IOException;
        //  340    343    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  340    343    1942   1949   Any
        //  350    354    1949   1955   Ljava/io/IOException;
        //  350    354    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  350    354    1942   1949   Any
        //  356    363    1949   1955   Ljava/io/IOException;
        //  356    363    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  356    363    1942   1949   Any
        //  381    388    1949   1955   Ljava/io/IOException;
        //  381    388    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  381    388    1942   1949   Any
        //  416    423    1949   1955   Ljava/io/IOException;
        //  416    423    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  416    423    1942   1949   Any
        //  428    433    1949   1955   Ljava/io/IOException;
        //  428    433    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  428    433    1942   1949   Any
        //  493    498    1949   1955   Ljava/io/IOException;
        //  493    498    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  493    498    1942   1949   Any
        //  524    542    1949   1955   Ljava/io/IOException;
        //  524    542    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  524    542    1942   1949   Any
        //  554    577    1949   1955   Ljava/io/IOException;
        //  554    577    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  554    577    1942   1949   Any
        //  582    668    1949   1955   Ljava/io/IOException;
        //  582    668    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  582    668    1942   1949   Any
        //  671    688    1949   1955   Ljava/io/IOException;
        //  671    688    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  671    688    1942   1949   Any
        //  688    730    1949   1955   Ljava/io/IOException;
        //  688    730    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  688    730    1942   1949   Any
        //  739    768    1949   1955   Ljava/io/IOException;
        //  739    768    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  739    768    1942   1949   Any
        //  768    785    1949   1955   Ljava/io/IOException;
        //  768    785    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  768    785    1942   1949   Any
        //  789    801    1949   1955   Ljava/io/IOException;
        //  789    801    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  789    801    1942   1949   Any
        //  805    811    1949   1955   Ljava/io/IOException;
        //  805    811    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  805    811    1942   1949   Any
        //  888    934    1949   1955   Ljava/io/IOException;
        //  888    934    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  888    934    1942   1949   Any
        //  937    957    1949   1955   Ljava/io/IOException;
        //  937    957    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  937    957    1942   1949   Any
        //  966    989    1949   1955   Ljava/io/IOException;
        //  966    989    1949   1955   Ljava/lang/UnsupportedOperationException;
        //  966    989    1942   1949   Any
        //  994    1019   1949   1955   Ljava/io/IOException;
        //  994    1019   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  994    1019   1942   1949   Any
        //  1019   1052   1949   1955   Ljava/io/IOException;
        //  1019   1052   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1019   1052   1942   1949   Any
        //  1061   1076   1949   1955   Ljava/io/IOException;
        //  1061   1076   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1061   1076   1942   1949   Any
        //  1079   1085   1949   1955   Ljava/io/IOException;
        //  1079   1085   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1079   1085   1942   1949   Any
        //  1088   1106   1949   1955   Ljava/io/IOException;
        //  1088   1106   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1088   1106   1942   1949   Any
        //  1106   1193   1610   1624   Ljava/lang/RuntimeException;
        //  1106   1193   1606   1631   Any
        //  1196   1233   1610   1624   Ljava/lang/RuntimeException;
        //  1196   1233   1606   1631   Any
        //  1246   1270   1610   1624   Ljava/lang/RuntimeException;
        //  1246   1270   1606   1631   Any
        //  1274   1297   1610   1624   Ljava/lang/RuntimeException;
        //  1274   1297   1606   1631   Any
        //  1302   1308   1610   1624   Ljava/lang/RuntimeException;
        //  1302   1308   1606   1631   Any
        //  1347   1367   1610   1624   Ljava/lang/RuntimeException;
        //  1347   1367   1606   1631   Any
        //  1377   1389   1610   1624   Ljava/lang/RuntimeException;
        //  1377   1389   1606   1631   Any
        //  1395   1450   1610   1624   Ljava/lang/RuntimeException;
        //  1395   1450   1606   1631   Any
        //  1453   1466   1610   1624   Ljava/lang/RuntimeException;
        //  1453   1466   1606   1631   Any
        //  1466   1479   1610   1624   Ljava/lang/RuntimeException;
        //  1466   1479   1606   1631   Any
        //  1479   1496   1610   1624   Ljava/lang/RuntimeException;
        //  1479   1496   1606   1631   Any
        //  1505   1516   1610   1624   Ljava/lang/RuntimeException;
        //  1505   1516   1606   1631   Any
        //  1520   1582   1610   1624   Ljava/lang/RuntimeException;
        //  1520   1582   1606   1631   Any
        //  1582   1587   1955   1959   Ljava/io/IOException;
        //  1582   1587   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1582   1587   1942   1949   Any
        //  1587   1603   1949   1955   Ljava/io/IOException;
        //  1587   1603   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1587   1603   1942   1949   Any
        //  1611   1624   1606   1631   Any
        //  1624   1629   1959   1964   Ljava/io/IOException;
        //  1624   1629   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1624   1629   1942   1949   Any
        //  1629   1631   1949   1955   Ljava/io/IOException;
        //  1629   1631   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1629   1631   1942   1949   Any
        //  1631   1644   1949   1955   Ljava/io/IOException;
        //  1631   1644   1949   1955   Ljava/lang/UnsupportedOperationException;
        //  1631   1644   1942   1949   Any
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
    
    private final void k(final ata ata) {
        final ByteOrder v = v(ata);
        this.H = v;
        ata.c = v;
        final int unsignedShort = ata.readUnsignedShort();
        final int e = this.E;
        if (e != 7 && e != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int int1 = ata.readInt();
        if (int1 >= 8) {
            int1 -= 8;
            if (int1 > 0) {
                ata.b(int1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Invalid first Ifd offset: ");
        sb.append(int1);
        throw new IOException(sb.toString());
    }
    
    private final void l(final byte[] array, final int n) {
        final ata ata = new ata(array, null);
        this.k(ata);
        this.s(ata, n);
    }
    
    private final void m(final int n, final String s, final String s2) {
        if (!this.F[n].isEmpty() && this.F[n].get(s) != null) {
            final HashMap hashMap = this.F[n];
            hashMap.put(s2, hashMap.get(s));
            this.F[n].remove(s);
        }
    }
    
    private final void n(final ata ata) {
        final HashMap hashMap = this.F[4];
        final atb atb = hashMap.get("Compression");
        if (atb != null) {
            final int a = atb.a(this.H);
            if (a != 1) {
                if (a == 6) {
                    this.h(ata, hashMap);
                    return;
                }
                if (a != 7) {
                    return;
                }
            }
            final atb atb2 = hashMap.get("BitsPerSample");
            if (atb2 != null) {
                final int[] array = (int[])atb2.f(this.H);
                final int[] a2 = atd.a;
                if (!Arrays.equals(a2, array)) {
                    if (this.E != 3) {
                        return;
                    }
                    final atb atb3 = hashMap.get("PhotometricInterpretation");
                    if (atb3 == null) {
                        return;
                    }
                    final int a3 = atb3.a(this.H);
                    if (a3 == 1) {
                        if (!Arrays.equals(array, atd.b)) {
                            return;
                        }
                    }
                    else if (a3 != 6 || !Arrays.equals(array, a2)) {
                        return;
                    }
                }
                this.i(ata, hashMap);
            }
            return;
        }
        this.h(ata, hashMap);
    }
    
    private final void o(final int n, final int n2) {
        if (!this.F[n].isEmpty()) {
            if (!this.F[n2].isEmpty()) {
                final atb atb = this.F[n].get("ImageLength");
                final atb atb2 = this.F[n].get("ImageWidth");
                final atb atb3 = this.F[n2].get("ImageLength");
                final atb atb4 = this.F[n2].get("ImageWidth");
                if (atb != null) {
                    if (atb2 != null) {
                        if (atb3 != null && atb4 != null) {
                            final int a = atb.a(this.H);
                            final int a2 = atb2.a(this.H);
                            final int a3 = atb3.a(this.H);
                            final int a4 = atb4.a(this.H);
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
        final atb atb = this.F[1].get("PixelXDimension");
        final atb atb2 = this.F[1].get("PixelYDimension");
        if (atb != null && atb2 != null) {
            this.F[0].put("ImageWidth", atb);
            this.F[0].put("ImageLength", atb2);
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
        final atb atb = hashMap.get("ImageLength");
        final atb atb2 = hashMap.get("ImageWidth");
        if (atb != null && atb2 != null) {
            final int a = atb.a(this.H);
            final int a2 = atb2.a(this.H);
            if (a <= 512 && a2 <= 512) {
                return true;
            }
        }
        return false;
    }
    
    private final void r(ata ata) {
        this.k(ata);
        this.s(ata, 0);
        this.t(ata, 0);
        this.t(ata, 5);
        this.t(ata, 4);
        this.p();
        if (this.E == 8) {
            final atb atb = this.F[1].get("MakerNote");
            if (atb != null) {
                ata = new ata(atb.d, null);
                ata.c = this.H;
                ata.b(6);
                this.s(ata, 9);
                final atb atb2 = this.F[9].get("ColorSpace");
                if (atb2 != null) {
                    this.F[1].put("ColorSpace", atb2);
                }
            }
        }
    }
    
    private final void s(final ata ata, int int1) {
        this.G.add(ata.b);
        final short short1 = ata.readShort();
        if (short1 > 0) {
            for (short n = 0; n < short1; ++n) {
                final int unsignedShort = ata.readUnsignedShort();
                int unsignedShort2 = ata.readUnsignedShort();
                final int int2 = ata.readInt();
                final long n2 = ata.b;
                final HashMap hashMap = atd.x[int1];
                final Integer value = unsignedShort;
                final aevc aevc = hashMap.get(value);
                long n5 = 0L;
                boolean b = false;
                Label_0277: {
                    Label_0092: {
                        if (aevc != null && unsignedShort2 > 0) {
                            final int[] e = atd.e;
                            final int length = e.length;
                            if (unsignedShort2 < 14) {
                                final int c = aevc.c;
                                Label_0219: {
                                    if (c != 7) {
                                        if (unsignedShort2 != 7) {
                                            if (c != unsignedShort2) {
                                                final int a = aevc.a;
                                                if (a != unsignedShort2) {
                                                    int n3 = a;
                                                    Label_0196: {
                                                        if (c != 4) {
                                                            if ((n3 = a) != 4) {
                                                                break Label_0196;
                                                            }
                                                            n3 = 4;
                                                        }
                                                        if (unsignedShort2 == 3) {
                                                            break Label_0219;
                                                        }
                                                    }
                                                    if (c != 9 && n3 != 9) {
                                                        break Label_0092;
                                                    }
                                                    if (unsignedShort2 != 8) {
                                                        break Label_0092;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int n4;
                                if ((n4 = unsignedShort2) == 7) {
                                    n4 = c;
                                }
                                n5 = int2 * (long)e[n4];
                                if (n5 >= 0L && n5 <= 2147483647L) {
                                    b = true;
                                    unsignedShort2 = n4;
                                    break Label_0277;
                                }
                                b = false;
                                unsignedShort2 = n4;
                                break Label_0277;
                            }
                        }
                    }
                    b = false;
                    n5 = 0L;
                }
                final long n6 = n2 + 4L;
                if (!b) {
                    ata.c(n6);
                }
                else {
                    int n7;
                    if (n5 > 4L) {
                        final int int3 = ata.readInt();
                        Label_0479: {
                            if (this.E == 7) {
                                if ("MakerNote".equals(aevc.d)) {
                                    this.K = int3;
                                }
                                else if (int1 == 6) {
                                    if ("ThumbnailImage".equals(aevc.d)) {
                                        this.L = int3;
                                        this.M = int2;
                                        final atb e2 = atb.e(6, this.H);
                                        final atb c2 = atb.c(this.L, this.H);
                                        final atb c3 = atb.c(this.M, this.H);
                                        this.F[4].put("Compression", e2);
                                        this.F[4].put("JPEGInterchangeFormat", c2);
                                        final HashMap hashMap2 = this.F[4];
                                        n7 = 6;
                                        hashMap2.put("JPEGInterchangeFormatLength", c3);
                                        break Label_0479;
                                    }
                                    n7 = 6;
                                    break Label_0479;
                                }
                            }
                            n7 = int1;
                        }
                        ata.c(int3);
                    }
                    else {
                        n7 = int1;
                    }
                    final Integer n8 = atd.A.get(value);
                    if (n8 != null) {
                        long a2 = 0L;
                        Label_0584: {
                            int n9;
                            if (unsignedShort2 != 3) {
                                if (unsignedShort2 == 4) {
                                    a2 = ata.a();
                                    break Label_0584;
                                }
                                if (unsignedShort2 != 8) {
                                    if (unsignedShort2 != 9 && unsignedShort2 != 13) {
                                        a2 = -1L;
                                        break Label_0584;
                                    }
                                    n9 = ata.readInt();
                                }
                                else {
                                    n9 = ata.readShort();
                                }
                            }
                            else {
                                n9 = ata.readUnsignedShort();
                            }
                            a2 = n9;
                        }
                        if (a2 > 0L && !this.G.contains((int)a2)) {
                            ata.c(a2);
                            this.s(ata, n8);
                        }
                        ata.c(n6);
                    }
                    else {
                        final int b2 = ata.b;
                        final int j = this.J;
                        final byte[] array = new byte[(int)n5];
                        ata.readFully(array);
                        final atb atb = new atb(unsignedShort2, int2, b2 + j, array);
                        this.F[n7].put(aevc.d, atb);
                        if ("DNGVersion".equals(aevc.d)) {
                            this.E = 3;
                        }
                        if ((("Make".equals(aevc.d) || "Model".equals(aevc.d)) && atb.g(this.H).contains("PENTAX")) || ("Compression".equals(aevc.d) && atb.a(this.H) == 65535)) {
                            this.E = 8;
                        }
                        if (ata.b != n6) {
                            ata.c(n6);
                        }
                    }
                }
            }
            int1 = ata.readInt();
            final long n10 = int1;
            if (n10 > 0L && !this.G.contains(int1)) {
                ata.c(n10);
                if (this.F[4].isEmpty()) {
                    this.s(ata, 4);
                    return;
                }
                if (this.F[5].isEmpty()) {
                    this.s(ata, 5);
                }
            }
        }
    }
    
    private final void t(final ata ata, final int n) {
        final atb atb = this.F[n].get("DefaultCropSize");
        final atb atb2 = this.F[n].get("SensorTopBorder");
        final atb atb3 = this.F[n].get("SensorLeftBorder");
        final atb atb4 = this.F[n].get("SensorBottomBorder");
        final atb atb5 = this.F[n].get("SensorRightBorder");
        if (atb != null) {
            atb atb6;
            atb atb7;
            if (atb.a == 5) {
                final atc[] array = (atc[])atb.f(this.H);
                if (array == null || array.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(array))));
                    return;
                }
                atb6 = atb.d(array[0], this.H);
                atb7 = atb.d(array[1], this.H);
            }
            else {
                final int[] array2 = (int[])atb.f(this.H);
                if (array2 == null || array2.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(array2))));
                    return;
                }
                atb6 = atb.e(array2[0], this.H);
                atb7 = atb.e(array2[1], this.H);
            }
            this.F[n].put("ImageWidth", atb6);
            this.F[n].put("ImageLength", atb7);
            return;
        }
        if (atb2 != null && atb3 != null && atb4 != null && atb5 != null) {
            final int a = atb2.a(this.H);
            final int a2 = atb4.a(this.H);
            final int a3 = atb5.a(this.H);
            final int a4 = atb3.a(this.H);
            if (a2 > a && a3 > a4) {
                final atb e = atb.e(a2 - a, this.H);
                final atb e2 = atb.e(a3 - a4, this.H);
                this.F[n].put("ImageLength", e);
                this.F[n].put("ImageWidth", e2);
            }
        }
        else {
            final atb atb8 = this.F[n].get("ImageLength");
            final atb atb9 = this.F[n].get("ImageWidth");
            if (atb8 == null || atb9 == null) {
                final atb atb10 = this.F[n].get("JPEGInterchangeFormat");
                final atb atb11 = this.F[n].get("JPEGInterchangeFormatLength");
                if (atb10 != null && atb11 != null) {
                    final int a5 = atb10.a(this.H);
                    final int a6 = atb10.a(this.H);
                    ata.c(a5);
                    final byte[] array3 = new byte[a6];
                    ata.readFully(array3);
                    this.e(new ata(array3), a5, n);
                }
            }
        }
    }
    
    private static final boolean u(byte[] array) {
        final InputStream inputStream = null;
        final InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        try {
            final ata ata = new ata(array);
            try {
                long long1 = ata.readInt();
                array = new byte[4];
                ata.readFully(array);
                if (!Arrays.equals(array, atd.j)) {
                    ata.close();
                    return false;
                }
                long n;
                if (long1 == 1L) {
                    long1 = ata.readLong();
                    n = 16L;
                    if (long1 < 16L) {
                        ata.close();
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
                    ata.close();
                    return false;
                }
                array = new byte[4];
                long n4 = 0L;
                int n5 = 0;
                int n6 = 0;
                while (n4 < n3 >> 2) {
                    try {
                        ata.readFully(array);
                        int n7;
                        if (n4 == 1L) {
                            n7 = n6;
                        }
                        else {
                            int n8;
                            if (Arrays.equals(array, atd.k)) {
                                n8 = 1;
                            }
                            else {
                                final boolean equals = Arrays.equals(array, atd.l);
                                n8 = n5;
                                if (equals) {
                                    n6 = 1;
                                    n8 = n5;
                                }
                            }
                            n5 = n8;
                            n7 = n6;
                            if (n8 != 0) {
                                n5 = n8;
                                if ((n7 = n6) != 0) {
                                    ata.close();
                                    return true;
                                }
                            }
                        }
                        ++n4;
                        n6 = n7;
                        continue;
                    }
                    catch (final EOFException ex) {
                        ata.close();
                        return false;
                    }
                    break;
                }
                ata.close();
                return false;
            }
            catch (final Exception ex2) {}
        }
        catch (final Exception ex3) {
            inputStream3 = inputStream;
        }
        finally {
            inputStream3 = inputStream2;
        }
        if (inputStream3 != null) {
            inputStream3.close();
        }
        return false;
    }
    
    private static final ByteOrder v(final ata ata) {
        final short short1 = ata.readShort();
        if (short1 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (short1 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(short1))));
    }
    
    public final String a(final String s) {
        final atb c = this.c(s);
        Label_0489: {
            if (c == null) {
                break Label_0489;
            }
            if (!atd.z.contains(s)) {
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
                final atc[] array = (atc[])c.f(this.H);
                if (array != null && array.length == 3) {
                    final atc atc = array[0];
                    final int n = (int)(atc.a / (float)atc.b);
                    final atc atc2 = array[1];
                    final int n2 = (int)(atc2.a / (float)atc2.b);
                    final atc atc3 = array[2];
                    return String.format("%02d:%02d:%02d", n, n2, (int)(atc3.a / (float)atc3.b));
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
                        if (!(f instanceof atc[])) {
                            throw new NumberFormatException("Couldn't find a double value");
                        }
                        final atc[] array5 = (atc[])f;
                        if (array5.length != 1) {
                            throw new NumberFormatException("There are more than one component");
                        }
                        final atc atc4 = array5[0];
                        final double n3 = (double)atc4.a;
                        final double n4 = (double)atc4.b;
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
        final atb c = this.c("Orientation");
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

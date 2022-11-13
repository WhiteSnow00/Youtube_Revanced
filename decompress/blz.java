import android.media.MediaCodecInfo$AudioCapabilities;
import android.media.MediaCodecInfo$CodecProfileLevel;
import android.util.Pair;
import android.graphics.Point;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecInfo$CodecCapabilities;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blz
{
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo$CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final boolean i;
    
    public blz(final String a, final String b, final String c, final MediaCodecInfo$CodecCapabilities d, final boolean g, final boolean h, final boolean e, final boolean f) {
        dk.d((Object)a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        this.i = ayz.m(b);
    }
    
    public static Point a(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, final int n, final int n2) {
        final int widthAlignment = mediaCodecInfo$VideoCapabilities.getWidthAlignment();
        final int heightAlignment = mediaCodecInfo$VideoCapabilities.getHeightAlignment();
        return new Point(bax.c(n, widthAlignment) * widthAlignment, bax.c(n2, heightAlignment) * heightAlignment);
    }
    
    private static boolean g(final MediaCodecInfo$VideoCapabilities mediaCodecInfo$VideoCapabilities, int x, int y, final double n) {
        final Point a = a(mediaCodecInfo$VideoCapabilities, x, y);
        x = a.x;
        y = a.y;
        if (n != -1.0 && n >= 1.0) {
            return mediaCodecInfo$VideoCapabilities.areSizeAndRateSupported(x, y, Math.floor(n));
        }
        return mediaCodecInfo$VideoCapabilities.isSizeSupported(x, y);
    }
    
    public final bdz b(final ayg ayg, final ayg ayg2) {
        int n;
        if (!bax.aa((Object)ayg.n, (Object)ayg2.n)) {
            n = 8;
        }
        else {
            n = 0;
        }
        int n6;
        if (this.i) {
            int n2 = n;
            if (ayg.v != ayg2.v) {
                n2 = (n | 0x400);
            }
            int n3 = n2;
            Label_0093: {
                if (!this.e) {
                    if (ayg.s == ayg2.s) {
                        n3 = n2;
                        if (ayg.t == ayg2.t) {
                            break Label_0093;
                        }
                    }
                    n3 = (n2 | 0x200);
                }
            }
            int n4 = n3;
            if (!bax.aa((Object)ayg.z, (Object)ayg2.z)) {
                n4 = (n3 | 0x800);
            }
            final String a = this.a;
            int n5 = n4;
            if (bax.d.startsWith("SM-T230")) {
                n5 = n4;
                if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(a)) {
                    n5 = n4;
                    if (!ayg.e(ayg2)) {
                        n5 = (n4 | 0x2);
                    }
                }
            }
            if ((n6 = n5) == 0) {
                final String a2 = this.a;
                int n7;
                if (!ayg.e(ayg2)) {
                    n7 = 2;
                }
                else {
                    n7 = 3;
                }
                return new bdz(a2, ayg, ayg2, n7, 0);
            }
        }
        else {
            int n8 = n;
            if (ayg.A != ayg2.A) {
                n8 = (n | 0x1000);
            }
            int n9 = n8;
            if (ayg.B != ayg2.B) {
                n9 = (n8 | 0x2000);
            }
            int n10 = n9;
            if (ayg.C != ayg2.C) {
                n10 = (n9 | 0x4000);
            }
            if (n10 == 0 && "audio/mp4a-latm".equals(this.b)) {
                final Pair a3 = bmk.a(ayg);
                final Pair a4 = bmk.a(ayg2);
                if (a3 != null && a4 != null) {
                    final int intValue = (int)a3.first;
                    final int intValue2 = (int)a4.first;
                    if (intValue == 42) {
                        if (intValue2 == 42) {
                            return new bdz(this.a, ayg, ayg2, 3, 0);
                        }
                    }
                }
            }
            int n11 = n10;
            if (!ayg.e(ayg2)) {
                n11 = (n10 | 0x20);
            }
            int n12 = n11;
            if ("audio/opus".equals(this.b)) {
                n12 = (n11 | 0x2);
            }
            if ((n6 = n12) == 0) {
                return new bdz(this.a, ayg, ayg2, 1, 0);
            }
        }
        return new bdz(this.a, ayg, ayg2, 0, n6);
    }
    
    public final boolean c(final ayg ayg) {
        final boolean equals = this.b.equals(ayg.n);
        boolean b = false;
        if (!equals && !this.b.equals(bmk.c(ayg))) {
            return false;
        }
        Label_0271: {
            if (ayg.k != null) {
                final Pair a = bmk.a(ayg);
                if (a != null) {
                    final int intValue = (int)a.first;
                    int intValue2 = (int)a.second;
                    int n = intValue;
                    if ("video/dolby-vision".equals(ayg.n)) {
                        if ("video/avc".equals(this.b)) {
                            n = 8;
                            intValue2 = 0;
                        }
                        else {
                            intValue2 = intValue2;
                            n = intValue;
                            if ("video/hevc".equals(this.b)) {
                                intValue2 = 0;
                                n = 2;
                            }
                        }
                    }
                    int n2 = n;
                    if (!this.i) {
                        if (n != 42) {
                            break Label_0271;
                        }
                        n2 = 42;
                    }
                    final MediaCodecInfo$CodecProfileLevel[] f = this.f();
                    final int a2 = bax.a;
                    for (final MediaCodecInfo$CodecProfileLevel mediaCodecInfo$CodecProfileLevel : f) {
                        if (mediaCodecInfo$CodecProfileLevel.profile == n2 && mediaCodecInfo$CodecProfileLevel.level >= intValue2 && (!"video/hevc".equals(this.b) || n2 != 2 || (!"sailfish".equals(bax.b) && !"marlin".equals(bax.b)))) {
                            break Label_0271;
                        }
                    }
                    final String k = ayg.k;
                    bap.e();
                    return false;
                }
            }
        }
        if (!this.i) {
            final int a3 = bax.a;
            final int b2 = ayg.B;
            if (b2 != -1) {
                final MediaCodecInfo$CodecCapabilities d = this.d;
                if (d == null) {
                    bap.e();
                    return b;
                }
                final MediaCodecInfo$AudioCapabilities audioCapabilities = d.getAudioCapabilities();
                if (audioCapabilities == null) {
                    bap.e();
                    return b;
                }
                if (!audioCapabilities.isSampleRateSupported(b2)) {
                    bap.e();
                    return b;
                }
            }
            final int a4 = ayg.A;
            if (a4 != -1) {
                final MediaCodecInfo$CodecCapabilities d2 = this.d;
                if (d2 == null) {
                    bap.e();
                }
                else {
                    final MediaCodecInfo$AudioCapabilities audioCapabilities2 = d2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        bap.e();
                    }
                    else {
                        final String a5 = this.a;
                        final String b3 = this.b;
                        final int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        int n3;
                        if ((n3 = maxInputChannelCount) <= 1) {
                            if (maxInputChannelCount > 0) {
                                n3 = maxInputChannelCount;
                            }
                            else {
                                n3 = maxInputChannelCount;
                                if (!"audio/mpeg".equals(b3)) {
                                    n3 = maxInputChannelCount;
                                    if (!"audio/3gpp".equals(b3)) {
                                        n3 = maxInputChannelCount;
                                        if (!"audio/amr-wb".equals(b3)) {
                                            n3 = maxInputChannelCount;
                                            if (!"audio/mp4a-latm".equals(b3)) {
                                                n3 = maxInputChannelCount;
                                                if (!"audio/vorbis".equals(b3)) {
                                                    n3 = maxInputChannelCount;
                                                    if (!"audio/opus".equals(b3)) {
                                                        n3 = maxInputChannelCount;
                                                        if (!"audio/raw".equals(b3)) {
                                                            n3 = maxInputChannelCount;
                                                            if (!"audio/flac".equals(b3)) {
                                                                n3 = maxInputChannelCount;
                                                                if (!"audio/g711-alaw".equals(b3)) {
                                                                    n3 = maxInputChannelCount;
                                                                    if (!"audio/g711-mlaw".equals(b3)) {
                                                                        if ("audio/gsm".equals(b3)) {
                                                                            n3 = maxInputChannelCount;
                                                                        }
                                                                        else {
                                                                            if ("audio/ac3".equals(b3)) {
                                                                                n3 = 6;
                                                                            }
                                                                            else if ("audio/eac3".equals(b3)) {
                                                                                n3 = 16;
                                                                            }
                                                                            else {
                                                                                n3 = 30;
                                                                            }
                                                                            final StringBuilder sb = new StringBuilder("AssumedMaxChannelAdjustment: ");
                                                                            sb.append(a5);
                                                                            sb.append(", [");
                                                                            sb.append(maxInputChannelCount);
                                                                            sb.append(" to ");
                                                                            sb.append(n3);
                                                                            sb.append("]");
                                                                            bap.c("MediaCodecInfo", sb.toString());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (n3 >= a4) {
                            return true;
                        }
                        bap.e();
                    }
                }
                return false;
            }
            b = true;
            return b;
        }
        if (ayg.s > 0 && ayg.t > 0) {
            final int a6 = bax.a;
            return this.e(ayg.s, ayg.t, ayg.u);
        }
        return true;
    }
    
    public final boolean d(final ayg ayg) {
        if (this.i) {
            return this.e;
        }
        final Pair a = bmk.a(ayg);
        return a != null && (int)a.first == 42;
    }
    
    public final boolean e(int n, final int n2, final double n3) {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        if (d == null) {
            n = bax.a;
            bap.e();
            return false;
        }
        final MediaCodecInfo$VideoCapabilities videoCapabilities = d.getVideoCapabilities();
        if (videoCapabilities == null) {
            n = bax.a;
            bap.e();
            return false;
        }
        if (bax.a >= 29) {
            final int a = bly.a(videoCapabilities, n, n2, n3);
            if (a == 2) {
                return true;
            }
            if (a == 1) {
                bap.e();
                return false;
            }
        }
        if (!g(videoCapabilities, n, n2, n3)) {
            if (n >= n2 || ("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(bax.b)) || !g(videoCapabilities, n2, n, n3)) {
                bap.e();
                return false;
            }
            bap.e();
        }
        return true;
    }
    
    public final MediaCodecInfo$CodecProfileLevel[] f() {
        final MediaCodecInfo$CodecCapabilities d = this.d;
        MediaCodecInfo$CodecProfileLevel[] profileLevels;
        if (d != null && d.profileLevels != null) {
            profileLevels = this.d.profileLevels;
        }
        else {
            profileLevels = new MediaCodecInfo$CodecProfileLevel[0];
        }
        return profileLevels;
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}

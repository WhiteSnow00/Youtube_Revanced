import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import android.util.Pair;
import androidx.media3.common.DrmInitData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvp
{
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public byte[] N;
    public int O;
    public int P;
    public int Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public String V;
    public buc W;
    public int X;
    public lyc Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public bub j;
    public byte[] k;
    public DrmInitData l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public byte[] v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    
    protected bvp() {
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = -1;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = null;
        this.w = -1;
        this.x = false;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = 1000;
        this.C = 200;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = -1.0f;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = -1.0f;
        this.K = -1.0f;
        this.L = -1.0f;
        this.M = -1.0f;
        this.O = 1;
        this.P = -1;
        this.Q = 8000;
        this.R = 0L;
        this.S = 0L;
        this.U = true;
        this.V = "eng";
    }
    
    public static Pair a(final bar bar) {
        try {
            bar.H(16);
            final long o = bar.o();
            if (o == 1482049860L) {
                return new Pair((Object)"video/divx", (Object)null);
            }
            if (o == 859189832L) {
                return new Pair((Object)"video/3gpp", (Object)null);
            }
            if (o != 826496599L) {
                bao.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair((Object)"video/x-unknown", (Object)null);
            }
            int n = bar.b + 20;
            final byte[] a = bar.a;
            while (true) {
                final int length = a.length;
                if (n >= length - 4) {
                    throw ayz.a("Failed to find FourCC VC1 initialization data", (Throwable)null);
                }
                if (a[n] == 0 && a[n + 1] == 0 && a[n + 2] == 1 && a[n + 3] == 15) {
                    return new Pair((Object)"video/wvc1", (Object)Collections.singletonList(Arrays.copyOfRange(a, n, length)));
                }
                ++n;
            }
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ayz.a("Error parsing FourCC private data", (Throwable)null);
        }
    }
    
    public static List b(final byte[] array) {
        Label_0194: {
            if (array[0] != 2) {
                break Label_0194;
            }
            int n = 1;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = (array[n] & 0xFF);
                if (n3 != 255) {
                    break;
                }
                n2 += 255;
                ++n;
            }
            ++n;
            final int n4 = n2 + n3;
            int n5 = 0;
            int n6;
            while (true) {
                n6 = (array[n] & 0xFF);
                if (n6 != 255) {
                    break;
                }
                n5 += 255;
                ++n;
            }
            ++n;
            Label_0187: {
                if (array[n] != 1) {
                    break Label_0187;
                }
                try {
                    final byte[] array2 = new byte[n4];
                    System.arraycopy(array, n, array2, 0, n4);
                    final int n7 = n + n4;
                    if (array[n7] != 3) {
                        throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                    }
                    final int n8 = n7 + (n5 + n6);
                    if (array[n8] == 5) {
                        final int n9 = array.length - n8;
                        final byte[] array3 = new byte[n9];
                        System.arraycopy(array, n8, array3, 0, n9);
                        final ArrayList list = new ArrayList(2);
                        list.add(array2);
                        list.add(array3);
                        return list;
                    }
                    throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                    throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                    throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                }
            }
        }
    }
    
    public static boolean d(final bar bar) {
        try {
            final int g = bar.g();
            if (g == 1) {
                return true;
            }
            if (g == 65534) {
                bar.G(24);
                if (bar.p() == bvq.b.getMostSignificantBits() && bar.p() == bvq.b.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ayz.a("Error parsing MS/ACM codec private", (Throwable)null);
        }
    }
    
    public final void c() {
        dk.d((Object)this.W);
    }
    
    public final byte[] e(final String s) {
        final byte[] k = this.k;
        if (k != null) {
            return k;
        }
        throw ayz.a("Missing CodecPrivate for codec ".concat(String.valueOf(s)), (Throwable)null);
    }
}

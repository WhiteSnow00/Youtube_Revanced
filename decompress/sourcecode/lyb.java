import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import android.util.Pair;
import androidx.media3.common.DrmInitData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lyb
{
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public int M;
    public int N;
    public int O;
    public long P;
    public long Q;
    public lyc R;
    public boolean S;
    public boolean T;
    public String U;
    public buc V;
    public int W;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public bub i;
    public byte[] j;
    public DrmInitData k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public float t;
    public byte[] u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    
    protected lyb() {
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = -1;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = null;
        this.v = -1;
        this.w = false;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = 1000;
        this.B = 200;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = -1.0f;
        this.G = -1.0f;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = -1.0f;
        this.K = -1.0f;
        this.L = -1.0f;
        this.M = 1;
        this.N = -1;
        this.O = 8000;
        this.P = 0L;
        this.Q = 0L;
        this.T = true;
        this.U = "eng";
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
            throw ayz.a("Error parsing FourCC private data", (Throwable)ex);
        }
    }
    
    public static List b(final byte[] array) {
        Label_0182: {
            if (array[0] != 2) {
                break Label_0182;
            }
            int n = 1;
            int n2 = 0;
            byte b;
            while (true) {
                b = array[n];
                if (b != -1) {
                    break;
                }
                n2 += 255;
                ++n;
            }
            ++n;
            final int n3 = n2 + b;
            int n4 = 0;
            byte b2;
            while (true) {
                b2 = array[n];
                if (b2 != -1) {
                    break;
                }
                n4 += 255;
                ++n;
            }
            ++n;
            Label_0175: {
                if (array[n] != 1) {
                    break Label_0175;
                }
                try {
                    final byte[] array2 = new byte[n3];
                    System.arraycopy(array, n, array2, 0, n3);
                    final int n5 = n + n3;
                    if (array[n5] != 3) {
                        throw ayz.a("Error parsing vorbis codec private", (Throwable)null);
                    }
                    final int n6 = n5 + (n4 + b2);
                    if (array[n6] == 5) {
                        final int n7 = array.length - n6;
                        final byte[] array3 = new byte[n7];
                        System.arraycopy(array, n6, array3, 0, n7);
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
                    throw ayz.a("Error parsing vorbis codec private", (Throwable)ex);
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
                if (bar.p() == lyd.b.getMostSignificantBits() && bar.p() == lyd.b.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ayz.a("Error parsing MS/ACM codec private", (Throwable)ex);
        }
    }
    
    public final void c() {
        final lyc r = this.R;
        if (r != null) {
            r.a(this);
        }
    }
}

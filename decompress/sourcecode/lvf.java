import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvf
{
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public long I;
    public long J;
    public String K;
    public lsv L;
    public int M;
    public String a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    
    public lvf() {
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = 0;
        this.n = null;
        this.o = -1;
        this.p = false;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = 1000;
        this.u = 200;
        this.v = -1.0f;
        this.w = -1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = -1.0f;
        this.B = -1.0f;
        this.C = -1.0f;
        this.D = -1.0f;
        this.E = -1.0f;
        this.F = 1;
        this.G = -1;
        this.H = 8000;
        this.I = 0L;
        this.J = 0L;
        this.K = "eng";
    }
    
    public static Pair a(final lwg lwg) {
        try {
            lwg.x(4);
            final int n = (lwg.h() & 0x3) + 1;
            if (n != 3) {
                final ArrayList list = new ArrayList();
                final int h = lwg.h();
                final int n2 = 0;
                for (int i = 0; i < (h & 0x1F); ++i) {
                    list.add(lwe.e(lwg));
                }
                for (int h2 = lwg.h(), j = n2; j < h2; ++j) {
                    list.add(lwe.e(lwg));
                }
                return Pair.create((Object)list, (Object)n);
            }
            throw new lrl();
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new lrl("Error parsing AVC codec private");
        }
    }
    
    public static Pair b(final lwg lwg) {
        try {
            lwg.x(21);
            final int h = lwg.h();
            final int h2 = lwg.h();
            final int a = lwg.a;
            int i = 0;
            int n = 0;
            while (i < h2) {
                lwg.y(1);
                for (int k = lwg.k(), j = 0; j < k; ++j) {
                    final int l = lwg.k();
                    n += l + 4;
                    lwg.y(l);
                }
                ++i;
            }
            lwg.x(a);
            final byte[] array = new byte[n];
            int n2 = 0;
            int n3 = 0;
        Label_0123_Outer:
            while (true) {
                Label_0189: {
                    if (n2 >= h2) {
                        break Label_0189;
                    }
                    lwg.y(1);
                    final int m = lwg.k();
                    int n4 = 0;
                    while (true) {
                        Label_0183: {
                            if (n4 >= m) {
                                break Label_0183;
                            }
                            final int k2 = lwg.k();
                            System.arraycopy(lwe.a, 0, array, n3, 4);
                            n3 += 4;
                            try {
                                System.arraycopy(lwg.c, lwg.a, array, n3, k2);
                                n3 += k2;
                                lwg.y(k2);
                                ++n4;
                                continue;
                                iftrue(Label_0199:)(n != 0);
                                Block_8: {
                                    break Block_8;
                                    ++n2;
                                    continue Label_0123_Outer;
                                    final Object singletonList;
                                    Label_0199: {
                                        singletonList = Collections.singletonList(array);
                                    }
                                    return Pair.create(singletonList, (Object)((h & 0x3) + 1));
                                }
                                Object singletonList = null;
                            }
                            catch (final ArrayIndexOutOfBoundsException ex) {
                                throw new lrl("Error parsing HEVC codec private");
                            }
                        }
                        break;
                    }
                }
            }
        }
        catch (final ArrayIndexOutOfBoundsException ex2) {}
    }
    
    public static List c(final lwg lwg) {
        try {
            lwg.y(16);
            final long l = lwg.l();
            if (l != 826496599L) {
                final StringBuilder sb = new StringBuilder("Unsupported FourCC compression type: ");
                sb.append(l);
                throw new lrl(sb.toString());
            }
            int n = lwg.a + 20;
            final Object c = lwg.c;
            while (true) {
                final int length = ((byte[])c).length;
                if (n >= length - 4) {
                    throw new lrl("Failed to find FourCC VC1 initialization data");
                }
                if (((byte[])c)[n] == 0 && ((byte[])c)[n + 1] == 0 && ((byte[])c)[n + 2] == 1 && ((byte[])c)[n + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange((byte[])c, n, length));
                }
                ++n;
            }
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new lrl("Error parsing FourCC VC1 codec private");
        }
    }
    
    public static List d(final byte[] array) {
        Label_0197: {
            if (array[0] != 2) {
                break Label_0197;
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
            Label_0185: {
                if (array[n] != 1) {
                    break Label_0185;
                }
                try {
                    final byte[] array2 = new byte[n3];
                    System.arraycopy(array, n, array2, 0, n3);
                    final int n5 = n + n3;
                    if (array[n5] != 3) {
                        throw new lrl("Error parsing vorbis codec private");
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
                    throw new lrl("Error parsing vorbis codec private");
                    throw new lrl("Error parsing vorbis codec private");
                    throw new lrl("Error parsing vorbis codec private");
                }
                catch (final ArrayIndexOutOfBoundsException ex) {
                    throw new lrl("Error parsing vorbis codec private");
                }
            }
        }
    }
    
    public static boolean e(final lwg lwg) {
        try {
            final int f = lwg.f();
            if (f == 1) {
                return true;
            }
            if (f == 65534) {
                lwg.x(24);
                if (lwg.m() == lvg.a.getMostSignificantBits() && lwg.m() == lvg.a.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new lrl("Error parsing MS/ACM codec private");
        }
    }
}

import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzn implements bzp
{
    private final bas a;
    private final String b;
    private String c;
    private bud d;
    private int e;
    private int f;
    private int g;
    private long h;
    private ayg i;
    private int j;
    private long k;
    
    public bzn(final String b) {
        this.a = new bas(new byte[18]);
        this.e = 0;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.d);
        while (bas.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bas.a(), this.j - this.f);
                    this.d.c(bas, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buc)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bas.a(), 18 - this.f);
                    bas.B(a, this.f, min2);
                    if ((this.f += min2) != 18) {
                        continue;
                    }
                    final byte[] a2 = this.a.a;
                    if (this.i == null) {
                        final String c = this.c;
                        final String b = this.b;
                        final int[] a3 = bth.a;
                        atim atim;
                        if (a2[0] == 127) {
                            atim = new atim(a2, (byte[])null);
                        }
                        else {
                            final byte[] copy = Arrays.copyOf(a2, a2.length);
                            final byte b2 = copy[0];
                            if (b2 == -2 || b2 == -1) {
                                for (int i = 0; i < copy.length - 1; i += 2) {
                                    final byte b3 = copy[i];
                                    final int n = i + 1;
                                    copy[i] = copy[n];
                                    copy[n] = b3;
                                }
                            }
                            atim = new atim(copy, (byte[])null);
                            if (copy[0] == 31) {
                                final atim atim2 = new atim(copy, (byte[])null);
                                while (atim2.d() >= 16) {
                                    atim2.o(2);
                                    final int n2 = atim2.g(14) & 0x3FFF;
                                    final int min3 = Math.min(8 - atim.a, 14);
                                    final int a4 = atim.a;
                                    final int n3 = 8 - a4 - min3;
                                    final Object d = atim.d;
                                    final int b4 = atim.b;
                                    final byte[] array = (byte[])d;
                                    final byte b5 = (byte)(array[b4] & (65280 >> a4 | (1 << n3) - 1));
                                    array[b4] = b5;
                                    int l = 14 - min3;
                                    array[b4] = (byte)(b5 | n2 >>> l << n3);
                                    int n4;
                                    Object d2;
                                    for (n4 = b4 + 1; l > 8; l -= 8, ((byte[])d2)[n4] = (byte)(n2 >>> l), ++n4) {
                                        d2 = atim.d;
                                    }
                                    final int n5 = 8 - l;
                                    final byte[] array2 = (byte[])atim.d;
                                    final byte b6 = (byte)(array2[n4] & (1 << n5) - 1);
                                    array2[n4] = b6;
                                    array2[n4] = (byte)((n2 & (1 << l) - 1) << n5 | b6);
                                    atim.o(14);
                                    atim.i();
                                }
                            }
                            atim.k(copy);
                        }
                        atim.o(60);
                        final int n6 = bth.a[atim.g(6)];
                        final int y = bth.b[atim.g(4)];
                        final int g = atim.g(5);
                        int f2;
                        if (g >= 29) {
                            f2 = -1;
                        }
                        else {
                            f2 = bth.c[g] * 1000 / 2;
                        }
                        atim.o(10);
                        int n7;
                        if (atim.g(2) > 0) {
                            n7 = 1;
                        }
                        else {
                            n7 = 0;
                        }
                        final ayf ayf = new ayf();
                        ayf.a = c;
                        ayf.k = "audio/vnd.dts";
                        ayf.f = f2;
                        ayf.x = n6 + n7;
                        ayf.y = y;
                        ayf.n = null;
                        ayf.c = b;
                        final ayg a5 = ayf.a();
                        this.i = a5;
                        this.d.b(a5);
                    }
                    final int[] a6 = bth.a;
                    final byte b7 = a2[0];
                    int n8 = 0;
                    boolean b8 = false;
                    Label_0953: {
                        Label_0947: {
                            if (b7 != -2) {
                                if (b7 != -1) {
                                    if (b7 != 31) {
                                        n8 = ((0x3 & a2[5]) << 12 | (a2[6] & 0xFF) << 4 | (a2[7] & 0xF0) >> 4);
                                        break Label_0947;
                                    }
                                    n8 = ((a2[6] & 0x3) << 12 | (a2[7] & 0xFF) << 4 | (a2[8] & 0x3C) >> 2);
                                }
                                else {
                                    n8 = ((a2[7] & 0x3) << 12 | (a2[6] & 0xFF) << 4 | (a2[9] & 0x3C) >> 2);
                                }
                                ++n8;
                                b8 = true;
                                break Label_0953;
                            }
                            n8 = ((a2[4] & 0x3) << 12 | (a2[7] & 0xFF) << 4 | (a2[6] & 0xF0) >> 4);
                        }
                        ++n8;
                        b8 = false;
                    }
                    int m = n8;
                    if (b8) {
                        m = n8 * 16 / 14;
                    }
                    this.j = m;
                    int n11;
                    if (b7 != -2) {
                        int n9 = 0;
                        int n10 = 0;
                        Label_1063: {
                            byte b9;
                            if (b7 != -1) {
                                if (b7 != 31) {
                                    n9 = (a2[4] & 0x1) << 6;
                                    n10 = (a2[5] & 0xFC);
                                    break Label_1063;
                                }
                                n9 = (0x7 & a2[5]) << 4;
                                b9 = a2[6];
                            }
                            else {
                                n9 = (a2[4] & 0x7) << 4;
                                b9 = a2[7];
                            }
                            n10 = (b9 & 0x3C);
                        }
                        n11 = (n10 >> 2 | n9);
                    }
                    else {
                        n11 = ((a2[4] & 0xFC) >> 2 | (a2[5] & 0x1) << 6);
                    }
                    this.h = (int)((n11 + 1) * 32 * 1000000L / this.i.B);
                    this.a.G(0);
                    this.d.c(this.a, 18);
                    this.e = 2;
                }
            }
            else {
                while (bas.a() > 0) {
                    final int g2 = this.g << 8;
                    this.g = g2;
                    final int g3 = g2 | bas.i();
                    this.g = g3;
                    final int[] a7 = bth.a;
                    if (g3 == 2147385345 || g3 == -25230976 || g3 == 536864768 || g3 == -14745368) {
                        final byte[] a8 = this.a.a;
                        final int g4 = this.g;
                        a8[0] = (byte)(g4 >> 24 & 0xFF);
                        a8[1] = (byte)(g4 >> 16 & 0xFF);
                        a8[2] = (byte)(g4 >> 8 & 0xFF);
                        a8[3] = (byte)(g4 & 0xFF);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.c = cao.b();
        this.d = btm.q(cao.a(), 1);
    }
    
    public final void c() {
    }
    
    public final void d(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public final void e() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
}

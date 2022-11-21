import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzq implements bzs
{
    private final bat a;
    private final String b;
    private String c;
    private bug d;
    private int e;
    private int f;
    private int g;
    private long h;
    private ayh i;
    private int j;
    private long k;
    
    public bzq(final String b) {
        this.a = new bat(new byte[18]);
        this.e = 0;
        this.k = -9223372036854775807L;
        this.b = b;
    }
    
    public final void a(final bat bat) {
        bad.c(this.d);
        while (bat.a() > 0) {
            final int e = this.e;
            if (e != 0) {
                if (e != 1) {
                    final int min = Math.min(bat.a(), this.j - this.f);
                    this.d.c(bat, min);
                    final int f = this.f + min;
                    this.f = f;
                    final int j = this.j;
                    if (f != j) {
                        continue;
                    }
                    final long k = this.k;
                    if (k != -9223372036854775807L) {
                        this.d.e(k, 1, j, 0, (buf)null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
                else {
                    final byte[] a = this.a.a;
                    final int min2 = Math.min(bat.a(), 18 - this.f);
                    bat.B(a, this.f, min2);
                    if ((this.f += min2) != 18) {
                        continue;
                    }
                    final byte[] a2 = this.a.a;
                    if (this.i == null) {
                        final String c = this.c;
                        final String b = this.b;
                        final int[] a3 = btk.a;
                        atlj atlj;
                        if (a2[0] == 127) {
                            atlj = new atlj(a2, null);
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
                            atlj = new atlj(copy, null);
                            if (copy[0] == 31) {
                                final atlj atlj2 = new atlj(copy, null);
                                while (atlj2.d() >= 16) {
                                    atlj2.o(2);
                                    final int n2 = atlj2.g(14) & 0x3FFF;
                                    final int min3 = Math.min(8 - atlj.a, 14);
                                    final int a4 = atlj.a;
                                    final int n3 = 8 - a4 - min3;
                                    final Object d = atlj.d;
                                    int b4 = atlj.b;
                                    final byte[] array = (byte[])d;
                                    final byte b5 = (byte)(array[b4] & (65280 >> a4 | (1 << n3) - 1));
                                    array[b4] = b5;
                                    int l = 14 - min3;
                                    array[b4] = (byte)(b5 | n2 >>> l << n3);
                                    ++b4;
                                    while (l > 8) {
                                        final Object d2 = atlj.d;
                                        l -= 8;
                                        ((byte[])d2)[b4] = (byte)(n2 >>> l);
                                        ++b4;
                                    }
                                    final int n4 = 8 - l;
                                    final byte[] array2 = (byte[])atlj.d;
                                    final byte b6 = (byte)(array2[b4] & (1 << n4) - 1);
                                    array2[b4] = b6;
                                    array2[b4] = (byte)((n2 & (1 << l) - 1) << n4 | b6);
                                    atlj.o(14);
                                    atlj.i();
                                }
                            }
                            atlj.k(copy);
                        }
                        atlj.o(60);
                        final int n5 = btk.a[atlj.g(6)];
                        final int y = btk.b[atlj.g(4)];
                        final int g = atlj.g(5);
                        int f2;
                        if (g >= 29) {
                            f2 = -1;
                        }
                        else {
                            f2 = btk.c[g] * 1000 / 2;
                        }
                        atlj.o(10);
                        int n6;
                        if (atlj.g(2) > 0) {
                            n6 = 1;
                        }
                        else {
                            n6 = 0;
                        }
                        final ayg ayg = new ayg();
                        ayg.a = c;
                        ayg.k = "audio/vnd.dts";
                        ayg.f = f2;
                        ayg.x = n5 + n6;
                        ayg.y = y;
                        ayg.n = null;
                        ayg.c = b;
                        final ayh a5 = ayg.a();
                        this.i = a5;
                        this.d.b(a5);
                    }
                    final int[] a6 = btk.a;
                    final byte b7 = a2[0];
                    int n7 = 0;
                    boolean b8 = false;
                    Label_0950: {
                        Label_0944: {
                            if (b7 != -2) {
                                if (b7 != -1) {
                                    if (b7 != 31) {
                                        n7 = ((0x3 & a2[5]) << 12 | (a2[6] & 0xFF) << 4 | (a2[7] & 0xF0) >> 4);
                                        break Label_0944;
                                    }
                                    n7 = ((a2[6] & 0x3) << 12 | (a2[7] & 0xFF) << 4 | (a2[8] & 0x3C) >> 2);
                                }
                                else {
                                    n7 = ((a2[7] & 0x3) << 12 | (a2[6] & 0xFF) << 4 | (a2[9] & 0x3C) >> 2);
                                }
                                ++n7;
                                b8 = true;
                                break Label_0950;
                            }
                            n7 = ((a2[4] & 0x3) << 12 | (a2[7] & 0xFF) << 4 | (a2[6] & 0xF0) >> 4);
                        }
                        ++n7;
                        b8 = false;
                    }
                    int m = n7;
                    if (b8) {
                        m = n7 * 16 / 14;
                    }
                    this.j = m;
                    int n10;
                    if (b7 != -2) {
                        int n8 = 0;
                        int n9 = 0;
                        Label_1060: {
                            byte b9;
                            if (b7 != -1) {
                                if (b7 != 31) {
                                    n8 = (a2[4] & 0x1) << 6;
                                    n9 = (a2[5] & 0xFC);
                                    break Label_1060;
                                }
                                n8 = (0x7 & a2[5]) << 4;
                                b9 = a2[6];
                            }
                            else {
                                n8 = (a2[4] & 0x7) << 4;
                                b9 = a2[7];
                            }
                            n9 = (b9 & 0x3C);
                        }
                        n10 = (n9 >> 2 | n8);
                    }
                    else {
                        n10 = ((a2[4] & 0xFC) >> 2 | (a2[5] & 0x1) << 6);
                    }
                    this.h = (int)((n10 + 1) * 32 * 1000000L / this.i.B);
                    this.a.G(0);
                    this.d.c(this.a, 18);
                    this.e = 2;
                }
            }
            else {
                while (bat.a() > 0) {
                    final int g2 = this.g << 8;
                    this.g = g2;
                    final int g3 = g2 | bat.i();
                    this.g = g3;
                    final int[] a7 = btk.a;
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
    
    public final void b(final btp btp, final car car) {
        car.c();
        this.c = car.b();
        this.d = btp.q(car.a(), 1);
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

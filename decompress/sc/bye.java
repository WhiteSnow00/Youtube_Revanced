import java.util.List;
import java.util.Collections;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.zip.Inflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bye extends bxh
{
    private final bas a;
    private final bas b;
    private final byd c;
    private Inflater d;
    
    public bye() {
        super("PgsDecoder");
        this.a = new bas();
        this.b = new bas();
        this.c = new byd();
    }
    
    protected final bxi n(final byte[] array, int i, final boolean b) {
        this.a.E(array, i);
        final bas a = this.a;
        if (a.a() > 0 && a.c() == 120) {
            if (this.d == null) {
                this.d = new Inflater();
            }
            if (bax.ab(a, this.b, this.d)) {
                final bas b2 = this.b;
                a.E(b2.a, b2.c);
            }
        }
        this.c.a();
        final ArrayList<azy> list = new ArrayList<azy>();
        while (this.a.a() >= 3) {
            final bas a2 = this.a;
            final byd c = this.c;
            final int c2 = a2.c;
            final int j = a2.i();
            final int m = a2.m();
            i = a2.b + m;
            azy a3;
            if (i > c2) {
                a2.G(c2);
                a3 = null;
            }
            else {
                if (j != 128) {
                    switch (j) {
                        case 22: {
                            if (m < 19) {
                                break;
                            }
                            c.d = a2.m();
                            c.e = a2.m();
                            a2.H(11);
                            c.f = a2.m();
                            c.g = a2.m();
                            break;
                        }
                        case 21: {
                            if (m < 4) {
                                break;
                            }
                            a2.H(3);
                            final int k = a2.i();
                            int n2;
                            final int n = n2 = m - 4;
                            if ((k & 0x80) != 0x0) {
                                if (n < 7) {
                                    break;
                                }
                                final int l = a2.k();
                                if (l < 4) {
                                    break;
                                }
                                c.h = a2.m();
                                c.i = a2.m();
                                c.a.C(l - 4);
                                n2 = n - 7;
                            }
                            final bas a4 = c.a;
                            final int b3 = a4.b;
                            final int c3 = a4.c;
                            if (b3 < c3 && n2 > 0) {
                                final int min = Math.min(n2, c3 - b3);
                                a2.B(c.a.a, b3, min);
                                c.a.G(b3 + min);
                                break;
                            }
                            break;
                        }
                        case 20: {
                            if (m % 5 != 2) {
                                break;
                            }
                            a2.H(2);
                            Arrays.fill(c.b, 0);
                            for (int n3 = m / 5, n4 = 0; n4 < n3; ++n4) {
                                final int i2 = a2.i();
                                final int i3 = a2.i();
                                final int i4 = a2.i();
                                final int i5 = a2.i();
                                final int i6 = a2.i();
                                final double n5 = i3;
                                final int[] b4 = c.b;
                                final double n6 = i4 - 128;
                                Double.isNaN(n6);
                                Double.isNaN(n5);
                                final int e = bax.e((int)(n5 + 1.402 * n6), 0, 255);
                                final double n7 = i5 - 128;
                                Double.isNaN(n7);
                                Double.isNaN(n5);
                                Double.isNaN(n6);
                                final int e2 = bax.e((int)(n5 - 0.34414 * n7 - n6 * 0.71414), 0, 255);
                                Double.isNaN(n7);
                                Double.isNaN(n5);
                                b4[i2] = (e << 16 | i6 << 24 | e2 << 8 | bax.e((int)(n5 + n7 * 1.772), 0, 255));
                            }
                            c.c = true;
                            break;
                        }
                    }
                    a3 = null;
                }
                else {
                    final int n8 = i;
                    Label_1071: {
                        if (c.d != 0 && c.e != 0 && c.h != 0 && c.i != 0) {
                            final bas a5 = c.a;
                            i = a5.c;
                            if (i != 0 && a5.b == i) {
                                if (c.c) {
                                    a5.G(0);
                                    final int n9 = c.h * c.i;
                                    final int[] array2 = new int[n9];
                                    i = 0;
                                    while (i < n9) {
                                        final int i7 = c.a.i();
                                        if (i7 != 0) {
                                            final int n10 = i + 1;
                                            array2[i] = c.b[i7];
                                            i = n10;
                                        }
                                        else {
                                            final int i8 = c.a.i();
                                            if (i8 == 0) {
                                                continue;
                                            }
                                            int n11;
                                            if ((i8 & 0x40) == 0x0) {
                                                n11 = (i8 & 0x3F);
                                            }
                                            else {
                                                n11 = ((i8 & 0x3F) << 8 | c.a.i());
                                            }
                                            int n12;
                                            if ((i8 & 0x80) == 0x0) {
                                                n12 = 0;
                                            }
                                            else {
                                                n12 = c.b[c.a.i()];
                                            }
                                            final int n13 = n11 + i;
                                            Arrays.fill(array2, i, n13, n12);
                                            i = n13;
                                        }
                                    }
                                    final Bitmap bitmap = Bitmap.createBitmap(array2, c.h, c.i, Bitmap$Config.ARGB_8888);
                                    final azx azx = new azx();
                                    azx.b = bitmap;
                                    azx.f = c.f / (float)c.d;
                                    azx.g = 0;
                                    azx.b(c.g / (float)c.e, 0);
                                    azx.e = 0;
                                    azx.h = c.h / (float)c.d;
                                    azx.i = c.i / (float)c.e;
                                    a3 = azx.a();
                                    break Label_1071;
                                }
                            }
                        }
                        a3 = null;
                    }
                    c.a();
                    i = n8;
                }
                a2.G(i);
            }
            if (a3 != null) {
                list.add(a3);
            }
        }
        return (bxi)new byc((List)Collections.unmodifiableList((List<?>)list), 2);
    }
}

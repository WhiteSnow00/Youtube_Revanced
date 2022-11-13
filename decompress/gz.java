import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gz
{
    private final List a;
    private final int[] b;
    private final int[] c;
    private final gy d;
    private final int e;
    private final int f;
    private final boolean g;
    
    public gz(final gy d, final List a, final int[] b, final int[] c, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        Arrays.fill(b, 0);
        Arrays.fill(c, 0);
        this.d = d;
        final int b2 = d.b();
        this.e = b2;
        final int a2 = d.a();
        this.f = a2;
        this.g = g;
        aetm aetm;
        if (a.isEmpty()) {
            aetm = null;
        }
        else {
            aetm = a.get(0);
        }
        if (aetm == null || aetm.b != 0 || aetm.c != 0) {
            a.add(0, new aetm(0, 0, 0, (byte[])null, (byte[])null));
        }
        a.add(new aetm(b2, a2, 0, (byte[])null, (byte[])null));
        for (final aetm aetm2 : a) {
            for (int i = 0; i < aetm2.a; ++i) {
                final int n = aetm2.b + i;
                final int n2 = aetm2.c + i;
                int n3;
                if (!this.d.c(n, n2)) {
                    n3 = 2;
                }
                else {
                    n3 = 1;
                }
                this.b[n] = (n2 << 4 | n3);
                this.c[n2] = (n << 4 | n3);
            }
        }
        if (this.g) {
            final Iterator iterator2 = this.a.iterator();
            int a3 = 0;
            while (iterator2.hasNext()) {
                final aetm aetm3 = (aetm)iterator2.next();
            Label_0471:
                for (int j = a3; j < aetm3.b; ++j) {
                    if (this.b[j] == 0) {
                        final int size = this.a.size();
                        int k = 0;
                        int l = 0;
                        while (k < size) {
                            aetm aetm4;
                            for (aetm4 = this.a.get(k); l < aetm4.c; ++l) {
                                if (this.c[l] == 0 && this.d.d(j, l)) {
                                    int n4;
                                    if (!this.d.c(j, l)) {
                                        n4 = 4;
                                    }
                                    else {
                                        n4 = 8;
                                    }
                                    this.b[j] = (l << 4 | n4);
                                    this.c[l] = (n4 | j << 4);
                                    continue Label_0471;
                                }
                            }
                            l = aetm4.b();
                            ++k;
                        }
                    }
                }
                a3 = aetm3.a();
            }
        }
    }
    
    private static bxn b(final Collection collection, final int n, final boolean b) {
        final Iterator iterator = collection.iterator();
        while (true) {
            while (iterator.hasNext()) {
                final bxn bxn = (bxn)iterator.next();
                if (bxn.a == n && bxn.b == b) {
                    iterator.remove();
                    while (iterator.hasNext()) {
                        final bxn bxn2 = (bxn)iterator.next();
                        if (b) {
                            --bxn2.c;
                        }
                        else {
                            ++bxn2.c;
                        }
                    }
                    return bxn;
                }
            }
            final bxn bxn = null;
            continue;
        }
    }
    
    public final void a(final hd hd) {
        gx gx;
        if (hd instanceof gx) {
            gx = (gx)hd;
        }
        else {
            gx = new gx(hd);
        }
        int e = this.e;
        final ArrayDeque arrayDeque = new ArrayDeque();
        int n = this.e;
        int n2 = this.f;
        int size = this.a.size();
        while (true) {
            final int n3 = size - 1;
            if (n3 < 0) {
                break;
            }
            final aetm aetm = this.a.get(n3);
            final int a = aetm.a();
            final int b = aetm.b();
            int n4 = n;
            int n5 = e;
            int n6;
            int i;
            while (true) {
                n6 = 0;
                e = n5;
                i = n2;
                if (n4 <= a) {
                    break;
                }
                final int n7 = n4 - 1;
                final int n8 = this.b[n7];
                if ((n8 & 0xC) != 0x0) {
                    final int n9 = n8 >> 4;
                    final bxn b2 = b(arrayDeque, n9, false);
                    if (b2 != null) {
                        final int n10 = n5 - b2.c - 1;
                        gx.b(n7, n10);
                        n4 = n7;
                        if ((n8 & 0x4) == 0x0) {
                            continue;
                        }
                        this.d.e(n7, n9);
                        gx.d(n10, 1);
                        n4 = n7;
                    }
                    else {
                        arrayDeque.add(new bxn(n7, n5 - n7 - 1, true));
                        n4 = n7;
                    }
                }
                else {
                    gx.c(n7, 1);
                    --n5;
                    n4 = n7;
                }
            }
            while (i > b) {
                final int n11 = i - 1;
                final int n12 = this.c[n11];
                if ((n12 & 0xC) != 0x0) {
                    final int n13 = n12 >> 4;
                    final bxn b3 = b(arrayDeque, n13, true);
                    if (b3 == null) {
                        arrayDeque.add(new bxn(n11, e - n4, false));
                        i = n11;
                    }
                    else {
                        gx.b(e - b3.c - 1, n4);
                        i = n11;
                        if ((n12 & 0x4) == 0x0) {
                            continue;
                        }
                        this.d.e(n13, n11);
                        gx.d(n4, 1);
                        i = n11;
                    }
                }
                else {
                    gx.a(n4, 1);
                    ++e;
                    i = n11;
                }
            }
            int b4 = aetm.b;
            int c = aetm.c;
            for (int j = n6; j < aetm.a; ++j) {
                if ((this.b[b4] & 0xF) == 0x2) {
                    this.d.e(b4, c);
                    gx.d(b4, 1);
                }
                ++b4;
                ++c;
            }
            n = aetm.b;
            n2 = aetm.c;
            size = n3;
        }
        gx.e();
    }
}

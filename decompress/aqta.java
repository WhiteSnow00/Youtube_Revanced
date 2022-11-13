// 
// Decompiled by Procyon v0.6.0
// 

final class aqta
{
    public int[] a;
    public int b;
    
    public aqta() {
        this.a = aqtn.a;
        this.b = 0;
    }
    
    public aqta(final int[] a) {
        this.a = a;
        this.b = a.length;
    }
    
    private static int k(final int[] array, final int n, int n2, final int n3) {
        n2 = array[n] - n2;
        if (n2 != 0) {
            return n2;
        }
        return n3 - array[n + 1];
    }
    
    private static void l(final int[] array, final int n, final int n2) {
        final int n3 = (n + n2) / 2 & 0xFFFFFFFE;
        final int n4 = array[n3];
        final int n5 = array[n3 + 1];
        int i;
        int n6;
        int n7;
        int n8;
        for (i = n, n6 = n2; i <= n6; i = n7 + 2, n6 = n8 - 2) {
            n7 = i;
            while (true) {
                n8 = n6;
                if (n7 >= n2) {
                    break;
                }
                n8 = n6;
                if (k(array, n7, n4, n5) >= 0) {
                    break;
                }
                n7 += 2;
            }
            while (n8 > n && k(array, n8, n4, n5) > 0) {
                n8 -= 2;
            }
            if ((i = n7) <= (n6 = n8)) {
                if (n7 != n8) {
                    final int n9 = array[n7];
                    array[n7] = array[n8];
                    array[n8] = n9;
                    final int n10 = n7 + 1;
                    final int n11 = array[n10];
                    final int n12 = n8 + 1;
                    array[n10] = array[n12];
                    array[n12] = n11;
                }
            }
        }
        if (n < n6) {
            l(array, n, n6);
        }
        if (i < n2) {
            l(array, i, n2);
        }
    }
    
    public final void a(final int n) {
        final int[] a = this.a;
        if (a.length < n) {
            final int b = this.b;
            final int n2 = b + b;
            int n3;
            if ((n3 = n) < n2) {
                n3 = n2;
            }
            final int[] a2 = new int[n3];
            System.arraycopy(a, 0, a2, 0, b);
            this.a = a2;
        }
    }
    
    final int[] b() {
        final int b = this.b;
        final int[] a = this.a;
        if (b == a.length) {
            return a;
        }
        final int[] array = new int[b];
        System.arraycopy(a, 0, array, 0, b);
        return array;
    }
    
    final void c(final int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            this.e(array[i], array[i + 1]);
        }
    }
    
    final void d(final aqtb aqtb, final boolean b) {
        int[] array2;
        final int[] array = array2 = aqtb.d;
        if (b) {
            final aqta aqta = new aqta();
            for (int i = 0; i < array.length; i += 2) {
                aqta.i(array[i], array[i + 1]);
            }
            aqta.g();
            array2 = aqta.b();
        }
        this.h(array2, aqtb.c);
    }
    
    final void e(final int n, final int n2) {
        if (this.b > 0) {
            for (int i = 2; i <= 4; i += 2) {
                final int b = this.b;
                if (b >= i) {
                    final int[] a = this.a;
                    final int n3 = b - i;
                    final int n4 = a[n3];
                    final int n5 = n3 + 1;
                    final int n6 = a[n5];
                    if (n <= n6 + 1 && n4 <= n2 + 1) {
                        if (n < n4) {
                            a[n3] = n;
                        }
                        if (n2 > n6) {
                            a[n5] = n2;
                        }
                        return;
                    }
                }
            }
        }
        this.a(this.b + 2);
        final int[] a2 = this.a;
        final int b2 = this.b;
        final int n7 = b2 + 1;
        a2[b2] = n;
        this.b = n7 + 1;
        a2[n7] = n2;
    }
    
    final void f(final int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            final int[] array2 = array[i];
            final int n = array2[0];
            final int n2 = array2[1];
            final int n3 = array2[2];
            int j = n;
            if (n3 == 1) {
                this.e(n, n2);
            }
            else {
                while (j <= n2) {
                    this.e(j, j);
                    j += n3;
                }
            }
        }
    }
    
    final void g() {
        final int b = this.b;
        if (b < 4) {
            return;
        }
        l(this.a, 0, b - 2);
        int i = 2;
        int b2 = 2;
        while (i < this.b) {
            final int[] a = this.a;
            final int n = a[i];
            final int n2 = a[i + 1];
            final int n3 = b2 - 1;
            final int n4 = a[n3];
            int n5;
            if (n <= n4 + 1) {
                n5 = b2;
                if (n2 > n4) {
                    a[n3] = n2;
                    n5 = b2;
                }
            }
            else {
                a[b2] = n;
                a[b2 + 1] = n2;
                n5 = b2 + 2;
            }
            i += 2;
            b2 = n5;
        }
        this.b = b2;
    }
    
    final void h(final int[] array, int i) {
        if (i < 0) {
            i = 0;
            int n = 0;
            while (i < array.length) {
                int n2 = array[i];
                final int n3 = array[i + 1];
                --n2;
                if (n <= n2) {
                    this.e(n, n2);
                }
                n = n3 + 1;
                i += 2;
            }
            if (n <= 1114111) {
                this.e(n, 1114111);
            }
            return;
        }
        this.c(array);
    }
    
    final void i(int n, int i) {
        if (n <= 65 && i >= 66639) {
            this.e(n, i);
            return;
        }
        if (i >= 65 && n <= 66639) {
            int n2;
            if ((n2 = n) < 65) {
                this.e(n, 64);
                n2 = 65;
            }
            int j = n2;
            if ((n = i) > 66639) {
                this.e(66640, i);
                n = 66639;
                j = n2;
            }
            while (j <= n) {
                this.e(j, j);
                for (i = aqsx.c(j); i != j; i = aqsx.c(i)) {
                    this.e(i, i);
                }
                ++j;
            }
            return;
        }
        this.e(n, i);
    }
    
    final void j(final int n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            this.i(n, n);
            return;
        }
        this.e(n, n);
    }
    
    @Override
    public final String toString() {
        final int[] a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < b; i += 2) {
            if (i > 0) {
                sb.append(' ');
            }
            final int n = a[i];
            final int n2 = a[i + 1];
            if (n == n2) {
                sb.append("0x");
                sb.append(Integer.toHexString(n));
            }
            else {
                sb.append("0x");
                sb.append(Integer.toHexString(n));
                sb.append("-0x");
                sb.append(Integer.toHexString(n2));
            }
        }
        sb.append(']');
        return sb.toString();
    }
}

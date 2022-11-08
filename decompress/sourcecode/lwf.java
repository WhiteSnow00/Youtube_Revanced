// 
// Decompiled by Procyon v0.6.0
// 

public final class lwf
{
    public int a;
    public int b;
    public int c;
    public Object d;
    
    public lwf() {
    }
    
    public lwf(final byte[] array) {
        this(array, array.length);
    }
    
    public lwf(final byte[] d, final int c) {
        this.d = d;
        this.c = c;
    }
    
    public lwf(final char[] array) {
        this.d = "";
    }
    
    private final void g() {
        final int a = this.a;
        boolean b2;
        final boolean b = b2 = false;
        Label_0064: {
            if (a >= 0) {
                final int b3 = this.b;
                b2 = b;
                if (b3 >= 0) {
                    b2 = b;
                    if (b3 < 8) {
                        final int c = this.c;
                        if (a >= c) {
                            b2 = b;
                            if (a != c) {
                                break Label_0064;
                            }
                            b2 = b;
                            if (b3 != 0) {
                                break Label_0064;
                            }
                        }
                        b2 = true;
                    }
                }
            }
        }
        jfi.U(b2);
    }
    
    public final int a(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = n;
        int n5;
        while (true) {
            n5 = n4;
            if (n2 >= n >> 3) {
                break;
            }
            final int b = this.b;
            int n6;
            if (b != 0) {
                final Object d = this.d;
                final int a = this.a;
                final byte[] array = (byte[])d;
                n6 = ((array[a + 1] & 0xFF) >>> 8 - b | (array[a] & 0xFF) << b);
            }
            else {
                n6 = ((byte[])this.d)[this.a];
            }
            n5 -= 8;
            n3 |= (0xFF & n6) << n5;
            ++this.a;
            ++n2;
            n4 = n5;
        }
        n = n3;
        if (n5 > 0) {
            final int n7 = this.b + n5;
            n = (byte)(255 >> 8 - n5);
            if (n7 > 8) {
                final Object d2 = this.d;
                final int a2 = this.a;
                final int a3 = a2 + 1;
                final byte[] array2 = (byte[])d2;
                n = ((n & ((0xFF & array2[a3]) >> 16 - n7 | (array2[a2] & 0xFF) << n7 - 8)) | n3);
                this.a = a3;
            }
            else {
                final Object d3 = this.d;
                final int a4 = this.a;
                final int n8 = n = ((n & (0xFF & ((byte[])d3)[a4]) >> 8 - n7) | n3);
                if (n7 == 8) {
                    this.a = a4 + 1;
                    n = n8;
                }
            }
            this.b = n7 % 8;
        }
        this.g();
        return n;
    }
    
    public final int b() {
        int a = 0;
        int n = 0;
        while (!this.f()) {
            ++n;
        }
        if (n > 0) {
            a = this.a(n);
        }
        return (1 << n) - 1 + a;
    }
    
    public final int c() {
        final int b = this.b();
        int n;
        if (b % 2 == 0) {
            n = -1;
        }
        else {
            n = 1;
        }
        return n * ((b + 1) / 2);
    }
    
    public final void d(final int n) {
        final int a = n >> 3;
        this.a = a;
        this.b = n - a * 8;
        this.g();
    }
    
    public final void e(int b) {
        final int a = this.a + b / 8;
        this.a = a;
        b = this.b + b % 8;
        this.b = b;
        if (b > 7) {
            this.a = a + 1;
            this.b = b - 8;
        }
        this.g();
    }
    
    public final boolean f() {
        return this.a(1) == 1;
    }
}

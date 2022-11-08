// 
// Decompiled by Procyon v0.6.0
// 

public final class atzg extends atyx
{
    public final transient byte[][] e;
    public final transient int[] f;
    
    public atzg(final byte[][] e, final int[] f) {
        e.getClass();
        f.getClass();
        super(atyx.a.b);
        this.e = e;
        this.f = f;
    }
    
    private final atyx i() {
        return new atyx(this.h());
    }
    
    private final Object writeReplace() {
        return this.i();
    }
    
    @Override
    public final byte a(final int n) {
        atzi.a(this.f[this.e.length - 1], n, 1L);
        final int c = atlx.c(this, n);
        int n2;
        if (c == 0) {
            n2 = 0;
        }
        else {
            n2 = this.f[c - 1];
        }
        final int[] f = this.f;
        final byte[][] e = this.e;
        return e[c][n - n2 + f[e.length + c]];
    }
    
    @Override
    public final int b() {
        return this.f[this.e.length - 1];
    }
    
    @Override
    public final String c() {
        return this.i().c();
    }
    
    @Override
    public final boolean e(int n, final byte[] array, int n2, int i) {
        array.getClass();
        boolean b2;
        final boolean b = b2 = false;
        if (n >= 0) {
            b2 = b;
            if (n <= this.b() - i) {
                b2 = b;
                if (n2 >= 0) {
                    if (n2 > array.length - i) {
                        b2 = b;
                    }
                    else {
                        final int n3 = i + n;
                        final int c = atlx.c(this, n);
                        int n4;
                        int[] f;
                        int n5;
                        int n6;
                        int n7;
                        for (i = n, n = c; i < n3; i += n7, ++n) {
                            if (n == 0) {
                                n = 0;
                                n4 = 0;
                            }
                            else {
                                n4 = this.f[n - 1];
                            }
                            f = this.f;
                            n5 = f[n];
                            n6 = f[this.e.length + n];
                            n7 = Math.min(n3, n5 - n4 + n4) - i;
                            if (!atzi.b(this.e[n], n6 + (i - n4), array, n2, n7)) {
                                b2 = b;
                                return b2;
                            }
                            n2 += n7;
                        }
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o != this) {
            if (o instanceof atyx) {
                final atyx atyx = (atyx)o;
                if (atyx.b() == this.b()) {
                    if (this.g(atyx, this.b())) {
                        return true;
                    }
                }
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final byte[] f() {
        return this.h();
    }
    
    @Override
    public final boolean g(final atyx atyx, final int n) {
        atyx.getClass();
        final int b = this.b();
        boolean b2 = false;
        if (b - n >= 0) {
            int c = atlx.c(this, 0);
            int i = 0;
            int n2 = 0;
            while (i < n) {
                int n3;
                if (c == 0) {
                    c = 0;
                    n3 = 0;
                }
                else {
                    n3 = this.f[c - 1];
                }
                final int[] f = this.f;
                final int n4 = f[c];
                final int n5 = f[this.e.length + c];
                final int n6 = Math.min(n, n4 - n3 + n3) - i;
                if (!atyx.e(n2, this.e[c], n5 + (i - n3), n6)) {
                    return b2;
                }
                n2 += n6;
                i += n6;
                ++c;
            }
            b2 = true;
        }
        return b2;
    }
    
    public final byte[] h() {
        final byte[] array = new byte[this.b()];
        final int length = this.e.length;
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final int[] f = this.f;
            final int n3 = f[length + i];
            final int n4 = f[i];
            final int n5 = n4 - n;
            aqqn.B(this.e[i], array, n2, n3, n3 + n5);
            n2 += n5;
            ++i;
            n = n4;
        }
        return array;
    }
    
    @Override
    public final int hashCode() {
        int c = super.c;
        if (c == 0) {
            final int length = this.e.length;
            int i = 0;
            c = 1;
            int n = 0;
            while (i < length) {
                final int[] f = this.f;
                final int n2 = f[length + i];
                final int n3 = f[i];
                final byte[] array = this.e[i];
                for (int j = n2; j < n3 - n + n2; ++j) {
                    c = c * 31 + array[j];
                }
                ++i;
                n = n3;
            }
            super.c = c;
        }
        return c;
    }
    
    @Override
    public final String toString() {
        return this.i().toString();
    }
}

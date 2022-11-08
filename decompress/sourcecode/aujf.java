import java.util.Arrays;
import java.io.IOException;
import java.io.DataInput;

// 
// Decompiled by Procyon v0.6.0
// 

final class aujf extends aufc
{
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final aujd i;
    
    private aujf(final String s, final long[] e, final int[] f, final int[] g, final String[] h, final aujd i) {
        super(s);
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    static aujf o(final DataInput dataInput, final String s) {
        final int unsignedShort = dataInput.readUnsignedShort();
        final String[] array = new String[unsignedShort];
        final int n = 0;
        for (int i = 0; i < unsignedShort; ++i) {
            array[i] = dataInput.readUTF();
        }
        final int int1 = dataInput.readInt();
        final long[] array2 = new long[int1];
        final int[] array3 = new int[int1];
        final int[] array4 = new int[int1];
        final String[] array5 = new String[int1];
        int j = n;
        int n2;
        Label_0139_Outer:Label_0131_Outer:
        while (j < int1) {
            array2[j] = aujh.a(dataInput);
            array3[j] = (int)aujh.a(dataInput);
            array4[j] = (int)aujh.a(dataInput);
            while (true) {
                if (unsignedShort < 256) {
                    try {
                        n2 = dataInput.readUnsignedByte();
                        while (true) {
                            array5[j] = array[n2];
                            ++j;
                            continue Label_0139_Outer;
                            n2 = dataInput.readUnsignedShort();
                            continue Label_0131_Outer;
                        }
                    }
                    catch (final ArrayIndexOutOfBoundsException ex) {
                        throw new IOException("Invalid encoding");
                    }
                    break;
                }
                continue;
            }
        }
        aujd aujd;
        if (dataInput.readBoolean()) {
            aujd = new aujd(s, (int)aujh.a(dataInput), aujg.c(dataInput), aujg.c(dataInput));
        }
        else {
            aujd = null;
        }
        return new aujf(s, array2, array3, array4, array5, aujd);
    }
    
    public final int a(final long n) {
        final long[] e = this.e;
        final int binarySearch = Arrays.binarySearch(e, n);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        final int n2 = ~binarySearch;
        if (n2 < e.length) {
            if (n2 > 0) {
                return this.f[n2 - 1];
            }
            return 0;
        }
        else {
            final aujd i = this.i;
            if (i == null) {
                return this.f[n2 - 1];
            }
            return i.a(n);
        }
    }
    
    public final int c(final long n) {
        final long[] e = this.e;
        final int binarySearch = Arrays.binarySearch(e, n);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        final int n2 = ~binarySearch;
        if (n2 < e.length) {
            if (n2 > 0) {
                return this.g[n2 - 1];
            }
            return 0;
        }
        else {
            final aujd i = this.i;
            if (i == null) {
                return this.g[n2 - 1];
            }
            return i.e;
        }
    }
    
    public final long e(final long n) {
        final long[] e = this.e;
        int binarySearch = Arrays.binarySearch(e, n);
        if (binarySearch >= 0) {
            ++binarySearch;
        }
        else {
            binarySearch ^= -1;
        }
        final int length = e.length;
        if (binarySearch < length) {
            return e[binarySearch];
        }
        final aujd i = this.i;
        if (i == null) {
            return n;
        }
        final long n2 = e[length - 1];
        long n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return i.e(n3);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof aujf) {
            final aujf aujf = (aujf)o;
            if (super.c.equals(aujf.c) && Arrays.equals(this.e, aujf.e) && Arrays.equals(this.h, aujf.h) && Arrays.equals(this.f, aujf.f) && Arrays.equals(this.g, aujf.g)) {
                final aujd i = this.i;
                final aujd j = aujf.i;
                if (i == null) {
                    if (j != null) {
                        return false;
                    }
                }
                else if (!i.equals(j)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final long f(final long n) {
        final long[] e = this.e;
        final int binarySearch = Arrays.binarySearch(e, n);
        if (binarySearch >= 0) {
            if (n > Long.MIN_VALUE) {
                return n - 1L;
            }
            return Long.MIN_VALUE;
        }
        else {
            final int n2 = ~binarySearch;
            if (n2 < e.length) {
                if (n2 > 0) {
                    final long n3 = e[n2 - 1];
                    if (n3 > Long.MIN_VALUE) {
                        return n3 - 1L;
                    }
                }
                return n;
            }
            final aujd i = this.i;
            if (i != null) {
                final long f = i.f(n);
                if (f < n) {
                    return f;
                }
            }
            final long n4 = e[n2 - 1];
            if (n4 > Long.MIN_VALUE) {
                return n4 - 1L;
            }
            return n;
        }
    }
    
    public final String g(final long n) {
        final long[] e = this.e;
        final int binarySearch = Arrays.binarySearch(e, n);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        final int n2 = ~binarySearch;
        if (n2 < e.length) {
            if (n2 > 0) {
                return this.h[n2 - 1];
            }
            return "UTC";
        }
        else {
            final aujd i = this.i;
            if (i == null) {
                return this.h[n2 - 1];
            }
            return i.g(n);
        }
    }
    
    public final boolean l() {
        return false;
    }
}

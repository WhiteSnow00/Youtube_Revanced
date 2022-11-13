import java.util.Arrays;
import java.io.IOException;
import java.io.DataInput;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aujw extends auft
{
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final auju i;
    
    private aujw(final String s, final long[] e, final int[] f, final int[] g, final String[] h, final auju i) {
        super(s);
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static aujw o(final DataInput dataInput, final String s) {
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
        Label_0133_Outer:Label_0126_Outer:
        while (j < int1) {
            array2[j] = aucl.e(dataInput);
            array3[j] = (int)aucl.e(dataInput);
            array4[j] = (int)aucl.e(dataInput);
            while (true) {
                if (unsignedShort < 256) {
                    try {
                        n2 = dataInput.readUnsignedByte();
                        while (true) {
                            array5[j] = array[n2];
                            ++j;
                            continue Label_0133_Outer;
                            n2 = dataInput.readUnsignedShort();
                            continue Label_0126_Outer;
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
        auju auju;
        if (dataInput.readBoolean()) {
            auju = new auju(s, (int)aucl.e(dataInput), aujx.c(dataInput), aujx.c(dataInput));
        }
        else {
            auju = null;
        }
        return new aujw(s, array2, array3, array4, array5, auju);
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
            final auju i = this.i;
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
            final auju i = this.i;
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
        final auju i = this.i;
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
        if (o instanceof aujw) {
            final aujw aujw = (aujw)o;
            if (super.c.equals(aujw.c) && Arrays.equals(this.e, aujw.e) && Arrays.equals(this.h, aujw.h) && Arrays.equals(this.f, aujw.f) && Arrays.equals(this.g, aujw.g)) {
                final auju i = this.i;
                final auju j = aujw.i;
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
            final auju i = this.i;
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
            final auju i = this.i;
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

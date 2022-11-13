import java.util.Arrays;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcp
{
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    final dcq f;
    public rsi g;
    
    public dcp(final dcq f, final String a) {
        this.f = f;
        this.a = a;
        final int d = f.d;
        this.b = new long[d];
        this.c = new File[d];
        this.d = new File[d];
        final StringBuilder sb = new StringBuilder(a);
        sb.append('.');
        final int length = sb.length();
        for (int i = 0; i < f.d; i = 1) {
            sb.append(0);
            this.c[0] = new File(f.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(f.a, sb.toString());
            sb.setLength(length);
        }
    }
    
    static /* bridge */ void b(final dcp dcp) {
        dcp.e = true;
    }
    
    public static final IOException e(final String[] array) {
        throw new IOException("unexpected journal line: ".concat(String.valueOf(Arrays.toString(array))));
    }
    
    public final String a() {
        final StringBuilder sb = new StringBuilder();
        final long[] b = this.b;
        for (int length = b.length, i = 0; i < length; i = 1) {
            final long n = b[0];
            sb.append(' ');
            sb.append(n);
        }
        return sb.toString();
    }
    
    public final File c() {
        return this.c[0];
    }
    
    public final File d() {
        return this.d[0];
    }
}

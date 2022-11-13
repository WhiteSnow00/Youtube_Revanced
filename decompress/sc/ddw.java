import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddw extends OutputStream
{
    private final OutputStream a;
    private byte[] b;
    private final dge c;
    private int d;
    
    public ddw(final OutputStream a, final dge c) {
        this.a = a;
        this.c = c;
        this.b = (byte[])c.a(65536, byte[].class);
    }
    
    private final void a() {
        final int d = this.d;
        if (d > 0) {
            this.a.write(this.b, 0, d);
            this.d = 0;
        }
    }
    
    private final void b() {
        if (this.d == this.b.length) {
            this.a();
        }
    }
    
    @Override
    public final void close() {
        try {
            this.flush();
            this.a.close();
            final byte[] b = this.b;
            if (b != null) {
                this.c.c(b);
                this.b = null;
            }
        }
        finally {
            this.a.close();
        }
    }
    
    @Override
    public final void flush() {
        this.a();
        this.a.flush();
    }
    
    @Override
    public final void write(final int n) {
        this.b[this.d++] = (byte)n;
        this.b();
    }
    
    @Override
    public final void write(final byte[] array) {
        this.write(array, 0, array.length);
    }
    
    @Override
    public final void write(final byte[] array, final int n, final int n2) {
        int n3 = 0;
        int n4;
        do {
            final int n5 = n2 - n3;
            final int n6 = n + n3;
            int d;
            if ((d = this.d) == 0) {
                if (n5 >= this.b.length) {
                    this.a.write(array, n6, n5);
                    return;
                }
                d = 0;
            }
            final int min = Math.min(n5, this.b.length - d);
            System.arraycopy(array, n6, this.b, this.d, min);
            this.d += min;
            n4 = n3 + min;
            this.b();
        } while ((n3 = n4) < n2);
    }
}

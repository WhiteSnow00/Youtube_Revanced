import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqul implements aqty
{
    private final byte[] a;
    private int b;
    private int c;
    
    public aqul(final String s) {
        try {
            this.a = s.getBytes("UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public final long a() {
        synchronized (this) {
            return this.a.length;
        }
    }
    
    @Override
    public final int b(final byte[] array, final int n, int i) {
        monitorenter(this);
        try {
            final int length = array.length;
            final int n2 = 0;
            agot.v(length - n >= i, (Object)"Buffer length too small.");
            if (i == 0) {
                monitorexit(this);
                return 0;
            }
            final int b = this.b;
            final int length2 = this.a.length;
            if (b == length2) {
                monitorexit(this);
                return 0;
            }
            int min;
            byte[] a;
            int b2;
            for (min = Math.min(i, length2 - b), i = n2; i < min; ++i) {
                a = this.a;
                b2 = this.b;
                array[n + i] = a[b2];
                this.b = b2 + 1;
            }
            monitorexit(this);
            return min;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final long c() {
        synchronized (this) {
            return this.c;
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final long d() {
        monitorenter(this);
        monitorexit(this);
        return Long.MAX_VALUE;
    }
    
    @Override
    public final long e() {
        synchronized (this) {
            return this.b;
        }
    }
    
    @Override
    public final long f(long min) {
        synchronized (this) {
            min = Math.min(min, this.a.length - this.b);
            this.b += (int)min;
            return min;
        }
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            this.c = this.b;
        }
    }
    
    @Override
    public final void h() {
        synchronized (this) {
            this.b = this.c;
        }
    }
    
    @Override
    public final boolean i() {
        synchronized (this) {
            final int b = this.b;
            final int length = this.a.length;
            monitorexit(this);
            return b < length;
        }
    }
}

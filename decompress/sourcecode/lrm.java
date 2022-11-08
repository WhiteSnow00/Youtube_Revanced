import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrm
{
    public final lqr a;
    public ByteBuffer b;
    public int c;
    public int d;
    public long e;
    
    public lrm() {
        this.a = new lqr();
    }
    
    public final ByteBuffer a(final int n) {
        final ByteBuffer b = this.b;
        int capacity;
        if (b == null) {
            capacity = 0;
        }
        else {
            capacity = b.capacity();
        }
        final StringBuilder sb = new StringBuilder("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(n);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void b() {
        final ByteBuffer b = this.b;
        if (b != null) {
            b.clear();
        }
    }
    
    public final boolean c() {
        return (this.d & 0x2) != 0x0;
    }
    
    public final boolean d() {
        return (this.d & 0x1) != 0x0;
    }
}

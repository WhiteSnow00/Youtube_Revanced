import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqc
{
    final dqd a;
    public final long b;
    public final long c;
    public final double d;
    
    public dqc(final dqd a, final long b, final long c, final double d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
    }
    
    public dqc(final dqd a, final ByteBuffer byteBuffer) {
        if (a.s() == 1) {
            this.b = clm.x(byteBuffer);
            this.c = byteBuffer.getLong();
            this.d = clm.q(byteBuffer);
        }
        else {
            this.b = clm.w(byteBuffer);
            this.c = byteBuffer.getInt();
            this.d = clm.q(byteBuffer);
        }
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final dqc dqc = (dqc)o;
            return this.c == dqc.c && this.b == dqc.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long b = this.b;
        final long c = this.c;
        return (int)(b ^ b >>> 32) * 31 + (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        final long b = this.b;
        final long c = this.c;
        final double d = this.d;
        final StringBuilder sb = new StringBuilder(111);
        sb.append("Entry{segmentDuration=");
        sb.append(b);
        sb.append(", mediaTime=");
        sb.append(c);
        sb.append(", mediaRate=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}

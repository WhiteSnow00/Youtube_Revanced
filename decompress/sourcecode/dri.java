import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dri extends ardd
{
    byte[] a;
    
    public dri(final byte[] array) {
        super(array);
    }
    
    @Override
    protected final long h() {
        return this.a.length;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        byteBuffer.get(this.a = new byte[byteBuffer.remaining()]);
    }
    
    @Override
    protected final void j(final ByteBuffer byteBuffer) {
        byteBuffer.put(this.a);
    }
    
    @Override
    public final String toString() {
        final String h = super.h;
        final String s = new String(super.i);
        final int length = this.a.length;
        final StringBuilder sb = new StringBuilder(h.length() + 50 + s.length());
        sb.append("UserBox[type=");
        sb.append(h);
        sb.append(";userType=");
        sb.append(s);
        sb.append(";contentLength=");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}

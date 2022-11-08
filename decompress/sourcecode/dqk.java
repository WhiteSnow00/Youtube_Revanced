import java.nio.ByteBuffer;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqk extends ardf
{
    public Date a;
    public Date b;
    public long c;
    public long d;
    public String e;
    
    public dqk() {
        super("mdhd");
        this.a = new Date();
        this.b = new Date();
        this.e = "eng";
    }
    
    protected final long h() {
        long n;
        if (this.s() == 1) {
            n = 32L;
        }
        else {
            n = 20L;
        }
        return n + 4L;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if (this.s() == 1) {
            this.a = aqqm.p(clm.x(byteBuffer));
            this.b = aqqm.p(clm.x(byteBuffer));
            this.c = clm.w(byteBuffer);
            this.d = clm.x(byteBuffer);
        }
        else {
            this.a = aqqm.p(clm.w(byteBuffer));
            this.b = aqqm.p(clm.w(byteBuffer));
            this.c = clm.w(byteBuffer);
            this.d = clm.w(byteBuffer);
        }
        final int t = clm.t(byteBuffer);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; ++i) {
            sb.append((char)((t >> (2 - i) * 5 & 0x1F) + 96));
        }
        this.e = sb.toString();
        clm.t(byteBuffer);
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if (this.s() == 1) {
            byteBuffer.putLong(aqqm.o(this.a));
            byteBuffer.putLong(aqqm.o(this.b));
            clm.m(byteBuffer, this.c);
            byteBuffer.putLong(this.d);
        }
        else {
            clm.m(byteBuffer, aqqm.o(this.a));
            clm.m(byteBuffer, aqqm.o(this.b));
            clm.m(byteBuffer, this.c);
            clm.m(byteBuffer, this.d);
        }
        final String e = this.e;
        if (e.getBytes().length == 3) {
            int i = 0;
            int n = 0;
            while (i < 3) {
                n += e.getBytes()[i] - 96 << (2 - i) * 5;
                ++i;
            }
            clm.k(byteBuffer, n);
            clm.k(byteBuffer, 0);
            return;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 51);
        sb.append("\"");
        sb.append(e);
        sb.append("\" language string isn't exactly 3 characters long!");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MediaHeaderBox[creationTime=");
        sb.append(this.a);
        sb.append(";modificationTime=");
        sb.append(this.b);
        sb.append(";timescale=");
        sb.append(this.c);
        sb.append(";duration=");
        sb.append(this.d);
        sb.append(";language=");
        sb.append(this.e);
        sb.append("]");
        return sb.toString();
    }
}

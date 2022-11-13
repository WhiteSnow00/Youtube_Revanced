import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arij extends arfu
{
    public short a;
    public short[] b;
    public int c;
    public String d;
    private String e;
    
    public arij() {
        super("saiz");
        this.b = new short[0];
    }
    
    protected final long h() {
        final int r = this.r();
        int length;
        if (this.a == 0) {
            length = this.b.length;
        }
        else {
            length = 0;
        }
        int n;
        if (0x1 != (r & 0x1)) {
            n = 4;
        }
        else {
            n = 12;
        }
        return n + 5 + length;
    }
    
    public final void i(final ByteBuffer byteBuffer) {
        this.u(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            this.d = cln.y(byteBuffer);
            this.e = cln.y(byteBuffer);
        }
        this.a = (short)cln.v(byteBuffer);
        final int q = aqsy.q(cln.w(byteBuffer));
        this.c = q;
        if (this.a == 0) {
            this.b = new short[q];
            for (int i = 0; i < this.c; ++i) {
                this.b[i] = (short)cln.v(byteBuffer);
            }
        }
    }
    
    protected final void j(final ByteBuffer byteBuffer) {
        this.t(byteBuffer);
        if ((this.r() & 0x1) == 0x1) {
            byteBuffer.put(dpt.b(this.d));
            byteBuffer.put(dpt.b(this.e));
        }
        cln.n(byteBuffer, (int)this.a);
        if (this.a == 0) {
            cln.m(byteBuffer, (long)this.b.length);
            final short[] b = this.b;
            for (int length = b.length, i = 0; i < length; ++i) {
                cln.n(byteBuffer, (int)b[i]);
            }
            return;
        }
        cln.m(byteBuffer, (long)this.c);
    }
    
    public final String toString() {
        final short a = this.a;
        final int c = this.c;
        final String d = this.d;
        final String e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 130 + String.valueOf(e).length());
        sb.append("SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        sb.append(a);
        sb.append(", sampleCount=");
        sb.append(c);
        sb.append(", auxInfoType='");
        sb.append(d);
        sb.append("', auxInfoTypeParameter='");
        sb.append(e);
        sb.append("'}");
        return sb.toString();
    }
}

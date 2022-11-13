import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dry extends drw
{
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public byte[] l;
    private int x;
    private long y;
    
    public dry(final String s) {
        super(s);
    }
    
    public final long b() {
        final int e = this.e;
        int n = 0;
        final int n2 = 16;
        int n3;
        if (e == 1) {
            n3 = 16;
        }
        else {
            n3 = 0;
        }
        if (e == 2) {
            n = 36;
        }
        final long n4 = n3 + 28 + n + ((arfw)this).u();
        int n5 = n2;
        if (!this.o) {
            if (8L + n4 >= 4294967296L) {
                n5 = n2;
            }
            else {
                n5 = 8;
            }
        }
        return n4 + n5;
    }
    
    public final void e(final WritableByteChannel writableByteChannel) {
        writableByteChannel.write(((arft)this).s());
        final int e = this.e;
        int n = 0;
        int n2;
        if (e == 1) {
            n2 = 16;
        }
        else {
            n2 = 0;
        }
        if (e == 2) {
            n = 36;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(n2 + 28 + n);
        allocate.position(6);
        cln.k(allocate, this.a);
        cln.k(allocate, this.e);
        cln.k(allocate, this.x);
        cln.m(allocate, this.y);
        cln.k(allocate, this.b);
        cln.k(allocate, this.c);
        cln.k(allocate, this.f);
        cln.k(allocate, this.g);
        if (this.n.equals("mlpa")) {
            cln.m(allocate, this.d);
        }
        else {
            cln.m(allocate, this.d << 16);
        }
        if (this.e == 1) {
            cln.m(allocate, this.h);
            cln.m(allocate, this.i);
            cln.m(allocate, this.j);
            cln.m(allocate, this.k);
        }
        if (this.e == 2) {
            cln.m(allocate, this.h);
            cln.m(allocate, this.i);
            cln.m(allocate, this.j);
            cln.m(allocate, this.k);
            allocate.put(this.l);
        }
        writableByteChannel.write((ByteBuffer)allocate.rewind());
        ((arfw)this).k(writableByteChannel);
    }
    
    public final void f(final arfx arfx, ByteBuffer byteBuffer, long n, final dpr dpr) {
        byteBuffer = ByteBuffer.allocate(28);
        arfx.a(byteBuffer);
        byteBuffer.position(6);
        this.a = cln.t(byteBuffer);
        this.e = cln.t(byteBuffer);
        this.x = cln.t(byteBuffer);
        this.y = cln.w(byteBuffer);
        this.b = cln.t(byteBuffer);
        this.c = cln.t(byteBuffer);
        this.f = cln.t(byteBuffer);
        this.g = cln.t(byteBuffer);
        this.d = cln.w(byteBuffer);
        final boolean equals = this.n.equals("mlpa");
        int n2 = 16;
        if (!equals) {
            this.d >>>= 16;
        }
        if (this.e == 1) {
            byteBuffer = ByteBuffer.allocate(16);
            arfx.a(byteBuffer);
            byteBuffer.rewind();
            this.h = cln.w(byteBuffer);
            this.i = cln.w(byteBuffer);
            this.j = cln.w(byteBuffer);
            this.k = cln.w(byteBuffer);
        }
        final int e = this.e;
        int n3 = 36;
        if (e == 2) {
            final ByteBuffer allocate = ByteBuffer.allocate(36);
            arfx.a(allocate);
            allocate.rewind();
            this.h = cln.w(allocate);
            this.i = cln.w(allocate);
            this.j = cln.w(allocate);
            this.k = cln.w(allocate);
            allocate.get(this.l = new byte[20]);
        }
        if ("owma".equals(this.n)) {
            System.err.println("owma");
            final int e2 = this.e;
            if (e2 != 1) {
                n2 = 0;
            }
            if (e2 != 2) {
                n3 = 0;
            }
            n = n - 28L - n2 - n3;
            byteBuffer = ByteBuffer.allocate(aqsy.q(n));
            arfx.a(byteBuffer);
            ((arfw)this).w((dpv)new drx(this, n, byteBuffer));
            return;
        }
        final int e3 = this.e;
        if (e3 != 1) {
            n2 = 0;
        }
        if (e3 != 2) {
            n3 = 0;
        }
        ((arfw)this).t(arfx, n - 28L - n2 - n3, dpr);
    }
    
    public final String toString() {
        final long k = this.k;
        final long j = this.j;
        final long i = this.i;
        final long h = this.h;
        final int g = this.g;
        final int f = this.f;
        final int e = this.e;
        final long d = this.d;
        final int c = this.c;
        final int b = this.b;
        final String value = String.valueOf(((arfw)this).i());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 333);
        sb.append("AudioSampleEntry{bytesPerSample=");
        sb.append(k);
        sb.append(", bytesPerFrame=");
        sb.append(j);
        sb.append(", bytesPerPacket=");
        sb.append(i);
        sb.append(", samplesPerPacket=");
        sb.append(h);
        sb.append(", packetSize=");
        sb.append(g);
        sb.append(", compressionId=");
        sb.append(f);
        sb.append(", soundVersion=");
        sb.append(e);
        sb.append(", sampleRate=");
        sb.append(d);
        sb.append(", sampleSize=");
        sb.append(c);
        sb.append(", channelCount=");
        sb.append(b);
        sb.append(", boxes=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}

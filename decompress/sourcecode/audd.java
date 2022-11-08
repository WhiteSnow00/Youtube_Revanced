import org.chromium.net.UploadDataSink;
import java.util.Locale;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class audd implements audl
{
    final /* synthetic */ boolean a;
    final /* synthetic */ aude b;
    private final /* synthetic */ int c;
    
    public audd(final aude b, final boolean a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.c != 0) {
            final ByteBuffer byteBuffer = (ByteBuffer)this.b.c.flip();
            final aude b = this.b;
            final long d = b.d;
            if (d != -1L && d - b.e < b.c.remaining()) {
                final aude b2 = this.b;
                final Locale default1 = Locale.getDefault();
                final aude b3 = this.b;
                b2.f((Throwable)new IllegalArgumentException(String.format(default1, "Read upload data length %d exceeds expected length %d", b3.e + b3.c.remaining(), this.b.d)));
                return;
            }
            final aude b4 = this.b;
            final long e = b4.e;
            final ByteBuffer c = b4.c;
            int n = 0;
            while (c.hasRemaining()) {
                n += b4.g.write(c);
            }
            b4.h.flush();
            b4.e = e + n;
            final aude b5 = this.b;
            final long e2 = b5.e;
            final long d2 = b5.d;
            Label_0318: {
                if (e2 >= d2) {
                    long n2 = d2;
                    if (d2 == -1L) {
                        if (!this.a) {
                            break Label_0318;
                        }
                        n2 = -1L;
                    }
                    if (n2 == -1L) {
                        b5.e();
                        return;
                    }
                    if (n2 == e2) {
                        b5.e();
                        return;
                    }
                    b5.f((Throwable)new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", this.b.e, this.b.d)));
                    return;
                }
            }
            final ByteBuffer byteBuffer2 = (ByteBuffer)b5.c.clear();
            this.b.a.set(0);
            this.b.a((audl)new audc(this, 1, null));
        }
        else {
            final aude b6 = this.b;
            b6.d = b6.b.getLength();
            final aude b7 = this.b;
            final long d3 = b7.d;
            if (d3 == 0L) {
                b7.e();
                return;
            }
            if (d3 > 0L && d3 < 8192L) {
                b7.c = ByteBuffer.allocateDirect((int)d3 + 1);
            }
            else {
                b7.c = ByteBuffer.allocateDirect(8192);
            }
            final aude b8 = this.b;
            final long d4 = b8.d;
            if (d4 > 0L) {
                b8.f.setFixedLengthStreamingMode(d4);
            }
            else {
                b8.f.setChunkedStreamingMode(8192);
            }
            if (this.a) {
                this.b.b();
                return;
            }
            this.b.a.set(1);
            final aude b9 = this.b;
            b9.b.rewind((UploadDataSink)b9);
        }
    }
}

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataSink;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UploadDataProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquv extends UploadDataProvider
{
    public aquu a;
    public final aqty b;
    public final long c;
    public int d;
    public int e;
    private final ExecutorService f;
    private final AtomicLong g;
    private final byte[] h;
    private final boolean i;
    private int j;
    private long k;
    
    public aquv(final ExecutorService f, final aqty b) {
        boolean i = false;
        this.d = 0;
        this.e = 0;
        this.j = 0;
        this.f = f;
        long c = 0L;
        this.g = new AtomicLong(0L);
        this.b = b;
        this.h = new byte[65536];
        this.k = SystemClock.elapsedRealtime();
        if (b.a() == -1L) {
            i = true;
        }
        this.i = i;
        if (!i) {
            c = b.a() - b.e();
        }
        this.c = c;
    }
    
    public final long getLength() {
        if (this.i) {
            return -1L;
        }
        final long a = this.b.a();
        final aqty b = this.b;
        return Math.min(a - b.e(), b.c() + b.d() - b.e());
    }
    
    public final void read(final UploadDataSink uploadDataSink, final ByteBuffer byteBuffer) {
        final int min = Math.min(65536, byteBuffer.capacity());
        final aqty b = this.b;
        final byte[] h = this.h;
        final boolean b2 = false;
        final int b3 = b.b(h, 0, min);
        Label_0143: {
            if (b3 > 0) {
                byteBuffer.put(this.h, 0, b3);
                if ((this.j += b3) >= this.d) {
                    if (this.e > 0) {
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - this.k < this.e) {
                            break Label_0143;
                        }
                        this.k = elapsedRealtime;
                    }
                    this.g.getAndAdd(this.j);
                    final aquu a = this.a;
                    if (a != null) {
                        this.f.execute(a);
                    }
                    this.j = 0;
                }
            }
        }
        boolean b4 = b2;
        if (this.i) {
            b4 = b2;
            if (!this.b.i()) {
                b4 = true;
            }
        }
        uploadDataSink.onReadSucceeded(b4);
    }
    
    public final void rewind(final UploadDataSink uploadDataSink) {
        this.b.h();
        uploadDataSink.onRewindSucceeded();
    }
}

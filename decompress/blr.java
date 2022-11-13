import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;
import android.media.MediaCodec$CodecException;
import android.media.MediaFormat;
import java.util.ArrayDeque;
import android.os.Handler;
import android.os.HandlerThread;
import android.media.MediaCodec$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blr extends MediaCodec$Callback
{
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final ArrayDeque d;
    public final ArrayDeque e;
    public MediaFormat f;
    public long g;
    public boolean h;
    public IllegalStateException i;
    public final iyw j;
    public final iyw k;
    private MediaFormat l;
    private MediaCodec$CodecException m;
    
    public blr(final HandlerThread b) {
        this.a = new Object();
        this.b = b;
        this.j = new iyw((byte[])null, (byte[])null);
        this.k = new iyw((byte[])null, (byte[])null);
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
    }
    
    private final void d(final MediaFormat mediaFormat) {
        this.k.d(-2);
        this.e.add(mediaFormat);
    }
    
    public final void a() {
        if (!this.e.isEmpty()) {
            this.l = this.e.getLast();
        }
        this.j.e();
        this.k.e();
        this.d.clear();
        this.e.clear();
        this.m = null;
    }
    
    public final void b() {
        final IllegalStateException i = this.i;
        if (i != null) {
            this.i = null;
            throw i;
        }
        final MediaCodec$CodecException m = this.m;
        if (m == null) {
            return;
        }
        this.m = null;
        throw m;
    }
    
    public final boolean c() {
        return this.g > 0L || this.h;
    }
    
    public final void onError(final MediaCodec mediaCodec, final MediaCodec$CodecException m) {
        synchronized (this.a) {
            this.m = m;
        }
    }
    
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int n) {
        synchronized (this.a) {
            this.j.d(n);
        }
    }
    
    public final void onOutputBufferAvailable(final MediaCodec mediaCodec, final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        synchronized (this.a) {
            final MediaFormat l = this.l;
            if (l != null) {
                this.d(l);
                this.l = null;
            }
            this.k.d(n);
            this.d.add(mediaCodec$BufferInfo);
        }
    }
    
    public final void onOutputFormatChanged(final MediaCodec mediaCodec, final MediaFormat mediaFormat) {
        synchronized (this.a) {
            this.d(mediaFormat);
            this.l = null;
        }
    }
}

import android.media.MediaCodec$CodecException;
import java.nio.ByteBuffer;
import java.io.IOException;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

final class acxm
{
    public boolean a;
    public MediaCodec b;
    public boolean c;
    public boolean d;
    public int e;
    
    public acxm() {
        this.e = 1;
    }
    
    public final void a(final byte[] array, final int n, final int n2, final boolean b, final agyb agyb) {
        agot.v(n2 <= 4096, (Object)"length must be less than or equal to CHUNK_SIZE_BYTES!");
        final MediaCodec$BufferInfo mediaCodec$BufferInfo = new MediaCodec$BufferInfo();
        int n3 = 0;
        int n4 = 0;
        do {
            boolean b2;
            if (n3 != 0) {
                if (!b) {
                    return;
                }
                b2 = true;
            }
            else {
                b2 = b;
            }
            Label_0168: {
                if (n3 == 0) {
                    if (b2 && this.c) {
                        throw new IllegalStateException("Already flushed!");
                    }
                    final int dequeueInputBuffer = this.b.dequeueInputBuffer(1000L);
                    if (dequeueInputBuffer != -1) {
                        if (b2) {
                            this.b.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            this.c = true;
                        }
                        else {
                            this.b.getInputBuffer(dequeueInputBuffer).put(array, n, n2);
                            this.b.queueInputBuffer(dequeueInputBuffer, 0, n2, 0L, 0);
                        }
                        n4 = 1;
                        break Label_0168;
                    }
                }
                n4 = n3;
            }
            final int dequeueOutputBuffer = this.b.dequeueOutputBuffer(mediaCodec$BufferInfo, 1000L);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer == -2) {
                    if (this.a) {
                        throw new IllegalStateException("The codec format was unexpectedly changed.");
                    }
                    this.a = true;
                }
                else {
                    final ByteBuffer outputBuffer = this.b.getOutputBuffer(dequeueOutputBuffer);
                    final byte[] array2 = new byte[mediaCodec$BufferInfo.size];
                    outputBuffer.get(array2);
                    this.b.releaseOutputBuffer(dequeueOutputBuffer, false);
                    try {
                        agyb.write(array2);
                    }
                    catch (final IOException ex) {
                        trn.b("Unable to write bytes into buffer!");
                    }
                }
            }
            n3 = n4;
        } while ((mediaCodec$BufferInfo.flags & 0x4) == 0x0);
        if (n4 != 0) {
            return;
        }
        throw new IllegalStateException("Didn't process input yet.");
    }
    
    public final void b() {
        final agyb t = agyc.t();
        try {
            this.a(null, 0, 0, true, t);
            this.b.stop();
        }
        catch (final MediaCodec$CodecException ex) {
            trn.b("Something went wrong in the underlying codec!");
        }
        this.b.release();
        t.b();
    }
}

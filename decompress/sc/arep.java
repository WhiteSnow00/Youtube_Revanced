import org.webrtc.VideoFrame$Buffer;
import android.graphics.Matrix;
import org.webrtc.VideoFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arep extends aumi
{
    private final areo b;
    
    public arep() {
        this.b = new areo();
    }
    
    public final void a() {
        this.b.c();
        super.a();
    }
    
    public final void b(final VideoFrame videoFrame, final aulr aulr, final Matrix matrix, final int n, final int n2) {
        Object buffer = videoFrame.getBuffer();
        final int rotation = videoFrame.getRotation();
        if (buffer instanceof aumc) {
            final areo b = this.b;
            buffer = buffer;
            b.b.a();
            adkp.I(rotation % 90 == 0, (Object)"Frame rotation must be a multiple of 90.");
            int n3;
            int n4;
            if (rotation % 180 == 0) {
                n3 = ((aumc)buffer).a;
                n4 = ((aumc)buffer).b;
            }
            else {
                n3 = ((aumc)buffer).b;
                n4 = ((aumc)buffer).a;
            }
            if (n > 0 && n2 > 0 && n + n < n3 && n2 + n2 < n4) {
                b.a.c = Math.max(n, n2);
                adkp.Q(b.c ^ true);
                b.c = true;
                final Matrix matrix2 = new Matrix();
                final int a = ((aumc)buffer).a;
                final int b2 = ((aumc)buffer).b;
                aumi.c((aulr)b, (aumg)buffer, matrix2, a, b2, 0, 0, a, b2);
                final auld a2 = b.a.a;
                final int c = a2.c;
                final int d = a2.d;
                buffer = new aumc(c, d, c, d, 2, a2.b, ((aumc)buffer).c, ((aumc)buffer).d, ((aumc)buffer).f, (aumb)new auma((Runnable)new arcu(b, 5), 0), (byte[])null);
            }
            else {
                ((aumc)buffer).retain();
            }
        }
        else {
            ((VideoFrame$Buffer)buffer).retain();
        }
        final VideoFrame videoFrame2 = new VideoFrame((VideoFrame$Buffer)buffer, videoFrame.getRotation(), videoFrame.getTimestampNs());
        super.b(videoFrame2, aulr, (Matrix)null, n, n2);
        videoFrame2.release();
    }
}

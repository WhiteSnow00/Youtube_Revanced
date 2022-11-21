import org.webrtc.VideoFrame$Buffer;
import android.graphics.Matrix;
import org.webrtc.VideoFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhk extends aupe
{
    private final arhj b;
    
    public arhk() {
        this.b = new arhj();
    }
    
    public final void a() {
        this.b.c();
        super.a();
    }
    
    public final void b(final VideoFrame videoFrame, final auom auom, final Matrix matrix, final int n, final int n2) {
        Object buffer = videoFrame.getBuffer();
        final int rotation = videoFrame.getRotation();
        if (buffer instanceof auoy) {
            final arhj b = this.b;
            buffer = buffer;
            b.b.a();
            adme.L(rotation % 90 == 0, "Frame rotation must be a multiple of 90.");
            int n3;
            int n4;
            if (rotation % 180 == 0) {
                n3 = ((auoy)buffer).a;
                n4 = ((auoy)buffer).b;
            }
            else {
                n3 = ((auoy)buffer).b;
                n4 = ((auoy)buffer).a;
            }
            if (n > 0 && n2 > 0 && n + n < n3 && n2 + n2 < n4) {
                b.a.c = Math.max(n, n2);
                adme.T(b.c ^ true);
                b.c = true;
                final Matrix matrix2 = new Matrix();
                final int a = ((auoy)buffer).a;
                final int b2 = ((auoy)buffer).b;
                aupe.c((auom)b, (aupc)buffer, matrix2, a, b2, 0, 0, a, b2);
                final auny a2 = b.a.a;
                final int c = a2.c;
                final int d = a2.d;
                buffer = new auoy(c, d, c, d, 2, a2.b, ((auoy)buffer).c, ((auoy)buffer).d, ((auoy)buffer).f, (auox)new auow((Runnable)new arfq(b, 5), 0), (byte[])null);
            }
            else {
                ((auoy)buffer).retain();
            }
        }
        else {
            ((VideoFrame$Buffer)buffer).retain();
        }
        final VideoFrame videoFrame2 = new VideoFrame((VideoFrame$Buffer)buffer, videoFrame.getRotation(), videoFrame.getTimestampNs());
        super.b(videoFrame2, auom, (Matrix)null, n, n2);
        videoFrame2.release();
    }
}

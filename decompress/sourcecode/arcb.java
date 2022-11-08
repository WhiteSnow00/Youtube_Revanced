import org.webrtc.VideoFrame$Buffer;
import android.graphics.Matrix;
import org.webrtc.VideoFrame;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcb extends ault
{
    private final arca b;
    
    public arcb() {
        this.b = new arca();
    }
    
    public final void a() {
        this.b.c();
        super.a();
    }
    
    public final void b(final VideoFrame videoFrame, final aulb aulb, final Matrix matrix, final int n, final int n2) {
        Object buffer = videoFrame.getBuffer();
        final int rotation = videoFrame.getRotation();
        if (buffer instanceof aulm) {
            final arca b = this.b;
            buffer = buffer;
            b.b.a();
            agot.v(rotation % 90 == 0, (Object)"Frame rotation must be a multiple of 90.");
            int n3;
            int n4;
            if (rotation % 180 == 0) {
                n3 = ((aulm)buffer).a;
                n4 = ((aulm)buffer).b;
            }
            else {
                n3 = ((aulm)buffer).b;
                n4 = ((aulm)buffer).a;
            }
            if (n > 0 && n2 > 0 && n + n < n3 && n2 + n2 < n4) {
                b.a.c = Math.max(n, n2);
                agot.D(b.c ^ true);
                b.c = true;
                final Matrix matrix2 = new Matrix();
                final int a = ((aulm)buffer).a;
                final int b2 = ((aulm)buffer).b;
                ault.c((aulb)b, (aulr)buffer, matrix2, a, b2, 0, 0, a, b2);
                final aukn a2 = b.a.a;
                final int c = a2.c;
                final int d = a2.d;
                buffer = new aulm(c, d, c, d, 2, a2.b, ((aulm)buffer).c, ((aulm)buffer).d, ((aulm)buffer).f, (aull)new aulk((Runnable)new arax(b, 4), 0), null);
            }
            else {
                ((aulm)buffer).retain();
            }
        }
        else {
            ((VideoFrame$Buffer)buffer).retain();
        }
        final VideoFrame videoFrame2 = new VideoFrame((VideoFrame$Buffer)buffer, videoFrame.getRotation(), videoFrame.getTimestampNs());
        super.b(videoFrame2, aulb, (Matrix)null, n, n2);
        videoFrame2.release();
    }
}

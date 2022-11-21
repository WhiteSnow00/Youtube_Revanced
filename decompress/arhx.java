import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhx implements Runnable
{
    public final InternalMediaCodecVideoEncoder a;
    public final int b;
    public final double c;
    
    public arhx(final InternalMediaCodecVideoEncoder a, final int b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        final InternalMediaCodecVideoEncoder a = this.a;
        final int b = this.b;
        final double c = this.c;
        if (a.k) {
            a.A = b;
            final double b2 = afua.b(c);
            a.z = b2;
            a.K.d(a.A, b2);
        }
    }
}

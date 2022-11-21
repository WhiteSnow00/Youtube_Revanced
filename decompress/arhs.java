import org.webrtc.VideoFrame$Buffer;
import android.os.SystemClock;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhs implements VideoSink
{
    public final Object a;
    public arhq b;
    public VideoFrame c;
    public final arht d;
    public int e;
    private final auot f;
    
    public arhs(final arht d, final auot f) {
        this.d = d;
        this.a = new Object();
        this.f = f;
        this.e = 1;
    }
    
    public final void a() {
        synchronized (this.a) {
            if (this.e == 3) {
                this.c.release();
                this.c = null;
            }
            this.e = 1;
        }
    }
    
    public final boolean b() {
        this.d.i();
        Object o = this.a;
        synchronized (o) {
            if (this.e != 1 || this.d.h.size() == 0) {
                return false;
            }
            final arhq b = this.d.h.remove();
            this.b = b;
            this.e = 2;
            monitorexit(o);
            o = this.f;
            final int a = b.a;
            final int b2 = b.b;
            if (a <= 0) {
                final StringBuilder sb = new StringBuilder("Texture width must be positive, but was ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
            if (b2 > 0) {
                ((auot)o).b.setDefaultBufferSize(a, b2);
                ((auot)o).a.post((Runnable)new auos((auot)o, a, b2, 0));
                final auot f = this.f;
                f.a.post((Runnable)new augh(f, this.b.f.c, 3));
                return this.d.n(this.b.c, true);
            }
            final StringBuilder sb2 = new StringBuilder("Texture height must be positive, but was ");
            sb2.append(b2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
    
    public final void onFrame(final VideoFrame videoFrame) {
        synchronized (this.a) {
            final arhd a = arhd.a;
            final int e = this.e;
            final int n = e - 1;
            if (e != 0) {
                if (n != 0) {
                    if (n != 1) {
                        String s;
                        if (e != 1) {
                            if (e != 2) {
                                s = "DONE";
                            }
                            else {
                                s = "WAIT_FOR_TEXTURE_FRAME_AVAILABLE";
                            }
                        }
                        else {
                            s = "READY";
                        }
                        Logging.b("IMCVideoDecoder", "Unexpected onFrame() called in state ".concat(s));
                        throw new IllegalStateException("Already holding a texture.");
                    }
                    final VideoFrame$Buffer buffer = videoFrame.getBuffer();
                    final arhr f = this.b.f;
                    this.c = new VideoFrame(buffer, f.c, f.b);
                    videoFrame.getBuffer().retain();
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.e = 3;
                    final arht d = this.d;
                    final int p = d.p;
                    if (p <= d.q) {
                        final int j = d.j;
                        final int k = d.k;
                        final arhq b = this.b;
                        final long d2 = b.d;
                        final long e2 = b.e;
                        final long a2 = b.f.a;
                        final StringBuilder sb = new StringBuilder("Decoder frame rendered # ");
                        sb.append(p);
                        sb.append(". ");
                        sb.append(j);
                        sb.append(" x ");
                        sb.append(k);
                        sb.append(". TS: ");
                        sb.append(d2);
                        sb.append(". RenderTime: ");
                        sb.append(elapsedRealtime - e2);
                        sb.append(". TotalTime: ");
                        sb.append(elapsedRealtime - a2);
                        Logging.a("IMCVideoDecoder", sb.toString());
                    }
                    this.a.notifyAll();
                    final arht d3 = this.d;
                    if (d3.f) {
                        d3.e.post((Runnable)new arfq(d3, 6));
                    }
                }
                else {
                    Logging.d("IMCVideoDecoder", "onFrame() called in READY state.");
                }
                return;
            }
            throw null;
        }
    }
}

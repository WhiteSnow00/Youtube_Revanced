import java.util.concurrent.CountDownLatch;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.os.Looper;
import org.webrtc.VideoFrame;
import org.webrtc.Logging;
import java.util.concurrent.TimeUnit;
import android.os.HandlerThread;
import android.view.SurfaceHolder$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aulv extends aukx implements SurfaceHolder$Callback
{
    public boolean A;
    public int B;
    public int C;
    public int D;
    public auls y;
    public final Object z;
    
    public aulv(final String s) {
        super(s);
        this.z = new Object();
    }
    
    public final void d(final aukm aukm, auls b, final int[] array, final aulr i) {
        aumt.k();
        this.y = b;
        synchronized (this.z) {
            this.A = false;
            this.B = 0;
            this.C = 0;
            this.D = 0;
            monitorexit(this.z);
            b = (auls)super.b;
            synchronized (this.z) {
                if (super.c == null) {
                    super.b("Initializing EglRenderer");
                    super.i = i;
                    final String a = super.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append("EglRenderer");
                    final HandlerThread handlerThread = new HandlerThread(sb.toString());
                    handlerThread.start();
                    aumt.l(super.c = (Handler)new aukw(handlerThread.getLooper(), (Runnable)new audk(this, 14, (char[])null)), (Runnable)new arfj((aukx)this, aukm, array, 8));
                    super.c.post((Runnable)super.x);
                    super.a(System.nanoTime());
                    super.c.postDelayed(super.w, TimeUnit.SECONDS.toMillis(4L));
                    return;
                }
                final String a2 = super.a;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(a2);
                sb2.append("Already initialized");
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
    
    public final void e(final String s) {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(": ");
        sb.append(s);
        Logging.a("SurfaceEglRenderer", sb.toString());
    }
    
    public final void onFrame(VideoFrame o) {
        synchronized (this.z) {
            if (!this.A) {
                this.A = true;
                this.e("Reporting first rendered frame.");
            }
            if (this.B != o.b() || this.C != o.a() || this.D != o.getRotation()) {
                final int width = o.getBuffer().getWidth();
                final int height = o.getBuffer().getHeight();
                final int rotation = o.getRotation();
                final StringBuilder sb = new StringBuilder("Reporting frame resolution changed to ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(" with rotation ");
                sb.append(rotation);
                this.e(sb.toString());
                final auls y = this.y;
                if (y != null) {
                    int width2 = o.getBuffer().getWidth();
                    final int height2 = o.getBuffer().getHeight();
                    int rotation2 = o.getRotation();
                    int n;
                    if (rotation2 != 0) {
                        if (rotation2 == 180) {
                            n = width2;
                            rotation2 = 180;
                        }
                        else {
                            n = height2;
                        }
                    }
                    else {
                        n = width2;
                    }
                    if (rotation2 == 0 || rotation2 == 180) {
                        width2 = height2;
                    }
                    final aulw aulw = new aulw((auly)y, n, width2, 2);
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        ((Runnable)aulw).run();
                    }
                    else {
                        ((auly)y).post((Runnable)aulw);
                    }
                }
                this.B = o.b();
                this.C = o.a();
                this.D = o.getRotation();
            }
            monitorexit(this.z);
            Object o2 = super.o;
            synchronized (this.z) {
                ++super.p;
                monitorexit(this.z);
                o2 = super.b;
                synchronized (this.z) {
                    if (super.c == null) {
                        this.b("Dropping frame - Not initialized or already released.");
                        return;
                    }
                    synchronized (super.k) {
                        final VideoFrame l = super.l;
                        final boolean b = l != null;
                        if (b) {
                            l.release();
                        }
                        (super.l = o).retain();
                        super.c.post((Runnable)new audk(this, 12));
                        monitorexit(super.k);
                        monitorexit(this.z);
                        if (b) {
                            o = (VideoFrame)super.o;
                            monitorenter(o);
                            try {
                                ++super.q;
                            }
                            finally {}
                        }
                    }
                }
            }
        }
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
        aumt.k();
        final StringBuilder sb = new StringBuilder("surfaceChanged: format: ");
        sb.append(n);
        sb.append(" size: ");
        sb.append(n2);
        sb.append("x");
        sb.append(n3);
        this.e(sb.toString());
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        aumt.k();
        super.x.a((Object)surfaceHolder.getSurface());
        final aukt x = super.x;
        synchronized (super.b) {
            final Handler c = super.c;
            if (c != null) {
                c.post((Runnable)x);
            }
        }
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
        aumt.k();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final audk audk = new audk(countDownLatch, 17);
        super.x.a((Object)null);
        synchronized (super.b) {
            final Handler c = super.c;
            if (c != null) {
                c.removeCallbacks((Runnable)super.x);
                super.c.postAtFrontOfQueue((Runnable)new asfa(this, audk, 16));
                monitorexit(super.b);
            }
            else {
                monitorexit(super.b);
                audk.run();
            }
            aumt.j(countDownLatch);
        }
    }
}

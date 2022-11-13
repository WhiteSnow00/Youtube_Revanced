import android.view.SurfaceHolder;
import org.webrtc.Logging;
import android.view.View$MeasureSpec;
import android.graphics.Point;
import android.view.View;
import android.os.Looper;
import org.webrtc.VideoFrame;
import android.content.res.Resources$NotFoundException;
import android.content.Context;
import org.webrtc.VideoSink;
import android.view.SurfaceHolder$Callback;
import android.view.SurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auly extends SurfaceView implements SurfaceHolder$Callback, VideoSink, auls
{
    public final aulv a;
    public int b;
    public int c;
    private final String d;
    private final ault e;
    
    public auly(final Context context) {
        super(context);
        this.e = new ault();
        final String b = this.b();
        this.d = b;
        final aulv a = new aulv(b);
        this.a = a;
        this.getHolder().addCallback((SurfaceHolder$Callback)this);
        this.getHolder().addCallback((SurfaceHolder$Callback)a);
    }
    
    private final String b() {
        try {
            return this.getResources().getResourceEntryName(this.getId());
        }
        catch (final Resources$NotFoundException ex) {
            return "";
        }
    }
    
    public final void a() {
        aumt.k();
        this.getHolder().setSizeFromLayout();
    }
    
    public final void onFrame(VideoFrame o) {
        final aulv a = this.a;
        synchronized (a.z) {
            if (!a.A) {
                a.A = true;
                a.e("Reporting first rendered frame.");
            }
            if (a.B != o.b() || a.C != o.a() || a.D != o.getRotation()) {
                final int width = o.getBuffer().getWidth();
                final int height = o.getBuffer().getHeight();
                final int rotation = o.getRotation();
                final StringBuilder sb = new StringBuilder("Reporting frame resolution changed to ");
                sb.append(width);
                sb.append("x");
                sb.append(height);
                sb.append(" with rotation ");
                sb.append(rotation);
                a.e(sb.toString());
                final auls y = a.y;
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
                a.B = o.b();
                a.C = o.a();
                a.D = o.getRotation();
            }
            monitorexit(a.z);
            Object o2 = a.o;
            synchronized (a.z) {
                ++a.p;
                monitorexit(a.z);
                o2 = a.b;
                synchronized (a.z) {
                    if (a.c == null) {
                        a.b("Dropping frame - Not initialized or already released.");
                        return;
                    }
                    synchronized (a.k) {
                        final VideoFrame l = a.l;
                        final boolean b = l != null;
                        if (b) {
                            l.release();
                        }
                        (a.l = o).retain();
                        a.c.post((Runnable)new audk(a, 12));
                        monitorexit(a.k);
                        monitorexit(a.z);
                        if (b) {
                            o = (VideoFrame)a.o;
                            monitorenter(o);
                            try {
                                ++a.q;
                            }
                            finally {}
                        }
                    }
                }
            }
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        aumt.k();
        final aulv a = this.a;
        final StringBuilder sb = new StringBuilder("setLayoutAspectRatio: ");
        final float n5 = (n3 - n) / (float)(n4 - n2);
        sb.append(n5);
        a.b(sb.toString());
        synchronized (a.m) {
            a.n = n5;
            monitorexit(a.m);
            this.a();
        }
    }
    
    protected final void onMeasure(int y, int x) {
        aumt.k();
        final ault e = this.e;
        final int b = this.b;
        final int c = this.c;
        final int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, y);
        final int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, x);
        Point point2;
        if (b != 0 && c != 0 && defaultSize != 0 && defaultSize2 != 0) {
            final float n = (float)b;
            final float n2 = (float)c;
            final float n3 = (float)defaultSize;
            final float n4 = n / n2;
            int n5 = false ? 1 : 0;
            final boolean b2 = n4 > 1.0f;
            final float n6 = (float)defaultSize2;
            if (n3 / n6 > 1.0f) {
                n5 = (true ? 1 : 0);
            }
            if ((b2 ? 1 : 0) == n5) {
                final float a = e.a;
            }
            else {
                final float b3 = e.b;
            }
            Point point;
            if (n4 == 0.0f) {
                point = new Point(defaultSize, defaultSize2);
            }
            else {
                point = new Point(Math.min(defaultSize, Math.round(n6 / 0.5625f * n4)), Math.min(defaultSize2, Math.round(n3 / 0.5625f / n4)));
            }
            if (View$MeasureSpec.getMode(y) == 1073741824) {
                point.x = defaultSize;
            }
            point2 = point;
            if (View$MeasureSpec.getMode(x) == 1073741824) {
                point.y = defaultSize2;
                point2 = point;
            }
        }
        else {
            point2 = new Point(defaultSize, defaultSize2);
        }
        this.setMeasuredDimension(point2.x, point2.y);
        x = point2.x;
        y = point2.y;
        final StringBuilder sb = new StringBuilder("onMeasure(). New size: ");
        sb.append(x);
        sb.append("x");
        sb.append(y);
        final String string = sb.toString();
        final String d = this.d;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(d);
        sb2.append(": ");
        sb2.append(string);
        Logging.a("SurfaceViewRenderer", sb2.toString());
    }
    
    public final void surfaceChanged(final SurfaceHolder surfaceHolder, final int n, final int n2, final int n3) {
    }
    
    public final void surfaceCreated(final SurfaceHolder surfaceHolder) {
        aumt.k();
        this.a();
    }
    
    public final void surfaceDestroyed(final SurfaceHolder surfaceHolder) {
    }
}

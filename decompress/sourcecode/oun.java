import android.support.rastermill.FrameSequenceDrawable$OnFinishedListener;
import android.support.rastermill.FrameSequenceDrawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oun
{
    public final CommandOuterClass$Command a;
    public final ort b;
    private final CommandOuterClass$Command c;
    private FrameSequenceDrawable d;
    private final Object e;
    
    public oun(final CommandOuterClass$Command a, final CommandOuterClass$Command c, final ort b, final Object e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public final void a() {
        final FrameSequenceDrawable d = this.d;
        if (d != null) {
            d.setOnFinishedListener((FrameSequenceDrawable$OnFinishedListener)null);
        }
        this.d = null;
    }
    
    public final void b(final FrameSequenceDrawable d) {
        (this.d = d).setLoopBehavior(1);
        d.setLoopCount(1);
        d.setOnFinishedListener((FrameSequenceDrawable$OnFinishedListener)new oum(this));
    }
    
    public final void c() {
        final FrameSequenceDrawable d = this.d;
        if (d != null) {
            d.start();
            final CommandOuterClass$Command c = this.c;
            if (c != null) {
                this.b.a(c, null).U();
            }
        }
    }
    
    public final void d() {
        final FrameSequenceDrawable d = this.d;
        if (d != null) {
            d.stop();
        }
    }
    
    @Override
    public final boolean equals(Object e) {
        if (e instanceof oun) {
            final oun oun = (oun)e;
            final Object e2 = this.e;
            if (e2 instanceof aglt) {
                e = oun.e;
                if (e instanceof aglt) {
                    return mck.x((aglt)e2, (aglt)e);
                }
            }
            return e2.equals(oun.e);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode();
    }
}

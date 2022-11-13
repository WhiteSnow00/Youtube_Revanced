import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.ProcessorBase;
import com.google.research.xeno.effect.ProcessorBase$Callback;
import android.util.Size;
import com.google.research.xeno.effect.InputFrameSource;
import java.util.List;
import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquw implements aqvf
{
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;
    
    public aquw(final ExperienceJni a, final List c, final pja b, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public aquw(final InputFrameSource a, final Size b, final ProcessorBase$Callback c, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public aquw(final ProcessorBase c, final ProcessorBase$Callback a, final Effect b, final int d) {
        this.d = d;
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final long n) {
        final int d = this.d;
        if (d == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final Object c = this.c;
            final String a2 = aqvb.a;
            final int e = ((InputFrameSource)a).e;
            final Size size = (Size)b;
            aqvb.nativeStartVideoProcessing(n, e, (long)size.getWidth(), (long)size.getHeight(), 0, 0, (ProcessorBase$Callback)c);
            return;
        }
        if (d != 1) {
            final Object c2 = this.c;
            final Object a3 = this.a;
            final Object b2 = this.b;
            if (b2 != null) {
                final Effect effect = (Effect)b2;
                effect.c.readLock().lock();
                try {
                    aqsy.g(((Effect)b2).a, (ProcessorBase)c2, n, (ProcessorBase$Callback)a3, (Effect)b2);
                    return;
                }
                finally {
                    effect.c.readLock().unlock();
                }
            }
            aqsy.g(0L, (ProcessorBase)c2, n, (ProcessorBase$Callback)a3, (Effect)null);
            return;
        }
        final Object a4 = this.a;
        final Object c3 = this.c;
        final Object b3 = this.b;
        final ExperienceJni experienceJni = (ExperienceJni)a4;
        experienceJni.nativeActivateItems(experienceJni.b, (List)c3, n, NativeCallback.a((pja)b3));
    }
}

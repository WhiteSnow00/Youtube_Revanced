import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyk implements Choreographer$FrameCallback
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public dyk(final LiveCreationActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dyk(final dyl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dyk(final Runnable a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public final void doFrame(final long n) {
        final int b = this.b;
        if (b == 0) {
            ((dyl)this.a).d(n);
            return;
        }
        if (b == 1) {
            ((Runnable)this.a).run();
            return;
        }
        if (b == 2) {
            final pcj pcj = (pcj)this.a;
            final Object b2 = pcj.b;
            final pch pch = (pch)b2;
            ++pch.d;
            if (!((pcg)b2).a(pch.a) && !((pch)pcj.b).a.isStarted()) {
                final pch pch2 = (pch)pcj.b;
                if (pch2.c != -1) {
                    if (pch2.d >= 0) {
                        return;
                    }
                }
                final Runnable b3 = pch2.b;
                if (b3 != null) {
                    b3.run();
                }
                ((pch)pcj.b).a.start();
            }
            return;
        }
        if (b != 3) {
            ((Runnable)this.a).run();
            return;
        }
        ((LiveCreationActivity)this.a).Z.a();
        if (((LiveCreationActivity)this.a).bG()) {
            ((LiveCreationActivity)this.a).bi((Choreographer$FrameCallback)this);
        }
    }
}

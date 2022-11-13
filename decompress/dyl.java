import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyl implements Choreographer$FrameCallback
{
    final Object a;
    private final int b;
    
    public dyl(final LiveCreationActivity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dyl(final dym a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dyl(final Runnable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public dyl(final Runnable a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public dyl(final pdu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void doFrame(final long n) {
        final int b = this.b;
        if (b == 0) {
            ((dym)this.a).d(n);
            return;
        }
        if (b == 1) {
            ((Runnable)this.a).run();
            return;
        }
        if (b == 2) {
            final pdu pdu = (pdu)this.a;
            final Object b2 = pdu.b;
            final pds pds = (pds)b2;
            ++pds.d;
            if (!((pdr)b2).a(pds.a) && !((pds)pdu.b).a.isStarted()) {
                final pds pds2 = (pds)pdu.b;
                if (pds2.c != -1) {
                    if (pds2.d >= 0) {
                        return;
                    }
                }
                final Runnable b3 = pds2.b;
                if (b3 != null) {
                    b3.run();
                }
                ((pds)pdu.b).a.start();
            }
            return;
        }
        if (b != 3) {
            ((Runnable)this.a).run();
            return;
        }
        ((LiveCreationActivity)this.a).Z.a();
        if (((LiveCreationActivity)this.a).bJ()) {
            ((LiveCreationActivity)this.a).bj((Choreographer$FrameCallback)this);
        }
    }
}

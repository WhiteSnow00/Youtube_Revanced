import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsm extends dst
{
    @dyi(a = 13)
    fss a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    elx b;
    
    public fsm() {
        super("InlinePlayerContainer");
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        return frameLayout;
    }
    
    protected final void X(final dsx dsx, final Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final fss a = this.a;
        final elx b = this.b;
        String.valueOf(frameLayout);
        if (a == null) {
            zlm.b(zll.b, zlk.b, "InlinePlayerViewPositionBroadcaster cannot be null during onBind.");
            return;
        }
        a.b((fsr)new fsn(frameLayout));
        a.c(new fzw(frameLayout, b, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aC(final cya cya) {
        if (cya == null) {
            return;
        }
        this.a = (fss)cya.u((Class)fss.class);
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final void aw(final Object o) {
        final FrameLayout frameLayout = (FrameLayout)o;
        final fss a = this.a;
        String.valueOf(frameLayout);
        if (a == null) {
            return;
        }
        a.b((fsr)null);
        a.c((fzw)null);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final fsm fsm = (fsm)dst;
            final elx b = this.b;
            Label_0062: {
                if (b != null) {
                    if (b.equals(fsm.b)) {
                        break Label_0062;
                    }
                }
                else if (fsm.b == null) {
                    break Label_0062;
                }
                return false;
            }
            final fss a = this.a;
            if (a != null) {
                if (a.equals(fsm.a)) {
                    return true;
                }
            }
            else if (fsm.a == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}

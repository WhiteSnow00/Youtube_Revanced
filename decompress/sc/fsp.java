import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsp extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    atke a;
    @dyi(a = 13)
    fss b;
    
    public fsp() {
        super("InlinePlayerTracker");
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new ImageView(context);
    }
    
    protected final void X(final dsx dsx, final Object o) {
        final ImageView imageView = (ImageView)o;
        final atke a = this.a;
        final fss b = this.b;
        String.valueOf(imageView);
        if (b == null) {
            zlm.b(zll.b, zlk.b, "InlinePlayerViewPositionBroadcaster cannot be null during onBind.");
            return;
        }
        b.b((fsr)new fsq(imageView, a));
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    protected final void aC(final cya cya) {
        if (cya == null) {
            return;
        }
        this.b = (fss)cya.u((Class)fss.class);
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final void aw(final Object o) {
        final ImageView imageView = (ImageView)o;
        final fss b = this.b;
        String.valueOf(imageView);
        if (b == null) {
            return;
        }
        b.b((fsr)null);
        imageView.setImageDrawable((Drawable)null);
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final fsp fsp = (fsp)dst;
            final atke a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(fsp.a)) {
                        break Label_0062;
                    }
                }
                else if (fsp.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final fss b = this.b;
            if (b != null) {
                if (b.equals(fsp.b)) {
                    return true;
                }
            }
            else if (fsp.b == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}

import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.content.Context;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsy extends dst
{
    @dyi(a = 13)
    @dyj(a = dyk.a)
    arkg a;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    asiq b;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command c;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    CommandOuterClass$Command d;
    @dyi(a = 13)
    @dyj(a = dyk.a)
    abpu e;
    
    private fsy() {
        super("PlaybackButton");
    }
    
    public static fsx b(final dsx dsx) {
        final fsx fsx = new fsx();
        fsx.c(fsx, dsx, new fsy());
        return fsx;
    }
    
    protected final int K() {
        return 3;
    }
    
    protected final Object R(final Context context) {
        return new ImageView(context);
    }
    
    protected final void X(final dsx dsx, final Object o) {
        final ImageView imageView = (ImageView)o;
        final abpu e = this.e;
        final CommandOuterClass$Command d = this.d;
        final CommandOuterClass$Command c = this.c;
        final arkg a = this.a;
        this.b.c(((ashi)e.p().k).an((asjm)new fdu(imageView, dsx, 3), (asjm)ezq.u));
        imageView.setOnClickListener((View$OnClickListener)new fsz(e, c, a, imageView, d, dsx));
    }
    
    public final /* bridge */ boolean a(final Object o) {
        return this.f((dst)o);
    }
    
    public final boolean am() {
        return true;
    }
    
    public final int an() {
        return 3;
    }
    
    protected final void aw(final Object o) {
        final ImageView imageView = (ImageView)o;
        this.b.b();
    }
    
    public final boolean f(final dst dst) {
        if (this == dst) {
            return true;
        }
        if (dst != null && this.getClass() == dst.getClass()) {
            final fsy fsy = (fsy)dst;
            final arkg a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(fsy.a)) {
                        break Label_0062;
                    }
                }
                else if (fsy.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final asiq b = this.b;
            Label_0094: {
                if (b != null) {
                    if (b.equals(fsy.b)) {
                        break Label_0094;
                    }
                }
                else if (fsy.b == null) {
                    break Label_0094;
                }
                return false;
            }
            final CommandOuterClass$Command c = this.c;
            Label_0126: {
                if (c != null) {
                    if (((ahbh)c).equals((Object)fsy.c)) {
                        break Label_0126;
                    }
                }
                else if (fsy.c == null) {
                    break Label_0126;
                }
                return false;
            }
            final CommandOuterClass$Command d = this.d;
            Label_0158: {
                if (d != null) {
                    if (((ahbh)d).equals((Object)fsy.d)) {
                        break Label_0158;
                    }
                }
                else if (fsy.d == null) {
                    break Label_0158;
                }
                return false;
            }
            final abpu e = this.e;
            if (e != null) {
                if (e.equals(fsy.e)) {
                    return true;
                }
            }
            else if (fsy.e == null) {
                return true;
            }
            return false;
        }
        return false;
    }
}

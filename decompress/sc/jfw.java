import j$.util.Optional;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfw implements tcc
{
    final Object a;
    private final int b;
    private final Object c;
    
    public jfw(final ibg a, final PlayerResponseModel c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public jfw(final jfx a, final String c, final int b) {
        this.b = b;
        this.a = a;
        tvb.n(c);
        this.c = c;
    }
    
    public jfw(final jgb a, final String c, final int b) {
        this.b = b;
        this.a = a;
        tvb.n(c);
        this.c = c;
    }
    
    public jfw(final jgo a, final String c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void b(final Object o, Object o2) {
        final int b = this.b;
        if (b == 0) {
            final String s = (String)o;
            final Boolean g = (Boolean)o2;
            if (((String)this.c).equals(s)) {
                ((jfx)this.a).G = g;
            }
            return;
        }
        if (b == 1) {
            final Void void1 = (Void)o;
            final int n = ((abnm)o2).c - 1;
            if (n != 0) {
                if (n != 1) {
                    o2 = this.a;
                    ((ibg)o2).g(((PlayerResponseModel)this.c).K());
                }
                else {
                    ttr.l("The following video is unplayable: ".concat(String.valueOf(((PlayerResponseModel)this.c).K())));
                    tpe.x(((ibg)this.a).b, 2132019154, 0);
                }
            }
            else {
                o2 = this.a;
                ((ibg)o2).e(((PlayerResponseModel)this.c).K());
            }
            o2 = this.a;
            ((ibg)o2).d = Optional.empty();
            return;
        }
        if (b != 2) {
            final String s2 = (String)o;
            final Boolean c = (Boolean)o2;
            if (((String)this.c).equals(s2)) {
                ((jgo)this.a).c = c;
            }
            return;
        }
        final String s3 = (String)o;
        final Boolean p2 = (Boolean)o2;
        if (((String)this.c).equals(s3)) {
            ((jgb)this.a).P = p2;
        }
    }
    
    public final void sd(final Object o, final Exception ex) {
        final int b = this.b;
        if (b == 0) {
            final String s = (String)o;
            ttr.d("Encountered exception when syncing playlist", (Throwable)ex);
            return;
        }
        if (b == 1) {
            final Void void1 = (Void)o;
            final tqd a = ((ibg)this.a).a;
            a.d(a.b((Throwable)ex));
            zlm.b(zll.a, zlk.j, "Could not get playability result: ".concat(String.valueOf(String.valueOf(ex))));
            return;
        }
        if (b != 2) {
            final String s2 = (String)o;
            ttr.d("Encountered exception when syncing playlist", (Throwable)ex);
            return;
        }
        final String s3 = (String)o;
        ttr.d("Encountered exception when syncing playlist", (Throwable)ex);
    }
}

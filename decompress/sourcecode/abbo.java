import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abbo implements abbl, abnq, tec
{
    private final bu a;
    private final abbp b;
    private final abno c;
    private final abbm d;
    
    public abbo(final abno c, final abbm d) {
        this.a = null;
        this.b = null;
        this.c = c;
        d.getClass();
        (this.d = d).l((abbl)this);
    }
    
    public abbo(final bu a, final abno c, final abbm d, final abbp b) {
        this.a = a;
        this.b = b;
        this.c = c;
        d.getClass();
        (this.d = d).l((abbl)this);
    }
    
    public final void b(final aalr aalr) {
        this.d.j(aalr.a());
        if (aalr.a() != null && !aalr.a().t() && !aalr.a().n()) {
            this.d.qW(true);
            return;
        }
        this.d.qW(false);
    }
    
    public final void c(final aals aals) {
        this.d.g(aals.a());
    }
    
    public final asic[] lX(final abns abns) {
        return new asic[] { abns.I((aexg)aajm.u, (aexg)abbn.b).j(aajj.t(abns.bN(), 1048576L)).j(aajj.r(1)).am((asix)new abat(this, 18), (asix)aaze.n), abns.I((aexg)aajm.u, (aexg)abbn.a).j(aajj.t(abns.bN(), 1048576L)).j(aajj.r(1)).am((asix)new abat(this, 19), (asix)aaze.n) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.c((aals)o);
            }
            else {
                this.b((aalr)o);
            }
        }
        else {
            array = new Class[] { aalr.class, aals.class };
        }
        return array;
    }
    
    public final void qV(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack.r()) {
            final List b = this.c.g.b();
            final abbp b2 = this.b;
            if (b2 != null && this.a != null) {
                b2.aU(b);
                this.b.aV(this.a);
            }
            return;
        }
        this.c.M(subtitleTrack);
    }
}

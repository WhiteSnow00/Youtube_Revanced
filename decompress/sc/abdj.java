import java.util.List;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abdj implements abdh, abps, tgg
{
    private final bu a;
    private final abdk b;
    private final abpq c;
    private final abdi d;
    
    public abdj(final abpq c, final abdi d) {
        this.a = null;
        this.b = null;
        this.c = c;
        d.getClass();
        (this.d = d).l((abdh)this);
    }
    
    public abdj(final bu a, final abpq c, final abdi d, final abdk b) {
        this.a = a;
        this.b = b;
        this.c = c;
        d.getClass();
        (this.d = d).l((abdh)this);
    }
    
    public final void b(final aanl aanl) {
        this.d.j(aanl.a());
        if (aanl.a() != null && !aanl.a().t() && !aanl.a().n()) {
            this.d.rc(true);
            return;
        }
        this.d.rc(false);
    }
    
    public final void c(final aanm aanm) {
        this.d.g(aanm.a());
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { abpu.H((aezf)abdc.d, (aezf)abdc.e).j(aale.s(abpu.bM(), 1048576L)).j(aale.q(1)).an((asjm)new abdd(this, 2), abba.n), abpu.H((aezf)abdc.d, (aezf)abdc.f).j(aale.s(abpu.bM(), 1048576L)).j(aale.q(1)).an((asjm)new abdd(this, 3), abba.n) };
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
                this.c((aanm)o);
            }
            else {
                this.b((aanl)o);
            }
        }
        else {
            array = new Class[] { aanl.class, aanm.class };
        }
        return array;
    }
    
    public final void rb(final SubtitleTrack subtitleTrack) {
        if (subtitleTrack.r()) {
            final List b = this.c.g.b();
            final abdk b2 = this.b;
            if (b2 != null && this.a != null) {
                b2.aU(b);
                this.b.aV(this.a);
            }
            return;
        }
        this.c.L(subtitleTrack);
    }
}

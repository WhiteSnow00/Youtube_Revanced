// 
// Decompiled by Procyon v0.6.0
// 

@rxl(a = ahne.g, b = ahnh.h, c = { sck.class })
public final class ett implements rrv
{
    private final ets a;
    private final rru b;
    private final sfh c;
    private final sdr d;
    private final ajtn e;
    
    public ett(final ets a, final rru b, final sfh c, final sdr d) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        d.getClass();
        this.d = d;
        this.e = (ajtn)d.f((Class)sck.class);
    }
    
    public final void I() {
    }
    
    public final void J() {
        final alek v = (alek)this.d.j.f();
        final ets a = this.a;
        final ajtn e = this.e;
        alff g;
        if (v != null) {
            final agza builder = ((agzi)alff.a).createBuilder();
            builder.copyOnWrite();
            final alff alff = (alff)builder.instance;
            alff.v = v;
            alff.c |= 0x400;
            g = (alff)builder.build();
        }
        else {
            g = null;
        }
        final jau jau = (jau)a;
        jau.f = e;
        jau.g = g;
        jau.e();
        this.b.a(this.c, this.d);
    }
    
    public final void K(final int n) {
        final jau jau = (jau)this.a;
        jau.g = null;
        if (jau.f != null) {
            jau.f = null;
            jau.e();
        }
        this.b.d(this.c, this.d, n);
    }
    
    public final sdr a() {
        throw null;
    }
    
    public final void b() {
    }
}

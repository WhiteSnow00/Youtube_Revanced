// 
// Decompiled by Procyon v0.6.0
// 

public final class gsz
{
    public final gta a;
    public final gta b;
    public final /* synthetic */ gtb c;
    private final aeyr d;
    private final aeyr e;
    private final aeyr f;
    private final aeyr g;
    private final aeyr h;
    private final aeyr i;
    private final aeyr j;
    
    public gsz(final gtb c) {
        this.c = c;
        this.a = new gta(3);
        this.b = new gta(4);
        this.d = new grk(this, 2);
        this.e = new grk(this, 3);
        this.f = new grk(this, 4);
        this.g = new grk(this, 5);
        this.h = new grk(this, 6);
        this.i = new grk(this, 7);
        this.j = new grk(this, 8);
    }
    
    private final String h() {
        return (String)this.b.a("clipDurationFormatted", this.g);
    }
    
    private final String i() {
        return (String)this.b.a("clipEndFormatted", this.i);
    }
    
    private final String j() {
        return (String)this.b.a("clipStartFormatted", this.h);
    }
    
    private final String k() {
        return (String)this.b.a("maxLengthFormatted", this.j);
    }
    
    public final long a() {
        return (long)this.a.a("durationMs", this.f);
    }
    
    public final long b() {
        return (long)this.a.a("endTimeMs", this.e);
    }
    
    public final long c() {
        return (long)this.a.a("startTimeMs", this.d);
    }
    
    public final void d() {
        final gtb c = this.c;
        if (c.C != null) {
            if (c.v == 0) {
                c.q.m = c.l.replace("$start_time", this.j()).replace("$end_time", this.i()).replace("$clip_length", this.h());
                final gtb c2 = this.c;
                c2.q.n = c2.m.replace("$start_time", this.j()).replace("$clip_length", this.h()).replace("$max_length", this.k());
                final gtb c3 = this.c;
                c3.q.o = c3.n.replace("$end_time", this.i()).replace("$clip_length", this.h()).replace("$max_length", this.k());
                this.c.q.postInvalidate();
            }
        }
    }
    
    public final void e() {
        final gtb c = this.c;
        if (c.p == null) {
            return;
        }
        this.c.p.setText((CharSequence)c.j.replace("$clip_length", this.h()));
    }
    
    public final void f() {
        final agza builder = ((agzi)aimz.a).createBuilder();
        final String k = this.c.k;
        builder.copyOnWrite();
        final aimz aimz = (aimz)builder.instance;
        k.getClass();
        aimz.b |= 0x1;
        aimz.c = k;
        final long c = this.c();
        builder.copyOnWrite();
        final aimz aimz2 = (aimz)builder.instance;
        aimz2.b |= 0x4;
        aimz2.e = c;
        final long a = this.a();
        builder.copyOnWrite();
        final aimz aimz3 = (aimz)builder.instance;
        aimz3.b |= 0x10;
        aimz3.f = a;
        final String u = this.c.u;
        builder.copyOnWrite();
        final aimz aimz4 = (aimz)builder.instance;
        u.getClass();
        aimz4.b |= 0x2;
        aimz4.d = u;
        ((osb)this.c.g.a()).b(this.c.k, ((agxl)builder.build()).toByteArray());
    }
    
    public final void g(final boolean b) {
        final gtb c = this.c;
        if (c.C != null) {
            if (c.v == 0) {
                long c2 = this.c();
                final long b2 = this.b();
                ((aaxs)this.c.e.a()).b(c2, b2);
                if (!b) {
                    c2 = b2 - gtb.a;
                }
                final gtb c3 = this.c;
                c3.B = (((abno)c3.f.a()).aa(c2) ^ true);
                this.c.n(c2);
            }
        }
    }
}

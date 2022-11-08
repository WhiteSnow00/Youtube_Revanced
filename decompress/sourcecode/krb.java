// 
// Decompiled by Procyon v0.6.0
// 

public final class krb implements Runnable
{
    public boolean a;
    public boolean b;
    public float c;
    public int d;
    final /* synthetic */ krc e;
    
    public krb(final krc e) {
        this.e = e;
        this.a = false;
        this.b = false;
    }
    
    final void a() {
        this.a = false;
        this.b = false;
    }
    
    @Override
    public final void run() {
        if (!this.a) {
            return;
        }
        final krc e = this.e;
        if (e.q == null) {
            aioe o = e.o;
            if (o == null) {
                final aioe m = e.m;
                final wwv n = e.d.n();
                o = m;
                if (n != null) {
                    o = m;
                    if (n.a() != null) {
                        n.l((wxz)new wws(wya.c(62748)));
                        final agza builder = ((agzi)amob.a).createBuilder();
                        final String a = n.a().a;
                        builder.copyOnWrite();
                        final amob amob = (amob)builder.instance;
                        a.getClass();
                        amob.b |= 0x1;
                        amob.c = a;
                        builder.copyOnWrite();
                        final amob amob2 = (amob)builder.instance;
                        amob2.b |= 0x2;
                        amob2.d = 62748;
                        final amob amob3 = (amob)builder.build();
                        final agzc agzc = (agzc)((agzi)m).toBuilder();
                        agzc.e((agyr)amoa.b, (Object)amob3);
                        ((agza)agzc).copyOnWrite();
                        final aioe aioe = (aioe)agzc.instance;
                        aioe.b &= 0xFFFFFFFE;
                        aioe.c = aioe.a.c;
                        o = (aioe)((agza)agzc).build();
                    }
                }
            }
            this.e.q = hhl.o(o, true, true);
            final krc e2 = this.e;
            final hhl q = e2.q;
            q.aq = (hhn)e2;
            if (!q.ar()) {
                final ct i = this.e.c.i();
                i.r(this.d, (br)this.e.q, "creation_fragment");
                i.k();
            }
            if (this.b) {
                this.e.q.ax.B();
                this.b = false;
            }
        }
        final hhm ap = this.e.q.ap;
        final float c = this.c;
        final hhi al = ((hhl)((hhk)ap).a).al;
        if (al != null) {
            al.ak = c;
        }
        this.a = false;
    }
}

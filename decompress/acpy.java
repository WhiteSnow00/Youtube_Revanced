import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class acpy implements zrb
{
    final acbk a;
    final boolean b;
    final aisc c;
    final acqm d;
    final acqh e;
    
    public acpy(final acqh e, final acbk a, final boolean b, final aisc c, final acqm d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbm dbm) {
        final acbk a = this.a;
        final acqh e = this.e;
        if (a != e.C) {
            return;
        }
        acqh.am(e);
        this.d.b(dbm, this.a);
    }
    
    public final /* bridge */ void mU(final Object o) {
        final acbl acbl = (acbl)o;
        final acbk a = this.a;
        final acqh e = this.e;
        if (a != e.C) {
            return;
        }
        acqh.am(e);
        if (this.b) {
            this.e.A.clear();
        }
        if (acbl == null) {
            this.e.y.remove(this.a.a());
        }
        else {
            if (this.e.U() != null) {
                final acpc u = this.e.U();
                final acbk a2 = this.a;
                final aisc c = this.c;
                final Object b = u.b;
                final int a3 = u.a;
                final acqh acqh = (acqh)b;
                acqh.z.s();
                if (a2.a() == acbj.d) {
                    acqh.z.b(xbf.b(a3), c, (alji)null);
                }
                final acqh e2 = this.e;
                final Iterator iterator = e2.B.iterator();
                while (iterator.hasNext()) {
                    e2.z.l((xbe)iterator.next());
                }
            }
            final acqh e3 = this.e;
            if (acbl.b() != null) {
                final byte[] d = acbl.d();
                e3.A.add(d);
                if (d != null) {
                    e3.z.D((xbe)new wzy(d));
                }
            }
        }
        final acqc h = this.e.H;
        if (h != null) {
            h.a(acbl, this.a.a());
        }
        this.d.a(acbl.b(), this.a);
    }
    
    public final void mV() {
    }
}

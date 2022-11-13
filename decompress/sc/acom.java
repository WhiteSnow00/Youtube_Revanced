import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class acom implements zpf
{
    final acaa a;
    final boolean b;
    final aiqj c;
    final acpa d;
    final acov e;
    
    public acom(final acov e, final acaa a, final boolean b, final aiqj c, final acpa d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final dbj dbj) {
        final acaa a = this.a;
        final acov e = this.e;
        if (a != e.C) {
            return;
        }
        acov.am(e);
        this.d.b(dbj, this.a);
    }
    
    public final /* bridge */ void mX(final Object o) {
        final acab acab = (acab)o;
        final acaa a = this.a;
        final acov e = this.e;
        if (a != e.C) {
            return;
        }
        acov.am(e);
        if (this.b) {
            this.e.A.clear();
        }
        if (acab == null) {
            this.e.y.remove(this.a.a());
        }
        else {
            if (this.e.U() != null) {
                final acnp u = this.e.U();
                final acaa a2 = this.a;
                final aiqj c = this.c;
                final Object b = u.b;
                final int a3 = u.a;
                final acov acov = (acov)b;
                acov.z.s();
                if (a2.a() == abzz.d) {
                    acov.z.b(xaa.b(a3), c, (alhi)null);
                }
                final acov e2 = this.e;
                final Iterator iterator = e2.B.iterator();
                while (iterator.hasNext()) {
                    e2.z.l((wzz)iterator.next());
                }
            }
            final acov e3 = this.e;
            if (acab.b() != null) {
                final byte[] d = acab.d();
                e3.A.add(d);
                if (d != null) {
                    e3.z.D((wzz)new wyt(d));
                }
            }
        }
        final acoq h = this.e.H;
        if (h != null) {
            h.a(acab, this.a.a());
        }
        this.d.a(acab.b(), this.a);
    }
    
    public final void mY() {
    }
}

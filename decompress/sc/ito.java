import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ito implements ackp, tgg
{
    public final tgd a;
    public final acqg b;
    public acqe c;
    public final abhm d;
    
    public ito(final abhm d, final tgd a, final acqg b) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final acqe a(final acot acot) {
        return aald.r(acot, this.d.l.x, null, null);
    }
    
    public final void b(final acot acot) {
        if (this.b != null) {
            if (acot != null) {
                final acqe c = this.c;
                if (c == null) {
                    this.c = this.a(acot);
                }
                else if (c.a != acot) {
                    this.c = c.a(acot);
                }
                if (acot instanceof acon) {
                    if (this.d.l.al(abzz.b)) {
                        final acqe c2 = this.c;
                        if (c2 != null) {
                            this.c = c2.a((acot)acos.a());
                        }
                        this.b.q(this.c);
                        return;
                    }
                    this.b.q((acqe)null);
                }
                else {
                    this.b.q(this.c);
                }
            }
        }
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder("unsupported op code: ");
                        sb.append(n);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b((acot)o);
                }
                else {
                    this.b((acot)o);
                }
            }
            else {
                this.b((acot)o);
            }
        }
        else {
            array = new Class[] { acon.class, acor.class, acos.class };
        }
        return array;
    }
    
    public final void r(final acko acko, final Object o) {
        if (o == this.c) {
            this.d.l.mD(this.d.l.X(abzz.b));
        }
    }
}

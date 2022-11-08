import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class isp implements acim, tec
{
    public final tdz a;
    public final acoc b;
    public acoa c;
    public final /* synthetic */ abfr d;
    
    public isp(final abfr d, final tdz a, final acoc b) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public final acoa a(final acmq acmq) {
        return actc.l(acmq, this.d.l.x, (View$OnClickListener)null, (acob)null);
    }
    
    public final void b(final acmq acmq) {
        if (this.b != null) {
            if (acmq != null) {
                final acoa c = this.c;
                if (c == null) {
                    this.c = this.a(acmq);
                }
                else if (c.a != acmq) {
                    this.c = c.a(acmq);
                }
                if (acmq instanceof acmk) {
                    if (this.d.l.al(abxw.b)) {
                        final acoa c2 = this.c;
                        if (c2 != null) {
                            this.c = c2.a((acmq)acmp.a());
                        }
                        this.b.q(this.c);
                        return;
                    }
                    this.b.q((acoa)null);
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
                    this.b((acmq)o);
                }
                else {
                    this.b((acmq)o);
                }
            }
            else {
                this.b((acmq)o);
            }
        }
        else {
            array = new Class[] { acmk.class, acmo.class, acmp.class };
        }
        return array;
    }
    
    @Override
    public final void r(final acil acil, final Object o) {
        if (o == this.c) {
            this.d.l.mD(this.d.l.X(abxw.b));
        }
    }
}

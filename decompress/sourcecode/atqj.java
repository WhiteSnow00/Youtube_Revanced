import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atqj extends atvv
{
    public int e;
    
    public atqj(final int e) {
        super(0L, atvy.e);
        this.e = e;
    }
    
    public Object j(final Object o) {
        return o;
    }
    
    public abstract Object k();
    
    public Throwable n(final Object o) {
        atpm atpm;
        if (o instanceof atpm) {
            atpm = (atpm)o;
        }
        else {
            atpm = null;
        }
        if (atpm != null) {
            return atpm.b;
        }
        return null;
    }
    
    public abstract atld o();
    
    public void q(final Object o, final Throwable t) {
        throw null;
    }
    
    public final void run() {
        final boolean a = atqb.a;
        try {
            final atup atup = (atup)this.o();
            final atld b = atup.b;
            final Object d = atup.d;
            final atli context = b.getContext();
            final Object b2 = atvm.b(context, d);
            Object o;
            if (b2 != atvm.a) {
                o = atpt.c(b, context, b2);
            }
            else {
                o = null;
            }
            try {
                final atli context2 = b.getContext();
                final Object k = this.k();
                final Throwable n = this.n(k);
                atrb atrb;
                if (n == null && atqc.e(this.e)) {
                    atrb = (atrb)context2.get(atrb.c);
                }
                else {
                    atrb = null;
                }
                if (atrb != null && !atrb.tN()) {
                    final CancellationException n2 = atrb.n();
                    this.q(k, n2);
                    Throwable a2 = n2;
                    if (atqb.b) {
                        a2 = atvi.a((Throwable)n2, (atlq)b);
                    }
                    b.resumeWith(arxj.g(a2));
                }
                else if (n != null) {
                    b.resumeWith(arxj.g(n));
                }
                else {
                    b.resumeWith(this.j(k));
                }
                if (o == null || ((atry)o).M()) {
                    atvm.c(context, b2);
                }
                try {
                    final atjv a3 = atjv.a;
                }
                finally {
                    o = arxj.g((Throwable)o);
                }
                this.v(null, atjr.a(o));
            }
            finally {
                if (o == null || ((atry)o).M()) {
                    atvm.c(context, b2);
                }
            }
        }
        finally {
            Object g = null;
            try {
                final atjv a4 = atjv.a;
            }
            finally {
                final Throwable t;
                g = arxj.g(t);
            }
            final Throwable t2;
            this.v(t2, atjr.a(g));
        }
    }
    
    public final void v(final Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            aume.l(t, t2);
        }
        Throwable t3;
        if ((t3 = t) == null) {
            t3 = t2;
        }
        final StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        aume.k(this.o().getContext(), (Throwable)new atqa(sb.toString(), t3));
    }
}

import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atub extends atzp
{
    public int e;
    
    public atub(final int e) {
        super(0L, atzs.e);
        this.e = e;
    }
    
    public Object j(final Object o) {
        return o;
    }
    
    public abstract Object k();
    
    public Throwable n(final Object o) {
        atte atte;
        if (o instanceof atte) {
            atte = (atte)o;
        }
        else {
            atte = null;
        }
        if (atte != null) {
            return atte.b;
        }
        return null;
    }
    
    public abstract atov o();
    
    public void q(final Object o, final Throwable t) {
        throw null;
    }
    
    public final void run() {
        final boolean a = attt.a;
        try {
            final atyj atyj = (atyj)this.o();
            final atov b = atyj.b;
            final Object d = atyj.d;
            final atpa context = b.getContext();
            final Object b2 = atzf.b(context, d);
            Object o;
            if (b2 != atzf.a) {
                o = attl.c(b, context, b2);
            }
            else {
                o = null;
            }
            try {
                final atpa context2 = b.getContext();
                final Object k = this.k();
                final Throwable n = this.n(k);
                atut atut;
                if (n == null && aqvq.r(this.e)) {
                    atut = (atut)context2.get(atut.c);
                }
                else {
                    atut = null;
                }
                if (atut != null && !atut.tP()) {
                    final CancellationException n2 = atut.n();
                    this.q(k, n2);
                    Throwable a2 = n2;
                    if (attt.b) {
                        a2 = atzb.a((Throwable)n2, (atpi)b);
                    }
                    b.resumeWith(areq.H(a2));
                }
                else if (n != null) {
                    b.resumeWith(areq.H(n));
                }
                else {
                    b.resumeWith(this.j(k));
                }
                if (o == null || ((atvq)o).M()) {
                    atzf.c(context, b2);
                }
                try {
                    final atnn a3 = atnn.a;
                }
                finally {
                    o = areq.H((Throwable)o);
                }
                this.v(null, atnj.a(o));
            }
            finally {
                if (o == null || ((atvq)o).M()) {
                    atzf.c(context, b2);
                }
            }
        }
        finally {
            Object h = null;
            try {
                final atnn a4 = atnn.a;
            }
            finally {
                final Throwable t;
                h = areq.H(t);
            }
            final Throwable t2;
            this.v(t2, atnj.a(h));
        }
    }
    
    public final void v(Throwable t, final Throwable t2) {
        if (t == null && t2 == null) {
            return;
        }
        if (t != null && t2 != null) {
            aqvr.w(t, t2);
        }
        if (t == null) {
            t = t2;
        }
        final StringBuilder sb = new StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        asjv.f(this.o().getContext(), new atts(sb.toString(), t));
    }
}

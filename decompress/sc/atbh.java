import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class atbh implements ashy, asir
{
    final ashy a;
    final asjr b;
    asir c;
    private final int d;
    
    public atbh(final ashy a, final asjr b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != 0) {
            if (this.c == asjv.a) {
                atqx.j(t);
                return;
            }
            this.c = asjv.a;
            this.a.b(t);
        }
        else {
            try {
                final Object a = this.b.a((Object)t);
                if (a == null) {
                    final NullPointerException ex = new NullPointerException("The supplied value is null");
                    ex.initCause(t);
                    this.a.b(ex);
                    return;
                }
                this.a.tu(a);
                this.a.tx();
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                this.a.b(new asiz(new Throwable[] { t, t2 }));
            }
        }
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.d != 0) {
            if (asjv.g(this.c, asir)) {
                this.c = asir;
                this.a.d(this);
            }
            return;
        }
        if (asjv.g(this.c, asir)) {
            this.c = asir;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.d != 0) {
            this.c.dispose();
            this.c = asjv.a;
            return;
        }
        this.c.dispose();
    }
    
    @Override
    public final boolean tA() {
        if (this.d != 0) {
            return this.c.tA();
        }
        return this.c.tA();
    }
    
    @Override
    public final void tu(Object next) {
        if (this.d != 0) {
            if (this.c == asjv.a) {
                return;
            }
            try {
                final Iterator iterator = ((Iterable)this.b.a(next)).iterator();
                final ashy a = this.a;
                try {
                    while (iterator.hasNext()) {
                        try {
                            next = iterator.next();
                            askk.b(next, "The iterator returned a null value");
                            a.tu(next);
                            continue;
                        }
                        finally {
                            final Throwable t;
                            asgz.c(t);
                            this.c.dispose();
                            this.b(t);
                        }
                        break;
                    }
                    return;
                }
                finally {
                    final Throwable t2;
                    asgz.c(t2);
                    this.c.dispose();
                    this.b(t2);
                    return;
                }
            }
            finally {
                final Throwable t3;
                asgz.c(t3);
                this.c.dispose();
                this.b(t3);
                return;
            }
        }
        this.a.tu(next);
    }
    
    @Override
    public final void tx() {
        if (this.d == 0) {
            this.a.tx();
            return;
        }
        if (this.c == asjv.a) {
            return;
        }
        this.c = asjv.a;
        this.a.tx();
    }
}

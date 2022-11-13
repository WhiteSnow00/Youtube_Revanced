import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class asqd extends asqc
{
    private static final long serialVersionUID = -6022804456014692607L;
    final askl d;
    
    public asqd(final askl d, final Iterator iterator) {
        super(iterator);
        this.d = d;
    }
    
    public final void d() {
        final Iterator a = this.a;
        final askl d = this.d;
        while (!this.b) {
            try {
                final Object next = a.next();
                if (this.b) {
                    return;
                }
                if (next == null) {
                    d.b((Throwable)new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                d.d(next);
                if (this.b) {
                    return;
                }
                try {
                    if (!a.hasNext()) {
                        if (!this.b) {
                            d.tx();
                        }
                        return;
                    }
                    continue;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    d.b(t);
                }
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                d.b(t2);
            }
        }
    }
    
    public final void f(long n) {
        final Iterator a = this.a;
        final askl d = this.d;
        while (true) {
            long n2 = 0L;
            while (true) {
                if (n2 != n) {
                    if (this.b) {
                        return;
                    }
                    try {
                        final Object next = a.next();
                        if (this.b) {
                            return;
                        }
                        if (next == null) {
                            d.b((Throwable)new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        final boolean d2 = d.d(next);
                        if (this.b) {
                            return;
                        }
                        try {
                            if (!a.hasNext()) {
                                if (!this.b) {
                                    d.tx();
                                }
                                return;
                            }
                            if (d2) {
                                ++n2;
                                continue;
                            }
                            continue;
                        }
                        finally {
                            final Throwable t;
                            asgz.c(t);
                            d.b(t);
                            return;
                        }
                    }
                    finally {
                        asgz.c((Throwable)a);
                        d.b((Throwable)a);
                        return;
                    }
                }
                if (n2 == (n = this.get())) {
                    n = this.addAndGet(-n2);
                    if (n != 0L) {
                        break;
                    }
                }
            }
        }
    }
}

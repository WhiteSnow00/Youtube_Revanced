import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class asqe extends asqc
{
    private static final long serialVersionUID = -6022804456014692607L;
    final aukf d;
    
    public asqe(final aukf d, final Iterator iterator) {
        super(iterator);
        this.d = d;
    }
    
    public final void d() {
        final Iterator a = this.a;
        final aukf d = this.d;
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
                d.tu(next);
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
                asgz.c((Throwable)a);
                d.b((Throwable)a);
            }
        }
    }
    
    public final void f(long n) {
        final Iterator a = this.a;
        final aukf d = this.d;
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
                        d.tu(next);
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
                            ++n2;
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

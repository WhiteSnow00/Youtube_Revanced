import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspo extends aspn
{
    private static final long serialVersionUID = -6022804456014692607L;
    final asjw d;
    
    public aspo(final asjw d, final Iterator iterator) {
        super(iterator);
        this.d = d;
    }
    
    public final void d() {
        final Iterator a = this.a;
        final asjw d = this.d;
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
                            d.tu();
                        }
                        return;
                    }
                    continue;
                }
                finally {
                    final Throwable t;
                    asey.d(t);
                    d.b(t);
                }
            }
            finally {
                asey.d((Throwable)a);
                d.b((Throwable)a);
            }
        }
    }
    
    public final void f(long n) {
        final Iterator a = this.a;
        final asjw d = this.d;
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
                                    d.tu();
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
                            asey.d(t);
                            d.b(t);
                            return;
                        }
                    }
                    finally {
                        final Throwable t2;
                        asey.d(t2);
                        d.b(t2);
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

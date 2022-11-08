import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspp extends aspn
{
    private static final long serialVersionUID = -6022804456014692607L;
    final aujp d;
    
    public aspp(final aujp d, final Iterator iterator) {
        super(iterator);
        this.d = d;
    }
    
    public final void d() {
        final Iterator a = this.a;
        final aujp d = this.d;
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
                d.tr(next);
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
                final Throwable t2;
                asey.d(t2);
                d.b(t2);
            }
        }
    }
    
    public final void f(long n) {
        final Iterator a = this.a;
        final aujp d = this.d;
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
                        d.tr(next);
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
                            ++n2;
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

import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atak extends asht
{
    final Iterable a;
    
    public atak(final Iterable a) {
        this.a = a;
    }
    
    public final void f(final ashy ashy) {
        try {
            final Iterator iterator = this.a.iterator();
            try {
                if (!iterator.hasNext()) {
                    asjw.d(ashy);
                    return;
                }
                final ataj ataj = new ataj(ashy, (Iterator)iterator);
                ashy.d((asir)ataj);
                if (!ataj.d) {
                    while (!ataj.c) {
                        try {
                            final Object next = ataj.b.next();
                            askk.b(next, "The iterator returned a null value");
                            ataj.a.tu(next);
                            if (!ataj.c) {
                                try {
                                    if (ataj.b.hasNext()) {
                                        continue;
                                    }
                                    if (!ataj.c) {
                                        ataj.a.tx();
                                        return;
                                    }
                                    break;
                                }
                                finally {
                                    return;
                                }
                            }
                        }
                        finally {
                            asgz.c((Throwable)ashy);
                            ataj.a.b((Throwable)ashy);
                        }
                        break;
                    }
                }
            }
            finally {
                final Throwable t;
                asgz.c(t);
                asjw.g(t, ashy);
            }
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            asjw.g(t2, ashy);
        }
    }
}

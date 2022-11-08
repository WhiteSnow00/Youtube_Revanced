import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aszs extends ashe
{
    final Iterable a;
    
    public aszs(final Iterable a) {
        this.a = a;
    }
    
    public final void f(final ashj ashj) {
        try {
            final Iterator iterator = this.a.iterator();
            try {
                if (!iterator.hasNext()) {
                    asjh.d(ashj);
                    return;
                }
                final aszr aszr = new aszr(ashj, (Iterator)iterator);
                ashj.d((asic)aszr);
                if (!aszr.d) {
                    while (!aszr.c) {
                        try {
                            final Object next = aszr.b.next();
                            asjv.b(next, "The iterator returned a null value");
                            aszr.a.tr(next);
                            if (!aszr.c) {
                                try {
                                    if (aszr.b.hasNext()) {
                                        continue;
                                    }
                                    if (!aszr.c) {
                                        aszr.a.tu();
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
                            asey.d((Throwable)ashj);
                            aszr.a.b((Throwable)ashj);
                        }
                        break;
                    }
                }
            }
            finally {
                final Throwable t;
                asey.d(t);
                asjh.g(t, ashj);
            }
        }
        finally {
            final Throwable t2;
            asey.d(t2);
            asjh.g(t2, ashj);
        }
    }
}

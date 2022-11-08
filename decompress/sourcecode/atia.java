// 
// Decompiled by Procyon v0.6.0
// 

public final class atia implements ashj, asic
{
    final ashj a;
    asic b;
    boolean c;
    athj d;
    volatile boolean e;
    
    public atia(final ashj a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.e) {
            aulo.r(t);
            return;
        }
        synchronized (this) {
            final boolean e = this.e;
            boolean b = true;
            if (!e) {
                if (this.c) {
                    this.e = true;
                    athj d;
                    if ((d = this.d) == null) {
                        d = new athj();
                        this.d = d;
                    }
                    d.c(atht.b(t));
                    return;
                }
                this.e = true;
                this.c = true;
                b = false;
            }
            monitorexit(this);
            if (b) {
                aulo.r(t);
                return;
            }
            this.a.b(t);
        }
    }
    
    public final void d(final asic b) {
        if (asjg.g(this.b, b)) {
            this.b = b;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        this.b.dispose();
    }
    
    public final void tr(Object b) {
        if (this.e) {
            return;
        }
        if (b == null) {
            this.b.dispose();
            this.b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        monitorenter(this);
        try {
            if (this.e) {
                monitorexit(this);
                return;
            }
            if (this.c) {
                athj d;
                if ((d = this.d) == null) {
                    d = new athj();
                    this.d = d;
                }
                final atht a = atht.a;
                d.a(b);
                monitorexit(this);
                return;
            }
            this.c = true;
            monitorexit(this);
            this.a.tr(b);
            while (true) {
                synchronized (this) {
                    final athj d2 = this.d;
                    if (d2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    monitorexit(this);
                    final ashj a2 = this.a;
                    int i;
                    Object o;
                    for (b = d2.b; b != null; b = ((Object[])b)[4]) {
                        for (i = 0; i < 4; ++i) {
                            o = ((Object[])b)[i];
                            if (o == null) {
                                break;
                            }
                            if (atht.f(o, a2)) {
                                return;
                            }
                        }
                    }
                    continue;
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void tu() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                athj d;
                if ((d = this.d) == null) {
                    d = new athj();
                    this.d = d;
                }
                d.a(atht.a);
                return;
            }
            this.e = true;
            this.c = true;
            monitorexit(this);
            this.a.tu();
        }
    }
    
    public final boolean tx() {
        return this.b.tx();
    }
}

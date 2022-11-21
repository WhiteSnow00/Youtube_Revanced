import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ated implements asku, asln
{
    final asku a;
    final asmn b;
    asln c;
    private final int d;
    
    public ated(final asku a, final asmn b, final int d) {
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.d != 0) {
            if (this.c == asmr.a) {
                aqvq.w(t);
                return;
            }
            this.c = asmr.a;
            this.a.b(t);
        }
        else {
            try {
                final Object a = this.b.a(t);
                if (a == null) {
                    final NullPointerException ex = new NullPointerException("The supplied value is null");
                    ex.initCause(t);
                    this.a.b(ex);
                    return;
                }
                this.a.tt(a);
                this.a.tw();
            }
            finally {
                final Throwable t2;
                asjv.a(t2);
                this.a.b(new aslv(new Throwable[] { t, t2 }));
            }
        }
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.d != 0) {
            if (asmr.g(this.c, asln)) {
                this.c = asln;
                this.a.d(this);
            }
            return;
        }
        if (asmr.g(this.c, asln)) {
            this.c = asln;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.d != 0) {
            this.c.dispose();
            this.c = asmr.a;
            return;
        }
        this.c.dispose();
    }
    
    @Override
    public final void tt(Object next) {
        if (this.d != 0) {
            if (this.c == asmr.a) {
                return;
            }
            try {
                final Iterator iterator = ((Iterable)this.b.a(next)).iterator();
                final asku a = this.a;
                try {
                    while (iterator.hasNext()) {
                        try {
                            next = iterator.next();
                            asng.b(next, "The iterator returned a null value");
                            a.tt(next);
                            continue;
                        }
                        finally {
                            final Throwable t;
                            asjv.a(t);
                            this.c.dispose();
                            this.b(t);
                        }
                        break;
                    }
                    return;
                }
                finally {
                    final Throwable t2;
                    asjv.a(t2);
                    this.c.dispose();
                    this.b(t2);
                    return;
                }
            }
            finally {
                final Throwable t3;
                asjv.a(t3);
                this.c.dispose();
                this.b(t3);
                return;
            }
        }
        this.a.tt(next);
    }
    
    @Override
    public final void tw() {
        if (this.d == 0) {
            this.a.tw();
            return;
        }
        if (this.c == asmr.a) {
            return;
        }
        this.c = asmr.a;
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        if (this.d != 0) {
            return this.c.tz();
        }
        return this.c.tz();
    }
}

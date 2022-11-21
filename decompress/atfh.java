// 
// Decompiled by Procyon v0.6.0
// 

final class atfh implements asku, asln
{
    final Object a;
    asln b;
    Object c;
    boolean d;
    final Object e;
    private final int f;
    
    public atfh(final asku e, final asme a, final Object c, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    public atfh(final aslb e, final Object a, final int f) {
        this.f = f;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.f != 0) {
            if (this.d) {
                aqvq.w(t);
                return;
            }
            this.d = true;
            ((asku)this.e).b(t);
        }
        else {
            if (this.d) {
                aqvq.w(t);
                return;
            }
            this.d = true;
            ((aslb)this.e).b(t);
        }
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.f != 0) {
            if (asmr.g(this.b, asln)) {
                this.b = asln;
                ((asku)this.e).d(this);
                ((asku)this.e).tt(this.c);
            }
            return;
        }
        if (asmr.g(this.b, asln)) {
            this.b = asln;
            ((aslb)this.e).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        if (this.f != 0) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }
    
    @Override
    public final void tt(Object a) {
        if (this.f != 0) {
            if (this.d) {
                return;
            }
            final Object c = this.c;
            try {
                a = ((asme)this.a).a(c, a);
                asng.b(a, "The accumulator returned a null value");
                this.c = a;
                ((asku)this.e).tt(a);
                return;
            }
            finally {
                final Throwable t;
                asjv.a(t);
                this.b.dispose();
                this.b(t);
                return;
            }
        }
        if (this.d) {
            return;
        }
        if (this.c != null) {
            this.d = true;
            this.b.dispose();
            ((aslb)this.e).b(new IllegalArgumentException("Sequence contains more than one element!"));
            return;
        }
        this.c = a;
    }
    
    @Override
    public final void tw() {
        if (this.f != 0) {
            if (this.d) {
                return;
            }
            this.d = true;
            ((asku)this.e).tw();
        }
        else {
            if (this.d) {
                return;
            }
            this.d = true;
            final Object c = this.c;
            this.c = null;
            Object a;
            if ((a = c) == null) {
                a = this.a;
            }
            ((aslb)this.e).tr(a);
        }
    }
    
    @Override
    public final boolean tz() {
        if (this.f != 0) {
            return this.b.tz();
        }
        return this.b.tz();
    }
}

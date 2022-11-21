// 
// Decompiled by Procyon v0.6.0
// 

final class atbb implements asku, asln
{
    final Object a;
    asln b;
    boolean c;
    final Object d;
    final Object e;
    private final int f;
    
    public atbb(final asku d, final asmi a, final asmc e, final int f) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    public atbb(final asku d, final Object a, final asmd e, final int f) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public atbb(final aslb d, final Object a, final asmd e, final int f) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (this.c) {
                    aqvq.w(t);
                    return;
                }
                this.c = true;
                ((asku)this.d).b(t);
            }
            else {
                if (this.c) {
                    aqvq.w(t);
                    return;
                }
                this.c = true;
                ((asku)this.d).b(t);
            }
        }
        else {
            if (this.c) {
                aqvq.w(t);
                return;
            }
            this.c = true;
            ((aslb)this.d).b(t);
        }
    }
    
    @Override
    public final void d(final asln b) {
        final int f = this.f;
        if (f == 0) {
            if (asmr.g(this.b, b)) {
                this.b = b;
                ((aslb)this.d).d(this);
            }
            return;
        }
        if (f != 1) {
            if (asmr.g(this.b, b)) {
                this.b = b;
                ((asku)this.d).d(this);
            }
            return;
        }
        if (asmr.g(this.b, b)) {
            this.b = b;
            ((asku)this.d).d(this);
        }
    }
    
    @Override
    public final void dispose() {
        final int f = this.f;
        if (f == 0) {
            this.b.dispose();
            return;
        }
        if (f != 1) {
            this.b.dispose();
            return;
        }
        this.b.dispose();
    }
    
    @Override
    public final void tt(final Object o) {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (this.c) {
                    return;
                }
                try {
                    ((asmi)this.a).a(o);
                    ((asku)this.d).tt(o);
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
            if (this.c) {
                return;
            }
            try {
                ((asmd)this.e).a(this.a, o);
                return;
            }
            finally {
                this.b.dispose();
                final Throwable t2;
                this.b(t2);
                return;
            }
        }
        if (this.c) {
            return;
        }
        try {
            ((asmd)this.e).a(this.a, o);
        }
        finally {
            this.b.dispose();
            final Throwable t3;
            this.b(t3);
        }
    }
    
    @Override
    public final void tw() {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (this.c) {
                    return;
                }
                try {
                    ((asmc)this.e).a();
                    this.c = true;
                    ((asku)this.d).tw();
                    return;
                }
                finally {
                    final Throwable t;
                    asjv.a(t);
                    this.b(t);
                    return;
                }
            }
            if (this.c) {
                return;
            }
            this.c = true;
            ((asku)this.d).tt(this.a);
            ((asku)this.d).tw();
        }
        else {
            if (this.c) {
                return;
            }
            this.c = true;
            ((aslb)this.d).tr(this.a);
        }
    }
    
    @Override
    public final boolean tz() {
        final int f = this.f;
        if (f == 0) {
            return this.b.tz();
        }
        if (f != 1) {
            return this.b.tz();
        }
        return this.b.tz();
    }
}

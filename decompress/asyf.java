// 
// Decompiled by Procyon v0.6.0
// 

final class asyf implements ashy, asir
{
    final Object a;
    asir b;
    boolean c;
    final Object d;
    final Object e;
    private final int f;
    
    public asyf(final ashy d, final asjm a, final asjg e, final int f) {
        this.f = f;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    public asyf(final ashy d, final Object a, final asjh e, final int f) {
        this.f = f;
        this.d = d;
        this.e = e;
        this.a = a;
    }
    
    public asyf(final asif d, final Object a, final asjh e, final int f) {
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
                    atqx.j(t);
                    return;
                }
                this.c = true;
                ((ashy)this.d).b(t);
            }
            else {
                if (this.c) {
                    atqx.j(t);
                    return;
                }
                this.c = true;
                ((ashy)this.d).b(t);
            }
        }
        else {
            if (this.c) {
                atqx.j(t);
                return;
            }
            this.c = true;
            ((asif)this.d).b(t);
        }
    }
    
    @Override
    public final void d(final asir b) {
        final int f = this.f;
        if (f == 0) {
            if (asjv.g(this.b, b)) {
                this.b = b;
                ((asif)this.d).d(this);
            }
            return;
        }
        if (f != 1) {
            if (asjv.g(this.b, b)) {
                this.b = b;
                ((ashy)this.d).d(this);
            }
            return;
        }
        if (asjv.g(this.b, b)) {
            this.b = b;
            ((ashy)this.d).d(this);
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
    public final boolean tA() {
        final int f = this.f;
        if (f == 0) {
            return this.b.tA();
        }
        if (f != 1) {
            return this.b.tA();
        }
        return this.b.tA();
    }
    
    @Override
    public final void tu(final Object o) {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (this.c) {
                    return;
                }
                try {
                    ((asjm)this.a).a(o);
                    ((ashy)this.d).tu(o);
                    return;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    this.b.dispose();
                    this.b(t);
                    return;
                }
            }
            if (this.c) {
                return;
            }
            try {
                ((asjh)this.e).a(this.a, o);
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
            ((asjh)this.e).a(this.a, o);
        }
        finally {
            this.b.dispose();
            final Throwable t3;
            this.b(t3);
        }
    }
    
    @Override
    public final void tx() {
        final int f = this.f;
        if (f != 0) {
            if (f != 1) {
                if (this.c) {
                    return;
                }
                try {
                    ((asjg)this.e).a();
                    this.c = true;
                    ((ashy)this.d).tx();
                    return;
                }
                finally {
                    final Throwable t;
                    asgz.c(t);
                    this.b(t);
                    return;
                }
            }
            if (this.c) {
                return;
            }
            this.c = true;
            ((ashy)this.d).tu(this.a);
            ((ashy)this.d).tx();
        }
        else {
            if (this.c) {
                return;
            }
            this.c = true;
            ((asif)this.d).ts(this.a);
        }
    }
}

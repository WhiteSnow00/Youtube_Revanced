// 
// Decompiled by Procyon v0.6.0
// 

final class asnc implements ashd
{
    final Object a;
    private final int b;
    private final Object c;
    
    public asnc(final asmo a, final ashd c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public asnc(final asnd a, final asif c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            try {
                if (((asmo)this.a).b.a((Object)t)) {
                    ((ashd)this.c).tx();
                    return;
                }
                ((ashd)this.c).b(t);
                return;
            }
            finally {
                final Throwable t2;
                asgz.c(t2);
                ((ashd)this.c).b(new asiz(new Throwable[] { t, t2 }));
                return;
            }
        }
        ((asif)this.c).b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (this.b != 0) {
            ((ashd)this.c).d(asir);
            return;
        }
        ((asif)this.c).d(asir);
    }
    
    @Override
    public final void tx() {
        if (this.b != 0) {
            ((ashd)this.c).tx();
            return;
        }
        final asnd asnd = (asnd)this.a;
        final Object c;
        Label_0060: {
            if (asnd.b != null) {
                try {
                    jcd.c();
                    break Label_0060;
                }
                finally {
                    asgz.c((Throwable)c);
                    ((asif)this.c).b((Throwable)c);
                    return;
                }
            }
            c = asnd.c;
        }
        if (c == null) {
            ((asif)this.c).b(new NullPointerException("The value supplied is null"));
            return;
        }
        ((asif)this.c).ts(c);
    }
}

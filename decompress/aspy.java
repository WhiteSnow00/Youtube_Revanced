// 
// Decompiled by Procyon v0.6.0
// 

final class aspy implements asjz
{
    final Object a;
    private final int b;
    private final Object c;
    
    public aspy(final aspk a, final asjz c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public aspy(final aspz a, final aslb c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b != 0) {
            try {
                if (((aspk)this.a).b.a(t)) {
                    ((asjz)this.c).tw();
                    return;
                }
                ((asjz)this.c).b(t);
                return;
            }
            finally {
                final Throwable t2;
                asjv.a(t2);
                ((asjz)this.c).b(new aslv(new Throwable[] { t, t2 }));
                return;
            }
        }
        ((aslb)this.c).b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (this.b != 0) {
            ((asjz)this.c).d(asln);
            return;
        }
        ((aslb)this.c).d(asln);
    }
    
    @Override
    public final void tw() {
        if (this.b != 0) {
            ((asjz)this.c).tw();
            return;
        }
        final aspz aspz = (aspz)this.a;
        final Object c;
        Label_0060: {
            if (aspz.b != null) {
                try {
                    jcn.c();
                    break Label_0060;
                }
                finally {
                    asjv.a((Throwable)c);
                    ((aslb)this.c).b((Throwable)c);
                    return;
                }
            }
            c = aspz.c;
        }
        if (c == null) {
            ((aslb)this.c).b(new NullPointerException("The value supplied is null"));
            return;
        }
        ((aslb)this.c).tr(c);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

final class asmn implements asgo
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;
    
    public asmn(final aslz a, final asgo c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public asmn(final asmo a, final ashq c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        if (this.b != 0) {
            try {
                if (((aslz)this.a).b.a((Object)t)) {
                    ((asgo)this.c).tu();
                    return;
                }
                ((asgo)this.c).b(t);
                return;
            }
            finally {
                final Throwable t2;
                asey.d(t2);
                ((asgo)this.c).b((Throwable)new asik(new Throwable[] { t, t2 }));
                return;
            }
        }
        ((ashq)this.c).b(t);
    }
    
    public final void d(final asic asic) {
        if (this.b != 0) {
            ((asgo)this.c).d(asic);
            return;
        }
        ((ashq)this.c).d(asic);
    }
    
    public final void tu() {
        if (this.b != 0) {
            ((asgo)this.c).tu();
            return;
        }
        final asmo asmo = (asmo)this.a;
        final Object c;
        Label_0060: {
            if (asmo.b != null) {
                try {
                    jbe.c();
                    break Label_0060;
                }
                finally {
                    asey.d((Throwable)c);
                    ((ashq)this.c).b((Throwable)c);
                    return;
                }
            }
            c = asmo.c;
        }
        if (c == null) {
            ((ashq)this.c).b((Throwable)new NullPointerException("The value supplied is null"));
            return;
        }
        ((ashq)this.c).tp(c);
    }
}

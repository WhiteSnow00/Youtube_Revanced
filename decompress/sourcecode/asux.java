// 
// Decompiled by Procyon v0.6.0
// 

final class asux implements asgz, asic
{
    asic a;
    final Object b;
    private final /* synthetic */ int c;
    
    public asux(final asgo b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public asux(final asgz b, final int c) {
        this.c = c;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        if (this.c != 0) {
            this.a = (asic)asjg.a;
            ((asgz)this.b).b(t);
            return;
        }
        this.a = (asic)asjg.a;
        ((asgo)this.b).b(t);
    }
    
    public final void d(final asic asic) {
        if (this.c != 0) {
            if (asjg.g(this.a, asic)) {
                this.a = asic;
                ((asgz)this.b).d((asic)this);
            }
            return;
        }
        if (asjg.g(this.a, asic)) {
            this.a = asic;
            ((asgo)this.b).d((asic)this);
        }
    }
    
    public final void dispose() {
        if (this.c != 0) {
            this.a.dispose();
            this.a = (asic)asjg.a;
            return;
        }
        this.a.dispose();
        this.a = (asic)asjg.a;
    }
    
    public final void tp(final Object o) {
        if (this.c != 0) {
            this.a = (asic)asjg.a;
            ((asgz)this.b).tu();
            return;
        }
        this.a = (asic)asjg.a;
        ((asgo)this.b).tu();
    }
    
    public final void tu() {
        if (this.c != 0) {
            this.a = (asic)asjg.a;
            ((asgz)this.b).tu();
            return;
        }
        this.a = (asic)asjg.a;
        ((asgo)this.b).tu();
    }
    
    public final boolean tx() {
        if (this.c != 0) {
            return this.a.tx();
        }
        return this.a.tx();
    }
}

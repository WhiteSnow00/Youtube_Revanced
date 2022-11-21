import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atem implements asku
{
    final asku a;
    final Object b;
    private final int c;
    
    public atem(final asku a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public atem(final asku b, final vhj a, final int c) {
        this.c = c;
        this.b = b;
        this.a = (asku)a;
    }
    
    public atem(final atmp a, final AtomicReference b, final int c) {
        this.c = c;
        this.a = (asku)a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final int c = this.c;
        if (c == 0) {
            ((atmp)this.a).b(t);
            return;
        }
        if (c != 1) {
            this.a.b(t);
            return;
        }
        ((asku)this.b).b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        final int c = this.c;
        if (c == 0) {
            asmr.f((AtomicReference)this.b, asln);
            return;
        }
        if (c != 1) {
            asmr.h((AtomicReference)this.b, asln);
            return;
        }
        ((asku)this.b).d((asln)new vhi(asln, (vhj)this.a));
    }
    
    @Override
    public final void tt(final Object o) {
        final int c = this.c;
        if (c == 0) {
            ((atmp)this.a).tt(o);
            return;
        }
        if (c != 1) {
            this.a.tt(o);
            return;
        }
        ((asku)this.b).tt(o);
    }
    
    @Override
    public final void tw() {
        final int c = this.c;
        if (c == 0) {
            ((atmp)this.a).tw();
            return;
        }
        if (c != 1) {
            this.a.tw();
            return;
        }
        ((asku)this.b).tw();
    }
}

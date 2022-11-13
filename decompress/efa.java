import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class efa extends dwr
{
    @dyi(a = 13)
    Integer a;
    @dyi(a = 13)
    AtomicReference b;
    @dyi(a = 13)
    AtomicReference c;
    
    public efa() {
    }
    
    @Override
    public final void a(final argj argj) {
        final Object b = argj.b;
        if (argj.a != 0) {
            return;
        }
        final elx elx = new elx();
        elx.a = this.a;
        efg.k(elx);
        this.a = (Integer)elx.a;
    }
}

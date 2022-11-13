import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adlr implements admc
{
    public final int a;
    private final CopyOnWriteArrayList b;
    
    public adlr(final int a) {
        this.b = new CopyOnWriteArrayList();
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final void b(final admb admb) {
        synchronized (this) {
            if (this.b.isEmpty()) {
                this.e();
            }
            this.b.add(admb);
        }
    }
    
    public final void c() {
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((admb)iterator.next()).tl(this);
        }
    }
    
    @Override
    public final void d(final admb admb) {
        synchronized (this) {
            if (this.b.isEmpty()) {
                return;
            }
            this.b.remove(admb);
            if (this.b.isEmpty()) {
                this.f();
            }
        }
    }
    
    protected abstract void e();
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof admc && this.a == ((admc)o).a();
    }
    
    protected abstract void f();
    
    @Override
    public int hashCode() {
        return this.a;
    }
}

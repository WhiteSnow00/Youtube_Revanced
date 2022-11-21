import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ason extends AtomicReference implements asln
{
    private static final long serialVersionUID = -2467358622224974244L;
    final asjz a;
    
    public ason(final asjz a) {
        this.a = a;
    }
    
    public final void a() {
        if (this.get() != asmr.a) {
            final asln asln = this.getAndSet(asmr.a);
            if (asln != asmr.a) {
                try {
                    this.a.tw();
                    if (asln != null) {
                        asln.dispose();
                    }
                }
                finally {
                    if (asln != null) {
                        asln.dispose();
                    }
                }
            }
        }
    }
    
    public final void b(final Throwable t) {
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
        }
        if (this.get() != asmr.a) {
            final asln asln = this.getAndSet(asmr.a);
            if (asln != asmr.a) {
                try {
                    this.a.b(t2);
                    if (asln != null) {
                        asln.dispose();
                    }
                    return;
                }
                finally {
                    if (asln != null) {
                        asln.dispose();
                    }
                }
            }
        }
        aqvq.w(t);
    }
    
    public final void c(final asmh asmh) {
        asmr.d(this, new asmp(asmh));
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final String toString() {
        return String.format("%s{%s}", this.getClass().getSimpleName(), super.toString());
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}

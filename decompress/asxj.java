import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asxj extends AtomicReference implements asln
{
    private static final long serialVersionUID = -2467358622224974244L;
    public final askk a;
    
    public asxj(final askk a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
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
    
    public final void b(final Object o) {
        if (this.get() != asmr.a) {
            final asln asln = this.getAndSet(asmr.a);
            if (asln != asmr.a) {
                Label_0057: {
                    if (o != null) {
                        break Label_0057;
                    }
                    try {
                        this.a.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                        while (true) {
                            if (asln != null) {
                                asln.dispose();
                                return;
                            }
                            return;
                            this.a.tr(o);
                            continue;
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

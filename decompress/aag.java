// 
// Decompiled by Procyon v0.6.0
// 

public final class aag implements aae
{
    final acd a;
    
    public aag(final acd a) {
        this.a = a;
    }
    
    public final void a(final Throwable t) {
        this.a.d(t);
    }
    
    public final void b(final Object o) {
        try {
            this.a.c(o);
        }
        finally {
            final Throwable t;
            this.a.d(t);
        }
    }
}

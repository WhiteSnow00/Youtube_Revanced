// 
// Decompiled by Procyon v0.6.0
// 

public final class atep extends asie
{
    final asig a;
    
    public atep(final asig a) {
        this.a = a;
    }
    
    protected final void af(final asif asif) {
        final ateo ateo = new ateo(asif);
        asif.d((asir)ateo);
        try {
            this.a.a(ateo);
        }
        finally {
            final Throwable t;
            asgz.c(t);
            ateo.a(t);
        }
    }
}

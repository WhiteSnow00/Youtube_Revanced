// 
// Decompiled by Procyon v0.6.0
// 

public final class atdx extends ashp
{
    final ashr a;
    
    public atdx(final ashr a) {
        this.a = a;
    }
    
    protected final void ae(final ashq ashq) {
        final atdw atdw = new atdw(ashq);
        ashq.d((asic)atdw);
        try {
            this.a.a(atdw);
        }
        finally {
            final Throwable t;
            asey.d(t);
            atdw.a(t);
        }
    }
}

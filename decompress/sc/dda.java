// 
// Decompiled by Procyon v0.6.0
// 

public final class dda implements dnp
{
    private final acc a;
    
    public dda(final acc a) {
        this.a = a;
    }
    
    public final boolean a(final dfu dfu, final Object o, final dod dod, final boolean b) {
        final acc a = this.a;
        Object o2 = dfu;
        if (dfu == null) {
            o2 = new RuntimeException("Unknown error");
        }
        a.d((Throwable)o2);
        return true;
    }
    
    public final boolean lr(final Object o, Object o2, final int n) {
        try {
            final acc a = this.a;
            o2 = new cyb(o);
            a.c(o2);
        }
        finally {
            final Throwable t;
            this.a.d(t);
        }
        return true;
    }
}

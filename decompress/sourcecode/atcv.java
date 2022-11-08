import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atcv extends ashp implements asjy
{
    final ashh a;
    
    public atcv(final ashh a) {
        this.a = a;
    }
    
    public final ashe a() {
        final atct atct = new atct(this.a);
        final asjc l = aulo.l;
        return (ashe)atct;
    }
    
    public final void ae(final ashq ashq) {
        try {
            this.a.aJ((ashj)new atcu(ashq, (Collection)asrs.a(), 0));
        }
        finally {
            final Throwable t;
            asey.d(t);
            asjh.h(t, ashq);
        }
    }
}

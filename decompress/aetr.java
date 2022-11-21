// 
// Decompiled by Procyon v0.6.0
// 

public final class aetr implements aevl
{
    public final Object a;
    private final int b;
    
    public aetr(final aets a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aetr(final aeuq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aetr(final aevk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aetr(final aevl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        final int b = this.b;
        if (b == 0) {
            ((aets)this.a).q();
            return;
        }
        if (b == 1) {
            final aets aets = (aets)this.a;
            aets.a = null;
            aets.b = false;
            aewp.n(aets.c);
            aets.c = null;
            return;
        }
        if (b == 2) {
            final aets aets2 = (aets)this.a;
            aets2.q();
            aets2.n();
            return;
        }
        if (b == 3) {
            ((aevl)this.a).close();
            aewp.k();
            return;
        }
        if (b == 4) {
            final aets aets3 = (aets)this.a;
            aets3.q();
            aets3.n();
            aets3.a = null;
            return;
        }
        if (b != 5) {
            aewp.n((aevk)this.a);
            return;
        }
        qem.s((Runnable)new aevy(this, 2, null), 10000L);
    }
}

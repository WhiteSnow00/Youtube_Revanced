// 
// Decompiled by Procyon v0.6.0
// 

final class abt
{
    static final abt a;
    static final abt b;
    final boolean c;
    final Throwable d;
    
    static {
        if (acc.a) {
            b = null;
            a = null;
            return;
        }
        b = new abt(false, null);
        a = new abt(true, null);
    }
    
    public abt(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}

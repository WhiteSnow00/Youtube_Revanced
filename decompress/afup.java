// 
// Decompiled by Procyon v0.6.0
// 

final class afup
{
    static final afup a;
    static final afup b;
    final boolean c;
    final Throwable d;
    
    static {
        if (afvd.g) {
            b = null;
            a = null;
            return;
        }
        b = new afup(false, null);
        a = new afup(true, null);
    }
    
    public afup(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}

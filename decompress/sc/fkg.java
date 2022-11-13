// 
// Decompiled by Procyon v0.6.0
// 

public final class fkg implements asjm
{
    public final fki a;
    public final aknt b;
    public final long c;
    
    public fkg(final fki a, final aknt b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Object o) {
        final fki a = this.a;
        final aknt b = this.b;
        final long c = this.c;
        final int intValue = (int)o;
        if (intValue != 3 && intValue != 4 && intValue != 5 && intValue != 6) {
            return;
        }
        a.b.e(b, c);
    }
}

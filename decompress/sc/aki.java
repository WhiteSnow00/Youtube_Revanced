// 
// Decompiled by Procyon v0.6.0
// 

abstract class aki implements akf
{
    private final akh a;
    
    public aki(final akh a) {
        this.a = a;
    }
    
    public final boolean a(final CharSequence charSequence, int a) {
        if (charSequence == null || a < 0 || charSequence.length() - a < 0) {
            throw new IllegalArgumentException();
        }
        final akh a2 = this.a;
        if (a2 != null) {
            a = a2.a(charSequence, a);
            return a == 0 || (a != 1 && this.b());
        }
        return this.b();
    }
    
    protected abstract boolean b();
}

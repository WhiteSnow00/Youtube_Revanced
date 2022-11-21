// 
// Decompiled by Procyon v0.6.0
// 

public final class aehy
{
    public int a;
    public boolean b;
    
    public aehy() {
        this.a = 2132083792;
        this.b = true;
    }
    
    public aehy(final aehz aehz) {
        this.a = 2132083792;
        this.b = true;
        this.a = aehz.b;
        final Object d = aehz.d;
        this.b = aehz.c;
    }
    
    public aehy(final byte[] array) {
        this.a = 5;
        this.b = true;
    }
    
    public aehy(final byte[] array, final byte[] array2) {
        this.b = false;
        this.a = 0;
    }
    
    public final aehz a() {
        return new aehz(this.a, this.b);
    }
    
    public final void b() {
        this.b = true;
    }
}

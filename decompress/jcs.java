import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcs implements jcu, jct
{
    public final ativ a;
    public final msr b;
    private final tmx c;
    
    public jcs(final msr b, final tmx c, final byte[] array, final byte[] array2) {
        this.a = ativ.aE();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final ashi a() {
        return (ashi)this.a;
    }
    
    public final asie b() {
        return this.c.d().L((asjr)jdi.b).aj();
    }
    
    @Override
    public final void c(final String s) {
        this.b.Q((Callable)new daa(this, this.c.b((aezf)iyl.d), s, 15));
    }
}

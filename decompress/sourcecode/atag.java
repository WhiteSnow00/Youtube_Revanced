// 
// Decompiled by Procyon v0.6.0
// 

public final class atag extends ashe implements askc
{
    private final Object a;
    
    public atag(final Object a) {
        this.a = a;
    }
    
    public final Object call() {
        return this.a;
    }
    
    protected final void f(final ashj ashj) {
        final atbp atbp = new atbp(ashj, this.a);
        ashj.d((asic)atbp);
        atbp.run();
    }
}

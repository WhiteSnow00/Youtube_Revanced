// 
// Decompiled by Procyon v0.6.0
// 

public final class atun implements atpz
{
    private final atli a;
    
    public atun(final atli a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final atli c() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final atli a = this.a;
        final StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}

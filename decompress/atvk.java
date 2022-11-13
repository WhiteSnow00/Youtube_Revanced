// 
// Decompiled by Procyon v0.6.0
// 

public final class atvk implements atqu
{
    private final atmd a;
    
    public atvk(final atmd a) {
        a.getClass();
        this.a = a;
    }
    
    public final atmd c() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final atmd a = this.a;
        final StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyh implements attr
{
    private final atpa a;
    
    public atyh(final atpa a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final atpa c() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final atpa a = this.a;
        final StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}

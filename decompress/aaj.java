// 
// Decompiled by Procyon v0.6.0
// 

public final class aaj extends aak
{
    public static final aak a;
    private final Object b;
    
    static {
        a = new aaj(null);
    }
    
    public aaj(final Object b) {
        this.b = b;
    }
    
    @Override
    public final Object get() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=SUCCESS, result=[");
        sb.append(this.b);
        sb.append("]]");
        return sb.toString();
    }
}

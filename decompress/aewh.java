// 
// Decompiled by Procyon v0.6.0
// 

public final class aewh
{
    public final aevk a;
    
    public aewh(final aevk a) {
        this.a = a;
    }
    
    public static aewh b() {
        return new aewh(aewp.c());
    }
    
    public final aevl a() {
        final aevk a = aewp.a();
        aewp.n(this.a);
        return new aetr(a, 6);
    }
    
    @Override
    public final String toString() {
        final aevk a = this.a;
        if (a == null) {
            return "null ref";
        }
        return a.toString();
    }
}

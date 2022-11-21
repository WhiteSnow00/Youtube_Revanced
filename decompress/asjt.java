// 
// Decompiled by Procyon v0.6.0
// 

public final class asjt
{
    public static final asjv a;
    
    static {
        a = new asjv();
    }
    
    protected asjt(final asjv asjv) {
        if (asjv == asjt.a) {
            return;
        }
        throw new AssertionError((Object)"nope");
    }
}

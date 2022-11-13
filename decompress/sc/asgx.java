// 
// Decompiled by Procyon v0.6.0
// 

public final class asgx
{
    public static final asgz a;
    
    static {
        a = new asgz();
    }
    
    protected asgx(final asgz asgz) {
        if (asgz == asgx.a) {
            return;
        }
        throw new AssertionError((Object)"nope");
    }
}

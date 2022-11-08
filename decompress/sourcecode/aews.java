// 
// Decompiled by Procyon v0.6.0
// 

public final class aews extends aeww
{
    public static final aews a;
    
    static {
        a = new aews();
    }
    
    public aews() {
        super("CharMatcher.ascii()");
    }
    
    public final boolean b(final char c) {
        return c <= '\u007f';
    }
}

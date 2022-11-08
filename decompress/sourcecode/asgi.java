// 
// Decompiled by Procyon v0.6.0
// 

public final class asgi
{
    static final asgk a;
    
    static {
        a = new asgk();
    }
    
    protected asgi(final asgk asgk) {
        if (asgk == asgi.a) {
            return;
        }
        throw new AssertionError((Object)"nope");
    }
}

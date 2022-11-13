// 
// Decompiled by Procyon v0.6.0
// 

public enum aaxu
{
    a("NEW", 0), 
    b("LOGGED_NEW_SCREEN", 1), 
    c("LOGGED_ATTACH_PLAYER", 2), 
    d("LOGGED_ATTACH_WATCH_NEXT", 3);
    
    private static final aaxu[] e;
    
    private aaxu(final String s, final int n) {
    }
    
    public final boolean a(final aaxu aaxu) {
        return this.ordinal() >= aaxu.ordinal();
    }
}

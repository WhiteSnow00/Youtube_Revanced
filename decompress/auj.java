// 
// Decompiled by Procyon v0.6.0
// 

public enum auj
{
    a("DESTROYED", 0), 
    b("INITIALIZED", 1), 
    c("CREATED", 2), 
    d("STARTED", 3), 
    e("RESUMED", 4);
    
    private static final auj[] f;
    
    private auj(final String s, final int n) {
    }
    
    public final boolean a(final auj auj) {
        return this.compareTo(auj) >= 0;
    }
}

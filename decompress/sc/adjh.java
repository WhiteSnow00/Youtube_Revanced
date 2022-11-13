// 
// Decompiled by Procyon v0.6.0
// 

public final class adjh implements atke
{
    private final tff a;
    private volatile aora b;
    
    public adjh(final tff a) {
        this.a = a;
    }
    
    private final aora c() {
        synchronized (this) {
            if (this.b == null) {
                this.b = this.a.f();
            }
            return this.b;
        }
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final aora b() {
        aora aora;
        if (this.b != null) {
            aora = this.b;
        }
        else {
            aora = this.c();
        }
        return aora;
    }
}

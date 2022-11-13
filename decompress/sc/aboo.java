// 
// Decompiled by Procyon v0.6.0
// 

public enum aboo
{
    a("NEXT", 0, abiu.b), 
    b("PREVIOUS", 1, abiu.c), 
    c("AUTOPLAY", 2, abiu.d), 
    d("AUTONAV", 3, abiu.e), 
    e("JUMP", 4, abiu.g), 
    f("INSERT", 5, abiu.h);
    
    private static final aboo[] h;
    public final abiu g;
    
    private aboo(final String s, final int n, final abiu g) {
        this.g = g;
    }
}

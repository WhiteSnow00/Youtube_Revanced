import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaye
{
    public static final aaye a;
    public final xah b;
    private final xag c;
    
    static {
        a = new aaye(null, null);
    }
    
    public aaye(final xag c, final xah b) {
        this.c = c;
        this.b = b;
    }
    
    public final Optional a() {
        return Optional.ofNullable((Object)this.c);
    }
}

import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agjs implements aglh
{
    public static final agjs a;
    public static final agjs b;
    private final int c;
    
    static {
        b = new agjs(1);
        a = new agjs(0);
    }
    
    private agjs(final int c) {
        this.c = c;
    }
    
    public final Object a() {
        if (this.c != 0) {
            return Collections.emptySet();
        }
        return null;
    }
}

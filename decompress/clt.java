import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clt
{
    private static final Set a;
    
    static {
        a = new HashSet();
    }
    
    public clt() {
        clt.a.add(this);
    }
}

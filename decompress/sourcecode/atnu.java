import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atnu implements Serializable
{
    public static final atnu a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new atnu();
    }
    
    private atnu() {
    }
    
    private final Object readResolve() {
        return atnw.b;
    }
}

import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atrm implements Serializable
{
    public static final atrm a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new atrm();
    }
    
    private atrm() {
    }
    
    private final Object readResolve() {
        return atro.b;
    }
}

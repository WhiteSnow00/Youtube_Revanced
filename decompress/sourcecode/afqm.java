import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqm extends aexf implements Serializable
{
    public static final afqm a;
    private static final long serialVersionUID = 1L;
    
    static {
        a = new afqm();
    }
    
    private afqm() {
    }
    
    private Object readResolve() {
        return afqm.a;
    }
    
    @Override
    public final String toString() {
        return "Ints.stringConverter()";
    }
}

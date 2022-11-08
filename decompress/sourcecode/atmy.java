import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atmy implements Serializable
{
    public static final atmy a;
    
    static {
        a = new atmy();
    }
    
    private atmy() {
    }
    
    private Object readResolve() {
        return atmy.a;
    }
}

import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class atqq implements Serializable
{
    public static final atqq a;
    
    static {
        a = new atqq();
    }
    
    private atqq() {
    }
    
    private Object readResolve() {
        return atqq.a;
    }
}

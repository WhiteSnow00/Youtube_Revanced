import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbg extends afcs
{
    static final afbg a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new afbg();
    }
    
    private afbg() {
        super(afgm.b, 0);
    }
    
    private Object readResolve() {
        return afbg.a;
    }
}
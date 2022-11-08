// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public abstract class SpecificationComputer
{
    public static final SpecificationComputer$Companion Companion;
    
    static {
        Companion = new SpecificationComputer$Companion(null);
    }
    
    public abstract Object compute();
    
    protected final String createMessage(final Object o, final String s) {
        o.getClass();
        s.getClass();
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" value: ");
        sb.append(o);
        return sb.toString();
    }
    
    public abstract SpecificationComputer require(final String p0, final atml p1);
}

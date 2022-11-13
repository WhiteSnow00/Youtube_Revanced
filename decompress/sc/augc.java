import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augc extends augm implements Cloneable, Serializable, augg
{
    private static final long serialVersionUID = 2852608688135209575L;
    
    public augc() {
    }
    
    public augc(final auft auft) {
        super(0L, auft);
    }
    
    public final Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError("Clone error");
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahcb extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    
    public ahcb() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
    
    public final ahab a() {
        return new ahab(this.getMessage());
    }
}

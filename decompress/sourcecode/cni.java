// 
// Decompiled by Procyon v0.6.0
// 

public final class cni extends cfy
{
    public static final cni c;
    
    static {
        c = new cni();
    }
    
    private cni() {
        super(12, 13);
    }
    
    public final void a(final cgl cgl) {
        cgl.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        cgl.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}

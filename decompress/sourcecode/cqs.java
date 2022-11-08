// 
// Decompiled by Procyon v0.6.0
// 

final class cqs extends cfx
{
    public cqs(final cfs cfs) {
        super(cfs);
    }
    
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}

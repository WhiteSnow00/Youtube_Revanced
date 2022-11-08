// 
// Decompiled by Procyon v0.6.0
// 

final class cqr extends cfp
{
    public cqr(final cfs cfs) {
        super(cfs);
    }
    
    public final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}

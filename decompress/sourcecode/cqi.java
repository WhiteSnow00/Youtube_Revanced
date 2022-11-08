// 
// Decompiled by Procyon v0.6.0
// 

final class cqi extends cfp
{
    public cqi(final cfs cfs) {
        super(cfs);
    }
    
    public final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}

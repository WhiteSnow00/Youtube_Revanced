// 
// Decompiled by Procyon v0.6.0
// 

final class cqm extends cfp
{
    public cqm(final cfs cfs) {
        super(cfs);
    }
    
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public enum ijk
{
    a("PLAYABLE", 0, false), 
    b("TRANSFER_PENDING_USER_APPROVAL", 1, true), 
    c("TRANSFER_IN_PROGRESS", 2, false), 
    d("TRANSFER_WAITING_IN_QUEUE", 3, false), 
    e("TRANSFER_PAUSED", 4, false), 
    f("ERROR_PENDING_PLAYABILITY_ACTION", 5, true), 
    g("ERROR_NOT_PLAYABLE", 6, true), 
    h("ERROR_POLICY", 7, true), 
    i("ERROR_EXPIRED", 8, true), 
    j("ERROR_DISK", 9, true), 
    k("ERROR_DISK_SD_CARD", 10, true), 
    l("ERROR_STREAMS_MISSING", 11, true), 
    m("ERROR_EXPIRED_RENTAL", 12, true), 
    n("ERROR_GENERIC", 13, true), 
    o("UNKNOWN", 14, false);
    
    private static final ijk[] q;
    public final boolean p;
    
    private ijk(final String s, final int n, final boolean p3) {
        this.p = p3;
    }
}

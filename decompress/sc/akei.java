// 
// Decompiled by Procyon v0.6.0
// 

public enum akei implements ahbl
{
    a("IN_APP_UPDATE_EVENT_TYPE_UNKNOWN", 0, 0), 
    b("IN_APP_UPDATE_EVENT_TYPE_STARTED", 1, 1), 
    c("IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_AVAILABLE", 2, 2), 
    d("IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_NOT_AVAILABLE", 3, 3), 
    e("IN_APP_UPDATE_EVENT_TYPE_GET_INFO_FAILED", 4, 4), 
    f("IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_OK", 5, 11), 
    g("IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_FAILED", 6, 12), 
    h("IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_OK", 7, 13), 
    i("IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_CANCELED", 8, 14), 
    j("IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_FAILED", 9, 15), 
    k("IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_PENDING", 10, 5), 
    l("IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADING", 11, 6), 
    m("IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED", 12, 7), 
    n("IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_FAILED", 13, 8), 
    o("IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_CANCELED", 14, 9), 
    p("IN_APP_UPDATE_EVENT_TYPE_USER_COMPLETE_UPDATE", 15, 10);
    
    private static final akei[] r;
    public final int q;
    
    private akei(final String s, final int n, final int q) {
        this.q = q;
    }
    
    public final int getNumber() {
        return this.q;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.q);
    }
}

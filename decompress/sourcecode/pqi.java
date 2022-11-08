// 
// Decompiled by Procyon v0.6.0
// 

public enum pqi
{
    a("PRODUCTION", 0, "https://notifications-pa.googleapis.com:443"), 
    b("AUTOPUSH", 1, "https://autopush-notifications-pa.sandbox.googleapis.com:443"), 
    c("AUTOPUSH_QUAL_PLAYGROUND", 2, "https://autopush-qual-playground-notifications-pa.sandbox.googleapis.com:443"), 
    d("STAGING", 3, "https://staging-notifications-pa.sandbox.googleapis.com:443"), 
    e("STAGING_QUAL_QA", 4, "https://staging-qual-qa-notifications-pa.sandbox.googleapis.com:443"), 
    f("DEV", 5, "https://dev-notifications-pa.corp.googleapis.com:443");
    
    public final String g;
    
    private pqi(final String s, final int n, final String g) {
        this.g = g;
    }
    
    public static pqi a(final String s) {
        return Enum.valueOf(pqi.class, s);
    }
}

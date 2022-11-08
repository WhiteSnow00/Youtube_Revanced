// 
// Decompiled by Procyon v0.6.0
// 

public enum agnd implements agzm
{
    a("ACCOUNT_LINKING_FLOW_UNSPECIFIED", 0, 0), 
    b("OAUTH2_FLOW", 1, 1), 
    c("GSI_OAUTH_LINKING_FLOW", 2, 2), 
    d("GSI_OAUTH_CREATION_FLOW", 3, 3), 
    e("GSI_ONLY_FLOW", 4, 4), 
    f("THIRD_PARTY_INITIATED_FLOW", 5, 5), 
    g("MOBILE_APP_REDIRECT_FLOW", 6, 6), 
    h("UNRECOGNIZED", 7, -1);
    
    private final int j;
    
    private agnd(final String s, final int n, final int j) {
        this.j = j;
    }
    
    public final int getNumber() {
        if (this != agnd.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.getNumber());
    }
}

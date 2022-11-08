// 
// Decompiled by Procyon v0.6.0
// 

public enum oxz
{
    a("ZERO", 0, 0.0), 
    b("TEN_PERCENT", 1, 0.1), 
    c("TWENTY_PERCENT", 2, 0.2), 
    d("THIRTY_PERCENT", 3, 0.3), 
    e("FORTY_PERCENT", 4, 0.4), 
    f("FIFTY_PERCENT", 5, 0.5), 
    g("SIXTY_PERCENT", 6, 0.6), 
    h("SEVENTY_PERCENT", 7, 0.7), 
    i("EIGHTY_PERCENT", 8, 0.8), 
    j("NINETY_PERCENT", 9, 0.9), 
    k("ONE_HUNDRED_PERCENT", 10, 1.0);
    
    protected final double l;
    
    private oxz(final String s, final int n, final double l) {
        this.l = l;
    }
}

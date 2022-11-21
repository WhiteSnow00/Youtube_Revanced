import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public enum aepp
{
    a("DONT_CARE", 0, Long.MAX_VALUE), 
    b("SAME_WEEK", 1, TimeUnit.MILLISECONDS.convert(7L, TimeUnit.DAYS)), 
    c("SAME_DAY", 2, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS)), 
    d("FEW_HOURS", 3, TimeUnit.MILLISECONDS.convert(4L, TimeUnit.HOURS)), 
    e("ONE_HOUR", 4, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS)), 
    f("HALF_HOUR", 5, TimeUnit.MILLISECONDS.convert(30L, TimeUnit.MINUTES)), 
    g("TEN_MINUTES", 6, TimeUnit.MILLISECONDS.convert(10L, TimeUnit.MINUTES)), 
    h("FEW_MINUTES", 7, TimeUnit.MILLISECONDS.convert(4L, TimeUnit.MINUTES)), 
    i("ONE_MINUTE", 8, TimeUnit.MILLISECONDS.convert(1L, TimeUnit.MINUTES)), 
    j("FEW_SECONDS", 9, TimeUnit.MILLISECONDS.convert(4L, TimeUnit.SECONDS));
    
    private static final aepp[] l;
    final long k;
    
    private aepp(final String s, final int n, final long k) {
        this.k = k;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public enum adkr
{
    a("ANR", 0, "anr_detection.journal", "anr_journals"), 
    b("JAVA_CRASH", 1, "javacrash_detection.journal", "javacrash_journals"), 
    c("NATIVE_CRASH", 2, "nativecrash_detection.journal", "nativecrash_journals"), 
    d("BACKGROUND_THREAD_UNCAUGHT_EXCEPTION", 3, "background_javacrash.journal", "background_javacrash_journals");
    
    private static final adkr[] g;
    public final String e;
    public final String f;
    
    private adkr(final String s, final int n, final String e, final String f) {
        this.e = e;
        this.f = f;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public final class BuildConfig
{
    public static final BuildConfig INSTANCE;
    private static final VerificationMode verificationMode;
    
    static {
        INSTANCE = new BuildConfig();
        verificationMode = VerificationMode.QUIET;
    }
    
    private BuildConfig() {
    }
    
    public final VerificationMode getVerificationMode() {
        return BuildConfig.verificationMode;
    }
}

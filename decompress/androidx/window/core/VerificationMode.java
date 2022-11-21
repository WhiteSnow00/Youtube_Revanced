// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public enum VerificationMode
{
    private static final VerificationMode[] $VALUES;
    
    LOG("LOG", 1), 
    QUIET("QUIET", 2), 
    STRICT("STRICT", 0);
    
    private static final VerificationMode[] $values() {
        return new VerificationMode[] { VerificationMode.STRICT, VerificationMode.LOG, VerificationMode.QUIET };
    }
    
    static {
        $VALUES = $values();
    }
    
    private VerificationMode(final String s, final int n) {
    }
}

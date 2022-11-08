// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public final class SpecificationComputer$Companion
{
    private SpecificationComputer$Companion() {
    }
    
    public final SpecificationComputer startSpecification(final Object o, final String s, final VerificationMode verificationMode, final Logger logger) {
        o.getClass();
        s.getClass();
        verificationMode.getClass();
        logger.getClass();
        return (SpecificationComputer)new ValidSpecification(o, s, verificationMode, logger);
    }
}

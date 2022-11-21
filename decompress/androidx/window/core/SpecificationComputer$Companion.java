// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.core;

public final class SpecificationComputer$Companion
{
    private SpecificationComputer$Companion() {
    }
    
    public SpecificationComputer$Companion(final atqv atqv) {
        this();
    }
    
    public static SpecificationComputer startSpecification$default(final SpecificationComputer$Companion specificationComputer$Companion, final Object o, final String s, VerificationMode verificationMode, Logger instance, final int n, final Object o2) {
        if ((n & 0x2) != 0x0) {
            verificationMode = BuildConfig.INSTANCE.getVerificationMode();
        }
        if ((n & 0x4) != 0x0) {
            instance = (Logger)AndroidLogger.INSTANCE;
        }
        return specificationComputer$Companion.startSpecification(o, s, verificationMode, instance);
    }
    
    public final SpecificationComputer startSpecification(final Object o, final String s, final VerificationMode verificationMode, final Logger logger) {
        o.getClass();
        s.getClass();
        verificationMode.getClass();
        logger.getClass();
        return (SpecificationComputer)new ValidSpecification(o, s, verificationMode, logger);
    }
}

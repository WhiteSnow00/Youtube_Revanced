import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public enum afqq implements afqr
{
    a;
    
    public final Instant a() {
        return Instant.now();
    }
    
    @Override
    public final String toString() {
        return "TimeSource.system()";
    }
}

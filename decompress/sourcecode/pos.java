import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pos extends Exception
{
    public pos(final agwe agwe) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", agwe.k));
    }
    
    public pos(final agwm agwm) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", agwm.m));
    }
}

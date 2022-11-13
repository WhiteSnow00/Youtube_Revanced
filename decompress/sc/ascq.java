import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ascq extends arvs
{
    final Throwable a;
    private final arvo b;
    
    public ascq(final Throwable a) {
        this.a = a;
        this.b = arvo.a(Status.k.withDescription("Panic! This is a bug!").c(a));
    }
    
    public final arvo a() {
        return this.b;
    }
    
    public final String toString() {
        final aezo aa = adkp.aa((Class)ascq.class);
        aa.b("panicPickResult", (Object)this.b);
        return aa.toString();
    }
}

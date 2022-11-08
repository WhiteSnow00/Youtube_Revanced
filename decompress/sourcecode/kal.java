// 
// Decompiled by Procyon v0.6.0
// 

public final class kal implements vus
{
    public String a;
    public String b;
    public String c;
    private final arud d;
    
    public kal(final arud d, final byte[] array, final byte[] array2) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = d;
    }
    
    public final void oN(final vuv vuv) {
        alvs alvs;
        if ((alvs = this.d.f().e) == null) {
            alvs = alvs.a;
        }
        final String aj = alvs.aJ;
        alvs alvs2;
        if ((alvs2 = this.d.f().e) == null) {
            alvs2 = alvs.a;
        }
        final String ak = alvs2.aK;
        if (aj.isEmpty() && ak.isEmpty()) {
            return;
        }
        vuv.B = this.a;
        vuv.C = this.b;
        vuv.D = this.c;
        this.a = "";
        this.b = "";
        this.c = "";
    }
}

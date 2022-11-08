// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aacw
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final uyf d;
    
    public aacw(final uyf d, final atjj a, final atjj b, final atjj c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final aacv a(final zzd zzd) {
        if (((zzu)this.a.a()).a().q().equals("NO_OP_STORE_TAG")) {
            return null;
        }
        final ains b = this.d.b();
        if ((b.b & 0x10000) == 0x0) {
            return null;
        }
        amrp amrp;
        if ((amrp = b.k) == null) {
            amrp = amrp.a;
        }
        final int c = amrp.c;
        if (c == 1) {
            return ((aeby)this.b.a()).aI(zzd);
        }
        if (c == 2) {
            return ((aacu)this.c.a()).a(zzd);
        }
        if (c != 3) {
            return null;
        }
        final aacv ai = ((aeby)this.b.a()).aI(zzd);
        ((aacu)this.c.a()).a(zzd);
        return new aacv(ai.a, ai.b, 4, ai.c);
    }
}

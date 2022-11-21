// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aagq
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final vbo d;
    
    public aagq(final vbo d, final atnb a, final atnb b, final atnb c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final aagp a(final aacu aacu) {
        if (((aadl)this.a.a()).a().q().equals("NO_OP_STORE_TAG")) {
            return null;
        }
        final airq b = this.d.b();
        if ((b.b & 0x10000) == 0x0) {
            return null;
        }
        amvy amvy;
        if ((amvy = b.k) == null) {
            amvy = amvy.a;
        }
        final int c = amvy.c;
        if (c == 1) {
            return ((adgg)this.b.a()).W(aacu);
        }
        if (c == 2) {
            return ((aago)this.c.a()).a(aacu);
        }
        if (c != 3) {
            return null;
        }
        final aagp w = ((adgg)this.b.a()).W(aacu);
        ((aago)this.c.a()).a(aacu);
        return new aagp(w.a, w.b, 4, w.c);
    }
}

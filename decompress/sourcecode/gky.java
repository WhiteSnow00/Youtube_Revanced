// 
// Decompiled by Procyon v0.6.0
// 

public final class gky extends accs
{
    private final sxe c;
    private final gem d;
    
    public gky(final sxe c, final ohr ohr, final arhr arhr, final wwv wwv, final acup acup, final gem d) {
        super(ohr, arhr, wwv, acup);
        this.c = c;
        this.d = d;
    }
    
    public final asgn c(final aoei aoei, final orr orr) {
        if ((aoei.c & 0x20) != 0x0) {
            final sxe c = this.c;
            if (c instanceof gkx) {
                final fjn c2 = ((gkx)c).c;
                if (c2 != null && c2.l()) {
                    return asgn.f();
                }
            }
        }
        return super.c(aoei, orr);
    }
    
    public final void d() {
        this.d.k(3);
    }
    
    public final void e() {
        this.d.g(3);
    }
}

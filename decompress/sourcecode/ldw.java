// 
// Decompiled by Procyon v0.6.0
// 

final class ldw implements acik
{
    private final acnp a;
    private ldt b;
    private final int c;
    
    public ldw(final acnp a, final int c) {
        this.a = a;
        this.c = c;
    }
    
    public final void a(final acij acij, final achk achk, int n) {
        final ldt b = this.b;
        if (b != null) {
            acij.f("related_chip_section_list_filter", (Object)b);
            return;
        }
        final Object c = acij.c("sectionListController");
        if (c instanceof aclp) {
            final aclp aclp = (aclp)c;
            final acnp a = this.a;
            n = this.c - 1;
            Object b2;
            if (n != 1) {
                if (n != 2) {
                    b2 = null;
                }
                else {
                    b2 = new ldi(aclp, a);
                }
            }
            else {
                b2 = new lcz((acpd)aclp, a);
            }
            this.b = (ldt)b2;
            if (b2 != null) {
                acij.f("related_chip_section_list_filter", b2);
            }
        }
    }
}

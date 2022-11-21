// 
// Decompiled by Procyon v0.6.0
// 

public class acro implements acma
{
    private final int a;
    
    public acro(final int a) {
        this.a = a;
    }
    
    @Override
    public void a(final aclz aclz, final acla acla, final int n) {
        aclz.f("showLineSeparator", this.b(acla, n));
    }
    
    protected final boolean b(final acla acla, int a) {
        final int a2 = acla.a();
        final boolean b = true;
        final boolean b2 = a == a2 - 1;
        int n = 0;
        Label_0079: {
            if (!b2 && acla instanceof aclr) {
                final aclq l = ((aclr)acla).l(a);
                if (l != null && l.f(a) == l.a.a() - 1) {
                    n = 1;
                    break Label_0079;
                }
            }
            n = 0;
        }
        a = this.a;
        boolean b3;
        if (a != 0) {
            if (a != 1) {
                return a == 2 && b2;
            }
            b3 = (n != 0);
        }
        else {
            b3 = b;
            if (!b2) {
                b3 = (n && b);
            }
        }
        return b3;
    }
}

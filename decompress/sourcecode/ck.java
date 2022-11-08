import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class ck implements cj
{
    final int a;
    final int b;
    final /* synthetic */ cl c;
    
    public ck(final cl c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean i(final ArrayList list, final ArrayList list2) {
        final br o = this.c.o;
        return (o == null || this.a >= 0 || !o.og().aa()) && this.c.af(list, list2, this.a, this.b);
    }
}

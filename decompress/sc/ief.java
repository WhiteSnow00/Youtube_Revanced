import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ief implements iej
{
    public final vfw a;
    public final Object b;
    private final int c;
    
    public ief(final vfw a, final aaat b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public ief(final vfw a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        final int c = this.c;
        if (c == 0) {
            ieg.m(this.a, (String)this.b, (Set)o);
            return;
        }
        if (c == 1) {
            ieg.m(this.a, (String)this.b, (Set)o);
            return;
        }
        if (c == 2) {
            ifk.l(this.a, (aaat)this.b, (Set)o);
            return;
        }
        if (c == 3) {
            ifk.l(this.a, (aaat)this.b, (Set)o);
            return;
        }
        if (c != 4) {
            ifk.l(this.a, (aaat)this.b, (Set)o);
            return;
        }
        ifk.l(this.a, (aaat)this.b, (Set)o);
    }
}

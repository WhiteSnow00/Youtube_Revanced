import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abtk extends zbr
{
    public Observer a;
    public zhb b;
    private abtj c;
    
    public final void b() {
        this.a = new jum(this, 2);
    }
    
    public final void c(final abtj c) {
        final abtj c2 = this.c;
        if (c2 != null && c2 != c) {
            final abtd abtd = (abtd)c2;
            abtd.d.f = true;
            abtd.j.u();
        }
        this.c = c;
    }
    
    public final boolean d(final abtj abtj) {
        return abtj.equals(this.c);
    }
}

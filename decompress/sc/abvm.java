import java.util.Observer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abvm extends zdk
{
    public Observer a;
    public ziy b;
    private abvl c;
    
    public final /* bridge */ Object a() {
        final ziy b = this.b;
        Object o;
        if (b != null) {
            o = b.g().a();
        }
        else {
            o = zdj.a;
        }
        return o;
    }
    
    public final void b() {
        this.a = (Observer)new jvn(this, 2);
    }
    
    public final void c(final abvl c) {
        final abvl c2 = this.c;
        if (c2 != null && c2 != c) {
            final abve abve = (abve)c2;
            abve.d.f = true;
            abve.j.u();
        }
        this.c = c;
    }
    
    public final boolean d(final abvl abvl) {
        return abvl.equals(this.c);
    }
}

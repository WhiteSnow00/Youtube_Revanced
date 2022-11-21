import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class arq
{
    public final art a;
    boolean b;
    public boolean c;
    public int[] d;
    public Set e;
    final arr f;
    
    protected arq(final art a) {
        this.f = (arr)new arw();
        this.a = a;
    }
    
    public final void a() {
        this.b = true;
    }
    
    public final void b(final apl apl) {
        final Set e = this.e;
        if (e != null) {
            e.remove(apl);
        }
    }
}

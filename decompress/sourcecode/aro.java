import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class aro
{
    public final arr a;
    boolean b;
    public boolean c;
    public int[] d;
    public Set e;
    final arp f;
    
    protected aro(final arr a) {
        this.f = (arp)new aru();
        this.a = a;
    }
    
    public final void a() {
        this.b = true;
    }
    
    public final void b(final apk apk) {
        final Set e = this.e;
        if (e != null) {
            e.remove(apk);
        }
    }
}

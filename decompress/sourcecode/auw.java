import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class auw extends aux
{
    private final sb e;
    
    public auw() {
        this.e = new sb();
    }
    
    protected final void i() {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((Map.Entry<K, auv>)iterator.next()).getValue().b();
        }
    }
    
    protected final void j() {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((Map.Entry<K, auv>)iterator.next()).getValue().c();
        }
    }
    
    public final void o(final auu auu, final auy auy) {
        final auv auv = new auv(auu, auy);
        final auv auv2 = (auv)this.e.b((Object)auu, (Object)auv);
        if (auv2 != null && auv2.b != auy) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (auv2 != null) {
            return;
        }
        if (((auu)this).n()) {
            auv.b();
        }
    }
    
    public final void p(final auu auu) {
        final auv auv = (auv)this.e.c((Object)auu);
        if (auv != null) {
            auv.c();
        }
    }
}

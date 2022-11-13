// 
// Decompiled by Procyon v0.6.0
// 

public class ium implements iuj
{
    private static final iuk a;
    private final andh b;
    
    static {
        a = new iuk(andi.d);
    }
    
    public ium(final andh b) {
        this.b = b;
    }
    
    @Override
    public andd a() {
        final andd a = ium.a.a();
        final andh b = this.b;
        ((ahaz)a).copyOnWrite();
        ande.d((ande)a.instance, b);
        return a;
    }
}

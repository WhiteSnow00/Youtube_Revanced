// 
// Decompiled by Procyon v0.6.0
// 

public final class flj implements tgg
{
    public final tgd a;
    public ashc b;
    public ashc c;
    private final vdr d;
    private final zmf e;
    
    public flj(final vdr d, final zmf e, final tgd a) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = this.b().e();
        this.c = this.a().e();
    }
    
    public final ashc a() {
        return this.d.a(this.e.c()).h(glb.L(), true).K((asjs)exh.m).aD().e();
    }
    
    public final ashc b() {
        return this.d.a(this.e.c()).h(glb.K(), true).K((asjs)exh.n).aD().e();
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            if (n != 0) {
                final StringBuilder sb = new StringBuilder("unsupported op code: ");
                sb.append(n);
                throw new IllegalStateException(sb.toString());
            }
            final zms zms = (zms)o;
            this.b = this.b().e();
            this.c = this.a().e();
            array = null;
        }
        else {
            array = new Class[] { zms.class };
        }
        return array;
    }
}

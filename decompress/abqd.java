// 
// Decompiled by Procyon v0.6.0
// 

public final class abqd
{
    public static final aieb a;
    public final skt b;
    private final abrj c;
    
    static {
        final aidz a2 = aieb.a();
        final aiec b = aiec.b();
        ((ahaz)a2).copyOnWrite();
        aieb.g((aieb)a2.instance, b);
        a = (aieb)((ahaz)a2).build();
    }
    
    public abqd(final abrj c, final skt b, final ashi ashi, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        if (!((vai)c.c).f(45381145L)) {
            return;
        }
        ashi.Y((asjr)new zgy(this, 20)).am((asjm)new abpj(this, 11));
    }
}

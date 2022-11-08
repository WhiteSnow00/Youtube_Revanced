// 
// Decompiled by Procyon v0.6.0
// 

public final class kvd implements uvc
{
    private static final afdu c;
    public final arhr a;
    public final arhr b;
    private final fjp d;
    
    static {
        c = afdu.u((Object)ajnf.c, (Object)ajnf.d, (Object)ajnf.e);
    }
    
    public kvd(final arhr a, final arhr b, final fjp d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final utk a(final ajnf ajnf) {
        utk utk;
        if (kvd.c.contains((Object)ajnf)) {
            utk = (utk)this.b.a();
        }
        else {
            utk = (utk)this.a.a();
        }
        return utk;
    }
    
    public final ashe b() {
        final ashe k = this.d.k();
        final asys asys = new asys((ashh)k, asju.g, 1);
        final asjc o = aulo.o;
        return asys.j((asjc)new inw(this, k, 11));
    }
}

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtn extends ahcz implements aheo
{
    public static final aqtn a;
    private static volatile ahev k;
    public int b;
    public ahej c;
    public ahej d;
    public ahej e;
    public ahej f;
    public ahej g;
    public ahej h;
    public ahej i;
    public int j;
    
    static {
        ahcz.registerDefaultInstance(aqtn.class, a = new aqtn());
    }
    
    private aqtn() {
        this.c = ahej.a;
        final ahej a = ahej.a;
        this.d = a;
        this.e = a;
        this.f = a;
        this.g = a;
        this.h = a;
        this.i = a;
        emptyProtobufList();
    }
    
    public final ahej a() {
        final ahej g = this.g;
        if (!g.b) {
            this.g = g.a();
        }
        return this.g;
    }
    
    public final ahej b() {
        final ahej i = this.i;
        if (!i.b) {
            this.i = i.a();
        }
        return this.i;
    }
    
    public final ahej c() {
        final ahej c = this.c;
        if (!c.b) {
            this.c = c.a();
        }
        return this.c;
    }
    
    public final ahej d() {
        final ahej e = this.e;
        if (!e.b) {
            this.e = e.a();
        }
        return this.e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aqtn.k) == null) {
                    synchronized (aqtn.class) {
                        if (aqtn.k == null) {
                            aqtn.k = (ahev)new ahcs((ahcz)aqtn.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aqtn.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (byte[][][])null);
            }
            case 3: {
                return new aqtn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtn.a, "\u0001\b\u0000\u0001\u0006\r\b\u0007\u0000\u0000\u00062\u00072\b2\t2\n2\u000b2\f2\r\u1004\u0000", new Object[] { "b", "c", aqti.a, "d", aqtl.a, "e", aqtj.a, "f", aqtm.a, "g", aqtg.a, "h", aqtk.a, "i", aqth.a, "j" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public final ahej e() {
        final ahej h = this.h;
        if (!h.b) {
            this.h = h.a();
        }
        return this.h;
    }
    
    public final ahej f() {
        final ahej d = this.d;
        if (!d.b) {
            this.d = d.a();
        }
        return this.d;
    }
    
    public final ahej g() {
        final ahej f = this.f;
        if (!f.b) {
            this.f = f.a();
        }
        return this.f;
    }
}

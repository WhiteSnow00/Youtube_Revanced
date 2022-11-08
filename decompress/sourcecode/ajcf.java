import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcf extends agzi implements ahax
{
    private static final ajcf a;
    private static volatile ahbe b;
    private int c;
    private ajce d;
    private ajca e;
    private ajbz f;
    private ajcc g;
    private ajcb h;
    private ajcd i;
    
    static {
        agzi.registerDefaultInstance(ajcf.class, a = new ajcf());
    }
    
    private ajcf() {
    }
    
    public static ajby a() {
        return (ajby)ajcf.a.createBuilder();
    }
    
    public static ajcf f(final agyc agyc, final ExtensionRegistryLite extensionRegistryLite) {
        return (ajcf)agzi.parseFrom(ajcf.a, agyc, extensionRegistryLite);
    }
    
    private void m(final ajca e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void n(final ajbz f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    private void o(final ajcb h) {
        h.getClass();
        this.h = h;
        this.c |= 0x10;
    }
    
    private void p(final ajcc g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    private void q(final ajcd i) {
        i.getClass();
        this.i = i;
        this.c |= 0x20;
    }
    
    private void r(final ajce d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    public ajbz b() {
        ajbz ajbz;
        if ((ajbz = this.f) == null) {
            ajbz = ajbz.a;
        }
        return ajbz;
    }
    
    public ajca c() {
        ajca ajca;
        if ((ajca = this.e) == null) {
            ajca = ajca.a;
        }
        return ajca;
    }
    
    public ajce d() {
        ajce ajce;
        if ((ajce = this.d) == null) {
            ajce = ajce.a;
        }
        return ajce;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajcf.b) == null) {
                    synchronized (ajcf.class) {
                        if (ajcf.b == null) {
                            ajcf.b = (ahbe)new agzb((agzi)ajcf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajcf.a;
            }
            case 4: {
                return new ajby();
            }
            case 3: {
                return new ajcf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcf.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

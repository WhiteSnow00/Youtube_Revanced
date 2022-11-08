import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodj extends agzi implements ahax
{
    private static final aodj a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    
    static {
        agzi.registerDefaultInstance(aodj.class, a = new aodj());
    }
    
    private aodj() {
    }
    
    public static aodi a() {
        return (aodi)aodj.a.createBuilder();
    }
    
    private void g(final boolean e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void h(final boolean f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void i(final boolean g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void j(final aodh aodh) {
        this.d = aodh.d;
        this.c |= 0x1;
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
                if ((b = aodj.b) == null) {
                    synchronized (aodj.class) {
                        if (aodj.b == null) {
                            aodj.b = (ahbe)new agzb((agzi)aodj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aodj.a;
            }
            case 4: {
                return new aodi();
            }
            case 3: {
                return new aodj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "c", "d", aodh.a(), "e", "f", "g" });
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

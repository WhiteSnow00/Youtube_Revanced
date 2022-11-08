import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodp extends agzi implements ahax
{
    private static final aodp a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private Object e;
    private String f;
    
    static {
        agzi.registerDefaultInstance(aodp.class, a = new aodp());
    }
    
    private aodp() {
        this.d = 0;
        this.f = "";
    }
    
    public static aodo a() {
        return (aodo)aodp.a.createBuilder();
    }
    
    private void f(final aodj e) {
        e.getClass();
        this.e = e;
        this.d = 3;
    }
    
    private void g(final aodn e) {
        e.getClass();
        this.e = e;
        this.d = 1;
    }
    
    private void h(final String f) {
        f.getClass();
        this.c |= 0x8;
        this.f = f;
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
                if ((b = aodp.b) == null) {
                    synchronized (aodp.class) {
                        if (aodp.b == null) {
                            aodp.b = (ahbe)new agzb((agzi)aodp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aodp.a;
            }
            case 4: {
                return new aodo();
            }
            case 3: {
                return new aodp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodp.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1008\u0003", new Object[] { "e", "d", "c", aodn.class, aodl.class, aodj.class, "f" });
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

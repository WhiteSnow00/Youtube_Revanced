import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amrx extends agzi implements ahax
{
    public static final amrx a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(amrx.class, a = new amrx());
    }
    
    private amrx() {
        this.c = 0;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = amrx.f) == null) {
                    synchronized (amrx.class) {
                        if (amrx.f == null) {
                            amrx.f = (ahbe)new agzb((agzi)amrx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amrx.a;
            }
            case 4: {
                return new agza((agzi)amrx.a);
            }
            case 3: {
                return new amrx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amrx.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000\u0003\u1008\u0002", new Object[] { "d", "c", "b", "e" });
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

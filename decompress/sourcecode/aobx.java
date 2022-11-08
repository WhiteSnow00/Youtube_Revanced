import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobx extends agzi implements ahax
{
    public static final aobx a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public aobs d;
    public aocc e;
    
    static {
        agzi.registerDefaultInstance(aobx.class, a = new aobx());
    }
    
    private aobx() {
        this.c = "";
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
                if ((f = aobx.f) == null) {
                    synchronized (aobx.class) {
                        if (aobx.f == null) {
                            aobx.f = (ahbe)new agzb((agzi)aobx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aobx.a;
            }
            case 4: {
                return new agza((agzi)aobx.a);
            }
            case 3: {
                return new aobx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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

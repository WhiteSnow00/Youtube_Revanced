import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosh extends agzi implements ahax
{
    public static final aosh a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public aorz d;
    
    static {
        agzi.registerDefaultInstance(aosh.class, a = new aosh());
    }
    
    private aosh() {
        this.c = "";
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aosh.e) == null) {
                    synchronized (aosh.class) {
                        if (aosh.e == null) {
                            aosh.e = (ahbe)new agzb((agzi)aosh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aosh.a;
            }
            case 4: {
                return new agza((agzi)aosh.a);
            }
            case 3: {
                return new aosh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosh.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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

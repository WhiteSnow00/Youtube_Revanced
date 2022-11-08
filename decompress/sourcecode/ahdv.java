import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdv extends agzi implements ahax
{
    public static final ahdv a;
    private static volatile ahbe e;
    public int b;
    public double c;
    public double d;
    
    static {
        agzi.registerDefaultInstance(ahdv.class, a = new ahdv());
    }
    
    private ahdv() {
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
                if ((e = ahdv.e) == null) {
                    synchronized (ahdv.class) {
                        if (ahdv.e == null) {
                            ahdv.e = (ahbe)new agzb((agzi)ahdv.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahdv.a;
            }
            case 4: {
                return new agza((agzi)ahdv.a);
            }
            case 3: {
                return new ahdv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001", new Object[] { "b", "c", "d" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahtl extends agzi implements ahax
{
    public static final ahtl a;
    private static volatile ahbe h;
    public int b;
    public aoof c;
    public long d;
    public agzy e;
    public long f;
    public long g;
    
    static {
        agzi.registerDefaultInstance(ahtl.class, a = new ahtl());
    }
    
    private ahtl() {
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahtl.h) == null) {
                    synchronized (ahtl.class) {
                        if (ahtl.h == null) {
                            ahtl.h = (ahbe)new agzb((agzi)ahtl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahtl.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (short[][][])null);
            }
            case 3: {
                return new ahtl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahtl.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u001b\u0004\u1002\u0002\u0005\u1002\u0003", new Object[] { "b", "c", "d", "e", ahtk.class, "f", "g" });
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

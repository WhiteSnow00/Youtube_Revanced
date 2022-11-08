import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoci extends agzi implements ahax
{
    public static final aoci a;
    private static volatile ahbe e;
    public int b;
    public aoch c;
    public agzy d;
    
    static {
        agzi.registerDefaultInstance(aoci.class, a = new aoci());
    }
    
    private aoci() {
        this.d = agzi.emptyProtobufList();
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
                if ((e = aoci.e) == null) {
                    synchronized (aoci.class) {
                        if (aoci.e == null) {
                            aoci.e = (ahbe)new agzb((agzi)aoci.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoci.a;
            }
            case 4: {
                return new agza((agzi)aoci.a);
            }
            case 3: {
                return new aoci();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoci.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", aoch.class });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnk extends agzi implements ahax
{
    public static final ahnk a;
    private static volatile ahbe i;
    public int b;
    public ahog c;
    public ahom d;
    public ahod e;
    public ahon f;
    public ahoj g;
    public ahoa h;
    
    static {
        agzi.registerDefaultInstance(ahnk.class, a = new ahnk());
    }
    
    private ahnk() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ahnk.i) == null) {
                    synchronized (ahnk.class) {
                        if (ahnk.i == null) {
                            ahnk.i = (ahbe)new agzb((agzi)ahnk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahnk.a;
            }
            case 4: {
                return new agza((agzi)ahnk.a);
            }
            case 3: {
                return new ahnk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnk.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0005\u0006\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "h", "g" });
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

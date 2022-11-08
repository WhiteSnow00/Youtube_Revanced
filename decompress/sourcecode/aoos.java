import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoos extends agzi implements ahax
{
    public static final aoos a;
    private static volatile ahbe d;
    public aooo b;
    public aoou c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aoos.class, (agzi)(a = new aoos()));
    }
    
    private aoos() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aoos.d) == null) {
                    synchronized (aoos.class) {
                        if (aoos.d == null) {
                            aoos.d = (ahbe)new agzb((agzi)aoos.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoos.a;
            }
            case 4: {
                return new agza((agzi)aoos.a);
            }
            case 3: {
                return new aoos();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoos.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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

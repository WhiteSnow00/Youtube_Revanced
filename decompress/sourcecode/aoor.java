import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoor extends agzi implements ahax
{
    public static final aoor a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)aoor.class, (agzi)(a = new aoor()));
    }
    
    private aoor() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aoor.d) == null) {
                    synchronized (aoor.class) {
                        if (aoor.d == null) {
                            aoor.d = (ahbe)new agzb((agzi)aoor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoor.a;
            }
            case 4: {
                return new agza((agzi)aoor.a);
            }
            case 3: {
                return new aoor();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoor.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "e", "b", "c" });
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

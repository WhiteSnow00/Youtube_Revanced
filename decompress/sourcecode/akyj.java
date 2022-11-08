import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyj extends agzi implements ahax
{
    public static final akyj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)akyj.class, (agzi)(a = new akyj()));
    }
    
    private akyj() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = akyj.b) == null) {
                    synchronized (akyj.class) {
                        if (akyj.b == null) {
                            akyj.b = (ahbe)new agzb((agzi)akyj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akyj.a;
            }
            case 4: {
                return new agza((agzi)akyj.a);
            }
            case 3: {
                return new akyj();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyj.a, "\u0001\u0000", (Object[])null);
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

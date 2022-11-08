import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopt extends agzi implements ahax
{
    public static final aopt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aopt.class, (agzi)(a = new aopt()));
    }
    
    private aopt() {
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aopt.b) == null) {
                    synchronized (aopt.class) {
                        if (aopt.b == null) {
                            aopt.b = (ahbe)new agzb((agzi)aopt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aopt.a;
            }
            case 4: {
                return new agza((agzi)aopt.a);
            }
            case 3: {
                return new aopt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopt.a, "\u0001\u0000", (Object[])null);
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

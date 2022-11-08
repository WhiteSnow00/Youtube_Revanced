import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiy extends agzi implements ahax
{
    public static final apiy a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(apiy.class, a = new apiy());
    }
    
    private apiy() {
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apiy.b) == null) {
                    synchronized (apiy.class) {
                        if (apiy.b == null) {
                            apiy.b = (ahbe)new agzb((agzi)apiy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apiy.a;
            }
            case 4: {
                return new agza((agzi)apiy.a);
            }
            case 3: {
                return new apiy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apiy.a, "\u0001\u0000", null);
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

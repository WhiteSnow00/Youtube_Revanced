import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnt extends agzi implements ahax
{
    public static final apnt a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apnt.class, (agzi)(a = new apnt()));
    }
    
    private apnt() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apnt.b) == null) {
                    synchronized (apnt.class) {
                        if (apnt.b == null) {
                            apnt.b = (ahbe)new agzb((agzi)apnt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apnt.a;
            }
            case 4: {
                return new agza((agzi)apnt.a);
            }
            case 3: {
                return new apnt();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnt.a, "\u0001\u0000", (Object[])null);
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

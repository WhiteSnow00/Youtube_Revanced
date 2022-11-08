import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apte extends agzi implements ahax
{
    public static final apte a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apte.class, (agzi)(a = new apte()));
    }
    
    private apte() {
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
                if ((b = apte.b) == null) {
                    synchronized (apte.class) {
                        if (apte.b == null) {
                            apte.b = (ahbe)new agzb((agzi)apte.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apte.a;
            }
            case 4: {
                return new agza((agzi)apte.a);
            }
            case 3: {
                return new apte();
            }
            case 2: {
                return newMessageInfo((MessageLite)apte.a, "\u0001\u0000", (Object[])null);
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

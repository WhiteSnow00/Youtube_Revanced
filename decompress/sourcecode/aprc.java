import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprc extends agzi implements ahax
{
    public static final aprc a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprc.class, (agzi)(a = new aprc()));
    }
    
    private aprc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprc.b) == null) {
                    synchronized (aprc.class) {
                        if (aprc.b == null) {
                            aprc.b = (ahbe)new agzb((agzi)aprc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprc.a;
            }
            case 4: {
                return new agza((agzi)aprc.a);
            }
            case 3: {
                return new aprc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprc.a, "\u0001\u0000", (Object[])null);
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

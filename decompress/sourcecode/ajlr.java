import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlr extends agzi implements ahax
{
    public static final ajlr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajlr.class, (agzi)(a = new ajlr()));
    }
    
    private ajlr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajlr.b) == null) {
                    synchronized (ajlr.class) {
                        if (ajlr.b == null) {
                            ajlr.b = (ahbe)new agzb((agzi)ajlr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlr.a;
            }
            case 4: {
                return new agza((agzi)ajlr.a);
            }
            case 3: {
                return new ajlr();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlr.a, "\u0001\u0000", (Object[])null);
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

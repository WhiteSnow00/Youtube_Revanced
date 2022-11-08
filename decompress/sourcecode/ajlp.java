import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlp extends agzi implements ahax
{
    public static final ajlp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajlp.class, (agzi)(a = new ajlp()));
    }
    
    private ajlp() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajlp.b) == null) {
                    synchronized (ajlp.class) {
                        if (ajlp.b == null) {
                            ajlp.b = (ahbe)new agzb((agzi)ajlp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlp.a;
            }
            case 4: {
                return new agza((agzi)ajlp.a);
            }
            case 3: {
                return new ajlp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlp.a, "\u0001\u0000", (Object[])null);
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlq extends agzi implements ahax
{
    public static final ajlq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)ajlq.class, (agzi)(a = new ajlq()));
    }
    
    private ajlq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajlq.b) == null) {
                    synchronized (ajlq.class) {
                        if (ajlq.b == null) {
                            ajlq.b = (ahbe)new agzb((agzi)ajlq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajlq.a;
            }
            case 4: {
                return new agza((agzi)ajlq.a);
            }
            case 3: {
                return new ajlq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajlq.a, "\u0001\u0000", (Object[])null);
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

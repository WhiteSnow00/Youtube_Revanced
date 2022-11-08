import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pan extends agzi implements ahax
{
    public static final pan a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)pan.class, (agzi)(a = new pan()));
    }
    
    private pan() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = pan.c) == null) {
                    synchronized (pan.class) {
                        if (pan.c == null) {
                            pan.c = (ahbe)new agzb((agzi)pan.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return pan.a;
            }
            case 4: {
                return new agza((agzi)pan.a);
            }
            case 3: {
                return new pan();
            }
            case 2: {
                return newMessageInfo((MessageLite)pan.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", aeih.t });
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

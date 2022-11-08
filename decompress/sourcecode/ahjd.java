import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjd extends agzi implements ahax
{
    public static final ahjd a;
    private static volatile ahbe c;
    public float b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjd.class, (agzi)(a = new ahjd()));
    }
    
    private ahjd() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahjd.c) == null) {
                    synchronized (ahjd.class) {
                        if (ahjd.c == null) {
                            ahjd.c = (ahbe)new agzb((agzi)ahjd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahjd.a;
            }
            case 4: {
                return new agza((agzi)ahjd.a);
            }
            case 3: {
                return new ahjd();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjd.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1001\u0000", new Object[] { "d", "b" });
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

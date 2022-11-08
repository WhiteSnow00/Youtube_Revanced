import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjb extends agzi implements ahax
{
    public static final ahjb a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahjb.class, (agzi)(a = new ahjb()));
    }
    
    private ahjb() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahjb.c) == null) {
                    synchronized (ahjb.class) {
                        if (ahjb.c == null) {
                            ahjb.c = (ahbe)new agzb((agzi)ahjb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahjb.a;
            }
            case 4: {
                return new agza((agzi)ahjb.a);
            }
            case 3: {
                return new ahjb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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

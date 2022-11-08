import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlb extends agzi implements ahax
{
    public static final ahlb a;
    private static volatile ahbe c;
    public ahas b;
    
    static {
        agzi.registerDefaultInstance((Class)ahlb.class, (agzi)(a = new ahlb()));
    }
    
    private ahlb() {
        this.b = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahlb.c) == null) {
                    synchronized (ahlb.class) {
                        if (ahlb.c == null) {
                            ahlb.c = (ahbe)new agzb((agzi)ahlb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlb.a;
            }
            case 4: {
                return new agza((agzi)ahlb.a);
            }
            case 3: {
                return new ahlb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlb.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "b", ahkz.a });
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

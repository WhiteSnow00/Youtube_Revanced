import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlf extends agzi implements ahax
{
    public static final ahlf a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ahlf.class, (agzi)(a = new ahlf()));
    }
    
    private ahlf() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahlf.c) == null) {
                    synchronized (ahlf.class) {
                        if (ahlf.c == null) {
                            ahlf.c = (ahbe)new agzb((agzi)ahlf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahlf.a;
            }
            case 4: {
                return new agza((agzi)ahlf.a);
            }
            case 3: {
                return new ahlf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahlf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100b\u0000", new Object[] { "d", "b" });
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

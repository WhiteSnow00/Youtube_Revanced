import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajom extends agzi implements ahax
{
    public static final ajom a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)ajom.class, (agzi)(a = new ajom()));
    }
    
    private ajom() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajom.c) == null) {
                    synchronized (ajom.class) {
                        if (ajom.c == null) {
                            ajom.c = (ahbe)new agzb((agzi)ajom.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajom.a;
            }
            case 4: {
                return new agza((agzi)ajom.a);
            }
            case 3: {
                return new ajom();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajom.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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

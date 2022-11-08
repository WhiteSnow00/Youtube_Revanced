import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmd extends agzi implements ahax
{
    public static final apmd a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apmd.class, (agzi)(a = new apmd()));
    }
    
    private apmd() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apmd.c) == null) {
                    synchronized (apmd.class) {
                        if (apmd.c == null) {
                            apmd.c = (ahbe)new agzb((agzi)apmd.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apmd.a;
            }
            case 4: {
                return new agza((agzi)apmd.a);
            }
            case 3: {
                return new apmd();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apjd.o });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apna extends agzi implements ahax
{
    public static final apna a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apna.class, (agzi)(a = new apna()));
    }
    
    private apna() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apna.c) == null) {
                    synchronized (apna.class) {
                        if (apna.c == null) {
                            apna.c = (ahbe)new agzb((agzi)apna.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apna.a;
            }
            case 4: {
                return new agza((agzi)apna.a);
            }
            case 3: {
                return new apna();
            }
            case 2: {
                return newMessageInfo((MessageLite)apna.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apms.i });
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

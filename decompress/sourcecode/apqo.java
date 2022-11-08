import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqo extends agzi implements ahax
{
    public static final apqo a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apqo.class, (agzi)(a = new apqo()));
    }
    
    private apqo() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apqo.c) == null) {
                    synchronized (apqo.class) {
                        if (apqo.c == null) {
                            apqo.c = (ahbe)new agzb((agzi)apqo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apqo.a;
            }
            case 4: {
                return new agza((agzi)apqo.a);
            }
            case 3: {
                return new apqo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", apms.s });
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

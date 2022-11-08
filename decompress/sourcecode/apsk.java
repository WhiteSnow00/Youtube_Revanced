import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsk extends agzi implements ahax
{
    public static final apsk a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apsk.class, (agzi)(a = new apsk()));
    }
    
    private apsk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apsk.c) == null) {
                    synchronized (apsk.class) {
                        if (apsk.c == null) {
                            apsk.c = (ahbe)new agzb((agzi)apsk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsk.a;
            }
            case 4: {
                return new agza((agzi)apsk.a);
            }
            case 3: {
                return new apsk();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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

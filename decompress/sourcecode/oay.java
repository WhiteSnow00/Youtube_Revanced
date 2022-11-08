import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oay extends agzi implements ahax
{
    public static final oay a;
    private static volatile ahbe c;
    public String b;
    
    static {
        agzi.registerDefaultInstance((Class)oay.class, (agzi)(a = new oay()));
    }
    
    private oay() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = oay.c) == null) {
                    synchronized (oay.class) {
                        if (oay.c == null) {
                            oay.c = (ahbe)new agzb((agzi)oay.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return oay.a;
            }
            case 4: {
                return new agza((agzi)oay.a);
            }
            case 3: {
                return new oay();
            }
            case 2: {
                return newMessageInfo((MessageLite)oay.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[] { "b" });
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

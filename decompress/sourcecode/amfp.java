import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfp extends agzi implements ahax
{
    public static final amfp a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)amfp.class, (agzi)(a = new amfp()));
    }
    
    private amfp() {
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
                if ((c = amfp.c) == null) {
                    synchronized (amfp.class) {
                        if (amfp.c == null) {
                            amfp.c = (ahbe)new agzb((agzi)amfp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amfp.a;
            }
            case 4: {
                return new agza((agzi)amfp.a);
            }
            case 3: {
                return new amfp();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfp.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0002", new Object[] { "d", "b" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkp extends agzi implements ahax
{
    public static final adkp a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(adkp.class, a = new adkp());
    }
    
    private adkp() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = adkp.c) == null) {
                    synchronized (adkp.class) {
                        if (adkp.c == null) {
                            adkp.c = (ahbe)new agzb((agzi)adkp.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return adkp.a;
            }
            case 4: {
                return new agza((agzi)adkp.a);
            }
            case 3: {
                return new adkp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)adkp.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
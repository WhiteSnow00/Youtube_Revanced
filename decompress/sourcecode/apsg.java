import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsg extends agzi implements ahax
{
    public static final apsg a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance((Class)apsg.class, (agzi)(a = new apsg()));
    }
    
    private apsg() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apsg.d) == null) {
                    synchronized (apsg.class) {
                        if (apsg.d == null) {
                            apsg.d = (ahbe)new agzb((agzi)apsg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apsg.a;
            }
            case 4: {
                return new agza((agzi)apsg.a);
            }
            case 3: {
                return new apsg();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

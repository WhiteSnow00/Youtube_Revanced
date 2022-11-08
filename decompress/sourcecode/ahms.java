import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahms extends agzi implements ahax
{
    public static final ahms a;
    private static volatile ahbe e;
    public int b;
    public Object c;
    public String d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)ahms.class, (agzi)(a = new ahms()));
    }
    
    private ahms() {
        this.b = 0;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahms.e) == null) {
                    synchronized (ahms.class) {
                        if (ahms.e == null) {
                            ahms.e = (ahbe)new agzb((agzi)ahms.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahms.a;
            }
            case 4: {
                return new agza((agzi)ahms.a);
            }
            case 3: {
                return new ahms();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahms.a, "\u0001\u0002\u0001\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u103c\u0000\u0003\u1008\u0002", new Object[] { "c", "b", "f", ahmr.class, "d" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnb extends agzi implements ahax
{
    public static final apnb a;
    private static volatile ahbe e;
    public int b;
    public float c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)apnb.class, (agzi)(a = new apnb()));
    }
    
    private apnb() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apnb.e) == null) {
                    synchronized (apnb.class) {
                        if (apnb.e == null) {
                            apnb.e = (ahbe)new agzb((agzi)apnb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apnb.a;
            }
            case 4: {
                return new agza((agzi)apnb.a);
            }
            case 3: {
                return new apnb();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnb.a, "\u0001\u0002\u0000\u0001\u0004\u000b\u0002\u0000\u0000\u0000\u0004\u1001\u0001\u000b\u100c\u0007", new Object[] { "b", "c", "d", apms.j });
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

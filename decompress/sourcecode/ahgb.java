import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgb extends agzi implements ahax
{
    public static final ahgb a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(ahgb.class, a = new ahgb());
    }
    
    private ahgb() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahgb.e) == null) {
                    synchronized (ahgb.class) {
                        if (ahgb.e == null) {
                            ahgb.e = (ahbe)new agzb((agzi)ahgb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahgb.a;
            }
            case 4: {
                return new agza((agzi)ahgb.a);
            }
            case 3: {
                return new ahgb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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

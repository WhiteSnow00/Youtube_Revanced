import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjm extends agzi implements ahax
{
    public static final anjm a;
    private static volatile ahbe d;
    public int b;
    public String c;
    
    static {
        agzi.registerDefaultInstance(anjm.class, a = new anjm());
    }
    
    private anjm() {
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
                final ahbe d;
                if ((d = anjm.d) == null) {
                    synchronized (anjm.class) {
                        if (anjm.d == null) {
                            anjm.d = (ahbe)new agzb((agzi)anjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anjm.a;
            }
            case 4: {
                return new agza((agzi)anjm.a);
            }
            case 3: {
                return new anjm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

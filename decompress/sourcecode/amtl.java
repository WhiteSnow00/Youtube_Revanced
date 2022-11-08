import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtl extends agzi implements ahax
{
    public static final amtl a;
    private static volatile ahbe d;
    public int b;
    public amtm c;
    
    static {
        agzi.registerDefaultInstance(amtl.class, a = new amtl());
    }
    
    private amtl() {
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
                if ((d = amtl.d) == null) {
                    synchronized (amtl.class) {
                        if (amtl.d == null) {
                            amtl.d = (ahbe)new agzb((agzi)amtl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amtl.a;
            }
            case 4: {
                return new agza((agzi)amtl.a);
            }
            case 3: {
                return new amtl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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

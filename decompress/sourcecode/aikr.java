import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikr extends agzi implements ahax
{
    public static final aikr a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aikr.class, a = new aikr());
    }
    
    private aikr() {
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
                if ((d = aikr.d) == null) {
                    synchronized (aikr.class) {
                        if (aikr.d == null) {
                            aikr.d = (ahbe)new agzb((agzi)aikr.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikr.a;
            }
            case 4: {
                return new agza((agzi)aikr.a);
            }
            case 3: {
                return new aikr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aijn.g });
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

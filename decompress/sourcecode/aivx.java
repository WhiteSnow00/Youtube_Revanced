import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivx extends agzi implements ahax
{
    public static final aivx a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance(aivx.class, a = new aivx());
    }
    
    private aivx() {
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
                if ((d = aivx.d) == null) {
                    synchronized (aivx.class) {
                        if (aivx.d == null) {
                            aivx.d = (ahbe)new agzb((agzi)aivx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aivx.a;
            }
            case 4: {
                return new agza((agzi)aivx.a);
            }
            case 3: {
                return new aivx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", aipt.l });
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

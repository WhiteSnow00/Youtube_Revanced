import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loz extends agzi implements ahax
{
    public static final loz a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(loz.class, a = new loz());
    }
    
    private loz() {
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
                if ((d = loz.d) == null) {
                    synchronized (loz.class) {
                        if (loz.d == null) {
                            loz.d = (ahbe)new agzb((agzi)loz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return loz.a;
            }
            case 4: {
                return new agza((agzi)loz.a);
            }
            case 3: {
                return new loz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)loz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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

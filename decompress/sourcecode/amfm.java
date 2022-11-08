import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amfm extends agzi implements ahax
{
    public static final amfm a;
    private static volatile ahbe d;
    public boolean b;
    public boolean c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)amfm.class, (agzi)(a = new amfm()));
    }
    
    private amfm() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = amfm.d) == null) {
                    synchronized (amfm.class) {
                        if (amfm.d == null) {
                            amfm.d = (ahbe)new agzb((agzi)amfm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amfm.a;
            }
            case 4: {
                return new agza((agzi)amfm.a);
            }
            case 3: {
                return new amfm();
            }
            case 2: {
                return newMessageInfo((MessageLite)amfm.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "e", "b", "c" });
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

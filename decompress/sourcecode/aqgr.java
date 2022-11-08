import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgr extends agzi implements ahax
{
    public static final aqgr a;
    private static volatile ahbe b;
    private int c;
    private boolean d;
    
    static {
        agzi.registerDefaultInstance((Class)aqgr.class, (agzi)(a = new aqgr()));
    }
    
    private aqgr() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqgr.b) == null) {
                    synchronized (aqgr.class) {
                        if (aqgr.b == null) {
                            aqgr.b = (ahbe)new agzb((agzi)aqgr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqgr.a;
            }
            case 4: {
                return new agza((agzi)aqgr.a);
            }
            case 3: {
                return new aqgr();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgr.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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

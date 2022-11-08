import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfu extends agzi implements ahax
{
    public static final aqfu a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)aqfu.class, (agzi)(a = new aqfu()));
    }
    
    private aqfu() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aqfu.e) == null) {
                    synchronized (aqfu.class) {
                        if (aqfu.e == null) {
                            aqfu.e = (ahbe)new agzb((agzi)aqfu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqfu.a;
            }
            case 4: {
                return new agza((agzi)aqfu.a);
            }
            case 3: {
                return new aqfu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apfn.p });
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

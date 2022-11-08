import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appx extends agzi implements ahax
{
    public static final appx a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)appx.class, (agzi)(a = new appx()));
    }
    
    private appx() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = appx.d) == null) {
                    synchronized (appx.class) {
                        if (appx.d == null) {
                            appx.d = (ahbe)new agzb((agzi)appx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appx.a;
            }
            case 4: {
                return new agza((agzi)appx.a);
            }
            case 3: {
                return new appx();
            }
            case 2: {
                return newMessageInfo((MessageLite)appx.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100c\u0001", new Object[] { "b", "c", anwx.a() });
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

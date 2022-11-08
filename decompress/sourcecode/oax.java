import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oax extends agzi implements ahax
{
    public static final oax a;
    private static volatile ahbe f;
    public boolean b;
    public agyo c;
    public agyo d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)oax.class, (agzi)(a = new oax()));
    }
    
    private oax() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = oax.f) == null) {
                    synchronized (oax.class) {
                        if (oax.f == null) {
                            oax.f = (ahbe)new agzb((agzi)oax.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return oax.a;
            }
            case 4: {
                return new agza((agzi)oax.a);
            }
            case 3: {
                return new oax();
            }
            case 2: {
                return newMessageInfo((MessageLite)oax.a, "\u0000\u0004\u0000\u0000\u0002\n\u0004\u0000\u0000\u0000\u0002\u0007\u0004\t\t\t\n\u0007", new Object[] { "b", "c", "d", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ozy extends agzi implements ahax
{
    public static final ozy a;
    private static volatile ahbe e;
    public int b;
    public String c;
    public int d;
    
    static {
        agzi.registerDefaultInstance((Class)ozy.class, (agzi)(a = new ozy()));
    }
    
    private ozy() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ozy.e) == null) {
                    synchronized (ozy.class) {
                        if (ozy.e == null) {
                            ozy.e = (ahbe)new agzb((agzi)ozy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ozy.a;
            }
            case 4: {
                return new agza((agzi)ozy.a);
            }
            case 3: {
                return new ozy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ozy.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", nim.k });
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

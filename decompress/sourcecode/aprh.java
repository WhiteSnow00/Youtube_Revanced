import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprh extends agzi implements ahax
{
    public static final aprh a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aprh.class, (agzi)(a = new aprh()));
    }
    
    private aprh() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aprh.c) == null) {
                    synchronized (aprh.class) {
                        if (aprh.c == null) {
                            aprh.c = (ahbe)new agzb((agzi)aprh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aprh.a;
            }
            case 4: {
                return new agza((agzi)aprh.a);
            }
            case 3: {
                return new aprh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

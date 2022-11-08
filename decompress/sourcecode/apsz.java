import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsz extends agzi implements ahax
{
    public static final apsz a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)apsz.class, (agzi)(a = new apsz()));
    }
    
    private apsz() {
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
                if ((c = apsz.c) == null) {
                    synchronized (apsz.class) {
                        if (apsz.c == null) {
                            apsz.c = (ahbe)new agzb((agzi)apsz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apsz.a;
            }
            case 4: {
                return new agza((agzi)apsz.a);
            }
            case 3: {
                return new apsz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

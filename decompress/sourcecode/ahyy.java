import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahyy extends agzi implements ahax
{
    public static final ahyy a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahyy.class, a = new ahyy());
    }
    
    private ahyy() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahyy.c) == null) {
                    synchronized (ahyy.class) {
                        if (ahyy.c == null) {
                            ahyy.c = (ahbe)new agzb((agzi)ahyy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahyy.a;
            }
            case 4: {
                return new agza((agzi)ahyy.a);
            }
            case 3: {
                return new ahyy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahyy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvo extends agzi implements ahax
{
    public static final amvo a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(amvo.class, a = new amvo());
    }
    
    private amvo() {
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
                if ((c = amvo.c) == null) {
                    synchronized (amvo.class) {
                        if (amvo.c == null) {
                            amvo.c = (ahbe)new agzb((agzi)amvo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amvo.a;
            }
            case 4: {
                return new agza((agzi)amvo.a);
            }
            case 3: {
                return new amvo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahim extends agzi implements ahax
{
    public static final ahim a;
    private static volatile ahbe c;
    public String b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahim.class, a = new ahim());
    }
    
    private ahim() {
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
                if ((c = ahim.c) == null) {
                    synchronized (ahim.class) {
                        if (ahim.c == null) {
                            ahim.c = (ahbe)new agzb((agzi)ahim.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahim.a;
            }
            case 4: {
                return new agza((agzi)ahim.a);
            }
            case 3: {
                return new ahim();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahim.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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

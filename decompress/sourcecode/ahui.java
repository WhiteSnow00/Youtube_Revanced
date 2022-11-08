import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahui extends agzi implements ahax
{
    public static final ahui a;
    private static volatile ahbe c;
    public boolean b;
    private int d;
    
    static {
        agzi.registerDefaultInstance(ahui.class, a = new ahui());
    }
    
    private ahui() {
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
                if ((c = ahui.c) == null) {
                    synchronized (ahui.class) {
                        if (ahui.c == null) {
                            ahui.c = (ahbe)new agzb((agzi)ahui.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahui.a;
            }
            case 4: {
                return new agza((agzi)ahui.a);
            }
            case 3: {
                return new ahui();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahui.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "d", "b" });
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

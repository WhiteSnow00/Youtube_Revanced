import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoou extends agzi implements ahax
{
    public static final aoou a;
    private static volatile ahbe c;
    public int b;
    private int d;
    
    static {
        agzi.registerDefaultInstance((Class)aoou.class, (agzi)(a = new aoou()));
    }
    
    private aoou() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = aoou.c) == null) {
                    synchronized (aoou.class) {
                        if (aoou.c == null) {
                            aoou.c = (ahbe)new agzb((agzi)aoou.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoou.a;
            }
            case 4: {
                return new agza((agzi)aoou.a);
            }
            case 3: {
                return new aoou();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoou.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "d", "b" });
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

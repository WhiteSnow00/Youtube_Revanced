import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoov extends agzi implements ahax
{
    public static final aoov a;
    private static volatile ahbe f;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)aoov.class, (agzi)(a = new aoov()));
    }
    
    private aoov() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aoov.f) == null) {
                    synchronized (aoov.class) {
                        if (aoov.f == null) {
                            aoov.f = (ahbe)new agzb((agzi)aoov.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoov.a;
            }
            case 4: {
                return new agza((agzi)aoov.a);
            }
            case 3: {
                return new aoov();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoov.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0005\u1007\u0004", new Object[] { "g", "b", "c", "d", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsw extends agzi implements ahax
{
    public static final apsw a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        agzi.registerDefaultInstance((Class)apsw.class, (agzi)(a = new apsw()));
    }
    
    private apsw() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apsw.f) == null) {
                    synchronized (apsw.class) {
                        if (apsw.f == null) {
                            apsw.f = (ahbe)new agzb((agzi)apsw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsw.a;
            }
            case 4: {
                return new agza((agzi)apsw.a);
            }
            case 3: {
                return new apsw();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[] { "b", "c", "d", "e" });
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

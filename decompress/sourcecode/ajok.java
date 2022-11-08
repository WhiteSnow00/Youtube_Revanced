import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajok extends agzi implements ahax
{
    public static final ajok a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public int d;
    public float e;
    
    static {
        agzi.registerDefaultInstance((Class)ajok.class, (agzi)(a = new ajok()));
    }
    
    private ajok() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ajok.f) == null) {
                    synchronized (ajok.class) {
                        if (ajok.f == null) {
                            ajok.f = (ahbe)new agzb((agzi)ajok.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajok.a;
            }
            case 4: {
                return new agza((agzi)ajok.a);
            }
            case 3: {
                return new ajok();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajok.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0003\u1001\u0002", new Object[] { "b", "c", "d", "e" });
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

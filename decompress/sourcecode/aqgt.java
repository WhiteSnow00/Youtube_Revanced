import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgt extends agzi implements ahax
{
    public static final aqgt a;
    private static volatile ahbe f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)aqgt.class, (agzi)(a = new aqgt()));
    }
    
    private aqgt() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aqgt.f) == null) {
                    synchronized (aqgt.class) {
                        if (aqgt.f == null) {
                            aqgt.f = (ahbe)new agzb((agzi)aqgt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqgt.a;
            }
            case 4: {
                return new agza((agzi)aqgt.a);
            }
            case 3: {
                return new aqgt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgt.a, "\u0001\u0003\u0000\u0001\u0007\u0014\u0003\u0000\u0000\u0000\u0007\u1007\u0004\b\u1007\u0005\u0014\u1007\b", new Object[] { "b", "c", "d", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidg extends agzi implements ahax
{
    public static final aidg a;
    private static volatile ahbe f;
    public float b;
    public float c;
    public float d;
    public float e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)aidg.class, (agzi)(a = new aidg()));
    }
    
    private aidg() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aidg.f) == null) {
                    synchronized (aidg.class) {
                        if (aidg.f == null) {
                            aidg.f = (ahbe)new agzb((agzi)aidg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aidg.a;
            }
            case 4: {
                return new agza((agzi)aidg.a);
            }
            case 3: {
                return new aidg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003", new Object[] { "g", "b", "c", "d", "e" });
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

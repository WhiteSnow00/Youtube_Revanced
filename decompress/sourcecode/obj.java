import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obj extends agzi implements ahax
{
    public static final obj a;
    private static volatile ahbe d;
    public int b;
    public int c;
    
    static {
        agzi.registerDefaultInstance((Class)obj.class, (agzi)(a = new obj()));
    }
    
    private obj() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = obj.d) == null) {
                    synchronized (obj.class) {
                        if (obj.d == null) {
                            obj.d = (ahbe)new agzb((agzi)obj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return obj.a;
            }
            case 4: {
                return new agza((agzi)obj.a);
            }
            case 3: {
                return new obj();
            }
            case 2: {
                return newMessageInfo((MessageLite)obj.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[] { "b", "c" });
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

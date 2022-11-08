import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzu extends agzi implements ahax
{
    public static final apzu a;
    private static volatile ahbe d;
    public int b;
    public float c;
    
    static {
        agzi.registerDefaultInstance(apzu.class, a = new apzu());
    }
    
    private apzu() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apzu.d) == null) {
                    synchronized (apzu.class) {
                        if (apzu.d == null) {
                            apzu.d = (ahbe)new agzb((agzi)apzu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzu.a;
            }
            case 4: {
                return new agza((agzi)apzu.a);
            }
            case 3: {
                return new apzu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apzu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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

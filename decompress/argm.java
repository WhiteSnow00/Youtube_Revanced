import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class argm extends ahcz implements aheo
{
    public static final argm a;
    private static volatile ahev e;
    public int b;
    public argl c;
    public argk d;
    
    static {
        ahcz.registerDefaultInstance(argm.class, a = new argm());
    }
    
    private argm() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = argm.e) == null) {
                    synchronized (argm.class) {
                        if (argm.e == null) {
                            argm.e = (ahev)new ahcs((ahcz)argm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return argm.a;
            }
            case 4: {
                return new ahcr((ahcz)argm.a);
            }
            case 3: {
                return new argm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)argm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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

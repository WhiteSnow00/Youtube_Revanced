import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjs extends ahcz implements aheo
{
    public static final apjs a;
    private static volatile ahev g;
    public int b;
    public apjq c;
    public int d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(apjs.class, a = new apjs());
    }
    
    private apjs() {
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apjs.g) == null) {
                    synchronized (apjs.class) {
                        if (apjs.g == null) {
                            apjs.g = (ahev)new ahcs((ahcz)apjs.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apjs.a;
            }
            case 4: {
                return new ahcr((ahcz)apjs.a);
            }
            case 3: {
                return new apjs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjs.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", apki.a(), "e", apkc.i, "f", apkh.a() });
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

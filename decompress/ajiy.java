import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiy extends ahcz implements aheo
{
    public static final ajiy a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public int d;
    
    static {
        final ajiy a2 = new ajiy();
        ahcz.registerDefaultInstance(ajiy.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aprw.a, a2, (MessageLite)a2, null, 393415810, ahgc.k, ajiy.class);
    }
    
    private ajiy() {
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
                if ((e = ajiy.e) == null) {
                    synchronized (ajiy.class) {
                        if (ajiy.e == null) {
                            ajiy.e = (ahev)new ahcs((ahcz)ajiy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajiy.a;
            }
            case 4: {
                return new ahcr((ahcz)ajiy.a);
            }
            case 3: {
                return new ajiy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajiy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aqbo.a() });
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

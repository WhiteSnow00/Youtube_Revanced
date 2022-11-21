import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlo extends ahcz implements aheo
{
    public static final ajlo a;
    private static volatile ahev e;
    public int b;
    public apry c;
    public apry d;
    
    static {
        ahcz.registerDefaultInstance(ajlo.class, a = new ajlo());
    }
    
    private ajlo() {
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
                if ((e = ajlo.e) == null) {
                    synchronized (ajlo.class) {
                        if (ajlo.e == null) {
                            ajlo.e = (ahev)new ahcs((ahcz)ajlo.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajlo.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlo.a);
            }
            case 3: {
                return new ajlo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlo.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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

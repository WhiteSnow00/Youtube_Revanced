import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxh extends ahcz implements aheo
{
    public static final alxh a;
    private static volatile ahev d;
    public boolean b;
    public ahtz c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(alxh.class, a = new alxh());
    }
    
    private alxh() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = alxh.d) == null) {
                    synchronized (alxh.class) {
                        if (alxh.d == null) {
                            alxh.d = (ahev)new ahcs((ahcz)alxh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alxh.a;
            }
            case 4: {
                return new ahcr((ahcz)alxh.a);
            }
            case 3: {
                return new alxh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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

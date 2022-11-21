import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjw extends ahcz implements aheo
{
    public static final apjw a;
    private static volatile ahev e;
    public int b;
    public apjq c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apjw.class, a = new apjw());
    }
    
    private apjw() {
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
                if ((e = apjw.e) == null) {
                    synchronized (apjw.class) {
                        if (apjw.e == null) {
                            apjw.e = (ahev)new ahcs((ahcz)apjw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjw.a;
            }
            case 4: {
                return new ahcr((ahcz)apjw.a);
            }
            case 3: {
                return new apjw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apki.a() });
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

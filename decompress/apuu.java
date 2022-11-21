import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuu extends ahcz implements aheo
{
    public static final apuu a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(apuu.class, a = new apuu());
    }
    
    private apuu() {
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
                if ((e = apuu.e) == null) {
                    synchronized (apuu.class) {
                        if (apuu.e == null) {
                            apuu.e = (ahev)new ahcs((ahcz)apuu.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apuu.a;
            }
            case 4: {
                return new ahcr((ahcz)apuu.a);
            }
            case 3: {
                return new apuu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuu.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", apqo.a() });
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

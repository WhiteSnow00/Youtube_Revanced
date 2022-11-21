import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajna extends ahcz implements aheo
{
    public static final ajna a;
    private static volatile ahev e;
    public int b;
    public int c;
    public ajmz d;
    
    static {
        ahcz.registerDefaultInstance(ajna.class, a = new ajna());
    }
    
    private ajna() {
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
                if ((e = ajna.e) == null) {
                    synchronized (ajna.class) {
                        if (ajna.e == null) {
                            ajna.e = (ahev)new ahcs((ahcz)ajna.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajna.a;
            }
            case 4: {
                return new ahcr((ahcz)ajna.a);
            }
            case 3: {
                return new ajna();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajna.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1009\u0001", new Object[] { "b", "c", ajgj.s, "d" });
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

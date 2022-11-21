import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alig extends ahcz implements aheo
{
    public static final alig a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(alig.class, a = new alig());
    }
    
    private alig() {
    }
    
    public static void a(final alig alig) {
        alig.c |= 0x1;
        alig.d = true;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alig.b) == null) {
                    synchronized (alig.class) {
                        if (alig.b == null) {
                            alig.b = (ahev)new ahcs((ahcz)alig.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alig.a;
            }
            case 4: {
                return new ahcr((ahcz)alig.a);
            }
            case 3: {
                return new alig();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alig.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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

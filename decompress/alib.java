import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alib extends ahcz implements aheo
{
    public static final alib a;
    private static volatile ahev g;
    public int b;
    public String c;
    public apry d;
    public alji e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(alib.class, a = new alib());
    }
    
    private alib() {
        this.c = "";
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
                if ((g = alib.g) == null) {
                    synchronized (alib.class) {
                        if (alib.g == null) {
                            alib.g = (ahev)new ahcs((ahcz)alib.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alib.a;
            }
            case 4: {
                return new ahcr((ahcz)alib.a);
            }
            case 3: {
                return new alib();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alib.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", "e", "f", alfq.i });
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

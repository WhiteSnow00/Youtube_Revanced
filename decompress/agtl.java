import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtl extends ahcz implements aheo
{
    public static final agtl a;
    private static volatile ahev b;
    private int c;
    private String d;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(agtl.class, a = new agtl());
    }
    
    private agtl() {
        this.f = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = agtl.b) == null) {
                    synchronized (agtl.class) {
                        if (agtl.b == null) {
                            agtl.b = (ahev)new ahcs((ahcz)agtl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agtl.a;
            }
            case 4: {
                return new ahcr((ahcz)agtl.a);
            }
            case 3: {
                return new agtl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1504\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

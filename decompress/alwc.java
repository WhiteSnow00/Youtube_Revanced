import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwc extends ahcz implements aheo
{
    public static final alwc a;
    private static volatile ahev d;
    public String b;
    public String c;
    private int e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(alwc.class, a = new alwc());
    }
    
    private alwc() {
        this.f = 2;
        this.b = "";
        this.c = "";
        emptyProtobufList();
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
                final ahev d;
                if ((d = alwc.d) == null) {
                    synchronized (alwc.class) {
                        if (alwc.d == null) {
                            alwc.d = (ahev)new ahcs((ahcz)alwc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alwc.a;
            }
            case 4: {
                return new ahcr((ahcz)alwc.a);
            }
            case 3: {
                return new alwc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwc.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0006", new Object[] { "e", "b", "c" });
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

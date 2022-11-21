import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amag extends ahcz implements aheo
{
    public static final amag a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public amvw d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amag.class, a = new amag());
    }
    
    private amag() {
        this.g = 2;
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = amag.f) == null) {
                    synchronized (amag.class) {
                        if (amag.f == null) {
                            amag.f = (ahev)new ahcs((ahcz)amag.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amag.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (char[][])null);
            }
            case 3: {
                return new amag();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amag.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0005\u001a", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}

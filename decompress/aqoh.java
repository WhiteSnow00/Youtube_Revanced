import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoh extends ahcz implements aheo
{
    public static final aqoh a;
    private static volatile ahev f;
    public int b;
    public ahdp c;
    public String d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqoh.class, a = new aqoh());
    }
    
    private aqoh() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = "";
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
                if ((f = aqoh.f) == null) {
                    synchronized (aqoh.class) {
                        if (aqoh.f == null) {
                            aqoh.f = (ahev)new ahcs((ahcz)aqoh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqoh.a;
            }
            case 4: {
                return new ahcr((byte[][][])null);
            }
            case 3: {
                return new aqoh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoh.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u041b\u0002\u1008\u0000\u0003\u001b", new Object[] { "b", "c", aqod.class, "d", "e", aqog.class });
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

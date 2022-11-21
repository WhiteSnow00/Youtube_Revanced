import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpx extends ahcz implements aheo
{
    public static final akpx a;
    private static volatile ahev e;
    public aknj b;
    public ahdp c;
    public String d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akpx.class, a = new akpx());
    }
    
    private akpx() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = "";
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
                final ahev e;
                if ((e = akpx.e) == null) {
                    synchronized (akpx.class) {
                        if (akpx.e == null) {
                            akpx.e = (ahev)new ahcs((ahcz)akpx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpx.a;
            }
            case 4: {
                return new ahcr((ahcz)akpx.a);
            }
            case 3: {
                return new akpx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpx.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0003\u001b\u0004\u1008\u0001", new Object[] { "f", "b", "c", akpy.class, "d" });
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

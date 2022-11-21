import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqal extends ahcz implements aheo
{
    public static final aqal a;
    private static volatile ahev c;
    public ahdp b;
    private int d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqal.class, a = new aqal());
    }
    
    private aqal() {
        this.f = 2;
        this.b = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev c;
                if ((c = aqal.c) == null) {
                    synchronized (aqal.class) {
                        if (aqal.c == null) {
                            aqal.c = (ahev)new ahcs((ahcz)aqal.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqal.a;
            }
            case 4: {
                return new ahcr((ahcz)aqal.a);
            }
            case 3: {
                return new aqal();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqal.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "d", "b", ajws.class, "e" });
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

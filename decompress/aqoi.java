import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqoi extends ahcz implements aheo
{
    public static final aqoi a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public aqoc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aqoi.class, a = new aqoi());
    }
    
    private aqoi() {
        this.f = 2;
        this.c = ahcz.emptyProtobufList();
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
                final ahev e;
                if ((e = aqoi.e) == null) {
                    synchronized (aqoi.class) {
                        if (aqoi.e == null) {
                            aqoi.e = (ahev)new ahcs((ahcz)aqoi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqoi.a;
            }
            case 4: {
                return new ahcr((boolean[][])null, (byte[])null);
            }
            case 3: {
                return new aqoi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqoi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u041b\u0002\u1009\u0000", new Object[] { "b", "c", aqoh.class, "d" });
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

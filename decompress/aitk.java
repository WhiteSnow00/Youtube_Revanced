import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitk extends ahcz implements aheo
{
    public static final aitk a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aitk.class, a = new aitk());
    }
    
    private aitk() {
        this.f = 2;
        this.c = "";
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aitk.e) == null) {
                    synchronized (aitk.class) {
                        if (aitk.e == null) {
                            aitk.e = (ahev)new ahcs((ahcz)aitk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aitk.a;
            }
            case 4: {
                return new ahcr((ahcz)aitk.a);
            }
            case 3: {
                return new aitk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "b", "c", "d", ajqh.class });
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

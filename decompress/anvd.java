import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvd extends ahcz implements aheo
{
    public static final anvd a;
    private static volatile ahev f;
    public int b;
    public ajws c;
    public anxb d;
    public ahbt e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(anvd.class, a = new anvd());
    }
    
    private anvd() {
        this.h = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = anvd.f) == null) {
                    synchronized (anvd.class) {
                        if (anvd.f == null) {
                            anvd.f = (ahev)new ahcs((ahcz)anvd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anvd.a;
            }
            case 4: {
                return new ahcr((ahcz)anvd.a);
            }
            case 3: {
                return new anvd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

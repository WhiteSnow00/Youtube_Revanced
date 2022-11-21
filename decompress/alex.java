import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alex extends ahcz implements aheo
{
    public static final alex a;
    private static volatile ahev e;
    public aknj b;
    public ahdp c;
    public ahdp d;
    private int f;
    private ajxn g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alex.class, a = new alex());
    }
    
    private alex() {
        this.h = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
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
                final ahev e;
                if ((e = alex.e) == null) {
                    synchronized (alex.class) {
                        if (alex.e == null) {
                            alex.e = (ahev)new ahcs((ahcz)alex.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alex.a;
            }
            case 4: {
                return new ahcr((ahcz)alex.a);
            }
            case 3: {
                return new alex();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alex.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0002\u0004\u0001\u1409\u0000\u0003\u041b\u0004\u041b\u0309\u1409\u0001", new Object[] { "f", "b", "c", alfe.class, "d", anxa.class, "g" });
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

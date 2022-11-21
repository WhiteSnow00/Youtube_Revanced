import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahll extends ahcz implements aheo
{
    public static final ahll a;
    private static volatile ahev d;
    public ahdp b;
    public ahlj c;
    private int e;
    private ahjl f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ahll.class, a = new ahll());
    }
    
    private ahll() {
        this.h = 2;
        this.b = ahcz.emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev d;
                if ((d = ahll.d) == null) {
                    synchronized (ahll.class) {
                        if (ahll.d == null) {
                            ahll.d = (ahev)new ahcs((ahcz)ahll.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahll.a;
            }
            case 4: {
                return new ahcr((ahcz)ahll.a);
            }
            case 3: {
                return new ahll();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahll.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0004\u0001\u041b\u0004\u1409\u0000\u0005\u1409\u0003\u0007\u1409\u0002", new Object[] { "e", "b", ahlk.class, "f", "g", "c" });
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

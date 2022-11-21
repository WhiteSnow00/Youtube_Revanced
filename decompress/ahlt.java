import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlt extends ahcz implements aheo
{
    public static final ahlt a;
    private static volatile ahev e;
    public ajws b;
    public ajws c;
    public ajoq d;
    private int f;
    private ajws g;
    private anxb h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(ahlt.class, a = new ahlt());
    }
    
    private ahlt() {
        this.i = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahlt.e) == null) {
                    synchronized (ahlt.class) {
                        if (ahlt.e == null) {
                            ahlt.e = (ahev)new ahcs((ahcz)ahlt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahlt.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlt.a);
            }
            case 3: {
                return new ahlt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlt.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004", new Object[] { "f", "g", "b", "c", "h", "d" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}

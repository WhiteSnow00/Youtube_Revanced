import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahoh extends ahcz implements aheo
{
    public static final ahoh a;
    private static volatile ahev e;
    public ahdp b;
    public ahdp c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(ahoh.class, a = new ahoh());
    }
    
    private ahoh() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = ahoh.e) == null) {
                    synchronized (ahoh.class) {
                        if (ahoh.e == null) {
                            ahoh.e = (ahev)new ahcs((ahcz)ahoh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahoh.a;
            }
            case 4: {
                return new ahcr((ahcz)ahoh.a);
            }
            case 3: {
                return new ahoh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahoh.a, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0002\u0000\u0005\u001b\u0006\u001b\u0007\u100c\u0000", new Object[] { "f", "b", ahon.class, "c", ahon.class, "d", ahld.j });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amls extends ahcz implements aheo
{
    public static final amls a;
    private static volatile ahev j;
    public boolean b;
    public boolean c;
    public boolean d;
    public aiel e;
    public boolean f;
    public ahdh g;
    public amsp h;
    public aoaf i;
    private int k;
    private int l;
    
    static {
        ahcz.registerDefaultInstance(amls.class, a = new amls());
    }
    
    private amls() {
        emptyIntList();
        ahcz.emptyProtobufList();
        this.g = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = amls.j) == null) {
                    synchronized (amls.class) {
                        if (amls.j == null) {
                            amls.j = (ahev)new ahcs((ahcz)amls.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amls.a;
            }
            case 4: {
                return new ahcr((ahcz)amls.a);
            }
            case 3: {
                return new amls();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amls.a, "\u0001\b\u0000\u0002\r+\b\u0000\u0001\u0000\r\u1007\t\u0019\u1007\u0010\"\u1007\u0019#\u1009\u001a$\u1007\u001b%\u0016&\u1009\u001c+\u1009 ", new Object[] { "k", "l", "b", "c", "d", "e", "f", "g", "h", "i" });
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

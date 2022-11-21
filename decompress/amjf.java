import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjf extends ahcz implements aheo
{
    public static final amjf a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private aisc e;
    private anxb f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(amjf.class, a = new amjf());
    }
    
    private amjf() {
        this.i = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = amjf.b) == null) {
                    synchronized (amjf.class) {
                        if (amjf.b == null) {
                            amjf.b = (ahev)new ahcs((ahcz)amjf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amjf.a;
            }
            case 4: {
                return new ahcr((ahcz)amjf.a);
            }
            case 3: {
                return new amjf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjf.a, "\u0001\u0005\u0000\u0001\u0004\u0016\u0005\u0000\u0000\u0005\u0004\u1409\b\u0005\u1409\n\b\u1409\u0005\u0013\u1409\u0002\u0016\u1409\u0006", new Object[] { "c", "g", "h", "e", "d", "f" });
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

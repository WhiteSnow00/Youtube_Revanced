import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amng extends ahcz implements aheo
{
    public static final amng a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private aisc e;
    private aisc f;
    private ajws g;
    private anxb h;
    private anxb i;
    private amiy j;
    private anxb k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(amng.class, a = new amng());
    }
    
    private amng() {
        this.m = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = amng.b) == null) {
                    synchronized (amng.class) {
                        if (amng.b == null) {
                            amng.b = (ahev)new ahcs((ahcz)amng.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amng.a;
            }
            case 4: {
                return new ahcr((ahcz)amng.a);
            }
            case 3: {
                return new amng();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amng.a, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0000\t\u0002\u1409\u0000\u0004\u1409\u0003\u0006\u1409\n\u0007\u1409\r\t\u1409\u0005\f\u1409\t\u000f\u1409\u0001\u0010\u1409\u0006\u0011\u1409\u0002", new Object[] { "c", "d", "g", "k", "l", "h", "j", "e", "i", "f" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}

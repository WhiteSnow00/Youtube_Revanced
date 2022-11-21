import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmu extends ahcz implements aheo
{
    public static final ajmu a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private amiy g;
    private ajws h;
    private ajws i;
    private aisc j;
    private akdr k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ajmu.class, a = new ajmu());
    }
    
    private ajmu() {
        this.m = 2;
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
                if ((b = ajmu.b) == null) {
                    synchronized (ajmu.class) {
                        if (ajmu.b == null) {
                            ajmu.b = (ahev)new ahcs((ahcz)ajmu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajmu.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmu.a);
            }
            case 3: {
                return new ajmu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmu.a, "\u0001\t\u0000\u0001\u0005\u0012\t\u0000\u0000\t\u0005\u1409\u0013\b\u1409\u000e\t\u1409\u000f\n\u1409\u0010\u000b\u1409\u0012\u000f\u1409\u0007\u0010\u1409\u0011\u0011\u1409\t\u0012\u1409\u0002", new Object[] { "c", "l", "g", "h", "i", "k", "e", "j", "f", "d" });
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

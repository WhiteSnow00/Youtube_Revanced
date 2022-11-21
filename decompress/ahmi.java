import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmi extends ahcz implements aheo
{
    public static final ahmi a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private anxb i;
    private anxb j;
    private aisc k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(ahmi.class, a = new ahmi());
    }
    
    private ahmi() {
        this.m = 2;
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
                if ((b = ahmi.b) == null) {
                    synchronized (ahmi.class) {
                        if (ahmi.b == null) {
                            ahmi.b = (ahev)new ahcs((ahcz)ahmi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahmi.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmi.a);
            }
            case 3: {
                return new ahmi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmi.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\t\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0007\u0007\u1409\u000b\n\u1409\u0006\u000b\u1409\u0000", new Object[] { "c", "e", "f", "g", "h", "i", "k", "l", "j", "d" });
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

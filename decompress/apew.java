import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apew extends ahcz implements aheo
{
    public static final apew a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apew.class, a = new apew());
    }
    
    private apew() {
        this.i = 2;
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
                if ((b = apew.b) == null) {
                    synchronized (apew.class) {
                        if (apew.b == null) {
                            apew.b = (ahev)new ahcs((ahcz)apew.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apew.a;
            }
            case 4: {
                return new ahcr((ahcz)apew.a);
            }
            case 3: {
                return new apew();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apew.a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\b\u0007\u1409\u0004\b\u1409\u0005", new Object[] { "c", "d", "e", "h", "f", "g" });
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

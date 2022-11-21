import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwo extends ahcz implements aheo
{
    public static final apwo a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private aisc e;
    private aisc f;
    private aisc g;
    private aisc h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apwo.class, a = new apwo());
    }
    
    private apwo() {
        this.i = 2;
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
                if ((b = apwo.b) == null) {
                    synchronized (apwo.class) {
                        if (apwo.b == null) {
                            apwo.b = (ahev)new ahcs((ahcz)apwo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apwo.a;
            }
            case 4: {
                return new ahcr((ahcz)apwo.a);
            }
            case 3: {
                return new apwo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwo.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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

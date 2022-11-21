import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojn extends ahcz implements aheo
{
    public static final aojn a;
    private static volatile ahev b;
    private int c;
    private aisc d;
    private ajws e;
    private ajws f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aojn.class, a = new aojn());
    }
    
    private aojn() {
        this.h = 2;
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
                final ahev b;
                if ((b = aojn.b) == null) {
                    synchronized (aojn.class) {
                        if (aojn.b == null) {
                            aojn.b = (ahev)new ahcs((ahcz)aojn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojn.a;
            }
            case 4: {
                return new ahcr((ahcz)aojn.a);
            }
            case 3: {
                return new aojn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojn.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0004\u0003\u1409\u0000\u0004\u1409\u0001\u0006\u1409\u0003", new Object[] { "c", "g", "d", "e", "f" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anuk extends ahcz implements aheo
{
    public static final anuk a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ajws f;
    private anxb g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(anuk.class, a = new anuk());
    }
    
    private anuk() {
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
                if ((b = anuk.b) == null) {
                    synchronized (anuk.class) {
                        if (anuk.b == null) {
                            anuk.b = (ahev)new ahcs((ahcz)anuk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anuk.a;
            }
            case 4: {
                return new ahcr((ahcz)anuk.a);
            }
            case 3: {
                return new anuk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anuk.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h" });
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

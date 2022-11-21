import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfd extends ahcz implements aheo
{
    public static final apfd a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private ajws e;
    private anxb f;
    private ajws g;
    private ajws h;
    private aisc i;
    private aibx j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(apfd.class, a = new apfd());
    }
    
    private apfd() {
        this.l = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfd.b) == null) {
                    synchronized (apfd.class) {
                        if (apfd.b == null) {
                            apfd.b = (ahev)new ahcs((ahcz)apfd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfd.a;
            }
            case 4: {
                return new ahcr((ahcz)apfd.a);
            }
            case 3: {
                return new apfd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfd.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\b\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", "k", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}

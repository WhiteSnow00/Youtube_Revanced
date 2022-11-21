import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alof extends ahcz implements aheo
{
    public static final alof a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private anxb h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alof.class, a = new alof());
    }
    
    private alof() {
        this.j = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alof.b) == null) {
                    synchronized (alof.class) {
                        if (alof.b == null) {
                            alof.b = (ahev)new ahcs((ahcz)alof.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alof.a;
            }
            case 4: {
                return new ahcr((ahcz)alof.a);
            }
            case 3: {
                return new alof();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alof.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0007\u1409\u0003\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "h", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}

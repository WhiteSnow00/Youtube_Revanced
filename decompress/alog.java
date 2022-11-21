import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alog extends ahcz implements aheo
{
    public static final alog a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ajws h;
    private aisc i;
    private aisc j;
    private aisc k;
    private ajws l;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(alog.class, a = new alog());
    }
    
    private alog() {
        this.n = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = alog.b) == null) {
                    synchronized (alog.class) {
                        if (alog.b == null) {
                            alog.b = (ahev)new ahcs((ahcz)alog.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alog.a;
            }
            case 4: {
                return new ahcr((ahcz)alog.a);
            }
            case 3: {
                return new alog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alog.a, "\u0001\n\u0000\u0001\u0002\r\n\u0000\u0000\n\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\b\t\u1409\t\f\u1409\u000b\r\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}

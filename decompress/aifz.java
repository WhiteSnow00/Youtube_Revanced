import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifz extends ahcz implements aheo
{
    public static final aifz a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private aisc g;
    private aisc h;
    private aiet i;
    private aiet j;
    private aiet k;
    private aisc l;
    private aisc m;
    private aisc n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(aifz.class, a = new aifz());
    }
    
    private aifz() {
        this.p = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aifz.b) == null) {
                    synchronized (aifz.class) {
                        if (aifz.b == null) {
                            aifz.b = (ahev)new ahcs((ahcz)aifz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifz.a;
            }
            case 4: {
                return new ahcr((ahcz)aifz.a);
            }
            case 3: {
                return new aifz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifz.a, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000b\r\u1409\u0010\u000f\u1409\u0014\u0013\u1409\u0011\u0014\u1409\u0012\u0016\u1409\u0006", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "l", "o", "m", "n", "g" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}

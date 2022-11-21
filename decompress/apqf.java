import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqf extends ahcz implements aheo
{
    public static final apqf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private apqh f;
    private apqg g;
    private aisc h;
    private anxb i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private ajws o;
    private ahjl p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(apqf.class, a = new apqf());
    }
    
    private apqf() {
        this.q = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apqf.b) == null) {
                    synchronized (apqf.class) {
                        if (apqf.b == null) {
                            apqf.b = (ahev)new ahcs((ahcz)apqf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqf.a;
            }
            case 4: {
                return new ahcr((ahcz)apqf.a);
            }
            case 3: {
                return new apqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqf.a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0006\u1409\u0011\b\u1409\u0004\t\u1409\u0005\u000e\u1409\t\u000f\u1409\u000b\u0010\u1409\f\u0013\u1409\u0010\u0014\u1409\r\u0015\u1409\n", new Object[] { "c", "d", "e", "f", "g", "p", "h", "i", "j", "l", "m", "o", "n", "k" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}

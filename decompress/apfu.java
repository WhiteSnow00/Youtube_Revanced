import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfu extends ahcz implements aheo
{
    public static final apfu a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private apfa h;
    private aiet i;
    private aiet j;
    private ajws k;
    private aiet l;
    private aiet m;
    private aiet n;
    private ahjl o;
    private byte p;
    
    static {
        ahcz.registerDefaultInstance(apfu.class, a = new apfu());
    }
    
    private apfu() {
        this.p = 2;
        emptyProtobufList();
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
                if ((b = apfu.b) == null) {
                    synchronized (apfu.class) {
                        if (apfu.b == null) {
                            apfu.b = (ahev)new ahcs((ahcz)apfu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfu.a;
            }
            case 4: {
                return new ahcr((ahcz)apfu.a);
            }
            case 3: {
                return new apfu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfu.a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0000\f\u0002\u1409\u0002\u0003\u1409\u0005\u0004\u1409\u0007\u0006\u1409\u000f\u0007\u1409\b\b\u1409\u0004\t\u1409\t\f\u1409\n\r\u1409\u000b\u000e\u1409\f\u000f\u1409\r\u0011\u1409\u0003", new Object[] { "c", "d", "g", "h", "o", "i", "f", "j", "k", "l", "m", "n", "e" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfg extends ahcz implements aheo
{
    public static final apfg a;
    private static volatile ahev b;
    private int c;
    private int d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private ajws k;
    private ajws l;
    private ajws m;
    private ajws n;
    private ajws o;
    private aibx p;
    private aibx q;
    private aisc r;
    private aisc s;
    private aisc t;
    private anxb u;
    private aibx v;
    private anxb w;
    private aibx x;
    private ahjl y;
    private byte z;
    
    static {
        ahcz.registerDefaultInstance(apfg.class, a = new apfg());
    }
    
    private apfg() {
        this.z = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte z = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfg.b) == null) {
                    synchronized (apfg.class) {
                        if (apfg.b == null) {
                            apfg.b = (ahev)new ahcs((ahcz)apfg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfg.a;
            }
            case 4: {
                return new ahcr((ahcz)apfg.a);
            }
            case 3: {
                return new apfg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfg.a, "\u0001\u0015\u0000\u0002\u0003$\u0015\u0000\u0000\u0015\u0003\u1409\f\u0004\u1409\u000e\u0005\u1409\u000f\u0006\u1409\u0010\u0007\u1409\u0011\b\u1409\u0018\t\u1409\u0014\u000b\u1409\"\u000e\u1409\u0016\u000f\u1409\b\u0010\u1409\n\u0013\u1409\u0019\u0014\u1409\u000b\u0018\u1409\u001c\u0019\u1409\r\u001a\u1409\u001d\u001c\u1409\u001f\u001e\u1409\u001e\u001f\u1409\u0017\"\u1409\t$\u1409 ", new Object[] { "c", "d", "i", "k", "l", "m", "n", "r", "o", "y", "p", "e", "g", "s", "h", "t", "j", "u", "w", "v", "q", "f", "x" });
            }
            case 1: {
                if (o == null) {
                    z = 0;
                }
                this.z = z;
                return null;
            }
            case 0: {
                return this.z;
            }
        }
    }
}

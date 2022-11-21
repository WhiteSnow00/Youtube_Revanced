import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxf extends ahcz implements aheo
{
    public static final alxf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private alxe f;
    private ajws g;
    private ajws h;
    private ajws i;
    private alxe j;
    private ajws k;
    private ajws l;
    private alxe m;
    private ajws n;
    private ajws o;
    private alxe p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(alxf.class, a = new alxf());
    }
    
    private alxf() {
        this.q = 2;
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
                if ((b = alxf.b) == null) {
                    synchronized (alxf.class) {
                        if (alxf.b == null) {
                            alxf.b = (ahev)new ahcs((ahcz)alxf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return alxf.a;
            }
            case 4: {
                return new ahcr((ahcz)alxf.a);
            }
            case 3: {
                return new alxf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxf.a, "\u0001\r\u0000\u0001\u0003\u000f\r\u0000\u0000\r\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p" });
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

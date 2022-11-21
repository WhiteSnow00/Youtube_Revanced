import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcv extends ahcz implements aheo
{
    public static final akcv a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(akcv.class, a = new akcv());
    }
    
    private akcv() {
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
                if ((b = akcv.b) == null) {
                    synchronized (akcv.class) {
                        if (akcv.b == null) {
                            akcv.b = (ahev)new ahcs((ahcz)akcv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akcv.a;
            }
            case 4: {
                return new ahcr((ahcz)akcv.a);
            }
            case 3: {
                return new akcv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcv.a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0006\u0006\u1409\b\t\u1409\u0002\n\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "f", "g" });
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

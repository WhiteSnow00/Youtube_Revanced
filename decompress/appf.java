import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appf extends ahcz implements aheo
{
    public static final appf a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private appg e;
    private aisc f;
    private ajws g;
    private aisc h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(appf.class, a = new appf());
    }
    
    private appf() {
        this.j = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = appf.b) == null) {
                    synchronized (appf.class) {
                        if (appf.b == null) {
                            appf.b = (ahev)new ahcs((ahcz)appf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appf.a;
            }
            case 4: {
                return new ahcr((ahcz)appf.a);
            }
            case 3: {
                return new appf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appf.a, "\u0001\u0006\u0000\u0001\u0004\u000f\u0006\u0000\u0000\u0006\u0004\u1409\u0003\u0006\u1409\u0005\u000b\u1409\u0007\f\u1409\b\r\u1409\t\u000f\u1409\n", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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

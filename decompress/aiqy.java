import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiqy extends ahcz implements aheo
{
    public static final aiqy a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private anxb h;
    private aisc i;
    private aisc j;
    private ajws k;
    private ajws l;
    private aisc m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(aiqy.class, a = new aiqy());
    }
    
    private aiqy() {
        this.o = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aiqy.b) == null) {
                    synchronized (aiqy.class) {
                        if (aiqy.b == null) {
                            aiqy.b = (ahev)new ahcs((ahcz)aiqy.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiqy.a;
            }
            case 4: {
                return new ahcr((ahcz)aiqy.a);
            }
            case 3: {
                return new aiqy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiqy.a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002\u1409\f\u0004\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\b\u1409\u0004\n\u1409\u0005\u000b\u1409\u0006\f\u1409\u0007\r\u1409\b\u000e\u1409\t\u000f\u1409\n", new Object[] { "c", "n", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}

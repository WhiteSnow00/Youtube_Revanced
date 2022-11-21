import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apez extends ahcz implements aheo
{
    public static final apez a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aiet e;
    private ajws f;
    private ajws g;
    private ajws h;
    private aiet i;
    private aiet j;
    private apey k;
    private ahjl l;
    private byte m;
    
    static {
        ahcz.registerDefaultInstance(apez.class, a = new apez());
    }
    
    private apez() {
        this.m = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apez.b) == null) {
                    synchronized (apez.class) {
                        if (apez.b == null) {
                            apez.b = (ahev)new ahcs((ahcz)apez.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apez.a;
            }
            case 4: {
                return new ahcr((ahcz)apez.a);
            }
            case 3: {
                return new apez();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apez.a, "\u0001\t\u0000\u0001\u0003\u000b\t\u0000\u0000\t\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\u0007\n\u1409\b\u000b\u1409\t", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}

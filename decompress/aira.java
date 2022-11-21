import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aira extends ahcz implements aheo
{
    public static final aira a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private anxb f;
    private anxb g;
    private anxb h;
    private anxb i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aira.class, a = new aira());
    }
    
    private aira() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aira.b) == null) {
                    synchronized (aira.class) {
                        if (aira.b == null) {
                            aira.b = (ahev)new ahcs((ahcz)aira.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aira.a;
            }
            case 4: {
                return new ahcr((ahcz)aira.a);
            }
            case 3: {
                return new aira();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aira.a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002\u1409\u000b\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\u0001\t\u1409\b\n\u1409\t", new Object[] { "c", "j", "e", "f", "g", "d", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}

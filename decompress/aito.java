import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aito extends ahcz implements aheo
{
    public static final aito a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ajws h;
    private amiy i;
    private aibr j;
    private ahjl k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aito.class, a = new aito());
    }
    
    private aito() {
        this.l = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aito.b) == null) {
                    synchronized (aito.class) {
                        if (aito.b == null) {
                            aito.b = (ahev)new ahcs((ahcz)aito.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aito.a;
            }
            case 4: {
                return new ahcr((ahcz)aito.a);
            }
            case 3: {
                return new aito();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aito.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0003\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0007\u1409\b\b\u1409\u0001\t\u1409\u0002", new Object[] { "c", "d", "g", "h", "i", "j", "k", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}

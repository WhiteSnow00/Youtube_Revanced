import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqad extends ahcz implements aheo
{
    public static final aqad a;
    private static volatile ahev f;
    public int b;
    public String c;
    public ajws d;
    public aqag e;
    private ajws g;
    private ajws h;
    private ajws i;
    private ajws j;
    private aqaf k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(aqad.class, a = new aqad());
    }
    
    private aqad() {
        this.l = 2;
        this.c = "";
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
                final ahev f;
                if ((f = aqad.f) == null) {
                    synchronized (aqad.class) {
                        if (aqad.f == null) {
                            aqad.f = (ahev)new ahcs((ahcz)aqad.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqad.a;
            }
            case 4: {
                return new ahcr((ahcz)aqad.a);
            }
            case 3: {
                return new aqad();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqad.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\u0005", new Object[] { "b", "c", "g", "d", "h", "i", "e", "k", "j" });
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

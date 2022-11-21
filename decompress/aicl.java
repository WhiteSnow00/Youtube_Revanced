import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicl extends ahcz implements aheo
{
    public static final aicl a;
    private static volatile ahev h;
    public int b;
    public String c;
    public ajws d;
    public ajws e;
    public ajws f;
    public aicm g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aicl.class, a = new aicl());
    }
    
    private aicl() {
        this.j = 2;
        this.c = "";
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
                final ahev h;
                if ((h = aicl.h) == null) {
                    synchronized (aicl.class) {
                        if (aicl.h == null) {
                            aicl.h = (ahev)new ahcs((ahcz)aicl.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aicl.a;
            }
            case 4: {
                return new ahcr((ahcz)aicl.a);
            }
            case 3: {
                return new aicl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicl.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001\u1008\u0000\u0002\u1409\u0001\u0004\u1409\u0006\u0005\u1009\u0005\b\u1409\u0002\t\u1409\u0003", new Object[] { "b", "c", "d", "i", "g", "e", "f" });
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

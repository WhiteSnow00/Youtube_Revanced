import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aicj extends ahcz implements aheo
{
    public static final aicj a;
    private static volatile ahev h;
    public int b;
    public String c;
    public akfj d;
    public String e;
    public ajws f;
    public aick g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aicj.class, a = new aicj());
    }
    
    private aicj() {
        this.j = 2;
        this.c = "";
        this.e = "";
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
                if ((h = aicj.h) == null) {
                    synchronized (aicj.class) {
                        if (aicj.h == null) {
                            aicj.h = (ahev)new ahcs((ahcz)aicj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aicj.a;
            }
            case 4: {
                return new ahcr((ahcz)aicj.a);
            }
            case 3: {
                return new aicj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aicj.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0003\u0003\u1009\u0004\u0004\u1409\u0005\u0006\u1008\u0002\u0007\u1409\u0001", new Object[] { "b", "c", "f", "g", "i", "e", "d" });
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

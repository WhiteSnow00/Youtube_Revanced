import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvc extends ahcz implements aheo
{
    public static final apvc a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private apvb f;
    private apva g;
    private aofv h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apvc.class, a = new apvc());
    }
    
    private apvc() {
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
                if ((b = apvc.b) == null) {
                    synchronized (apvc.class) {
                        if (apvc.b == null) {
                            apvc.b = (ahev)new ahcs((ahcz)apvc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apvc.a;
            }
            case 4: {
                return new ahcr((ahcz)apvc.a);
            }
            case 3: {
                return new apvc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvc.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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

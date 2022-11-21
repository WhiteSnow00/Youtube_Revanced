import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzf extends ahcz implements aheo
{
    public static final apzf a;
    private static volatile ahev e;
    public ajws b;
    public ajws c;
    public ajws d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apzf.class, a = new apzf());
    }
    
    private apzf() {
        this.h = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apzf.e) == null) {
                    synchronized (apzf.class) {
                        if (apzf.e == null) {
                            apzf.e = (ahev)new ahcs((ahcz)apzf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apzf.a;
            }
            case 4: {
                return new ahcr((ahcz)apzf.a);
            }
            case 3: {
                return new apzf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzf.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}

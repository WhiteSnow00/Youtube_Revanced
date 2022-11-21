import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjj extends ahcz implements aheo
{
    public static final apjj a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ajws d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apjj.class, a = new apjj());
    }
    
    private apjj() {
        this.f = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apjj.e) == null) {
                    synchronized (apjj.class) {
                        if (apjj.e == null) {
                            apjj.e = (ahev)new ahcs((ahcz)apjj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjj.a;
            }
            case 4: {
                return new ahcr((ahcz)apjj.a);
            }
            case 3: {
                return new apjj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}

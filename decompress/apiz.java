import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apiz extends ahcz implements aheo
{
    public static final apiz a;
    private static volatile ahev e;
    public int b;
    public String c;
    public amab d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apiz.class, a = new apiz());
    }
    
    private apiz() {
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
                if ((e = apiz.e) == null) {
                    synchronized (apiz.class) {
                        if (apiz.e == null) {
                            apiz.e = (ahev)new ahcs((ahcz)apiz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apiz.a;
            }
            case 4: {
                return new ahcr((ahcz)apiz.a);
            }
            case 3: {
                return new apiz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apiz.a, "\u0001\u0002\u0000\u0001\u0005\ufca3\u420e\u0002\u0000\u0000\u0001\u0005\u1008\u0004\ufca3\u420e\u1409\u0006", new Object[] { "b", "c", "d" });
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

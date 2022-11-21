import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifr extends ahcz implements aheo
{
    public static final aifr a;
    private static volatile ahev f;
    public int b;
    public boolean c;
    public apmz d;
    public String e;
    private ahto g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aifr.class, a = new aifr());
    }
    
    private aifr() {
        this.h = 2;
        this.e = "";
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
                final ahev f;
                if ((f = aifr.f) == null) {
                    synchronized (aifr.class) {
                        if (aifr.f == null) {
                            aifr.f = (ahev)new ahcs((ahcz)aifr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aifr.a;
            }
            case 4: {
                return new ahcr((ahcz)aifr.a);
            }
            case 3: {
                return new aifr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifr.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0001\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1409\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "g", "e" });
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

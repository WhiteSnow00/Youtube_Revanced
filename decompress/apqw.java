import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqw extends ahcz implements aheo
{
    public static final apqw a;
    private static volatile ahev b;
    private int c;
    private aies d;
    private aooo e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apqw.class, a = new apqw());
    }
    
    private apqw() {
        this.f = 2;
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
                final ahev b;
                if ((b = apqw.b) == null) {
                    synchronized (apqw.class) {
                        if (apqw.b == null) {
                            apqw.b = (ahev)new ahcs((ahcz)apqw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqw.a;
            }
            case 4: {
                return new ahcr((ahcz)apqw.a);
            }
            case 3: {
                return new apqw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqw.a, "\u0001\u0002\u0000\u0001\ue2d9\u1a6d\ueb11\u1f11\u0002\u0000\u0000\u0002\ue2d9\u1a6d\u1409\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "e", "d" });
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

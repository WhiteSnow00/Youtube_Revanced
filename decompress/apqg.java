import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqg extends ahcz implements aheo
{
    public static final apqg a;
    private static volatile ahev b;
    private int c;
    private apmr d;
    private amiv e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(apqg.class, a = new apqg());
    }
    
    private apqg() {
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
                if ((b = apqg.b) == null) {
                    synchronized (apqg.class) {
                        if (apqg.b == null) {
                            apqg.b = (ahev)new ahcs((ahcz)apqg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqg.a;
            }
            case 4: {
                return new ahcr((ahcz)apqg.a);
            }
            case 3: {
                return new apqg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqg.a, "\u0001\u0002\u0000\u0001\ueaaa\u1fae\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaa\u1fae\u1409\u0001\uf6ae\u2fd9\u1409\u0000", new Object[] { "c", "e", "d" });
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

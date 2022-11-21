import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcz extends ahcz implements aheo
{
    public static final apcz a;
    private static volatile ahev d;
    public int b;
    public apcy c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apcz.class, a = new apcz());
    }
    
    private apcz() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apcz.d) == null) {
                    synchronized (apcz.class) {
                        if (apcz.d == null) {
                            apcz.d = (ahev)new ahcs((ahcz)apcz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apcz.a;
            }
            case 4: {
                return new ahcr((ahcz)apcz.a);
            }
            case 3: {
                return new apcz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apcz.a, "\u0001\u0001\u0000\u0001\uee1e\u2b1f\uee1e\u2b1f\u0001\u0000\u0000\u0001\uee1e\u2b1f\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

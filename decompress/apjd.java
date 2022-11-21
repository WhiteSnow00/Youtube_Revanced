import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjd extends ahcz implements aheo
{
    public static final apjd a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(apjd.class, a = new apjd());
    }
    
    private apjd() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apjd.d) == null) {
                    synchronized (apjd.class) {
                        if (apjd.d == null) {
                            apjd.d = (ahev)new ahcs((ahcz)apjd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apjd.a;
            }
            case 4: {
                return new ahcr((ahcz)apjd.a);
            }
            case 3: {
                return new apjd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjd.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}

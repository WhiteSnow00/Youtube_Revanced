import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqd extends ahcz implements aheo
{
    public static final apqd a;
    private static volatile ahev e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(apqd.class, a = new apqd());
    }
    
    private apqd() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apqd.e) == null) {
                    synchronized (apqd.class) {
                        if (apqd.e == null) {
                            apqd.e = (ahev)new ahcs((ahcz)apqd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apqd.a;
            }
            case 4: {
                return new ahcr((ahcz)apqd.a);
            }
            case 3: {
                return new apqd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqc extends ahcz implements aheo
{
    public static final apqc a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public long f;
    
    static {
        final apqc a2 = new apqc();
        ahcz.registerDefaultInstance(apqc.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 76, ahgc.k, apqc.class);
    }
    
    private apqc() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apqc.g) == null) {
                    synchronized (apqc.class) {
                        if (apqc.g == null) {
                            apqc.g = (ahev)new ahcs((ahcz)apqc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apqc.a;
            }
            case 4: {
                return new ahcr((ahcz)apqc.a);
            }
            case 3: {
                return new apqc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "c", "d", "e", "f" });
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

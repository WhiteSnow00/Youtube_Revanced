import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnb extends ahcz implements aheo
{
    public static final ahnb a;
    private static volatile ahev d;
    public int b;
    public ahmr c;
    
    static {
        ahcz.registerDefaultInstance(ahnb.class, a = new ahnb());
    }
    
    private ahnb() {
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
                if ((d = ahnb.d) == null) {
                    synchronized (ahnb.class) {
                        if (ahnb.d == null) {
                            ahnb.d = (ahev)new ahcs((ahcz)ahnb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahnb.a;
            }
            case 4: {
                return new ahcr((ahcz)ahnb.a);
            }
            case 3: {
                return new ahnb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnb.a, "\u0001\u0001\u0000\u0001\uea6f\u32ff\uea6f\u32ff\u0001\u0000\u0000\u0000\uea6f\u32ff\u1009\u0000", new Object[] { "b", "c" });
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

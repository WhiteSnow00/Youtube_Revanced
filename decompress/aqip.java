import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqip extends ahcz implements aheo
{
    public static final aqip a;
    public static final ahcx b;
    private static volatile ahev e;
    public int c;
    public ahbt d;
    
    static {
        final aqip a2 = new aqip();
        ahcz.registerDefaultInstance(aqip.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkb.a, a2, (MessageLite)a2, null, 169768054, ahgc.k, aqip.class);
    }
    
    private aqip() {
        this.d = ahbt.b;
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
                if ((e = aqip.e) == null) {
                    synchronized (aqip.class) {
                        if (aqip.e == null) {
                            aqip.e = (ahev)new ahcs((ahcz)aqip.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqip.a;
            }
            case 4: {
                return new ahcr((ahcz)aqip.a);
            }
            case 3: {
                return new aqip();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqip.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u100a\u0000", new Object[] { "c", "d" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrh extends ahcz implements aheo
{
    public static final aqrh a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(aqrh.class, a = new aqrh());
    }
    
    private aqrh() {
        this.c = ahbt.b;
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
                if ((d = aqrh.d) == null) {
                    synchronized (aqrh.class) {
                        if (aqrh.d == null) {
                            aqrh.d = (ahev)new ahcs((ahcz)aqrh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqrh.a;
            }
            case 4: {
                return new ahcr((ahcz)aqrh.a);
            }
            case 3: {
                return new aqrh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqrh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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

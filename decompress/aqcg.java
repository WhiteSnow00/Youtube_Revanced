import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcg extends ahcz implements aheo
{
    public static final aqcg a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(aqcg.class, a = new aqcg());
    }
    
    private aqcg() {
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
                if ((d = aqcg.d) == null) {
                    synchronized (aqcg.class) {
                        if (aqcg.d == null) {
                            aqcg.d = (ahev)new ahcs((ahcz)aqcg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqcg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcg.a);
            }
            case 3: {
                return new aqcg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "b", "c", apvm.r });
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

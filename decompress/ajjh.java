import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjh extends ahcz implements aheo
{
    public static final ajjh a;
    private static volatile ahev d;
    public int b;
    public boolean c;
    
    static {
        ahcz.registerDefaultInstance(ajjh.class, a = new ajjh());
    }
    
    private ajjh() {
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
                if ((d = ajjh.d) == null) {
                    synchronized (ajjh.class) {
                        if (ajjh.d == null) {
                            ajjh.d = (ahev)new ahcs((ahcz)ajjh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajjh.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjh.a);
            }
            case 3: {
                return new ajjh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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

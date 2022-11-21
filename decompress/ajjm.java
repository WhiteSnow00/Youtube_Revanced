import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjm extends ahcz implements aheo
{
    public static final ajjm a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ajjm.class, a = new ajjm());
    }
    
    private ajjm() {
        this.b = 0;
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
                if ((d = ajjm.d) == null) {
                    synchronized (ajjm.class) {
                        if (ajjm.d == null) {
                            ajjm.d = (ahev)new ahcs((ahcz)ajjm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajjm.a;
            }
            case 4: {
                return new ahcr((ahcz)ajjm.a);
            }
            case 3: {
                return new ajjm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajjm.a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000", new Object[] { "c", "b", ajjg.class, ajjj.class, ajjk.class, ajjl.class, ajjh.class });
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

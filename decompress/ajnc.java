import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnc extends ahcz implements aheo
{
    public static final ajnc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ajnc.class, a = new ajnc());
    }
    
    private ajnc() {
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
                if ((d = ajnc.d) == null) {
                    synchronized (ajnc.class) {
                        if (ajnc.d == null) {
                            ajnc.d = (ahev)new ahcs((ahcz)ajnc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnc.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnc.a);
            }
            case 3: {
                return new ajnc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnc.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000\u0003\u103b\u0000", new Object[] { "c", "b", anys.class });
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

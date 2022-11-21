import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajng extends ahcz implements aheo
{
    public static final ajng a;
    private static volatile ahev b;
    private int c;
    private ajnf d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ajng.class, a = new ajng());
    }
    
    private ajng() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ajng.b) == null) {
                    synchronized (ajng.class) {
                        if (ajng.b == null) {
                            ajng.b = (ahev)new ahcs((ahcz)ajng.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajng.a;
            }
            case 4: {
                return new ahcr((ahcz)ajng.a);
            }
            case 3: {
                return new ajng();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajng.a, "\u0001\u0001\u0000\u0001\ue1f7\u3ca1\ue1f7\u3ca1\u0001\u0000\u0000\u0001\ue1f7\u3ca1\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}

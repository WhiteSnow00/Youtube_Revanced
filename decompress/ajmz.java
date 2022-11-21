import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmz extends ahcz implements aheo
{
    public static final ajmz a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ajmz.class, a = new ajmz());
    }
    
    private ajmz() {
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
                if ((d = ajmz.d) == null) {
                    synchronized (ajmz.class) {
                        if (ajmz.d == null) {
                            ajmz.d = (ahev)new ahcs((ahcz)ajmz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajmz.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmz.a);
            }
            case 3: {
                return new ajmz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmz.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "c", "b", ajmy.class, ajmx.class });
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

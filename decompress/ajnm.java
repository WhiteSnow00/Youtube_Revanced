import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnm extends ahcz implements aheo
{
    public static final ajnm a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(ajnm.class, a = new ajnm());
    }
    
    private ajnm() {
        this.c = "";
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
                if ((d = ajnm.d) == null) {
                    synchronized (ajnm.class) {
                        if (ajnm.d == null) {
                            ajnm.d = (ahev)new ahcs((ahcz)ajnm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajnm.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnm.a);
            }
            case 3: {
                return new ajnm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsn extends ahcz implements aheo
{
    private static final apsn a;
    private static volatile ahev b;
    private String c;
    
    static {
        ahcz.registerDefaultInstance(apsn.class, a = new apsn());
    }
    
    private apsn() {
        this.c = "";
    }
    
    public static apsn a() {
        return apsn.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apsn.b) == null) {
                    synchronized (apsn.class) {
                        if (apsn.b == null) {
                            apsn.b = (ahev)new ahcs((ahcz)apsn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apsn.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new apsn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsn.a, "\u0001\u0000", null);
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

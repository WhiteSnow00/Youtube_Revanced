import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnm extends ahcz implements aheo
{
    private static final ahnm a;
    private static volatile ahev b;
    private String c;
    private String d;
    
    static {
        ahcz.registerDefaultInstance(ahnm.class, a = new ahnm());
    }
    
    private ahnm() {
        this.c = "";
        this.d = "";
    }
    
    public static ahnm a() {
        return ahnm.a;
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
                if ((b = ahnm.b) == null) {
                    synchronized (ahnm.class) {
                        if (ahnm.b == null) {
                            ahnm.b = (ahev)new ahcs((ahcz)ahnm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnm.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new ahnm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahnm.a, "\u0001\u0000", null);
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

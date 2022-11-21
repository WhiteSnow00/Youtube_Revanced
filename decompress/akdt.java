import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdt extends ahcz implements aheo
{
    public static final akdt a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(akdt.class, a = new akdt());
    }
    
    private akdt() {
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
                if ((d = akdt.d) == null) {
                    synchronized (akdt.class) {
                        if (akdt.d == null) {
                            akdt.d = (ahev)new ahcs((ahcz)akdt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akdt.a;
            }
            case 4: {
                return new ahcr((ahcz)akdt.a);
            }
            case 3: {
                return new akdt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdt.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

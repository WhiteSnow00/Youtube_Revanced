import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcm extends ahcz implements aheo
{
    public static final akcm a;
    private static volatile ahev d;
    public String b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(akcm.class, a = new akcm());
    }
    
    private akcm() {
        this.b = "";
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
                if ((d = akcm.d) == null) {
                    synchronized (akcm.class) {
                        if (akcm.d == null) {
                            akcm.d = (ahev)new ahcs((ahcz)akcm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akcm.a;
            }
            case 4: {
                return new ahcr((ahcz)akcm.a);
            }
            case 3: {
                return new akcm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", akco.a() });
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

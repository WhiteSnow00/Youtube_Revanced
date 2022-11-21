import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpk extends ahcz implements aheo
{
    public static final alpk a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(alpk.class, a = new alpk());
    }
    
    private alpk() {
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
                if ((d = alpk.d) == null) {
                    synchronized (alpk.class) {
                        if (alpk.d == null) {
                            alpk.d = (ahev)new ahcs((ahcz)alpk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alpk.a;
            }
            case 4: {
                return new ahcr((ahcz)alpk.a);
            }
            case 3: {
                return new alpk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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

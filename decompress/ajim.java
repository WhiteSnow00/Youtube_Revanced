import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajim extends ahcz implements aheo
{
    public static final ajim a;
    public static final ahcx b;
    private static volatile ahev d;
    public String c;
    private int e;
    
    static {
        final ajim a2 = new ajim();
        ahcz.registerDefaultInstance(ajim.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 188662615, ahgc.k, ajim.class);
    }
    
    private ajim() {
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
                if ((d = ajim.d) == null) {
                    synchronized (ajim.class) {
                        if (ajim.d == null) {
                            ajim.d = (ahev)new ahcs((ahcz)ajim.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajim.a;
            }
            case 4: {
                return new ahcr((ahcz)ajim.a);
            }
            case 3: {
                return new ajim();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajim.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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

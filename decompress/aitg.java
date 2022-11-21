import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitg extends ahcz implements aheo
{
    public static final aitg a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public String e;
    public long f;
    
    static {
        final aitg a2 = new aitg();
        ahcz.registerDefaultInstance(aitg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 220, ahgc.k, aitg.class);
    }
    
    private aitg() {
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aitg.g) == null) {
                    synchronized (aitg.class) {
                        if (aitg.g == null) {
                            aitg.g = (ahev)new ahcs((ahcz)aitg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aitg.a;
            }
            case 4: {
                return new ahcr((ahcz)aitg.a);
            }
            case 3: {
                return new aitg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "c", "d", "e", "f" });
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

import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajko extends ahcz implements aheo
{
    public static final ajko a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public String d;
    public ahbt e;
    
    static {
        final ajko a2 = new ajko();
        ahcz.registerDefaultInstance(ajko.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 299, ahgc.k, ajko.class);
    }
    
    private ajko() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ajko.f) == null) {
                    synchronized (ajko.class) {
                        if (ajko.f == null) {
                            ajko.f = (ahev)new ahcs((ahcz)ajko.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajko.a;
            }
            case 4: {
                return new ahcr((ahcz)ajko.a);
            }
            case 3: {
                return new ajko();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajko.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100a\u0002", new Object[] { "c", "d", "e" });
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
